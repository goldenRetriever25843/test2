//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBTR90 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBTR90() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[75];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		bodyModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 50
		bodyModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 51
		bodyModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 52
		bodyModel[21] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 53
		bodyModel[22] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 54
		bodyModel[23] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 55
		bodyModel[24] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 56
		bodyModel[25] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 57
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 60
		bodyModel[29] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 102
		bodyModel[34] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 103
		bodyModel[35] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 104
		bodyModel[36] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 105
		bodyModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 106
		bodyModel[38] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 107
		bodyModel[39] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 108
		bodyModel[40] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 109
		bodyModel[41] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 110
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 111
		bodyModel[43] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 112
		bodyModel[44] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 113
		bodyModel[45] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 114
		bodyModel[46] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 115
		bodyModel[47] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 116
		bodyModel[48] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 117
		bodyModel[49] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 118
		bodyModel[50] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 119
		bodyModel[51] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 120
		bodyModel[52] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 121
		bodyModel[53] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 122
		bodyModel[54] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 123
		bodyModel[55] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 124
		bodyModel[56] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 125
		bodyModel[57] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 126
		bodyModel[58] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 127
		bodyModel[59] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 129
		bodyModel[61] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 130
		bodyModel[62] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 131
		bodyModel[63] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 132
		bodyModel[64] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 133
		bodyModel[65] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 140
		bodyModel[72] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 141
		bodyModel[73] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 142
		bodyModel[74] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 143

		bodyModel[0].addShapeBox(0F, 0F, 0F, 65, 6, 47, 0F, -2F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-85F, -31F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 47, 6, 47, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-20F, -31F, -23F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 47, 4, 55, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-20F, -25F, -27F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 67, 4, 55, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-87F, -25F, -27F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 8, 55, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, -3F, 0F, -4F); // Box 4
		bodyModel[4].setRotationPoint(-87F, -21F, -27F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 95, 2, 55, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[5].setRotationPoint(-68F, -21F, -27F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 6, 47, 0F, 0F, 0F, -4F, 0F, -6F, -8F, 0F, -6F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(27F, -31F, -23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 30, 4, 55, 0F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(27F, -25F, -27F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 55, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, -1F); // Box 13
		bodyModel[8].setRotationPoint(27F, -21F, -27F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 7, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F); // Box 14
		bodyModel[9].setRotationPoint(-84F, -13F, -23F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 26, 7, 53, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, -15F, -8F, 0F, -15F, 0F, 0F, -6F); // Box 15
		bodyModel[10].setRotationPoint(31F, -21F, -26F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 7, 41, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -13F, -8F, 0F, -13F, 0F, 0F, -4F); // Box 16
		bodyModel[11].setRotationPoint(31F, -14F, -20F);

		bodyModel[12].addBox(0F, 0F, 0F, 105, 12, 35, 0F); // Box 17
		bodyModel[12].setRotationPoint(-74F, -19F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 27, 8, 55, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -4F); // Box 18
		bodyModel[13].setRotationPoint(-32F, -21F, -27F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 6, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F); // Box 19
		bodyModel[14].setRotationPoint(-25F, -13F, -23F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 123, 5, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-82F, -7F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 48
		bodyModel[16].setRotationPoint(26F, -3F, 16F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[17].setRotationPoint(26F, -4F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[18].setRotationPoint(-2F, -4F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 51
		bodyModel[19].setRotationPoint(-2F, -3F, 16F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[20].setRotationPoint(-37F, -4F, 10F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 53
		bodyModel[21].setRotationPoint(-37F, -3F, 16F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[22].setRotationPoint(-64F, -4F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 55
		bodyModel[23].setRotationPoint(-64F, -3F, 16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 56
		bodyModel[24].setRotationPoint(-64F, -4F, -15F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 57
		bodyModel[25].setRotationPoint(-64F, -3F, -20F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[26].setRotationPoint(-37F, -4F, -15F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 59
		bodyModel[27].setRotationPoint(-37F, -3F, -20F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[28].setRotationPoint(-2F, -4F, -15F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 61
		bodyModel[29].setRotationPoint(-2F, -3F, -20F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 62
		bodyModel[30].setRotationPoint(26F, -4F, -15F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 2, 5, 0F); // Box 63
		bodyModel[31].setRotationPoint(26F, -3F, -20F);

		bodyModel[32].addBox(-10F, 0F, 0F, 22, 1, 23, 0F); // Box 81
		bodyModel[32].setRotationPoint(0F, -32F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 29, 0F); // Box 102
		bodyModel[33].setRotationPoint(57F, -22F, -15F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 103
		bodyModel[34].setRotationPoint(56.5F, -23F, -9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 104
		bodyModel[35].setRotationPoint(56.5F, -23F, 7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 105
		bodyModel[36].setRotationPoint(37F, -30F, -11.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 106
		bodyModel[37].setRotationPoint(37F, -30F, 8F);

		bodyModel[38].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 107
		bodyModel[38].setRotationPoint(14.5F, -26F, 23.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 108
		bodyModel[39].setRotationPoint(-53F, -26F, 23.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 10, 3, 6, 0F); // Box 109
		bodyModel[40].setRotationPoint(-82F, -27F, 23.5F);
		bodyModel[40].rotateAngleX = -0.78539816F;

		bodyModel[41].addBox(0F, 0F, 0F, 10, 3, 6, 0F); // Box 110
		bodyModel[41].setRotationPoint(-82F, -23F, -26.5F);
		bodyModel[41].rotateAngleX = 0.78539816F;

		bodyModel[42].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 111
		bodyModel[42].setRotationPoint(-53F, -26F, -24.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 112
		bodyModel[43].setRotationPoint(14.5F, -26F, -24.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 113
		bodyModel[44].setRotationPoint(13.5F, -19F, 24.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 114
		bodyModel[45].setRotationPoint(9.5F, -19F, 24.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 115
		bodyModel[46].setRotationPoint(10.5F, -17F, 24.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 116
		bodyModel[47].setRotationPoint(10.5F, -11F, 24.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 117
		bodyModel[48].setRotationPoint(-51.5F, -11F, 24.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 118
		bodyModel[49].setRotationPoint(-52.5F, -19F, 24.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 119
		bodyModel[50].setRotationPoint(-48.5F, -19F, 24.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 120
		bodyModel[51].setRotationPoint(-51.5F, -17F, 24.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[52].setRotationPoint(-51.5F, -11F, -24.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 122
		bodyModel[53].setRotationPoint(-52.5F, -19F, -24.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 123
		bodyModel[54].setRotationPoint(-48.5F, -19F, -24.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 124
		bodyModel[55].setRotationPoint(-51.5F, -17F, -24.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 125
		bodyModel[56].setRotationPoint(9.5F, -19F, -24.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 126
		bodyModel[57].setRotationPoint(10.5F, -17F, -24.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 127
		bodyModel[58].setRotationPoint(13.5F, -19F, -24.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 128
		bodyModel[59].setRotationPoint(10.5F, -11F, -24.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 27, 3, 3, 0F); // Box 129
		bodyModel[60].setRotationPoint(-82F, -31F, 22.5F);
		bodyModel[60].rotateAngleX = -0.87266463F;

		bodyModel[61].addBox(0F, 0F, 0F, 27, 3, 3, 0F); // Box 130
		bodyModel[61].setRotationPoint(-82F, -29F, -23.5F);
		bodyModel[61].rotateAngleX = 0.87266463F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[62].setRotationPoint(-43F, -33F, -1.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 132
		bodyModel[63].setRotationPoint(-51F, -32F, -2.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 34, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[64].setRotationPoint(-77.5F, -32F, -16.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 5, 3, 18, 0F); // Box 134
		bodyModel[65].setRotationPoint(-82.75F, -33F, -8.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 3, 32, 0F); // Box 135
		bodyModel[66].setRotationPoint(-85.75F, -28F, -15.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 136
		bodyModel[67].setRotationPoint(-86.75F, -29F, -12.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 137
		bodyModel[68].setRotationPoint(-86.75F, -29F, 12.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 5, 7, 0F); // Box 138
		bodyModel[69].setRotationPoint(-85.75F, -15F, 11.5F);
		bodyModel[69].rotateAngleZ = 0.19198622F;

		bodyModel[70].addBox(0F, 0F, 0F, 2, 5, 7, 0F); // Box 139
		bodyModel[70].setRotationPoint(-85.75F, -15F, -16.5F);
		bodyModel[70].rotateAngleZ = 0.19198622F;

		bodyModel[71].addBox(0F, 0F, 0F, 2, 10, 10, 0F); // Box 140
		bodyModel[71].setRotationPoint(-86.75F, -18F, -4F);
		bodyModel[71].rotateAngleZ = 0.26179939F;

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 141
		bodyModel[72].setRotationPoint(-86.5F, -13.5F, -2.5F);
		bodyModel[72].rotateAngleZ = 0.19198622F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Box 142
		bodyModel[73].setRotationPoint(-83.5F, -7.5F, -4.5F);
		bodyModel[73].rotateAngleZ = 0.19198622F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 143
		bodyModel[74].setRotationPoint(-86.75F, -19.5F, -22.5F);
		bodyModel[74].rotateAngleZ = 0.29670597F;


		turretModel = new ModelRendererTurbo[30];
		turretModel[0] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 64
		turretModel[1] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 65
		turretModel[2] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 66
		turretModel[3] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 67
		turretModel[4] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 68
		turretModel[5] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 69
		turretModel[6] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 70
		turretModel[7] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 71
		turretModel[8] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 72
		turretModel[9] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 73
		turretModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 74
		turretModel[11] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 75
		turretModel[12] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 76
		turretModel[13] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 77
		turretModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 78
		turretModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 79
		turretModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 80
		turretModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 82
		turretModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 83
		turretModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		turretModel[20] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 85
		turretModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 86
		turretModel[22] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 87
		turretModel[23] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 88
		turretModel[24] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 89
		turretModel[25] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 92
		turretModel[26] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 93
		turretModel[27] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 94
		turretModel[28] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 95
		turretModel[29] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 96

		turretModel[0].addShapeBox(-9F, 0F, -18F, 20, 8, 37, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		turretModel[0].setRotationPoint(0F, -40F, 0F);

		turretModel[1].addShapeBox(11F, 0F, -18F, 10, 8, 37, 0F, 0F, 0F, -6F, -5F, 0F, -10F, -5F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 65
		turretModel[1].setRotationPoint(0F, -40F, 0F);

		turretModel[2].addShapeBox(-18F, 0F, -18F, 9, 8, 37, 0F, -7F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 66
		turretModel[2].setRotationPoint(0F, -40F, 0F);

		turretModel[3].addBox(-4F, 0F, -11F, 9, 1, 9, 0F); // Box 67
		turretModel[3].setRotationPoint(0F, -41F, 0F);

		turretModel[4].addBox(-4F, 0F, 2F, 9, 2, 9, 0F); // Box 68
		turretModel[4].setRotationPoint(0F, -42F, 0F);

		turretModel[5].addShapeBox(-10.5F, 0F, 2F, 5, 5, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		turretModel[5].setRotationPoint(0F, -45F, 0F);

		turretModel[6].addBox(-10.5F, 0F, 7F, 5, 4, 3, 0F); // Box 70
		turretModel[6].setRotationPoint(0F, -44F, 0F);

		turretModel[7].addBox(-2F, 0F, -2F, 3, 3, 3, 0F); // Box 71
		turretModel[7].setRotationPoint(0F, -43F, 0F);

		turretModel[8].addBox(-2F, 0F, -1.5F, 6, 2, 2, 0F); // Box 72
		turretModel[8].setRotationPoint(0F, -45F, 0F);

		turretModel[9].addBox(4F, 0F, -2.5F, 1, 3, 4, 0F); // Box 73
		turretModel[9].setRotationPoint(0F, -46F, 0F);

		turretModel[10].addShapeBox(-9F, 0F, -2.5F, 18, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[10].setRotationPoint(0F, -49F, 0F);

		turretModel[11].addShapeBox(-9F, 0F, -2.5F, 18, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 75
		turretModel[11].setRotationPoint(0F, -47F, 0F);

		turretModel[12].addShapeBox(-14F, 0F, -3F, 5, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		turretModel[12].setRotationPoint(0F, -49.5F, 0F);

		turretModel[13].addShapeBox(-14F, 0F, -3F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 77
		turretModel[13].setRotationPoint(0F, -46.5F, 0F);

		turretModel[14].addBox(-14F, 0F, -3F, 5, 1, 5, 0F); // Box 78
		turretModel[14].setRotationPoint(0F, -47.5F, 0F);

		turretModel[15].addShapeBox(-8.5F, 0F, -13.5F, 1, 37, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		turretModel[15].setRotationPoint(0F, -77F, 0F);

		turretModel[16].addBox(-9F, 0F, -14F, 2, 3, 2, 0F); // Box 80
		turretModel[16].setRotationPoint(0F, -40F, 0F);

		turretModel[17].addBox(0F, 0F, -10F, 3, 1, 3, 0F); // Box 82
		turretModel[17].setRotationPoint(0F, -42F, 0F);

		turretModel[18].addShapeBox(-7F, 0F, -9F, 1, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		turretModel[18].setRotationPoint(0F, -42F, 0F);

		turretModel[19].addBox(-7F, 0F, -9F, 1, 1, 1, 0F); // Box 84
		turretModel[19].setRotationPoint(0F, -41F, 0F);

		turretModel[20].addBox(-7F, 0F, -7F, 1, 1, 1, 0F); // Box 85
		turretModel[20].setRotationPoint(0F, -41F, 0F);

		turretModel[21].addBox(-18F, 0F, 0.5F, 4, 5, 4, 0F); // Box 86
		turretModel[21].setRotationPoint(0F, -39F, 0F);

		turretModel[22].addBox(-18F, 0F, -4.5F, 4, 5, 4, 0F); // Box 87
		turretModel[22].setRotationPoint(0F, -39F, 0F);

		turretModel[23].addBox(-19F, 0F, 5F, 4, 5, 4, 0F); // Box 88
		turretModel[23].setRotationPoint(0F, -39F, 0F);
		turretModel[23].rotateAngleY = -0.2443461F;

		turretModel[24].addBox(-19.5F, 0F, -9F, 4, 5, 4, 0F); // Box 89
		turretModel[24].setRotationPoint(0F, -39F, 0F);
		turretModel[24].rotateAngleY = 0.2443461F;

		turretModel[25].addBox(0F, 0F, 18F, 7, 5, 1, 0F); // Box 92
		turretModel[25].setRotationPoint(0F, -39F, 0F);

		turretModel[26].addBox(3F, 0F, 14F, 3, 1, 4, 0F); // Box 93
		turretModel[26].setRotationPoint(0F, -38F, 0F);

		turretModel[27].addShapeBox(9F, 0F, -3F, 2, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[27].setRotationPoint(0F, -49.5F, 0F);

		turretModel[28].addBox(9F, 0F, -3F, 2, 1, 5, 0F); // Box 95
		turretModel[28].setRotationPoint(0F, -47.5F, 0F);

		turretModel[29].addShapeBox(9F, 0F, -3F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 96
		turretModel[29].setRotationPoint(0F, -46.5F, 0F);


		barrelModel = new ModelRendererTurbo[5];
		barrelModel[0] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 97
		barrelModel[1] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 98
		barrelModel[2] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 99
		barrelModel[3] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 100
		barrelModel[4] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 101

		barrelModel[0].addBox(-6F, -1F, -4.25F, 7, 3, 7, 0F); // Box 97
		barrelModel[0].setRotationPoint(18F, -37F, 0F);

		barrelModel[1].addBox(-1F, -0.5F, -3.25F, 11, 2, 2, 0F); // Box 98
		barrelModel[1].setRotationPoint(18F, -37F, 0F);

		barrelModel[2].addBox(0F, -0.25F, 0.5F, 11, 1, 1, 0F); // Box 99
		barrelModel[2].setRotationPoint(18F, -37F, 0F);

		barrelModel[3].addShapeBox(10F, -0.25F, -3F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 100
		barrelModel[3].setRotationPoint(18F, -37F, 0F);

		barrelModel[4].addShapeBox(35F, -0.5F, -3.5F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 101
		barrelModel[4].setRotationPoint(18F, -37F, 0F);


		leftFrontWheelModel = new ModelRendererTurbo[6];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 45
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 46
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 47
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 0
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 1
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 2

		leftFrontWheelModel[0].addShapeBox(-11F, -11F, 0F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftFrontWheelModel[0].setRotationPoint(28F, -2F, 21F);

		leftFrontWheelModel[1].addBox(-11F, -3F, 0F, 22, 7, 8, 0F); // Box 46
		leftFrontWheelModel[1].setRotationPoint(28F, -2F, 21F);

		leftFrontWheelModel[2].addShapeBox(-11F, 4F, 0F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 47
		leftFrontWheelModel[2].setRotationPoint(28F, -2F, 21F);

		leftFrontWheelModel[3].addShapeBox(-11F, -11F, 0F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[3].setRotationPoint(0F, -2F, 21F);

		leftFrontWheelModel[4].addBox(-11F, -3F, 0F, 22, 7, 8, 0F); // Box 1
		leftFrontWheelModel[4].setRotationPoint(0F, -2F, 21F);

		leftFrontWheelModel[5].addShapeBox(-11F, 4F, 0F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 2
		leftFrontWheelModel[5].setRotationPoint(0F, -2F, 21F);


		rightFrontWheelModel = new ModelRendererTurbo[6];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 9
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 10
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 11
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 12
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 13
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 14

		rightFrontWheelModel[0].addShapeBox(-11F, -11F, -8F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightFrontWheelModel[0].setRotationPoint(28F, -2F, -20F);

		rightFrontWheelModel[1].addBox(-11F, -3F, -8F, 22, 7, 8, 0F); // Box 10
		rightFrontWheelModel[1].setRotationPoint(28F, -2F, -20F);

		rightFrontWheelModel[2].addShapeBox(-11F, 4F, -8F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 11
		rightFrontWheelModel[2].setRotationPoint(28F, -2F, -20F);

		rightFrontWheelModel[3].addShapeBox(-11F, -11F, -8F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightFrontWheelModel[3].setRotationPoint(0F, -2F, -20F);

		rightFrontWheelModel[4].addBox(-11F, -3F, -8F, 22, 7, 8, 0F); // Box 13
		rightFrontWheelModel[4].setRotationPoint(0F, -2F, -20F);

		rightFrontWheelModel[5].addShapeBox(-11F, 4F, -8F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 14
		rightFrontWheelModel[5].setRotationPoint(0F, -2F, -20F);


		leftBackWheelModel = new ModelRendererTurbo[6];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 3
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 4
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 5
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 6
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 7
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 8

		leftBackWheelModel[0].addShapeBox(-11F, -11F, 0F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftBackWheelModel[0].setRotationPoint(-35F, -2F, 21F);

		leftBackWheelModel[1].addBox(-11F, -3F, 0F, 22, 7, 8, 0F); // Box 4
		leftBackWheelModel[1].setRotationPoint(-35F, -2F, 21F);

		leftBackWheelModel[2].addShapeBox(-11F, 4F, 0F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 5
		leftBackWheelModel[2].setRotationPoint(-35F, -2F, 21F);

		leftBackWheelModel[3].addShapeBox(-11F, -11F, 0F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftBackWheelModel[3].setRotationPoint(-62F, -2F, 21F);

		leftBackWheelModel[4].addBox(-11F, -3F, 0F, 22, 7, 8, 0F); // Box 7
		leftBackWheelModel[4].setRotationPoint(-62F, -2F, 21F);

		leftBackWheelModel[5].addShapeBox(-11F, 4F, 0F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 8
		leftBackWheelModel[5].setRotationPoint(-62F, -2F, 21F);


		rightBackWheelModel = new ModelRendererTurbo[6];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 15
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 16
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 17
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 18
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 19
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 20

		rightBackWheelModel[0].addShapeBox(-11F, -11F, -8F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightBackWheelModel[0].setRotationPoint(-35F, -2F, -20F);

		rightBackWheelModel[1].addBox(-11F, -3F, -8F, 22, 7, 8, 0F); // Box 16
		rightBackWheelModel[1].setRotationPoint(-35F, -2F, -20F);

		rightBackWheelModel[2].addShapeBox(-11F, 4F, -8F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 17
		rightBackWheelModel[2].setRotationPoint(-35F, -2F, -20F);

		rightBackWheelModel[3].addShapeBox(-11F, -11F, -8F, 22, 8, 8, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightBackWheelModel[3].setRotationPoint(-62F, -2F, -20F);

		rightBackWheelModel[4].addBox(-11F, -3F, -8F, 22, 7, 8, 0F); // Box 19
		rightBackWheelModel[4].setRotationPoint(-62F, -2F, -20F);

		rightBackWheelModel[5].addShapeBox(-11F, 4F, -8F, 22, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 20
		rightBackWheelModel[5].setRotationPoint(-62F, -2F, -20F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}