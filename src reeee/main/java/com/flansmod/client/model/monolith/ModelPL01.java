//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPL01 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPL01() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[89];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 64
		bodyModel[48] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 76
		bodyModel[54] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 77
		bodyModel[55] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Box 78
		bodyModel[56] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 79
		bodyModel[57] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 81
		bodyModel[59] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 82
		bodyModel[60] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 83
		bodyModel[61] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 86
		bodyModel[64] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Box 87
		bodyModel[65] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 88
		bodyModel[66] = new ModelRendererTurbo(this, 129, 289, textureX, textureY); // Box 89
		bodyModel[67] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 91
		bodyModel[69] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 92
		bodyModel[70] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Box 93
		bodyModel[71] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 94
		bodyModel[72] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 95
		bodyModel[73] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Box 96
		bodyModel[74] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 97
		bodyModel[75] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 98
		bodyModel[76] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 99
		bodyModel[77] = new ModelRendererTurbo(this, 257, 297, textureX, textureY); // Box 100
		bodyModel[78] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 101
		bodyModel[79] = new ModelRendererTurbo(this, 33, 305, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Box 103
		bodyModel[81] = new ModelRendererTurbo(this, 97, 305, textureX, textureY); // Box 104
		bodyModel[82] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 108
		bodyModel[86] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 110
		bodyModel[88] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Box 111

		bodyModel[0].addShapeBox(0F, 0F, 0F, 88, 9, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -14F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-38F, -2F, -14.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 9, 20, 0F, 0F, 0F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(23.5F, -22.5F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 12, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -8.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(23.5F, -14.5F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 9, 10, 0F, 0F, 0F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(23.5F, -22.5F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F, 0F, 0F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(23.5F, -22.5F, 20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 35, 9, 10, 0F, 0F, 0F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(23.5F, -22.5F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F, 0F, 0F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(23.5F, -22.5F, -26F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 67, 8, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-43.5F, -22.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 67, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-43.5F, -22.5F, 9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 72, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-48.5F, -22.5F, 13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 72, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-48.5F, -22.5F, 26F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 67, 8, 4, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-43.5F, -22.5F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 72, 8, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-48.5F, -22.5F, -26F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 72, 8, 3, 0F, -3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-48.5F, -22.5F, -29F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 8, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(23.5F, -22.5F, 26F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 3, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(45.5F, -18.5F, 26F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 8, 3, 0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(23.5F, -22.5F, -29F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 4, 3, 0F, 0F, -1.5F, 0F, -5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(45.5F, -18.5F, -29F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 100, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F); // Box 19
		bodyModel[18].setRotationPoint(-48.5F, -14.5F, 26F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 98, 12, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-48.5F, -14.5F, 13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 100, 12, 3, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-48.5F, -14.5F, -29F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 98, 12, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-48.5F, -14.5F, -26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 35, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -8.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(23.5F, -14.5F, 9.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 35, 12, 5, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 24
		bodyModel[23].setRotationPoint(23.5F, -14.5F, -14.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F); // Box 25
		bodyModel[24].setRotationPoint(51.5F, -14.5F, 26F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(51.5F, -14.5F, 23F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(51.5F, -14.5F, -29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 12, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(51.5F, -14.5F, -26F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 67, 13, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-46.5F, -14.5F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 67, 13, 4, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-46.5F, -14.5F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 67, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F); // Box 32
		bodyModel[30].setRotationPoint(-46.5F, -14.5F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(-41.5F, -3.5F, 13.5F);
		bodyModel[31].rotateAngleZ = 0.73303829F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 16, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(-41.5F, -3.5F, -23.5F);
		bodyModel[32].rotateAngleZ = 0.73303829F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[33].setRotationPoint(-30.3F, 7.5F, -23.5F);
		bodyModel[33].rotateAngleZ = -0.38397244F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(-30.3F, 7.5F, 13.5F);
		bodyModel[34].rotateAngleZ = -0.38397244F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 66, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-26.3F, 9.25F, 13.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 66, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-26.3F, 9.25F, -23.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[37].setRotationPoint(39F, 9.25F, -23.5F);
		bodyModel[37].rotateAngleZ = 0.40142573F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(43F, 7.25F, -23.5F);
		bodyModel[38].rotateAngleZ = 0.64577182F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(39F, 9.25F, 13.5F);
		bodyModel[39].rotateAngleZ = 0.40142573F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(43F, 7.25F, 13.5F);
		bodyModel[40].rotateAngleZ = 0.64577182F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(55.5F, -6.75F, -23.5F);
		bodyModel[41].rotateAngleZ = 0.12217305F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[42].setRotationPoint(55.5F, -6.75F, 13.5F);
		bodyModel[42].rotateAngleZ = 0.12217305F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(51.5F, -8.75F, 13.5F);
		bodyModel[43].rotateAngleZ = 0.99483767F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[44].setRotationPoint(51.5F, -8.75F, -23.5F);
		bodyModel[44].rotateAngleZ = 0.99483767F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 67, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(-24.5F, -6.5F, -23.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(42F, -7.5F, -23.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 67, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[47].setRotationPoint(-24.5F, -6.5F, 22.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 14, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(42F, -7.5F, 22.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 64
		bodyModel[49].setRotationPoint(-40.5F, -6.5F, 22.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-40.5F, -6.5F, -23.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[51].setRotationPoint(49.5F, -12.75F, 15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[52].setRotationPoint(49.5F, -12.75F, -23F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[53].setRotationPoint(34.5F, 3.25F, 15F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 77
		bodyModel[54].setRotationPoint(34.5F, 6.25F, 15F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[55].setRotationPoint(34.5F, 0.25F, 15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[56].setRotationPoint(21.5F, 0.25F, 15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 80
		bodyModel[57].setRotationPoint(21.5F, 6.25F, 15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[58].setRotationPoint(21.5F, 3.25F, 15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[59].setRotationPoint(8.5F, 0.25F, 15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 83
		bodyModel[60].setRotationPoint(8.5F, 6.25F, 15F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[61].setRotationPoint(8.5F, 3.25F, 15F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[62].setRotationPoint(-3.5F, 0.25F, 15F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 86
		bodyModel[63].setRotationPoint(-3.5F, 6.25F, 15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[64].setRotationPoint(-3.5F, 3.25F, 15F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[65].setRotationPoint(-17.5F, 0.25F, 15F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 89
		bodyModel[66].setRotationPoint(-17.5F, 6.25F, 15F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[67].setRotationPoint(-17.5F, 3.25F, 15F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[68].setRotationPoint(-29.5F, 0.25F, 15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 92
		bodyModel[69].setRotationPoint(-29.5F, 6.25F, 15F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[70].setRotationPoint(-29.5F, 3.25F, 15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[71].setRotationPoint(34.5F, 3.25F, -21F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 95
		bodyModel[72].setRotationPoint(34.5F, 6.25F, -21F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[73].setRotationPoint(34.5F, 0.25F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[74].setRotationPoint(21.5F, 0.25F, -21F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 98
		bodyModel[75].setRotationPoint(21.5F, 6.25F, -21F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[76].setRotationPoint(21.5F, 3.25F, -21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[77].setRotationPoint(8.5F, 0.25F, -21F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 101
		bodyModel[78].setRotationPoint(8.5F, 6.25F, -21F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[79].setRotationPoint(8.5F, 3.25F, -21F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[80].setRotationPoint(-3.5F, 0.25F, -21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 104
		bodyModel[81].setRotationPoint(-3.5F, 6.25F, -21F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[82].setRotationPoint(-3.5F, 3.25F, -21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(-17.5F, 0.25F, -21F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 107
		bodyModel[84].setRotationPoint(-17.5F, 6.25F, -21F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[85].setRotationPoint(-17.5F, 3.25F, -21F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[86].setRotationPoint(-29.5F, 0.25F, -21F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 110
		bodyModel[87].setRotationPoint(-29.5F, 6.25F, -21F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[88].setRotationPoint(-29.5F, 3.25F, -21F);


		turretModel = new ModelRendererTurbo[22];
		turretModel[0] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 43
		turretModel[1] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 44
		turretModel[2] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 45
		turretModel[3] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 46
		turretModel[4] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 47
		turretModel[5] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 48
		turretModel[6] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 49
		turretModel[7] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 50
		turretModel[8] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 51
		turretModel[9] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 52
		turretModel[10] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 53
		turretModel[11] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 54
		turretModel[12] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 55
		turretModel[13] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 56
		turretModel[14] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 112
		turretModel[15] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 113
		turretModel[16] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 114
		turretModel[17] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 122
		turretModel[18] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 123
		turretModel[19] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 124
		turretModel[20] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 125
		turretModel[21] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 126

		turretModel[0].addShapeBox(-31F, 0F, -15F, 18, 1, 30, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 4F, 5F, 3F, 8F, 7F, 8F, 8F, 7F, 8F, 4F, 5F, 3F); // Box 43
		turretModel[0].setRotationPoint(0F, -36F, 0F);

		turretModel[1].addShapeBox(-33F, 0F, -11F, 2, 5, 22, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 5F, 0F, 0F); // Box 44
		turretModel[1].setRotationPoint(0F, -35F, 0F);

		turretModel[2].addShapeBox(-13F, 0F, -15F, 24, 8, 30, 0F, 0F, 0F, 0F, 5F, -1F, -5F, 5F, -1F, -5F, 0F, 0F, 0F, -8F, 0F, 8F, 6F, -4.5F, 6F, 6F, -4.5F, 6F, -8F, 0F, 8F); // Box 45
		turretModel[2].setRotationPoint(0F, -36F, 0F);

		turretModel[3].addShapeBox(16F, 0F, 10F, 8, 8, 11, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -5.5F, -0.5F, 3.25F, -2.5F, -0.5F, 3.25F); // Box 46
		turretModel[3].setRotationPoint(0F, -35F, 0F);

		turretModel[4].addShapeBox(16F, 0F, -21F, 8, 8, 11, 0F, -1F, -2.5F, 0F, -7F, -2.5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 3.25F, -5.5F, -0.5F, 3.25F, 3F, 0F, 1F, 0F, 0F, 0F); // Box 47
		turretModel[4].setRotationPoint(0F, -35F, 0F);

		turretModel[5].addShapeBox(-33F, 0F, -11F, 2, 2, 22, 0F, 5F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 5F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 5F, 0F, 0F); // Box 48
		turretModel[5].setRotationPoint(0F, -30F, 0F);

		turretModel[6].addShapeBox(-31F, 7F, -15F, 18, 2, 30, 0F, 4F, 1F, 3F, 8F, -1F, 8F, 8F, -1F, 8F, 4F, 1F, 3F, 4F, -1F, 3F, 8F, 1F, 8F, 8F, 1F, 8F, 4F, -1F, 3F); // Box 49
		turretModel[6].setRotationPoint(0F, -36F, 0F);

		turretModel[7].addShapeBox(16F, 0F, -21F, 8, 4, 11, 0F, -2.5F, 0.5F, 3.25F, -5.5F, 0.5F, 3.25F, 3F, 0F, 1F, 0F, 0F, 0F, -0.5F, -2F, 3.25F, -7.5F, -2F, 3.25F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 50
		turretModel[7].setRotationPoint(0F, -27F, 0F);

		turretModel[8].addShapeBox(16F, 0F, 10F, 8, 4, 11, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -5.5F, 0.5F, 3.25F, -2.5F, 0.5F, 3.25F, 0F, 0F, 0F, -1F, 0F, 1F, -7.5F, -2F, 3.25F, -0.5F, -2F, 3.25F); // Box 51
		turretModel[8].setRotationPoint(0F, -27F, 0F);

		turretModel[9].addShapeBox(-31F, 9F, -15F, 18, 4, 30, 0F, 4F, 1F, 3F, 8F, -1F, 8F, 8F, -1F, 8F, 4F, 1F, 3F, -3F, 1F, -1F, 8F, 1F, 3F, 8F, 1F, 3F, -3F, 1F, -1F); // Box 52
		turretModel[9].setRotationPoint(0F, -36F, 0F);

		turretModel[10].addShapeBox(-33F, 2F, -11F, 2, 6, 22, 0F, 5F, 0F, 0F, -4F, 0F, 7F, -4F, 0F, 7F, 5F, 0F, 0F, -1F, 0F, -5F, 3F, 0F, 3F, 3F, 0F, 3F, -1F, 0F, -5F); // Box 53
		turretModel[10].setRotationPoint(0F, -30F, 0F);

		turretModel[11].addShapeBox(-5F, 7F, -15F, 21, 2, 30, 0F, 0F, 0F, 8F, 1F, 4.5F, 6F, 1F, 4.5F, 6F, 0F, 0F, 8F, 0F, 0F, 8F, 2.5F, -1.5F, 9.25F, 2.5F, -1.5F, 9.25F, 0F, 0F, 8F); // Box 54
		turretModel[11].setRotationPoint(0F, -35F, 0F);

		turretModel[12].addShapeBox(-5F, 7F, -15F, 21, 2, 5, 0F, 0F, 0F, 8F, 2.5F, 1.5F, 9.25F, 2.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0.5F, -1F, 9.25F, 0.5F, 1F, 0F, 0F, 2F, 0F); // Box 55
		turretModel[12].setRotationPoint(0F, -33F, 0F);

		turretModel[13].addShapeBox(-5F, 7F, 10F, 21, 2, 5, 0F, 0F, 0F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 9.25F, 0F, 0F, 8F, 0F, 2F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 9.25F, 0F, 2F, 3F); // Box 56
		turretModel[13].setRotationPoint(0F, -33F, 0F);

		turretModel[14].addBox(-14F, 0F, -1F, 2, 7, 2, 0F); // Box 112
		turretModel[14].setRotationPoint(0F, -42F, 0F);

		turretModel[15].addBox(-14F, 0F, -2F, 2, 6, 1, 0F); // Box 113
		turretModel[15].setRotationPoint(0F, -44F, 0F);

		turretModel[16].addBox(-14.2F, 0F, 1F, 2, 7, 5, 0F); // Box 114
		turretModel[16].setRotationPoint(0F, -46F, 0F);
		turretModel[16].rotateAngleZ = 0.08726646F;

		turretModel[17].addBox(-14F, 0F, -5F, 2, 1, 4, 0F); // Box 122
		turretModel[17].setRotationPoint(0F, -45F, 0F);

		turretModel[18].addBox(5F, 0F, 3.5F, 4, 4, 6, 0F); // Box 123
		turretModel[18].setRotationPoint(0F, -40F, 0F);
		turretModel[18].rotateAngleZ = 0.12217305F;

		turretModel[19].addBox(5F, 0F, 2.5F, 4, 2, 8, 0F); // Box 124
		turretModel[19].setRotationPoint(0F, -36.5F, 0F);

		turretModel[20].addShapeBox(5F, 0F, 2.5F, 4, 4, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		turretModel[20].setRotationPoint(0F, -40.5F, 0F);

		turretModel[21].addShapeBox(5F, 0F, 9.5F, 4, 4, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		turretModel[21].setRotationPoint(0F, -40.5F, 0F);


		barrelModel = new ModelRendererTurbo[14];
		barrelModel[0] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 67
		barrelModel[1] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Box 68
		barrelModel[2] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 69
		barrelModel[3] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 70
		barrelModel[4] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 71
		barrelModel[5] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 72
		barrelModel[6] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 73
		barrelModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 115
		barrelModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 116
		barrelModel[9] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 117
		barrelModel[10] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 118
		barrelModel[11] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 119
		barrelModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 120
		barrelModel[13] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 121

		barrelModel[0].addShapeBox(-2F, -6F, -10F, 16, 7, 20, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 67
		barrelModel[0].setRotationPoint(18F, -29F, 0F);

		barrelModel[1].addShapeBox(-2F, 1F, -10F, 16, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, -2F, 0F); // Box 68
		barrelModel[1].setRotationPoint(18F, -29F, 0F);

		barrelModel[2].addShapeBox(14F, -4F, -6F, 54, 5, 12, 0F, 0F, 0F, -5F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 69
		barrelModel[2].setRotationPoint(18F, -29F, 0F);

		barrelModel[3].addShapeBox(14F, 1F, -6F, 54, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F); // Box 70
		barrelModel[3].setRotationPoint(18F, -29F, 0F);

		barrelModel[4].addShapeBox(68F, 0F, -1.5F, 12, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		barrelModel[4].setRotationPoint(18F, -28.5F, 0F);

		barrelModel[5].addShapeBox(68F, -1F, -1.5F, 12, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		barrelModel[5].setRotationPoint(18F, -28.5F, 0F);

		barrelModel[6].addShapeBox(68F, 1F, -1.5F, 12, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		barrelModel[6].setRotationPoint(18F, -28.5F, 0F);

		barrelModel[7].addBox(-3.5F, -1F, -1F, 9, 2, 2, 0F); // Box 115
		barrelModel[7].setRotationPoint(-13F, -44F, 0.25F);

		barrelModel[8].addShapeBox(-1.5F, -1.5F, -1F, 4, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 116
		barrelModel[8].setRotationPoint(-13F, -44F, 0.25F);

		barrelModel[9].addShapeBox(-4.5F, -1F, -1F, 1, 2, 2, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 117
		barrelModel[9].setRotationPoint(-13F, -44F, 0.25F);

		barrelModel[10].addShapeBox(5.5F, -1.2F, -0.5F, 17, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 118
		barrelModel[10].setRotationPoint(-13F, -44F, 0.25F);

		barrelModel[11].addShapeBox(5.5F, -0.5F, -0.5F, 9, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 119
		barrelModel[11].setRotationPoint(-13F, -44F, 0.25F);

		barrelModel[12].addShapeBox(11.5F, -1.2F, -0.5F, 1, 2, 1, 0F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F, 0F, -0.22F, -0.2F); // Box 120
		barrelModel[12].setRotationPoint(-13F, -44F, 0.25F);

		barrelModel[13].addShapeBox(17F, -2.2F, -0.5F, 1, 2, 1, 0F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F, -0.3F, -0.22F, -0.27F); // Box 121
		barrelModel[13].setRotationPoint(-13F, -44F, 0.25F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}