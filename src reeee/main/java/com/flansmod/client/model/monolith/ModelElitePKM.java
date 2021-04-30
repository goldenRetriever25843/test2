//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelElitePKM extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelElitePKM() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[61];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 39
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 40
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 41
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 43
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 64
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 65
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 77
		gunModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 78
		gunModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 79
		gunModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 80
		gunModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 81
		gunModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 83
		gunModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 84
		gunModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 85
		gunModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 86
		gunModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 87
		gunModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 88
		gunModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 89
		gunModel[19] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 91
		gunModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 92
		gunModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 93
		gunModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 94
		gunModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 95
		gunModel[24] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 96
		gunModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 97
		gunModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 98
		gunModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 99
		gunModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 100
		gunModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 101
		gunModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 102
		gunModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 103
		gunModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 104
		gunModel[33] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 105
		gunModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 106
		gunModel[35] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 107
		gunModel[36] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 109
		gunModel[37] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 110
		gunModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 111
		gunModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 112
		gunModel[40] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 113
		gunModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 114
		gunModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 116
		gunModel[43] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 117
		gunModel[44] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 118
		gunModel[45] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 119
		gunModel[46] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 120
		gunModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 47
		gunModel[48] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
		gunModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
		gunModel[50] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 50
		gunModel[51] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 51
		gunModel[52] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 52
		gunModel[53] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 53
		gunModel[54] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		gunModel[55] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 1
		gunModel[56] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 2
		gunModel[57] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 3
		gunModel[58] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 4
		gunModel[59] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 5
		gunModel[60] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 9

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, -0.6F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.6F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F); // Box 37
		gunModel[0].setRotationPoint(-0.1F, -0.2F, -0.5F);
		gunModel[0].rotateAngleZ = -0.20943951F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 39
		gunModel[1].setRotationPoint(-0.57F, 0.38F, -0.5F);
		gunModel[1].rotateAngleZ = 0.27925268F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 40
		gunModel[2].setRotationPoint(-0.5F, 0F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		gunModel[3].setRotationPoint(-0.05F, 0F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 43
		gunModel[4].setRotationPoint(0.3F, 0.1F, -0.5F);
		gunModel[4].rotateAngleZ = -0.75049158F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F, 0F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.2F, -0.44F, -0.2F, -0.1F, -0.44F, -0.2F); // Box 64
		gunModel[5].setRotationPoint(-0.38F, 1.55F, -0.5F);
		gunModel[5].rotateAngleZ = -0.20943951F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F); // Box 65
		gunModel[6].setRotationPoint(-0.55F, 1.35F, -0.5F);
		gunModel[6].rotateAngleZ = -0.20943951F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.4F, 0F, -0.1F, 0.35F, 0F, -0.1F, 0.35F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.35F, 0F, -0.1F, 0.35F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 77
		gunModel[7].setRotationPoint(-0.8F, -0.6F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.6F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.6F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F); // Box 78
		gunModel[8].setRotationPoint(-0.8F, -1.2F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.25F, -0.1F, -0.6F, -0.25F, -0.1F, -0.6F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, 0.1F, -0.25F, -0.1F, -0.6F, -0.25F, -0.1F, -0.6F, -0.25F, -0.1F, 0.1F, -0.25F, -0.1F); // Box 79
		gunModel[9].setRotationPoint(2.2F, -1.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F); // Box 80
		gunModel[10].setRotationPoint(3F, -1.6F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.4F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Box 81
		gunModel[11].setRotationPoint(-0.6F, -1.4F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 83
		gunModel[12].setRotationPoint(1.8F, -1.6F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F); // Box 84
		gunModel[13].setRotationPoint(0.8F, -1.6F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, 0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Box 85
		gunModel[14].setRotationPoint(0.9F, -1.68F, -0.5F);
		gunModel[14].rotateAngleZ = 0.08726646F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F, -0.4F, -0.4F, -0.28F); // Box 86
		gunModel[15].setRotationPoint(1.3F, -1.7F, -0.5F);
		gunModel[15].rotateAngleZ = 0.08726646F;

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F); // Box 87
		gunModel[16].setRotationPoint(1.6F, -1.85F, -0.65F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F, -0.45F, -0.44F, -0.4F); // Box 88
		gunModel[17].setRotationPoint(1.6F, -1.85F, -0.35F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.25F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F); // Box 89
		gunModel[18].setRotationPoint(4.25F, -1.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F); // Box 91
		gunModel[19].setRotationPoint(0.5F, 0.05F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.6F, -0.5F, -0.25F, -0.6F, -0.5F, -0.25F, -0.6F, -0.3F, -0.25F, -0.6F, -0.3F); // Box 92
		gunModel[20].setRotationPoint(3.5F, -1.25F, -0.95F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 93
		gunModel[21].setRotationPoint(3F, -0.82F, -1.5F);
		gunModel[21].rotateAngleX = 0.99483767F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 94
		gunModel[22].setRotationPoint(4.9F, -1.05F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 95
		gunModel[23].setRotationPoint(4.9F, -1.2F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F); // Box 96
		gunModel[24].setRotationPoint(4.9F, -0.9F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F); // Box 97
		gunModel[25].setRotationPoint(5.1F, -0.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F); // Box 98
		gunModel[26].setRotationPoint(5.5F, -0.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 99
		gunModel[27].setRotationPoint(5.5F, -0.4F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F); // Box 100
		gunModel[28].setRotationPoint(5.5F, -0.6F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F); // Box 101
		gunModel[29].setRotationPoint(11.8F, -1.3F, -0.5F);
		gunModel[29].rotateAngleZ = -0.19198622F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F, -0.43F, -0.3F, -0.4F); // Box 102
		gunModel[30].setRotationPoint(12F, -1.2F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.38F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.38F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 103
		gunModel[31].setRotationPoint(11.87F, -1.6F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.42F, -0.48F, -0.3F, -0.42F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F); // Box 104
		gunModel[32].setRotationPoint(11.86F, -1.94F, -0.35F);
		gunModel[32].rotateAngleX = -0.13962634F;
		gunModel[32].rotateAngleZ = 0.01745329F;

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.42F, -0.48F, -0.3F, -0.42F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.4F, -0.4F, -0.48F); // Box 105
		gunModel[33].setRotationPoint(11.86F, -1.8F, -0.65F);
		gunModel[33].rotateAngleX = 0.13962634F;
		gunModel[33].rotateAngleZ = 0.01745329F;

		gunModel[34].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, -0.45F, -0.42F, -0.48F, -0.45F, -0.42F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F, -0.45F, -0.4F, -0.48F); // Box 106
		gunModel[34].setRotationPoint(11.9F, -0.85F, -0.5F);
		gunModel[34].rotateAngleZ = 0.01745329F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 107
		gunModel[35].setRotationPoint(10F, -0.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 109
		gunModel[36].setRotationPoint(10F, -0.65F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F); // Box 110
		gunModel[37].setRotationPoint(10F, -0.35F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.38F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, -0.38F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 111
		gunModel[38].setRotationPoint(10.3F, -0.9F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.3F); // Box 112
		gunModel[39].setRotationPoint(12.9F, -1.2F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.45F, -0.35F); // Box 113
		gunModel[40].setRotationPoint(12.9F, -0.9F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.41F, -0.35F, 0F, -0.41F, -0.25F, 0F, -0.41F, -0.25F, 0F, -0.41F, -0.35F, 0F, -0.41F, -0.3F, 0F, -0.41F, -0.25F, 0F, -0.41F, -0.25F, 0F, -0.41F, -0.3F); // Box 114
		gunModel[41].setRotationPoint(12.9F, -1.05F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.45F, -0.6F, 0.1F, -0.45F, -0.6F, 0.1F, -0.45F, 0F, 0.2F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F); // Box 116
		gunModel[42].setRotationPoint(5.3F, -1.5F, 0.95F);
		gunModel[42].rotateAngleX = -1.13446401F;

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.1F, -0.17F, 0.35F, -0.1F, -0.17F, 0.35F, -0.1F, -0.17F, -0.6F, -0.1F, -0.17F, -0.6F, -0.1F, -0.17F, 0.35F, -0.1F, -0.17F, 0.35F, -0.1F, -0.17F, -0.6F, -0.1F, -0.17F); // Box 117
		gunModel[43].setRotationPoint(-2.75F, -0.5F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.6F, -0.3F, -0.17F, 0.35F, -0.3F, -0.17F, 0.35F, -0.3F, -0.17F, -0.6F, -0.3F, -0.17F, -0.6F, -0.3F, -0.17F, 0.8F, -0.3F, -0.17F, 0.8F, -0.3F, -0.17F, -0.6F, -0.3F, -0.17F); // Box 118
		gunModel[44].setRotationPoint(-5F, -0.9F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, -0.3F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -1F, -0.17F, -0.15F, -1F, -0.17F, -0.15F, -1F, -0.17F, -0.15F, -1F, -0.17F); // Box 119
		gunModel[45].setRotationPoint(-5.2F, -0.9F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.1F, -0.3F, -0.17F, -0.1F, -0.3F, -0.17F, -0.1F, -0.3F, -0.17F, -0.1F, -0.3F, -0.17F, 0F, -1.2F, -0.17F, -0.4F, -1.2F, -0.17F, -0.4F, -1.2F, -0.17F, 0F, -1.2F, -0.17F); // Box 120
		gunModel[46].setRotationPoint(-5.15F, 0.7F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.6F, -0.3F, -0.17F, 0F, -0.3F, -0.17F, 0F, -0.3F, -0.17F, -0.6F, -0.3F, -0.17F, -0.6F, -0.3F, -0.17F, 0.3F, -0.3F, -0.17F, 0.3F, -0.3F, -0.17F, -0.6F, -0.3F, -0.17F); // Box 47
		gunModel[47].setRotationPoint(-5.3F, 0.4F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.17F, -0.2F, 0F, -0.17F, -0.15F, -0.2F, -0.17F, 0.35F, -0.2F, -0.17F, 0.35F, -0.2F, -0.17F, -0.15F, -0.2F, -0.17F); // Box 48
		gunModel[48].setRotationPoint(-2.75F, 1.3F, -0.5F);
		gunModel[48].rotateAngleZ = 1.06465084F;

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.15F, -0.3F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.15F, -1F, -0.17F); // Box 49
		gunModel[49].setRotationPoint(-4.8F, -0.8F, -0.5F);
		gunModel[49].rotateAngleZ = -0.26179939F;

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.15F, -0.3F, -0.17F, -0.15F, -0.5F, -0.17F, -0.15F, -0.5F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.15F, -1F, -0.17F); // Box 50
		gunModel[50].setRotationPoint(-2.8F, -0.5F, -0.5F);
		gunModel[50].rotateAngleZ = 0.59341195F;

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, -0.6F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, -0.2F); // Box 51
		gunModel[51].setRotationPoint(-5.6F, 0.65F, -0.5F);
		gunModel[51].rotateAngleY = 0.01745329F;
		gunModel[51].rotateAngleZ = 1.04719755F;

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.15F, -0.3F, -0.17F, -0.15F, -0.5F, -0.17F, -0.15F, -0.5F, -0.17F, -0.15F, -0.3F, -0.17F, -0.15F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.15F, -1F, -0.17F); // Box 52
		gunModel[52].setRotationPoint(-2.45F, -0.5F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.7F, -0.17F, -0.2F, -0.5F, -0.17F, -0.2F, -0.5F, -0.17F, -0.2F, -0.8F, -0.17F, -0.2F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.4F, -1F, -0.17F, -0.2F, -1F, -0.17F); // Box 53
		gunModel[53].setRotationPoint(-3.9F, -1.15F, -0.5F);
		gunModel[53].rotateAngleZ = -0.9424778F;

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.35F, -0.25F, 1F, -0.35F, -0.25F, 1F, -0.35F, -0.25F, -0.6F, -0.35F, -0.25F, -0.6F, -0.35F, -0.25F, 1F, -0.35F, -0.25F, 1F, -0.35F, -0.25F, -0.6F, -0.35F, -0.25F); // Box 0
		gunModel[54].setRotationPoint(3.5F, -1.3F, 0.5F);
		gunModel[54].rotateAngleX = 0.43633231F;
		gunModel[54].rotateAngleY = 0.01745329F;

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F); // Box 1
		gunModel[55].setRotationPoint(1.15F, 0.3F, -0.5F);
		gunModel[55].rotateAngleZ = -0.08726646F;

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F); // Box 2
		gunModel[56].setRotationPoint(0.25F, 0.45F, -0.5F);
		gunModel[56].rotateAngleZ = 0.13962634F;

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 3
		gunModel[57].setRotationPoint(3F, -0.3F, -0.1F);
		gunModel[57].rotateAngleX = 1.57079633F;

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F); // Box 4
		gunModel[58].setRotationPoint(0.83F, 1.65F, -0.5F);
		gunModel[58].rotateAngleZ = 1.69296937F;

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F); // Box 5
		gunModel[59].setRotationPoint(0.2F, 0.93F, -0.5F);
		gunModel[59].rotateAngleZ = 0.57595865F;

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 9
		gunModel[60].setRotationPoint(2.9F, -1.75F, -0.5F);


		ammoModel = new ModelRendererTurbo[11];
		ammoModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		ammoModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		ammoModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 8
		ammoModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 10
		ammoModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 11
		ammoModel[5] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 12
		ammoModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		ammoModel[7] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 16
		ammoModel[8] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 17
		ammoModel[9] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 18
		ammoModel[10] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 19

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F); // Box 6
		ammoModel[0].setRotationPoint(3.5F, 0.5F, -1.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F); // Box 7
		ammoModel[1].setRotationPoint(3.5F, 0F, -1.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 8
		ammoModel[2].setRotationPoint(3.5F, 2F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.25F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 10
		ammoModel[3].setRotationPoint(3F, 0.4F, -1.8F);
		ammoModel[3].rotateAngleX = 0.99483767F;

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 11
		ammoModel[4].setRotationPoint(3.5F, -0.2F, -1.4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 12
		ammoModel[5].setRotationPoint(3.5F, -0.4F, -1.3F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 15
		ammoModel[6].setRotationPoint(3.5F, -0.6F, -1.35F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 16
		ammoModel[7].setRotationPoint(3.5F, -0.8F, -1.25F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 17
		ammoModel[8].setRotationPoint(3.5F, -1F, -1.15F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 18
		ammoModel[9].setRotationPoint(3.5F, -1.2F, -1.2F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 19
		ammoModel[10].setRotationPoint(3.5F, -1.4F, -1.1F);



		translateAll(0F, -2F, 0F);
		animationType = EnumAnimationType.BOTTOM_CLIP;


		flipAll();
	}
}