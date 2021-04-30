//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelHALlch extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHALlch() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[92];
		bodyModel[0] = new ModelRendererTurbo(this, -729, 7, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 447, 499, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 6, 707, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 112, 427, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 108, 459, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 55, 425, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 780, 402, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 624, 325, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 518, 473, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 952, 364, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 734, 371, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 952, 331, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 871, 362, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 574, 371, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 436, 470, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 761, 476, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 640, 541, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 434, 481, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 783, 484, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 740, 500, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 799, 555, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 777, 529, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 814, 525, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 820, 545, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 834, 547, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 808, 473, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 840, 486, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 791, 492, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 531, 553, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 840, 514, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 806, 489, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 674, 556, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 116, 738, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 1
		bodyModel[67] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 2
		bodyModel[68] = new ModelRendererTurbo(this, 40, 735, textureX, textureY); // Box 3
		bodyModel[69] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 4
		bodyModel[70] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 5
		bodyModel[71] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Box 6
		bodyModel[72] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 7
		bodyModel[73] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 8
		bodyModel[74] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Box 9
		bodyModel[75] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 10
		bodyModel[76] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 12
		bodyModel[77] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Box 13
		bodyModel[78] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 14
		bodyModel[79] = new ModelRendererTurbo(this, 737, 185, textureX, textureY); // Box 17
		bodyModel[80] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 18
		bodyModel[81] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 19
		bodyModel[82] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 20
		bodyModel[83] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 22
		bodyModel[84] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Box 23
		bodyModel[85] = new ModelRendererTurbo(this, 8, 804, textureX, textureY); // Box 24
		bodyModel[86] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 25
		bodyModel[87] = new ModelRendererTurbo(this, 426, 207, textureX, textureY); // Box 26
		bodyModel[88] = new ModelRendererTurbo(this, 737, 267, textureX, textureY); // Box 27
		bodyModel[89] = new ModelRendererTurbo(this, 353, 234, textureX, textureY); // Box 28
		bodyModel[90] = new ModelRendererTurbo(this, 275, 388, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 275, 388, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 49, 46, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-16F, -49F, -11F);

		bodyModel[1].addBox(-7F, 0F, 0F, 69, 10, 2, 0F); // Box 0
		bodyModel[1].setRotationPoint(-78F, -18F, -11F);

		bodyModel[2].addBox(-7F, 0F, 0F, 60, 2, 18, 0F); // Box 0
		bodyModel[2].setRotationPoint(-78F, -10F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 14, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(0F, -47F, 11F);

		bodyModel[4].addBox(-7F, 0F, 0F, 69, 10, 2, 0F); // Box 0
		bodyModel[4].setRotationPoint(-78F, -18F, 9F);

		bodyModel[5].addShapeBox(-7F, 0F, 0F, 2, 16, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-78F, -22F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 14, 5, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 0
		bodyModel[6].setRotationPoint(-10F, -47F, 11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 14, 5, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(30F, -47F, 11F);

		bodyModel[8].addFlexTrapezoid(-7F, 0F, 0F, 69, 5, 22, 0F, 0.00F, -3.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_RIGHT); // Box 0
		bodyModel[8].setRotationPoint(-78F, -8F, -11F);

		bodyModel[9].addShapeBox(-3.5F, 10F, -3.5F, 7, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(0F, -68F, 0F);

		bodyModel[10].addBox(-4F, 0F, -9F, 2, 24, 18, 0F); // Box 0
		bodyModel[10].setRotationPoint(-25F, -43F, 0F);

		bodyModel[11].addBox(-4F, 0F, -9F, 16, 2, 18, 0F); // Box 0
		bodyModel[11].setRotationPoint(-41F, -21F, 0F);

		bodyModel[12].addBox(-4F, 0F, -9F, 10, 2, 18, 0F); // Box 0
		bodyModel[12].setRotationPoint(-66F, -11F, 0F);

		bodyModel[13].addBox(-4F, 0F, -9F, 2, 26, 18, 0F); // Box 0
		bodyModel[13].setRotationPoint(-56F, -31F, 0F);

		bodyModel[14].addBox(0F, 0F, -7F, 2, 15, 14, 0F); // Box 0
		bodyModel[14].setRotationPoint(-77F, -23F, 0F);

		bodyModel[15].addFlexTrapezoid(0F, 0F, -7F, 2, 8, 14, 0F, -8.00F, 0.00F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_LEFT); // Box 0
		bodyModel[15].setRotationPoint(-75F, -23F, 0F);

		bodyModel[16].addBox(0F, 0F, -7F, 4, 12, 14, 0F); // Box 0
		bodyModel[16].setRotationPoint(-83F, -25F, 0F);

		bodyModel[17].addBox(0F, 0F, -3F, 2, 6, 0, 0F); // Box 0
		bodyModel[17].setRotationPoint(-77F, -29F, 0F);

		bodyModel[18].addBox(0F, 0F, 3F, 2, 6, 0, 0F); // Box 0
		bodyModel[18].setRotationPoint(-77F, -29F, 0F);

		bodyModel[19].addBox(0F, -3F, -3F, 0, 6, 6, 0F); // Box 0
		bodyModel[19].setRotationPoint(-77F, -26F, 0F);

		bodyModel[20].addBox(-1F, 0F, -9F, 2, 16, 18, 0F); // Box 0
		bodyModel[20].setRotationPoint(-78F, -23F, 0F);

		bodyModel[21].addFlexTrapezoid(0F, 0F, -7F, 2, 8, 14, 0F, -8.00F, 0.00F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_LEFT); // Box 0
		bodyModel[21].setRotationPoint(-48F, -34F, 0F);

		bodyModel[22].addBox(0F, 0F, -7F, 2, 7, 14, 0F); // Box 0
		bodyModel[22].setRotationPoint(-48F, -26F, 0F);

		bodyModel[23].addBox(-1F, 0F, -9F, 2, 16, 18, 0F); // Box 0
		bodyModel[23].setRotationPoint(-49F, -34F, 0F);

		bodyModel[24].addBox(0F, -3F, -3F, 0, 6, 6, 0F); // Box 0
		bodyModel[24].setRotationPoint(-50F, -37F, 0F);

		bodyModel[25].addBox(0F, 0F, 3F, 2, 6, 0, 0F); // Box 0
		bodyModel[25].setRotationPoint(-50F, -40F, 0F);

		bodyModel[26].addBox(0F, 0F, -3F, 2, 6, 0, 0F); // Box 0
		bodyModel[26].setRotationPoint(-50F, -40F, 0F);

		bodyModel[27].addBox(0F, 0F, -7F, 2, 15, 14, 0F); // Box 0
		bodyModel[27].setRotationPoint(-52F, -34F, 0F);

		bodyModel[28].addShapeBox(-7F, 0F, 0F, 58, 13, 2, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-76F, -31F, 9F);

		bodyModel[29].addShapeBox(-7F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-78F, -21F, 9F);

		bodyModel[30].addShapeBox(-7F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-78F, -21F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -8F, 0F, -2F, 0F); // Box 0
		bodyModel[31].setRotationPoint(30F, -33F, 11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(0F, -49F, 11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[33].setRotationPoint(0F, -33F, 11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F); // Box 0
		bodyModel[34].setRotationPoint(-10F, -33F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 0
		bodyModel[35].setRotationPoint(-10F, -49F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 0
		bodyModel[36].setRotationPoint(-16F, -45F, 11F);

		bodyModel[37].addBox(0F, 0F, 0F, 15, 15, 22, 0F); // Box 0
		bodyModel[37].setRotationPoint(33F, -49F, -11F);

		bodyModel[38].addShapeBox(-7F, 0F, 0F, 6, 15, 18, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F); // Box 0
		bodyModel[38].setRotationPoint(-84F, -21F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 25, 4, 18, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 0
		bodyModel[39].setRotationPoint(-25F, -53F, -9F);

		bodyModel[40].addShapeBox(-7F, 0F, 0F, 6, 1, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-84F, -22F, -9F);

		bodyModel[41].addShapeBox(-7F, 0F, 0F, 2, 3, 18, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-78F, -25F, -9F);

		bodyModel[42].addShapeBox(-7F, 0F, 0F, 6, 2, 18, 0F, 0F, -2F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 0
		bodyModel[42].setRotationPoint(-84F, -24F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 18, 4, 22, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[43].setRotationPoint(0F, -53F, -11F);

		bodyModel[44].addShapeBox(-7F, 0F, 0F, 58, 13, 2, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-76F, -31F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-54F, -50F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-68F, -44F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-83F, -40F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-54F, -50F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-68F, -44F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-83F, -40F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(-54F, -39F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, -0.4F, -2F, -1F, 0.2F, -2F, -1F, 0.2F, 2F, 1F, -0.4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-58F, -42F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 1F, -0.4F, 2F, -1F, 0.2F, 2F, -1F, 0.2F, -2F, 1F, -0.4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[53].setRotationPoint(-58F, -42F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[54].setRotationPoint(-54F, -39F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-44F, -43F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, -0.4F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, -1F, -0.4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(-40F, -47F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, -1F, -0.4F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, -1F, -0.4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(-40F, -47F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 18, 1, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(-44F, -43F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, -0.6F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -1F, 0F, -1.4F, 1F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.4F, 1F, 0F); // Box 0
		bodyModel[59].setRotationPoint(-54F, -30F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F); // Box 0
		bodyModel[60].setRotationPoint(-46F, -46F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, -0.4F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.4F, 0F); // Box 0
		bodyModel[61].setRotationPoint(-66F, -41F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, -0.6F, -1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -1F, 0F, -1.4F, 1F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.4F, 1F, 0F); // Box 0
		bodyModel[62].setRotationPoint(-54F, -30F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 9, 31, 22, 0F); // Box 0
		bodyModel[63].setRotationPoint(-25F, -49F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 15, 22, 0F, 0F, 0F, 0F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(48F, -49F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 0
		bodyModel[65].setRotationPoint(30F, -49F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 1
		bodyModel[66].setRotationPoint(-16F, -45F, -14F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[67].setRotationPoint(-10F, -33F, -16F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 14, 5, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[68].setRotationPoint(-10F, -47F, -16F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 4
		bodyModel[69].setRotationPoint(-10F, -49F, -16F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[70].setRotationPoint(0F, -49F, -16F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 30, 14, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[71].setRotationPoint(0F, -47F, -16F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 30, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[72].setRotationPoint(0F, -33F, -16F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -8F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 8
		bodyModel[73].setRotationPoint(30F, -33F, -16F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 19, 14, 5, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 9
		bodyModel[74].setRotationPoint(30F, -47F, -16F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F, 0F, -2F, 0F, 0F, -2F, -8F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 10
		bodyModel[75].setRotationPoint(30F, -49F, -16F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 12
		bodyModel[76].setRotationPoint(-16F, -57F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 13
		bodyModel[77].setRotationPoint(-22F, -54F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 24, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, 0F, 2F); // Box 14
		bodyModel[78].setRotationPoint(-6F, -57F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 30, 8, 22, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[79].setRotationPoint(18F, -57F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, -3F, 4, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[80].setRotationPoint(30F, -47F, -16F);
		bodyModel[80].rotateAngleY = 0.40142573F;

		bodyModel[81].addShapeBox(0F, 0F, -3F, 10, 14, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 19
		bodyModel[81].setRotationPoint(33F, -47F, -15F);

		bodyModel[82].addShapeBox(0F, 0F, -3F, 12, 14, 5, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -4F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 3F); // Box 20
		bodyModel[82].setRotationPoint(43F, -47F, -13F);

		bodyModel[83].addShapeBox(0F, 0F, -3F, 6, 10, 6, 0F, 0F, -2F, 0F, 0F, -3F, -12F, 0F, -3F, 6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 22
		bodyModel[83].setRotationPoint(55F, -43F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, -3F, 6, 10, 6, 0F, 0F, 0F, 2F, 0F, -3F, 6F, 0F, -3F, -12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 23
		bodyModel[84].setRotationPoint(55F, -43F, 11F);

		bodyModel[85].addShapeBox(0F, 0F, -3F, 12, 14, 5, 0F, 0F, 0F, 2F, 0F, -4F, 5F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 24
		bodyModel[85].setRotationPoint(43F, -47F, 14F);

		bodyModel[86].addShapeBox(0F, 0F, -3F, 10, 14, 7, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 25
		bodyModel[86].setRotationPoint(33F, -47F, 14F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[87].setRotationPoint(30F, -47F, 16F);
		bodyModel[87].rotateAngleY = -0.40142573F;

		bodyModel[88].addShapeBox(0F, -2F, -2F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[88].setRotationPoint(56F, -38F, -10F);
		bodyModel[88].rotateAngleX = -0.17453293F;
		bodyModel[88].rotateAngleY = -0.52359878F;
		bodyModel[88].rotateAngleZ = 0.20943951F;

		bodyModel[89].addShapeBox(0F, -2F, -4F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[89].setRotationPoint(56F, -38F, 10F);
		bodyModel[89].rotateAngleX = 0.17453293F;
		bodyModel[89].rotateAngleY = 0.52359878F;
		bodyModel[89].rotateAngleZ = 0.20943951F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 0
		bodyModel[90].setRotationPoint(-104F, -8F, -2.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[91].setRotationPoint(-120F, -6F, -0.5F);


		noseModel = new ModelRendererTurbo[13];
		noseModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 0
		noseModel[2] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 0
		noseModel[3] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 0
		noseModel[4] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 0
		noseModel[5] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box 0
		noseModel[6] = new ModelRendererTurbo(this, 167, 245, textureX, textureY); // Box 11
		noseModel[7] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 11
		noseModel[8] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 11
		noseModel[9] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 11
		noseModel[10] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 11
		noseModel[11] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 11
		noseModel[12] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 6

		noseModel[0].addShapeBox(-7F, 0F, 0F, 6, 1, 14, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 3F, 0F); // Box 0
		noseModel[0].setRotationPoint(-90F, -22F, -7F);

		noseModel[1].addShapeBox(-5F, 0F, 0F, 6, 1, 12, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 3F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, -2F); // Box 0
		noseModel[1].setRotationPoint(-98F, -19F, -6F);

		noseModel[2].addShapeBox(-5F, 0F, 0F, 1, 1, 6, 0F, 0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, -1F, 1F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 1F, -1F); // Box 0
		noseModel[2].setRotationPoint(-99F, -16F, -3F);

		noseModel[3].addShapeBox(-7F, 0F, 0F, 6, 10, 10, 0F, 0F, -3F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -1F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -1F); // Box 0
		noseModel[3].setRotationPoint(-96F, -18F, -5F);

		noseModel[4].addShapeBox(-5F, 0F, 0F, 2, 6, 8, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 0
		noseModel[4].setRotationPoint(-100F, -15F, -4F);

		noseModel[5].addShapeBox(-7F, 0F, 0F, 6, 11, 14, 0F, 0F, -1F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 0
		noseModel[5].setRotationPoint(-90F, -19F, -7F);

		noseModel[6].addShapeBox(-4F, 0F, -4F, 2, 5, 8, 0F, 0F, 0.00F, -2F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0F, 0.00F, -2.00F, 0F, 0.00F, -2F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0F, 0.00F, -2.00F); // Box 11
		noseModel[6].setRotationPoint(-100F, -21F, 0F);

		noseModel[7].addShapeBox(-4F, 0F, -4F, 4, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		noseModel[7].setRotationPoint(-98F, -23F, 0F);

		noseModel[8].addShapeBox(-4F, 0F, -4F, 2, 5, 8, 0F, 0F, 0F, 0F, 0F, 0.00F, -2.00F, 0F, 0.00F, -2.00F, 0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0.00F, -2F, 0F, 0.00F, -2.00F, 0F, 0F, 0F); // Box 11
		noseModel[8].setRotationPoint(-94F, -21F, 0F);

		noseModel[9].addShapeBox(-4F, 0F, -4F, 4, 5, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		noseModel[9].setRotationPoint(-98F, -21F, 0F);

		noseModel[10].addShapeBox(-4F, 0F, -4F, 2, 2, 8, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 11
		noseModel[10].setRotationPoint(-100F, -23F, 0F);

		noseModel[11].addShapeBox(-4F, 0F, -4F, 2, 2, 8, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 11
		noseModel[11].setRotationPoint(-94F, -23F, 0F);

		noseModel[12].addShapeBox(-5F, 0F, 0F, 1, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 6
		noseModel[12].setRotationPoint(-101F, -14F, -2F);


		tailModel = new ModelRendererTurbo[12];
		tailModel[0] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 688, 2, textureX, textureY); // Box 0
		tailModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tailModel[3] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 0
		tailModel[4] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 0
		tailModel[5] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		tailModel[6] = new ModelRendererTurbo(this, 248, 88, textureX, textureY); // Box 0
		tailModel[7] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 0
		tailModel[8] = new ModelRendererTurbo(this, 74, 796, textureX, textureY); // Box 0
		tailModel[9] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 0
		tailModel[10] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 0
		tailModel[11] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 0

		tailModel[0].addShapeBox(-7F, 0F, 0F, 104, 25, 26, 0F, 0F, 0F, -2F, 1F, -2F, -11F, 1F, -2F, -11F, 0F, 0F, -2F, 0F, -6F, -2F, -4F, -15F, -11.7F, -4F, -15F, -11.7F, 0F, -6F, -2F); // Box 0
		tailModel[0].setRotationPoint(68F, -34F, -13F);

		tailModel[1].addShapeBox(-7F, 0F, 0F, 24, 38, 4, 0F, -28F, 0F, -1F, 20F, 0F, -1F, 20F, 0F, -1F, -28F, 0F, -1F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F); // Box 0
		tailModel[1].setRotationPoint(149F, -68F, -2F);

		tailModel[2].addBox(-7F, 0F, 0F, 6, 6, 4, 0F); // Box 0
		tailModel[2].setRotationPoint(170F, -66.7F, -2F);

		tailModel[3].addShapeBox(-1F, -1F, -5F, 2, 2, 8, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[3].setRotationPoint(166F, -63.7F, 7F);

		tailModel[4].addShapeBox(-25F, 0F, -6F, 105, 8, 12, 0F, 0F, -2F, -4F, 0F, -10F, -4F, 0F, -10F, -4F, 0F, -2F, -4F, 0F, 0F, 5F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 5F); // Box 0
		tailModel[4].setRotationPoint(86F, -42F, 0F);

		tailModel[5].addShapeBox(-7F, 0F, -35F, 16, 1, 70, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[5].setRotationPoint(157F, -32F, 0F);

		tailModel[6].addShapeBox(-7F, 0F, 0F, 14, 25, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 0
		tailModel[6].setRotationPoint(40F, -34F, -11F);

		tailModel[7].addShapeBox(-7F, 0F, 0F, 14, 5, 4, 0F, 0F, -3.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[7].setRotationPoint(139F, -38F, -2F);

		tailModel[8].addShapeBox(-7F, 0F, 0F, 14, 23, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F); // Box 0
		tailModel[8].setRotationPoint(54F, -34F, -11F);

		tailModel[9].addShapeBox(-7F, 0F, 0F, 100, 18, 26, 0F, 0F, -4F, -2F, 0F, 5F, -11.7F, 0F, 5F, -11.7F, 0F, -4F, -2F, 0F, -10F, -4F, 0F, -23F, -11.7F, 0F, -23F, -11.7F, 0F, -10F, -4F); // Box 0
		tailModel[9].setRotationPoint(68F, -19F, -13F);

		tailModel[10].addShapeBox(-7F, 0F, 0F, 14, 8, 22, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 2F, -1F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 2F, -1F); // Box 0
		tailModel[10].setRotationPoint(54F, -15F, -11F);

		tailModel[11].addShapeBox(-7F, 0F, 0F, 14, 5, 22, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F); // Box 0
		tailModel[11].setRotationPoint(40F, -9F, -11F);


		leftWingModel = new ModelRendererTurbo[72];
		leftWingModel[0] = new ModelRendererTurbo(this, 163, 342, textureX, textureY); // Box 0
		leftWingModel[1] = new ModelRendererTurbo(this, 221, 342, textureX, textureY); // Box 0
		leftWingModel[2] = new ModelRendererTurbo(this, 154, 363, textureX, textureY); // Box 0
		leftWingModel[3] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 0
		leftWingModel[4] = new ModelRendererTurbo(this, 332, 461, textureX, textureY); // Box 0
		leftWingModel[5] = new ModelRendererTurbo(this, 3, 333, textureX, textureY); // Box 0
		leftWingModel[6] = new ModelRendererTurbo(this, 57, 379, textureX, textureY); // Box 0
		leftWingModel[7] = new ModelRendererTurbo(this, 58, 318, textureX, textureY); // Box 0
		leftWingModel[8] = new ModelRendererTurbo(this, 3, 473, textureX, textureY); // Box 0
		leftWingModel[9] = new ModelRendererTurbo(this, 114, 327, textureX, textureY); // Box 0
		leftWingModel[10] = new ModelRendererTurbo(this, 30, 432, textureX, textureY); // Box 0
		leftWingModel[11] = new ModelRendererTurbo(this, 60, 352, textureX, textureY); // Box 0
		leftWingModel[12] = new ModelRendererTurbo(this, 85, 428, textureX, textureY); // Box 0
		leftWingModel[13] = new ModelRendererTurbo(this, 123, 398, textureX, textureY); // Box 0
		leftWingModel[14] = new ModelRendererTurbo(this, 3, 418, textureX, textureY); // Box 0
		leftWingModel[15] = new ModelRendererTurbo(this, 338, 436, textureX, textureY); // Box 0
		leftWingModel[16] = new ModelRendererTurbo(this, 331, 422, textureX, textureY); // Box 0
		leftWingModel[17] = new ModelRendererTurbo(this, 321, 405, textureX, textureY); // Box 0
		leftWingModel[18] = new ModelRendererTurbo(this, 112, 355, textureX, textureY); // Box 0
		leftWingModel[19] = new ModelRendererTurbo(this, 162, 469, textureX, textureY); // Box 0
		leftWingModel[20] = new ModelRendererTurbo(this, 55, 475, textureX, textureY); // Box 0
		leftWingModel[21] = new ModelRendererTurbo(this, 357, 414, textureX, textureY); // Box 0
		leftWingModel[22] = new ModelRendererTurbo(this, 907, 296, textureX, textureY); // Box 0
		leftWingModel[23] = new ModelRendererTurbo(this, 555, 327, textureX, textureY); // Box 0
		leftWingModel[24] = new ModelRendererTurbo(this, 580, 350, textureX, textureY); // Box 0
		leftWingModel[25] = new ModelRendererTurbo(this, 471, 293, textureX, textureY); // Box 0
		leftWingModel[26] = new ModelRendererTurbo(this, 770, 241, textureX, textureY); // Box 0
		leftWingModel[27] = new ModelRendererTurbo(this, 866, 270, textureX, textureY); // Box 0
		leftWingModel[28] = new ModelRendererTurbo(this, 369, 280, textureX, textureY); // Box 0
		leftWingModel[29] = new ModelRendererTurbo(this, 550, 406, textureX, textureY); // Box 0
		leftWingModel[30] = new ModelRendererTurbo(this, 891, 335, textureX, textureY); // Box 0
		leftWingModel[31] = new ModelRendererTurbo(this, 898, 372, textureX, textureY); // Box 0
		leftWingModel[32] = new ModelRendererTurbo(this, 467, 245, textureX, textureY); // Box 0
		leftWingModel[33] = new ModelRendererTurbo(this, 466, 269, textureX, textureY); // Box 0
		leftWingModel[34] = new ModelRendererTurbo(this, 486, 273, textureX, textureY); // Box 0
		leftWingModel[35] = new ModelRendererTurbo(this, 455, 240, textureX, textureY); // Box 0
		leftWingModel[36] = new ModelRendererTurbo(this, 540, 247, textureX, textureY); // Box 0
		leftWingModel[37] = new ModelRendererTurbo(this, 803, 237, textureX, textureY); // Box 0
		leftWingModel[38] = new ModelRendererTurbo(this, 833, 237, textureX, textureY); // Box 0
		leftWingModel[39] = new ModelRendererTurbo(this, 112, 320, textureX, textureY); // Box 0
		leftWingModel[40] = new ModelRendererTurbo(this, 152, 349, textureX, textureY); // Box 0
		leftWingModel[41] = new ModelRendererTurbo(this, 125, 335, textureX, textureY); // Box 0
		leftWingModel[42] = new ModelRendererTurbo(this, 896, 290, textureX, textureY); // Box 0
		leftWingModel[43] = new ModelRendererTurbo(this, 193, 332, textureX, textureY); // Box 0
		leftWingModel[44] = new ModelRendererTurbo(this, 299, 321, textureX, textureY); // Box 0
		leftWingModel[45] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 0
		leftWingModel[46] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 0
		leftWingModel[47] = new ModelRendererTurbo(this, 246, 321, textureX, textureY); // Box 0
		leftWingModel[48] = new ModelRendererTurbo(this, 182, 427, textureX, textureY); // Box 0
		leftWingModel[49] = new ModelRendererTurbo(this, 178, 318, textureX, textureY); // Box 0
		leftWingModel[50] = new ModelRendererTurbo(this, 516, 258, textureX, textureY); // Box 0
		leftWingModel[51] = new ModelRendererTurbo(this, 625, 291, textureX, textureY); // Box 0
		leftWingModel[52] = new ModelRendererTurbo(this, 808, 247, textureX, textureY); // Box 0
		leftWingModel[53] = new ModelRendererTurbo(this, 5, 331, textureX, textureY); // Box 0
		leftWingModel[54] = new ModelRendererTurbo(this, 3, 389, textureX, textureY); // Box 0
		leftWingModel[55] = new ModelRendererTurbo(this, 5, 359, textureX, textureY); // Box 0
		leftWingModel[56] = new ModelRendererTurbo(this, 403, 285, textureX, textureY); // Box 0
		leftWingModel[57] = new ModelRendererTurbo(this, 465, 240, textureX, textureY); // Box 0
		leftWingModel[58] = new ModelRendererTurbo(this, 887, 243, textureX, textureY); // Box 0
		leftWingModel[59] = new ModelRendererTurbo(this, 911, 275, textureX, textureY); // Box 0
		leftWingModel[60] = new ModelRendererTurbo(this, 930, 279, textureX, textureY); // Box 0
		leftWingModel[61] = new ModelRendererTurbo(this, 737, 240, textureX, textureY); // Box 0
		leftWingModel[62] = new ModelRendererTurbo(this, 193, 271, textureX, textureY); // Box 0
		leftWingModel[63] = new ModelRendererTurbo(this, 284, 269, textureX, textureY); // Box 0
		leftWingModel[64] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 0
		leftWingModel[65] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 0
		leftWingModel[66] = new ModelRendererTurbo(this, 514, 290, textureX, textureY); // Box 35
		leftWingModel[67] = new ModelRendererTurbo(this, 651, 240, textureX, textureY); // Box 36
		leftWingModel[68] = new ModelRendererTurbo(this, 778, 257, textureX, textureY); // Box 37
		leftWingModel[69] = new ModelRendererTurbo(this, 855, 457, textureX, textureY); // Box 38
		leftWingModel[70] = new ModelRendererTurbo(this, 945, 232, textureX, textureY); // Box 39
		leftWingModel[71] = new ModelRendererTurbo(this, 428, 267, textureX, textureY); // Box 40

		leftWingModel[0].addShapeBox(0F, 0F, -6F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 0
		leftWingModel[0].setRotationPoint(-3F, -22F, -20F);

		leftWingModel[1].addShapeBox(0F, 0F, -6F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		leftWingModel[1].setRotationPoint(-3F, -22F, -22F);

		leftWingModel[2].addShapeBox(0F, 0F, -6F, 19, 2, 2, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		leftWingModel[2].setRotationPoint(-3F, -22F, -24F);

		leftWingModel[3].addShapeBox(0F, 0F, -6F, 13, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[3].setRotationPoint(2F, -26F, -22F);

		leftWingModel[4].addShapeBox(0F, 0F, -6F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[4].setRotationPoint(-2F, -20F, -22F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[5].setRotationPoint(-11F, -18F, 47.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[6].setRotationPoint(-10F, -19F, 47F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[7].setRotationPoint(-10F, -18F, 47F);

		leftWingModel[8].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 0
		leftWingModel[8].setRotationPoint(-1F, -18F, 47F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[9].setRotationPoint(-1F, -19F, 47F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[10].setRotationPoint(-10F, -19F, 37F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[11].setRotationPoint(-10F, -18F, 37F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[12].setRotationPoint(-11F, -18F, 37.5F);

		leftWingModel[13].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 0
		leftWingModel[13].setRotationPoint(-1F, -18F, 37F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[14].setRotationPoint(-1F, -19F, 37F);

		leftWingModel[15].addBox(0F, 0F, 0F, 22, 3, 4, 0F); // Box 0
		leftWingModel[15].setRotationPoint(-3F, -21F, -45F);

		leftWingModel[16].addBox(0F, 0F, 0F, 22, 1, 3, 0F); // Box 0
		leftWingModel[16].setRotationPoint(-3F, -20F, -41F);

		leftWingModel[17].addBox(0F, 0F, 0F, 22, 1, 3, 0F); // Box 0
		leftWingModel[17].setRotationPoint(-3F, -20F, -48F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[18].setRotationPoint(-1F, -19F, -49F);

		leftWingModel[19].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 0
		leftWingModel[19].setRotationPoint(-1F, -18F, -49F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[20].setRotationPoint(-10F, -19F, -49F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[21].setRotationPoint(-10F, -18F, -49F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		leftWingModel[22].setRotationPoint(-9F, -17.5F, -50F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		leftWingModel[23].setRotationPoint(-9F, -15.5F, -50F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Box 0
		leftWingModel[24].setRotationPoint(-9F, -14.5F, -50F);

		leftWingModel[25].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[25].setRotationPoint(18F, -12.5F, -50.5F);
		leftWingModel[25].rotateAngleX = -0.87266463F;

		leftWingModel[26].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		leftWingModel[26].setRotationPoint(18F, -17.5F, -50.5F);
		leftWingModel[26].rotateAngleX = 0.87266463F;

		leftWingModel[27].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		leftWingModel[27].setRotationPoint(18F, -17.5F, -45.5F);
		leftWingModel[27].rotateAngleX = -0.87266463F;

		leftWingModel[28].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[28].setRotationPoint(18F, -12.5F, -45.5F);
		leftWingModel[28].rotateAngleX = 0.87266463F;

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		leftWingModel[29].setRotationPoint(-9F, -17.5F, -40F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		leftWingModel[30].setRotationPoint(-9F, -15.5F, -40F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Box 0
		leftWingModel[31].setRotationPoint(-9F, -14.5F, -40F);

		leftWingModel[32].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[32].setRotationPoint(18F, -12.5F, -35.5F);
		leftWingModel[32].rotateAngleX = 0.87266463F;

		leftWingModel[33].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		leftWingModel[33].setRotationPoint(18F, -17.5F, -35.5F);
		leftWingModel[33].rotateAngleX = -0.87266463F;

		leftWingModel[34].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		leftWingModel[34].setRotationPoint(18F, -17.5F, -40.5F);
		leftWingModel[34].rotateAngleX = 0.87266463F;

		leftWingModel[35].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[35].setRotationPoint(18F, -12.5F, -40.5F);
		leftWingModel[35].rotateAngleX = -0.87266463F;

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		leftWingModel[36].setRotationPoint(-10F, -16.5F, -39.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		leftWingModel[37].setRotationPoint(-10F, -15.5F, -39.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F); // Box 0
		leftWingModel[38].setRotationPoint(-10F, -14.5F, -39.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[39].setRotationPoint(-11F, -18F, -48.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 0
		leftWingModel[40].setRotationPoint(-11F, -18F, -38.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[41].setRotationPoint(-10F, -18F, -39F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftWingModel[42].setRotationPoint(-10F, -19F, -39F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[43].setRotationPoint(-1F, -19F, -39F);

		leftWingModel[44].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 0
		leftWingModel[44].setRotationPoint(-1F, -18F, -39F);

		leftWingModel[45].addShapeBox(0F, 0F, -6F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[45].setRotationPoint(2F, -24F, -38F);

		leftWingModel[46].addShapeBox(0F, 0F, -6F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[46].setRotationPoint(-2F, -20F, -38F);

		leftWingModel[47].addShapeBox(0F, 0F, -6F, 19, 1, 2, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		leftWingModel[47].setRotationPoint(-3F, -22F, -40F);

		leftWingModel[48].addShapeBox(0F, 0F, -6F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		leftWingModel[48].setRotationPoint(-3F, -22F, -38F);

		leftWingModel[49].addShapeBox(0F, 0F, -6F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 0
		leftWingModel[49].setRotationPoint(-3F, -22F, -36F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		leftWingModel[50].setRotationPoint(-10F, -15.5F, -49.5F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F); // Box 0
		leftWingModel[51].setRotationPoint(-10F, -14.5F, -49.5F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		leftWingModel[52].setRotationPoint(-10F, -16.5F, -49.5F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 44, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[53].setRotationPoint(-12F, -19F, -33.5F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 44, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		leftWingModel[54].setRotationPoint(-12F, -16F, -33.5F);

		leftWingModel[55].addBox(0F, 0F, 0F, 44, 2, 13, 0F); // Box 0
		leftWingModel[55].setRotationPoint(-12F, -18F, -33.5F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[56].setRotationPoint(-13F, -16F, -30.5F);

		leftWingModel[57].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		leftWingModel[57].setRotationPoint(-13F, -18F, -21.5F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[58].setRotationPoint(-13F, -16F, -24.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[59].setRotationPoint(-13F, -19F, -21.5F);

		leftWingModel[60].addTrapezoid(0F, 0F, 0F, 1, 1, 11, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		leftWingModel[60].setRotationPoint(-13F, -19F, -32.5F);

		leftWingModel[61].addTrapezoid(0F, 0F, 0F, 1, 1, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		leftWingModel[61].setRotationPoint(-13F, -12F, -30.5F);

		leftWingModel[62].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		leftWingModel[62].setRotationPoint(-13F, -18F, -33.5F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[63].setRotationPoint(-13F, -19F, -33.5F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 30, 3, 20, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[64].setRotationPoint(-13F, -30F, -31F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 25, 3, 20, 0F, -6F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[65].setRotationPoint(-8F, -28F, -51F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 35
		leftWingModel[66].setRotationPoint(-11F, -14.5F, -39F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 36
		leftWingModel[67].setRotationPoint(-11F, -15.5F, -39F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 37
		leftWingModel[68].setRotationPoint(-11F, -16.5F, -39F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 38
		leftWingModel[69].setRotationPoint(-11F, -15.5F, -49F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 39
		leftWingModel[70].setRotationPoint(-11F, -16.5F, -49F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 40
		leftWingModel[71].setRotationPoint(-11F, -14.5F, -49F);


		rightWingModel = new ModelRendererTurbo[56];
		rightWingModel[0] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 0
		rightWingModel[1] = new ModelRendererTurbo(this, 9, 13, textureX, textureY); // Box 0
		rightWingModel[2] = new ModelRendererTurbo(this, 163, 454, textureX, textureY); // Box 0
		rightWingModel[3] = new ModelRendererTurbo(this, 112, 389, textureX, textureY); // Box 0
		rightWingModel[4] = new ModelRendererTurbo(this, 130, 379, textureX, textureY); // Box 0
		rightWingModel[5] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 0
		rightWingModel[6] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 0
		rightWingModel[7] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 0
		rightWingModel[8] = new ModelRendererTurbo(this, 103, 349, textureX, textureY); // Box 0
		rightWingModel[9] = new ModelRendererTurbo(this, 6, 350, textureX, textureY); // Box 0
		rightWingModel[10] = new ModelRendererTurbo(this, 73, 412, textureX, textureY); // Box 0
		rightWingModel[11] = new ModelRendererTurbo(this, 442, 330, textureX, textureY); // Box 0
		rightWingModel[12] = new ModelRendererTurbo(this, 484, 387, textureX, textureY); // Box 0
		rightWingModel[13] = new ModelRendererTurbo(this, 678, 374, textureX, textureY); // Box 0
		rightWingModel[14] = new ModelRendererTurbo(this, 909, 492, textureX, textureY); // Box 0
		rightWingModel[15] = new ModelRendererTurbo(this, 898, 541, textureX, textureY); // Box 0
		rightWingModel[16] = new ModelRendererTurbo(this, 458, 488, textureX, textureY); // Box 0
		rightWingModel[17] = new ModelRendererTurbo(this, 463, 500, textureX, textureY); // Box 0
		rightWingModel[18] = new ModelRendererTurbo(this, 479, 257, textureX, textureY); // Box 0
		rightWingModel[19] = new ModelRendererTurbo(this, 781, 274, textureX, textureY); // Box 0
		rightWingModel[20] = new ModelRendererTurbo(this, 413, 257, textureX, textureY); // Box 0
		rightWingModel[21] = new ModelRendererTurbo(this, 3, 377, textureX, textureY); // Box 0
		rightWingModel[22] = new ModelRendererTurbo(this, 805, 254, textureX, textureY); // Box 0
		rightWingModel[23] = new ModelRendererTurbo(this, 991, 258, textureX, textureY); // Box 0
		rightWingModel[24] = new ModelRendererTurbo(this, 469, 363, textureX, textureY); // Box 0
		rightWingModel[25] = new ModelRendererTurbo(this, 720, 406, textureX, textureY); // Box 0
		rightWingModel[26] = new ModelRendererTurbo(this, 544, 339, textureX, textureY); // Box 0
		rightWingModel[27] = new ModelRendererTurbo(this, 909, 265, textureX, textureY); // Box 0
		rightWingModel[28] = new ModelRendererTurbo(this, 1013, 307, textureX, textureY); // Box 0
		rightWingModel[29] = new ModelRendererTurbo(this, 611, 446, textureX, textureY); // Box 0
		rightWingModel[30] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 0
		rightWingModel[31] = new ModelRendererTurbo(this, 414, 276, textureX, textureY); // Box 0
		rightWingModel[32] = new ModelRendererTurbo(this, 384, 319, textureX, textureY); // Box 0
		rightWingModel[33] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 0
		rightWingModel[34] = new ModelRendererTurbo(this, 2, 323, textureX, textureY); // Box 0
		rightWingModel[35] = new ModelRendererTurbo(this, 7, 413, textureX, textureY); // Box 0
		rightWingModel[36] = new ModelRendererTurbo(this, 273, 418, textureX, textureY); // Box 0
		rightWingModel[37] = new ModelRendererTurbo(this, 135, 319, textureX, textureY); // Box 0
		rightWingModel[38] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 0
		rightWingModel[39] = new ModelRendererTurbo(this, 271, 329, textureX, textureY); // Box 0
		rightWingModel[40] = new ModelRendererTurbo(this, 444, 377, textureX, textureY); // Box 0
		rightWingModel[41] = new ModelRendererTurbo(this, 451, 407, textureX, textureY); // Box 0
		rightWingModel[42] = new ModelRendererTurbo(this, 665, 329, textureX, textureY); // Box 0
		rightWingModel[43] = new ModelRendererTurbo(this, 656, 361, textureX, textureY); // Box 0
		rightWingModel[44] = new ModelRendererTurbo(this, 436, 342, textureX, textureY); // Box 0
		rightWingModel[45] = new ModelRendererTurbo(this, 665, 333, textureX, textureY); // Box 0
		rightWingModel[46] = new ModelRendererTurbo(this, 275, 357, textureX, textureY); // Box 0
		rightWingModel[47] = new ModelRendererTurbo(this, 621, 368, textureX, textureY); // Box 0
		rightWingModel[48] = new ModelRendererTurbo(this, 444, 367, textureX, textureY); // Box 0
		rightWingModel[49] = new ModelRendererTurbo(this, 275, 388, textureX, textureY); // Box 0
		rightWingModel[50] = new ModelRendererTurbo(this, 780, 239, textureX, textureY); // Box 29
		rightWingModel[51] = new ModelRendererTurbo(this, 993, 243, textureX, textureY); // Box 30
		rightWingModel[52] = new ModelRendererTurbo(this, 787, 262, textureX, textureY); // Box 31
		rightWingModel[53] = new ModelRendererTurbo(this, 135, 252, textureX, textureY); // Box 32
		rightWingModel[54] = new ModelRendererTurbo(this, 53, 242, textureX, textureY); // Box 33
		rightWingModel[55] = new ModelRendererTurbo(this, 610, 261, textureX, textureY); // Box 34

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 25, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -6F, 4F, 0F); // Box 0
		rightWingModel[0].setRotationPoint(-8F, -28F, 31F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 30, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 2F, 0F); // Box 0
		rightWingModel[1].setRotationPoint(-13F, -30F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, -6F, 19, 2, 2, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		rightWingModel[2].setRotationPoint(-3F, -22F, 28F);

		rightWingModel[3].addShapeBox(0F, 0F, -6F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		rightWingModel[3].setRotationPoint(-3F, -22F, 30F);

		rightWingModel[4].addShapeBox(0F, 0F, -6F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 0
		rightWingModel[4].setRotationPoint(-3F, -22F, 32F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		rightWingModel[5].setRotationPoint(16F, -23F, 25F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		rightWingModel[6].setRotationPoint(16F, -23F, -27F);

		rightWingModel[7].addShapeBox(0F, 0F, -6F, 13, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[7].setRotationPoint(2F, -26F, 30F);

		rightWingModel[8].addShapeBox(0F, 0F, -6F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[8].setRotationPoint(-2F, -20F, 30F);

		rightWingModel[9].addBox(0F, 0F, 0F, 22, 1, 3, 0F); // Box 0
		rightWingModel[9].setRotationPoint(-3F, -20F, 38F);

		rightWingModel[10].addBox(0F, 0F, 0F, 22, 3, 4, 0F); // Box 0
		rightWingModel[10].setRotationPoint(-3F, -21F, 41F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		rightWingModel[11].setRotationPoint(-9F, -17.5F, 46F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		rightWingModel[12].setRotationPoint(-9F, -15.5F, 46F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Box 0
		rightWingModel[13].setRotationPoint(-9F, -14.5F, 46F);

		rightWingModel[14].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		rightWingModel[14].setRotationPoint(18F, -12.5F, 45.5F);
		rightWingModel[14].rotateAngleX = -0.87266463F;

		rightWingModel[15].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		rightWingModel[15].setRotationPoint(18F, -17.5F, 45.5F);
		rightWingModel[15].rotateAngleX = 0.87266463F;

		rightWingModel[16].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		rightWingModel[16].setRotationPoint(18F, -17.5F, 50.5F);
		rightWingModel[16].rotateAngleX = -0.87266463F;

		rightWingModel[17].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		rightWingModel[17].setRotationPoint(18F, -12.5F, 50.5F);
		rightWingModel[17].rotateAngleX = 0.87266463F;

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		rightWingModel[18].setRotationPoint(-10F, -15.5F, 46.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		rightWingModel[19].setRotationPoint(-10F, -16.5F, 46.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F); // Box 0
		rightWingModel[20].setRotationPoint(-10F, -14.5F, 46.5F);

		rightWingModel[21].addBox(0F, 0F, 0F, 22, 1, 3, 0F); // Box 0
		rightWingModel[21].setRotationPoint(-3F, -20F, 45F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		rightWingModel[22].setRotationPoint(-10F, -16.5F, 36.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1F); // Box 0
		rightWingModel[23].setRotationPoint(-10F, -14.5F, 36.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Box 0
		rightWingModel[24].setRotationPoint(-9F, -14.5F, 36F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 29, 1, 4, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		rightWingModel[25].setRotationPoint(-9F, -15.5F, 36F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		rightWingModel[26].setRotationPoint(-9F, -17.5F, 36F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 0
		rightWingModel[27].setRotationPoint(-10F, -15.5F, 36.5F);

		rightWingModel[28].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		rightWingModel[28].setRotationPoint(18F, -17.5F, 35.5F);
		rightWingModel[28].rotateAngleX = 0.87266463F;

		rightWingModel[29].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		rightWingModel[29].setRotationPoint(18F, -12.5F, 35.5F);
		rightWingModel[29].rotateAngleX = -0.87266463F;

		rightWingModel[30].addShapeBox(0F, -2F, -0.5F, 2, 2, 1, 0F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0
		rightWingModel[30].setRotationPoint(18F, -12.5F, 40.5F);
		rightWingModel[30].rotateAngleX = 0.87266463F;

		rightWingModel[31].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F); // Box 0
		rightWingModel[31].setRotationPoint(18F, -17.5F, 40.5F);
		rightWingModel[31].rotateAngleX = -0.87266463F;

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		rightWingModel[32].setRotationPoint(16F, -22F, -44F);

		rightWingModel[33].addShapeBox(0F, 0F, -6F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[33].setRotationPoint(2F, -24F, 48F);

		rightWingModel[34].addShapeBox(0F, 0F, -6F, 19, 1, 2, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		rightWingModel[34].setRotationPoint(-3F, -22F, 46F);

		rightWingModel[35].addShapeBox(0F, 0F, -6F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 0
		rightWingModel[35].setRotationPoint(-3F, -22F, 48F);

		rightWingModel[36].addShapeBox(0F, 0F, -6F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 0
		rightWingModel[36].setRotationPoint(-3F, -22F, 50F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		rightWingModel[37].setRotationPoint(16F, -22F, 42F);

		rightWingModel[38].addShapeBox(0F, 0F, -6F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[38].setRotationPoint(-2F, -20F, 48F);

		rightWingModel[39].addBox(0F, 0F, 0F, 44, 2, 13, 0F); // Box 0
		rightWingModel[39].setRotationPoint(-12F, -18F, 18.5F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[40].setRotationPoint(-13F, -19F, 18.5F);

		rightWingModel[41].addTrapezoid(0F, 0F, 0F, 1, 1, 11, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		rightWingModel[41].setRotationPoint(-13F, -19F, 19.5F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[42].setRotationPoint(-13F, -19F, 30.5F);

		rightWingModel[43].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		rightWingModel[43].setRotationPoint(-13F, -18F, 30.5F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[44].setRotationPoint(-13F, -16F, 27.5F);

		rightWingModel[45].addTrapezoid(0F, 0F, 0F, 1, 1, 7, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		rightWingModel[45].setRotationPoint(-13F, -12F, 21.5F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 44, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 0
		rightWingModel[46].setRotationPoint(-12F, -16F, 18.5F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[47].setRotationPoint(-13F, -16F, 21.5F);

		rightWingModel[48].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		rightWingModel[48].setRotationPoint(-13F, -18F, 18.5F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 44, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[49].setRotationPoint(-12F, -19F, 18.5F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 29
		rightWingModel[50].setRotationPoint(-11F, -16.5F, 47F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 30
		rightWingModel[51].setRotationPoint(-11F, -14.5F, 47F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 31
		rightWingModel[52].setRotationPoint(-11F, -15.5F, 47F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 32
		rightWingModel[53].setRotationPoint(-11F, -14.5F, 37F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 33
		rightWingModel[54].setRotationPoint(-11F, -15.5F, 37F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 34
		rightWingModel[55].setRotationPoint(-11F, -16.5F, 37F);


		bodyWheelModel = new ModelRendererTurbo[2];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 782, 554, textureX, textureY); // Box 0
		bodyWheelModel[1] = new ModelRendererTurbo(this, 659, 503, textureX, textureY); // Box 0

		bodyWheelModel[0].addBox(-7F, 0F, -2F, 3, 3, 2, 0F); // Box 0
		bodyWheelModel[0].setRotationPoint(-31.5F, 3F, -18.5F);

		bodyWheelModel[1].addBox(-7F, 0F, 0F, 3, 3, 2, 0F); // Box 0
		bodyWheelModel[1].setRotationPoint(-31.5F, 3F, 18.5F);


		tailWheelModel = new ModelRendererTurbo[8];
		tailWheelModel[0] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 0
		tailWheelModel[1] = new ModelRendererTurbo(this, 909, 442, textureX, textureY); // Box 0
		tailWheelModel[2] = new ModelRendererTurbo(this, 717, 313, textureX, textureY); // Box 0
		tailWheelModel[3] = new ModelRendererTurbo(this, 990, 284, textureX, textureY); // Box 0
		tailWheelModel[4] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 0
		tailWheelModel[5] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 0
		tailWheelModel[6] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 0
		tailWheelModel[7] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 0

		tailWheelModel[0].addShapeBox(-7F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 0
		tailWheelModel[0].setRotationPoint(136F, -9.5F, -1.5F);

		tailWheelModel[1].addShapeBox(-7F, 0F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailWheelModel[1].setRotationPoint(137F, 4.5F, -2F);

		tailWheelModel[2].addShapeBox(-7F, 0F, 0F, 8, 2, 3, 0F, -2.00F, 0F, 0.00F, -2.00F, 0F, 0F, -2.00F, 0F, 0F, -2.00F, 0F, 0.00F, 0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0F); // Box 0
		tailWheelModel[2].setRotationPoint(137F, 2.5F, -2F);

		tailWheelModel[3].addShapeBox(-7F, 0F, 0F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0F, -2.00F, 0F, 0.00F, -2.00F, 0F, 0F, -2.00F, 0F, 0F, -2.00F, 0F, 0.00F); // Box 0
		tailWheelModel[3].setRotationPoint(137F, 8.5F, -2F);

		tailWheelModel[4].addShapeBox(-7F, 0F, 0F, 2, 5, 2, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		tailWheelModel[4].setRotationPoint(138F, -2.5F, -1.5F);

		tailWheelModel[5].addShapeBox(-7F, 0F, 0F, 1, 11, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -4.25F, 0F, -0.25F, 3.75F, 0F, -0.25F, 3.75F, 0F, -0.25F, -4.25F, 0F, -0.25F); // Box 0
		tailWheelModel[5].setRotationPoint(137.5F, -8.5F, -1F);

		tailWheelModel[6].addShapeBox(-7F, 0F, 0F, 6, 10, 4, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 0
		tailWheelModel[6].setRotationPoint(134F, -14.5F, -2.5F);

		tailWheelModel[7].addShapeBox(-7F, 0F, 0F, 11, 6, 5, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 0
		tailWheelModel[7].setRotationPoint(127F, -20.5F, -3F);


		leftWingWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 679, 259, textureX, textureY); // Box 0
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 155, 293, textureX, textureY); // Box 0
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 196, 295, textureX, textureY); // Box 0
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 803, 530, textureX, textureY); // Box 0
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 885, 497, textureX, textureY); // Box 0

		leftWingWheelModel[0].addBox(-7F, 0F, -2F, 12, 4, 3, 0F); // Box 0
		leftWingWheelModel[0].setRotationPoint(-36F, 2.5F, -21.5F);

		leftWingWheelModel[1].addFlexTrapezoid(-7F, 0F, -2F, 12, 4, 3, 0F, -4.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		leftWingWheelModel[1].setRotationPoint(-36F, -1.5F, -21.5F);

		leftWingWheelModel[2].addFlexTrapezoid(-7F, 0F, -2F, 12, 4, 3, 0F, -4.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 0
		leftWingWheelModel[2].setRotationPoint(-36F, 6.5F, -21.5F);

		leftWingWheelModel[3].addShapeBox(-7F, 0F, -2F, 2, 8, 2, 0F, 14F, 0F, -7F, -14F, 0F, -7F, -14F, 0F, 7F, 14F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingWheelModel[3].setRotationPoint(-31F, -5F, -18.5F);

		leftWingWheelModel[4].addBox(-7F, 0F, -2F, 2, 2, 3, 0F); // Box 0
		leftWingWheelModel[4].setRotationPoint(-45F, -7F, -11.5F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 228, 247, textureX, textureY); // Box 0
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 525, 306, textureX, textureY); // Box 0
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 908, 255, textureX, textureY); // Box 0
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 790, 539, textureX, textureY); // Box 0
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 605, 90, textureX, textureY); // Box 0
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 711, 478, textureX, textureY); // Box 0
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 7

		rightWingWheelModel[0].addFlexTrapezoid(-7F, 0F, 0F, 12, 4, 3, 0F, -4.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		rightWingWheelModel[0].setRotationPoint(-36F, -1.5F, 20.5F);

		rightWingWheelModel[1].addBox(-7F, 0F, 0F, 12, 4, 3, 0F); // Box 0
		rightWingWheelModel[1].setRotationPoint(-36F, 2.5F, 20.5F);

		rightWingWheelModel[2].addFlexTrapezoid(-7F, 0F, 0F, 12, 4, 3, 0F, -4.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 0
		rightWingWheelModel[2].setRotationPoint(-36F, 6.5F, 20.5F);

		rightWingWheelModel[3].addShapeBox(-7F, 0F, 0F, 2, 8, 2, 0F, 14F, 0F, 7F, -14F, 0F, 7F, -14F, 0F, -7F, 14F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingWheelModel[3].setRotationPoint(-31F, -5F, 18.5F);

		rightWingWheelModel[4].addShapeBox(-1F, 0F, -1F, 2, 24, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingWheelModel[4].setRotationPoint(-41F, -23F, 10.5F);
		rightWingWheelModel[4].rotateAngleX = 0.26179939F;

		rightWingWheelModel[5].addBox(-7F, 0F, 0F, 2, 2, 3, 0F); // Box 0
		rightWingWheelModel[5].setRotationPoint(-45F, -7F, 10.5F);

		rightWingWheelModel[6].addShapeBox(-1F, 0F, -1F, 2, 24, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		rightWingWheelModel[6].setRotationPoint(-41F, -23F, -10.5F);
		rightWingWheelModel[6].rotateAngleX = -0.26179939F;


		heliMainRotorModels[0] = new ModelRendererTurbo[29];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 0
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 469, 446, textureX, textureY); // Box 0
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 520, 446, textureX, textureY); // Box 0
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 258, 248, textureX, textureY); // Box 0
		heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 692, 359, textureX, textureY); // Box 0
		heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 802, 403, textureX, textureY); // Box 0
		heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 486, 421, textureX, textureY); // Box 0
		heliMainRotorModels[0][7] = new ModelRendererTurbo(this, 697, 341, textureX, textureY); // Box 0
		heliMainRotorModels[0][8] = new ModelRendererTurbo(this, 764, 305, textureX, textureY); // Box 0
		heliMainRotorModels[0][9] = new ModelRendererTurbo(this, 848, 243, textureX, textureY); // Box 0
		heliMainRotorModels[0][10] = new ModelRendererTurbo(this, 840, 295, textureX, textureY); // Box 0
		heliMainRotorModels[0][11] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 0
		heliMainRotorModels[0][12] = new ModelRendererTurbo(this, 287, 244, textureX, textureY); // Box 0
		heliMainRotorModels[0][13] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 0
		heliMainRotorModels[0][14] = new ModelRendererTurbo(this, 77, 260, textureX, textureY); // Box 0
		heliMainRotorModels[0][15] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 0
		heliMainRotorModels[0][16] = new ModelRendererTurbo(this, 549, 271, textureX, textureY); // Box 0
		heliMainRotorModels[0][17] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 0
		heliMainRotorModels[0][18] = new ModelRendererTurbo(this, 150, 236, textureX, textureY); // Box 0
		heliMainRotorModels[0][19] = new ModelRendererTurbo(this, 526, 789, textureX, textureY); // Box 0
		heliMainRotorModels[0][20] = new ModelRendererTurbo(this, 632, 793, textureX, textureY); // Box 0
		heliMainRotorModels[0][21] = new ModelRendererTurbo(this, 578, 811, textureX, textureY); // Box 0
		heliMainRotorModels[0][22] = new ModelRendererTurbo(this, 182, 251, textureX, textureY); // Box 0
		heliMainRotorModels[0][23] = new ModelRendererTurbo(this, 652, 288, textureX, textureY); // Box 0
		heliMainRotorModels[0][24] = new ModelRendererTurbo(this, 275, 294, textureX, textureY); // Box 0
		heliMainRotorModels[0][25] = new ModelRendererTurbo(this, 431, 288, textureX, textureY); // Box 0
		heliMainRotorModels[0][26] = new ModelRendererTurbo(this, 992, 238, textureX, textureY); // Box 0
		heliMainRotorModels[0][27] = new ModelRendererTurbo(this, 385, 239, textureX, textureY); // Box 0
		heliMainRotorModels[0][28] = new ModelRendererTurbo(this, 575, 249, textureX, textureY); // Box 11

		heliMainRotorModels[0][0].addBox(-1.5F, 2F, -1.5F, 3, 4, 3, 0F); // Box 0
		heliMainRotorModels[0][0].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][1].addShapeBox(2F, 1F, -5F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][1].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][2].addShapeBox(-5F, 1F, -5F, 3, 1, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		heliMainRotorModels[0][2].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][3].addShapeBox(-2F, 1F, -5F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][3].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][4].addShapeBox(-124F, -1F, -3F, 90, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][4].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][4].rotateAngleX = -0.17453293F;

		heliMainRotorModels[0][5].addShapeBox(-124F, -1F, -3F, 90, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][5].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][5].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][5].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][6].addShapeBox(-124F, -1F, -3F, 90, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][6].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][6].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][6].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][7].addShapeBox(-124F, -1F, -3F, 90, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][7].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][7].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][7].rotateAngleY = 1.57079633F;

		heliMainRotorModels[0][8].addShapeBox(-14F, -2F, 0F, 12, 3, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		heliMainRotorModels[0][8].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][8].rotateAngleY = 1.57079633F;

		heliMainRotorModels[0][9].addShapeBox(-14F, -2F, 0F, 12, 3, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		heliMainRotorModels[0][9].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][10].addShapeBox(-14F, -2F, 0F, 12, 3, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		heliMainRotorModels[0][10].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][10].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][11].addShapeBox(-34F, -1F, -3F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][11].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][11].rotateAngleX = -0.17453293F;

		heliMainRotorModels[0][12].addShapeBox(-31F, -1F, 0F, 17, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][12].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][12].rotateAngleX = -0.17453293F;

		heliMainRotorModels[0][13].addShapeBox(-34F, -1F, -3F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][13].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][13].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][13].rotateAngleY = 1.57079633F;

		heliMainRotorModels[0][14].addShapeBox(-31F, -1F, 0F, 17, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][14].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][14].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][14].rotateAngleY = 1.57079633F;

		heliMainRotorModels[0][15].addShapeBox(-34F, -1F, -3F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][15].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][15].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][15].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][16].addShapeBox(-31F, -1F, 0F, 17, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][16].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][16].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][16].rotateAngleY = -1.57079633F;

		heliMainRotorModels[0][17].addShapeBox(-34F, -1F, -3F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][17].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][17].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][17].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][18].addShapeBox(-31F, -1F, 0F, 17, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][18].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][18].rotateAngleX = -0.17453293F;
		heliMainRotorModels[0][18].rotateAngleY = -3.14159265F;

		heliMainRotorModels[0][19].addShapeBox(1F, -1F, -4F, 3, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][19].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][20].addShapeBox(-1F, -1F, -4F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][20].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][21].addShapeBox(-4F, -1F, -4F, 3, 2, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		heliMainRotorModels[0][21].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][22].addShapeBox(-5F, -3F, -8F, 10, 2, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][22].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][23].addShapeBox(5F, -3F, -8F, 3, 2, 16, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][23].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][24].addShapeBox(-8F, -3F, -8F, 3, 2, 16, 0F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		heliMainRotorModels[0][24].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][25].addShapeBox(-5F, -4F, -6F, 10, 1, 12, 0F, -1F, -0.25F, -2F, -1F, -0.25F, -2F, -1F, -0.25F, -2F, -1F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][25].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][26].addShapeBox(-6F, -4F, -6F, 1, 1, 12, 0F, -2F, -0.25F, -2F, 1F, -0.25F, -2F, 1F, -0.25F, -2F, -2F, -0.25F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		heliMainRotorModels[0][26].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][27].addShapeBox(5F, -4F, -6F, 1, 1, 12, 0F, 1F, -0.25F, -2F, -2F, -0.25F, -2F, -2F, -0.25F, -2F, 1F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		heliMainRotorModels[0][27].setRotationPoint(0F, -64F, 0F);

		heliMainRotorModels[0][28].addShapeBox(-14F, -2F, 0F, 12, 3, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		heliMainRotorModels[0][28].setRotationPoint(0F, -64F, 0F);
		heliMainRotorModels[0][28].rotateAngleY = -1.57079633F;


		heliTailRotorModels[0] = new ModelRendererTurbo[14];
		heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 409, 445, textureX, textureY); // Box 0
		heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 984, 434, textureX, textureY); // Box 0
		heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 784, 619, textureX, textureY); // Box 0
		heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 795, 776, textureX, textureY); // Box 0
		heliTailRotorModels[0][4] = new ModelRendererTurbo(this, 500, 234, textureX, textureY); // Box 0
		heliTailRotorModels[0][5] = new ModelRendererTurbo(this, 750, 261, textureX, textureY); // Box 0
		heliTailRotorModels[0][6] = new ModelRendererTurbo(this, 481, 296, textureX, textureY); // Box 0
		heliTailRotorModels[0][7] = new ModelRendererTurbo(this, 801, 262, textureX, textureY); // Box 0
		heliTailRotorModels[0][8] = new ModelRendererTurbo(this, 436, 252, textureX, textureY); // Box 0
		heliTailRotorModels[0][9] = new ModelRendererTurbo(this, 814, 294, textureX, textureY); // Box 0
		heliTailRotorModels[0][10] = new ModelRendererTurbo(this, 882, 286, textureX, textureY); // Box 0
		heliTailRotorModels[0][11] = new ModelRendererTurbo(this, 831, 262, textureX, textureY); // Box 0
		heliTailRotorModels[0][12] = new ModelRendererTurbo(this, 816, 232, textureX, textureY); // Box 0
		heliTailRotorModels[0][13] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 0

		heliTailRotorModels[0][0].addShapeBox(-1F, -27F, -1F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][0].setRotationPoint(166F, -63.75F, 11F);

		heliTailRotorModels[0][1].addShapeBox(-3F, 10F, -1F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][1].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][1].rotateAngleY = -0.13962634F;

		heliTailRotorModels[0][2].addShapeBox(-1F, -27F, -2F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][2].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][2].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][3].addShapeBox(-3F, 10F, -2F, 4, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][3].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][3].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][4].addShapeBox(-2F, -2F, -1F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][4].setRotationPoint(166F, -63.75F, 11F);

		heliTailRotorModels[0][5].addShapeBox(-1F, -10F, -1F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][5].setRotationPoint(166F, -63.75F, 11F);

		heliTailRotorModels[0][6].addShapeBox(-1F, -8F, -1F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][6].setRotationPoint(166F, -63.75F, 11F);

		heliTailRotorModels[0][7].addShapeBox(-1F, 2F, -2F, 2, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][7].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][7].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][8].addShapeBox(-3F, 8F, -2F, 4, 2, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][8].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][8].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][9].addShapeBox(-1F, -8F, -2F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][9].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][9].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][10].addShapeBox(-1F, -10F, -2F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][10].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][10].rotateAngleZ = 1.57079633F;

		heliTailRotorModels[0][11].addShapeBox(-1F, 2F, -1F, 2, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][11].setRotationPoint(166F, -63.75F, 11F);

		heliTailRotorModels[0][12].addShapeBox(-3F, 8F, -1F, 4, 2, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][12].setRotationPoint(166F, -63.75F, 11F);
		heliTailRotorModels[0][12].rotateAngleY = -0.13962634F;

		heliTailRotorModels[0][13].addShapeBox(-2F, -2F, -2F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		heliTailRotorModels[0][13].setRotationPoint(166F, -63.75F, 11F);



		heliMainRotorOrigins = new Vector3f[] { new Vector3f(-3F / 16F, -65.5F / 16F, 0F / 16F) };

		heliTailRotorOrigins = new Vector3f[] { new Vector3f(166F / 16F, -59F / 16F, 9F / 16F) };

		heliRotorSpeeds = new float[] { 150F };

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}