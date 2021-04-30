//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBTR80 extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelBTR80() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[97];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 62
		bodyModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 83
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 84
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		bodyModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 86
		bodyModel[19] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 91
		bodyModel[20] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 92
		bodyModel[21] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 93
		bodyModel[22] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 94
		bodyModel[23] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 96
		bodyModel[25] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 97
		bodyModel[26] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 98
		bodyModel[27] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 101
		bodyModel[28] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 107
		bodyModel[29] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 110
		bodyModel[30] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 111
		bodyModel[31] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Shape 112
		bodyModel[32] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Shape 115
		bodyModel[34] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 116
		bodyModel[35] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 117
		bodyModel[36] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 118
		bodyModel[37] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 119
		bodyModel[38] = new ModelRendererTurbo(this, 1809, 1, textureX, textureY); // Box 124
		bodyModel[39] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 125
		bodyModel[40] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 127
		bodyModel[42] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 129
		bodyModel[44] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 122
		bodyModel[45] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 124
		bodyModel[47] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 125
		bodyModel[48] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 1145, 17, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 131
		bodyModel[53] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 132
		bodyModel[54] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 133
		bodyModel[55] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 137
		bodyModel[56] = new ModelRendererTurbo(this, 1041, 9, textureX, textureY); // Box 139
		bodyModel[57] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 140
		bodyModel[58] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 141
		bodyModel[59] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 142
		bodyModel[60] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 143
		bodyModel[61] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 144
		bodyModel[62] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 145
		bodyModel[63] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 146
		bodyModel[64] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 147
		bodyModel[65] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 148
		bodyModel[66] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 149
		bodyModel[67] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 150
		bodyModel[68] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 151
		bodyModel[69] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 152
		bodyModel[70] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 153
		bodyModel[71] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 154
		bodyModel[72] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 155
		bodyModel[73] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 156
		bodyModel[74] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 157
		bodyModel[75] = new ModelRendererTurbo(this, 1025, 17, textureX, textureY); // Box 164
		bodyModel[76] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 165
		bodyModel[77] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 166
		bodyModel[78] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Box 168
		bodyModel[79] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 169
		bodyModel[80] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 170
		bodyModel[81] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 171
		bodyModel[82] = new ModelRendererTurbo(this, 1849, 17, textureX, textureY); // Box 172
		bodyModel[83] = new ModelRendererTurbo(this, 1929, 17, textureX, textureY); // Box 173
		bodyModel[84] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 181
		bodyModel[85] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 188
		bodyModel[86] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 190
		bodyModel[87] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 172
		bodyModel[88] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 173
		bodyModel[89] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 174
		bodyModel[90] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 175
		bodyModel[91] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 176
		bodyModel[92] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 177
		bodyModel[93] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 200
		bodyModel[94] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 201
		bodyModel[95] = new ModelRendererTurbo(this, 1377, 65, textureX, textureY); // Box 204
		bodyModel[96] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 205

		bodyModel[0].addShapeBox(0F, 0F, 0F, 23, 16, 56, 0F, 0F, 0F, 0F, 0F, 3F, -10F, 0F, 3F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -19F, -10F, 0F, -19F, -10F, 0F, 0F, -4F); // Box 0
		bodyModel[0].setRotationPoint(33F, -15F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 7, 56, 0F, -4F, 0F, -6F, 0F, -3F, -10F, 0F, -3F, -10F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(33F, -22F, -28F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 16, 56, 0F, 0F, -2.25F, -7F, 4F, -9F, -6F, 4F, -9F, -6F, 0F, -2.25F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(26F, -31F, -28F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F); // Box 4
		bodyModel[3].setRotationPoint(26F, -15F, -28F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 12, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -3F); // Box 5
		bodyModel[4].setRotationPoint(30F, -11F, -27F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 101, 16, 56, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-81F, -31F, -28F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 16, 56, 0F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 7
		bodyModel[6].setRotationPoint(-89F, -31F, -28F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 16, 56, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -8F); // Box 16
		bodyModel[7].setRotationPoint(-89F, -15F, -28F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 12, 52, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -6F); // Box 17
		bodyModel[8].setRotationPoint(-81F, -11F, -26F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 4, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -2F); // Box 18
		bodyModel[9].setRotationPoint(-81F, -15F, -28F);

		bodyModel[10].addBox(0F, 0F, 0F, 112, 16, 34, 0F); // Box 19
		bodyModel[10].setRotationPoint(-80F, -15F, -17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 16, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F); // Box 20
		bodyModel[11].setRotationPoint(-32F, -15F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 16, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 21
		bodyModel[12].setRotationPoint(-32F, -15F, -26F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Box 62
		bodyModel[13].setRotationPoint(28.2F, -28F, 3F);
		bodyModel[13].rotateAngleZ = -0.55850536F;

		bodyModel[14].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Box 64
		bodyModel[14].setRotationPoint(28.2F, -28F, -14F);
		bodyModel[14].rotateAngleZ = -0.55850536F;

		bodyModel[15].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 83
		bodyModel[15].setRotationPoint(-89.4F, -26F, -22F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 84
		bodyModel[16].setRotationPoint(-89.4F, -26F, 17F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 85
		bodyModel[17].setRotationPoint(-89.6F, -25.5F, 18.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 86
		bodyModel[18].setRotationPoint(-89.6F, -25.5F, -20.5F);

		bodyModel[19].addFlexBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, 0F, -1.00F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 91
		bodyModel[19].setRotationPoint(-89.6F, -18F, 11F);

		bodyModel[20].addFlexBox(0F, 0F, 0F, 1, 2, 11, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 92
		bodyModel[20].setRotationPoint(-89.6F, -20F, 12F);

		bodyModel[21].addFlexBox(0F, 0F, 0F, 1, 2, 5, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 93
		bodyModel[21].setRotationPoint(-89.6F, -13F, 11F);
		bodyModel[21].rotateAngleZ = 0.20943951F;

		bodyModel[22].addFlexBox(0F, 0F, 0F, 1, 2, 5, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 94
		bodyModel[22].setRotationPoint(-89.6F, -13F, 18F);
		bodyModel[22].rotateAngleZ = 0.20943951F;

		bodyModel[23].addFlexBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, 0F, -1.00F, 0.00F, ModelRendererTurbo.MR_TOP); // Box 95
		bodyModel[23].setRotationPoint(-89.6F, -18F, -23F);

		bodyModel[24].addFlexBox(0F, 0F, 0F, 1, 2, 11, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 96
		bodyModel[24].setRotationPoint(-89.6F, -20F, -23F);

		bodyModel[25].addFlexBox(0F, 0F, 0F, 1, 2, 5, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 97
		bodyModel[25].setRotationPoint(-89.6F, -13F, -16F);
		bodyModel[25].rotateAngleZ = 0.20943951F;

		bodyModel[26].addFlexBox(0F, 0F, 0F, 1, 2, 5, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 98
		bodyModel[26].setRotationPoint(-89.6F, -13F, -23F);
		bodyModel[26].rotateAngleZ = 0.20943951F;

		bodyModel[27].addBox(0F, 0F, 0F, 18, 1, 35, 0F); // Box 101
		bodyModel[27].setRotationPoint(56F, -18.3F, -17.5F);
		bodyModel[27].rotateAngleZ = 2.98451302F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[28].setRotationPoint(-53F, -30.5F, 23F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[29].setRotationPoint(-53F, -30.5F, -28F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[30].setRotationPoint(-50F, -30F, -28F);

		bodyModel[31].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 20, 6, 6, 20, 20, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 112
		bodyModel[31].setRotationPoint(-74F, -25F, 28F);
		bodyModel[31].rotateAngleY = 1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[32].setRotationPoint(-54F, -31F, 23F);

		bodyModel[33].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 20, 6, 6, 20, 20, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 115
		bodyModel[33].setRotationPoint(-74F, -25F, -22F);
		bodyModel[33].rotateAngleY = 1.57079633F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[34].setRotationPoint(-54F, -31F, -28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 117
		bodyModel[35].setRotationPoint(-79F, -31F, 22F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 118
		bodyModel[36].setRotationPoint(-79F, -27F, 22F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 119
		bodyModel[37].setRotationPoint(-79F, -29F, 22F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[38].setRotationPoint(-79F, -31F, -28F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 125
		bodyModel[39].setRotationPoint(-79F, -27F, -28F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[40].setRotationPoint(-79F, -29F, -28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 127
		bodyModel[41].setRotationPoint(-86F, -31F, -28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		bodyModel[42].setRotationPoint(-86F, -29F, -28F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 129
		bodyModel[43].setRotationPoint(-86F, -27F, -28F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[44].setRotationPoint(-86F, -31F, 22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 123
		bodyModel[45].setRotationPoint(-86F, -29F, 22F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 124
		bodyModel[46].setRotationPoint(-86F, -27F, 22F);

		bodyModel[47].addBox(0F, 0F, 0F, 16, 1, 13, 0F); // Box 125
		bodyModel[47].setRotationPoint(-33F, -31.5F, 8F);

		bodyModel[48].addFlexBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 127
		bodyModel[48].setRotationPoint(-17F, -31.5F, 8F);

		bodyModel[49].addFlexBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 128
		bodyModel[49].setRotationPoint(-34F, -31.5F, 8F);

		bodyModel[50].addFlexBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 129
		bodyModel[50].setRotationPoint(-33F, -31.5F, 21F);

		bodyModel[51].addBox(0F, 0F, 0F, 16, 1, 13, 0F); // Box 130
		bodyModel[51].setRotationPoint(-33F, -31.5F, -21F);

		bodyModel[52].addFlexBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 131
		bodyModel[52].setRotationPoint(-17F, -31.5F, -21F);

		bodyModel[53].addFlexBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 132
		bodyModel[53].setRotationPoint(-34F, -31.5F, -21F);

		bodyModel[54].addFlexBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 133
		bodyModel[54].setRotationPoint(-33F, -31.5F, -22F);

		bodyModel[55].addFlexBox(0F, 0F, 0F, 14, 1, 1, 0F, 0.00F, 0F, 0.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 137
		bodyModel[55].setRotationPoint(-32F, -31.5F, -8F);

		bodyModel[56].addFlexBox(0F, 0F, 0F, 14, 1, 1, 0F, 0.00F, 0F, 0.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 139
		bodyModel[56].setRotationPoint(-32F, -31.5F, 7F);

		bodyModel[57].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 140
		bodyModel[57].setRotationPoint(-77F, -22.5F, 25.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 141
		bodyModel[58].setRotationPoint(-80F, -23.5F, 25.5F);

		bodyModel[59].addFlexBox(0F, 0F, 0F, 1, 3, 1, 0F, -1.00F, -1.00F, 0.00F, 0F, ModelRendererTurbo.MR_RIGHT); // Box 142
		bodyModel[59].setRotationPoint(-81F, -23.5F, 25.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 143
		bodyModel[60].setRotationPoint(-66F, -23F, 24.7F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 144
		bodyModel[61].setRotationPoint(-79.5F, -24F, 24.7F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 145
		bodyModel[62].setRotationPoint(-72F, -19.5F, 26.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 146
		bodyModel[63].setRotationPoint(-68F, -20F, 25.7F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 147
		bodyModel[64].setRotationPoint(-74F, -20F, 26.5F);

		bodyModel[65].addFlexBox(0F, 0F, 0F, 2, 2, 1, 0F, 1.00F, 1.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 148
		bodyModel[65].setRotationPoint(-74F, -18F, 26.5F);
		bodyModel[65].rotateAngleX = 0.12217305F;

		bodyModel[66].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 149
		bodyModel[66].setRotationPoint(-75F, -17.3F, 25.7F);
		bodyModel[66].rotateAngleX = 0.03490659F;

		bodyModel[67].addBox(0F, 0F, 0F, 13, 11, 1, 0F); // Box 150
		bodyModel[67].setRotationPoint(-31.5F, -26.5F, 23.7F);
		bodyModel[67].rotateAngleX = 0.29670597F;

		bodyModel[68].addBox(0F, 0F, 0F, 13, 11, 1, 0F); // Box 151
		bodyModel[68].setRotationPoint(-31.5F, -26.5F, -24.7F);
		bodyModel[68].rotateAngleX = -0.31415927F;

		bodyModel[69].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 152
		bodyModel[69].setRotationPoint(1.5F, -30.5F, 23.9F);
		bodyModel[69].rotateAngleX = 0.29670597F;

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 153
		bodyModel[70].setRotationPoint(1.5F, -29.88F, 21.88F);
		bodyModel[70].rotateAngleX = 0.29670597F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 154
		bodyModel[71].setRotationPoint(18.5F, -29.88F, 21.88F);
		bodyModel[71].rotateAngleX = 0.29670597F;

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 155
		bodyModel[72].setRotationPoint(-25.5F, -28.6F, 21.88F);
		bodyModel[72].rotateAngleX = 0.29670597F;

		bodyModel[73].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 156
		bodyModel[73].setRotationPoint(-25.5F, -29.22F, 23.9F);
		bodyModel[73].rotateAngleX = 0.29670597F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 157
		bodyModel[74].setRotationPoint(-8.5F, -28.6F, 21.88F);
		bodyModel[74].rotateAngleX = 0.29670597F;

		bodyModel[75].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 164
		bodyModel[75].setRotationPoint(1.5F, -30.89F, -24.9F);
		bodyModel[75].rotateAngleX = -0.29670597F;

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 165
		bodyModel[76].setRotationPoint(1.5F, -30.88F, -24.88F);
		bodyModel[76].rotateAngleX = -0.29670597F;

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 166
		bodyModel[77].setRotationPoint(18.5F, -30.88F, -24.88F);
		bodyModel[77].rotateAngleX = -0.29670597F;

		bodyModel[78].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 168
		bodyModel[78].setRotationPoint(-25.5F, -30.22F, -24.9F);
		bodyModel[78].rotateAngleX = -0.29670597F;

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 169
		bodyModel[79].setRotationPoint(-8.5F, -30.21F, -24.88F);
		bodyModel[79].rotateAngleX = -0.29670597F;

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 170
		bodyModel[80].setRotationPoint(-25.5F, -30.21F, -24.88F);
		bodyModel[80].rotateAngleX = -0.29670597F;

		bodyModel[81].addBox(0F, 0F, 0F, 26, 1, 13, 0F); // Box 171
		bodyModel[81].setRotationPoint(-75F, -31.5F, -21F);

		bodyModel[82].addBox(0F, 0F, 0F, 26, 1, 13, 0F); // Box 172
		bodyModel[82].setRotationPoint(-75F, -31.5F, -6.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 26, 1, 13, 0F); // Box 173
		bodyModel[83].setRotationPoint(-75F, -31.5F, 8F);

		bodyModel[84].addFlexBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 181
		bodyModel[84].setRotationPoint(-49F, -31.5F, -20F);

		bodyModel[85].addFlexBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 188
		bodyModel[85].setRotationPoint(-49F, -31.5F, -5.5F);

		bodyModel[86].addFlexBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, -1.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 190
		bodyModel[86].setRotationPoint(-49F, -31.5F, 9F);

		bodyModel[87].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 172
		bodyModel[87].setRotationPoint(-73F, -32F, 9F);

		bodyModel[88].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 173
		bodyModel[88].setRotationPoint(-73F, -32F, 15F);

		bodyModel[89].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 174
		bodyModel[89].setRotationPoint(-73F, -32F, -5.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 175
		bodyModel[90].setRotationPoint(-73F, -32F, 0.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 176
		bodyModel[91].setRotationPoint(-73F, -32F, -20F);

		bodyModel[92].addBox(0F, 0F, 0F, 21, 1, 5, 0F); // Box 177
		bodyModel[92].setRotationPoint(-73F, -32F, -14F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 13, 56, 0F, 0F, 0.75F, -4.3F, 0F, 0.75F, -7F, 0F, 0.75F, -7F, 0F, 0.75F, -4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[93].setRotationPoint(20F, -28F, -28F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0.2F, 0.7F, 0F, 0.2F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 201
		bodyModel[94].setRotationPoint(20F, -31F, -23F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0.2F, -7F, 0F, 0.2F, 0.7F); // Box 204
		bodyModel[95].setRotationPoint(20F, -31F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 205
		bodyModel[96].setRotationPoint(-50F, -30F, 23F);


		turretModel = new ModelRendererTurbo[8];
		turretModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		turretModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 8
		turretModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 9
		turretModel[3] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 13
		turretModel[4] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 102
		turretModel[5] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 216
		turretModel[6] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 196
		turretModel[7] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 197

		turretModel[0].addShapeBox(-8F, -10F, -12F, 5, 6, 24, 0F, -4F, 1F, -9F, 1F, 1F, -6F, 1F, 1F, -6F, -4F, 1F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 7
		turretModel[0].setRotationPoint(-5F, -27F, 0F);

		turretModel[1].addShapeBox(-3F, -10F, -14F, 4, 6, 28, 0F, -1F, 1F, -8F, 0F, 1F, -5F, 0F, 1F, -5F, -1F, 1F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 8
		turretModel[1].setRotationPoint(-5F, -27F, 0F);

		turretModel[2].addShapeBox(2F, -11F, -14F, 8, 7, 28, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		turretModel[2].setRotationPoint(-6F, -27F, 0F);

		turretModel[3].addShapeBox(8F, -10F, -14F, 4, 6, 28, 0F, 0F, 1F, -5F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		turretModel[3].setRotationPoint(-4F, -27F, 0F);

		turretModel[4].addShapeBox(13F, -10F, -13F, 8, 6, 9, 0F, 0F, 1F, -5F, -5.4F, 1F, -8F, -5.4F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 1F, 0F, 0F, 1F); // Box 102
		turretModel[4].setRotationPoint(-5F, -27F, 0F);

		turretModel[5].addShapeBox(13F, -10F, -13F, 2, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 216
		turretModel[5].setRotationPoint(-5F, -28F, 10F);

		turretModel[6].addBox(13F, -10F, -13F, 3, 5, 6, 0F); // Box 196
		turretModel[6].setRotationPoint(-5F, -26F, 10F);

		turretModel[7].addShapeBox(13F, -10F, -13F, 8, 6, 9, 0F, 0F, 1F, 1F, -5.4F, 1F, 1F, -5.4F, 1F, -8F, 0F, 1F, -5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -8F, 0F, 0F, 0F); // Box 197
		turretModel[7].setRotationPoint(-5F, -27F, 17F);


		barrelModel = new ModelRendererTurbo[12];
		barrelModel[0] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 72
		barrelModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 73
		barrelModel[2] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 74
		barrelModel[3] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 75
		barrelModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 80
		barrelModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 81
		barrelModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 83
		barrelModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 80
		barrelModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 81
		barrelModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 83
		barrelModel[10] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 198
		barrelModel[11] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 206

		barrelModel[0].addShapeBox(3F, 0.8F, -3F, 10, 1, 6, 0F, 0F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.8F); // Box 72
		barrelModel[0].setRotationPoint(7F, -34F, 1F);

		barrelModel[1].addFlexBox(3F, -2.2F, -1.5F, 24, 1, 3, 0F, 0.00F, 0F, -1.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 73
		barrelModel[1].setRotationPoint(7F, -34F, 1F);

		barrelModel[2].addBox(3F, -1.2F, -1.5F, 24, 1, 3, 0F); // Box 74
		barrelModel[2].setRotationPoint(7F, -34F, 1F);

		barrelModel[3].addFlexBox(3F, -0.2F, -1.5F, 24, 1, 3, 0F, 0.00F, 0F, -1.00F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 75
		barrelModel[3].setRotationPoint(7F, -34F, 1F);

		barrelModel[4].addFlexBox(12F, -2.7F, -2F, 1, 1, 4, 0F, 0.00F, 0F, -1.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 80
		barrelModel[4].setRotationPoint(7F, -34F, 1F);

		barrelModel[5].addBox(12F, -1.7F, -2F, 1, 2, 4, 0F); // Box 81
		barrelModel[5].setRotationPoint(7F, -34F, 1F);

		barrelModel[6].addFlexBox(12F, 0.3F, -2F, 1, 1, 4, 0F, 0.00F, 0F, -1.00F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 83
		barrelModel[6].setRotationPoint(7F, -34F, 1F);

		barrelModel[7].addShapeBox(25F, -2.2F, -1.5F, 6, 1, 3, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 80
		barrelModel[7].setRotationPoint(7F, -34F, 1F);

		barrelModel[8].addShapeBox(25F, -1.2F, -1.5F, 6, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 81
		barrelModel[8].setRotationPoint(7F, -34F, 1F);

		barrelModel[9].addShapeBox(25F, -0.2F, -1.5F, 6, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 83
		barrelModel[9].setRotationPoint(7F, -34F, 1F);

		barrelModel[10].addBox(2F, -1.2F, -1.5F, 6, 1, 1, 0F); // Box 198
		barrelModel[10].setRotationPoint(7F, -33.5F, -1.2F);

		barrelModel[11].addShapeBox(8F, -1.2F, -1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 206
		barrelModel[11].setRotationPoint(7F, -33.5F, -1.2F);


		frontWheelModel = new ModelRendererTurbo[40];
		frontWheelModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 22
		frontWheelModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		frontWheelModel[2] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 191
		frontWheelModel[3] = new ModelRendererTurbo(this, 1097, 17, textureX, textureY); // Box 192
		frontWheelModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Shape 193
		frontWheelModel[5] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 178
		frontWheelModel[6] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Box 179
		frontWheelModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 182
		frontWheelModel[8] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 183
		frontWheelModel[9] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 184
		frontWheelModel[10] = new ModelRendererTurbo(this, 1233, 17, textureX, textureY); // Box 185
		frontWheelModel[11] = new ModelRendererTurbo(this, 1129, 33, textureX, textureY); // Box 186
		frontWheelModel[12] = new ModelRendererTurbo(this, 1305, 17, textureX, textureY); // Box 187
		frontWheelModel[13] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 188
		frontWheelModel[14] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 189
		frontWheelModel[15] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 190
		frontWheelModel[16] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 191
		frontWheelModel[17] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Box 193
		frontWheelModel[18] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 194
		frontWheelModel[19] = new ModelRendererTurbo(this, 1353, 17, textureX, textureY); // Shape 196
		frontWheelModel[20] = new ModelRendererTurbo(this, 1761, 49, textureX, textureY); // Box 174
		frontWheelModel[21] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 175
		frontWheelModel[22] = new ModelRendererTurbo(this, 1801, 49, textureX, textureY); // Box 176
		frontWheelModel[23] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 177
		frontWheelModel[24] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 178
		frontWheelModel[25] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 179
		frontWheelModel[26] = new ModelRendererTurbo(this, 1409, 25, textureX, textureY); // Box 180
		frontWheelModel[27] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 181
		frontWheelModel[28] = new ModelRendererTurbo(this, 1833, 49, textureX, textureY); // Box 182
		frontWheelModel[29] = new ModelRendererTurbo(this, 1473, 25, textureX, textureY); // Shape 183
		frontWheelModel[30] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Shape 203
		frontWheelModel[31] = new ModelRendererTurbo(this, 1953, 33, textureX, textureY); // Box 204
		frontWheelModel[32] = new ModelRendererTurbo(this, 1985, 33, textureX, textureY); // Box 205
		frontWheelModel[33] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 206
		frontWheelModel[34] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 207
		frontWheelModel[35] = new ModelRendererTurbo(this, 1969, 57, textureX, textureY); // Box 208
		frontWheelModel[36] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 209
		frontWheelModel[37] = new ModelRendererTurbo(this, 2017, 57, textureX, textureY); // Box 210
		frontWheelModel[38] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 211
		frontWheelModel[39] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 212

		frontWheelModel[0].addFlexBox(-11F, -10.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 22
		frontWheelModel[0].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[1].addBox(-11F, -4.5F, 0F, 6, 9, 9, 0F); // Box 23
		frontWheelModel[1].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[2].addBox(5F, -4.5F, 0F, 6, 9, 9, 0F); // Box 191
		frontWheelModel[2].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[3].addBox(-5F, -4.5F, 0F, 10, 9, 7, 0F); // Box 192
		frontWheelModel[3].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[4].addShape3D(3F, -3F, -9F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 193
		frontWheelModel[4].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[5].addFlexBox(-11F, 4.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 178
		frontWheelModel[5].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[6].addFlexBox(-5F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 179
		frontWheelModel[6].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[7].addFlexBox(-5F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 182
		frontWheelModel[7].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[8].addFlexBox(1F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 183
		frontWheelModel[8].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[9].addFlexBox(1F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 184
		frontWheelModel[9].setRotationPoint(18F, -0.5F, 17F);

		frontWheelModel[10].addBox(-5F, -4.5F, 0F, 10, 9, 7, 0F); // Box 185
		frontWheelModel[10].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[11].addFlexBox(-11F, -10.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 186
		frontWheelModel[11].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[12].addBox(5F, -4.5F, 0F, 6, 9, 9, 0F); // Box 187
		frontWheelModel[12].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[13].addFlexBox(1F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 188
		frontWheelModel[13].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[14].addFlexBox(1F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 189
		frontWheelModel[14].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[15].addFlexBox(-5F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 190
		frontWheelModel[15].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[16].addFlexBox(-5F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 191
		frontWheelModel[16].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[17].addFlexBox(-11F, 4.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 193
		frontWheelModel[17].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[18].addBox(-11F, -4.5F, 0F, 6, 9, 9, 0F); // Box 194
		frontWheelModel[18].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[19].addShape3D(3F, -3F, -9F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 196
		frontWheelModel[19].setRotationPoint(-7F, -0.5F, 17F);

		frontWheelModel[20].addBox(-5F, -4.5F, -2F, 10, 9, 7, 0F); // Box 174
		frontWheelModel[20].setRotationPoint(-7F, -0.5F, -22F);

		frontWheelModel[21].addFlexBox(-11F, -10.5F, -2F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 175
		frontWheelModel[21].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[22].addBox(5F, -4.5F, -2F, 6, 9, 9, 0F); // Box 176
		frontWheelModel[22].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[23].addFlexBox(1F, -4.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 177
		frontWheelModel[23].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[24].addFlexBox(1F, 0.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 178
		frontWheelModel[24].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[25].addFlexBox(-5F, 0.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 179
		frontWheelModel[25].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[26].addFlexBox(-5F, -4.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 180
		frontWheelModel[26].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[27].addFlexBox(-11F, 4.5F, -2F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 181
		frontWheelModel[27].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[28].addBox(-11F, -4.5F, -2F, 6, 9, 9, 0F); // Box 182
		frontWheelModel[28].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[29].addShape3D(3F, -3F, -1F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 183
		frontWheelModel[29].setRotationPoint(-7F, -0.5F, -24F);

		frontWheelModel[30].addShape3D(3F, -3F, -1F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 203
		frontWheelModel[30].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[31].addFlexBox(-5F, 0.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 204
		frontWheelModel[31].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[32].addFlexBox(-5F, -4.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 205
		frontWheelModel[32].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[33].addFlexBox(1F, -4.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 206
		frontWheelModel[33].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[34].addFlexBox(1F, 0.5F, -2F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 207
		frontWheelModel[34].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[35].addBox(5F, -4.5F, -2F, 6, 9, 9, 0F); // Box 208
		frontWheelModel[35].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[36].addFlexBox(-11F, 4.5F, -2F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 209
		frontWheelModel[36].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[37].addBox(-11F, -4.5F, -2F, 6, 9, 9, 0F); // Box 210
		frontWheelModel[37].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[38].addFlexBox(-11F, -10.5F, -2F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 211
		frontWheelModel[38].setRotationPoint(18F, -0.5F, -24F);

		frontWheelModel[39].addBox(-5F, -4.5F, -2F, 10, 9, 7, 0F); // Box 212
		frontWheelModel[39].setRotationPoint(18F, -0.5F, -22F);


		backWheelModel = new ModelRendererTurbo[40];
		backWheelModel[0] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 197
		backWheelModel[1] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 198
		backWheelModel[2] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 199
		backWheelModel[3] = new ModelRendererTurbo(this, 1193, 17, textureX, textureY); // Box 200
		backWheelModel[4] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 201
		backWheelModel[5] = new ModelRendererTurbo(this, 1473, 17, textureX, textureY); // Box 202
		backWheelModel[6] = new ModelRendererTurbo(this, 1769, 33, textureX, textureY); // Box 203
		backWheelModel[7] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 204
		backWheelModel[8] = new ModelRendererTurbo(this, 1833, 33, textureX, textureY); // Box 205
		backWheelModel[9] = new ModelRendererTurbo(this, 1841, 17, textureX, textureY); // Shape 206
		backWheelModel[10] = new ModelRendererTurbo(this, 1897, 33, textureX, textureY); // Box 154
		backWheelModel[11] = new ModelRendererTurbo(this, 1417, 33, textureX, textureY); // Box 155
		backWheelModel[12] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Shape 156
		backWheelModel[13] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 157
		backWheelModel[14] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 158
		backWheelModel[15] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 159
		backWheelModel[16] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 160
		backWheelModel[17] = new ModelRendererTurbo(this, 1961, 33, textureX, textureY); // Box 161
		backWheelModel[18] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 162
		backWheelModel[19] = new ModelRendererTurbo(this, 1993, 41, textureX, textureY); // Box 163
		backWheelModel[20] = new ModelRendererTurbo(this, 1865, 49, textureX, textureY); // Box 184
		backWheelModel[21] = new ModelRendererTurbo(this, 1905, 49, textureX, textureY); // Box 185
		backWheelModel[22] = new ModelRendererTurbo(this, 1737, 25, textureX, textureY); // Box 186
		backWheelModel[23] = new ModelRendererTurbo(this, 1753, 25, textureX, textureY); // Box 187
		backWheelModel[24] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 188
		backWheelModel[25] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 189
		backWheelModel[26] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 190
		backWheelModel[27] = new ModelRendererTurbo(this, 1937, 49, textureX, textureY); // Box 191
		backWheelModel[28] = new ModelRendererTurbo(this, 1521, 57, textureX, textureY); // Box 192
		backWheelModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Shape 193
		backWheelModel[30] = new ModelRendererTurbo(this, 1585, 57, textureX, textureY); // Box 194
		backWheelModel[31] = new ModelRendererTurbo(this, 1649, 57, textureX, textureY); // Box 195
		backWheelModel[32] = new ModelRendererTurbo(this, 1185, 33, textureX, textureY); // Box 196
		backWheelModel[33] = new ModelRendererTurbo(this, 1409, 33, textureX, textureY); // Box 197
		backWheelModel[34] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 198
		backWheelModel[35] = new ModelRendererTurbo(this, 1889, 33, textureX, textureY); // Box 199
		backWheelModel[36] = new ModelRendererTurbo(this, 1689, 57, textureX, textureY); // Box 200
		backWheelModel[37] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 201
		backWheelModel[38] = new ModelRendererTurbo(this, 1721, 57, textureX, textureY); // Box 202
		backWheelModel[39] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Shape 213

		backWheelModel[0].addBox(-5F, -4.5F, 0F, 10, 9, 7, 0F); // Box 197
		backWheelModel[0].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[1].addBox(-11F, -4.5F, 0F, 6, 9, 9, 0F); // Box 198
		backWheelModel[1].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[2].addFlexBox(-5F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 199
		backWheelModel[2].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[3].addFlexBox(1F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 200
		backWheelModel[3].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[4].addFlexBox(1F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 201
		backWheelModel[4].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[5].addFlexBox(-5F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 202
		backWheelModel[5].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[6].addFlexBox(-11F, 4.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 203
		backWheelModel[6].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[7].addBox(5F, -4.5F, 0F, 6, 9, 9, 0F); // Box 204
		backWheelModel[7].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[8].addFlexBox(-11F, -10.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 205
		backWheelModel[8].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[9].addShape3D(3F, -3F, -9F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 206
		backWheelModel[9].setRotationPoint(-43F, -0.5F, 17F);

		backWheelModel[10].addFlexBox(-11F, -10.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 154
		backWheelModel[10].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[11].addBox(-5F, -4.5F, 0F, 10, 9, 7, 0F); // Box 155
		backWheelModel[11].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[12].addShape3D(3F, -3F, -9F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 156
		backWheelModel[12].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[13].addFlexBox(1F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 157
		backWheelModel[13].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[14].addFlexBox(1F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 158
		backWheelModel[14].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[15].addFlexBox(-5F, 0.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 159
		backWheelModel[15].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[16].addFlexBox(-5F, -4.5F, 7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 160
		backWheelModel[16].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[17].addBox(-11F, -4.5F, 0F, 6, 9, 9, 0F); // Box 161
		backWheelModel[17].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[18].addFlexBox(-11F, 4.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 162
		backWheelModel[18].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[19].addBox(5F, -4.5F, 0F, 6, 9, 9, 0F); // Box 163
		backWheelModel[19].setRotationPoint(-67F, -0.5F, 17F);

		backWheelModel[20].addBox(-5F, -4.5F, 0F, 10, 9, 7, 0F); // Box 184
		backWheelModel[20].setRotationPoint(-43F, -0.5F, -26F);

		backWheelModel[21].addBox(-11F, -4.5F, 0F, 6, 9, 9, 0F); // Box 185
		backWheelModel[21].setRotationPoint(-43F, -0.5F, -28F);

		backWheelModel[22].addFlexBox(-5F, -4.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 186
		backWheelModel[22].setRotationPoint(-43F, -0.5F, -21F);

		backWheelModel[23].addFlexBox(1F, -4.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 187
		backWheelModel[23].setRotationPoint(-43F, -0.5F, -21F);

		backWheelModel[24].addFlexBox(1F, 0.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 188
		backWheelModel[24].setRotationPoint(-43F, -0.5F, -21F);

		backWheelModel[25].addFlexBox(-5F, 0.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 189
		backWheelModel[25].setRotationPoint(-43F, -0.5F, -21F);

		backWheelModel[26].addFlexBox(-11F, 4.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 190
		backWheelModel[26].setRotationPoint(-43F, -0.5F, -28F);

		backWheelModel[27].addBox(5F, -4.5F, 0F, 6, 9, 9, 0F); // Box 191
		backWheelModel[27].setRotationPoint(-43F, -0.5F, -28F);

		backWheelModel[28].addFlexBox(-11F, -10.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 192
		backWheelModel[28].setRotationPoint(-43F, -0.5F, -28F);

		backWheelModel[29].addShape3D(3F, -3F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 193
		backWheelModel[29].setRotationPoint(-43F, -0.5F, -22F);

		backWheelModel[30].addFlexBox(-11F, -10.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 194
		backWheelModel[30].setRotationPoint(-67F, -0.5F, -26F);

		backWheelModel[31].addBox(-5F, -4.5F, 0F, 10, 9, 7, 0F); // Box 195
		backWheelModel[31].setRotationPoint(-67F, -0.5F, -24F);

		backWheelModel[32].addFlexBox(1F, 0.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 196
		backWheelModel[32].setRotationPoint(-67F, -0.5F, -19F);

		backWheelModel[33].addFlexBox(1F, -4.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 197
		backWheelModel[33].setRotationPoint(-67F, -0.5F, -19F);

		backWheelModel[34].addFlexBox(-5F, 0.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 198
		backWheelModel[34].setRotationPoint(-67F, -0.5F, -19F);

		backWheelModel[35].addFlexBox(-5F, -4.5F, -7F, 4, 4, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 199
		backWheelModel[35].setRotationPoint(-67F, -0.5F, -19F);

		backWheelModel[36].addBox(-11F, -4.5F, 0F, 6, 9, 9, 0F); // Box 200
		backWheelModel[36].setRotationPoint(-67F, -0.5F, -26F);

		backWheelModel[37].addFlexBox(-11F, 4.5F, 0F, 22, 6, 9, 0F, -6.00F, -6.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 201
		backWheelModel[37].setRotationPoint(-67F, -0.5F, -26F);

		backWheelModel[38].addBox(5F, -4.5F, 0F, 6, 9, 9, 0F); // Box 202
		backWheelModel[38].setRotationPoint(-67F, -0.5F, -26F);

		backWheelModel[39].addShape3D(3F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 213
		backWheelModel[39].setRotationPoint(-67F, -0.5F, -23F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}