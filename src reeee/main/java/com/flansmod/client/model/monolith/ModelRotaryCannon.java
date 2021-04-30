//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M648RotaryCannon
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

public class ModelRotaryCannon extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelRotaryCannon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[74];
		gunModel[0] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 13, 23, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 20, 23, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 26, 40, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 27, 53, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 3, 40, textureX, textureY); // Box 10
		gunModel[6] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 39, 62, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 38, 83, textureX, textureY); // Box 13
		gunModel[9] = new ModelRendererTurbo(this, 3, 40, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 39, 76, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 39, 69, textureX, textureY); // Box 17
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
		gunModel[25] = new ModelRendererTurbo(this, 6, 106, textureX, textureY); // Box 0
		gunModel[26] = new ModelRendererTurbo(this, 7, 92, textureX, textureY); // Box 1
		gunModel[27] = new ModelRendererTurbo(this, 6, 121, textureX, textureY); // Box 4
		gunModel[28] = new ModelRendererTurbo(this, 26, 69, textureX, textureY); // Box 5
		gunModel[29] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 6
		gunModel[30] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 7
		gunModel[31] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 0
		gunModel[32] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 1
		gunModel[33] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 2
		gunModel[34] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 3
		gunModel[35] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 4
		gunModel[36] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 5
		gunModel[37] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 6
		gunModel[38] = new ModelRendererTurbo(this, 26, 69, textureX, textureY); // Box 7
		gunModel[39] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 8
		gunModel[40] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 9
		gunModel[41] = new ModelRendererTurbo(this, 26, 69, textureX, textureY); // Box 10
		gunModel[42] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 11
		gunModel[43] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 12
		gunModel[44] = new ModelRendererTurbo(this, 26, 69, textureX, textureY); // Box 13
		gunModel[45] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 14
		gunModel[46] = new ModelRendererTurbo(this, 112, 33, textureX, textureY); // Box 3
		gunModel[47] = new ModelRendererTurbo(this, 112, 45, textureX, textureY); // Box 4
		gunModel[48] = new ModelRendererTurbo(this, 112, 45, textureX, textureY); // Box 5
		gunModel[49] = new ModelRendererTurbo(this, 131, 45, textureX, textureY); // Box 6
		gunModel[50] = new ModelRendererTurbo(this, 131, 33, textureX, textureY); // Box 7
		gunModel[51] = new ModelRendererTurbo(this, 131, 45, textureX, textureY); // Box 8
		gunModel[52] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Box 9
		gunModel[53] = new ModelRendererTurbo(this, 112, 58, textureX, textureY); // Box 10
		gunModel[54] = new ModelRendererTurbo(this, 112, 69, textureX, textureY); // Box 11
		gunModel[55] = new ModelRendererTurbo(this, 112, 69, textureX, textureY); // Box 12
		gunModel[56] = new ModelRendererTurbo(this, 58, 105, textureX, textureY); // Box 13
		gunModel[57] = new ModelRendererTurbo(this, 59, 115, textureX, textureY); // Box 14
		gunModel[58] = new ModelRendererTurbo(this, 59, 115, textureX, textureY); // Box 15
		gunModel[59] = new ModelRendererTurbo(this, 54, 94, textureX, textureY); // Box 16
		gunModel[60] = new ModelRendererTurbo(this, 65, 94, textureX, textureY); // Box 17
		gunModel[61] = new ModelRendererTurbo(this, 55, 88, textureX, textureY); // Box 18
		gunModel[62] = new ModelRendererTurbo(this, 54, 94, textureX, textureY); // Box 19
		gunModel[63] = new ModelRendererTurbo(this, 65, 94, textureX, textureY); // Box 20
		gunModel[64] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 21
		gunModel[65] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 22
		gunModel[66] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 23
		gunModel[67] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 24
		gunModel[68] = new ModelRendererTurbo(this, 26, 85, textureX, textureY); // Box 25
		gunModel[69] = new ModelRendererTurbo(this, 37, 93, textureX, textureY); // Box 26
		gunModel[70] = new ModelRendererTurbo(this, 64, 65, textureX, textureY); // Box 27
		gunModel[71] = new ModelRendererTurbo(this, 53, 65, textureX, textureY); // Box 28
		gunModel[72] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 29
		gunModel[73] = new ModelRendererTurbo(this, 103, 65, textureX, textureY); // Box 34

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

		gunModel[25].addShapeBox(2.5F, -4F, 1.5F, 9, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 0
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(2.5F, -4F, -1.5F, 9, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(2.5F, -4F, -4.5F, 9, 9, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(11.5F, -3.5F, -1.5F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(11.5F, -3.5F, 1.5F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F); // Box 6
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(11.5F, -3.5F, -4.5F, 1, 8, 3, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(-0.5F, -3.2F, -0.5F, 30, 1, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 0
		gunModel[31].setRotationPoint(12.5F, 0.5F, 0F);

		gunModel[32].addShapeBox(-0.5F, -3.2F, -0.5F, 30, 1, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 1
		gunModel[32].setRotationPoint(12.5F, 0.5F, 0F);
		gunModel[32].rotateAngleX = -3.14159265F;

		gunModel[33].addShapeBox(-0.5F, -3.2F, -0.5F, 30, 1, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 2
		gunModel[33].setRotationPoint(12.5F, 0.5F, 0F);
		gunModel[33].rotateAngleX = -2.12930169F;

		gunModel[34].addShapeBox(-0.5F, -3.2F, -0.5F, 30, 1, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 3
		gunModel[34].setRotationPoint(12.5F, 0.5F, 0F);
		gunModel[34].rotateAngleX = 1.01229097F;

		gunModel[35].addShapeBox(-0.5F, -3.2F, -0.5F, 30, 1, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 4
		gunModel[35].setRotationPoint(12.5F, 0.5F, 0F);
		gunModel[35].rotateAngleX = -1.08210414F;

		gunModel[36].addShapeBox(-0.5F, -3.2F, -0.5F, 30, 1, 1, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 5
		gunModel[36].setRotationPoint(12.5F, 0.5F, 0F);
		gunModel[36].rotateAngleX = 2.05948852F;

		gunModel[37].addShapeBox(37.5F, -3.5F, 1.5F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F); // Box 6
		gunModel[37].setRotationPoint(2F, 0F, 0F);

		gunModel[38].addShapeBox(37.5F, -3.5F, -1.5F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[38].setRotationPoint(2F, 0F, 0F);

		gunModel[39].addShapeBox(37.5F, -3.5F, -4.5F, 1, 8, 3, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[39].setRotationPoint(2F, 0F, 0F);

		gunModel[40].addShapeBox(34.5F, -3.5F, 1.5F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F); // Box 9
		gunModel[40].setRotationPoint(2F, 0F, 0F);

		gunModel[41].addShapeBox(34.5F, -3.5F, -1.5F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[41].setRotationPoint(2F, 0F, 0F);

		gunModel[42].addShapeBox(34.5F, -3.5F, -4.5F, 1, 8, 3, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[42].setRotationPoint(2F, 0F, 0F);

		gunModel[43].addShapeBox(29.5F, -3.5F, 1.5F, 2, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F); // Box 12
		gunModel[43].setRotationPoint(2F, 0F, 0F);

		gunModel[44].addShapeBox(29.5F, -3.5F, -1.5F, 2, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[44].setRotationPoint(2F, 0F, 0F);

		gunModel[45].addShapeBox(29.5F, -3.5F, -4.5F, 2, 8, 3, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[45].setRotationPoint(2F, 0F, 0F);

		gunModel[46].addShapeBox(6.5F, 1.5F, -7F, 4, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addShapeBox(6.5F, 1.5F, -4F, 4, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 4
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addShapeBox(6.5F, 1.5F, -9F, 4, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[48].setRotationPoint(0F, 0F, 0F);

		gunModel[49].addShapeBox(-4.5F, 1.5F, -9F, 8, 7, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[49].setRotationPoint(0F, 0F, 0F);

		gunModel[50].addShapeBox(-4.5F, 1.5F, -7F, 8, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(-4.5F, 1.5F, -4F, 8, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 8
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(2.5F, 5F, -1.5F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(3.5F, 2F, -7F, 3, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(3.5F, 2F, -4F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, -.4F, 0F, -1.6F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, -.4F, 0F, -1.6F, -.4F); // Box 11
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(3.5F, 2F, -9F, 3, 6, 2, 0F, 0F, -1.6F, -.4F, 0F, -1.6F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, -.4F, 0F, -1.6F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[55].setRotationPoint(0F, 0F, 0F);

		gunModel[56].addShapeBox(3F, 5F, -1.7F, 7, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[56].setRotationPoint(0F, 0F, 0F);
		gunModel[56].rotateAngleX = 0.78539816F;

		gunModel[57].addShapeBox(3F, 5F, 1.3F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 14
		gunModel[57].setRotationPoint(0F, 0F, 0F);
		gunModel[57].rotateAngleX = 0.78539816F;

		gunModel[58].addShapeBox(3F, 5F, -2.7F, 7, 5, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[58].setRotationPoint(0F, 0F, 0F);
		gunModel[58].rotateAngleX = 0.78539816F;

		gunModel[59].addShapeBox(10F, 5F, -1.7F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[59].setRotationPoint(0F, 0F, 0F);
		gunModel[59].rotateAngleX = 0.78539816F;

		gunModel[60].addShapeBox(10F, 8F, -1.7F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		gunModel[60].setRotationPoint(0F, 0F, 0F);
		gunModel[60].rotateAngleX = 0.78539816F;

		gunModel[61].addShapeBox(2F, 4F, -1.7F, 9, 1, 3, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 18
		gunModel[61].setRotationPoint(0F, 0F, 0F);
		gunModel[61].rotateAngleX = 0.78539816F;

		gunModel[62].addShapeBox(2F, 5F, -1.7F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[62].setRotationPoint(0F, 0F, 0F);
		gunModel[62].rotateAngleX = 0.78539816F;

		gunModel[63].addShapeBox(2F, 8F, -1.7F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 20
		gunModel[63].setRotationPoint(0F, 0F, 0F);
		gunModel[63].rotateAngleX = 0.78539816F;

		gunModel[64].addShapeBox(8.8F, 2.8F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[64].setRotationPoint(0F, 0F, 0F);
		gunModel[64].rotateAngleZ = 0.80285146F;

		gunModel[65].addShapeBox(8.8F, -0.2F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[65].setRotationPoint(0F, 0F, 0F);
		gunModel[65].rotateAngleZ = 0.80285146F;

		gunModel[66].addShapeBox(8.8F, -0.2F, 2F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 23
		gunModel[66].setRotationPoint(0F, 0F, 0F);
		gunModel[66].rotateAngleZ = 0.80285146F;

		gunModel[67].addShapeBox(8.8F, -0.2F, -3F, 1, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[67].setRotationPoint(0F, 0F, 0F);
		gunModel[67].rotateAngleZ = 0.80285146F;

		gunModel[68].addShapeBox(8.5F, -5F, -1.5F, 1, 1, 3, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F); // Box 25
		gunModel[68].setRotationPoint(0F, 0F, 0F);

		gunModel[69].addShapeBox(5.5F, -4.5F, -2.5F, 4, 1, 3, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 26
		gunModel[69].setRotationPoint(0F, 0F, 0F);
		gunModel[69].rotateAngleX = 0.78539816F;

		gunModel[70].addShapeBox(6.5F, -0.5F, 2.5F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[70].setRotationPoint(0F, 0F, 0F);

		gunModel[71].addShapeBox(10F, -0.5F, 2.5F, 1, 2, 3, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Box 28
		gunModel[71].setRotationPoint(0F, 0F, 0F);

		gunModel[72].addShapeBox(-1.5F, -0.5F, 4.5F, 8, 2, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 29
		gunModel[72].setRotationPoint(0F, 0F, 0F);

		gunModel[73].addShapeBox(-2.5F, -4.5F, 4.5F, 1, 6, 1, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Box 34
		gunModel[73].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, -2.2F, 0F);


		flipAll();
	}
}