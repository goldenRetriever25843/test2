//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.03.2016 - 22:22:54
// Last changed on: 06.03.2016 - 22:22:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPapaArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPapaArmor() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];
		bodyModel = new ModelRendererTurbo[61];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[13];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 229, 287, textureX, textureY); // Box 4
		headModel[1] = new ModelRendererTurbo(this, 64, 373, textureX, textureY); // Box 11
		headModel[2] = new ModelRendererTurbo(this, 74, 397, textureX, textureY); // Box 79
		headModel[3] = new ModelRendererTurbo(this, 74, 397, textureX, textureY); // Box 108
		headModel[4] = new ModelRendererTurbo(this, 266, 289, textureX, textureY); // Box 107
		headModel[5] = new ModelRendererTurbo(this, 201, 287, textureX, textureY); // Box 108
		headModel[6] = new ModelRendererTurbo(this, 115, 365, textureX, textureY); // Box 106
		headModel[7] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 107
		headModel[8] = new ModelRendererTurbo(this, 229, 287, textureX, textureY); // Box 108
		headModel[9] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 108
		headModel[10] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 110
		headModel[11] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 112
		headModel[12] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 113
		headModel[13] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 114
		headModel[14] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 116
		headModel[15] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 119
		headModel[16] = new ModelRendererTurbo(this, 259, 291, textureX, textureY); // Box 113

		headModel[0].addShapeBox(-4F, -5.7F, -4F, 8, 1, 8, 0F,0.65F, 0.35F, 0.5F, 0.65F, 0.35F, 0.5F, 0.65F, 0.35F, 0.5F, 0.65F, 0.35F, 0.5F, 0.85F, 0.25F, 0.8F, 0.85F, 0.25F, 0.8F, 0.85F, 0.85F, 0.7F, 0.85F, 0.85F, 0.7F); // Box 4
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1F, -6.1F, -5F, 2, 1, 1, 0F,-0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F); // Box 11
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -5.99F, -1F, 9, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.6F, -0.5F, 0F, -3.6F); // Box 79
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -5.99F, -1F, 9, 6, 1, 0F,-0.5F, -2F, -0.8F, -0.5F, -2F, -0.8F, -0.5F, -2F, 0.4F, -0.5F, -2F, 0.4F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.6F, -0.5F, 0F, -3.6F); // Box 108
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.3F, -4F, 8, 1, 8, 0F,0.5F, 0.15F, 0.2F, 0.5F, 0.15F, 0.2F, 0.5F, 0.15F, 0.25F, 0.5F, 0.15F, 0.25F, 0.65F, 0.25F, 0.5F, 0.65F, 0.25F, 0.5F, 0.65F, 0.25F, 0.5F, 0.65F, 0.25F, 0.5F); // Box 107
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -7.97F, -4F, 8, 1, 8, 0F,-0.15F, 0.15F, -0.15F, -0.15F, 0.15F, -0.15F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.55F, -0.35F, 0.3F, 0.55F, -0.35F, 0.3F); // Box 108
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -5.7F, -4F, 8, 1, 8, 0F,0.8F, 0F, 0.6F, 0.8F, 0F, 0.6F, 0.8F, -0.5F, 0.65F, 0.8F, -0.5F, 0.65F, 0.8F, -0.7F, 0.65F, 0.8F, -0.7F, 0.65F, 0.8F, -0.2F, 0.65F, 0.8F, -0.2F, 0.65F); // Box 106
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -2.7F, -4F, 6, 1, 8, 0F,0F, 1.85F, -1.4F, 0F, 1.85F, -1.4F, 1F, 1.15F, 0.7F, 1F, 1.15F, 0.7F, 0.9F, -0.15F, -3.6F, 0.9F, -0.15F, -3.6F, 1F, -0.7F, 0.65F, 1F, -0.7F, 0.65F); // Box 107
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -5.7F, -4F, 8, 1, 8, 0F,0.65F, -0.45F, 0.5F, 0.65F, -0.45F, 0.5F, 0.65F, 0.35F, 0.5F, 0.65F, 0.35F, 0.5F, 0.85F, 0.25F, 0.9F, 0.85F, 0.25F, 0.9F, 0.85F, 0.85F, 0.7F, 0.85F, 0.85F, 0.7F); // Box 108
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -2.7F, -4F, 0, 1, 8, 0F,0.85F, 1.55F, -2.7F, 0.05F, 1.55F, -2.7F, 0.05F, 1.15F, 0.7F, 0.85F, 1.15F, 0.7F, 0.85F, -0.15F, -4.7F, -0.05F, -0.15F, -4.7F, 0.05F, -0.7F, 0.65F, 0.75F, -0.7F, 0.65F); // Box 108
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -2.7F, -4F, 0, 1, 8, 0F,0.85F, 1.6F, -2.1F, 0.05F, 1.55F, -2.1F, 0.05F, 1.15F, 0.7F, 0.85F, 1.15F, 0.7F, 0.85F, -1.45F, -3.65F, -0.05F, -1.45F, -3.65F, 0.05F, -0.7F, 0.55F, 0.75F, -0.7F, 0.55F); // Box 110
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -2.7F, -4F, 0, 1, 8, 0F,0.85F, 1.6F, -1.5F, 0.05F, 1.6F, -1.5F, 0.05F, 1.15F, 0.7F, 0.85F, 1.15F, 0.7F, 0.85F, -1.45F, -3.7F, -0.05F, -1.45F, -3.6F, 0.05F, -0.7F, 0.55F, 0.75F, -0.7F, 0.55F); // Box 112
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.55F, -2.7F, 0.85F, 1.55F, -2.7F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -0.15F, -4.7F, 0.85F, -0.15F, -4.7F, 0.75F, -0.7F, 0.65F, 0.05F, -0.7F, 0.65F); // Box 113
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.6F, -1.5F, 0.85F, 1.6F, -1.5F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -1.45F, -3.6F, 0.85F, -1.45F, -3.7F, 0.75F, -0.7F, 0.55F, 0.05F, -0.7F, 0.55F); // Box 114
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -2.7F, -4F, 0, 1, 8, 0F,0.85F, 1.6F, -2.1F, 0.05F, 1.55F, -2.1F, 0.05F, 1.15F, 0.7F, 0.85F, 1.15F, 0.7F, 0.85F, -1.45F, -3.6F, -0.05F, -1.45F, -3.6F, 0.05F, -0.7F, 0.55F, 0.75F, -0.7F, 0.55F); // Box 116
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.55F, -2.1F, 0.85F, 1.6F, -2.1F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -1.45F, -3.6F, 0.85F, -1.45F, -3.6F, 0.75F, -0.7F, 0.55F, 0.05F, -0.7F, 0.55F); // Box 119
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.55F, -2.1F, 0.85F, 1.6F, -2.1F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -1.45F, -3.65F, 0.85F, -1.45F, -3.65F, 0.75F, -0.7F, 0.55F, 0.05F, -0.7F, 0.55F); // Box 113
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 384, 242, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 462, 141, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 249, 133, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 451, 160, textureX, textureY); // Box 32
		bodyModel[4] = new ModelRendererTurbo(this, 450, 163, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 342, 261, textureX, textureY); // Box 37
		bodyModel[6] = new ModelRendererTurbo(this, 74, 347, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 76, 404, textureX, textureY); // Box 39
		bodyModel[8] = new ModelRendererTurbo(this, 67, 350, textureX, textureY); // Box 40
		bodyModel[9] = new ModelRendererTurbo(this, 159, 109, textureX, textureY); // Box 51
		bodyModel[10] = new ModelRendererTurbo(this, 501, 230, textureX, textureY); // Box 63
		bodyModel[11] = new ModelRendererTurbo(this, 501, 228, textureX, textureY); // Box 62
		bodyModel[12] = new ModelRendererTurbo(this, 481, 156, textureX, textureY); // Box 67
		bodyModel[13] = new ModelRendererTurbo(this, 500, 229, textureX, textureY); // Box 68
		bodyModel[14] = new ModelRendererTurbo(this, 499, 230, textureX, textureY); // Box 69
		bodyModel[15] = new ModelRendererTurbo(this, 476, 147, textureX, textureY); // Box 70
		bodyModel[16] = new ModelRendererTurbo(this, 458, 152, textureX, textureY); // Box 72
		bodyModel[17] = new ModelRendererTurbo(this, 460, 160, textureX, textureY); // Box 73
		bodyModel[18] = new ModelRendererTurbo(this, 467, 247, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 467, 246, textureX, textureY); // Box 80
		bodyModel[20] = new ModelRendererTurbo(this, 430, 243, textureX, textureY); // Box 88
		bodyModel[21] = new ModelRendererTurbo(this, 433, 245, textureX, textureY); // Box 90
		bodyModel[22] = new ModelRendererTurbo(this, 467, 246, textureX, textureY); // Box 91
		bodyModel[23] = new ModelRendererTurbo(this, 467, 246, textureX, textureY); // Box 93
		bodyModel[24] = new ModelRendererTurbo(this, 431, 245, textureX, textureY); // Box 94
		bodyModel[25] = new ModelRendererTurbo(this, 432, 245, textureX, textureY); // Box 95
		bodyModel[26] = new ModelRendererTurbo(this, 352, 273, textureX, textureY); // Box 100
		bodyModel[27] = new ModelRendererTurbo(this, 74, 357, textureX, textureY); // Box 114
		bodyModel[28] = new ModelRendererTurbo(this, 74, 357, textureX, textureY); // Box 115
		bodyModel[29] = new ModelRendererTurbo(this, 74, 357, textureX, textureY); // Box 116
		bodyModel[30] = new ModelRendererTurbo(this, 74, 357, textureX, textureY); // Box 117
		bodyModel[31] = new ModelRendererTurbo(this, 71, 357, textureX, textureY); // Box 118
		bodyModel[32] = new ModelRendererTurbo(this, 74, 357, textureX, textureY); // Box 119
		bodyModel[33] = new ModelRendererTurbo(this, 73, 357, textureX, textureY); // Box 120
		bodyModel[34] = new ModelRendererTurbo(this, 73, 357, textureX, textureY); // Box 121
		bodyModel[35] = new ModelRendererTurbo(this, 76, 358, textureX, textureY); // Box 123
		bodyModel[36] = new ModelRendererTurbo(this, 70, 374, textureX, textureY); // Box 93
		bodyModel[37] = new ModelRendererTurbo(this, 74, 375, textureX, textureY); // Box 94
		bodyModel[38] = new ModelRendererTurbo(this, 76, 375, textureX, textureY); // Box 95
		bodyModel[39] = new ModelRendererTurbo(this, 77, 375, textureX, textureY); // Box 97
		bodyModel[40] = new ModelRendererTurbo(this, 76, 375, textureX, textureY); // Box 98
		bodyModel[41] = new ModelRendererTurbo(this, 76, 375, textureX, textureY); // Box 99
		bodyModel[42] = new ModelRendererTurbo(this, 72, 357, textureX, textureY); // Box 100
		bodyModel[43] = new ModelRendererTurbo(this, 72, 358, textureX, textureY); // Box 101
		bodyModel[44] = new ModelRendererTurbo(this, 69, 375, textureX, textureY); // Box 102
		bodyModel[45] = new ModelRendererTurbo(this, 75, 375, textureX, textureY); // Box 103
		bodyModel[46] = new ModelRendererTurbo(this, 452, 159, textureX, textureY); // Box 104
		bodyModel[47] = new ModelRendererTurbo(this, 466, 155, textureX, textureY); // Box 105
		bodyModel[48] = new ModelRendererTurbo(this, 453, 157, textureX, textureY); // Box 106
		bodyModel[49] = new ModelRendererTurbo(this, 484, 148, textureX, textureY); // Box 107
		bodyModel[50] = new ModelRendererTurbo(this, 460, 149, textureX, textureY); // Box 108
		bodyModel[51] = new ModelRendererTurbo(this, 461, 145, textureX, textureY); // Box 109
		bodyModel[52] = new ModelRendererTurbo(this, 433, 244, textureX, textureY); // Box 111
		bodyModel[53] = new ModelRendererTurbo(this, 468, 246, textureX, textureY); // Box 112
		bodyModel[54] = new ModelRendererTurbo(this, 427, 245, textureX, textureY); // Box 113
		bodyModel[55] = new ModelRendererTurbo(this, 436, 246, textureX, textureY); // Box 114
		bodyModel[56] = new ModelRendererTurbo(this, 467, 247, textureX, textureY); // Box 115
		bodyModel[57] = new ModelRendererTurbo(this, 468, 246, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 462, 141, textureX, textureY); // Box 115
		bodyModel[59] = new ModelRendererTurbo(this, 462, 141, textureX, textureY); // Box 116
		bodyModel[60] = new ModelRendererTurbo(this, 481, 156, textureX, textureY); // Box 117

		bodyModel[0].addShapeBox(-4.5F, 10F, -2.45F, 9, 2, 5, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F); // Box 5
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 3F, -1.6F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0.5F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0.5F, 0.55F, 0F, 0F); // Box 8
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-4F, 0F, -1.8F, 8, 10, 4, 0F); // Box 19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 1.67F, -1.45F, 6, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 32
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.5F, 1.67F, -1.26F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 36
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-0.25F, 7.2F, -0.26F, 3, 2, 4, 0F); // Box 37
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-1.85F, 7.2F, -0.26F, 1, 2, 4, 0F); // Box 38
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(-2.92F, 7.2F, -0.26F, 1, 2, 4, 0F); // Box 39
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(-0.5F, 5F, -0.15F, 1, 2, 4, 0F); // Box 40
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
		bodyModel[8].rotateAngleX = 0.03490659F;

		bodyModel[9].addShapeBox(-4F, 0F, -2.25F, 8, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 51
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.45F, 0F, 1.5F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.45F, 0F, 1.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.4F, 1.03F, -3.1F, 2, 9, 2, 0F,0.35F, 0F, 0.3F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 67
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.45F, 0F, -2.6F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.45F, 0F, -2.6F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.5F, 3F, -2.6F, 2, 7, 4, 0F,-0.9F, 0F, 0.5F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0.5F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 1F, -2.6F, 2, 2, 2, 0F,0.55F, -1.65F, 0F, -0.9F, -1.15F, 0.5F, -0.15F, -0.1F, -2F, -0.9F, 0F, -1.1F, 0.55F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.15F, 0F); // Box 72
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.5F, 1F, -2.6F, 2, 2, 2, 0F,-0.9F, -1.15F, 0.5F, 0.55F, -1.65F, 0F, -1F, 0F, -1.1F, -1F, 0F, -2F, -0.9F, 0F, 0.5F, 0.55F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.05F, 9.03F, -3.6F, 2, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.15F, 9.03F, -3.6F, 2, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.05F, 9.03F, -3.6F, 2, 4, 2, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 88
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2.15F, 9.03F, -3.6F, 2, 4, 2, 0F,-0.15F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.15F, 0F, 0F); // Box 90
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-2F, 9.03F, -3.6F, 2, 1, 2, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 91
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
		bodyModel[22].rotateAngleX = -0.01745329F;

		bodyModel[23].addShapeBox(0F, 9.03F, -3.6F, 2, 1, 2, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 93
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
		bodyModel[23].rotateAngleX = -0.01745329F;

		bodyModel[24].addShapeBox(-2F, 9.03F, -3.6F, 2, 4, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 94
		bodyModel[24].setRotationPoint(0F, 0F, 0F);
		bodyModel[24].rotateAngleX = -0.01745329F;

		bodyModel[25].addShapeBox(0F, 9.03F, -3.6F, 2, 4, 2, 0F,-0.15F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F, -0.05F, 0F, -0.15F); // Box 95
		bodyModel[25].setRotationPoint(0F, 0F, 0F);
		bodyModel[25].rotateAngleX = -0.01745329F;

		bodyModel[26].addShapeBox(-2.38F, 1.75F, -3.15F, 2, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0.35F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.35F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2.38F, 4.25F, -3.15F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 114
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2.38F, 5.25F, -3.15F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 115
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.38F, 6.25F, -3.15F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 116
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2.38F, 7.25F, -3.15F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 117
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.4F, 4.25F, -3.15F, 2, 1, 1, 0F,0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 118
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.4F, 5.25F, -3.15F, 2, 1, 1, 0F,0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 119
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.4F, 6.25F, -3.15F, 2, 1, 1, 0F,0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 120
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.4F, 7.25F, -3.15F, 2, 1, 1, 0F,0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 121
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0.4F, 1.7F, -3.15F, 2, 1, 1, 0F,0.3F, -0.25F, 0.35F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.3F, -0.25F, 0.35F, -0.05F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 123
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.5F, 5F, -3.15F, 2, 1, 4, 0F,0.55F, -0.5F, -0.5F, -0.85F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3.5F, 6F, -3.15F, 2, 1, 4, 0F,0.55F, -0.5F, -0.5F, -0.85F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 7F, -3.15F, 2, 1, 4, 0F,0.55F, -0.5F, -0.5F, -0.85F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1.5F, 5F, -3.15F, 2, 1, 4, 0F,-0.85F, -0.5F, 0F, 0.55F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0.55F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(1.5F, 6F, -3.15F, 2, 1, 4, 0F,-0.85F, -0.5F, 0F, 0.55F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0.55F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(1.5F, 7F, -3.15F, 2, 1, 4, 0F,-0.85F, -0.5F, 0F, 0.55F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0.55F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2.38F, 3.25F, -3.15F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 100
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0.4F, 3.25F, -3.15F, 2, 1, 1, 0F,0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 101
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3.5F, 4F, -3.15F, 2, 1, 4, 0F,0.55F, -0.5F, -0.5F, -0.85F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, -0.5F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(1.5F, 4F, -3.15F, 2, 1, 4, 0F,-0.85F, -0.5F, 0F, 0.55F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0.55F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(1.5F, 3F, -1.6F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, -0.9F, 0F, 0.5F); // Box 104
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.5F, 3F, -2.6F, 2, 7, 4, 0F,0.55F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(0.4F, 1.03F, 0.9F, 2, 9, 2, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.35F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.35F); // Box 106
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2.4F, 1.03F, 0.9F, 2, 9, 2, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.35F, 0F, 0F, 0F); // Box 107
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(1.5F, 1F, 0.4F, 2, 2, 2, 0F,-1F, 0F, -2F, -1F, 0F, -1.1F, 0.55F, -1.65F, 0F, -0.9F, -1.15F, 0.5F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0.55F, 0F, 0F, -0.9F, 0F, 0.5F); // Box 108
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 1F, 0.4F, 2, 2, 2, 0F,-0.9F, 0F, -1.1F, -0.15F, -0.1F, -2F, -0.9F, -1.15F, 0.5F, 0.55F, -1.65F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0.5F, 0.55F, 0F, 0F); // Box 109
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-4.05F, 9.03F, 1.4F, 2, 4, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F); // Box 111
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2F, 9.03F, 1.8F, 2, 1, 2, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 112
		bodyModel[53].setRotationPoint(0F, 0F, 0F);
		bodyModel[53].rotateAngleX = -0.01745329F;

		bodyModel[54].addShapeBox(-2F, 9.03F, 1.8F, 2, 4, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 113
		bodyModel[54].setRotationPoint(0F, 0F, 0F);
		bodyModel[54].rotateAngleX = -0.01745329F;

		bodyModel[55].addShapeBox(0.5F, 9.03F, 1.8F, 3, 3, 2, 0F,-0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0.45F, -0.15F, -0.3F, 0.45F, -0.15F, -0.3F, 0.45F, -0.15F, -0.3F, 0.45F, -0.15F); // Box 114
		bodyModel[55].setRotationPoint(0F, 0F, 0F);
		bodyModel[55].rotateAngleX = -0.01745329F;

		bodyModel[56].addShapeBox(0.5F, 9.03F, 1.8F, 3, 1, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.35F, -0.15F, -0.15F, 0.35F, -0.15F, -0.15F, 0.35F, -0.15F, -0.15F, 0.35F, -0.15F); // Box 115
		bodyModel[56].setRotationPoint(0F, 0F, 0F);
		bodyModel[56].rotateAngleX = -0.01745329F;

		bodyModel[57].addShapeBox(-4F, 9.03F, 1.8F, 2, 1, 2, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F); // Box 114
		bodyModel[57].setRotationPoint(0F, 0F, 0F);
		bodyModel[57].rotateAngleX = -0.01745329F;

		bodyModel[58].addShapeBox(-4.1F, 3F, -2F, 2, 7, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 115
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(2.1F, 3F, -2F, 2, 7, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 116
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-2.4F, 1.03F, -3.1F, 2, 9, 2, 0F,0F, 0F, -0.05F, 0.45F, 0F, 0.3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0.35F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[60].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 190, 180, textureX, textureY); // Box 69
		leftArmModel[1] = new ModelRendererTurbo(this, 349, 262, textureX, textureY); // Box 63
		leftArmModel[2] = new ModelRendererTurbo(this, 68, 360, textureX, textureY); // Box 64
		leftArmModel[3] = new ModelRendererTurbo(this, 190, 185, textureX, textureY); // Box 95
		leftArmModel[4] = new ModelRendererTurbo(this, 358, 113, textureX, textureY); // Box 101
		leftArmModel[5] = new ModelRendererTurbo(this, 65, 387, textureX, textureY); // Box 104
		leftArmModel[6] = new ModelRendererTurbo(this, 68, 376, textureX, textureY); // Box 105

		leftArmModel[0].addShapeBox(-1F, -2.01F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 69
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addBox(2.2F, -1F, -1.45F, 1, 2, 3, 0F); // Box 63
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addBox(2.2F, 1.2F, -1.45F, 1, 1, 3, 0F); // Box 64
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 2.99F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 95
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 6.99F, -2F, 4, 1, 4, 0F,0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F); // Box 101
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 8.85F, -2F, 4, 1, 4, 0F,0.02F, 0.5F, 0.1F, 0.02F, 0.5F, 0.1F, 0.02F, 0.5F, 0.1F, 0.02F, 0.5F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F); // Box 104
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1F, 8.35F, -2F, 2, 1, 4, 0F,0.02F, 0.2F, 0.1F, 0.07F, 0.2F, 0.1F, 0.07F, 0.2F, 0.1F, 0.02F, 0.2F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F); // Box 105
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 170, 24, textureX, textureY); // Box 68
		rightArmModel[1] = new ModelRendererTurbo(this, 353, 262, textureX, textureY); // Box 61
		rightArmModel[2] = new ModelRendererTurbo(this, 83, 359, textureX, textureY); // Box 62
		rightArmModel[3] = new ModelRendererTurbo(this, 157, 32, textureX, textureY); // Box 94
		rightArmModel[4] = new ModelRendererTurbo(this, 358, 113, textureX, textureY); // Box 100
		rightArmModel[5] = new ModelRendererTurbo(this, 65, 387, textureX, textureY); // Box 121
		rightArmModel[6] = new ModelRendererTurbo(this, 68, 376, textureX, textureY); // Box 122

		rightArmModel[0].addShapeBox(-3F, -2.01F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addBox(-3.01F, -1F, -1.45F, 1, 2, 3, 0F); // Box 61
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addBox(-3.01F, 1.2F, -1.45F, 1, 1, 3, 0F); // Box 62
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 2.99F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 94
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 6.99F, -2F, 4, 1, 4, 0F,0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F); // Box 100
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 8.85F, -2F, 4, 1, 4, 0F,0.02F, 0.5F, 0.1F, 0.02F, 0.5F, 0.1F, 0.02F, 0.5F, 0.1F, 0.02F, 0.5F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F); // Box 121
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 8.35F, -2F, 2, 1, 4, 0F,0.07F, 0.2F, 0.1F, 0.02F, 0.2F, 0.1F, 0.02F, 0.2F, 0.1F, 0.07F, 0.2F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F, 0.02F, 0F, 0.1F); // Box 122
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 502, 235, textureX, textureY); // Box 65
		leftLegModel[1] = new ModelRendererTurbo(this, 54, 347, textureX, textureY); // Box 81
		leftLegModel[2] = new ModelRendererTurbo(this, 358, 113, textureX, textureY); // Box 88
		leftLegModel[3] = new ModelRendererTurbo(this, 93, 387, textureX, textureY); // Box 92
		leftLegModel[4] = new ModelRendererTurbo(this, 92, 388, textureX, textureY); // Box 93
		leftLegModel[5] = new ModelRendererTurbo(this, 236, 173, textureX, textureY); // Box 98
		leftLegModel[6] = new ModelRendererTurbo(this, 226, 170, textureX, textureY); // Box 82

		leftLegModel[0].addShapeBox(-1F, 4F, -2.4F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F); // Box 65
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 8F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 81
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 8F, -2F, 4, 1, 4, 0F,0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F); // Box 88
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 4F, -2F, 4, 1, 4, 0F,0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F); // Box 92
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.95F, 5F, -2F, 4, 1, 4, 0F,0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F); // Box 93
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 5F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 98
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 82
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 235, 171, textureX, textureY); // Box 43
		rightLegModel[1] = new ModelRendererTurbo(this, 502, 235, textureX, textureY); // Box 67
		rightLegModel[2] = new ModelRendererTurbo(this, 52, 353, textureX, textureY); // Box 74
		rightLegModel[3] = new ModelRendererTurbo(this, 358, 113, textureX, textureY); // Box 87
		rightLegModel[4] = new ModelRendererTurbo(this, 93, 390, textureX, textureY); // Box 89
		rightLegModel[5] = new ModelRendererTurbo(this, 93, 380, textureX, textureY); // Box 91
		rightLegModel[6] = new ModelRendererTurbo(this, 235, 171, textureX, textureY); // Box 96
		rightLegModel[7] = new ModelRendererTurbo(this, 79, 345, textureX, textureY); // Box 83
		rightLegModel[8] = new ModelRendererTurbo(this, 79, 345, textureX, textureY); // Box 84
		rightLegModel[9] = new ModelRendererTurbo(this, 77, 359, textureX, textureY); // Box 116
		rightLegModel[10] = new ModelRendererTurbo(this, 77, 359, textureX, textureY); // Box 117
		rightLegModel[11] = new ModelRendererTurbo(this, 77, 359, textureX, textureY); // Box 118
		rightLegModel[12] = new ModelRendererTurbo(this, 51, 359, textureX, textureY); // Box 119

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 43
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-1F, 4F, -2.4F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F); // Box 67
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 8F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 74
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 8F, -2F, 4, 1, 4, 0F,0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F); // Box 87
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 4F, -2F, 4, 1, 4, 0F,0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F); // Box 89
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.05F, 5F, -2F, 4, 1, 4, 0F,0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F, 0.16F, -0.3F, 0.16F); // Box 91
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 5F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 96
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 1F, -2F, 4, 1, 4, 0F,0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F); // Box 83
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F, 0.18F, -0.3F, 0.18F); // Box 84
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.5F, 1.2F, -0.8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 116
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2.5F, 1.2F, 0.2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F); // Box 117
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.5F, 0.199999999999999F, -0.8F, 1, 1, 1, 0F,0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 118
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2.4F, 0.199999999999999F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.15F, 1F, 0F, -0.15F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0.75F, 0F, -0.55F, 0.75F); // Box 119
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);
	}
}