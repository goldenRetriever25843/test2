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

public class ModelXM177 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelXM177() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[57];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 13
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 24
		gunModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 30
		gunModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 31
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 32
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 33
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 34
		gunModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 35
		gunModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 36
		gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 19
		gunModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 20
		gunModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		gunModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 22
		gunModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 32
		gunModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 33
		gunModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 34
		gunModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 35
		gunModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 36
		gunModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 37
		gunModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 38
		gunModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 39
		gunModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 40
		gunModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 0
		gunModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 43
		gunModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
		gunModel[37] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 47
		gunModel[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 47
		gunModel[39] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		gunModel[40] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		gunModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 50
		gunModel[42] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 51
		gunModel[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
		gunModel[44] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 54
		gunModel[45] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		gunModel[46] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 56
		gunModel[47] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box1
		gunModel[49] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box2
		gunModel[50] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box3
		gunModel[51] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import Box6
		gunModel[52] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box7
		gunModel[53] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 63
		gunModel[54] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 64
		gunModel[55] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 65
		gunModel[56] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 66

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(-0.2F, -4.8F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[1].setRotationPoint(5.5F, -4.7F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[2].setRotationPoint(5.5F, -3.7F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[3].setRotationPoint(5.5F, -4.7F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, 0F, -.5F); // Box 13
		gunModel[4].setRotationPoint(5.5F, -3.7F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 15
		gunModel[5].setRotationPoint(11.5F, -4.2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 22
		gunModel[6].setRotationPoint(11.5F, -4.7F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.3F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F); // Box 24
		gunModel[7].setRotationPoint(14.3F, -4.2F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.6F, -0.8F, -.2F, 0.3F, -0.8F, -.2F, 0.3F, -0.8F, -.2F, -0.6F, -0.8F, -.2F, 0F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0.3F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 30
		gunModel[8].setRotationPoint(11.5F, -6.3F, -0.5F);

		gunModel[9].addShapeBox(0F, -0.6F, 0F, 1, 1, 1, 0F, -0.95F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.95F, -.2F, -.2F, -0.6F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.6F, -.2F, -.2F); // Box 31
		gunModel[9].setRotationPoint(11.5F, -5.7F, -0.5F);
		gunModel[9].rotateAngleX = -0.10471976F;

		gunModel[10].addShapeBox(0F, -0.45F, 0F, 1, 1, 1, 0F, -0.95F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.95F, -.2F, -.2F, -0.6F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.6F, -.2F, -.2F); // Box 32
		gunModel[10].setRotationPoint(11.5F, -5.7F, -1.02F);
		gunModel[10].rotateAngleX = 0.10471976F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.95F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.95F, -.2F, -.2F, -0.6F, -.2F, -0.72F, 0.3F, -.2F, -0.72F, 0.3F, -.2F, -.2F, -0.6F, -.2F, -.2F); // Box 33
		gunModel[11].setRotationPoint(11.5F, -6.3F, -0.75F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, 0F, 0F); // Box 34
		gunModel[12].setRotationPoint(2F, -2.8F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 35
		gunModel[13].setRotationPoint(0F, -2.8F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[14].setRotationPoint(0.4F, -1.8F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F); // Box 19
		gunModel[15].setRotationPoint(0.2F, -1.8F, -0.5F);
		gunModel[15].rotateAngleZ = -0.4712389F;

		gunModel[16].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 20
		gunModel[16].setRotationPoint(0.2F, -1.8F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[17].setRotationPoint(0.2F, -2.8F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -0.7F, 0F); // Box 22
		gunModel[18].setRotationPoint(4F, -2.8F, -0.5F);

		gunModel[19].addShapeBox(0.2F, 2F, 0F, 1, 1, 1, 0F, -0.8F, -0.7F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, -0.7F, 0F, -0.8F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, 0F, 0F); // Box 23
		gunModel[19].setRotationPoint(0.2F, -1.8F, -0.5F);
		gunModel[19].rotateAngleZ = -0.4712389F;

		gunModel[20].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.15F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 26
		gunModel[20].setRotationPoint(5F, -4.7F, 0F);

		gunModel[21].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.15F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.15F, -0.5F); // Box 27
		gunModel[21].setRotationPoint(5F, -3.7F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0.5F, 3, 1, 2, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, -0.5F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 28
		gunModel[22].setRotationPoint(2.4F, -0.9F, -1.5F);
		gunModel[22].rotateAngleZ = 0.15707963F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 29
		gunModel[23].setRotationPoint(4F, -5.6F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.7F, -0.9F, 0F, -0.7F, -0.9F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 30
		gunModel[24].setRotationPoint(0F, -5.9F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[25].setRotationPoint(0F, -5.4F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[26].setRotationPoint(1F, -6.4F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -0.9F, 0F, -0.6F, -0.9F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 34
		gunModel[27].setRotationPoint(1F, -6.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -0.9F, 0F, -0.6F, -0.9F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 35
		gunModel[28].setRotationPoint(1F, -6.5F, 0.4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.7F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.7F, -0.9F, 0F, -0.7F, -0.9F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 36
		gunModel[29].setRotationPoint(0F, -5.9F, -1.4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 37
		gunModel[30].setRotationPoint(0F, -5.9F, -1.6F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[31].setRotationPoint(1F, -5.6F, -0.5F);

		gunModel[32].addShapeBox(-1F, -1F, 0F, 1, 1, 1, 0F, -0.9F, -0.7F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.9F, -0.7F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 39
		gunModel[32].setRotationPoint(5F, -5.2F, -0.5F);
		gunModel[32].rotateAngleZ = 0.54105207F;

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.7F, -1F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 40
		gunModel[33].setRotationPoint(3.9F, -5.6F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.65F, 0.2F, -0.3F, -0.65F, 0.2F, -0.3F, -0.65F, 0.2F, -0.3F, -0.65F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 0
		gunModel[34].setRotationPoint(-0.5F, -5.4F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 43
		gunModel[35].setRotationPoint(2.4F, -3.4F, -0.75F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.6F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 46
		gunModel[36].setRotationPoint(3F, -4.8F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 47
		gunModel[37].setRotationPoint(4F, -4.8F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 47
		gunModel[38].setRotationPoint(2.4F, -4.4F, -0.75F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 48
		gunModel[39].setRotationPoint(2.4F, -3.65F, -0.8F);

		gunModel[40].addShapeBox(0.5F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 49
		gunModel[40].setRotationPoint(0F, -4.1F, -1.3F);
		gunModel[40].rotateAngleY = 0.29670597F;

		gunModel[41].addShapeBox(0.1F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 50
		gunModel[41].setRotationPoint(0F, -4.1F, -1.3F);
		gunModel[41].rotateAngleY = 0.29670597F;

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, -0.8F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 51
		gunModel[42].setRotationPoint(0F, -4.1F, -1.3F);
		gunModel[42].rotateAngleY = 0.29670597F;

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.4F, 0F); // Box 52
		gunModel[43].setRotationPoint(2.6F, -2.5F, -0.45F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.85F, -0.4F, 0F, -0.85F, -0.4F, 0F, -0.85F, -0.4F, -0.5F, -0.85F, -0.4F, -0.65F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.65F, 0F, -0.4F); // Box 54
		gunModel[44].setRotationPoint(0.2F, -6.3F, -1.1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.85F, -0.4F, 0F, -0.85F, -0.4F, 0F, -0.85F, -0.4F, -0.5F, -0.85F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F); // Box 55
		gunModel[45].setRotationPoint(0.2F, -6.45F, -1.1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.65F, -0.85F, -0.4F, -0.15F, -0.85F, -0.4F, -0.15F, -0.85F, -0.4F, -0.65F, -0.85F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F); // Box 56
		gunModel[46].setRotationPoint(0.2F, -6.6F, -1.1F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.1F, 0F); // Import Box0
		gunModel[47].setRotationPoint(-8F, -4.3F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box1
		gunModel[48].setRotationPoint(-8F, -4.55F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F); // Import Box2
		gunModel[49].setRotationPoint(-7.8F, -3.25F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0.7F, -1.6F, -0.3F, 0.7F, -1.6F, -0.3F, 0F, -0.2F, -0.3F); // Import Box3
		gunModel[50].setRotationPoint(-6.3F, -3.25F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box6
		gunModel[51].setRotationPoint(-5.3F, -3.25F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Import Box7
		gunModel[52].setRotationPoint(-4F, -3.25F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 63
		gunModel[53].setRotationPoint(-3F, -3.5F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F); // Box 64
		gunModel[54].setRotationPoint(-3F, -4.35F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 65
		gunModel[55].setRotationPoint(-7.8F, -4.55F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 66
		gunModel[56].setRotationPoint(-0.8F, -4.25F, -0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 40
		ammoModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 41
		ammoModel[2] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 42

		ammoModel[0].addShapeBox(0.7F, -1F, 0F, 3, 2, 1, 0F, -0.45F, -0.44F, -0.05F, -0.45F, -0.7F, -0.05F, -0.45F, -0.7F, -0.05F, -0.45F, -0.44F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F); // Box 40
		ammoModel[0].setRotationPoint(1.95F, 2F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.31415927F;

		ammoModel[1].addShapeBox(0.6F, 0F, 0F, 3, 1, 1, 0F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F); // Box 41
		ammoModel[1].setRotationPoint(1.55F, -1.6F, -0.5F);

		ammoModel[2].addShapeBox(0.61F, 0F, 0F, 3, 2, 1, 0F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, -0.25F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.3F, -0.05F, -0.45F, -0.25F, -0.05F); // Box 42
		ammoModel[2].setRotationPoint(1.55F, -0.45F, -0.5F);
		ammoModel[2].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 45

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F); // Box 45
		slideModel[0].setRotationPoint(2.4F, -4.1F, -0.4F);


		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -0.5F, 0F);

		gunSlideDistance = 0.1F;
		flipAll();
	}
}