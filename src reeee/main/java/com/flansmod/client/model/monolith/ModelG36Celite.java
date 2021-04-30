//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.02.2016 - 23:43:54
// Last changed on: 26.02.2016 - 23:43:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG36Celite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelG36Celite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[131];
		ammoModel = new ModelRendererTurbo[3];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 98, 132, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 100, 60, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		gunModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		gunModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		gunModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		gunModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		gunModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[116] = new ModelRendererTurbo(this, 100, 60, textureX, textureY); // Box 0
		gunModel[117] = new ModelRendererTurbo(this, 100, 60, textureX, textureY); // Box 0
		gunModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[130] = new ModelRendererTurbo(this, 59, 360, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(0F, 0F, 0F, 47, 10, 8, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(-8F, -17F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 46, 11, 8, 0F); // Box 0
		gunModel[1].setRotationPoint(34F, -17F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 42, 9, 8, 0F); // Box 0
		gunModel[2].setRotationPoint(-5F, -9F, 0F);
		gunModel[2].rotateAngleZ = 0.10471976F;

		gunModel[3].addBox(0F, 0F, 0F, 11, 12, 8, 0F); // Box 0
		gunModel[3].setRotationPoint(35F, -14F, 0F);
		gunModel[3].rotateAngleZ = -0.83775804F;

		gunModel[4].addBox(0F, 0F, 0F, 42, 2, 8, 0F); // Box 0
		gunModel[4].setRotationPoint(-8F, -19F, 0F);

		gunModel[5].addBox(0F, 0F, 0F, 32, 6, 8, 0F); // Box 0
		gunModel[5].setRotationPoint(-6F, -25F, 0F);

		gunModel[6].addBox(0F, 0F, 0F, 36, 2, 8, 0F); // Box 0
		gunModel[6].setRotationPoint(26F, -25F, 0F);

		gunModel[7].addBox(0F, 0F, 0F, 5, 9, 8, 0F); // Box 0
		gunModel[7].setRotationPoint(58.2F, -21.8F, 0F);
		gunModel[7].rotateAngleZ = 0.6981317F;

		gunModel[8].addBox(0F, 0F, 0F, 17, 11, 8, 0F); // Box 0
		gunModel[8].setRotationPoint(63.9F, -20F, 0F);

		gunModel[9].addBox(0F, 0F, 0F, 5, 13, 8, 0F); // Box 0
		gunModel[9].setRotationPoint(76.5F, -18.5F, 0F);
		gunModel[9].rotateAngleZ = 0.27925268F;

		gunModel[10].addBox(0F, 0F, 0F, 12, 2, 3, 0F); // Box 0
		gunModel[10].setRotationPoint(34F, -19F, 2.5F);

		gunModel[11].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 0
		gunModel[11].setRotationPoint(-6F, -26F, 1F);

		gunModel[12].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 0
		gunModel[12].setRotationPoint(-2F, -27.8F, 1F);

		gunModel[13].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 0
		gunModel[13].setRotationPoint(-6F, -26F, 1F);
		gunModel[13].rotateAngleZ = 0.4712389F;

		gunModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		gunModel[14].setRotationPoint(-2.5F, -27.8F, 1F);

		gunModel[15].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 0
		gunModel[15].setRotationPoint(-6F, -26F, 6F);

		gunModel[16].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 0
		gunModel[16].setRotationPoint(-2F, -27.8F, 6F);

		gunModel[17].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 0
		gunModel[17].setRotationPoint(-6F, -26F, 6F);
		gunModel[17].rotateAngleZ = 0.4712389F;

		gunModel[18].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		gunModel[18].setRotationPoint(-2.5F, -27.8F, 6F);

		gunModel[19].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		gunModel[19].setRotationPoint(-2F, -27F, 1.25F);

		gunModel[20].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		gunModel[20].setRotationPoint(-2F, -27F, 4.75F);

		gunModel[21].addBox(0F, 1F, 0F, 1, 1, 2, 0F); // Box 0
		gunModel[21].setRotationPoint(-2F, -27F, 3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		gunModel[22].setRotationPoint(40F, -23F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		gunModel[23].setRotationPoint(40F, -23F, 7F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 0
		gunModel[24].setRotationPoint(23F, -23F, -1F);

		gunModel[25].addBox(0F, 0F, 0F, 5, 4, 4, 0F); // Box 0
		gunModel[25].setRotationPoint(82F, -14F, 2F);

		gunModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 0
		gunModel[26].setRotationPoint(87F, -14F, 2F);

		gunModel[27].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 0
		gunModel[27].setRotationPoint(87F, -14F, 5F);

		gunModel[28].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 0
		gunModel[28].setRotationPoint(87F, -11F, 5F);

		gunModel[29].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 0
		gunModel[29].setRotationPoint(87F, -11F, 2F);

		gunModel[30].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		gunModel[30].setRotationPoint(90.5F, -14F, 3F);

		gunModel[31].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		gunModel[31].setRotationPoint(90.5F, -11F, 3F);

		gunModel[32].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		gunModel[32].setRotationPoint(90.5F, -13F, 2F);

		gunModel[33].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		gunModel[33].setRotationPoint(90.5F, -13F, 5F);

		gunModel[34].addBox(0F, 0F, 0F, 2, 8, 8, 0F); // Box 0
		gunModel[34].setRotationPoint(57.2F, -22.8F, 0F);
		gunModel[34].rotateAngleZ = 0.76794487F;

		gunModel[35].addBox(0F, 0F, 0F, 17, 10, 8, 0F); // Box 0
		gunModel[35].setRotationPoint(17F, -5F, 0F);
		gunModel[35].rotateAngleZ = 0.17453293F;

		gunModel[36].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 0
		gunModel[36].setRotationPoint(57F, -25.5F, 2.5F);

		gunModel[37].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		gunModel[37].setRotationPoint(57F, -28.5F, 1.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[38].setRotationPoint(57F, -29.5F, 1.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[39].setRotationPoint(57F, -28.5F, 5.5F);

		gunModel[40].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 0
		gunModel[40].setRotationPoint(57F, -29.5F, 2.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[41].setRotationPoint(57F, -25.5F, 1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[42].setRotationPoint(57F, -25.5F, 5.5F);

		gunModel[43].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		gunModel[43].setRotationPoint(57F, -28.5F, 5.5F);

		gunModel[44].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		gunModel[44].setRotationPoint(58.5F, -27.5F, 3.5F);

		gunModel[45].addBox(0F, 0F, 0F, 9, 22, 8, 0F); // Box 0
		gunModel[45].setRotationPoint(-2F, -5F, 0F);
		gunModel[45].rotateAngleZ = -0.45378561F;

		gunModel[46].addBox(0F, 0F, 0F, 3, 2, 8, 0F); // Box 0
		gunModel[46].setRotationPoint(-3F, 16F, 0F);
		gunModel[46].rotateAngleZ = -0.99483767F;

		gunModel[47].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Box 0
		gunModel[47].setRotationPoint(-11F, 13F, 0F);
		gunModel[47].rotateAngleZ = -0.61086524F;

		gunModel[48].addBox(0F, 0F, 0F, 5, 17, 8, 0F); // Box 0
		gunModel[48].setRotationPoint(-9F, -21F, 0F);

		gunModel[49].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 0
		gunModel[49].setRotationPoint(-6F, -6F, 0F);
		gunModel[49].rotateAngleZ = -0.78539816F;

		gunModel[50].addBox(0F, 0F, 0F, 5, 30, 6, 0F); // Box 0
		gunModel[50].setRotationPoint(-58F, -16F, 1F);

		gunModel[51].addBox(0F, 0F, 0F, 44, 2, 6, 0F); // Box 0
		gunModel[51].setRotationPoint(-53F, -16F, 1F);

		gunModel[52].addBox(0F, 0F, 0F, 19, 2, 6, 0F); // Box 0
		gunModel[52].setRotationPoint(-28F, -6F, 1F);

		gunModel[53].addBox(0F, 0F, 0F, 19, 2, 6, 0F); // Box 0
		gunModel[53].setRotationPoint(-28F, -14F, 1F);

		gunModel[54].addBox(0F, 0F, 0F, 8, 6, 6, 0F); // Box 0
		gunModel[54].setRotationPoint(-17F, -12F, 1F);

		gunModel[55].addBox(0F, 0F, 0F, 2, 10, 6, 0F); // Box 0
		gunModel[55].setRotationPoint(-29F, -14F, 1F);

		gunModel[56].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Box 0
		gunModel[56].setRotationPoint(-38F, -4F, 1F);
		gunModel[56].rotateAngleZ = 0.2268928F;

		gunModel[57].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Box 0
		gunModel[57].setRotationPoint(-47F, -1F, 1F);
		gunModel[57].rotateAngleZ = 0.31415927F;

		gunModel[58].addBox(0F, 0F, 0F, 10, 3, 6, 0F); // Box 0
		gunModel[58].setRotationPoint(-56F, -1F, 1F);
		gunModel[58].rotateAngleZ = 0.03490659F;

		gunModel[59].addBox(0F, 0F, 0F, 16, 2, 6, 0F); // Box 0
		gunModel[59].setRotationPoint(-55F, 12F, 1F);
		gunModel[59].rotateAngleZ = 0.99483767F;

		gunModel[60].addBox(0F, 0F, 0F, 5, 10, 6, 0F); // Box 0
		gunModel[60].setRotationPoint(-53F, -1F, 1F);
		gunModel[60].rotateAngleZ = -0.31415927F;

		gunModel[61].addBox(0F, 0F, 0F, 9, 3, 6, 0F); // Box 0
		gunModel[61].setRotationPoint(-56F, -1F, 1F);
		gunModel[61].rotateAngleZ = -0.12217305F;

		gunModel[62].addBox(0F, 0F, 0F, 5, 15, 6, 0F); // Box 0
		gunModel[62].setRotationPoint(-55F, -16F, 1F);

		gunModel[63].addBox(0F, 0F, 0F, 13, 6, 6, 0F); // Box 0
		gunModel[63].setRotationPoint(-20F, -16F, 1F);
		gunModel[63].rotateAngleZ = 0.36651914F;

		gunModel[64].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 0
		gunModel[64].setRotationPoint(80F, -7F, 2F);
		gunModel[64].rotateAngleX = 0.13962634F;

		gunModel[65].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 0
		gunModel[65].setRotationPoint(61F, -5.5F, 2F);

		gunModel[66].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 0
		gunModel[66].setRotationPoint(61F, -4.5F, 2F);

		gunModel[67].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 0
		gunModel[67].setRotationPoint(59F, -6.5F, 2F);

		gunModel[68].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[68].setRotationPoint(66F, -4.5F, 1.5F);

		gunModel[69].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[69].setRotationPoint(68F, -4.5F, 1.5F);

		gunModel[70].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[70].setRotationPoint(70F, -4.5F, 1.5F);

		gunModel[71].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[71].setRotationPoint(72F, -4.5F, 1.5F);

		gunModel[72].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[72].setRotationPoint(74F, -4.5F, 1.5F);

		gunModel[73].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[73].setRotationPoint(76F, -4.5F, 1.5F);

		gunModel[74].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[74].setRotationPoint(78F, -4.5F, 1.5F);

		gunModel[75].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 0
		gunModel[75].setRotationPoint(3F, -25.5F, 2F);

		gunModel[76].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[76].setRotationPoint(3F, -26F, 1.5F);

		gunModel[77].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[77].setRotationPoint(5F, -26F, 1.5F);

		gunModel[78].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[78].setRotationPoint(7F, -26F, 1.5F);

		gunModel[79].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[79].setRotationPoint(9F, -26F, 1.5F);

		gunModel[80].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[80].setRotationPoint(11F, -26F, 1.5F);

		gunModel[81].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[81].setRotationPoint(13F, -26F, 1.5F);

		gunModel[82].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[82].setRotationPoint(15F, -26F, 1.5F);

		gunModel[83].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[83].setRotationPoint(17F, -26F, 1.5F);

		gunModel[84].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[84].setRotationPoint(19F, -26F, 1.5F);

		gunModel[85].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[85].setRotationPoint(21F, -26F, 1.5F);

		gunModel[86].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[86].setRotationPoint(23F, -26F, 1.5F);

		gunModel[87].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[87].setRotationPoint(25F, -26F, 1.5F);

		gunModel[88].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[88].setRotationPoint(27F, -26F, 1.5F);

		gunModel[89].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[89].setRotationPoint(29F, -26F, 1.5F);

		gunModel[90].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[90].setRotationPoint(31F, -26F, 1.5F);

		gunModel[91].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[91].setRotationPoint(33F, -26F, 1.5F);

		gunModel[92].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[92].setRotationPoint(35F, -26F, 1.5F);

		gunModel[93].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[93].setRotationPoint(37F, -26F, 1.5F);

		gunModel[94].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[94].setRotationPoint(39F, -26F, 1.5F);

		gunModel[95].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[95].setRotationPoint(41F, -26F, 1.5F);

		gunModel[96].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[96].setRotationPoint(43F, -26F, 1.5F);

		gunModel[97].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[97].setRotationPoint(45F, -26F, 1.5F);

		gunModel[98].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[98].setRotationPoint(47F, -26F, 1.5F);

		gunModel[99].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[99].setRotationPoint(49F, -26F, 1.5F);

		gunModel[100].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[100].setRotationPoint(51F, -26F, 1.5F);

		gunModel[101].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[101].setRotationPoint(53F, -26F, 1.5F);

		gunModel[102].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[102].setRotationPoint(55F, -26F, 1.5F);

		gunModel[103].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 0
		gunModel[103].setRotationPoint(31F, -26F, 1.5F);

		gunModel[104].addBox(0F, 0F, 0F, 17, 10, 8, 0F); // Box 0
		gunModel[104].setRotationPoint(16F, -5F, 0F);
		gunModel[104].rotateAngleZ = 0.17453293F;

		gunModel[105].addBox(0F, 0F, 0F, 1, 10, 6, 0F); // Box 0
		gunModel[105].setRotationPoint(18F, -3F, 1F);
		gunModel[105].rotateAngleZ = -0.03490659F;

		gunModel[106].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 0
		gunModel[106].setRotationPoint(16F, -3F, 1F);
		gunModel[106].rotateAngleZ = -0.03490659F;

		gunModel[107].addBox(0F, 0F, 0F, 9, 1, 6, 0F); // Box 0
		gunModel[107].setRotationPoint(8F, 5F, 1F);
		gunModel[107].rotateAngleZ = 0.13962634F;

		gunModel[108].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 0
		gunModel[108].setRotationPoint(4F, 3F, 1F);
		gunModel[108].rotateAngleZ = -0.41887902F;

		gunModel[109].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 0
		gunModel[109].setRotationPoint(8F, -3F, 3F);
		gunModel[109].rotateAngleZ = 0.12217305F;

		gunModel[110].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 114
		gunModel[110].setRotationPoint(0F, 0F, 0F);

		gunModel[111].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 115
		gunModel[111].setRotationPoint(0F, 0F, 0F);

		gunModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 116
		gunModel[112].setRotationPoint(0F, 0F, 0F);

		gunModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
		gunModel[113].setRotationPoint(0F, 0F, 0F);

		gunModel[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
		gunModel[114].setRotationPoint(0F, 0F, 0F);

		gunModel[115].addBox(0F, 0F, -4F, 37, 9, 8, 0F); // Box 0
		gunModel[115].setRotationPoint(43.9F, -16F, 4F);
		gunModel[115].rotateAngleX = -0.20943951F;

		gunModel[116].addBox(0F, 0F, 0F, 10, 2, 3, 0F); // Box 0
		gunModel[116].setRotationPoint(46.5F, -19F, 2.5F);
		gunModel[116].rotateAngleY = 0.01745329F;

		gunModel[117].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		gunModel[117].setRotationPoint(46F, -19F, 3F);

		gunModel[118].addBox(0F, 0F, 0F, 3, 7, 2, 0F); // Box 0
		gunModel[118].setRotationPoint(80F, -7.3F, 4F);
		gunModel[118].rotateAngleX = -0.13962634F;

		gunModel[119].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 0
		gunModel[119].setRotationPoint(80F, -1F, 3F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		gunModel[120].setRotationPoint(-12F, -12F, 7F);
		gunModel[120].rotateAngleZ = -0.10471976F;

		gunModel[121].addBox(0F, 0F, 0F, 5, 7, 8, 0F); // Box 0
		gunModel[121].setRotationPoint(-9F, -11F, 0F);
		gunModel[121].rotateAngleZ = -0.10471976F;

		gunModel[122].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 0
		gunModel[122].setRotationPoint(-10F, -11.8F, 7F);
		gunModel[122].rotateAngleZ = -0.10471976F;

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[123].setRotationPoint(5F, -7.8F, -0.5F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[124].setRotationPoint(6F, -8.8F, -0.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[125].setRotationPoint(7F, -8.8F, -0.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[126].setRotationPoint(5F, -8.8F, -0.5F);

		gunModel[127].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 0
		gunModel[127].setRotationPoint(7F, -6.8F, -0.5F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		gunModel[128].setRotationPoint(5F, -6.8F, -0.5F);

		gunModel[129].addBox(0F, 0F, -4F, 37, 9, 8, 0F); // Box 0
		gunModel[129].setRotationPoint(43.9F, -16F, 4F);
		gunModel[129].rotateAngleX = 0.20943951F;

		gunModel[130].addShapeBox(0F, 0F, 0F, 18, 4, 8, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 0
		gunModel[130].setRotationPoint(-3F, -7F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Box 0
		ammoModel[2] = new ModelRendererTurbo(this, 400, 20, textureX, textureY); // Box 0

		ammoModel[0].addBox(0F, 0F, 0F, 14, 10, 6, 0F); // Box 0
		ammoModel[0].setRotationPoint(21F, 4F, 1F);
		ammoModel[0].rotateAngleZ = 0.17453293F;

		ammoModel[1].addBox(0F, 0F, 0F, 14, 15, 6, 0F); // Box 0
		ammoModel[1].setRotationPoint(22.5F, 13F, 1F);
		ammoModel[1].rotateAngleZ = 0.26179939F;

		ammoModel[2].addBox(0F, 0F, 0F, 14, 2, 7, 0F); // Box 0
		ammoModel[2].setRotationPoint(26.5F, 27F, 0.5F);
		ammoModel[2].rotateAngleZ = 0.26179939F;
		
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(2F, -10F, -4F);
		gunSlideDistance = 1F;
		
		
	}
}