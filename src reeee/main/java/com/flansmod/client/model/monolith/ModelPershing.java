//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPershing extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPershing() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[118];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Shape 40
		bodyModel[23] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Shape 41
		bodyModel[24] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Shape 42
		bodyModel[25] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Shape 43
		bodyModel[26] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Shape 44
		bodyModel[27] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Shape 50
		bodyModel[28] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Shape 51
		bodyModel[29] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Shape 52
		bodyModel[30] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Shape 53
		bodyModel[31] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Shape 54
		bodyModel[32] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Shape 55
		bodyModel[33] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 78
		bodyModel[39] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 80
		bodyModel[41] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 84
		bodyModel[45] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 90
		bodyModel[51] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 8
		bodyModel[52] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 9
		bodyModel[53] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 10
		bodyModel[54] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 24
		bodyModel[55] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 25
		bodyModel[56] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 27
		bodyModel[57] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 28
		bodyModel[58] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 29
		bodyModel[59] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 30
		bodyModel[60] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		bodyModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[62] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 33
		bodyModel[63] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 34
		bodyModel[64] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		bodyModel[65] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 36
		bodyModel[66] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 37
		bodyModel[67] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 38
		bodyModel[68] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 39
		bodyModel[69] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 41
		bodyModel[70] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 42
		bodyModel[71] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 43
		bodyModel[72] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 44
		bodyModel[73] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 45
		bodyModel[74] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 46
		bodyModel[75] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 51
		bodyModel[76] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 54
		bodyModel[77] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 55
		bodyModel[78] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 56
		bodyModel[79] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 57
		bodyModel[80] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 58
		bodyModel[81] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 59
		bodyModel[82] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 60
		bodyModel[83] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 61
		bodyModel[84] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 62
		bodyModel[85] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 63
		bodyModel[86] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 64
		bodyModel[87] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 66
		bodyModel[88] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 67
		bodyModel[89] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 68
		bodyModel[90] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 69
		bodyModel[91] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 70
		bodyModel[92] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 71
		bodyModel[93] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 72
		bodyModel[94] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 73
		bodyModel[95] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 74
		bodyModel[96] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 75
		bodyModel[97] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 76
		bodyModel[98] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 77
		bodyModel[99] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 78
		bodyModel[100] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Shape 17
		bodyModel[101] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 18
		bodyModel[102] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 19
		bodyModel[103] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 20
		bodyModel[104] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Shape 21
		bodyModel[105] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Shape 22
		bodyModel[106] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Shape 23
		bodyModel[107] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Shape 24
		bodyModel[108] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Shape 25
		bodyModel[109] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Shape 26
		bodyModel[110] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Shape 27
		bodyModel[111] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Shape 28
		bodyModel[112] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Shape 29
		bodyModel[113] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Shape 30
		bodyModel[114] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 31
		bodyModel[115] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 32
		bodyModel[116] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 33
		bodyModel[117] = new ModelRendererTurbo(this, 21, 195, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 79, 3, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-51F, -15F, 21F);

		bodyModel[1].addBox(0F, 0F, 0F, 76, 2, 12, 0F); // Box 1
		bodyModel[1].setRotationPoint(-43F, 8F, 21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-57F, -14F, 21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-59F, -10F, 21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 15, 12, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-57F, -5F, 21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 21, 9, 12, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 5
		bodyModel[5].setRotationPoint(28F, -15F, 21F);
		bodyModel[5].rotateAngleZ = 0.17453293F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(50F, -11F, 21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 11, 12, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(32F, -1F, 21F);
		bodyModel[7].rotateAngleZ = 0.12217305F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 79, 3, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-51F, -15F, -33F);

		bodyModel[9].addBox(0F, 0F, 0F, 76, 2, 12, 0F); // Box 9
		bodyModel[9].setRotationPoint(-43F, 8F, -33F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-57F, -14F, -33F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-59F, -10F, -33F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 14, 15, 12, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-57F, -5F, -33F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 9, 12, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 13
		bodyModel[13].setRotationPoint(28F, -15F, -33F);
		bodyModel[13].rotateAngleZ = 0.17453293F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(50F, -11F, -33F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 11, 12, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(32F, -1F, -33F);
		bodyModel[15].rotateAngleZ = 0.12217305F;

		bodyModel[16].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-55F, -9F, 23F);

		bodyModel[17].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Box 35
		bodyModel[17].setRotationPoint(-55F, -9F, 23F);

		bodyModel[18].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 36
		bodyModel[18].setRotationPoint(-55F, -9F, 23F);

		bodyModel[19].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[19].setRotationPoint(39F, -8.5F, 23F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Box 38
		bodyModel[20].setRotationPoint(39F, -8.5F, 23F);

		bodyModel[21].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 39
		bodyModel[21].setRotationPoint(39F, -8.5F, 23F);

		bodyModel[22].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 40
		bodyModel[22].setRotationPoint(0F, -8F, 29F);

		bodyModel[23].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 41
		bodyModel[23].setRotationPoint(14F, -8F, 29F);

		bodyModel[24].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 42
		bodyModel[24].setRotationPoint(28F, -8F, 29F);

		bodyModel[25].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 43
		bodyModel[25].setRotationPoint(-14F, -8F, 29F);

		bodyModel[26].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 44
		bodyModel[26].setRotationPoint(-28F, -8F, 29F);

		bodyModel[27].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 50
		bodyModel[27].setRotationPoint(38F, 8F, 31F);

		bodyModel[28].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 51
		bodyModel[28].setRotationPoint(24F, 8F, 31F);

		bodyModel[29].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 52
		bodyModel[29].setRotationPoint(10F, 8F, 31F);

		bodyModel[30].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 53
		bodyModel[30].setRotationPoint(-4F, 8F, 31F);

		bodyModel[31].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 54
		bodyModel[31].setRotationPoint(-18F, 8F, 31F);

		bodyModel[32].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 55
		bodyModel[32].setRotationPoint(-32F, 8F, 31F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 17, 12, 42, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[33].setRotationPoint(33F, -20F, -21F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 21, 13, 42, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[34].setRotationPoint(12F, -21F, -21F);

		bodyModel[35].addBox(0F, 0F, 0F, 37, 13, 42, 0F); // Box 75
		bodyModel[35].setRotationPoint(-25F, -21F, -21F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 20, 13, 42, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[36].setRotationPoint(-45F, -21F, -21F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 12, 21, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[37].setRotationPoint(-62F, -20F, -21F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 112, 9, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -11F, 0F, 0F); // Box 78
		bodyModel[38].setRotationPoint(-62F, -8F, -21F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 94, 1, 11, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[39].setRotationPoint(-47F, -17F, -31F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 94, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[40].setRotationPoint(-47F, -17F, 20F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[41].setRotationPoint(-58F, -17F, 20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[42].setRotationPoint(-63F, -16F, 20F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[43].setRotationPoint(-63F, -16F, -31F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 2, 11, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[44].setRotationPoint(-58F, -17F, -31F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[45].setRotationPoint(-46F, -21F, 21F);

		bodyModel[46].addBox(0F, 0F, 0F, 35, 4, 9, 0F); // Box 86
		bodyModel[46].setRotationPoint(-23F, -21F, 21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 4, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[47].setRotationPoint(13F, -21F, 21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 15, 4, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[48].setRotationPoint(13F, -21F, -30F);

		bodyModel[49].addBox(0F, 0F, 0F, 35, 4, 9, 0F); // Box 89
		bodyModel[49].setRotationPoint(-23F, -21F, -30F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 22, 4, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[50].setRotationPoint(-46F, -21F, -30F);

		bodyModel[51].addBox(0F, 0F, 0F, 24, 3, 24, 0F); // Box 8
		bodyModel[51].setRotationPoint(-12F, -22F, -12F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 9
		bodyModel[52].setRotationPoint(40F, -16F, -16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
		bodyModel[53].setRotationPoint(46F, -14.5F, -15F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[54].setRotationPoint(-61F, -19F, 29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[55].setRotationPoint(-61F, -21F, 29F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[56].setRotationPoint(-55F, -18F, 29F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[57].setRotationPoint(-48F, -18F, 29F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[58].setRotationPoint(-48F, -18F, -30F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[59].setRotationPoint(-61F, -19F, -30F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[60].setRotationPoint(-55F, -18F, -30F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[61].setRotationPoint(-61F, -21F, -30F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[62].setRotationPoint(-61F, -20F, 24F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[63].setRotationPoint(-61F, -20F, -25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[64].setRotationPoint(-61F, -21F, 25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[65].setRotationPoint(-61F, -21F, -29F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[66].setRotationPoint(-61F, -18F, -29F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[67].setRotationPoint(-61F, -18F, 25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 39
		bodyModel[68].setRotationPoint(-61F, -16F, 18F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[69].setRotationPoint(-61F, -16F, -24F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[70].setRotationPoint(-61F, -19F, -24F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 43
		bodyModel[71].setRotationPoint(-61F, -19F, 13F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 44
		bodyModel[72].setRotationPoint(-61F, -16F, -13F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 45
		bodyModel[73].setRotationPoint(-61F, -16F, 12F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 40, 0F); // Box 46
		bodyModel[74].setRotationPoint(-63F, -13F, -20F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 17, 12, 21, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[75].setRotationPoint(-62F, -20F, 0F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 54
		bodyModel[76].setRotationPoint(39F, -19F, 21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[77].setRotationPoint(39F, -23F, 20F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 56
		bodyModel[78].setRotationPoint(39F, -22F, 20F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[79].setRotationPoint(39F, -20F, 20F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		bodyModel[80].setRotationPoint(39F, -18F, -23F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[81].setRotationPoint(39F, -21F, -24F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 60
		bodyModel[82].setRotationPoint(39F, -20F, -24F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 61
		bodyModel[83].setRotationPoint(39F, -19F, -24F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 62
		bodyModel[84].setRotationPoint(32F, -21F, -28F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 63
		bodyModel[85].setRotationPoint(32F, -21F, -24F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[86].setRotationPoint(32F, -22F, -28F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 66
		bodyModel[87].setRotationPoint(32F, -20F, -26.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 67
		bodyModel[88].setRotationPoint(14F, -21F, 28F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 68
		bodyModel[89].setRotationPoint(7F, -21.5F, 28F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 69
		bodyModel[90].setRotationPoint(-8F, -21.5F, 28F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 70
		bodyModel[91].setRotationPoint(-21F, -21.5F, 28F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 71
		bodyModel[92].setRotationPoint(-30F, -21F, 28F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 72
		bodyModel[93].setRotationPoint(-44F, -20.5F, 28F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 73
		bodyModel[94].setRotationPoint(14F, -21F, -29F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 74
		bodyModel[95].setRotationPoint(7F, -21.5F, -29F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 75
		bodyModel[96].setRotationPoint(-8F, -21.5F, -29F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 76
		bodyModel[97].setRotationPoint(-21F, -21.5F, -29F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 77
		bodyModel[98].setRotationPoint(-30F, -21F, -29F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 78
		bodyModel[99].setRotationPoint(-44F, -20.5F, -29F);

		bodyModel[100].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 17
		bodyModel[100].setRotationPoint(38F, 8F, -23F);

		bodyModel[101].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 18
		bodyModel[101].setRotationPoint(39F, -8.5F, -31F);

		bodyModel[102].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Box 19
		bodyModel[102].setRotationPoint(39F, -8.5F, -31F);

		bodyModel[103].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[103].setRotationPoint(39F, -8.5F, -31F);

		bodyModel[104].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 21
		bodyModel[104].setRotationPoint(28F, -8F, -25F);

		bodyModel[105].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 22
		bodyModel[105].setRotationPoint(24F, 8F, -23F);

		bodyModel[106].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 23
		bodyModel[106].setRotationPoint(14F, -8F, -25F);

		bodyModel[107].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 24
		bodyModel[107].setRotationPoint(10F, 8F, -23F);

		bodyModel[108].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 25
		bodyModel[108].setRotationPoint(0F, -8F, -25F);

		bodyModel[109].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 26
		bodyModel[109].setRotationPoint(-4F, 8F, -23F);

		bodyModel[110].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 27
		bodyModel[110].setRotationPoint(-14F, -8F, -25F);

		bodyModel[111].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 28
		bodyModel[111].setRotationPoint(-18F, 8F, -23F);

		bodyModel[112].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(4, 0, 4, 0), new Coord2D(5, 1, 5, 1), new Coord2D(5, 4, 5, 4), new Coord2D(4, 5, 4, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 4, 0, 4), new Coord2D(0, 1, 0, 1) }), 5, 5, 5, 20, 5, ModelRendererTurbo.MR_FRONT, new float[] {2 ,3 ,2 ,3 ,2 ,3 ,2 ,3}); // Shape 29
		bodyModel[112].setRotationPoint(-28F, -8F, -25F);

		bodyModel[113].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(9, 0, 9, 0), new Coord2D(13, 4, 13, 4), new Coord2D(13, 9, 13, 9), new Coord2D(9, 13, 9, 13), new Coord2D(4, 13, 4, 13), new Coord2D(0, 9, 0, 9), new Coord2D(0, 4, 0, 4) }), 8, 13, 13, 44, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,5 ,6 ,5 ,6 ,5 ,6 ,5}); // Shape 30
		bodyModel[113].setRotationPoint(-32F, 8F, -23F);

		bodyModel[114].addShapeBox(0F, 4F, 0F, 11, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		bodyModel[114].setRotationPoint(-55F, -9F, -31F);

		bodyModel[115].addBox(0F, 0F, 0F, 11, 4, 8, 0F); // Box 32
		bodyModel[115].setRotationPoint(-55F, -9F, -31F);

		bodyModel[116].addShapeBox(0F, -3F, 0F, 11, 3, 8, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[116].setRotationPoint(-55F, -9F, -31F);

		bodyModel[117].addShapeBox(-0.5F, 4F, -6F, 1, 197, 207, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -195F, 0F, 0F, -195F, 0F, -186F, 0F, 0F, -186F, 0F, 0F, -186F, -195F, 0F, -186F, -195F); // Box 0
		bodyModel[117].setRotationPoint(34F, -19F, 0F);
		bodyModel[117].rotateAngleZ = 1.04719755F;


		turretModel = new ModelRendererTurbo[36];
		turretModel[0] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 91
		turretModel[1] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 92
		turretModel[2] = new ModelRendererTurbo(this, 543, 97, textureX, textureY); // Box 93
		turretModel[3] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 94
		turretModel[4] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 95
		turretModel[5] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 108
		turretModel[6] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 110
		turretModel[7] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 112
		turretModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 113
		turretModel[9] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 114
		turretModel[10] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 115
		turretModel[11] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 116
		turretModel[12] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 117
		turretModel[13] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 118
		turretModel[14] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 119
		turretModel[15] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 120
		turretModel[16] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 22
		turretModel[17] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 48
		turretModel[18] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 49
		turretModel[19] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 50
		turretModel[20] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 52
		turretModel[21] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 53
		turretModel[22] = new ModelRendererTurbo(this, 672, 98, textureX, textureY); // Box 79
		turretModel[23] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 0
		turretModel[24] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 1
		turretModel[25] = new ModelRendererTurbo(this, 122, 190, textureX, textureY); // Box 288
		turretModel[26] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 289
		turretModel[27] = new ModelRendererTurbo(this, 177, 216, textureX, textureY); // Box 290
		turretModel[28] = new ModelRendererTurbo(this, 149, 220, textureX, textureY); // Box 291
		turretModel[29] = new ModelRendererTurbo(this, 396, 104, textureX, textureY); // Box 292
		turretModel[30] = new ModelRendererTurbo(this, 10, 74, textureX, textureY); // Box 293
		turretModel[31] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 294
		turretModel[32] = new ModelRendererTurbo(this, 32, 58, textureX, textureY); // Box 295
		turretModel[33] = new ModelRendererTurbo(this, 109, 46, textureX, textureY); // Box 296
		turretModel[34] = new ModelRendererTurbo(this, 131, 204, textureX, textureY); // Box 297
		turretModel[35] = new ModelRendererTurbo(this, 398, 112, textureX, textureY); // Box 299

		turretModel[0].addShapeBox(0F, 0F, -21F, 8, 15, 42, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 91
		turretModel[0].setRotationPoint(0F, -36F, 0F);

		turretModel[1].addShapeBox(8F, 0F, -21F, 8, 15, 42, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 92
		turretModel[1].setRotationPoint(0F, -36F, 0F);

		turretModel[2].addShapeBox(16F, 0F, -19F, 12, 15, 38, 0F, 0F, 0F, 0F, -2F, -2F, -4F, -2F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 93
		turretModel[2].setRotationPoint(0F, -36F, 0F);

		turretModel[3].addShapeBox(-8F, 0F, -19F, 8, 15, 38, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 94
		turretModel[3].setRotationPoint(0F, -36F, 0F);

		turretModel[4].addShapeBox(-24F, 0F, -16F, 16, 15, 32, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -3F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -6F); // Box 95
		turretModel[4].setRotationPoint(0F, -36F, 0F);

		turretModel[5].addShapeBox(26F, 0F, -13F, 5, 7, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		turretModel[5].setRotationPoint(0F, -31F, 0F);

		turretModel[6].addShapeBox(26F, 0F, -13F, 5, 3, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 110
		turretModel[6].setRotationPoint(0F, -24F, 0F);

		turretModel[7].addShapeBox(8F, 0F, -21F, 8, 1, 42, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 112
		turretModel[7].setRotationPoint(0F, -37F, 0F);

		turretModel[8].addShapeBox(16F, 0F, -19F, 10, 3, 38, 0F, 0F, 0F, -1F, -1F, -2F, -5F, -1F, -2F, -5F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F); // Box 113
		turretModel[8].setRotationPoint(0F, -37F, 0F);

		turretModel[9].addShapeBox(0F, 0F, -21F, 8, 1, 42, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 114
		turretModel[9].setRotationPoint(0F, -37F, 0F);

		turretModel[10].addShapeBox(-8F, 0F, -19F, 8, 1, 38, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 115
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(-24F, 0F, -16F, 16, 1, 32, 0F, -1F, -1F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, -7F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F); // Box 116
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(-3F, 0F, -17F, 7, 4, 17, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		turretModel[12].setRotationPoint(0F, -41F, 0F);

		turretModel[13].addShapeBox(4F, 0F, -17F, 5, 4, 17, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 118
		turretModel[13].setRotationPoint(0F, -41F, 0F);

		turretModel[14].addShapeBox(-8F, 0F, -17F, 5, 4, 17, 0F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 119
		turretModel[14].setRotationPoint(0F, -41F, 0F);

		turretModel[15].addShapeBox(26F, 0F, -13F, 5, 3, 26, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		turretModel[15].setRotationPoint(0F, -34F, 0F);

		turretModel[16].addShapeBox(25F, 0F, 8.5F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[16].setRotationPoint(0F, -37F, 0F);

		turretModel[17].addBox(-20F, 0F, 11F, 1, 1, 3, 0F); // Box 48
		turretModel[17].setRotationPoint(0F, -34F, 0F);

		turretModel[18].addBox(-20F, 0F, 11F, 1, 1, 3, 0F); // Box 49
		turretModel[18].setRotationPoint(0F, -31F, 0F);

		turretModel[19].addBox(-20F, 0F, 13F, 1, 2, 1, 0F); // Box 50
		turretModel[19].setRotationPoint(0F, -33F, 0F);

		turretModel[20].addShapeBox(3F, 0F, 22F, 8, 8, 2, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F); // Box 52
		turretModel[20].setRotationPoint(0F, -34F, 0F);
		turretModel[20].rotateAngleY = -0.2443461F;

		turretModel[21].addShapeBox(3F, 0F, -24F, 8, 8, 2, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F); // Box 53
		turretModel[21].setRotationPoint(0F, -34F, 0F);
		turretModel[21].rotateAngleY = 0.2443461F;

		turretModel[22].addShapeBox(-16F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		turretModel[22].setRotationPoint(0F, -46F, 0F);

		turretModel[23].addShapeBox(-22F, 0F, -10.5F, 1, 9, 1, 0F, 2.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, 2.5F, 30F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		turretModel[23].setRotationPoint(0F, -43.5F, 0F);

		turretModel[24].addShapeBox(-22F, 0F, 9.5F, 1, 9, 1, 0F, 2.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, -3.5F, 30F, -0.5F, 2.5F, 30F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 1
		turretModel[24].setRotationPoint(0F, -43.5F, 0F);

		turretModel[25].addShapeBox(-2.5F, -26F, -15.5F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		turretModel[25].setRotationPoint(0F, -21F, 0F);
		turretModel[25].rotateAngleY = -1.23918377F;
		turretModel[25].rotateAngleZ = 0.29670597F;

		turretModel[26].addShapeBox(-6.5F, -26F, -15.5F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 289
		turretModel[26].setRotationPoint(0F, -21F, 0F);
		turretModel[26].rotateAngleY = -1.23918377F;
		turretModel[26].rotateAngleZ = 0.29670597F;

		turretModel[27].addShapeBox(-8.5F, -26.5F, -16.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		turretModel[27].setRotationPoint(0F, -21F, 0F);
		turretModel[27].rotateAngleY = -1.23918377F;
		turretModel[27].rotateAngleZ = 0.29670597F;

		turretModel[28].addShapeBox(-8.5F, -26.5F, -13.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		turretModel[28].setRotationPoint(0F, -21F, 0F);
		turretModel[28].rotateAngleY = -1.23918377F;
		turretModel[28].rotateAngleZ = 0.29670597F;

		turretModel[29].addShapeBox(6.5F, -25.5F, -15F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 292
		turretModel[29].setRotationPoint(0F, -21F, 0F);
		turretModel[29].rotateAngleY = -1.23918377F;
		turretModel[29].rotateAngleZ = 0.29670597F;

		turretModel[30].addShapeBox(11.5F, -25.5F, -15F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		turretModel[30].setRotationPoint(0F, -21F, 0F);
		turretModel[30].rotateAngleY = -1.23918377F;
		turretModel[30].rotateAngleZ = 0.29670597F;

		turretModel[31].addShapeBox(0.5F, -23.8F, -17F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		turretModel[31].setRotationPoint(0F, -23F, 0F);
		turretModel[31].rotateAngleY = -1.23918377F;
		turretModel[31].rotateAngleZ = 0.29670597F;

		turretModel[32].addShapeBox(-7.5F, -26F, -15.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[32].setRotationPoint(0F, -21F, 0F);
		turretModel[32].rotateAngleY = -1.23918377F;
		turretModel[32].rotateAngleZ = 0.29670597F;

		turretModel[33].addShapeBox(-7.5F, -26F, -13.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		turretModel[33].setRotationPoint(0F, -21F, 0F);
		turretModel[33].rotateAngleY = -1.23918377F;
		turretModel[33].rotateAngleZ = 0.29670597F;

		turretModel[34].addShapeBox(0.5F, -25.5F, -13.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[34].setRotationPoint(0F, -21F, 0F);
		turretModel[34].rotateAngleY = -1.23918377F;
		turretModel[34].rotateAngleZ = 0.29670597F;

		turretModel[35].addShapeBox(9.5F, -24.8F, -16F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 299
		turretModel[35].setRotationPoint(0F, -21F, 0F);
		turretModel[35].rotateAngleY = -1.23918377F;
		turretModel[35].rotateAngleZ = 0.29670597F;


		barrelModel = new ModelRendererTurbo[8];
		barrelModel[0] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 127
		barrelModel[1] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 2
		barrelModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 3
		barrelModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 4
		barrelModel[5] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 5
		barrelModel[6] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 7

		barrelModel[0].addShapeBox(0F, -2.5F, -11F, 14, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 127
		barrelModel[0].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[1].addBox(14F, -2F, -10.5F, 48, 4, 4, 0F); // Box 0
		barrelModel[1].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[2].addShapeBox(62F, -2.5F, -11F, 2, 5, 5, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 2
		barrelModel[2].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[3].addBox(64F, -2.5F, -11F, 4, 1, 1, 0F); // Box 3
		barrelModel[3].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[4].addBox(64F, -2.5F, -7F, 4, 1, 1, 0F); // Box 4
		barrelModel[4].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[5].addBox(64F, 1.5F, -7F, 4, 1, 1, 0F); // Box 5
		barrelModel[5].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[6].addBox(64F, 1.5F, -11F, 4, 1, 1, 0F); // Box 6
		barrelModel[6].setRotationPoint(29F, -27.5F, 8F);

		barrelModel[7].addShapeBox(68F, -2.5F, -11F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 7
		barrelModel[7].setRotationPoint(29F, -27.5F, 8F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}