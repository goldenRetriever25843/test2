//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TerranInfantryUniform
// Model Creator: 
// Created on: 10.04.2016 - 09:21:21
// Last changed on: 10.04.2016 - 09:21:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTerranArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelTerranArmor() //Same as Filename
	{
		headModel = new ModelRendererTurbo[21];
		bodyModel = new ModelRendererTurbo[56];
		leftArmModel = new ModelRendererTurbo[11];
		rightArmModel = new ModelRendererTurbo[11];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 6, 37, textureX, textureY); // Box 50
		headModel[2] = new ModelRendererTurbo(this, 6, 37, textureX, textureY); // Box 51
		headModel[3] = new ModelRendererTurbo(this, 4, 87, textureX, textureY); // Box 70
		headModel[4] = new ModelRendererTurbo(this, 27, 24, textureX, textureY); // Box 111
		headModel[5] = new ModelRendererTurbo(this, 2, 19, textureX, textureY); // Box 113
		headModel[6] = new ModelRendererTurbo(this, 27, 19, textureX, textureY); // Box 114
		headModel[7] = new ModelRendererTurbo(this, 27, 31, textureX, textureY); // Box 119
		headModel[8] = new ModelRendererTurbo(this, 57, 19, textureX, textureY); // Box 120
		headModel[9] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 121
		headModel[10] = new ModelRendererTurbo(this, 57, 31, textureX, textureY); // Box 123
		headModel[11] = new ModelRendererTurbo(this, 57, 24, textureX, textureY); // Box 124
		headModel[12] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 125
		headModel[13] = new ModelRendererTurbo(this, 27, 45, textureX, textureY); // Box 132
		headModel[14] = new ModelRendererTurbo(this, 57, 45, textureX, textureY); // Box 133
		headModel[15] = new ModelRendererTurbo(this, 9, 51, textureX, textureY); // Box 134
		headModel[16] = new ModelRendererTurbo(this, 9, 51, textureX, textureY); // Box 135
		headModel[17] = new ModelRendererTurbo(this, 57, 37, textureX, textureY); // Box 136
		headModel[18] = new ModelRendererTurbo(this, 2, 51, textureX, textureY); // Box 137
		headModel[19] = new ModelRendererTurbo(this, 2, 51, textureX, textureY); // Box 138
		headModel[20] = new ModelRendererTurbo(this, 2, 57, textureX, textureY); // Box 139

		headModel[0].addShapeBox(-4.5F, -7.5F, -4.5F, 9, 2, 3, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, .2F, -.1F, 0F, .2F, .7F, 0F, 0F, .7F, 0F, 0F); // Box 1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(2.5F, -1F, -3.5F, 1, 1, 7, 0F,0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -1F, -3.5F, 1, 1, 7, 0F,0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, 9F, -2.5F, 1, 1, 5, 0F,-.9F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.2F, -.9F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.2F); // Box 70
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -7.5F, -1.5F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 111
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -8.5F, -4F, 8, 1, 2, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, .2F, 0F, .5F, .2F, 0F, .5F, .2F, 0F, .5F, .2F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, .5F); // Box 113
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -8.5F, -1.5F, 8, 1, 3, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 114
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -5.5F, -1.5F, 10, 1, 3, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 119
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -8.5F, 2F, 8, 1, 2, 0F,.2F, 0F, .5F, .2F, 0F, .5F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 1F, 0F, .5F, 1F, 0F, .5F, .2F, 0F, .5F, .2F, 0F, .5F); // Box 120
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -5.5F, -4.5F, 9, 1, 3, 0F,-.1F, 0F, .2F, -.1F, 0F, .2F, .7F, 0F, 0F, .7F, 0F, 0F, -.1F, .4F, .2F, -.1F, .4F, .2F, .7F, 0F, 0F, .7F, 0F, 0F); // Box 121
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, -5.5F, 1.5F, 9, 1, 3, 0F,.7F, 0F, 0F, .7F, 0F, 0F, -.1F, 0F, .2F, -.1F, 0F, .2F, .7F, 0F, 0F, .7F, 0F, 0F, -.1F, 0F, .2F, -.1F, 0F, .2F); // Box 123
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -7.5F, 1.5F, 9, 2, 3, 0F,.5F, 0F, 0F, .5F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, -.1F, 0F, .2F, -.1F, 0F, .2F); // Box 124
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5F, -4.5F, -1.5F, 10, 3, 3, 0F,.4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, -.4F, .4F, 0F, -.4F, .4F, 0F, 0F, .4F, 0F, 0F); // Box 125
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -1.5F, -1.5F, 10, 1, 3, 0F,0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 132
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4.5F, -1.5F, 1.5F, 9, 1, 3, 0F,.5F, 0F, 0F, .5F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // Box 133
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-5F, -4.5F, -2.5F, 1, 3, 1, 0F,.2F, -.4F, 0F, .2F, -.4F, 0F, .2F, 0F, 0F, .4F, 0F, 0F, .2F, -.4F, 0F, .2F, -.4F, 0F, .2F, 0F, .4F, .4F, 0F, .4F); // Box 134
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4F, -4.5F, -2.5F, 1, 3, 1, 0F,.2F, -.4F, 0F, .2F, -.4F, 0F, .4F, 0F, 0F, .2F, 0F, 0F, .2F, -.4F, 0F, .2F, -.4F, 0F, .4F, 0F, .4F, .2F, 0F, .4F); // Box 135
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -4.5F, 1.5F, 9, 3, 3, 0F,.9F, 0F, 0F, .9F, 0F, 0F, .1F, 0F, .4F, .1F, 0F, .4F, .9F, 0F, 0F, .9F, 0F, 0F, .1F, 0F, .4F, .1F, 0F, .4F); // Box 136
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4F, -2.5F, -3F, 1, 1, 2, 0F,-.1F, -1.2F, .3F, -.6F, -1.2F, .3F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 1F, 0F, -.6F, 1F, 0F, -.1F, .5F, 0F, -.1F, .5F, 0F); // Box 137
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5F, -2.5F, -3F, 1, 1, 2, 0F,-.6F, -1.2F, .3F, -.1F, -1.2F, .3F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.6F, 1F, 0F, -.1F, 1F, 0F, -.1F, .5F, 0F, -.1F, .5F, 0F); // Box 138
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.5F, -1.5F, -4F, 9, 1, 1, 0F,-.45F, -.8F, .4F, -.45F, -.8F, .4F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.45F, .3F, .2F, -.45F, .3F, .2F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Box 139
		headModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 63, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 31, 71, textureX, textureY); // Box 32
		bodyModel[2] = new ModelRendererTurbo(this, 31, 63, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 48, 63, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 45, 71, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 32, 80, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 46, 80, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 63, 71, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 76, 71, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 77, 62, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 63, 62, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 32, 87, textureX, textureY); // Box 42
		bodyModel[12] = new ModelRendererTurbo(this, 45, 87, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 62, 79, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 76, 79, textureX, textureY); // Box 45
		bodyModel[15] = new ModelRendererTurbo(this, 64, 58, textureX, textureY); // Box 46
		bodyModel[16] = new ModelRendererTurbo(this, 77, 58, textureX, textureY); // Box 47
		bodyModel[17] = new ModelRendererTurbo(this, 11, 99, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 11, 99, textureX, textureY); // Box 62
		bodyModel[19] = new ModelRendererTurbo(this, 4, 99, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 4, 99, textureX, textureY); // Box 64
		bodyModel[21] = new ModelRendererTurbo(this, 16, 88, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 4, 96, textureX, textureY); // Box 67
		bodyModel[23] = new ModelRendererTurbo(this, 4, 87, textureX, textureY); // Box 68
		bodyModel[24] = new ModelRendererTurbo(this, 4, 83, textureX, textureY); // Box 69
		bodyModel[25] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 71
		bodyModel[26] = new ModelRendererTurbo(this, 19, 98, textureX, textureY); // Box 72
		bodyModel[27] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Box 73
		bodyModel[28] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 74
		bodyModel[29] = new ModelRendererTurbo(this, 19, 98, textureX, textureY); // Box 75
		bodyModel[30] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 76
		bodyModel[31] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Box 77
		bodyModel[32] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 78
		bodyModel[33] = new ModelRendererTurbo(this, 27, 96, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 27, 96, textureX, textureY); // Box 80
		bodyModel[35] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 81
		bodyModel[36] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 82
		bodyModel[37] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 86
		bodyModel[41] = new ModelRendererTurbo(this, 27, 96, textureX, textureY); // Box 87
		bodyModel[42] = new ModelRendererTurbo(this, 27, 96, textureX, textureY); // Box 88
		bodyModel[43] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 89
		bodyModel[44] = new ModelRendererTurbo(this, 27, 92, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 27, 103, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 27, 103, textureX, textureY); // Box 92
		bodyModel[47] = new ModelRendererTurbo(this, 35, 104, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 35, 91, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 35, 95, textureX, textureY); // Box 96
		bodyModel[50] = new ModelRendererTurbo(this, 35, 99, textureX, textureY); // Box 97
		bodyModel[51] = new ModelRendererTurbo(this, 35, 104, textureX, textureY); // Box 98
		bodyModel[52] = new ModelRendererTurbo(this, 19, 93, textureX, textureY); // Box 126
		bodyModel[53] = new ModelRendererTurbo(this, 19, 98, textureX, textureY); // Box 127
		bodyModel[54] = new ModelRendererTurbo(this, 19, 102, textureX, textureY); // Box 128
		bodyModel[55] = new ModelRendererTurbo(this, 19, 106, textureX, textureY); // Box 129

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1F, -3F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -3F, 2, 1, 5, 0F,0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2F, 0F, -3F, 2, 1, 5, 0F,0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 1F, -3F, 4, 5, 1, 0F,0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 6F, -3F, 4, 4, 1, 0F,-.5F, 0F, -.1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 6F, -3F, 4, 4, 1, 0F,0F, 0F, .2F, -.5F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 6.1F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.3F, 0F, 0F, 0F); // Box 38
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 6.1F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.5F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.3F); // Box 39
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 1F, 2F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, 0F, 0F); // Box 40
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 1F, 2F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .3F); // Box 41
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 10F, -3F, 4, 1, 1, 0F,-.9F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 42
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 10F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, -.9F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -.3F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 10.1F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.3F, 0F, 0F, 0F, 0F, .5F, 0F, -.5F, -.2F, 0F, -1.5F, -.4F, -.3F, 0F, 0F, 0F); // Box 44
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 10.1F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.3F, -.5F, -.2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.5F, -.4F, -.3F); // Box 45
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 2F, 4, 1, 1, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F); // Box 46
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 0F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F); // Box 47
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.5F, 0F, 2.5F, 1, 7, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.5F, 0F, 2.5F, 1, 7, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 0F, -3.5F, 1, 10, 1, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(1F, 0F, -3.5F, 1, 10, 1, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 9F, -3.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, 9F, -3.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 67
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(4F, 9F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, -.9F, 0F, -.2F, -.9F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, -.2F, -.9F, 0F, -.2F, 0F, 0F, 0F); // Box 68
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addFlexTrapezoid(-4F, 9F, 1.5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 69
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2F, 8.5F, -3.8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2F, 8.5F, -4.8F, 1, 1, 1, 0F,0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.9F, 0F, -.4F, -.9F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Box 72
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 9.2F, -4.8F, 1, 1, 1, 0F,-.4F, 0F, -.95F, -.4F, 0F, -.95F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.7F, -.95F, -.4F, -.7F, -.95F, -.4F, -.7F, 0F, -.4F, -.7F, 0F); // Box 73
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2F, 9.1F, -4.8F, 1, 1, 1, 0F,0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.8F, -.9F, -.2F, -.8F, -.9F, -.2F, -.8F, 0F, -.2F, -.8F, 0F); // Box 74
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3F, 8.5F, -4.5F, 1, 1, 1, 0F,0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.9F, 0F, -.4F, -.9F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Box 75
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3F, 9.1F, -4.5F, 1, 1, 1, 0F,0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.8F, -.9F, -.2F, -.8F, -.9F, -.2F, -.8F, 0F, -.2F, -.8F, 0F); // Box 76
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3F, 9.2F, -4.5F, 1, 1, 1, 0F,-.4F, 0F, -.95F, -.4F, 0F, -.95F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.7F, -.95F, -.4F, -.7F, -.95F, -.4F, -.7F, 0F, -.4F, -.7F, 0F); // Box 77
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(3F, 8.5F, -3.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2.5F, 8.3F, -4F, 1, 3, 1, 0F,0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F); // Box 79
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 8.3F, -4F, 1, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F); // Box 80
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.5F, 7.8F, -4F, 1, 1, 1, 0F,-.1F, -.8F, 0F, 0F, -.8F, .4F, 0F, -.8F, .4F, -.1F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 81
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.5F, 7.8F, -4F, 1, 1, 1, 0F,0F, -.8F, .4F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, 0F, -.8F, .4F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 82
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2.5F, 10.8F, -4F, 1, 1, 1, 0F,0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.8F, .4F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, 0F, -.8F, .4F); // Box 83
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 10.8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.1F, -.8F, 0F, 0F, -.8F, .4F, 0F, -.8F, .4F, -.1F, -.8F, 0F); // Box 84
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3.5F, 8.1F, -3F, 1, 1, 1, 0F,0F, -.8F, .4F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, 0F, -.8F, .4F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 85
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.5F, 8.1F, -3F, 1, 1, 1, 0F,-.1F, -.8F, 0F, 0F, -.8F, .4F, 0F, -.8F, .4F, -.1F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 86
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.5F, 8.6F, -3F, 1, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F); // Box 87
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 8.6F, -3F, 1, 3, 1, 0F,0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F); // Box 88
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3.5F, 11.1F, -3F, 1, 1, 1, 0F,0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.8F, .4F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, 0F, -.8F, .4F); // Box 89
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.5F, 11.1F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.1F, -.8F, 0F, 0F, -.8F, .4F, 0F, -.8F, .4F, -.1F, -.8F, 0F); // Box 90
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3F, 7.8F, -4F, 1, 1, 1, 0F,-.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 91
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 8.1F, -3F, 1, 1, 1, 0F,-.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 92
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2.2F, 8.9F, 2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -.5F, .2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, .2F, -.5F, .2F, .2F, -.5F); // Box 93
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(2.2F, 8.9F, 3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F); // Box 94
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.2F, 9.9F, 3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, -.3F, -.8F, 0F, -.3F, -.8F, 0F, -.3F, -.8F, -.9F, -.3F, -.8F, -.9F); // Box 96
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(2.2F, 10.1F, 3F, 2, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.9F, -.3F, 0F, -.9F, -.9F, -.8F, 0F, -.9F, -.8F, 0F, -.9F, -.8F, -.9F, -.9F, -.8F, -.9F); // Box 97
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(2.2F, 8.9F, 2F, 2, 4, 1, 0F,.2F, 0F, -.5F, .2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, .2F, -.5F, .2F, .2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(2.4F, 0.5F, -3.8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(2.4F, 0.5F, -4.8F, 1, 1, 1, 0F,0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.9F, 0F, -.4F, -.9F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Box 127
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(2.4F, 1.1F, -4.8F, 1, 1, 1, 0F,0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.8F, -.9F, -.2F, -.8F, -.9F, -.2F, -.8F, 0F, -.2F, -.8F, 0F); // Box 128
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(2.4F, 1.2F, -4.8F, 1, 1, 1, 0F,-.4F, 0F, -.95F, -.4F, 0F, -.95F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.7F, -.95F, -.4F, -.7F, -.95F, -.4F, -.7F, 0F, -.4F, -.7F, 0F); // Box 129
		bodyModel[55].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 101, 17, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 101, 29, textureX, textureY); // Box 7
		leftArmModel[2] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 8
		leftArmModel[3] = new ModelRendererTurbo(this, 112, 50, textureX, textureY); // Box 9
		leftArmModel[4] = new ModelRendererTurbo(this, 101, 41, textureX, textureY); // Box 11
		leftArmModel[5] = new ModelRendererTurbo(this, 101, 54, textureX, textureY); // Box 12
		leftArmModel[6] = new ModelRendererTurbo(this, 101, 49, textureX, textureY); // Box 13
		leftArmModel[7] = new ModelRendererTurbo(this, 101, 58, textureX, textureY); // Box 17
		leftArmModel[8] = new ModelRendererTurbo(this, 101, 62, textureX, textureY); // Box 18
		leftArmModel[9] = new ModelRendererTurbo(this, 101, 66, textureX, textureY); // Box 19
		leftArmModel[10] = new ModelRendererTurbo(this, 156, 155, textureX, textureY); // Box 20

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,.3F, .3F, .3F, .3F, .2F, .3F, .3F, .2F, .3F, .3F, .3F, .3F, .3F, 0F, .2F, .5F, 0F, .2F, .5F, 0F, .5F, .3F, 0F, .5F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3F, -2F, 4, 5, 4, 0F,.3F, 0F, .2F, .5F, 0F, .2F, .5F, 0F, .5F, .3F, 0F, .5F, .3F, -.3F, .3F, .3F, -.3F, .3F, .3F, -.25F, .3F, .3F, -.25F, .3F); // Box 7
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.5F, 3F, 2F, 3, 5, 1, 0F,.4F, 0F, 0F, .4F, 0F, 0F, -.01F, 0F, -.3F, -.01F, 0F, -.3F, .3F, 0F, 0F, .3F, 0F, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F); // Box 8
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.5F, -1F, 2F, 3, 4, 1, 0F,.3F, .3F, 0F, .3F, .3F, 0F, -.3F, -.1F, -.5F, -.3F, -.1F, -.5F, .4F, 0F, 0F, .4F, 0F, 0F, -.01F, 0F, -.3F, -.01F, 0F, -.3F); // Box 9
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .1F, .2F, .2F, .1F, .2F, .2F, .1F, .2F, .2F, .1F, .2F); // Box 11
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(1F, 10F, -2.1F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.65F, .1F, .2F, -.65F, .1F, .2F, -.65F, .1F, .2F, -.65F, .1F); // Box 12
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 10F, -2F, 1, 1, 2, 0F,.2F, -.1F, .2F, .2F, -.1F, .2F, .2F, -.1F, .2F, .2F, -.1F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F); // Box 13
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(1F, 10F, -1F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.55F, .1F, .2F, -.55F, .1F, .2F, -.55F, .1F, .2F, -.55F, .1F); // Box 17
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(1F, 10F, 0F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F); // Box 18
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(1F, 10F, 1.1F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.7F, .1F, .2F, -.7F, .1F, .2F, -.7F, .1F, .2F, -.7F, .1F); // Box 19
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(3.51F, -22F, -22.5F, 0, 45, 45, 0F,.1F, -21F, -21F, -.1F, -21F, -21F, -.1F, -21F, -21F, .1F, -21F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, -21F, -21F); // Box 20
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 112, 50, textureX, textureY); // Box 21
		rightArmModel[1] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 22
		rightArmModel[2] = new ModelRendererTurbo(this, 101, 29, textureX, textureY); // Box 23
		rightArmModel[3] = new ModelRendererTurbo(this, 101, 17, textureX, textureY); // Box 24
		rightArmModel[4] = new ModelRendererTurbo(this, 156, 155, textureX, textureY); // Box 25
		rightArmModel[5] = new ModelRendererTurbo(this, 101, 41, textureX, textureY); // Box 26
		rightArmModel[6] = new ModelRendererTurbo(this, 101, 66, textureX, textureY); // Box 27
		rightArmModel[7] = new ModelRendererTurbo(this, 101, 62, textureX, textureY); // Box 28
		rightArmModel[8] = new ModelRendererTurbo(this, 101, 58, textureX, textureY); // Box 29
		rightArmModel[9] = new ModelRendererTurbo(this, 101, 54, textureX, textureY); // Box 30
		rightArmModel[10] = new ModelRendererTurbo(this, 101, 49, textureX, textureY); // Box 31

		rightArmModel[0].addShapeBox(-2.5F, -1F, 2F, 3, 4, 1, 0F,.3F, .3F, 0F, .3F, .3F, 0F, -.3F, -.1F, -.5F, -.3F, -.1F, -.5F, .4F, 0F, 0F, .4F, 0F, 0F, -.01F, 0F, -.3F, -.01F, 0F, -.3F); // Box 21
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2.5F, 3F, 2F, 3, 5, 1, 0F,.4F, 0F, 0F, .4F, 0F, 0F, -.01F, 0F, -.3F, -.01F, 0F, -.3F, .3F, 0F, 0F, .3F, 0F, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F); // Box 22
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 3F, -2F, 4, 5, 4, 0F,.5F, 0F, .2F, .3F, 0F, .2F, .3F, 0F, .5F, .5F, 0F, .5F, .3F, -.3F, .3F, .3F, -.3F, .3F, .3F, -.25F, .3F, .3F, -.25F, .3F); // Box 23
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,.3F, .3F, .3F, .3F, .2F, .3F, .3F, .2F, .3F, .3F, .3F, .3F, .5F, 0F, .2F, .3F, 0F, .2F, .3F, 0F, .5F, .5F, 0F, .5F); // Box 24
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.51F, -22F, -22.5F, 0, 45, 45, 0F,-.1F, -21F, -21F, .1F, -21F, -21F, .1F, -21F, -21F, -.1F, -21F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, -21F, -21F); // Box 25
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,.2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .1F, .2F, .2F, .1F, .2F, .2F, .1F, .2F, .2F, .1F, .2F); // Box 26
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 10F, 1.1F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.7F, .1F, .2F, -.7F, .1F, .2F, -.7F, .1F, .2F, -.7F, .1F); // Box 27
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 10F, 0F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F); // Box 28
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 10F, -1F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.55F, .1F, .2F, -.55F, .1F, .2F, -.55F, .1F, .2F, -.55F, .1F); // Box 29
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 10F, -2.1F, 2, 1, 1, 0F,.2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.1F, .1F, .2F, -.65F, .1F, .2F, -.65F, .1F, .2F, -.65F, .1F, .2F, -.65F, .1F); // Box 30
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(0F, 10F, -2F, 1, 1, 2, 0F,.2F, -.1F, .2F, .2F, -.1F, .2F, .2F, -.1F, .2F, .2F, -.1F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F); // Box 31
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 101, 73, textureX, textureY); // Box 5
		leftLegModel[1] = new ModelRendererTurbo(this, 101, 84, textureX, textureY); // Box 100
		leftLegModel[2] = new ModelRendererTurbo(this, 101, 93, textureX, textureY); // Box 101
		leftLegModel[3] = new ModelRendererTurbo(this, 101, 102, textureX, textureY); // Box 102

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,.1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .4F, .4F, 0F, .4F, .4F, 0F, .1F, .1F, 0F, .1F); // Box 5
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 3, 4, 0F,.1F, 0F, .4F, .4F, 0F, .4F, .4F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F, .2F); // Box 100
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 8F, -2F, 4, 2, 4, 0F,.3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 101
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 102
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 101, 73, textureX, textureY); // Box 105
		rightLegModel[1] = new ModelRendererTurbo(this, 101, 84, textureX, textureY); // Box 106
		rightLegModel[2] = new ModelRendererTurbo(this, 101, 93, textureX, textureY); // Box 107
		rightLegModel[3] = new ModelRendererTurbo(this, 101, 102, textureX, textureY); // Box 108

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,.2F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F, .4F, 0F, .4F, .1F, 0F, .4F, .1F, 0F, .1F, .4F, 0F, .1F); // Box 105
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 3, 4, 0F,.4F, 0F, .4F, .1F, 0F, .4F, .1F, 0F, .1F, .4F, 0F, .1F, .2F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F); // Box 106
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 8F, -2F, 4, 2, 4, 0F,.3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 107
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 108
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}