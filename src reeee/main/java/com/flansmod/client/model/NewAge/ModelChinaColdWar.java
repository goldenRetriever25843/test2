//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChinaColdWar extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelChinaColdWar() //Same as Filename
	{
		headModel = new ModelRendererTurbo[5];
		bodyModel = new ModelRendererTurbo[70];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		headModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 11
		headModel[3] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 58
		headModel[4] = new ModelRendererTurbo(this, 2, 65, textureX, textureY); // Box 144

		headModel[0].addShapeBox(-4F, -5.25F, -6F, 8, 1, 2, 0F,-0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0.15F, -0.8F, 0F, 0.15F, -0.8F, 0F); // Box 7
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8.8F, -4F, 8, 1, 8, 0F,-1F, -0.2F, -1F, -1F, -0.2F, -1F, -1F, -0.2F, -1F, -1F, -0.2F, -1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F); // Box 11
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7.75F, -4F, 8, 2, 8, 0F,0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 58
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -7.5F, -4.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		headModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 35
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 87
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 88
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 89
		bodyModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 90
		bodyModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 105
		bodyModel[13] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 109
		bodyModel[14] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 60
		bodyModel[15] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 61
		bodyModel[16] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 78
		bodyModel[17] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 79
		bodyModel[18] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 80
		bodyModel[19] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 81
		bodyModel[20] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 82
		bodyModel[21] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 83
		bodyModel[22] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 84
		bodyModel[23] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 85
		bodyModel[24] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 86
		bodyModel[25] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 88
		bodyModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 89
		bodyModel[28] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 98
		bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 99
		bodyModel[30] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 105
		bodyModel[31] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 106
		bodyModel[32] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 65
		bodyModel[34] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 66
		bodyModel[35] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 67
		bodyModel[36] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 68
		bodyModel[37] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 69
		bodyModel[38] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 70
		bodyModel[39] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 11
		bodyModel[41] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 12
		bodyModel[42] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 130
		bodyModel[43] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 131
		bodyModel[44] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 132
		bodyModel[45] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 133
		bodyModel[46] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 39
		bodyModel[47] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
		bodyModel[49] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 34
		bodyModel[50] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 12
		bodyModel[51] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 13
		bodyModel[52] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 121
		bodyModel[53] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 129
		bodyModel[54] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 130
		bodyModel[55] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 131
		bodyModel[56] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 132
		bodyModel[57] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 133
		bodyModel[58] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 134
		bodyModel[59] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 135
		bodyModel[60] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 136
		bodyModel[61] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 137
		bodyModel[62] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 138
		bodyModel[63] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 139
		bodyModel[64] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 140
		bodyModel[65] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 141
		bodyModel[66] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 142
		bodyModel[67] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 143
		bodyModel[68] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 103
		bodyModel[69] = new ModelRendererTurbo(this, 84, 82, textureX, textureY); // Box 104

		bodyModel[0].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.9F, 8.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-3.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 34
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(0.9F, 8.5F, -2.2F, 3, 1, 1, 0F); // Box 35
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(0.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 37
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 3.4F, -2.5F, 6, 5, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.55F, 3.4F, -2.4F, 1, 5, 5, 0F,-0.4F, -1.15F, 0F, -0.4F, -1.15F, 0F, -0.4F, -3.2F, -0.35F, -0.4F, -3.2F, -0.35F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -1F, -0.35F, -0.4F, -1F, -0.35F); // Box 88
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(3.55F, 3.4F, -2.4F, 1, 5, 5, 0F,-0.4F, -1.15F, 0F, -0.4F, -1.15F, 0F, -0.4F, -3.2F, -0.4F, -0.4F, -3.2F, -0.4F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -1F, -0.4F, -0.4F, -1F, -0.4F); // Box 89
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.75F, 4.3F, -3.6F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 90
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2.75F, 3.9F, -3.6F, 2, 1, 1, 0F,-0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F); // Box 105
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2.2F, 4.5F, -4.15F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 109
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3F, -0.1F, -2.5F, 1, 5, 1, 0F,-0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.25F, -0.2F, 0.2F, -0.25F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 60
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(2F, -0.1F, -2.5F, 1, 5, 1, 0F,-0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, 0F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 61
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.75F, 5.3F, -3.6F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 78
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.55F, 7.3F, -3.6F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, 0F, 0F); // Box 79
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1F, 3.9F, -3.6F, 2, 1, 1, 0F,-0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F); // Box 80
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1F, 4.3F, -3.6F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 81
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 5.3F, -3.6F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 82
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.8F, 7.3F, -3.6F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, 0F, 0F); // Box 83
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.45F, 4.5F, -4.15F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 84
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.75F, 3.9F, -3.6F, 2, 1, 1, 0F,-0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F); // Box 85
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.75F, 4.3F, -3.6F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 86
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.75F, 5.3F, -3.6F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 87
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.95F, 7.3F, -3.6F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, 0F, 0F); // Box 88
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.3F, 4.5F, -4.15F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 89
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, -0.3F, -2F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 98
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2.2F, -0.3F, -2F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 99
		bodyModel[29].setRotationPoint(-0.2F, 0F, 0F);

		bodyModel[30].addShapeBox(-3F, -0.3F, 1.5F, 7, 7, 1, 0F,-0.2F, 0F, -0.3F, -6.2F, 0F, -0.3F, -6.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -6.95F, 0.7F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -6.95F, 0.7F, -0.3F); // Box 105
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, -0.3F, 1.55F, 7, 7, 1, 0F,-6.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -6.2F, 0F, -0.3F, -0.05F, -0.1F, -0.3F, -6.95F, 0.7F, -0.3F, -6.95F, 0.7F, -0.3F, -0.05F, -0.1F, -0.3F); // Box 106
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.8F, 8.15F, 2.05F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 64
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.8F, 7.25F, 2.05F, 2, 1, 1, 0F,-0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.8F, 7F, 2.05F, 2, 1, 1, 0F,-0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 66
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.8F, 8.6F, 2.05F, 2, 1, 1, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 67
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.8F, 9.3F, 2.05F, 2, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 68
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.8F, 6.7F, 2.15F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Box 69
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1.8F, 6.45F, 2.15F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Box 70
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-0.5F, 1F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 4
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, -2.2F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 0F, -2.2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F); // Box 12
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-0.5F, 2.5F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 130
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-0.5F, 4.25F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 131
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-0.5F, 6F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 132
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-0.5F, 8F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 133
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-0.5F, 1F, -2.15F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 39
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, -0.1F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, -1.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 1
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 0.9F, -2F, 8, 11, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(0F, -0.1F, -2F, 4, 1, 4, 0F,-1.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 34
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4.3F, 8.8F, -2.55F, 9, 1, 5, 0F,-0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Box 12
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-0.95F, 8.8F, -2.6F, 2, 1, 3, 0F,-0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F); // Box 13
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-4F, 0.05F, -2.55F, 8, 10, 5, 0F,0F, 0.2F, -0.3F, -7.5F, 0.2F, -0.3F, -7.5F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -8F, -0.2F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, -8F, -0.2F, -0.3F); // Box 121
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-5.8F, 10.1F, -2F, 2, 4, 4, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 129
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-5.65F, 11F, -2F, 2, 1, 4, 0F,0F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.6F, 0.3F, -0.35F, -1F, 0.3F, -0.35F, -1F, 0.3F, 0F, -0.6F, 0.3F); // Box 130
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-5.65F, 10F, -2F, 2, 1, 4, 0F,0F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 131
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-5.85F, 10.2F, -1.5F, 2, 4, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 132
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-5.7F, 11F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 133
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-5.75F, 11.5F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F); // Box 134
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-4F, 0F, -2.54F, 8, 11, 5, 0F,-7F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -7F, 0.2F, -0.3F, 0F, -1F, -0.3F, -8F, 0F, -0.3F, -8F, 0F, -0.3F, 0F, -1F, -0.3F); // Box 135
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4.3F, 6F, -3.4F, 2, 1, 2, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 136
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4.3F, 5.1F, -3.4F, 2, 1, 1, 0F,-0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 137
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-3.75F, 5.7F, -3.95F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 138
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(2.3F, 6F, -3.4F, 2, 1, 2, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 139
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(2.3F, 5.1F, -3.4F, 2, 1, 1, 0F,-0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 140
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(2.85F, 5.7F, -3.95F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 141
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4F, 3.4F, -2.5F, 1, 5, 1, 0F,0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.15F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 142
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(3F, 3.4F, -2.5F, 1, 5, 1, 0F,0F, -0.4F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(1.8F, 8.15F, 2.08F, 2, 1, 1, 0F,0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F); // Box 103
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(2.3F, 7.15F, 2.08F, 1, 3, 1, 0F,-0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F, -0.35F, -0.12F, 0F); // Box 104
		bodyModel[69].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 49
		leftArmModel[2] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 48
		rightArmModel[2] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}