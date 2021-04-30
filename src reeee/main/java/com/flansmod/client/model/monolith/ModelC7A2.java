//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelC7A2 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelC7A2() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[73];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 22
		gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 24
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 25
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 30
		gunModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 31
		gunModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 32
		gunModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 33
		gunModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 34
		gunModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 35
		gunModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 36
		gunModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		gunModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 27
		gunModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 28
		gunModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 32
		gunModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		gunModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		gunModel[28] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 46
		gunModel[29] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 47
		gunModel[30] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 47
		gunModel[31] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 48
		gunModel[32] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 49
		gunModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 50
		gunModel[34] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 51
		gunModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 52
		gunModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box1
		gunModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box2
		gunModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box3
		gunModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box6
		gunModel[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box7
		gunModel[42] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 63
		gunModel[43] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 64
		gunModel[44] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 65
		gunModel[45] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 66
		gunModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 211
		gunModel[47] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 213
		gunModel[48] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 214
		gunModel[49] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 216
		gunModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 217
		gunModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 219
		gunModel[52] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 220
		gunModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 219
		gunModel[54] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 221
		gunModel[55] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 222
		gunModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 223
		gunModel[57] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 224
		gunModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 225
		gunModel[59] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 226
		gunModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 227
		gunModel[61] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 228
		gunModel[62] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 229
		gunModel[63] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 230
		gunModel[64] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 244
		gunModel[65] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 245
		gunModel[66] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 246
		gunModel[67] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 247
		gunModel[68] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 248
		gunModel[69] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 249
		gunModel[70] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 250
		gunModel[71] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 212
		gunModel[72] = new ModelRendererTurbo(this, 5, 24, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(-0.2F, -4.8F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -.2F, 0F, -0.5F, -.2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[1].setRotationPoint(5.5F, -4.7F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -0.5F, -.2F, -.5F, -0.5F, -.2F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[2].setRotationPoint(5.5F, -3.7F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -.5F, -0.5F, -.2F, -.5F, -0.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[3].setRotationPoint(5.5F, -4.7F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -.2F, 0F, -0.5F, -.2F, -.5F, 0F, 0F, -.5F); // Box 13
		gunModel[4].setRotationPoint(5.5F, -3.7F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 15
		gunModel[5].setRotationPoint(15F, -4.2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 22
		gunModel[6].setRotationPoint(15F, -4.7F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F); // Box 24
		gunModel[7].setRotationPoint(20F, -4.2F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[8].setRotationPoint(15F, -3.2F, -1F);
		gunModel[8].rotateAngleZ = -0.19198622F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.6F, -0.8F, -.2F, 0.3F, -0.8F, -.2F, 0.3F, -0.8F, -.2F, -0.6F, -0.8F, -.2F, 0F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 30
		gunModel[9].setRotationPoint(15F, -6.3F, -0.5F);

		gunModel[10].addShapeBox(0F, -0.6F, 0F, 1, 1, 1, 0F, -0.95F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.95F, -.2F, -.2F, -0.6F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.6F, -.2F, -.2F); // Box 31
		gunModel[10].setRotationPoint(15F, -5.7F, -0.5F);
		gunModel[10].rotateAngleX = -0.10471976F;

		gunModel[11].addShapeBox(0F, -0.45F, 0F, 1, 1, 1, 0F, -0.95F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.95F, -.2F, -.2F, -0.6F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.6F, -.2F, -.2F); // Box 32
		gunModel[11].setRotationPoint(15F, -5.7F, -1.02F);
		gunModel[11].rotateAngleX = 0.10471976F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.95F, -.2F, -.2F, -0.6F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.6F, -.2F, -.2F); // Box 33
		gunModel[12].setRotationPoint(15F, -6.3F, -0.75F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, 0F, 0F); // Box 34
		gunModel[13].setRotationPoint(2F, -2.8F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 35
		gunModel[14].setRotationPoint(0F, -2.8F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[15].setRotationPoint(0.4F, -1.8F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F); // Box 19
		gunModel[16].setRotationPoint(0.2F, -1.8F, -0.5F);
		gunModel[16].rotateAngleZ = -0.4712389F;

		gunModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 20
		gunModel[17].setRotationPoint(0.2F, -1.8F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[18].setRotationPoint(0.2F, -2.8F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -0.7F, 0F); // Box 22
		gunModel[19].setRotationPoint(4F, -2.8F, -0.5F);

		gunModel[20].addShapeBox(0.2F, 2F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, -0.7F, 0F, -0.8F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, 0F, 0F); // Box 23
		gunModel[20].setRotationPoint(0.2F, -1.8F, -0.5F);
		gunModel[20].rotateAngleZ = -0.4712389F;

		gunModel[21].addShapeBox(0.2F, 0.5F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, -0.7F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 24
		gunModel[21].setRotationPoint(0.2F, -1.8F, -0.5F);
		gunModel[21].rotateAngleZ = -0.4712389F;

		gunModel[22].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.15F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 26
		gunModel[22].setRotationPoint(5F, -4.7F, 0F);

		gunModel[23].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.15F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.15F, -0.5F); // Box 27
		gunModel[23].setRotationPoint(5F, -3.7F, 0F);

		gunModel[24].addShapeBox(0F, 0F, 0.5F, 3, 1, 2, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 28
		gunModel[24].setRotationPoint(2.4F, -0.9F, -1.5F);
		gunModel[24].rotateAngleZ = 0.15707963F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[25].setRotationPoint(0F, -5.4F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.65F, 0.2F, -0.3F, -0.65F, 0.2F, -0.3F, -0.65F, 0.2F, -0.3F, -0.65F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 0
		gunModel[26].setRotationPoint(-0.5F, -5.4F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 43
		gunModel[27].setRotationPoint(2.4F, -3.4F, -0.75F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.6F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 46
		gunModel[28].setRotationPoint(3F, -4.8F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 47
		gunModel[29].setRotationPoint(4F, -4.8F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 47
		gunModel[30].setRotationPoint(2.4F, -4.4F, -0.75F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 48
		gunModel[31].setRotationPoint(2.4F, -3.65F, -0.8F);

		gunModel[32].addShapeBox(0.5F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 49
		gunModel[32].setRotationPoint(0F, -4.1F, -1.3F);
		gunModel[32].rotateAngleY = 0.29670597F;

		gunModel[33].addShapeBox(0.1F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 50
		gunModel[33].setRotationPoint(0F, -4.1F, -1.3F);
		gunModel[33].rotateAngleY = 0.29670597F;

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 51
		gunModel[34].setRotationPoint(0F, -4.1F, -1.3F);
		gunModel[34].rotateAngleY = 0.29670597F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.4F, 0F); // Box 52
		gunModel[35].setRotationPoint(2.6F, -2.5F, -0.45F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.1F, 0F); // Import Box0
		gunModel[36].setRotationPoint(-8F, -4.3F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box1
		gunModel[37].setRotationPoint(-8F, -4.55F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F); // Import Box2
		gunModel[38].setRotationPoint(-7.8F, -3.25F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0.7F, -1.6F, -0.3F, 0.7F, -1.6F, -0.3F, 0F, -0.2F, -0.3F); // Import Box3
		gunModel[39].setRotationPoint(-6.3F, -3.25F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box6
		gunModel[40].setRotationPoint(-5.3F, -3.25F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Import Box7
		gunModel[41].setRotationPoint(-4F, -3.25F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 63
		gunModel[42].setRotationPoint(-3F, -3.5F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F); // Box 64
		gunModel[43].setRotationPoint(-3F, -4.35F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 65
		gunModel[44].setRotationPoint(-7.8F, -4.55F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 66
		gunModel[45].setRotationPoint(-0.8F, -4.25F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 211
		gunModel[46].setRotationPoint(1.2F, -5.6F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 213
		gunModel[47].setRotationPoint(1.2F, -6F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 214
		gunModel[48].setRotationPoint(1.2F, -6.05F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.4F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 216
		gunModel[49].setRotationPoint(0.2F, -6.5F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.4F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0.4F, -0.2F, -0.45F, 0.4F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0.4F, -0.2F, -0.45F); // Box 217
		gunModel[50].setRotationPoint(0.2F, -6.6F, -1.05F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.4F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 219
		gunModel[51].setRotationPoint(0.2F, -7.6F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.4F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0.4F, -0.2F, -0.45F, 0.4F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0.4F, -0.2F, -0.45F); // Box 220
		gunModel[52].setRotationPoint(0.2F, -6.6F, 0.05F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.6F, -0.9F, 0.4F, -0.6F, -0.9F); // Box 219
		gunModel[53].setRotationPoint(0.2F, -5.8F, -0.6F);
		gunModel[53].rotateAngleX = 0.76794487F;

		gunModel[54].addShapeBox(0F, 0F, -0.1F, 3, 1, 1, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.57F, -0.9F, 0.4F, -0.57F, -0.9F); // Box 221
		gunModel[54].setRotationPoint(0.2F, -5.8F, 0.6F);
		gunModel[54].rotateAngleX = -0.76794487F;

		gunModel[55].addShapeBox(0F, -0.4F, 0F, 3, 1, 1, 0F, 0.4F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.9F, 0.4F, -0.6F, -0.9F); // Box 222
		gunModel[55].setRotationPoint(0.2F, -6.4F, -0.6F);
		gunModel[55].rotateAngleX = -0.76794487F;

		gunModel[56].addShapeBox(0F, -0.4F, -0.1F, 3, 1, 1, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.03F, -0.9F, 0.4F, 0.03F, -0.9F, 0.4F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.9F, 0.4F, -0.6F, -0.9F); // Box 223
		gunModel[56].setRotationPoint(0.2F, -6.4F, 0.6F);
		gunModel[56].rotateAngleX = 0.76794487F;

		gunModel[57].addShapeBox(0F, 0F, -0.1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.57F, -0.8F, 0F, -0.57F, -0.8F); // Box 224
		gunModel[57].setRotationPoint(2.3F, -5.8F, 0.6F);
		gunModel[57].rotateAngleX = -0.76794487F;

		gunModel[58].addShapeBox(0F, 0F, -0.1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.57F, 0F, -0.1F, -0.57F, 0F, -0.1F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 225
		gunModel[58].setRotationPoint(2.3F, -5.8F, -0.6F);
		gunModel[58].rotateAngleX = 0.76794487F;

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 226
		gunModel[59].setRotationPoint(2.3F, -6.6F, -1.1F);

		gunModel[60].addShapeBox(0F, -0.4F, -0.1F, 1, 1, 1, 0F, 0F, 0.03F, 0F, 0.4F, 0.03F, 0F, 0.4F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 227
		gunModel[60].setRotationPoint(2.3F, -6.4F, -0.6F);
		gunModel[60].rotateAngleX = -0.76794487F;

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 228
		gunModel[61].setRotationPoint(2.3F, -7.6F, -0.5F);

		gunModel[62].addShapeBox(0F, -0.4F, -0.1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.03F, -0.8F, 0F, 0.03F, -0.8F, 0F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 229
		gunModel[62].setRotationPoint(2.3F, -6.4F, 0.6F);
		gunModel[62].rotateAngleX = 0.76794487F;

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 230
		gunModel[63].setRotationPoint(2.3F, -6.6F, 0.1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.02F, -0.13F, 0F, -0.02F, -0.13F, 0F, -0.02F, -0.13F, 0F, -0.02F, -0.13F); // Box 244
		gunModel[64].setRotationPoint(2.2F, -6.4F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.48F); // Box 245
		gunModel[65].setRotationPoint(2.3F, -6.25F, 0.15F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.48F, -0.45F, 0.2F, -0.48F, -0.45F, 0.2F, -0.48F, -0.48F, 0F, -0.48F, -0.48F, 0F, -0.45F, -0.45F, 0.2F, -0.45F, -0.45F, 0.2F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 246
		gunModel[66].setRotationPoint(2.3F, -6.95F, 0.15F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.45F, 0F, -0.48F, -0.45F); // Box 247
		gunModel[67].setRotationPoint(2.3F, -6.25F, -1.15F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.48F, -0.48F, 0.2F, -0.48F, -0.48F, 0.2F, -0.48F, -0.45F, 0F, -0.48F, -0.45F, 0F, -0.45F, -0.45F, 0.2F, -0.45F, -0.45F, 0.2F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 248
		gunModel[68].setRotationPoint(2.3F, -6.95F, -1.15F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.45F, 0.4F, -0.45F, -0.45F, 0.4F, -0.47F, -0.48F, 0F, -0.47F, -0.48F, 0F, -0.45F, -0.45F, 0.4F, -0.45F, -0.45F, 0.36F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 249
		gunModel[69].setRotationPoint(2.3F, -7.25F, -0.15F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.47F, -0.48F, 0.4F, -0.47F, -0.48F, 0.4F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.36F, -0.45F, -0.45F, 0.4F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 250
		gunModel[70].setRotationPoint(2.3F, -7.25F, -0.85F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 212
		gunModel[71].setRotationPoint(0.2F, -5.6F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 59, 81, 0, 0F, 0F, 0F, 0F, -57.85F, 0F, 0F, -57.85F, 0F, 0F, 0F, 0F, 0F, 0F, -79.7F, 0F, -57.85F, -79.7F, 0F, -57.85F, -79.7F, 0F, 0F, -79.7F, 0F); // Box 0
		gunModel[72].setRotationPoint(3.5F, -2.6F, 0.51F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 40
		ammoModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 41
		ammoModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 42

		ammoModel[0].addShapeBox(0.7F, -1F, 0F, 3, 2, 1, 0F, -0.45F, -0.44F, -0.05F, -0.45F, -0.7F, -0.05F, -0.45F, -0.7F, -0.05F, -0.45F, -0.44F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F); // Box 40
		ammoModel[0].setRotationPoint(1.95F, 2F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.31415927F;

		ammoModel[1].addShapeBox(0.6F, 0F, 0F, 3, 1, 1, 0F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F); // Box 41
		ammoModel[1].setRotationPoint(1.55F, -1.6F, -0.5F);

		ammoModel[2].addShapeBox(0.61F, 0F, 0F, 3, 2, 1, 0F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, -0.25F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.25F, -0.05F); // Box 42
		ammoModel[2].setRotationPoint(1.55F, -0.45F, -0.5F);
		ammoModel[2].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 45

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F); // Box 45
		slideModel[0].setRotationPoint(2.4F, -4.1F, -0.4F);


		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -0.5F, 0F);
		gunSlideDistance = 0.1F;

		flipAll();
	}
}