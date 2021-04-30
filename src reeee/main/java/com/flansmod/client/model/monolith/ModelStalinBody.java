//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelStalinBody extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelStalinBody()
	{
		bodyModel = new ModelRendererTurbo[92];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 156
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 158
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 165
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 172
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 193
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 194
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 200
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 201
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 202

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F,0F, 0F, 0F, -0.25F, 0F, -1.2F, -0.25F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 5.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 5.5F); // Box 0
		bodyModel[0].setRotationPoint(21.3F, -13.5F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 5, 24, 0F,3F, 0F, 3.5F, 0F, 0F, -5F, 0F, 0F, -5F, 3F, 0F, 3.5F, 3F, 0F, 6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, 0F, 6F); // Box 1
		bodyModel[1].setRotationPoint(13.3F, -13.5F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 5, 30, 0F,0F, 0.5F, 2.8F, 3F, 0F, 0.5F, 3F, 0.5F, 0.5F, 0F, 0.5F, 2.8F, 0F, 0F, 4.8F, 3F, 0F, 3F, 3F, 0F, 3F, 0F, 0F, 4.8F); // Box 2
		bodyModel[2].setRotationPoint(4.3F, -13.5F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F,3F, 0F, 3.5F, 0.3F, 0F, -3F, 0.3F, 0F, -3F, 3F, 0F, 3.5F, 3F, 0F, 3.5F, 0.3F, 0F, -3F, 0.3F, 0F, -3F, 3F, 0F, 3.5F); // Box 3
		bodyModel[3].setRotationPoint(13.3F, -14F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 30, 0F,0F, 0.5F, 2.8F, 3F, 0.5F, 0.5F, 3F, 0.5F, 0.5F, 0F, 0.5F, 2.8F, 0F, 0F, 2.8F, 3F, 1F, 0.5F, 3F, 0F, 0.5F, 0F, 0F, 2.8F); // Box 4
		bodyModel[4].setRotationPoint(4.3F, -13.5F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 2F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F); // Box 5
		bodyModel[5].setRotationPoint(16.6F, -14F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 51, 5, 34, 0F,3F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 3F, 0F, 2.8F); // Box 6
		bodyModel[6].setRotationPoint(-46.7F, -13.5F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 34, 0F,-5F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, -5F, 0F, 0.8F, 0.6F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0.6F, 0F, 2.8F); // Box 7
		bodyModel[7].setRotationPoint(-54.7F, -13.5F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 5, 25, 0F,-4.4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4.4F, 0F, 0F, 0.6F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0.6F, -0.5F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-59.7F, -8.5F, -12.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 8, 25, 0F,0.6F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0.6F, -0.5F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-59.7F, -4.5F, -12.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 75, 12, 25, 0F); // Box 10
		bodyModel[10].setRotationPoint(-53.7F, -8.5F, -12.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 6, 25, 0F,-5F, 0.5F, -5.5F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, -5F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(21F, -8.5F, -12.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, -1.8F, -3.5F, 0F, -1.8F, -3.5F, -5F, -4.6F, 0.5F, 0.8F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -5F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(21.3F, -8.5F, -12.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-4.6F, 0.5F, 0.8F, -1.8F, -3.5F, -5F, -1.8F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -5F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(21.3F, -8.5F, 7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 6, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(21F, -2.5F, -12.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 91, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-55.3F, -8.5F, -23F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 16
		bodyModel[16].setRotationPoint(35.6F, -8.5F, -23F);
		bodyModel[16].rotateAngleZ = -0.13962634F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 17
		bodyModel[17].setRotationPoint(37.57F, -8.22F, -23F);
		bodyModel[17].rotateAngleZ = -0.41887902F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 18
		bodyModel[18].setRotationPoint(39.38F, -7.4F, -23F);
		bodyModel[18].rotateAngleZ = -0.66322512F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 91, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-55.3F, -8.5F, 12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 20
		bodyModel[20].setRotationPoint(35.6F, -8.5F, 12F);
		bodyModel[20].rotateAngleZ = -0.13962634F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 21
		bodyModel[21].setRotationPoint(37.57F, -8.22F, 12F);
		bodyModel[21].rotateAngleZ = -0.41887902F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 22
		bodyModel[22].setRotationPoint(39.38F, -7.4F, 12F);
		bodyModel[22].rotateAngleZ = -0.66322512F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.5F, 0.35F, -0.85F, -0.5F, 0.35F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 23
		bodyModel[23].setRotationPoint(39.38F, -7.4F, -13F);
		bodyModel[23].rotateAngleZ = -0.66322512F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 24
		bodyModel[24].setRotationPoint(37.57F, -8.22F, -13F);
		bodyModel[24].rotateAngleZ = -0.41887902F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 25
		bodyModel[25].setRotationPoint(35.6F, -8.5F, -13F);
		bodyModel[25].rotateAngleZ = -0.13962634F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 26
		bodyModel[26].setRotationPoint(20.6F, -8.5F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, 0F, 0.35F, -0.85F, 0F, 0.35F, -0.85F, -0.5F, 0F, -0.85F, -0.5F); // Box 27
		bodyModel[27].setRotationPoint(39.38F, -7.4F, 12F);
		bodyModel[27].rotateAngleZ = -0.66322512F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F); // Box 28
		bodyModel[28].setRotationPoint(37.57F, -8.22F, 12F);
		bodyModel[28].rotateAngleZ = -0.41887902F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F); // Box 29
		bodyModel[29].setRotationPoint(35.6F, -8.5F, 12F);
		bodyModel[29].rotateAngleZ = -0.13962634F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -0.5F, 0F, -0.85F, -0.5F); // Box 30
		bodyModel[30].setRotationPoint(20.6F, -8.5F, 12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F,-4.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.4F, 0F, 0F, 0.6F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, 0.6F, -0.5F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-59.7F, -8.5F, 12.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F,-4.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.4F, 0F, 0F, 0.6F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, 0.6F, -0.5F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-59.7F, -8.5F, -23.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 33
		bodyModel[33].setRotationPoint(27F, -4F, -14F);
		bodyModel[33].rotateAngleZ = -0.34906585F;

		bodyModel[34].addBox(6.5F, -0.5F, 0F, 3, 3, 3, 0F); // Box 34
		bodyModel[34].setRotationPoint(27F, -4F, -14F);
		bodyModel[34].rotateAngleZ = -0.34906585F;

		bodyModel[35].addBox(6.5F, -6.5F, 0F, 2, 6, 1, 0F); // Box 35
		bodyModel[35].setRotationPoint(27F, -4F, -15.5F);
		bodyModel[35].rotateAngleZ = -0.6981317F;

		bodyModel[36].addBox(6.5F, -0.5F, 0F, 3, 3, 3, 0F); // Box 36
		bodyModel[36].setRotationPoint(29F, -7F, -14F);
		bodyModel[36].rotateAngleZ = -0.34906585F;

		bodyModel[37].addBox(7.5F, 0.5F, -3F, 1, 1, 5, 0F); // Box 37
		bodyModel[37].setRotationPoint(27F, -4F, -14F);
		bodyModel[37].rotateAngleZ = -0.34906585F;

		bodyModel[38].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 38
		bodyModel[38].setRotationPoint(27F, -4F, 12F);
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addBox(6.5F, -0.5F, 0F, 3, 3, 3, 0F); // Box 39
		bodyModel[39].setRotationPoint(27F, -4F, 11F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addBox(6.5F, -6.5F, 0F, 2, 6, 1, 0F); // Box 40
		bodyModel[40].setRotationPoint(27F, -4F, 14.5F);
		bodyModel[40].rotateAngleZ = -0.6981317F;

		bodyModel[41].addBox(6.5F, -0.5F, 0F, 3, 3, 3, 0F); // Box 41
		bodyModel[41].setRotationPoint(29F, -7F, 11F);
		bodyModel[41].rotateAngleZ = -0.34906585F;

		bodyModel[42].addBox(7.5F, 0.5F, 3F, 1, 1, 5, 0F); // Box 42
		bodyModel[42].setRotationPoint(27F, -4F, 9F);
		bodyModel[42].rotateAngleZ = -0.34906585F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 13, 2, 26, 0F,-0.5F, 0F, -13F, -0.5F, 0F, -13F, -0.5F, 0F, -13F, -0.5F, 0F, -13F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 115
		bodyModel[43].setRotationPoint(-48.5F, -15.8F, -13F);

		bodyModel[44].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 155
		bodyModel[44].setRotationPoint(24.5F, 5.2F, -19F);

		bodyModel[45].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 156
		bodyModel[45].setRotationPoint(11.5F, 5.2F, -19F);

		bodyModel[46].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 157
		bodyModel[46].setRotationPoint(-1.5F, 5.2F, -19F);

		bodyModel[47].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 158
		bodyModel[47].setRotationPoint(-15F, 5.2F, -19F);

		bodyModel[48].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 159
		bodyModel[48].setRotationPoint(-29F, 5.2F, -19F);

		bodyModel[49].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 160
		bodyModel[49].setRotationPoint(-40F, 5.2F, -19F);

		bodyModel[50].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 161
		bodyModel[50].setRotationPoint(-36F, 1.8F, -15.5F);

		bodyModel[51].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 162
		bodyModel[51].setRotationPoint(-24.5F, 1.8F, -15.5F);

		bodyModel[52].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 163
		bodyModel[52].setRotationPoint(-10.5F, 1.8F, -15.5F);

		bodyModel[53].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 164
		bodyModel[53].setRotationPoint(2.8F, 1.8F, -15.5F);

		bodyModel[54].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 165
		bodyModel[54].setRotationPoint(16F, 1.8F, -15.5F);

		bodyModel[55].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 166
		bodyModel[55].setRotationPoint(29F, 1.8F, -15.5F);

		bodyModel[56].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 167
		bodyModel[56].setRotationPoint(-36F, 1.8F, 9.5F);

		bodyModel[57].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 168
		bodyModel[57].setRotationPoint(-24.5F, 1.8F, 9.5F);

		bodyModel[58].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 169
		bodyModel[58].setRotationPoint(-10.5F, 1.8F, 9.5F);

		bodyModel[59].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 170
		bodyModel[59].setRotationPoint(2.8F, 1.8F, 9.5F);

		bodyModel[60].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 171
		bodyModel[60].setRotationPoint(16F, 1.8F, 9.5F);

		bodyModel[61].addBox(-1F, -1F, 0F, 3, 3, 6, 0F); // Box 172
		bodyModel[61].setRotationPoint(29F, 1.8F, 9.5F);

		bodyModel[62].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 173
		bodyModel[62].setRotationPoint(-40F, 5.2F, -15F);
		bodyModel[62].rotateAngleZ = 0.33161256F;

		bodyModel[63].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 174
		bodyModel[63].setRotationPoint(-28F, 5.2F, -15F);
		bodyModel[63].rotateAngleZ = 0.33161256F;

		bodyModel[64].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 175
		bodyModel[64].setRotationPoint(-14F, 5.2F, -15F);
		bodyModel[64].rotateAngleZ = 0.33161256F;

		bodyModel[65].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 176
		bodyModel[65].setRotationPoint(-1F, 5.2F, -15F);
		bodyModel[65].rotateAngleZ = 0.33161256F;

		bodyModel[66].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 177
		bodyModel[66].setRotationPoint(12F, 5.2F, -15F);
		bodyModel[66].rotateAngleZ = 0.33161256F;

		bodyModel[67].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 178
		bodyModel[67].setRotationPoint(25F, 5.2F, -15F);
		bodyModel[67].rotateAngleZ = 0.33161256F;

		bodyModel[68].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 179
		bodyModel[68].setRotationPoint(-40F, 5.2F, 14F);
		bodyModel[68].rotateAngleZ = 0.33161256F;

		bodyModel[69].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 180
		bodyModel[69].setRotationPoint(-28F, 5.2F, 14F);
		bodyModel[69].rotateAngleZ = 0.33161256F;

		bodyModel[70].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 181
		bodyModel[70].setRotationPoint(-14F, 5.2F, 14F);
		bodyModel[70].rotateAngleZ = 0.33161256F;

		bodyModel[71].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 182
		bodyModel[71].setRotationPoint(-1F, 5.2F, 14F);
		bodyModel[71].rotateAngleZ = 0.33161256F;

		bodyModel[72].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 183
		bodyModel[72].setRotationPoint(12F, 5.2F, 14F);
		bodyModel[72].rotateAngleZ = 0.33161256F;

		bodyModel[73].addBox(-1F, -1F, 0F, 6, 1, 1, 0F); // Box 184
		bodyModel[73].setRotationPoint(25F, 5.2F, 14F);
		bodyModel[73].rotateAngleZ = 0.33161256F;

		bodyModel[74].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 185
		bodyModel[74].setRotationPoint(24.5F, 5.2F, 13F);

		bodyModel[75].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 186
		bodyModel[75].setRotationPoint(11.5F, 5.2F, 13F);

		bodyModel[76].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 187
		bodyModel[76].setRotationPoint(-1.5F, 5.2F, 13F);

		bodyModel[77].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 188
		bodyModel[77].setRotationPoint(-15F, 5.2F, 13F);

		bodyModel[78].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 189
		bodyModel[78].setRotationPoint(-29F, 5.2F, 13F);

		bodyModel[79].addBox(-1F, -1F, 0F, 2, 2, 6, 0F); // Box 190
		bodyModel[79].setRotationPoint(-40F, 5.2F, 13F);

		bodyModel[80].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 191
		bodyModel[80].setRotationPoint(22F, -0.2F, -14.5F);

		bodyModel[81].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 192
		bodyModel[81].setRotationPoint(9F, -0.2F, -14.5F);

		bodyModel[82].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 193
		bodyModel[82].setRotationPoint(-5F, -0.2F, -14.5F);

		bodyModel[83].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 194
		bodyModel[83].setRotationPoint(-18F, -0.2F, -14.5F);

		bodyModel[84].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 195
		bodyModel[84].setRotationPoint(-32F, -0.2F, -14.5F);

		bodyModel[85].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 196
		bodyModel[85].setRotationPoint(-44F, -0.2F, -14.5F);

		bodyModel[86].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 197
		bodyModel[86].setRotationPoint(22F, -0.2F, 8.5F);

		bodyModel[87].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 198
		bodyModel[87].setRotationPoint(9F, -0.2F, 8.5F);

		bodyModel[88].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 199
		bodyModel[88].setRotationPoint(-5F, -0.2F, 8.5F);

		bodyModel[89].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 200
		bodyModel[89].setRotationPoint(-18F, -0.2F, 8.5F);

		bodyModel[90].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 201
		bodyModel[90].setRotationPoint(-32F, -0.2F, 8.5F);

		bodyModel[91].addBox(-1F, -2F, 0F, 3, 3, 6, 0F); // Box 202
		bodyModel[91].setRotationPoint(-44F, -0.2F, 8.5F);


		leftTrackWheelModels = new ModelRendererTurbo[36];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114

		leftTrackWheelModels[0].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 65
		leftTrackWheelModels[0].setRotationPoint(34.5F, -1.5F, 16F);

		leftTrackWheelModels[1].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftTrackWheelModels[1].setRotationPoint(34.5F, -1.5F, 16F);

		leftTrackWheelModels[2].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 67
		leftTrackWheelModels[2].setRotationPoint(24.5F, 5.2F, 16F);

		leftTrackWheelModels[3].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 68
		leftTrackWheelModels[3].setRotationPoint(24.5F, 5.2F, 16F);

		leftTrackWheelModels[4].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftTrackWheelModels[4].setRotationPoint(24.5F, 5.2F, 16F);

		leftTrackWheelModels[5].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 70
		leftTrackWheelModels[5].setRotationPoint(34.5F, -1.5F, 16F);

		leftTrackWheelModels[6].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftTrackWheelModels[6].setRotationPoint(11.8F, 5.2F, 16F);

		leftTrackWheelModels[7].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 72
		leftTrackWheelModels[7].setRotationPoint(11.8F, 5.2F, 16F);

		leftTrackWheelModels[8].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 73
		leftTrackWheelModels[8].setRotationPoint(11.8F, 5.2F, 16F);

		leftTrackWheelModels[9].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftTrackWheelModels[9].setRotationPoint(-1.2F, 5.2F, 16F);

		leftTrackWheelModels[10].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 75
		leftTrackWheelModels[10].setRotationPoint(-1.2F, 5.2F, 16F);

		leftTrackWheelModels[11].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 76
		leftTrackWheelModels[11].setRotationPoint(-1.2F, 5.2F, 16F);

		leftTrackWheelModels[12].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftTrackWheelModels[12].setRotationPoint(-14.7F, 5.2F, 16F);

		leftTrackWheelModels[13].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 78
		leftTrackWheelModels[13].setRotationPoint(-14.7F, 5.2F, 16F);

		leftTrackWheelModels[14].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 79
		leftTrackWheelModels[14].setRotationPoint(-14.7F, 5.2F, 16F);

		leftTrackWheelModels[15].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftTrackWheelModels[15].setRotationPoint(-28.7F, 5.2F, 16F);

		leftTrackWheelModels[16].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 81
		leftTrackWheelModels[16].setRotationPoint(-28.7F, 5.2F, 16F);

		leftTrackWheelModels[17].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 82
		leftTrackWheelModels[17].setRotationPoint(-28.7F, 5.2F, 16F);

		leftTrackWheelModels[18].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		leftTrackWheelModels[18].setRotationPoint(-40.2F, 5.2F, 16F);

		leftTrackWheelModels[19].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 84
		leftTrackWheelModels[19].setRotationPoint(-40.2F, 5.2F, 16F);

		leftTrackWheelModels[20].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 85
		leftTrackWheelModels[20].setRotationPoint(-40.2F, 5.2F, 16F);

		leftTrackWheelModels[21].addBox(-5F, -2F, 0F, 10, 4, 8, 0F); // Box 89
		leftTrackWheelModels[21].setRotationPoint(-52.8F, -0.8F, 14F);

		leftTrackWheelModels[22].addShapeBox(-5F, -5F, 0F, 10, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftTrackWheelModels[22].setRotationPoint(-52.8F, -0.8F, 14F);

		leftTrackWheelModels[23].addShapeBox(-5F, 2F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 91
		leftTrackWheelModels[23].setRotationPoint(-52.8F, -0.8F, 14F);

		leftTrackWheelModels[24].addBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F); // Box 100
		leftTrackWheelModels[24].setRotationPoint(-37.2F, -3.4F, 16F);

		leftTrackWheelModels[25].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		leftTrackWheelModels[25].setRotationPoint(-37.2F, -3.4F, 16F);

		leftTrackWheelModels[26].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 102
		leftTrackWheelModels[26].setRotationPoint(-37.2F, -3.4F, 16F);

		leftTrackWheelModels[27].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 103
		leftTrackWheelModels[27].setRotationPoint(-11.1F, -3.4F, 16F);

		leftTrackWheelModels[28].addBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F); // Box 104
		leftTrackWheelModels[28].setRotationPoint(-11.1F, -3.4F, 16F);

		leftTrackWheelModels[29].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackWheelModels[29].setRotationPoint(-11.1F, -3.4F, 16F);

		leftTrackWheelModels[30].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 106
		leftTrackWheelModels[30].setRotationPoint(16.4F, -3.4F, 16F);

		leftTrackWheelModels[31].addBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F); // Box 107
		leftTrackWheelModels[31].setRotationPoint(16.4F, -3.4F, 16F);

		leftTrackWheelModels[32].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftTrackWheelModels[32].setRotationPoint(16.4F, -3.4F, 16F);

		leftTrackWheelModels[33].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 112
		leftTrackWheelModels[33].setRotationPoint(-37.2F, -3.4F, 12F);
		leftTrackWheelModels[33].rotateAngleZ = 0.78539816F;

		leftTrackWheelModels[34].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 113
		leftTrackWheelModels[34].setRotationPoint(-11.2F, -3.4F, 12F);
		leftTrackWheelModels[34].rotateAngleZ = 0.78539816F;

		leftTrackWheelModels[35].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 114
		leftTrackWheelModels[35].setRotationPoint(15.8F, -3.4F, 12F);
		leftTrackWheelModels[35].rotateAngleZ = 0.78539816F;


		rightTrackWheelModels = new ModelRendererTurbo[37];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 46
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131

		rightTrackWheelModels[0].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 43
		rightTrackWheelModels[0].setRotationPoint(34.5F, -1.5F, -21F);

		rightTrackWheelModels[1].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		rightTrackWheelModels[1].setRotationPoint(34.5F, -1.5F, -21F);

		rightTrackWheelModels[2].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 45
		rightTrackWheelModels[2].setRotationPoint(24.5F, 5.2F, -21F);

		rightTrackWheelModels[3].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 46
		rightTrackWheelModels[3].setRotationPoint(24.5F, 5.2F, -21F);

		rightTrackWheelModels[4].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 47
		rightTrackWheelModels[4].setRotationPoint(24.5F, 5.2F, -21F);

		rightTrackWheelModels[5].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightTrackWheelModels[5].setRotationPoint(24.5F, 5.2F, -21F);

		rightTrackWheelModels[6].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightTrackWheelModels[6].setRotationPoint(34.5F, -1.5F, -21F);

		rightTrackWheelModels[7].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightTrackWheelModels[7].setRotationPoint(11.8F, 5.2F, -21F);

		rightTrackWheelModels[8].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 51
		rightTrackWheelModels[8].setRotationPoint(11.8F, 5.2F, -21F);

		rightTrackWheelModels[9].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 52
		rightTrackWheelModels[9].setRotationPoint(11.8F, 5.2F, -21F);

		rightTrackWheelModels[10].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightTrackWheelModels[10].setRotationPoint(-1.2F, 5.2F, -21F);

		rightTrackWheelModels[11].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 54
		rightTrackWheelModels[11].setRotationPoint(-1.2F, 5.2F, -21F);

		rightTrackWheelModels[12].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 55
		rightTrackWheelModels[12].setRotationPoint(-1.2F, 5.2F, -21F);

		rightTrackWheelModels[13].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackWheelModels[13].setRotationPoint(-14.7F, 5.2F, -21F);

		rightTrackWheelModels[14].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 57
		rightTrackWheelModels[14].setRotationPoint(-14.7F, 5.2F, -21F);

		rightTrackWheelModels[15].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 58
		rightTrackWheelModels[15].setRotationPoint(-14.7F, 5.2F, -21F);

		rightTrackWheelModels[16].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightTrackWheelModels[16].setRotationPoint(-28.7F, 5.2F, -21F);

		rightTrackWheelModels[17].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 60
		rightTrackWheelModels[17].setRotationPoint(-28.7F, 5.2F, -21F);

		rightTrackWheelModels[18].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 61
		rightTrackWheelModels[18].setRotationPoint(-28.7F, 5.2F, -21F);

		rightTrackWheelModels[19].addShapeBox(-4F, -4F, 0F, 8, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightTrackWheelModels[19].setRotationPoint(-40.2F, 5.2F, -21F);

		rightTrackWheelModels[20].addShapeBox(-4F, 2F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 63
		rightTrackWheelModels[20].setRotationPoint(-40.2F, 5.2F, -21F);

		rightTrackWheelModels[21].addBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F); // Box 64
		rightTrackWheelModels[21].setRotationPoint(-37.2F, -3.4F, -21F);

		rightTrackWheelModels[22].addBox(-5F, -2F, 0F, 10, 4, 8, 0F); // Box 86
		rightTrackWheelModels[22].setRotationPoint(-52.8F, -0.8F, -22F);

		rightTrackWheelModels[23].addShapeBox(-5F, -5F, 0F, 10, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		rightTrackWheelModels[23].setRotationPoint(-52.8F, -0.8F, -22F);

		rightTrackWheelModels[24].addShapeBox(-5F, 2F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 88
		rightTrackWheelModels[24].setRotationPoint(-52.8F, -0.8F, -22F);

		rightTrackWheelModels[25].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		rightTrackWheelModels[25].setRotationPoint(-37.2F, -3.4F, -21F);

		rightTrackWheelModels[26].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 93
		rightTrackWheelModels[26].setRotationPoint(-37.2F, -3.4F, -21F);

		rightTrackWheelModels[27].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 94
		rightTrackWheelModels[27].setRotationPoint(-11.1F, -3.4F, -21F);

		rightTrackWheelModels[28].addBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F); // Box 95
		rightTrackWheelModels[28].setRotationPoint(-11.1F, -3.4F, -21F);

		rightTrackWheelModels[29].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightTrackWheelModels[29].setRotationPoint(-11.1F, -3.4F, -21F);

		rightTrackWheelModels[30].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 97
		rightTrackWheelModels[30].setRotationPoint(16.4F, -3.4F, -21F);

		rightTrackWheelModels[31].addBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F); // Box 98
		rightTrackWheelModels[31].setRotationPoint(16.4F, -3.4F, -21F);

		rightTrackWheelModels[32].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightTrackWheelModels[32].setRotationPoint(16.4F, -3.4F, -21F);

		rightTrackWheelModels[33].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 5, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		rightTrackWheelModels[33].setRotationPoint(-37.2F, -3.4F, -17F);
		rightTrackWheelModels[33].rotateAngleZ = 0.78539816F;

		rightTrackWheelModels[34].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 5, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		rightTrackWheelModels[34].setRotationPoint(-11.2F, -3.4F, -17F);
		rightTrackWheelModels[34].rotateAngleZ = 0.78539816F;

		rightTrackWheelModels[35].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 5, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		rightTrackWheelModels[35].setRotationPoint(15.8F, -3.4F, -17F);
		rightTrackWheelModels[35].rotateAngleZ = 0.78539816F;

		rightTrackWheelModels[36].addBox(-4F, -2F, 0F, 8, 4, 5, 0F); // Box 131
		rightTrackWheelModels[36].setRotationPoint(-40.2F, 5.2F, -21F);


		leftTrackModel = new ModelRendererTurbo[19];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		leftTrackModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		leftTrackModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		leftTrackModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		leftTrackModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		leftTrackModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		leftTrackModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		leftTrackModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		leftTrackModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		leftTrackModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		leftTrackModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		leftTrackModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		leftTrackModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		leftTrackModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		leftTrackModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 153
		leftTrackModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154

		leftTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 9, 0F); // Box 136
		leftTrackModel[0].setRotationPoint(-53.3F, -6.8F, 14F);
		leftTrackModel[0].rotateAngleZ = 0.01745329F;

		leftTrackModel[1].addBox(0F, 0F, 0F, 53, 1, 9, 0F); // Box 137
		leftTrackModel[1].setRotationPoint(-36.3F, -7.1F, 14F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 18, 1, 9, 0F); // Box 138
		leftTrackModel[2].setRotationPoint(16.5F, -7.1F, 14F);
		leftTrackModel[2].rotateAngleZ = -0.03490659F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 139
		leftTrackModel[3].setRotationPoint(34.5F, -6.5F, 14F);
		leftTrackModel[3].rotateAngleZ = -0.29670597F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 140
		leftTrackModel[4].setRotationPoint(37.4F, -5.6F, 14F);
		leftTrackModel[4].rotateAngleZ = -0.83775804F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 141
		leftTrackModel[5].setRotationPoint(38.65F, -4.2F, 14F);
		leftTrackModel[5].rotateAngleZ = -1.27409035F;

		leftTrackModel[6].addBox(-1F, 0F, 0F, 1, 3, 9, 0F); // Box 142
		leftTrackModel[6].setRotationPoint(39.5F, -1.3F, 14F);
		leftTrackModel[6].rotateAngleZ = -0.29670597F;

		leftTrackModel[7].addBox(-1F, 0F, 0F, 1, 13, 9, 0F); // Box 143
		leftTrackModel[7].setRotationPoint(38.6F, 1.55F, 14F);
		leftTrackModel[7].rotateAngleZ = -0.9424778F;

		leftTrackModel[8].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 144
		leftTrackModel[8].setRotationPoint(25F, 9F, 14F);
		leftTrackModel[8].rotateAngleZ = 0.27925268F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 66, 1, 9, 0F); // Box 145
		leftTrackModel[9].setRotationPoint(-40.5F, 9F, 14F);

		leftTrackModel[10].addBox(-1.9F, 0F, 0F, 2, 1, 9, 0F); // Box 146
		leftTrackModel[10].setRotationPoint(-40.5F, 9F, 14F);
		leftTrackModel[10].rotateAngleZ = -0.12217305F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 147
		leftTrackModel[11].setRotationPoint(-54F, 4.5F, 14F);
		leftTrackModel[11].rotateAngleZ = -0.34906585F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 148
		leftTrackModel[12].setRotationPoint(-56F, 3F, 14F);
		leftTrackModel[12].rotateAngleZ = -0.61086524F;

		leftTrackModel[13].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 149
		leftTrackModel[13].setRotationPoint(-58.2F, 1.2F, 14F);
		leftTrackModel[13].rotateAngleZ = 0.55850536F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 150
		leftTrackModel[14].setRotationPoint(-58.4F, -0.8F, 14F);
		leftTrackModel[14].rotateAngleZ = 0.10471976F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 151
		leftTrackModel[15].setRotationPoint(-58.3F, -2.8F, 14F);
		leftTrackModel[15].rotateAngleZ = -0.06981317F;

		leftTrackModel[16].addBox(0F, 0.3F, 0F, 1, 2, 9, 0F); // Box 152
		leftTrackModel[16].setRotationPoint(-57.1F, -4.8F, 14F);
		leftTrackModel[16].rotateAngleZ = -0.55850536F;

		leftTrackModel[17].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 153
		leftTrackModel[17].setRotationPoint(-57.3F, -4.6F, 14F);
		leftTrackModel[17].rotateAngleZ = 0.61086524F;

		leftTrackModel[18].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 154
		leftTrackModel[18].setRotationPoint(-54.8F, -6.5F, 14F);
		leftTrackModel[18].rotateAngleZ = 0.17453293F;


		rightTrackModel = new ModelRendererTurbo[19];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		rightTrackModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		rightTrackModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		rightTrackModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		rightTrackModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		rightTrackModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		rightTrackModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		rightTrackModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		rightTrackModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		rightTrackModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		rightTrackModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		rightTrackModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		rightTrackModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		rightTrackModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		rightTrackModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135

		rightTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 9, 0F); // Box 116
		rightTrackModel[0].setRotationPoint(-53.3F, -6.8F, -23F);
		rightTrackModel[0].rotateAngleZ = 0.01745329F;

		rightTrackModel[1].addBox(0F, 0F, 0F, 53, 1, 9, 0F); // Box 117
		rightTrackModel[1].setRotationPoint(-36.3F, -7.1F, -23F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 18, 1, 9, 0F); // Box 118
		rightTrackModel[2].setRotationPoint(16.5F, -7.1F, -23F);
		rightTrackModel[2].rotateAngleZ = -0.03490659F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 119
		rightTrackModel[3].setRotationPoint(34.5F, -6.5F, -23F);
		rightTrackModel[3].rotateAngleZ = -0.29670597F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 120
		rightTrackModel[4].setRotationPoint(37.4F, -5.6F, -23F);
		rightTrackModel[4].rotateAngleZ = -0.83775804F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 121
		rightTrackModel[5].setRotationPoint(38.65F, -4.2F, -23F);
		rightTrackModel[5].rotateAngleZ = -1.27409035F;

		rightTrackModel[6].addBox(-1F, 0F, 0F, 1, 3, 9, 0F); // Box 122
		rightTrackModel[6].setRotationPoint(39.5F, -1.3F, -23F);
		rightTrackModel[6].rotateAngleZ = -0.29670597F;

		rightTrackModel[7].addBox(-1F, 0F, 0F, 1, 13, 9, 0F); // Box 123
		rightTrackModel[7].setRotationPoint(38.6F, 1.55F, -23F);
		rightTrackModel[7].rotateAngleZ = -0.9424778F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 124
		rightTrackModel[8].setRotationPoint(25F, 9F, -23F);
		rightTrackModel[8].rotateAngleZ = 0.27925268F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 66, 1, 9, 0F); // Box 125
		rightTrackModel[9].setRotationPoint(-40.5F, 9F, -23F);

		rightTrackModel[10].addBox(-1.9F, 0F, 0F, 2, 1, 9, 0F); // Box 126
		rightTrackModel[10].setRotationPoint(-40.5F, 9F, -23F);
		rightTrackModel[10].rotateAngleZ = -0.12217305F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 127
		rightTrackModel[11].setRotationPoint(-54F, 4.5F, -23F);
		rightTrackModel[11].rotateAngleZ = -0.34906585F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 128
		rightTrackModel[12].setRotationPoint(-56F, 3F, -23F);
		rightTrackModel[12].rotateAngleZ = -0.61086524F;

		rightTrackModel[13].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 129
		rightTrackModel[13].setRotationPoint(-58.2F, 1.2F, -23F);
		rightTrackModel[13].rotateAngleZ = 0.55850536F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 130
		rightTrackModel[14].setRotationPoint(-58.4F, -0.8F, -23F);
		rightTrackModel[14].rotateAngleZ = 0.10471976F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 132
		rightTrackModel[15].setRotationPoint(-58.3F, -2.8F, -23F);
		rightTrackModel[15].rotateAngleZ = -0.06981317F;

		rightTrackModel[16].addBox(0F, 0.3F, 0F, 1, 2, 9, 0F); // Box 133
		rightTrackModel[16].setRotationPoint(-57.1F, -4.8F, -23F);
		rightTrackModel[16].rotateAngleZ = -0.55850536F;

		rightTrackModel[17].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 134
		rightTrackModel[17].setRotationPoint(-57.3F, -4.6F, -23F);
		rightTrackModel[17].rotateAngleZ = 0.61086524F;

		rightTrackModel[18].addBox(0F, 0F, 0F, 2, 1, 9, 0F); // Box 135
		rightTrackModel[18].setRotationPoint(-54.8F, -6.5F, -23F);
		rightTrackModel[18].rotateAngleZ = 0.17453293F;
		
		
		
		turretModel = new ModelRendererTurbo[28];
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		turretModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 214
		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116

		turretModel[0].addShapeBox(5.5F, 0F, -16F, 10, 10, 32, 0F,0F, 0F, -4F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -3F, -4.5F, 2F, -3F, -4.5F, 0F, 0F, 0F); // Box 203
		turretModel[0].setRotationPoint(0F, -26F, 0F);

		turretModel[1].addShapeBox(-0.5F, 0F, -16F, 6, 10, 32, 0F,0F, 0F, -2.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 204
		turretModel[1].setRotationPoint(0F, -26F, 0F);

		turretModel[2].addShapeBox(-14.5F, 0F, -16F, 14, 10, 32, 0F,0F, 0F, -4F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, 3F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 3F, 0F, -1F); // Box 205
		turretModel[2].setRotationPoint(0F, -26F, 0F);

		turretModel[3].addShapeBox(-18.5F, 0F, -16F, 4, 10, 32, 0F,-1F, 0F, -9.5F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -9.5F, 2F, 0F, -4F, -3F, 0F, -1F, -3F, 0F, -1F, 2F, 0F, -4F); // Box 207
		turretModel[3].setRotationPoint(0F, -26F, 0F);

		turretModel[4].addShapeBox(-20.5F, 0F, -16F, 4, 10, 32, 0F,-1.5F, 0F, -14F, -1F, 0F, -9.5F, -1F, 0F, -9.5F, -1.5F, 0F, -14F, 2F, 0F, -10F, -4F, 0F, -4F, -4F, 0F, -4F, 2F, 0F, -10F); // Box 208
		turretModel[4].setRotationPoint(0F, -26F, 0F);

		turretModel[5].addBox(-11.5F, 0F, -11.5F, 6, 3, 12, 0F); // Box 209
		turretModel[5].setRotationPoint(0F, -28.5F, 0F);

		turretModel[6].addShapeBox(-14.5F, 0F, -11.5F, 3, 3, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 210
		turretModel[6].setRotationPoint(0F, -28.5F, 0F);

		turretModel[7].addShapeBox(-5.5F, 0F, -11.5F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 211
		turretModel[7].setRotationPoint(0F, -28.5F, 0F);

		turretModel[8].addShapeBox(-11.5F, 0F, -11.5F, 6, 2, 12, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		turretModel[8].setRotationPoint(0F, -30.5F, 0F);

		turretModel[9].addShapeBox(-14.5F, 0F, -11.5F, 3, 2, 12, 0F,-2F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -2F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 213
		turretModel[9].setRotationPoint(0F, -30.5F, 0F);

		turretModel[10].addShapeBox(-5.5F, 0F, -11.5F, 3, 2, 12, 0F,0F, -0.5F, -2F, -2F, -0.5F, -3F, -2F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 214
		turretModel[10].setRotationPoint(0F, -30.5F, 0F);

		turretModel[11].addShapeBox(-14.5F, 0F, -16F, 14, 10, 10, 0F,-2F, -3.5F, -0.5F, -1F, -4F, 0.5F, 0F, 0F, -7.5F, 0F, 0F, -6F, 3F, 0F, -1F, 0F, 0F, 1.5F, 17F, -4F, -5.35F, 3F, 0F, -1F); // Box 89
		turretModel[11].setRotationPoint(0F, -26F, 0F);

		turretModel[12].addShapeBox(-23F, 0F, -10F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[12].setRotationPoint(0F, -22.5F, 0F);

		turretModel[13].addShapeBox(-23F, 0F, -10F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 92
		turretModel[13].setRotationPoint(0F, -19.5F, 0F);

		turretModel[14].addBox(-23F, 0F, -10F, 1, 2, 4, 0F); // Box 93
		turretModel[14].setRotationPoint(0F, -21.5F, 0F);

		turretModel[15].addShapeBox(-26.2F, 0F, -8.5F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 94
		turretModel[15].setRotationPoint(0F, -20.9F, 0F);

		turretModel[16].addShapeBox(-24.2F, 0F, -8.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95
		turretModel[16].setRotationPoint(0F, -20.4F, 0F);

		turretModel[17].addBox(-22.5F, 0F, -9F, 4, 2, 2, 0F); // Box 96
		turretModel[17].setRotationPoint(0F, -21.5F, 0F);

		turretModel[18].addShapeBox(-22.5F, 0F, -10F, 4, 4, 4, 0F,-1.5F, 1F, 0.5F, 5F, 2.5F, 3F, 0F, 2F, 3F, -1.5F, 1F, 1F, 0F, 1F, 1F, 2F, 0F, 3F, -1F, 3F, 11F, 0F, 1F, 1F); // Box 97
		turretModel[18].setRotationPoint(0F, -22.5F, 0F);

		turretModel[19].addShapeBox(-0.5F, 0F, -16F, 6, 3, 32, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 98
		turretModel[19].setRotationPoint(0F, -16F, 0F);

		turretModel[20].addShapeBox(-14.5F, 0F, -16F, 14, 3, 32, 0F,3F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 3F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 99
		turretModel[20].setRotationPoint(0F, -16F, 0F);

		turretModel[21].addShapeBox(-18.5F, 0F, -16F, 4, 3, 32, 0F,2F, 0F, -4F, -3F, 0F, -1F, -3F, 0F, -1F, 2F, 0F, -4F, -1F, 0F, -5.5F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -5.5F); // Box 100
		turretModel[21].setRotationPoint(0F, -16F, 0F);

		turretModel[22].addShapeBox(-20.5F, 0F, -16F, 4, 3, 32, 0F,2F, 0F, -10F, -4F, 0F, -4F, -4F, 0F, -4F, 2F, 0F, -10F, -1.5F, 0F, -14F, -1F, 0F, -5.5F, -1F, 0F, -5.5F, -1.5F, 0F, -14F); // Box 101
		turretModel[22].setRotationPoint(0F, -16F, 0F);

		turretModel[23].addShapeBox(5.5F, 0F, -16F, 10, 5, 32, 0F,0F, 0F, 0F, 2F, 3F, -4.5F, 2F, 3F, -4.5F, 0F, 0F, 0F, 0F, -2F, -1F, 1F, -2.5F, -8F, 1F, -2.5F, -8F, 0F, -2F, -1F); // Box 102
		turretModel[23].setRotationPoint(0F, -16F, 0F);

		turretModel[24].addShapeBox(19.5F, 0F, -12F, 10, 5, 24, 0F,2F, 3F, -0.5F, -6F, 3F, -6F, -6F, 3F, -6F, 2F, 3F, -0.5F, 3F, -2.5F, -4F, -8F, -5F, -6F, -8F, -5F, -6F, 3F, -2.5F, -4F); // Box 103
		turretModel[24].setRotationPoint(0F, -16F, 0F);

		turretModel[25].addShapeBox(19.5F, 0F, -12F, 10, 5, 24, 0F,4F, -2.5F, -2F, -8F, -5F, -6F, -8F, -5F, -6F, 4F, -2.5F, -2F, 2F, 3F, -0.5F, -6F, 3F, -6F, -6F, 3F, -6F, 2F, 3F, -0.5F); // Box 104
		turretModel[25].setRotationPoint(0F, -27F, 0F);

		turretModel[26].addShapeBox(19.5F, 0F, -6.5F, 10, 2, 12, 0F,4F, 0F, 0F, -10F, 1F, 0F, -10F, 1F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -7F, -1.5F, 0F, -7F, -1.5F, 0F, 2F, 0F, 0F); // Box 105
		turretModel[26].setRotationPoint(0F, -24.3F, 0F);

		turretModel[27].addShapeBox(-0.5F, 0F, -16F, 16, 1, 32, 0F,0F, 0F, -2.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2.5F); // Box 116
		turretModel[27].setRotationPoint(0F, -26F, 0F);
		turretModel[27].rotateAngleZ = -0.03490659F;


		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		barrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		barrelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		barrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		barrelModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		barrelModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		barrelModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		barrelModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		barrelModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115

		barrelModel[0].addShapeBox(2.5F, -7.5F, -6F, 10, 5, 11, 0F,2F, -2.5F, 0F, -11F, -3.5F, 0F, -11F, -3.5F, 0F, 2F, -2.5F, 0F, 6F, 2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 6F, 2F, 0F); // Box 106
		barrelModel[0].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[1].addShapeBox(0.5F, -2.5F, -6F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3F, -0.2F, 0F, 0.5F, -2.3F, 0F, 0.5F, -2.3F, 0F, -2.3F, -0.2F, 0F); // Box 107
		barrelModel[1].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[2].addShapeBox(-0.2F, 2.3F, -6F, 3, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, -0.7F, 0F, -1.4F, -0.7F, 0F, 0F, 0F, 0F); // Box 108
		barrelModel[2].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[3].addShapeBox(1.5F, -2.5F, -4F, 3, 5, 5, 0F,1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F); // Box 109
		barrelModel[3].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[4].addShapeBox(3F, -2.5F, -4F, 3, 5, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		barrelModel[4].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[5].addShapeBox(6F, -2.5F, -4F, 5, 5, 5, 0F,0F, -0.55F, -0.55F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -0.55F, -0.55F); // Box 111
		barrelModel[5].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[6].addShapeBox(11F, -2.5F, -4F, 46, 5, 5, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 112
		barrelModel[6].setRotationPoint(20F, -19.5F, 0F);

		barrelModel[7].addShapeBox(58F, -2.5F, -4F, 2, 5, 5, 0F,0F, -1.1F, -1.1F, 0.4F, -1.1F, -1.1F, 0.4F, -1.1F, -1.1F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F, 0.4F, -1.1F, -1.1F, 0.4F, -1.1F, -1.1F, 0F, -1.1F, -1.1F); // Box 113
		barrelModel[7].setRotationPoint(18.5F, -19.5F, 0F);

		barrelModel[8].addShapeBox(60.2F, -2.5F, -4F, 3, 5, 5, 0F,0F, -1.1F, -1.1F, 0.4F, -0.6F, -0.6F, 0.4F, -0.6F, -0.6F, 0F, -1.1F, -1.1F, 0F, -1.1F, -1.1F, 0.4F, -0.6F, -0.6F, 0.4F, -0.6F, -0.6F, 0F, -1.1F, -1.1F); // Box 114
		barrelModel[8].setRotationPoint(18.5F, -19.5F, 0F);

		barrelModel[9].addShapeBox(63.6F, -2.5F, -4F, 3, 5, 5, 0F,0F, -0.6F, -0.6F, 1.5F, -0.6F, -0.6F, 1.5F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 1.5F, -0.6F, -0.6F, 1.5F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 115
		barrelModel[9].setRotationPoint(18.5F, -19.5F, 0F);





		translateAll(0F, -3F, 0F);


		flipAll();
	}
}