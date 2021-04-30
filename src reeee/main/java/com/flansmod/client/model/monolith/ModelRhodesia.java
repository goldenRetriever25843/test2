//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRhodesia extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRhodesia() //Same as Filename
	{
		headModel = new ModelRendererTurbo[4];
		bodyModel = new ModelRendererTurbo[77];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
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
		headModel[0] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 6
		headModel[1] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 91
		headModel[2] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 92
		headModel[3] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 93

		headModel[0].addShapeBox(-4F, -8.5F, -4F, 8, 1, 8, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 6
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7.5F, -4F, 8, 2, 8, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 91
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5.5F, -5F, 10, 1, 10, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 92
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, -4F, 8, 1, 8, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 93
		headModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 35
		bodyModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 37
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 1
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		bodyModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 45
		bodyModel[25] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 46
		bodyModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 47
		bodyModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 48
		bodyModel[28] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 50
		bodyModel[29] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 52
		bodyModel[30] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 9
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 10
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 12
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 1
		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 3
		bodyModel[38] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 5
		bodyModel[40] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 6
		bodyModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7
		bodyModel[42] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 8
		bodyModel[43] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 9
		bodyModel[44] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 10
		bodyModel[45] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 11
		bodyModel[46] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 12
		bodyModel[47] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 90
		bodyModel[49] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 91
		bodyModel[50] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 92
		bodyModel[51] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 105
		bodyModel[52] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 106
		bodyModel[53] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 107
		bodyModel[54] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 108
		bodyModel[55] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 109
		bodyModel[56] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 110
		bodyModel[57] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 104
		bodyModel[61] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 105
		bodyModel[62] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 106
		bodyModel[63] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 107
		bodyModel[64] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 108
		bodyModel[65] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 109
		bodyModel[66] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 110
		bodyModel[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 119
		bodyModel[68] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 120
		bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 121
		bodyModel[70] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 122
		bodyModel[71] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 123
		bodyModel[72] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 124
		bodyModel[73] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 64
		bodyModel[74] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 66
		bodyModel[75] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 69
		bodyModel[76] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 70

		bodyModel[0].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 2.9F, -2F, 8, 9, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.9F, 8.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-3.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 34
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(0.9F, 8.5F, -2.2F, 3, 1, 1, 0F); // Box 35
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(0.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 37
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, 2.4F, -2.15F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, -0.1F, -2F, 4, 3, 4, 0F,0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 1
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 3, 1, 0F,-2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, -0.1F, -2F, 4, 3, 4, 0F,-2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 7.3F, -2.4F, 4, 1, 5, 0F,0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Box 26
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addBox(-3.5F, 2.8F, -2.4F, 1, 5, 1, 0F); // Box 28
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addBox(2.5F, 2.8F, -2.4F, 1, 5, 1, 0F); // Box 29
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1F, 7.35F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 37
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, -0.2F, 0.4F, 2, 1, 2, 0F,0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.5F, -0.2F, -2.4F, 1, 1, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.6F, 0.4F, 0.5F, -0.6F); // Box 1
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 7.35F, -2.45F, 1, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 3
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0F, 7.3F, -2.4F, 4, 1, 5, 0F,0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.2F, 0F, 0.3F, -0.2F); // Box 4
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.5F, 7.3F, -2.95F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 6
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(1.5F, -0.2F, 0.4F, 2, 1, 2, 0F,-0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F); // Box 44
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 1.8F, -2.4F, 1, 1, 3, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.6F); // Box 45
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3F, 0.8F, 0.4F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 46
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.7F, 2.3F, 1.4F, 2, 5, 1, 0F,-1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -0.7F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.7F, -0.4F, 0F); // Box 47
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0.7F, 2.3F, 1.4F, 2, 5, 1, 0F,0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 48
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3.2F, 7F, 2F, 3, 3, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 50
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0.2F, 7F, 2F, 3, 3, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 52
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.5F, -0.2F, -2.4F, 1, 1, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.6F, 0.4F, 0.5F, -0.6F); // Box 9
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2.5F, 1.8F, -2.4F, 1, 1, 3, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.6F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.6F); // Box 10
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.5F, 0.8F, -2.4F, 1, 1, 3, 0F,0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, -0.6F, 0.4F, -0.5F, -0.6F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.6F); // Box 11
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.5F, 0.8F, -2.4F, 1, 1, 3, 0F,0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, -0.6F, 0.4F, -0.5F, -0.6F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.6F, 0.15F, 0F, -0.6F); // Box 12
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.2F, 6.6F, 2F, 3, 1, 2, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.2F, 6.6F, 2F, 3, 1, 2, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.2F, 6.7F, 3.15F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 2
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.2F, 6.7F, 3.15F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 3
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.6F, 7F, 2.2F, 1, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 4
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4.6F, 6.8F, 2.2F, 1, 1, 1, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 5
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.6F, 6.9F, 2.35F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 6
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3.6F, 6.8F, 2.2F, 1, 1, 1, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 7
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3.6F, 7F, 2.2F, 1, 3, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 8
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3.6F, 6.9F, 2.35F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 9
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.5F, 11.3F, 2F, 7, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3.5F, 10.3F, 2F, 7, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 11
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.5F, 10.95F, 2F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 12
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 4.5F, -2.5F, 8, 3, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 87
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.95F, 5.5F, -3.6F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 90
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2F, 5.5F, -3.6F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 91
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0F, 5.5F, -3.6F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 92
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.95F, 4.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 105
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0F, 4.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 106
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2F, 4.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 107
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(0.45F, 5.1F, -4.15F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 108
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-3.4F, 5.1F, -4.15F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 109
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-1.5F, 5.1F, -4.15F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 110
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4F, 5.5F, -1.7F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-3F, 0F, -2.5F, 1, 6, 5, 0F,-0.05F, 0.15F, -0.05F, -0.05F, 0.15F, -0.05F, -0.05F, 0.15F, -0.25F, -0.05F, 0.15F, -0.25F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 60
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(2.2F, 0F, -2.5F, 1, 6, 5, 0F,-0.05F, 0.15F, -0.05F, -0.05F, 0.15F, -0.05F, -0.05F, 0.15F, -0.25F, -0.05F, 0.15F, -0.25F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 61
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(1.95F, 5.5F, -3.6F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 104
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(2.4F, 5.1F, -4.15F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 105
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(1.95F, 4.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 106
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-3.95F, 5.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F); // Box 107
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-2F, 5.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F); // Box 108
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0F, 5.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F); // Box 109
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(1.95F, 5.5F, -3.6F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F, -1F, -0.25F, 0.1F); // Box 110
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-2.5F, 8.75F, -3.4F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 119
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-2.5F, 8.75F, -3.4F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F); // Box 120
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-2.5F, 7.75F, -3.4F, 2, 1, 2, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 121
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(1F, 7.75F, -3.4F, 2, 1, 2, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 122
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(1F, 8.75F, -3.4F, 2, 1, 1, 0F,-0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F); // Box 123
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(1F, 8.75F, -3.4F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 124
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-4.3F, 8.45F, -3.3F, 2, 2, 1, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 64
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4.3F, 7.85F, -3.3F, 2, 1, 1, 0F,-0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 66
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-4.3F, 7.55F, -3.5F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Box 69
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-4.3F, 7.3F, -3.5F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Box 70
		bodyModel[76].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2.9F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.9F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 8F, -2.4F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 8F, -2.4F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}