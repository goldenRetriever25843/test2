//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEliteQBZ extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteQBZ()
	{
		gunModel = new ModelRendererTurbo[53];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		gunModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		gunModel[17] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 25
		gunModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 26
		gunModel[19] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 30
		gunModel[24] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 31
		gunModel[25] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 32
		gunModel[26] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 33
		gunModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 43
		gunModel[28] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 44
		gunModel[29] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 45
		gunModel[30] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 46
		gunModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 47
		gunModel[32] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 48
		gunModel[33] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 49
		gunModel[34] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 50
		gunModel[35] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 51
		gunModel[36] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 52
		gunModel[37] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 54
		gunModel[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 55
		gunModel[39] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 56
		gunModel[40] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 57
		gunModel[41] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 59
		gunModel[42] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 60
		gunModel[43] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 61
		gunModel[44] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 62
		gunModel[45] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 63
		gunModel[46] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 64
		gunModel[47] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 65
		gunModel[48] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 66
		gunModel[49] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 67
		gunModel[50] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 68
		gunModel[51] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 69
		gunModel[52] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 70

		gunModel[0].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 0
		gunModel[0].setRotationPoint(-28F, -6.7F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 2
		gunModel[1].setRotationPoint(6F, -5.8F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 3
		gunModel[2].setRotationPoint(6F, -3.8F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.1F, 0F); // Box 4
		gunModel[3].setRotationPoint(-7F, -5.9F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 21, 2, 3, 0F); // Box 5
		gunModel[4].setRotationPoint(-28F, -5.8F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 6
		gunModel[5].setRotationPoint(-11F, -3.8F, -1.5F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 7
		gunModel[6].setRotationPoint(-28F, -3.8F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 8
		gunModel[7].setRotationPoint(-26F, -3.8F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.3F, -0.4F, -2F, -0.3F, -0.4F, -2F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 9
		gunModel[8].setRotationPoint(-28F, -2.1F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Box 10
		gunModel[9].setRotationPoint(-29F, -5.8F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F); // Box 11
		gunModel[10].setRotationPoint(-29F, -8F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.3F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F); // Box 12
		gunModel[11].setRotationPoint(-29F, -1.6F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 13
		gunModel[12].setRotationPoint(-18.5F, -2.1F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 21
		gunModel[13].setRotationPoint(-28F, -7.5F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 22
		gunModel[14].setRotationPoint(-28F, -7.9F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 23
		gunModel[15].setRotationPoint(-25F, -7.5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, -0.7F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.7F, -0.3F); // Box 24
		gunModel[16].setRotationPoint(-25F, -7.9F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 25
		gunModel[17].setRotationPoint(-24F, -7.5F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 26
		gunModel[18].setRotationPoint(-24F, -7.9F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 27
		gunModel[19].setRotationPoint(7F, -6.7F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Box 28
		gunModel[20].setRotationPoint(7F, -3.8F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 29
		gunModel[21].setRotationPoint(15F, -6.7F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 30
		gunModel[22].setRotationPoint(15F, -3.8F, -1.5F);

		gunModel[23].addShapeBox(0F, -1F, 0F, 3, 8, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 30
		gunModel[23].setRotationPoint(-3.5F, -2.9F, -1F);
		gunModel[23].rotateAngleZ = -0.20943951F;

		gunModel[24].addShapeBox(0F, 7F, 0F, 3, 1, 2, 0F,0.2F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.7F, -0.3F, -0.1F, 0.7F, -0.3F, -0.1F, -0.1F, 0F, -0.1F); // Box 31
		gunModel[24].setRotationPoint(-3.5F, -2.9F, -1F);
		gunModel[24].rotateAngleZ = -0.20943951F;

		gunModel[25].addShapeBox(-1F, -1.2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 32
		gunModel[25].setRotationPoint(-5.5F, -1.9F, -1F);
		gunModel[25].rotateAngleZ = -0.34906585F;

		gunModel[26].addShapeBox(0F, -3F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 33
		gunModel[26].setRotationPoint(-3.9F, -1F, -1F);
		gunModel[26].rotateAngleZ = -0.34906585F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 43
		gunModel[27].setRotationPoint(17.6F, -6F, -1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 44
		gunModel[28].setRotationPoint(18.4F, -5.4F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 1.8F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 1.8F, -0.1F, -0.4F); // Box 45
		gunModel[29].setRotationPoint(6F, -8.2F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 46
		gunModel[30].setRotationPoint(16.6F, -7.8F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-1.4F, 0F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.4F, -1.4F, 0F, -0.4F, 0.8F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.4F, 0.8F, -0.1F, -0.4F); // Box 47
		gunModel[31].setRotationPoint(-11F, -12.5F, 0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-1.4F, 0F, -0.4F, -0.7F, -0.1F, -0.4F, -0.7F, -0.1F, 0F, -1.4F, 0F, 0F, 0.8F, -0.1F, -0.4F, -0.7F, -0.1F, -0.4F, -0.7F, -0.1F, 0F, 0.8F, -0.1F, 0F); // Box 48
		gunModel[32].setRotationPoint(-11F, -12.5F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,-0.7F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.4F, -0.7F, -0.1F, -0.4F, -0.7F, -0.4F, 0F, 0.8F, -0.4F, 0F, 0.8F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F); // Box 49
		gunModel[33].setRotationPoint(-8.4F, -12.5F, 0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,-0.7F, -0.1F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.4F, -0.4F, 0.8F, -0.4F, -0.4F, 0.8F, -0.4F, 0F, -0.7F, -0.4F, 0F); // Box 50
		gunModel[34].setRotationPoint(-8.4F, -12.5F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.7F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -2.7F, -0.1F, 0F, 1.6F, -0.6F, 0F, 1.6F, -0.6F, -0.4F, -2.7F, -0.1F, -0.4F); // Box 51
		gunModel[35].setRotationPoint(3.6F, -11.3F, 0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.7F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0F, -0.7F, -0.4F, 0F, -2.7F, -0.1F, -0.4F, 1.6F, -0.6F, -0.4F, 1.6F, -0.6F, 0F, -2.7F, -0.1F, 0F); // Box 52
		gunModel[36].setRotationPoint(3.6F, -11.3F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -1F, 0F, -0.2F, 0.6F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.6F, 0.3F, 0F); // Box 54
		gunModel[37].setRotationPoint(15F, -11.2F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[38].setRotationPoint(-9.4F, -11.9F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[39].setRotationPoint(-9.4F, -11.9F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[40].setRotationPoint(-9.4F, -12.4F, -1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 59
		gunModel[41].setRotationPoint(-9.4F, -12.4F, -1F);

		gunModel[42].addShapeBox(0F, -3F, 0F, 2, 4, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0.6F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.4F, 0.6F, -0.1F); // Box 60
		gunModel[42].setRotationPoint(4.5F, 0.6F, -1F);
		gunModel[42].rotateAngleZ = -0.31415927F;

		gunModel[43].addShapeBox(0F, -3F, 0F, 4, 2, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.7F, 0F, -0.1F, -1.22F, 0F, -0.1F, -1.22F, 0F, -0.1F, -0.7F, 0F, -0.1F); // Box 61
		gunModel[43].setRotationPoint(4.5F, -0.4F, -1F);

		gunModel[44].addShapeBox(0F, -3F, 0F, 6, 2, 2, 0F,0F, 0.2F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, 0.2F, -0.3F, 0.3F, 0F, -0.3F, -1F, 0.4F, -0.3F, -1F, 0.4F, -0.3F, 0.3F, 0F, -0.3F); // Box 62
		gunModel[44].setRotationPoint(-1F, 2.2F, -1F);

		gunModel[45].addShapeBox(0F, -3F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.7F, 0F, 0F); // Box 63
		gunModel[45].setRotationPoint(1.2F, -0.2F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, -0.5F, 0.35F, -0.7F, -0.5F, 0.35F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 64
		gunModel[46].setRotationPoint(16F, -12.1F, 0F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.7F, -0.5F, 0.35F, -0.7F, -0.5F, 0.35F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 65
		gunModel[47].setRotationPoint(16F, -12.65F, 0F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.2F, -0.4F, 0.35F, -0.2F, -0.4F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[48].setRotationPoint(16F, -12.1F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.35F, -0.2F, -0.4F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 67
		gunModel[49].setRotationPoint(16F, -12.65F, -1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F); // Box 68
		gunModel[50].setRotationPoint(16F, -12F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-1.4F, 0F, -0.4F, -0.7F, -0.1F, -0.4F, -0.7F, -0.1F, 0F, -1.4F, 0F, 0F, 0.8F, -0.1F, -0.4F, -0.7F, -0.1F, -0.4F, -0.7F, -0.1F, 0F, 0.8F, -0.1F, 0F); // Box 69
		gunModel[51].setRotationPoint(-11F, -11.5F, -1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.7F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -2.7F, -0.1F, 0F, 1.6F, -0.6F, 0F, 1.6F, -0.6F, -0.4F, -2.7F, -0.1F, -0.4F); // Box 70
		gunModel[52].setRotationPoint(3.6F, -11.3F, -1F);


		defaultBarrelModel = new ModelRendererTurbo[8];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 35
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 36
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 37
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 38
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 39
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 40
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 41
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 42

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		defaultBarrelModel[0].setRotationPoint(17.5F, -5.35F, -0.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 36
		defaultBarrelModel[1].setRotationPoint(17.5F, -5.35F, -0.5F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 37
		defaultBarrelModel[2].setRotationPoint(17.5F, -5.35F, -0.5F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		defaultBarrelModel[3].setRotationPoint(17.5F, -5.35F, -0.5F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 39
		defaultBarrelModel[4].setRotationPoint(24.25F, -5.85F, -0.9F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 40
		defaultBarrelModel[5].setRotationPoint(24.25F, -4.85F, -0.9F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 41
		defaultBarrelModel[6].setRotationPoint(24.25F, -5.85F, -0.1F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 42
		defaultBarrelModel[7].setRotationPoint(24.25F, -4.85F, -0.1F);


		ammoModel = new ModelRendererTurbo[7];
		ammoModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 14
		ammoModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 15
		ammoModel[2] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 16
		ammoModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 17
		ammoModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 18
		ammoModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 19
		ammoModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20

		ammoModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 14
		ammoModel[0].setRotationPoint(-16.7F, -1.5F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 15
		ammoModel[1].setRotationPoint(-16.42F, 0.5F, -0.5F);
		ammoModel[1].rotateAngleZ = 0.2443461F;

		ammoModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 16
		ammoModel[2].setRotationPoint(-15.95F, 2.4F, -0.5F);
		ammoModel[2].rotateAngleZ = 0.40142573F;

		ammoModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 17
		ammoModel[3].setRotationPoint(-15.2F, 4.2F, -0.5F);
		ammoModel[3].rotateAngleZ = 0.50614548F;

		ammoModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		ammoModel[4].setRotationPoint(-14.3F, 5.9F, -0.5F);
		ammoModel[4].rotateAngleZ = 0.59341195F;

		ammoModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 19
		ammoModel[5].setRotationPoint(-13.2F, 7.6F, -0.5F);
		ammoModel[5].rotateAngleZ = 0.68067841F;

		ammoModel[6].addShapeBox(0F, 2.3F, 0F, 5, 1, 1, 0F,0.1F, 0F, 0.22F, 0.2F, 0F, 0.22F, 0.2F, 0F, 0.22F, 0.1F, 0F, 0.22F, 0.1F, 0F, 0.22F, 0.2F, 0F, 0.22F, 0.2F, 0F, 0.22F, 0.1F, 0F, 0.22F); // Box 20
		ammoModel[6].setRotationPoint(-13.2F, 7.6F, -0.5F);
		ammoModel[6].rotateAngleZ = 0.68067841F;
		
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 53

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 53
		slideModel[0].setRotationPoint(2.6F, -9.3F, -0.5F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.4F;
		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, -1F, 0F);


		flipAll();
	}
}