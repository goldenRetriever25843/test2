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

public class ModelBelgianPara extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBelgianPara() //Same as Filename
	{
		headModel = new ModelRendererTurbo[76];
		bodyModel = new ModelRendererTurbo[66];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[5];
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
		headModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 13
		headModel[6] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 130
		headModel[8] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 131
		headModel[9] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 132
		headModel[10] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 133
		headModel[11] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 134
		headModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 135
		headModel[13] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 136
		headModel[14] = new ModelRendererTurbo(this, 12, 107, textureX, textureY); // Box 138
		headModel[15] = new ModelRendererTurbo(this, 15, 107, textureX, textureY); // Box 139
		headModel[16] = new ModelRendererTurbo(this, 12, 109, textureX, textureY); // Box 140
		headModel[17] = new ModelRendererTurbo(this, 15, 107, textureX, textureY); // Box 141
		headModel[18] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 142
		headModel[19] = new ModelRendererTurbo(this, 15, 108, textureX, textureY); // Box 143
		headModel[20] = new ModelRendererTurbo(this, 11, 107, textureX, textureY); // Box 144
		headModel[21] = new ModelRendererTurbo(this, 14, 110, textureX, textureY); // Box 157
		headModel[22] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 158
		headModel[23] = new ModelRendererTurbo(this, 13, 105, textureX, textureY); // Box 159
		headModel[24] = new ModelRendererTurbo(this, 21, 114, textureX, textureY); // Box 160
		headModel[25] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 161
		headModel[26] = new ModelRendererTurbo(this, 13, 116, textureX, textureY); // Box 162
		headModel[27] = new ModelRendererTurbo(this, 16, 117, textureX, textureY); // Box 163
		headModel[28] = new ModelRendererTurbo(this, 17, 115, textureX, textureY); // Box 164
		headModel[29] = new ModelRendererTurbo(this, 17, 114, textureX, textureY); // Box 165
		headModel[30] = new ModelRendererTurbo(this, 19, 114, textureX, textureY); // Box 166
		headModel[31] = new ModelRendererTurbo(this, 19, 119, textureX, textureY); // Box 167
		headModel[32] = new ModelRendererTurbo(this, 13, 114, textureX, textureY); // Box 169
		headModel[33] = new ModelRendererTurbo(this, 23, 115, textureX, textureY); // Box 170
		headModel[34] = new ModelRendererTurbo(this, 20, 114, textureX, textureY); // Box 171
		headModel[35] = new ModelRendererTurbo(this, 27, 115, textureX, textureY); // Box 173
		headModel[36] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 174
		headModel[37] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 175
		headModel[38] = new ModelRendererTurbo(this, 27, 114, textureX, textureY); // Box 176
		headModel[39] = new ModelRendererTurbo(this, 18, 113, textureX, textureY); // Box 177
		headModel[40] = new ModelRendererTurbo(this, 19, 113, textureX, textureY); // Box 178
		headModel[41] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 179
		headModel[42] = new ModelRendererTurbo(this, 15, 114, textureX, textureY); // Box 180
		headModel[43] = new ModelRendererTurbo(this, 25, 115, textureX, textureY); // Box 181
		headModel[44] = new ModelRendererTurbo(this, 19, 113, textureX, textureY); // Box 182
		headModel[45] = new ModelRendererTurbo(this, 17, 115, textureX, textureY); // Box 183
		headModel[46] = new ModelRendererTurbo(this, 25, 109, textureX, textureY); // Box 184
		headModel[47] = new ModelRendererTurbo(this, 21, 111, textureX, textureY); // Box 185
		headModel[48] = new ModelRendererTurbo(this, 19, 113, textureX, textureY); // Box 186
		headModel[49] = new ModelRendererTurbo(this, 23, 110, textureX, textureY); // Box 187
		headModel[50] = new ModelRendererTurbo(this, 25, 111, textureX, textureY); // Box 188
		headModel[51] = new ModelRendererTurbo(this, 16, 114, textureX, textureY); // Box 189
		headModel[52] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 190
		headModel[53] = new ModelRendererTurbo(this, 24, 113, textureX, textureY); // Box 191
		headModel[54] = new ModelRendererTurbo(this, 22, 110, textureX, textureY); // Box 192
		headModel[55] = new ModelRendererTurbo(this, 22, 109, textureX, textureY); // Box 193
		headModel[56] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 198
		headModel[57] = new ModelRendererTurbo(this, 14, 114, textureX, textureY); // Box 200
		headModel[58] = new ModelRendererTurbo(this, 12, 112, textureX, textureY); // Box 201
		headModel[59] = new ModelRendererTurbo(this, 9, 115, textureX, textureY); // Box 202
		headModel[60] = new ModelRendererTurbo(this, 14, 110, textureX, textureY); // Box 203
		headModel[61] = new ModelRendererTurbo(this, 11, 112, textureX, textureY); // Box 204
		headModel[62] = new ModelRendererTurbo(this, 16, 112, textureX, textureY); // Box 205
		headModel[63] = new ModelRendererTurbo(this, 10, 108, textureX, textureY); // Box 206
		headModel[64] = new ModelRendererTurbo(this, 8, 115, textureX, textureY); // Box 207
		headModel[65] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Box 208
		headModel[66] = new ModelRendererTurbo(this, 6, 111, textureX, textureY); // Box 210
		headModel[67] = new ModelRendererTurbo(this, 8, 112, textureX, textureY); // Box 211
		headModel[68] = new ModelRendererTurbo(this, 5, 116, textureX, textureY); // Box 213
		headModel[69] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 214
		headModel[70] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 215
		headModel[71] = new ModelRendererTurbo(this, 16, 114, textureX, textureY); // Box 216
		headModel[72] = new ModelRendererTurbo(this, 52, 107, textureX, textureY); // Box 81
		headModel[73] = new ModelRendererTurbo(this, 85, 107, textureX, textureY); // Box 82
		headModel[74] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 448
		headModel[75] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 449

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.4F, -0.1F, 0.6F, 0.4F, -0.1F, 0.6F, 0.4F, 1.2F, 0.1F, 0.4F, 1.2F, 0.1F); // Import Box3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0.3F, -1.4F, -0.9F, 0.3F, -1.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, 0.8F, 0.4F, 0.4F, 0.8F, 0.4F); // Import Box3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F,0.55F, -0.2F, 0.3F, 0.55F, -0.2F, 0.3F, 0.55F, 0.2F, 0.4F, 0.55F, 0.2F, 0.4F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.6F, -0.7F, 0.8F, 0.6F, -0.7F, 0.8F); // Import Box3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F,0.5F, 1.1F, 0.5F, 0.5F, 1.1F, 0.5F, 0.55F, -0.2F, 0.3F, 0.55F, -0.2F, 0.3F, 0.5F, -1.6F, 1.3F, 0.5F, -1.6F, 1.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F); // Import Box3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 130
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1.75F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 131
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(0.25F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 132
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 133
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1.25F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 134
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-2.75F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 135
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3.5F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 136
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 138
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-2.75F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 139
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1.25F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 140
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 141
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0.25F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 142
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(1.75F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 143
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(2.5F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 144
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-2F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 157
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-2F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 158
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(1F, -9.4F, -4.2F, 1, 2, 9, 0F,-0.45F, -0.3F, -1.1F, -0.45F, -0.3F, -1.1F, -0.45F, 0F, -2.2F, -0.45F, 0F, -2.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, -0.4F, -0.45F, -0.6F, -0.4F); // Box 159
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(1F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 160
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4F, -9F, -3.5F, 8, 1, 1, 0F,-0.9F, 0.1F, -0.45F, -0.9F, 0.1F, -0.45F, -0.9F, 0.1F, -0.45F, -0.9F, 0.1F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 161
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4F, -9F, -2.75F, 8, 1, 1, 0F,-0.9F, 0.15F, -0.45F, -0.9F, 0.15F, -0.45F, -0.9F, 0.15F, -0.45F, -0.9F, 0.15F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 162
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-4F, -9F, -1.25F, 8, 1, 1, 0F,-0.9F, 0.2F, -0.45F, -0.9F, 0.2F, -0.45F, -0.9F, 0.2F, -0.45F, -0.9F, 0.2F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 163
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-4F, -9F, -0.5F, 8, 1, 1, 0F,-0.9F, 0.25F, -0.45F, -0.9F, 0.25F, -0.45F, -0.9F, 0.25F, -0.45F, -0.9F, 0.25F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 164
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-4F, -9F, 0.25F, 8, 1, 1, 0F,-0.9F, 0.3F, -0.45F, -0.9F, 0.3F, -0.45F, -0.9F, 0.3F, -0.45F, -0.9F, 0.3F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 165
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4F, -9F, 1.75F, 8, 1, 1, 0F,-0.9F, 0.35F, -0.45F, -0.9F, 0.35F, -0.45F, -0.9F, 0.35F, -0.45F, -0.9F, 0.35F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 166
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4F, -9F, 2.5F, 8, 1, 1, 0F,-0.7F, 0.2F, -0.45F, -0.7F, 0.2F, -0.45F, -0.6F, 0F, -0.45F, -0.6F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 167
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-4F, -9F, 1F, 8, 1, 1, 0F,-0.9F, 0.3F, -0.45F, -0.9F, 0.3F, -0.45F, -0.9F, 0.3F, -0.45F, -0.9F, 0.3F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 169
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-4F, -9F, -2F, 8, 1, 1, 0F,-0.9F, 0.2F, -0.45F, -0.9F, 0.2F, -0.45F, -0.9F, 0.2F, -0.45F, -0.9F, 0.2F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 170
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4F, -9F, 3.25F, 8, 1, 1, 0F,-0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.2F, -0.6F, -0.45F, -0.2F, -0.6F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F); // Box 171
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-4F, -8F, -3.5F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.3F, -0.45F, 0.5F, 0.3F, -0.45F, 0.5F, 0.37F, -0.45F, 0.5F, 0.37F, -0.45F); // Box 173
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-4F, -8F, -2F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.7F, -0.45F, 0.5F, 0.7F, -0.45F, 0.5F, 0.77F, -0.45F, 0.5F, 0.77F, -0.45F); // Box 174
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4F, -8F, -2.75F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.5F, -0.45F, 0.5F, 0.5F, -0.45F, 0.5F, 0.57F, -0.45F, 0.5F, 0.57F, -0.45F); // Box 175
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4F, -8F, -0.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.12F, -0.45F, 0.5F, 0.12F, -0.45F, 0.5F, 0.2F, -0.45F, 0.5F, 0.2F, -0.45F); // Box 176
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4F, -8F, -1.25F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.9F, -0.45F, 0.5F, 0.9F, -0.45F, 0.5F, 0.97F, -0.45F, 0.5F, 0.97F, -0.45F); // Box 177
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-4F, -8F, 0.25F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.12F, -0.45F, 0.5F, 0.12F, -0.45F, 0.5F, 0.1F, -0.45F, 0.5F, 0.1F, -0.45F); // Box 178
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-4F, -8F, 3.25F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, -0.15F, -0.45F, 0.5F, -0.15F, -0.45F, 0.5F, -0.17F, -0.45F, 0.5F, -0.17F, -0.45F); // Box 179
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-4F, -8F, 1F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.08F, -0.45F, 0.5F, 0.08F, -0.45F, 0.5F, 0.05F, -0.45F, 0.5F, 0.05F, -0.45F); // Box 180
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-4F, -8F, 1.75F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0F, -0.45F, 0.5F, 0F, -0.45F, 0.5F, -0.01F, -0.45F, 0.5F, -0.01F, -0.45F); // Box 181
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-4F, -8F, 2.5F, 8, 4, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, -0.08F, -0.45F, 0.5F, -0.08F, -0.45F, 0.5F, -0.1F, -0.45F, 0.5F, -0.1F, -0.45F); // Box 182
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(2.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 183
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-0.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 184
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-3.5F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 185
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-2F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 186
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(1F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 187
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(1.75F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 188
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-1.25F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 189
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(0.25F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 190
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-2.75F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 191
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-4.25F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 192
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(3.25F, -8F, 3.4F, 1, 4, 2, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.7F); // Box 193
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-4.5F, -7F, -4.9F, 9, 1, 5, 0F,-0.25F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F); // Box 198
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-4F, -8.5F, -3.9F, 8, 1, 4, 0F,0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F); // Box 200
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-4.5F, -5.5F, -4.9F, 9, 1, 5, 0F,-0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, -0.2F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F); // Box 201
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-4F, -8.5F, 0.1F, 8, 1, 4, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 202
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-4.5F, -7.75F, -4.9F, 9, 1, 5, 0F,-0.35F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, -0.55F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F); // Box 203
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-4.5F, -6.25F, -4.9F, 9, 1, 5, 0F,-0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F); // Box 204
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(-4F, -8.5F, 0.1F, 8, 1, 4, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0F, 0.1F, -0.45F, 0.3F, 0.1F, -0.45F, 0.3F); // Box 205
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(-4.5F, -7.75F, 0.0999999999999995F, 9, 1, 5, 0F,-0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, -0.6F, -0.35F, -0.45F, -0.6F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, -0.6F, -0.3F, -0.45F, -0.6F); // Box 206
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(-4.5F, -7F, 0.0999999999999995F, 9, 1, 5, 0F,-0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, -0.57F, -0.25F, -0.45F, -0.57F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, -0.57F, -0.25F, -0.45F, -0.57F); // Box 207
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(-4.5F, -6.25F, 0.0999999999999995F, 9, 1, 5, 0F,-0.15F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.15F, -0.45F, -0.5F, -0.15F, -0.45F, -0.5F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, 0F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F); // Box 208
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-4.5F, -4.75F, -2.9F, 9, 1, 8, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F); // Box 210
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(-4F, -9.25F, -3.5F, 8, 1, 5, 0F,-0.7F, -0.45F, -0.2F, -0.7F, -0.45F, -0.2F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F); // Box 211
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(-4F, -9.25F, 1.5F, 8, 1, 3, 0F,-0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.3F, -0.75F, -0.85F, -0.3F, -0.75F, -0.85F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.2F, -0.15F, -0.7F, -0.2F, -0.15F, -0.7F); // Box 213
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(-4.25F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 214
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(3.25F, -8F, -4.7F, 1, 3, 1, 0F,-0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 215
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(-4F, -8F, -4.25F, 8, 3, 1, 0F,0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.5F, 0.3F, -0.45F, 0.5F, 0.3F, -0.45F, 0.5F, 0.37F, -0.45F, 0.5F, 0.37F, -0.45F); // Box 216
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(-5F, -7F, -5F, 10, 1, 5, 0F,-0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, -0.65F, -0.6F, 0F, -0.65F, -0.6F, 0F, -0.7F, -0.6F, -0.55F, -0.7F, -0.6F, -0.55F, -0.65F, 0F, 0F, -0.65F, 0F, 0F); // Box 81
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(-5F, -6.4F, 0F, 10, 1, 5, 0F,-0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.65F, -0.6F, 0F, -0.65F, -0.6F, 0F, -0.7F, -0.6F, -0.35F, -0.7F, -0.6F, -0.35F); // Box 82
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(-4F, -6.1F, -4.2F, 8, 1, 4, 0F,0.4F, 0F, 0.35F, 0.4F, 0F, 0.35F, 0.45F, -1F, 0.3F, 0.45F, -1F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.55F, 1.3F, 0.3F, 0.55F, 1.3F, 0.3F); // Box 448
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(-4F, -5.2F, 0.8F, 8, 1, 4, 0F,0.45F, -0.1F, 0.7F, 0.45F, -0.1F, 0.7F, 0.42F, 0F, -0.15F, 0.42F, 0F, -0.15F, 0.55F, 0.4F, 0.7F, 0.55F, 0.4F, 0.7F, 0.55F, 0F, 0F, 0.55F, 0F, 0F); // Box 449
		headModel[75].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 52
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 122, 2, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 48
		bodyModel[11] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 43, 80, textureX, textureY); // Box 44
		bodyModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 45
		bodyModel[19] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 46
		bodyModel[20] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 47
		bodyModel[21] = new ModelRendererTurbo(this, 51, 41, textureX, textureY); // Box 48
		bodyModel[22] = new ModelRendererTurbo(this, 31, 77, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 10
		bodyModel[24] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 1
		bodyModel[25] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 102
		bodyModel[26] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 105
		bodyModel[27] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 129
		bodyModel[29] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 20
		bodyModel[30] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 21
		bodyModel[31] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 22
		bodyModel[32] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 23
		bodyModel[33] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 275
		bodyModel[34] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 276
		bodyModel[35] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 30
		bodyModel[36] = new ModelRendererTurbo(this, 94, 72, textureX, textureY); // Box 32
		bodyModel[37] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 33
		bodyModel[38] = new ModelRendererTurbo(this, 65, 80, textureX, textureY); // Box 16
		bodyModel[39] = new ModelRendererTurbo(this, 55, 80, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 45, 61, textureX, textureY); // Box 18
		bodyModel[41] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 110
		bodyModel[42] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 111
		bodyModel[43] = new ModelRendererTurbo(this, 104, 71, textureX, textureY); // Box 414
		bodyModel[44] = new ModelRendererTurbo(this, 115, 73, textureX, textureY); // Box 415
		bodyModel[45] = new ModelRendererTurbo(this, 82, 74, textureX, textureY); // Box 416
		bodyModel[46] = new ModelRendererTurbo(this, 95, 81, textureX, textureY); // Box 419
		bodyModel[47] = new ModelRendererTurbo(this, 95, 81, textureX, textureY); // Box 420
		bodyModel[48] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 58, 72, textureX, textureY); // Box 113
		bodyModel[50] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 114
		bodyModel[51] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 91
		bodyModel[52] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 115
		bodyModel[53] = new ModelRendererTurbo(this, 49, 67, textureX, textureY); // Box 116
		bodyModel[54] = new ModelRendererTurbo(this, 64, 67, textureX, textureY); // Box 117
		bodyModel[55] = new ModelRendererTurbo(this, 98, 90, textureX, textureY); // Box 118
		bodyModel[56] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 119
		bodyModel[57] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 121
		bodyModel[59] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 124
		bodyModel[61] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 125
		bodyModel[62] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 156
		bodyModel[63] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 157
		bodyModel[64] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 158
		bodyModel[65] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 159

		bodyModel[0].addBox(-3.9F, 8.5F, -2.15F, 3, 3, 1, 0F); // Box 52
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(0.9F, 8.5F, -2.15F, 3, 3, 1, 0F); // Box 53
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.9F, 1.5F, -2.15F, 1, 4, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 46
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.9F, 1.5F, -2.15F, 1, 4, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 47
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.8F, 1.5F, -2.15F, 2, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 48
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 7.8F, -2.5F, 4, 1, 5, 0F,0.2F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F); // Box 26
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 2.8F, -2.25F, 1, 5, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, 2.8F, -2.25F, 1, 5, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 29
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1F, 7.8F, -2.35F, 1, 1, 1, 0F,-0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F); // Box 37
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, -0.2F, 0.3F, 2, 1, 2, 0F,0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 7.8F, -2.35F, 1, 1, 1, 0F,-0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F, -0.2F, 0.31F, 0F); // Box 3
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.5F, -0.2F, 0.3F, 2, 1, 2, 0F,-0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F); // Box 44
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, -0.2F, -2.25F, 1, 3, 4, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F); // Box 45
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3F, 0.8F, 0.3F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 46
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-2.7F, 2.3F, 1.27F, 2, 6, 1, 0F,-1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -0.7F, 0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0F, -0.7F, 0.35F, 0F); // Box 47
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.7F, 2.3F, 1.27F, 2, 6, 1, 0F,0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.35F, 0F, -0.7F, 0.35F, 0F, -0.7F, 0.35F, 0F, -0.5F, 0.35F, 0F); // Box 48
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, 7.5F, 1.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2.5F, -0.2F, -2.25F, 1, 3, 4, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F); // Box 10
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2F, 7.1F, 1.4F, 2, 1, 2, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.2F, 7.8F, -2.5F, 4, 1, 5, 0F,0.2F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0.2F, 0.3F, -0.25F); // Box 102
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-0.8F, 7.8F, -2.3F, 1, 1, 1, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 105
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 7.6F, 1.4F, 2, 1, 2, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 128
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2F, 7.5F, 1.4F, 2, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 129
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.5F, 4.5F, -2.5F, 1, 1, 2, 0F,-0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F); // Box 20
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2.5F, 4.5F, -2.5F, 1, 1, 2, 0F,-0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F); // Box 21
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2.5F, 4.5F, -2.6F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F); // Box 22
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.5F, 4.5F, -2.6F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F); // Box 23
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.5F, 9.5F, 2.45F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 275
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(2.5F, 8F, 2.45F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 276
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.6F, 7F, -3.1F, 2, 4, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 30
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.6F, 7F, -3.1F, 2, 4, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 32
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
		bodyModel[36].rotateAngleZ = 0.01745329F;

		bodyModel[37].addShapeBox(-3.6F, 6.9F, -3.2F, 2, 1, 2, 0F,0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F); // Box 33
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.6F, 8.1F, -3.2F, 2, 1, 2, 0F,0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, -1F, -0.7F, 0.2F, -1F, -0.7F, 0.2F, -1F, -0.7F, 0.2F, -1F, -0.7F, 0.2F); // Box 16
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1.6F, 8.1F, -3.2F, 2, 1, 2, 0F,0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, -1F, -0.7F, 0.2F, -1F, -0.7F, 0.2F, -1F, -0.7F, 0.2F, -1F, -0.7F, 0.2F); // Box 17
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
		bodyModel[39].rotateAngleZ = 0.01745329F;

		bodyModel[40].addShapeBox(1.6F, 6.9F, -3.2F, 2, 1, 2, 0F,0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, 0.2F); // Box 18
		bodyModel[40].setRotationPoint(0F, 0F, 0F);
		bodyModel[40].rotateAngleZ = 0.01745329F;

		bodyModel[41].addShapeBox(-3.1F, 7.4F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 110
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.1F, 7.4F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 111
		bodyModel[42].setRotationPoint(0F, 0F, 0F);
		bodyModel[42].rotateAngleZ = 0.01745329F;

		bodyModel[43].addShapeBox(-3.6F, 7F, -3.1F, 2, 4, 1, 0F,-0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F); // Box 414
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1.6F, 7F, -3.1F, 2, 4, 1, 0F,-0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F, -0.1F, -0.3F, 0.25F); // Box 415
		bodyModel[44].setRotationPoint(0F, 0F, 0F);
		bodyModel[44].rotateAngleZ = 0.01745329F;

		bodyModel[45].addShapeBox(-3.5F, 2.1F, -2.5F, 1, 1, 2, 0F,-0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F); // Box 416
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.5F, 0.3F, -2.5F, 1, 1, 2, 0F,0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F); // Box 419
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2.5F, 0.3F, -2.5F, 1, 1, 2, 0F,0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F, 0.22F, -0.3F, -0.2F); // Box 420
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(2.5F, 1F, -3.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 86
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.5F, 0.8F, -2.8F, 1, 3, 1, 0F,0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, -0.5F, 0.2F, 0.25F, -0.5F, 0.2F, 0.25F, -0.5F, 0.2F, 0.25F, -0.5F, 0.2F); // Box 113
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(2.5F, 0.7F, -2.8F, 1, 1, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 114
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(2.5F, 1.7F, -2.8F, 1, 1, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 91
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-2.1F, 9.5F, 2F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 115
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2.1F, 7.7F, 2.1F, 4, 1, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F); // Box 116
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-2.1F, 8.7F, 2.1F, 4, 1, 2, 0F,0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-2.1F, 10.5F, 2F, 4, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F); // Box 118
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(0.4F, 9F, 3.15F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-1.6F, 9F, 3.15F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 120
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(0.4F, 8F, 2.15F, 1, 1, 2, 0F,-0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 121
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-1.6F, 8F, 2.15F, 1, 1, 2, 0F,-0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 123
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(0.4F, 10.8F, 3.15F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F); // Box 124
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-1.6F, 10.8F, 3.15F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F); // Box 125
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-3.65F, 9F, 2F, 1, 1, 1, 0F,0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F); // Box 156
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4.25F, 9.3F, 2.4F, 1, 1, 1, 0F,-0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F); // Box 157
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-3.65F, 7.75F, 2F, 1, 1, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Box 158
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-3.65F, 7.4F, 2.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 159
		bodyModel[65].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 49
		leftArmModel[2] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 3
		leftArmModel[3] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 59
		leftArmModel[4] = new ModelRendererTurbo(this, 64, 88, textureX, textureY); // Box 60
		leftArmModel[5] = new ModelRendererTurbo(this, 48, 88, textureX, textureY); // Box 126

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.21F, 0F, -1.5F, 1, 1, 3, 0F,0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F); // Box 126
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		rightArmModel[2] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 75, 88, textureX, textureY); // Box 61
		rightArmModel[4] = new ModelRendererTurbo(this, 88, 88, textureX, textureY); // Box 62

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 64

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 68

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}