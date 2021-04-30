//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCerberus extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelCerberus() //Same as Filename
	{
		headModel = new ModelRendererTurbo[73];
		headModel[0] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 25, 52, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 29, 75, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 26, 63, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 22, 41, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 5, 86, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 3, 41, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 12
		headModel[9] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 13
		headModel[10] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 14
		headModel[11] = new ModelRendererTurbo(this, 51, 41, textureX, textureY); // Box 15
		headModel[12] = new ModelRendererTurbo(this, 54, 52, textureX, textureY); // Box 16
		headModel[13] = new ModelRendererTurbo(this, 54, 63, textureX, textureY); // Box 17
		headModel[14] = new ModelRendererTurbo(this, 60, 75, textureX, textureY); // Box 18
		headModel[15] = new ModelRendererTurbo(this, 49, 86, textureX, textureY); // Box 19
		headModel[16] = new ModelRendererTurbo(this, 68, 86, textureX, textureY); // Box 20
		headModel[17] = new ModelRendererTurbo(this, 68, 81, textureX, textureY); // Box 21
		headModel[18] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 22
		headModel[19] = new ModelRendererTurbo(this, 49, 86, textureX, textureY); // Box 23
		headModel[20] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 24
		headModel[21] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 25
		headModel[22] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 26
		headModel[23] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 27
		headModel[24] = new ModelRendererTurbo(this, 54, 2, textureX, textureY); // Box 28
		headModel[25] = new ModelRendererTurbo(this, 54, 2, textureX, textureY); // Box 34
		headModel[26] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 35
		headModel[27] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 37
		headModel[28] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 38
		headModel[29] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 39
		headModel[30] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 40
		headModel[31] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 41
		headModel[32] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 42
		headModel[33] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 43
		headModel[34] = new ModelRendererTurbo(this, 54, 2, textureX, textureY); // Box 44
		headModel[35] = new ModelRendererTurbo(this, 54, 2, textureX, textureY); // Box 45
		headModel[36] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 46
		headModel[37] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 47
		headModel[38] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 48
		headModel[39] = new ModelRendererTurbo(this, 44, 2, textureX, textureY); // Box 49
		headModel[40] = new ModelRendererTurbo(this, 13, 100, textureX, textureY); // Box 51
		headModel[41] = new ModelRendererTurbo(this, 34, 112, textureX, textureY); // Box 52
		headModel[42] = new ModelRendererTurbo(this, 27, 112, textureX, textureY); // Box 54
		headModel[43] = new ModelRendererTurbo(this, 6, 116, textureX, textureY); // Box 58
		headModel[44] = new ModelRendererTurbo(this, 6, 100, textureX, textureY); // Box 60
		headModel[45] = new ModelRendererTurbo(this, 24, 100, textureX, textureY); // Box 61
		headModel[46] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Box 63
		headModel[47] = new ModelRendererTurbo(this, 6, 106, textureX, textureY); // Box 64
		headModel[48] = new ModelRendererTurbo(this, 13, 106, textureX, textureY); // Box 66
		headModel[49] = new ModelRendererTurbo(this, 52, 106, textureX, textureY); // Box 67
		headModel[50] = new ModelRendererTurbo(this, 43, 106, textureX, textureY); // Box 68
		headModel[51] = new ModelRendererTurbo(this, 35, 106, textureX, textureY); // Box 69
		headModel[52] = new ModelRendererTurbo(this, 28, 116, textureX, textureY); // Box 70
		headModel[53] = new ModelRendererTurbo(this, 28, 116, textureX, textureY); // Box 71
		headModel[54] = new ModelRendererTurbo(this, 19, 124, textureX, textureY); // Box 73
		headModel[55] = new ModelRendererTurbo(this, 36, 124, textureX, textureY); // Box 74
		headModel[56] = new ModelRendererTurbo(this, 5, 124, textureX, textureY); // Box 75
		headModel[57] = new ModelRendererTurbo(this, 28, 106, textureX, textureY); // Box 76
		headModel[58] = new ModelRendererTurbo(this, 20, 106, textureX, textureY); // Box 77
		headModel[59] = new ModelRendererTurbo(this, 65, 106, textureX, textureY); // Box 78
		headModel[60] = new ModelRendererTurbo(this, 75, 106, textureX, textureY); // Box 79
		headModel[61] = new ModelRendererTurbo(this, 19, 129, textureX, textureY); // Box 80
		headModel[62] = new ModelRendererTurbo(this, 5, 129, textureX, textureY); // Box 81
		headModel[63] = new ModelRendererTurbo(this, 36, 129, textureX, textureY); // Box 82
		headModel[64] = new ModelRendererTurbo(this, 65, 100, textureX, textureY); // Box 0
		headModel[65] = new ModelRendererTurbo(this, 75, 111, textureX, textureY); // Box 1
		headModel[66] = new ModelRendererTurbo(this, 65, 111, textureX, textureY); // Box 2
		headModel[67] = new ModelRendererTurbo(this, 65, 100, textureX, textureY); // Box 4
		headModel[68] = new ModelRendererTurbo(this, 54, 123, textureX, textureY); // Box 5
		headModel[69] = new ModelRendererTurbo(this, 65, 100, textureX, textureY); // Box 7
		headModel[70] = new ModelRendererTurbo(this, 62, 123, textureX, textureY); // Box 8
		headModel[71] = new ModelRendererTurbo(this, 62, 123, textureX, textureY); // Box 9
		headModel[72] = new ModelRendererTurbo(this, 17, 112, textureX, textureY); // Box 14

		headModel[0].addShapeBox(-4F, -6F, -4F, 8, 6, 8, 0F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F, .05F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.15F, -3F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -6.15F, -3F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -8.15F, -3F, 9, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4.5F, -5.15F, -3F, 1, 2, 6, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.5F, -0.2F, -1F, .3F, -0.2F, -1F, .3F, 0.2F, 0F, -.3F, 0.2F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -10.15F, -3F, 7, 1, 6, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -6.15F, -6F, 8, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -10.15F, -4F, 7, 1, 1, 0F, -1F, -.5F, -.2F, -1F, -.5F, -.2F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, .3F, -.5F, 0F, .3F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -9.15F, -5F, 8, 1, 2, 0F, -1F, 0F, -.7F, -1F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 12
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -8.15F, -5F, 9, 2, 2, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 13
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -6.15F, -5F, 10, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F); // Box 14
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-3.5F, -10.15F, 3F, 7, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, -.5F, -.2F, -1F, -.5F, -.2F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 15
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -9.15F, 3F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.7F, -1F, 0F, -.7F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 16
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.5F, -8.15F, 3F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 17
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -6.15F, 3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 18
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3.5F, -5.15F, 3F, 2, 2, 2, 0F, -1F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0.2F, 0F, .3F, 0.2F, 0F, -.5F, 0.35F, 0F, -.5F, 0.35F, 0F); // Box 19
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -5.15F, 5F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, .5F, 0.35F, 0F, .5F, 0.35F, 0F, -2F, 0.45F, .5F, -2F, 0.45F, .5F); // Box 20
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -6.15F, 5F, 9, 1, 1, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, -1F, -.5F, -1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F); // Box 21
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5.5F, -5.15F, -3F, 1, 2, 6, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .3F, -0.2F, -1F, -.5F, -0.2F, -1F, -.3F, 0.2F, 0F, .3F, 0.2F, 0F); // Box 22
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5.5F, -5.15F, 3F, 2, 2, 2, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .3F, 0.2F, 0F, -1.3F, 0.2F, 0F, -.5F, 0.35F, 0F, -.5F, 0.35F, 0F); // Box 23
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(0.800000000000001F, -4.6F, -4.4F, 1, 1, 1, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F); // Box 24
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(1F, -5.3F, -4.4F, 2, 1, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F); // Box 25
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(1F, -3.9F, -4.4F, 2, 1, 1, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 26
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(2.2F, -4.6F, -4.4F, 1, 1, 1, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F); // Box 27
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(1F, -5.1F, -4.4F, 2, 1, 1, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(1F, -4.1F, -4.4F, 2, 1, 1, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 34
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(1F, -5.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F); // Box 35
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(2F, -5.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F); // Box 37
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(2F, -4.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 38
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(1F, -4.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 39
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-3F, -3.9F, -4.4F, 2, 1, 1, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 40
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-1.8F, -4.6F, -4.4F, 1, 1, 1, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F); // Box 41
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-3.2F, -4.6F, -4.4F, 1, 1, 1, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, .2F, 0F); // Box 42
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3F, -5.3F, -4.4F, 2, 1, 1, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F); // Box 43
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-3F, -5.1F, -4.4F, 2, 1, 1, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-3F, -4.1F, -4.4F, 2, 1, 1, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 45
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-3F, -4.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 46
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-3F, -5.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F); // Box 47
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-2F, -5.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F); // Box 48
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-2F, -4.1F, -4.4F, 1, 1, 1, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.7F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 49
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(3.5F, -4.8F, -4.5F, 1, 1, 1, 0F, 0F, .8F, 0F, -.5F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(3.5F, -3.8F, -4.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 52
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-4.5F, -3.8F, -4.5F, 1, 1, 1, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-4.5F, -2.8F, -4.5F, 9, 1, 1, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-4.5F, -4.8F, -4.5F, 1, 1, 1, 0F, -.5F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-4.5F, -5.8F, -3.5F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 61
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-4F, -2.8F, -5.5F, 3, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-4F, -3.8F, -5.5F, 1, 1, 1, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(3F, -3.8F, -5.5F, 1, 1, 1, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-1F, -2.8F, -6F, 2, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 67
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-1F, -4.8F, -5F, 2, 2, 1, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, -1F, -.5F, -1F, -1F, -.5F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 68
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-1F, -4.8F, -4.5F, 2, 3, 1, 0F, -.5F, -1F, .5F, -.5F, -1F, .5F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-4F, -1.8F, -5.5F, 3, 1, 1, 0F, -1F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, -1F, 0F); // Box 70
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(1F, -1.8F, -5.5F, 3, 1, 1, 0F, -.6F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, -.6F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, -1F, 0F, -1F, 0F, -.5F); // Box 71
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-2F, -1.8F, -6F, 4, 1, 2, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, -.5F, -.5F, .5F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 73
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-2F, -0.8F, -6F, 4, 1, 2, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 74
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-2F, -2.8F, -6F, 4, 1, 2, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-1F, -4.8F, -4.5F, 2, 4, 1, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-1F, -5.8F, -4.5F, 2, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 77
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-5.45F, -1.8F, -4.5F, 3, 1, 1, 0F, -.5F, 0F, 0F, -.5F, 0F, .4F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .4F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		headModel[59].setRotationPoint(1F, 0F, 0F);

		headModel[60].addShapeBox(2.45F, -1.8F, -4.5F, 2, 1, 1, 0F, .5F, 0F, .4F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, .4F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 79
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-1.5F, -1.8F, -6.5F, 3, 1, 1, 0F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, -.3F, -.5F, .5F, -.3F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 80
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(-1.5F, -2.8F, -6.5F, 3, 1, 1, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, .5F, -.1F, -.5F, .5F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(-1.5F, -0.8F, -6.5F, 3, 1, 1, 0F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, -.4F, -1F, 0F, -.4F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 82
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(-4.5F, -2.8F, -3.5F, 9, 2, 1, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F); // Box 0
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(2.45F, -0.8F, -4.5F, 2, 1, 1, 0F, .5F, 0F, .4F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .2F, -.1F, -.5F, 0F, -.15F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-5.45F, -0.8F, -4.5F, 2, 1, 1, 0F, -.5F, 0F, 0F, .5F, 0F, .4F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.15F, 0F, .2F, -.1F, 0F, 0F, 0F, -.2F, 0F, 0F); // Box 2
		headModel[66].setRotationPoint(1F, 0F, 0F);

		headModel[67].addShapeBox(-4.5F, -0.8F, -3.5F, 2, 1, 1, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.25F, 0F, 0F, -.25F, 0F, 0F, -.05F, -1F, 0F, -.05F, -1F, 0F); // Box 4
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(-0.5F, -1.7F, -6.5F, 1, 1, 1, 0F, .1F, -.3F, .2F, .1F, -.3F, .2F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, .6F, 0F, .1F, .6F, 0F, .1F, .4F, 0F, .1F, .4F, 0F); // Box 5
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(2.5F, -0.8F, -3.5F, 2, 1, 1, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.05F, 0F, 0F, -.25F, 0F, 0F, -.25F, 0F, 0F, -.05F, -1F, 0F, -.05F, -1F, 0F); // Box 7
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(-0.5F, -1.25F, -7.5F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(-0.5F, 0.75F, -7.5F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(1F, -2.8F, -5.5F, 3, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[72].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[59];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 21, 164, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 4, 182, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 26, 182, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 4, 166, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 53, 164, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 53, 171, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 4, 172, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 4, 177, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 4, 177, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 4, 161, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 4, 161, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 2, 147, textureX, textureY); // Box 12
		bodyModel[14] = new ModelRendererTurbo(this, 2, 147, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 16, 159, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 4, 166, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 4, 172, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 16, 164, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 68, 163, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 4, 193, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 26, 193, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 68, 163, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 36, 140, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 47, 140, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 44, 144, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 37, 145, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 37, 145, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 44, 144, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 71, 139, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 71, 139, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 71, 149, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 55, 188, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 55, 198, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 55, 193, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 55, 193, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 79, 188, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 79, 188, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 55, 179, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 2, 206, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 29, 206, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 16, 226, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 16, 219, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 16, 232, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 3, 219, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 3, 219, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 3, 219, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 3, 219, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 53, 210, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 64, 213, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 70, 213, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 53, 210, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 55, 206, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 62, 206, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 68, 206, textureX, textureY); // Box 1
		bodyModel[55] = new ModelRendererTurbo(this, 86, 206, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 86, 212, textureX, textureY); // Box 3
		bodyModel[57] = new ModelRendererTurbo(this, 77, 205, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 77, 211, textureX, textureY); // Box 5

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 8, 12, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.1F, -3F, 8, 1, 6, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0.9F, -3F, 8, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 5.9F, -3F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .15F, -.3F, .2F, 0F, .5F, .4F, 0F, .5F, .4F, .15F, -.2F, .2F); // Box 0
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(1F, 5.9F, -3F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, .4F, .15F, -.3F, .2F, .15F, -.3F, .2F, 0F, .5F, .4F); // Box 2
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(1F, 1.9F, -4F, 3, 2, 1, 0F, 0F, 0F, .3F, -.2F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, 4.8F, -5F, 3, 3, 2, 0F, -1F, -1F, -.5F, -1F, -1F, -.5F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, -.8F, 0F, -.7F, -.8F, 0F, -.7F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 5
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 7.8F, -4F, 3, 2, 1, 0F, -.8F, 0F, .3F, -.8F, 0F, .3F, .2F, 0F, 0F, .2F, 0F, 0F, -.8F, .5F, -.3F, -.8F, .5F, -.3F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 3.9F, -4F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 0F, .3F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 4.9F, -4F, 3, 2, 1, 0F, -.2F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, -.5F, 0F); // Box 8
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1F, 4.9F, -4F, 3, 2, 1, 0F, 0F, 0F, .2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, 0F, 0F); // Box 9
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1F, 0.9F, -4F, 3, 1, 1, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.3F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .3F, -.2F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 0.9F, -4F, 3, 1, 1, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.2F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.2F, 0F, -.1F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, -0.1F, -3.5F, 2, 1, 6, 0F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.5F, -0.1F, -3.5F, 2, 1, 6, 0F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, .1F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1F, 1.9F, -4F, 2, 2, 1, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 1.9F, -4F, 3, 2, 1, 0F, -.2F, 0F, -.1F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 0F, .3F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1F, 3.9F, -4F, 3, 1, 1, 0F, 0F, 0F, .8F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1F, 3.9F, -4F, 2, 1, 1, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, -0.1F, -2.5F, 7, 11, 1, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, -.5F, .1F, .1F, -.5F, .1F, .1F, 0F, .1F, -.1F, 0F, .1F, .1F); // Box 19
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 7.1F, -3F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .15F, -.3F, .2F, 0F, 1F, .4F, 0F, 1F, .4F, .15F, -.2F, .2F); // Box 22
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1F, 7.1F, -3F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .4F, .15F, -.3F, .2F, .15F, -.3F, .2F, 0F, 1F, .4F); // Box 23
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3.5F, -0.1F, 1.5F, 7, 11, 1, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, -.5F, .1F, .1F, -.5F, .1F, .1F); // Box 24
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1F, 0.8F, -4.2F, 2, 1, 1, 0F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Box 25
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.5F, 0.8F, -4.2F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(3.5F, -1.2F, -2.2F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(3.5F, -1.2F, -4.2F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.5F, -1.2F, -4.2F, 1, 2, 1, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4.5F, -1.2F, -2.2F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3F, -1.7F, -0.2F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-5F, -1.7F, -0.2F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 33
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3F, -1.7F, 2.8F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1F, 10.5F, -3.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1F, 12.5F, -3.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 36
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2F, 10.5F, -3.5F, 1, 2, 1, 0F, 0F, .1F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, .2F, -.5F, -.2F, 0F, -.2F, 0F, 0F, -.2F, 0F, .2F, -.5F, 0F); // Box 37
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1F, 10.5F, -3.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, .1F, -.2F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, .2F, -.5F, -.2F, .2F, -.5F, 0F, 0F, -.2F, 0F); // Box 38
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 10.5F, 2.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -.5F, -2.5F, 0F, 0F, -.5F, 0F); // Box 40
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 10.5F, 2.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -2.5F, 0F); // Box 41
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, 10.7F, -3F, 8, 1, 6, 0F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F); // Box 42
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3.5F, -0.1F, 3F, 7, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.5F, 4.9F, 3F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 44
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3.5F, 8.9F, 3F, 7, 1, 3, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 7.9F, 3F, 7, 1, 3, 0F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3.5F, 9.9F, 3F, 7, 1, 3, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, -.8F); // Box 47
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2.5F, 4.9F, 5.85F, 1, 6, 1, 0F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.8F, -.1F, 0F, -.8F); // Box 48
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(1.5F, 4.9F, 5.85F, 1, 6, 1, 0F, -.1F, 0F, -.8F, -.1F, 0F, -.8F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.8F, -.1F, 0F, -.8F); // Box 49
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(1.5F, 10.9F, 3.1F, 1, 1, 3, 0F, -.1F, 0F, -.05F, -.1F, 0F, -.05F, -.1F, 0F, -.05F, -.1F, 0F, -.05F, -.1F, -.8F, -.3F, -.1F, -.8F, -.3F, -.1F, -.8F, -.3F, -.1F, -.8F, -.3F); // Box 50
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2.5F, 10.9F, 3.1F, 1, 1, 3, 0F, -.1F, 0F, -.05F, -.1F, 0F, -.05F, -.1F, 0F, -.05F, -.1F, 0F, -.05F, -.1F, -.8F, -.3F, -.1F, -.8F, -.3F, -.1F, -.8F, -.3F, -.1F, -.8F, -.3F); // Box 51
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4.5F, 0.9F, 3.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4.3F, 0.5F, 5F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4.35F, 0.5F, 3.95F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-4.5F, 2.9F, 3.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(3.5F, -0.1F, 5.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(3.5F, -2.1F, 5.5F, 1, 2, 1, 0F, -.35F, .5F, -.35F, -.35F, .5F, -.35F, -.35F, .5F, -.35F, -.35F, .5F, -.35F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 0
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(3.5F, -6.1F, 5.5F, 1, 4, 1, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Box 1
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(3.5F, 1.9F, 4.5F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(3.5F, 3.9F, 4.5F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -.2F, -1.5F, 0F, -.2F, -1.5F); // Box 3
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(2.6F, 2.9F, 6.1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(0F, 0F, -1F);

		bodyModel[58].addShapeBox(3.6F, 2.9F, 6.1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 5
		bodyModel[58].setRotationPoint(0F, 0F, -1F);


		leftArmModel = new ModelRendererTurbo[21];
		leftArmModel[0] = new ModelRendererTurbo(this, 15, 27, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 137, 36, textureX, textureY); // Box 0
		leftArmModel[2] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 1
		leftArmModel[3] = new ModelRendererTurbo(this, 113, 26, textureX, textureY); // Box 2
		leftArmModel[4] = new ModelRendererTurbo(this, 112, 37, textureX, textureY); // Box 3
		leftArmModel[5] = new ModelRendererTurbo(this, 112, 47, textureX, textureY); // Box 4
		leftArmModel[6] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 5
		leftArmModel[7] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 6
		leftArmModel[8] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 8
		leftArmModel[9] = new ModelRendererTurbo(this, 114, 80, textureX, textureY); // Box 9
		leftArmModel[10] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 10
		leftArmModel[11] = new ModelRendererTurbo(this, 137, 29, textureX, textureY); // Box 11
		leftArmModel[12] = new ModelRendererTurbo(this, 114, 71, textureX, textureY); // Box 12
		leftArmModel[13] = new ModelRendererTurbo(this, 129, 75, textureX, textureY); // Box 16
		leftArmModel[14] = new ModelRendererTurbo(this, 129, 66, textureX, textureY); // Box 17
		leftArmModel[15] = new ModelRendererTurbo(this, 129, 84, textureX, textureY); // Box 18
		leftArmModel[16] = new ModelRendererTurbo(this, 147, 45, textureX, textureY); // Box 19
		leftArmModel[17] = new ModelRendererTurbo(this, 147, 50, textureX, textureY); // Box 20
		leftArmModel[18] = new ModelRendererTurbo(this, 147, 59, textureX, textureY); // Box 21
		leftArmModel[19] = new ModelRendererTurbo(this, 147, 54, textureX, textureY); // Box 22
		leftArmModel[20] = new ModelRendererTurbo(this, 137, 45, textureX, textureY); // Box 23

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 6, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .3F, .1F, 0F, .3F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7.9F, -2F, 4, 2, 4, 0F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F); // Box 0
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 3.9F, -2F, 4, 4, 4, 0F, .11F, 0F, .05F, .11F, 0F, .05F, .11F, 0F, .3F, .11F, 0F, .3F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F); // Box 1
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1.5F, -1.1F, -2.4F, 2, 4, 5, 0F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.2F); // Box 2
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.5F, -3.1F, -3F, 3, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.5F, -3.1F, -3F, 2, 2, 6, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 4
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.5F, -1.1F, -3F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -1F, 0F, -.5F, .5F, 0F, -1F, .5F, 0F, -1F, -1F, 0F, -.5F); // Box 5
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0.5F, -3F, -2.5F, 1, 1, 1, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 6
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(4F, -1.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2.5F, 3.9F, -2.4F, 1, 4, 5, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Box 9
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(0.5F, -3F, 1.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F); // Box 10
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2F, 8.2F, -2F, 1, 1, 4, 0F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F); // Box 11
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2.5F, 2.9F, -2.4F, 1, 1, 5, 0F, -1F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, -1F, -.5F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F); // Box 12
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(3.5F, 3.9F, -2.4F, 1, 1, 5, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.05F, -.8F, 0F, -.05F, -.8F, 0F, -.05F, 0F, 0F, -.05F); // Box 16
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(3.5F, 2.9F, -2.4F, 1, 1, 5, 0F, 0F, -.5F, -.2F, -.8F, -.5F, -.2F, -.8F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(3.5F, 6.9F, -2.4F, 1, 1, 5, 0F, 0F, 0F, -.15F, -.8F, 0F, -.15F, -.8F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.2F, -.8F, 0F, -.2F, -.8F, 0F, -.2F, 0F, 0F, -.2F); // Box 18
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addBox(1F, 9.45F, -2F, 2, 1, 1, 0F); // Box 19
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addBox(1F, 9.6F, -1F, 2, 1, 1, 0F); // Box 20
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addBox(1F, 9.4F, 1F, 2, 1, 1, 0F); // Box 21
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addBox(1F, 9.5F, 0F, 2, 1, 1, 0F); // Box 22
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-0.5F, 9.4F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.2F, -.5F, 0F, 0F); // Box 23
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[18];
		rightArmModel[0] = new ModelRendererTurbo(this, 38, 25, textureX, textureY); // Box 24
		rightArmModel[1] = new ModelRendererTurbo(this, 6, 25, textureX, textureY); // Box 25
		rightArmModel[2] = new ModelRendererTurbo(this, 94, 26, textureX, textureY); // Box 26
		rightArmModel[3] = new ModelRendererTurbo(this, 92, 38, textureX, textureY); // Box 27
		rightArmModel[4] = new ModelRendererTurbo(this, 92, 49, textureX, textureY); // Box 28
		rightArmModel[5] = new ModelRendererTurbo(this, 92, 60, textureX, textureY); // Box 29
		rightArmModel[6] = new ModelRendererTurbo(this, 137, 36, textureX, textureY); // Box 30
		rightArmModel[7] = new ModelRendererTurbo(this, 137, 29, textureX, textureY); // Box 31
		rightArmModel[8] = new ModelRendererTurbo(this, 147, 45, textureX, textureY); // Box 32
		rightArmModel[9] = new ModelRendererTurbo(this, 137, 45, textureX, textureY); // Box 33
		rightArmModel[10] = new ModelRendererTurbo(this, 147, 50, textureX, textureY); // Box 34
		rightArmModel[11] = new ModelRendererTurbo(this, 147, 54, textureX, textureY); // Box 35
		rightArmModel[12] = new ModelRendererTurbo(this, 147, 59, textureX, textureY); // Box 36
		rightArmModel[13] = new ModelRendererTurbo(this, 94, 99, textureX, textureY); // Box 37
		rightArmModel[14] = new ModelRendererTurbo(this, 94, 90, textureX, textureY); // Box 38
		rightArmModel[15] = new ModelRendererTurbo(this, 94, 80, textureX, textureY); // Box 39
		rightArmModel[16] = new ModelRendererTurbo(this, 94, 72, textureX, textureY); // Box 40
		rightArmModel[17] = new ModelRendererTurbo(this, 94, 108, textureX, textureY); // Box 41

		rightArmModel[0].addShapeBox(-3F, 3.9F, -2F, 4, 4, 4, 0F, .11F, 0F, .05F, .11F, 0F, .05F, .11F, 0F, .3F, .11F, 0F, .3F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F); // Box 24
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 6, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .3F, .1F, 0F, .3F); // Box 25
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.5F, -1.1F, -2.4F, 2, 4, 5, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.3F); // Box 26
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2.5F, -3.1F, -3F, 3, 2, 6, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 27
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-4.5F, -3.1F, -3F, 2, 2, 6, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -.5F, -1F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.5F, -1F); // Box 28
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-4F, -1.1F, -3F, 2, 2, 6, 0F, 0F, .5F, -1F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -1F, .5F, 0F, -1F, -1F, 0F, -.5F, -1F, 0F, -.5F, .5F, 0F, -1F); // Box 29
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 7.9F, -2F, 4, 2, 4, 0F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F); // Box 30
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 8.2F, -2F, 1, 1, 4, 0F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F, .15F, .2F, .15F); // Box 31
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addBox(-3F, 9.45F, -2F, 2, 1, 1, 0F); // Box 32
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-0.5F, 9.4F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, -.2F); // Box 33
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addBox(-3F, 9.6F, -1F, 2, 1, 1, 0F); // Box 34
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addBox(-3F, 9.5F, 0F, 2, 1, 1, 0F); // Box 35
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addBox(-3F, 9.4F, 1F, 2, 1, 1, 0F); // Box 36
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.5F, 5.9F, -2.4F, 1, 1, 5, 0F, .5F, 1F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, .5F, 1F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.3F); // Box 37
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.5F, 3.9F, -2.4F, 1, 2, 5, 0F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.3F, .5F, -1F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, .5F, -1F, -.3F); // Box 38
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-2.5F, 3.9F, -2.4F, 1, 2, 5, 0F, 0F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, 0F, 0F, -.2F); // Box 39
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3F, 4.4F, -2.4F, 1, 1, 5, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Box 40
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.5F, 6.9F, -2.4F, 1, 1, 5, 0F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.3F, .1F, .1F, -.3F, .1F, 0F, -.2F, .1F, 0F, -.2F, .1F, .1F, -.3F); // Box 41
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[15];
		leftLegModel[0] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 4
		leftLegModel[1] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 6
		leftLegModel[2] = new ModelRendererTurbo(this, 58, 25, textureX, textureY); // Box 7
		leftLegModel[3] = new ModelRendererTurbo(this, 100, 140, textureX, textureY); // Box 8
		leftLegModel[4] = new ModelRendererTurbo(this, 95, 128, textureX, textureY); // Box 11
		leftLegModel[5] = new ModelRendererTurbo(this, 95, 134, textureX, textureY); // Box 12
		leftLegModel[6] = new ModelRendererTurbo(this, 109, 128, textureX, textureY); // Box 13
		leftLegModel[7] = new ModelRendererTurbo(this, 109, 123, textureX, textureY); // Box 14
		leftLegModel[8] = new ModelRendererTurbo(this, 123, 124, textureX, textureY); // Box 15
		leftLegModel[9] = new ModelRendererTurbo(this, 95, 121, textureX, textureY); // Box 16
		leftLegModel[10] = new ModelRendererTurbo(this, 109, 119, textureX, textureY); // Box 17
		leftLegModel[11] = new ModelRendererTurbo(this, 123, 119, textureX, textureY); // Box 18
		leftLegModel[12] = new ModelRendererTurbo(this, 123, 131, textureX, textureY); // Box 19
		leftLegModel[13] = new ModelRendererTurbo(this, 66, 187, textureX, textureY); // Box 20
		leftLegModel[14] = new ModelRendererTurbo(this, 66, 194, textureX, textureY); // Box 21

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 5, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .1F, 0F, .5F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4.9F, -2F, 4, 2, 4, 0F, .1F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .1F, 0F, .5F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F); // Box 6
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.9F, -2F, 4, 3, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .05F, .2F, .05F, .05F, .2F, .05F, .05F, .2F, .05F, .05F, .2F, .05F); // Box 7
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 9.9F, -2F, 4, 2, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F); // Box 8
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 6.9F, -3.1F, 4, 2, 1, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Box 11
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 8.9F, -3.1F, 4, 2, 1, 0F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.6F, -.5F, -.3F, -.6F, -.5F, -.3F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 12
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 5.9F, -4.1F, 4, 1, 1, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 4.9F, -4.1F, 4, 1, 1, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(2F, 4.9F, -3.1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 4.9F, -3.1F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, 3.9F, -4.1F, 4, 1, 1, 0F, -1F, -.5F, -1F, -1F, -.5F, -1F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(2F, 2.9F, -3.1F, 1, 2, 2, 0F, -1F, 0F, -2F, .2F, 0F, -2F, .2F, -.5F, 1F, -1F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(2F, 5.9F, -2.1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, .2F, 0F, -1.5F, .2F, -.5F, 1F, -1F, -.5F, 1F); // Box 19
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(2F, -1.5F, -2F, 1, 1, 4, 0F, 0F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 20
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(2F, -0.5F, -2F, 1, 3, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -.8F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.8F, 0F, 0F); // Box 21
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[15];
		rightLegModel[0] = new ModelRendererTurbo(this, 6, 25, textureX, textureY); // Box 22
		rightLegModel[1] = new ModelRendererTurbo(this, 58, 25, textureX, textureY); // Box 23
		rightLegModel[2] = new ModelRendererTurbo(this, 6, 25, textureX, textureY); // Box 24
		rightLegModel[3] = new ModelRendererTurbo(this, 100, 140, textureX, textureY); // Box 25
		rightLegModel[4] = new ModelRendererTurbo(this, 95, 134, textureX, textureY); // Box 28
		rightLegModel[5] = new ModelRendererTurbo(this, 95, 128, textureX, textureY); // Box 29
		rightLegModel[6] = new ModelRendererTurbo(this, 95, 121, textureX, textureY); // Box 30
		rightLegModel[7] = new ModelRendererTurbo(this, 109, 128, textureX, textureY); // Box 31
		rightLegModel[8] = new ModelRendererTurbo(this, 109, 123, textureX, textureY); // Box 32
		rightLegModel[9] = new ModelRendererTurbo(this, 109, 119, textureX, textureY); // Box 33
		rightLegModel[10] = new ModelRendererTurbo(this, 123, 119, textureX, textureY); // Box 34
		rightLegModel[11] = new ModelRendererTurbo(this, 123, 124, textureX, textureY); // Box 35
		rightLegModel[12] = new ModelRendererTurbo(this, 123, 131, textureX, textureY); // Box 36
		rightLegModel[13] = new ModelRendererTurbo(this, 66, 194, textureX, textureY); // Box 37
		rightLegModel[14] = new ModelRendererTurbo(this, 66, 187, textureX, textureY); // Box 38

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 5, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .5F, 0F, .5F, .1F, 0F, .5F, .1F, 0F, .5F, .5F, 0F, .5F); // Box 22
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6.9F, -2F, 4, 3, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .05F, .2F, .05F, .05F, .2F, .05F, .05F, .2F, .05F, .05F, .2F, .05F); // Box 23
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 4.9F, -2F, 4, 2, 4, 0F, .5F, 0F, .5F, .1F, 0F, .5F, .1F, 0F, .5F, .5F, 0F, .5F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F, .11F, 0F, .11F); // Box 24
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 9.9F, -2F, 4, 2, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F, .1F, .2F, .1F); // Box 25
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 8.9F, -3.1F, 4, 2, 1, 0F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.6F, -.5F, -.3F, -.6F, -.5F, -.3F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 6.9F, -3.1F, 4, 2, 1, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Box 29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 4.9F, -3.1F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 5.9F, -4.1F, 4, 1, 1, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 4.9F, -4.1F, 4, 1, 1, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 3.9F, -4.1F, 4, 1, 1, 0F, -1F, -.5F, -1F, -1F, -.5F, -1F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-3F, 2.9F, -3.1F, 1, 2, 2, 0F, .2F, 0F, -2F, -1F, 0F, -2F, -1F, -.5F, 1F, .2F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-3F, 4.9F, -3.1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-3F, 5.9F, -2.1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -.5F, 1F, .2F, -.5F, 1F); // Box 36
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-3F, -0.5F, -2F, 1, 3, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, .5F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, .5F, 0F, 0F); // Box 37
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-3F, -1.5F, -2F, 1, 1, 4, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 38
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);


	}
}