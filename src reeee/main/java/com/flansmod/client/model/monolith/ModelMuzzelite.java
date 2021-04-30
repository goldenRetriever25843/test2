//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MuzzeliteMZ14
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

public class ModelMuzzelite extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMuzzelite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[109];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 1
		gunModel[24] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 2
		gunModel[25] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 3
		gunModel[26] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 4
		gunModel[27] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 5
		gunModel[28] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 6
		gunModel[29] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 7
		gunModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		gunModel[31] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 9
		gunModel[32] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 10
		gunModel[33] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 11
		gunModel[34] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 13
		gunModel[35] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 14
		gunModel[36] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		gunModel[37] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 16
		gunModel[38] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 17
		gunModel[39] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 18
		gunModel[40] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 19
		gunModel[41] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 21
		gunModel[42] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 23
		gunModel[43] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 24
		gunModel[44] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 25
		gunModel[45] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 26
		gunModel[46] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 27
		gunModel[47] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 28
		gunModel[48] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 29
		gunModel[49] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 30
		gunModel[50] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 31
		gunModel[51] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 32
		gunModel[52] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 33
		gunModel[53] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 34
		gunModel[54] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 35
		gunModel[55] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 36
		gunModel[56] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 37
		gunModel[57] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
		gunModel[58] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 39
		gunModel[59] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 40
		gunModel[60] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 41
		gunModel[61] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 42
		gunModel[62] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 44
		gunModel[63] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 1
		gunModel[64] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 2
		gunModel[65] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 3
		gunModel[66] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 4
		gunModel[67] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 5
		gunModel[68] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		gunModel[69] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 7
		gunModel[70] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 8
		gunModel[71] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 9
		gunModel[72] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 10
		gunModel[73] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 11
		gunModel[74] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 12
		gunModel[75] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 13
		gunModel[76] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 14
		gunModel[77] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 15
		gunModel[78] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 16
		gunModel[79] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 17
		gunModel[80] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 18
		gunModel[81] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 19
		gunModel[82] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 20
		gunModel[83] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 21
		gunModel[84] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 22
		gunModel[85] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 0
		gunModel[86] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 2
		gunModel[87] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 3
		gunModel[88] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 4
		gunModel[89] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 5
		gunModel[90] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 6
		gunModel[91] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 7
		gunModel[92] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 8
		gunModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 9
		gunModel[94] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 10
		gunModel[95] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 11
		gunModel[96] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 12
		gunModel[97] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 13
		gunModel[98] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 14
		gunModel[99] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 15
		gunModel[100] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 21
		gunModel[101] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 22
		gunModel[102] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 23
		gunModel[103] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 25
		gunModel[104] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 26
		gunModel[105] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 27
		gunModel[106] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 28
		gunModel[107] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 29
		gunModel[108] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 30

		gunModel[0].addShapeBox(-4.3F, -3F, -1F, 9, 1, 2, 0F, 0F, -.4F, -.1F, -.4F, -.4F, -.1F, -.4F, -.4F, -.1F, 0F, -.4F, -.1F, 0F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, 0F, 0F, -.1F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(-2F, -2F, -0.5F, 1, 1, 1, 0F, -.8F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-1F, -1F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-2F, -1F, -0.5F, 1, 3, 1, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F); // Box 4
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(-2F, 2F, -0.5F, 1, 1, 1, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, .5F, -1.7F, 0F, .1F, -.6F, 0F, .1F, -.6F, 0F, .5F, -1.7F, 0F); // Box 6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(-2F, -2F, -0.5F, 1, 1, 1, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.8F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.8F, -.5F, 0F); // Box 7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(0.7F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(1F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, -.7F, -.6F, 0F, -.7F, -.6F, 0F, 0F, -.7F, 0F); // Box 9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(0.7F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, 0F, -1F, 0F); // Box 10
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(1.3F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.6F, 0F, .2F, -.6F, 0F, .2F, -.6F, 0F, 0F, -.6F, 0F); // Box 11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(1.8F, -1F, -0.5F, 1, 1, 1, 0F, -.7F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, -.2F, 0F, -.7F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, -.7F, -.6F, 0F); // Box 12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(2.8F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(2.8F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, -.3F, -.6F, 0F, -.3F, -.6F, 0F, 0F, -.6F, 0F); // Box 15
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-1F, -2F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F); // Box 16
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(0F, -2F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.4F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, -.3F, 0F, 0F, -.4F, 0F, -.8F, 0F, 0F, -.8F); // Box 17
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-1F, -1F, 0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, -2F, 0F, -.1F, -2F, -.8F, 0F, 0F, -.8F); // Box 18
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(-2F, -1F, 0.5F, 1, 3, 1, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, -1F, 0F, -.8F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, .3F, -1F, -.8F); // Box 19
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(0F, -1F, 0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.4F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, -.3F, -1F, 0F, -.4F, -1F, -.8F, .1F, 0F, -.8F); // Box 20
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-2F, -2F, 0.5F, 1, 1, 1, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, -.5F, 0F, -.8F, -.8F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.8F, -1F, -.5F, -.8F); // Box 21
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-2F, -2F, 0.5F, 1, 1, 1, 0F, -.8F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.8F, -1F, -.5F, -.8F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, -1F, 0F, -.8F); // Box 22
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(-2F, 2F, 0.5F, 1, 1, 1, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, .3F, 1F, -.8F, .5F, -1.7F, 0F, .1F, -.6F, 0F, 0F, -.7F, -.8F, .3F, -1.7F, -.8F); // Box 23
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(-2F, 2F, -1.5F, 1, 1, 1, 0F, .3F, 1F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, .5F, 1F, 0F, .3F, -1.7F, -.8F, 0F, -.7F, -.8F, .1F, -.6F, 0F, .5F, -1.7F, 0F); // Box 0
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addShapeBox(-2F, -1F, -1.5F, 1, 3, 1, 0F, -1F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, -.8F, 0F, 0F, .3F, -1F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, .5F, -1F, 0F); // Box 1
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(-1F, -1F, -1.5F, 1, 3, 1, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, -.1F, -2F, -.8F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(0F, -1F, -1.5F, 1, 1, 1, 0F, 0F, 0F, -.8F, -.4F, 0F, -.8F, -.3F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, -.8F, -.4F, -1F, -.8F, -.3F, -1F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(0F, -2F, -1.5F, 1, 1, 1, 0F, 0F, 0F, -.8F, -.4F, 0F, -.8F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, -.4F, 0F, -.8F, -.3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(-1F, -2F, -1.5F, 1, 1, 1, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(-2F, -2F, -1.5F, 1, 1, 1, 0F, -.5F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, -.3F, 0F, 0F, -1F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, -.5F, 0F, -.8F, -.5F, 0F); // Box 6
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(-2F, -2F, -1.5F, 1, 1, 1, 0F, -1F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, -.5F, 0F, -.8F, -.5F, 0F, -1F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, -.8F, 0F, 0F); // Box 7
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(-4.3F, -4F, -1F, 9, 1, 2, 0F, 0F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, 0F, 0F, -.2F, 0F, .4F, -.2F, -.4F, .4F, -.2F, -.4F, .4F, -.2F, 0F, .4F, -.2F); // Box 8
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(-4.3F, -5F, -1F, 9, 1, 2, 0F, 0F, -.5F, -.2F, -.4F, -.5F, -.2F, -.4F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, 0F, 0F, -.2F); // Box 9
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(-4.3F, -4F, -1.3F, 6, 1, 1, 0F, 0F, -.5F, -.15F, -.4F, -.5F, -.15F, -.4F, -.5F, -.15F, 0F, -.5F, -.15F, 0F, .4F, -.15F, -.4F, .4F, -.15F, -.4F, .4F, -.15F, 0F, .4F, -.15F); // Box 10
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(-4.3F, -4F, -1.3F, 6, 1, 1, 0F, -.5F, 0F, -.15F, -.4F, 0F, -.15F, -.4F, 0F, -.15F, -.5F, 0F, -.15F, 0F, -.5F, -.15F, -.4F, -.5F, -.15F, -.4F, -.5F, -.15F, 0F, -.5F, -.15F); // Box 11
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(-8.3F, -2F, -1F, 3, 1, 2, 0F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, -.8F, -.15F, 0F, -.8F, -.15F, 0F, -.8F, -.15F, 0F, -.8F, -.15F); // Box 13
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(-11.3F, -3F, -1F, 7, 1, 2, 0F, .5F, -.6F, -.1F, 0F, -.6F, -.1F, 0F, -.6F, -.1F, .5F, -.6F, -.1F, .5F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, .5F, 0F, -.1F); // Box 14
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(-4.3F, -2F, -1F, 8, 1, 2, 0F, 0F, 0F, -.15F, .6F, 0F, -.15F, .6F, 0F, -.15F, 0F, 0F, -.15F, 0F, -.95F, -.15F, .6F, -.95F, -.15F, .6F, -.95F, -.15F, 0F, -.95F, -.15F); // Box 15
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(-5.3F, -2F, -1F, 1, 1, 2, 0F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, -.8F, -.15F, 0F, -.95F, -.15F, 0F, -.95F, -.15F, 0F, -.8F, -.15F); // Box 16
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addShapeBox(-9.3F, -2F, -1F, 1, 1, 2, 0F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, -.5F, -.15F, 0F, -.5F, -.15F, 0F, -.5F, -.15F, 0F, -.5F, -.15F); // Box 17
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addShapeBox(-11.8F, -2F, -1F, 2, 1, 2, 0F, 0F, 0F, -.15F, .5F, 0F, -.15F, .5F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.15F, .5F, 0F, -.15F, .5F, 0F, -.15F, 0F, 0F, -.15F); // Box 18
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addShapeBox(-11.8F, -1F, -1F, 2, 1, 2, 0F, 0F, 0F, -.15F, .5F, 0F, -.15F, .5F, 0F, -.15F, 0F, 0F, -.15F, 0F, .5F, -.15F, .5F, -.3F, -.15F, .5F, -.3F, -.15F, 0F, .5F, -.15F); // Box 19
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addShapeBox(-3.3F, -5F, -1F, 8, 1, 2, 0F, 0F, 0F, -.2F, -.7F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, -.4F, -.5F, -.2F, -.4F, -.5F, -.2F, 0F, -.5F, -.2F); // Box 21
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(3F, -7F, -1F, 1, 2, 1, 0F, .5F, .4F, -.2F, -1.3F, .4F, -.2F, -1.3F, .4F, -.6F, .5F, .4F, -.6F, -.8F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.6F, -.8F, 0F, -.6F); // Box 23
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addShapeBox(-1F, -7.4F, -1F, 4, 1, 1, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.6F, 0F, 0F, -.6F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F); // Box 24
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(-2F, -7.4F, -1F, 1, 1, 1, 0F, -.2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.6F, -.2F, 0F, -.6F, .3F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.6F, .3F, -.2F, -.6F); // Box 25
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(-2F, -6.4F, -1F, 1, 1, 2, 0F, .3F, .2F, -.2F, -.2F, .2F, -.2F, -.2F, .2F, -.2F, .3F, .2F, -.2F, 1F, 0F, -.2F, -.9F, 0F, -.2F, -.9F, 0F, -.2F, 1F, 0F, -.2F); // Box 26
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addShapeBox(-2F, -6.6F, -1F, 1, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, -.4F, -.7F, -.2F, -.4F, -.7F, -.2F, 0F, -.7F, -.2F); // Box 27
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addShapeBox(-3F, -5.4F, -1F, 1, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 28
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addShapeBox(-2F, -5.78F, -1F, 1, 1, 2, 0F, 0F, 0F, -.2F, -.7F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, -.2F); // Box 29
		gunModel[48].setRotationPoint(0F, 0F, 0F);

		gunModel[49].addShapeBox(-5F, -5.4F, -1F, 2, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 30
		gunModel[49].setRotationPoint(0F, 0F, 0F);

		gunModel[50].addShapeBox(-8F, -5.4F, -1F, 3, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, 0F, 0F, -.7F, 0F); // Box 31
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(-9F, -5.4F, -1F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(-10F, -5.4F, -1F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 33
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(-11F, -5.4F, -1F, 1, 3, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(-10F, -3.4F, -1F, 6, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(-11F, -5.4F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 36
		gunModel[55].setRotationPoint(0F, 0F, 0F);

		gunModel[56].addShapeBox(-12F, -5.4F, -1F, 1, 3, 2, 0F, -.2F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, -.7F, -.2F, -.2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -.2F); // Box 37
		gunModel[56].setRotationPoint(0F, 0F, 0F);

		gunModel[57].addShapeBox(2.45F, -6.9F, -1F, 1, 1, 2, 0F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F); // Box 38
		gunModel[57].setRotationPoint(0F, 0F, 0F);

		gunModel[58].addShapeBox(2.45F, -6.7F, -1F, 1, 1, 2, 0F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F); // Box 39
		gunModel[58].setRotationPoint(0F, 0F, 0F);

		gunModel[59].addShapeBox(2.45F, -6.5F, -1F, 1, 1, 2, 0F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F); // Box 40
		gunModel[59].setRotationPoint(0F, 0F, 0F);

		gunModel[60].addShapeBox(-4.7F, -2.2F, -1F, 1, 1, 2, 0F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F, -.4F, -.4F, -.2F); // Box 41
		gunModel[60].setRotationPoint(0F, 0F, 0F);

		gunModel[61].addShapeBox(-4.7F, -2.4F, -1F, 1, 1, 2, 0F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F); // Box 42
		gunModel[61].setRotationPoint(0F, 0F, 0F);

		gunModel[62].addShapeBox(-12.8F, -3.4F, -1F, 1, 3, 2, 0F, .4F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, .4F, 0F, -.4F, .4F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, .4F, 0F, -.4F); // Box 44
		gunModel[62].setRotationPoint(0F, 0F, 0F);

		gunModel[63].addShapeBox(-11F, -4.4F, 0.8F, 7, 1, 1, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.9F, 0F, .3F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F); // Box 1
		gunModel[63].setRotationPoint(0F, 0F, 0F);

		gunModel[64].addShapeBox(-11F, -5.4F, 0.8F, 7, 1, 1, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, -.5F, 0F, -.9F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.9F, 0F, -.3F, -.9F); // Box 2
		gunModel[64].setRotationPoint(0F, 0F, 0F);

		gunModel[65].addShapeBox(3.2F, -5.5F, -1F, 1, 1, 2, 0F, -.35F, 0F, -.2F, -.65F, 0F, -.2F, -.65F, 0F, -.2F, -.35F, 0F, -.2F, 0F, -.5F, -.2F, -.4F, -.5F, -.2F, -.4F, -.5F, -.2F, 0F, -.5F, -.2F); // Box 3
		gunModel[65].setRotationPoint(0F, 0F, 0F);

		gunModel[66].addShapeBox(4.3F, -4F, -1F, 1, 1, 2, 0F, 0F, 0F, -.3F, .3F, 0F, -.3F, .3F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.2F, .35F, -.5F, -.2F, .35F, -.5F, -.2F, 0F, -.5F, -.2F); // Box 4
		gunModel[66].setRotationPoint(0F, 0F, 0F);

		gunModel[67].addShapeBox(4.3F, -5F, -1F, 1, 1, 2, 0F, 0F, -.5F, -.65F, .2F, -.5F, -.65F, .2F, -.5F, -.65F, 0F, -.5F, -.65F, 0F, 0F, -.3F, .3F, 0F, -.3F, .3F, 0F, -.3F, 0F, 0F, -.3F); // Box 5
		gunModel[67].setRotationPoint(0F, 0F, 0F);

		gunModel[68].addShapeBox(4.3F, -3F, -1F, 5, 1, 2, 0F, 0F, .5F, -.2F, .4F, .5F, -.2F, .4F, .5F, -.2F, 0F, .5F, -.2F, 0F, -.2F, 0F, .4F, -.2F, 0F, .4F, -.2F, 0F, 0F, -.2F, 0F); // Box 6
		gunModel[68].setRotationPoint(0F, 0F, 0F);

		gunModel[69].addShapeBox(4.3F, -2.95F, -1F, 5, 1, 2, 0F, 0F, -.75F, 0F, .4F, -.75F, 0F, .4F, -.75F, 0F, 0F, -.75F, 0F, 0F, 0F, -.1F, .4F, 0F, -.1F, .4F, 0F, -.1F, 0F, 0F, -.1F); // Box 7
		gunModel[69].setRotationPoint(0F, 0F, 0F);

		gunModel[70].addShapeBox(0.5F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, 0F, -.2F, -.3F); // Box 8
		gunModel[70].setRotationPoint(0F, 0F, 0F);

		gunModel[71].addShapeBox(8.7F, -2.7F, -1F, 1, 1, 2, 0F, -.8F, -.75F, -.1F, 0F, -.75F, -.1F, 0F, -.75F, -.1F, -.8F, -.75F, -.1F, -1F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, -1F, -.1F, -.3F); // Box 9
		gunModel[71].setRotationPoint(0F, 0F, 0F);

		gunModel[72].addShapeBox(5.3F, -5F, -1F, 4, 1, 2, 0F, 0F, -.6F, -.67F, .4F, -.6F, -.67F, .4F, -.6F, -.67F, 0F, -.6F, -.67F, 0F, 0F, -.4F, .4F, 0F, -.4F, .4F, 0F, -.4F, 0F, 0F, -.4F); // Box 10
		gunModel[72].setRotationPoint(0F, 0F, 0F);

		gunModel[73].addShapeBox(5.3F, -4F, -1F, 4, 1, 2, 0F, 0F, 0F, -.4F, .4F, 0F, -.4F, .4F, 0F, -.4F, 0F, 0F, -.4F, 0F, -.5F, -.3F, .4F, -.5F, -.3F, .4F, -.5F, -.3F, 0F, -.5F, -.3F); // Box 11
		gunModel[73].setRotationPoint(0F, 0F, 0F);

		gunModel[74].addShapeBox(-1F, -7.4F, 0F, 4, 1, 1, 0F, 0F, 0F, -.6F, -.5F, 0F, -.6F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 12
		gunModel[74].setRotationPoint(0F, 0F, 0F);

		gunModel[75].addShapeBox(-2F, -7.4F, 0F, 1, 1, 1, 0F, -.2F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.2F, -.2F, 0F, -.2F, .3F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.2F, .3F, -.2F, -.2F); // Box 13
		gunModel[75].setRotationPoint(0F, 0F, 0F);

		gunModel[76].addShapeBox(3F, -7F, 0F, 1, 2, 1, 0F, .5F, .4F, -.6F, -1.3F, .4F, -.6F, -1.3F, .4F, -.2F, .5F, .4F, -.2F, -.8F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.2F, -.8F, 0F, -.2F); // Box 14
		gunModel[76].setRotationPoint(0F, 0F, 0F);

		gunModel[77].addShapeBox(3F, -6F, -1F, 1, 1, 2, 0F, .07F, .6F, -.2F, -.865F, .6F, -.2F, -.865F, .6F, -.2F, .07F, .6F, -.2F, -.8F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.8F, 0F, -.2F); // Box 15
		gunModel[77].setRotationPoint(0F, 0F, 0F);

		gunModel[78].addShapeBox(-2F, -6.6F, -1F, 5, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.95F, -.2F, 0F, -.95F, -.2F, 0F, -.95F, -.2F, 0F, -.95F, -.2F); // Box 16
		gunModel[78].setRotationPoint(0F, 0F, 0F);

		gunModel[79].addShapeBox(9.3F, -4.4F, -0.5F, 4, 1, 1, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.2F, -.35F, 0F, -.2F, -.35F, 0F, -.2F, -.35F, 0F, -.2F, -.35F); // Box 17
		gunModel[79].setRotationPoint(0F, 0F, 0F);

		gunModel[80].addShapeBox(9.3F, -4.4F, -0.5F, 4, 1, 1, 0F, 0F, -.2F, -.35F, 0F, -.2F, -.35F, 0F, -.2F, -.35F, 0F, -.2F, -.35F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F); // Box 18
		gunModel[80].setRotationPoint(0F, 0F, 0F);

		gunModel[81].addShapeBox(11.4F, -4.4F, -0.5F, 1, 1, 1, 0F, .1F, -.15F, -.32F, .1F, -.15F, -.32F, .1F, -.15F, -.32F, .1F, -.15F, -.32F, .1F, -.5F, -.15F, .1F, -.5F, -.15F, .1F, -.5F, -.15F, .1F, -.5F, -.15F); // Box 19
		gunModel[81].setRotationPoint(0F, 0F, 0F);

		gunModel[82].addShapeBox(11.4F, -4.4F, -0.5F, 1, 1, 1, 0F, .1F, -.5F, -.15F, .1F, -.5F, -.15F, .1F, -.5F, -.15F, .1F, -.5F, -.15F, .1F, -.15F, -.32F, .1F, -.15F, -.32F, .1F, -.15F, -.32F, .1F, -.15F, -.32F); // Box 20
		gunModel[82].setRotationPoint(0F, 0F, 0F);

		gunModel[83].addShapeBox(11.4F, -4.8F, -0.5F, 1, 1, 1, 0F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F); // Box 21
		gunModel[83].setRotationPoint(0F, 0F, 0F);

		gunModel[84].addShapeBox(11.4F, -4.9F, -0.5F, 1, 1, 1, 0F, .1F, -.45F, -.35F, .1F, -.15F, -.35F, .1F, -.15F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F, .1F, -.45F, -.35F); // Box 22
		gunModel[84].setRotationPoint(0F, 0F, 0F);

		gunModel[85].addShapeBox(9.1F, -6.4F, -1F, 1, 2, 2, 0F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F); // Box 0
		gunModel[85].setRotationPoint(0F, 0F, 0F);

		gunModel[86].addShapeBox(8.3F, -5.4F, -1F, 1, 1, 2, 0F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, .1F, 0F, -.7F, -.9F, 0F, -.7F, -.9F, 0F, -.7F, .1F, 0F, -.7F); // Box 2
		gunModel[86].setRotationPoint(0F, 0F, 0F);

		gunModel[87].addShapeBox(8.7F, -5.4F, -1F, 1, 1, 2, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, -.8F, -.7F, 0F, -.8F, -.7F, 0F, -.8F, -.7F, 0F, -.8F, -.7F); // Box 3
		gunModel[87].setRotationPoint(0F, 0F, 0F);

		gunModel[88].addShapeBox(8F, -5.4F, -1F, 1, 1, 2, 0F, -.5F, -.8F, -.7F, -.5F, -.8F, -.7F, -.5F, -.8F, -.7F, -.5F, -.8F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F); // Box 4
		gunModel[88].setRotationPoint(0F, 0F, 0F);

		gunModel[89].addShapeBox(8.3F, -6.4F, -1F, 1, 1, 2, 0F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F); // Box 5
		gunModel[89].setRotationPoint(0F, 0F, 0F);

		gunModel[90].addShapeBox(8.7F, -6.4F, -1F, 1, 1, 2, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, -.8F, -.7F, 0F, -.8F, -.7F, 0F, -.8F, -.7F, 0F, -.8F, -.7F); // Box 6
		gunModel[90].setRotationPoint(0F, 0F, 0F);

		gunModel[91].addShapeBox(8.7F, -6.4F, -1F, 1, 2, 2, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, -.8F, -.9F, 0F, -.8F, -.9F, 0F, -.8F, -.9F, 0F, -.8F, -.9F); // Box 7
		gunModel[91].setRotationPoint(0F, 0F, 0F);

		gunModel[92].addShapeBox(8.7F, -7.4F, -0.5F, 1, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.9F, 0F, -.5F, -.9F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.7F); // Box 8
		gunModel[92].setRotationPoint(0F, 0F, 0F);

		gunModel[93].addShapeBox(8.7F, -7.4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.9F, 0F, -.5F, -.9F); // Box 9
		gunModel[93].setRotationPoint(0F, 0F, 0F);

		gunModel[94].addShapeBox(8.7F, -7.4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.9F, -.2F, 0F, -.9F, -.2F, 0F, -.9F, -.2F, 0F, -.9F, -.2F); // Box 10
		gunModel[94].setRotationPoint(0F, 0F, 0F);

		gunModel[95].addShapeBox(8.7F, -7.4F, -0.5F, 1, 1, 1, 0F, 0F, -.9F, -.2F, 0F, -.9F, -.2F, 0F, -.9F, -.2F, 0F, -.9F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 11
		gunModel[95].setRotationPoint(0F, 0F, 0F);

		gunModel[96].addShapeBox(8.7F, -7.4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.9F, 0F, -.5F, -.9F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 12
		gunModel[96].setRotationPoint(0F, 0F, 0F);

		gunModel[97].addShapeBox(8.7F, -7.4F, -0.5F, 1, 1, 1, 0F, 0F, -.5F, -.9F, 0F, -.5F, -.9F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 13
		gunModel[97].setRotationPoint(0F, 0F, 0F);

		gunModel[98].addShapeBox(-12.8F, -4.4F, -1F, 1, 1, 2, 0F, .5F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, .5F, -.2F, -.6F, .4F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, .4F, 0F, -.4F); // Box 14
		gunModel[98].setRotationPoint(0F, 0F, 0F);

		gunModel[99].addShapeBox(-12.8F, -0.4F, -1F, 1, 1, 2, 0F, .4F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, .4F, 0F, -.4F, .5F, .2F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, .5F, .2F, -.6F); // Box 15
		gunModel[99].setRotationPoint(0F, 0F, 0F);

		gunModel[100].addShapeBox(-10F, -3.8F, -0.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[100].setRotationPoint(0F, 0F, 0F);

		gunModel[101].addShapeBox(-10F, -4.8F, -0.5F, 1, 1, 1, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[101].setRotationPoint(0F, 0F, 0F);

		gunModel[102].addShapeBox(-9F, -4.8F, -0.5F, 1, 1, 1, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Box 23
		gunModel[102].setRotationPoint(0F, 0F, 0F);

		gunModel[103].addShapeBox(-5F, -4.8F, -0.5F, 1, 1, 1, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[103].setRotationPoint(0F, 0F, 0F);

		gunModel[104].addShapeBox(-10F, -4.8F, -0.5F, 6, 2, 1, 0F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, -.7F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F); // Box 26
		gunModel[104].setRotationPoint(0F, 0F, 0F);

		gunModel[105].addShapeBox(-5.1F, -4.8F, -1.5F, 1, 1, 1, 0F, 0F, -.4F, -.6F, -.2F, -.4F, -.6F, -.2F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, -.6F, -.2F, 0F, -.6F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[105].setRotationPoint(0F, 0F, 0F);

		gunModel[106].addShapeBox(-6.1F, -4.8F, -1.5F, 1, 1, 1, 0F, -.8F, -.5F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, 0F, -.8F, -.5F, 0F, -.8F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, -.8F, 0F, 0F); // Box 28
		gunModel[106].setRotationPoint(0F, 0F, 0F);

		gunModel[107].addShapeBox(-6.3F, -4.8F, -1.5F, 1, 1, 1, 0F, -.3F, -.7F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, 0F, -.3F, -.7F, 0F, -.3F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, -.3F, 0F, 0F); // Box 29
		gunModel[107].setRotationPoint(0F, 0F, 0F);

		gunModel[108].addShapeBox(-6.3F, -4.8F, -2.5F, 1, 1, 2, 0F, -.3F, -.7F, -1.3F, -.6F, -.7F, -1.3F, -.6F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, -1.3F, -.6F, 0F, -1.3F, -.6F, 0F, 0F, -.3F, 0F, 0F); // Box 30
		gunModel[108].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 16
		ammoModel[1] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 17
		ammoModel[2] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 18
		ammoModel[3] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 19
		ammoModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 20

		ammoModel[0].addShapeBox(-8F, -1.8F, -1F, 3, 1, 2, 0F, -.6F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.6F, 0F, -.4F); // Box 16
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addShapeBox(-8F, -0.8F, -1F, 3, 1, 2, 0F, -.6F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.6F, 0F, -.4F, -.7F, 0F, -.4F, .1F, 0F, -.4F, .1F, 0F, -.4F, -.7F, 0F, -.4F); // Box 17
		ammoModel[1].setRotationPoint(0F, 0F, 0F);

		ammoModel[2].addShapeBox(-8F, 0.2F, -1F, 3, 1, 2, 0F, -.7F, 0F, -.4F, .1F, 0F, -.4F, .1F, 0F, -.4F, -.7F, 0F, -.4F, -.9F, 0F, -.4F, .3F, 0F, -.4F, .3F, 0F, -.4F, -.9F, 0F, -.4F); // Box 18
		ammoModel[2].setRotationPoint(0F, 0F, 0F);

		ammoModel[3].addShapeBox(-8F, 1.2F, -1F, 3, 1, 2, 0F, -.9F, 0F, -.4F, .3F, 0F, -.4F, .3F, 0F, -.4F, -.9F, 0F, -.4F, -1.2F, 0F, -.4F, .6F, 0F, -.4F, .6F, 0F, -.4F, -1.2F, 0F, -.4F); // Box 19
		ammoModel[3].setRotationPoint(0F, 0F, 0F);

		ammoModel[4].addShapeBox(-8F, 2.2F, -1F, 3, 1, 2, 0F, -1.2F, 0F, -.4F, .6F, 0F, -.4F, .6F, 0F, -.4F, -1.2F, 0F, -.4F, -1.6F, .2F, -.4F, .8F, -.5F, -.4F, .8F, -.5F, -.4F, -1.6F, .2F, -.4F); // Box 20
		ammoModel[4].setRotationPoint(0F, 0F, 0F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 24

		slideModel[0].addShapeBox(-7F, -4F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.2F, 0F, -.5F, -.2F); // Box 24
		slideModel[0].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}