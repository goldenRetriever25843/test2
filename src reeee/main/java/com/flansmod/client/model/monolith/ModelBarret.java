//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBarret extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBarret() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[85];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		gunModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42
		gunModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		gunModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		gunModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		gunModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		gunModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		gunModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 54
		gunModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		gunModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		gunModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		gunModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		gunModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		gunModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		gunModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		gunModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		gunModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		gunModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		gunModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		gunModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		gunModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		gunModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		gunModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		gunModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		gunModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		gunModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		gunModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		gunModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		gunModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102
		gunModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		gunModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104
		gunModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		gunModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		gunModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		gunModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		gunModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110
		gunModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		gunModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		gunModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		gunModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		gunModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 115
		gunModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		gunModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		gunModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		gunModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		gunModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		gunModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		gunModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		gunModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		gunModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		gunModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		gunModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		gunModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		gunModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		gunModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		gunModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		gunModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		gunModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		gunModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		gunModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		gunModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		gunModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		gunModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		gunModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		gunModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		gunModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142
		gunModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		gunModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 151
		gunModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 152
		gunModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 153
		gunModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 154
		gunModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 155
		gunModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 157
		gunModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 221
		gunModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 222
		gunModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 223
		gunModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 224

		gunModel[0].addBox(0F, 0F, 0F, 234, 1, 10, 0F); // Box 0
		gunModel[0].setRotationPoint(-87F, -43F, -6F);

		gunModel[1].addBox(0F, 0F, 0F, 170, 1, 8, 0F); // Box 1
		gunModel[1].setRotationPoint(-87F, -43F, 4F);
		gunModel[1].rotateAngleX = -0.87266463F;

		gunModel[2].addBox(0F, 0F, 0F, 80, 1, 8, 0F); // Box 2
		gunModel[2].setRotationPoint(-87F, -36.95F, -11.1F);
		gunModel[2].rotateAngleX = 0.87266463F;

		gunModel[3].addBox(0F, 0F, 0F, 234, 3, 1, 0F); // Box 3
		gunModel[3].setRotationPoint(-87F, -36.9F, 8.12F);

		gunModel[4].addBox(0F, 0F, 0F, 80, 3, 1, 0F); // Box 4
		gunModel[4].setRotationPoint(-87F, -36.9F, -10.9F);

		gunModel[5].addBox(0F, 0F, 0F, 16, 1, 5, 0F); // Box 13
		gunModel[5].setRotationPoint(-7F, -39.3F, -9.3F);
		gunModel[5].rotateAngleX = 0.87266463F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[6].setRotationPoint(9F, -39.3F, -9.3F);
		gunModel[6].rotateAngleX = 0.87266463F;

		gunModel[7].addBox(0F, 0F, 0F, 171, 5, 1, 0F); // Box 41
		gunModel[7].setRotationPoint(-87F, -33.9F, -10.9F);
		gunModel[7].rotateAngleX = 0.38397244F;

		gunModel[8].addBox(0F, 0F, 0F, 170, 5, 1, 0F); // Box 42
		gunModel[8].setRotationPoint(-87F, -34.15F, 8.15F);
		gunModel[8].rotateAngleX = -0.38397244F;

		gunModel[9].addBox(0F, 0F, 0F, 43, 1, 1, 0F); // Box 48
		gunModel[9].setRotationPoint(17F, -42.4F, -6.7F);
		gunModel[9].rotateAngleX = 0.87266463F;

		gunModel[10].addBox(0F, 0F, 0F, 80, 1, 15, 0F); // Box 49
		gunModel[10].setRotationPoint(-87F, -30F, -8.5F);

		gunModel[11].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Box 50
		gunModel[11].setRotationPoint(-16F, -30F, -7F);
		gunModel[11].rotateAngleZ = -0.75049158F;

		gunModel[12].addBox(0F, 0F, 0F, 21, 1, 12, 0F); // Box 51
		gunModel[12].setRotationPoint(-7.2F, -21.4F, -7F);
		gunModel[12].rotateAngleZ = 0.01745329F;

		gunModel[13].addBox(0F, 0F, 0F, 24, 1, 8, 0F); // Box 52
		gunModel[13].setRotationPoint(60F, -36.95F, -11.1F);
		gunModel[13].rotateAngleX = 0.87266463F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 30, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 53
		gunModel[14].setRotationPoint(-16.2F, -29.4F, -7F);
		gunModel[14].rotateAngleZ = 0.01745329F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 30, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 54
		gunModel[15].setRotationPoint(-16.2F, -29.4F, 4F);
		gunModel[15].rotateAngleZ = 0.01745329F;

		gunModel[16].addBox(0F, 0F, 0F, 88, 3, 1, 0F); // Box 74
		gunModel[16].setRotationPoint(59F, -36.9F, -10.9F);

		gunModel[17].addBox(0F, 0F, 0F, 1, 17, 17, 0F); // Box 76
		gunModel[17].setRotationPoint(13.5F, -30.9F, -9.3F);

		gunModel[18].addBox(0F, 0F, 0F, 1, 10, 17, 0F); // Box 78
		gunModel[18].setRotationPoint(63.5F, -30.9F, -9.3F);
		gunModel[18].rotateAngleZ = -0.55850536F;

		gunModel[19].addBox(0F, 0F, 0F, 3, 1, 17, 0F); // Box 79
		gunModel[19].setRotationPoint(14.5F, -14.9F, -9.3F);

		gunModel[20].addBox(0F, 0F, 0F, 42, 1, 2, 0F); // Box 80
		gunModel[20].setRotationPoint(17.5F, -14.9F, -9.3F);
		gunModel[20].rotateAngleZ = 0.19198622F;

		gunModel[21].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 81
		gunModel[21].setRotationPoint(14.5F, -30.9F, -9.3F);

		gunModel[22].addBox(0F, 0F, 0F, 3, 17, 1, 0F); // Box 82
		gunModel[22].setRotationPoint(14.5F, -30.9F, 6.7F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 41, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[23].setRotationPoint(17.5F, -30.9F, -9.3F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 41, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[24].setRotationPoint(17.5F, -30.9F, 6.7F);

		gunModel[25].addBox(0F, 0F, 0F, 42, 1, 2, 0F); // Box 85
		gunModel[25].setRotationPoint(17.5F, -14.9F, 5.7F);
		gunModel[25].rotateAngleZ = 0.19198622F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[26].setRotationPoint(60.5F, -32.9F, -9.3F);
		gunModel[26].rotateAngleZ = -0.55850536F;

		gunModel[27].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 87
		gunModel[27].setRotationPoint(60.5F, -32.9F, 6.7F);
		gunModel[27].rotateAngleZ = -0.55850536F;

		gunModel[28].addBox(0F, 0F, 0F, 63, 1, 3, 0F); // Box 91
		gunModel[28].setRotationPoint(84F, -36.95F, -11.1F);
		gunModel[28].rotateAngleX = 0.87266463F;

		gunModel[29].addBox(0F, 0F, 0F, 63, 1, 3, 0F); // Box 92
		gunModel[29].setRotationPoint(84F, -40.76F, -8F);
		gunModel[29].rotateAngleX = 0.87266463F;

		gunModel[30].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 93
		gunModel[30].setRotationPoint(91F, -37.96F, -10.3F);
		gunModel[30].rotateAngleX = 0.87266463F;

		gunModel[31].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 97
		gunModel[31].setRotationPoint(84F, -37.96F, -10.3F);
		gunModel[31].rotateAngleX = 0.87266463F;

		gunModel[32].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 98
		gunModel[32].setRotationPoint(98F, -37.96F, -10.3F);
		gunModel[32].rotateAngleX = 0.87266463F;

		gunModel[33].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 99
		gunModel[33].setRotationPoint(105F, -37.96F, -10.3F);
		gunModel[33].rotateAngleX = 0.87266463F;

		gunModel[34].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 100
		gunModel[34].setRotationPoint(112F, -37.96F, -10.3F);
		gunModel[34].rotateAngleX = 0.87266463F;

		gunModel[35].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 101
		gunModel[35].setRotationPoint(119F, -37.96F, -10.3F);
		gunModel[35].rotateAngleX = 0.87266463F;

		gunModel[36].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 102
		gunModel[36].setRotationPoint(126F, -37.96F, -10.3F);
		gunModel[36].rotateAngleX = 0.87266463F;

		gunModel[37].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 103
		gunModel[37].setRotationPoint(140F, -37.96F, -10.3F);
		gunModel[37].rotateAngleX = 0.87266463F;

		gunModel[38].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 104
		gunModel[38].setRotationPoint(133F, -37.96F, -10.3F);
		gunModel[38].rotateAngleX = 0.87266463F;

		gunModel[39].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 105
		gunModel[39].setRotationPoint(140F, -40.96F, 5.6F);
		gunModel[39].rotateAngleX = -0.87266463F;

		gunModel[40].addBox(0F, 0F, 0F, 64, 1, 3, 0F); // Box 107
		gunModel[40].setRotationPoint(83F, -43F, 4F);
		gunModel[40].rotateAngleX = -0.87266463F;

		gunModel[41].addBox(0F, 0F, 0F, 64, 1, 3, 0F); // Box 108
		gunModel[41].setRotationPoint(83F, -39.25F, 7.3F);
		gunModel[41].rotateAngleX = -0.87266463F;

		gunModel[42].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 109
		gunModel[42].setRotationPoint(133F, -40.96F, 5.6F);
		gunModel[42].rotateAngleX = -0.87266463F;

		gunModel[43].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 110
		gunModel[43].setRotationPoint(126F, -40.96F, 5.6F);
		gunModel[43].rotateAngleX = -0.87266463F;

		gunModel[44].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 111
		gunModel[44].setRotationPoint(119F, -40.96F, 5.6F);
		gunModel[44].rotateAngleX = -0.87266463F;

		gunModel[45].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 112
		gunModel[45].setRotationPoint(112F, -40.96F, 5.6F);
		gunModel[45].rotateAngleX = -0.87266463F;

		gunModel[46].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 113
		gunModel[46].setRotationPoint(105F, -40.96F, 5.6F);
		gunModel[46].rotateAngleX = -0.87266463F;

		gunModel[47].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 114
		gunModel[47].setRotationPoint(98F, -40.96F, 5.6F);
		gunModel[47].rotateAngleX = -0.87266463F;

		gunModel[48].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 115
		gunModel[48].setRotationPoint(91F, -40.96F, 5.6F);
		gunModel[48].rotateAngleX = -0.87266463F;

		gunModel[49].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 116
		gunModel[49].setRotationPoint(83F, -40.96F, 5.6F);
		gunModel[49].rotateAngleX = -0.87266463F;

		gunModel[50].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 117
		gunModel[50].setRotationPoint(84F, -33.9F, -10.9F);
		gunModel[50].rotateAngleX = 0.38397244F;

		gunModel[51].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 118
		gunModel[51].setRotationPoint(91F, -33.9F, -10.9F);
		gunModel[51].rotateAngleX = 0.38397244F;

		gunModel[52].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 119
		gunModel[52].setRotationPoint(98F, -33.9F, -10.9F);
		gunModel[52].rotateAngleX = 0.38397244F;

		gunModel[53].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 120
		gunModel[53].setRotationPoint(105F, -33.9F, -10.9F);
		gunModel[53].rotateAngleX = 0.38397244F;

		gunModel[54].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 121
		gunModel[54].setRotationPoint(112F, -33.9F, -10.9F);
		gunModel[54].rotateAngleX = 0.38397244F;

		gunModel[55].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 122
		gunModel[55].setRotationPoint(119F, -33.9F, -10.9F);
		gunModel[55].rotateAngleX = 0.38397244F;

		gunModel[56].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 123
		gunModel[56].setRotationPoint(126F, -33.9F, -10.9F);
		gunModel[56].rotateAngleX = 0.38397244F;

		gunModel[57].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 124
		gunModel[57].setRotationPoint(133F, -33.9F, -10.9F);
		gunModel[57].rotateAngleX = 0.38397244F;

		gunModel[58].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 125
		gunModel[58].setRotationPoint(140F, -33.9F, -10.9F);
		gunModel[58].rotateAngleX = 0.38397244F;

		gunModel[59].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 126
		gunModel[59].setRotationPoint(83F, -34.15F, 8.15F);
		gunModel[59].rotateAngleX = -0.38397244F;

		gunModel[60].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 127
		gunModel[60].setRotationPoint(91F, -34.15F, 8.15F);
		gunModel[60].rotateAngleX = -0.38397244F;

		gunModel[61].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 128
		gunModel[61].setRotationPoint(98F, -34.15F, 8.15F);
		gunModel[61].rotateAngleX = -0.38397244F;

		gunModel[62].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 129
		gunModel[62].setRotationPoint(105F, -34.15F, 8.15F);
		gunModel[62].rotateAngleX = -0.38397244F;

		gunModel[63].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 130
		gunModel[63].setRotationPoint(112F, -34.15F, 8.15F);
		gunModel[63].rotateAngleX = -0.38397244F;

		gunModel[64].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 131
		gunModel[64].setRotationPoint(119F, -34.15F, 8.15F);
		gunModel[64].rotateAngleX = -0.38397244F;

		gunModel[65].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 132
		gunModel[65].setRotationPoint(126F, -34.15F, 8.15F);
		gunModel[65].rotateAngleX = -0.38397244F;

		gunModel[66].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 133
		gunModel[66].setRotationPoint(133F, -34.15F, 8.15F);
		gunModel[66].rotateAngleX = -0.38397244F;

		gunModel[67].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 134
		gunModel[67].setRotationPoint(140F, -34.15F, 8.15F);
		gunModel[67].rotateAngleX = -0.38397244F;

		gunModel[68].addBox(0F, 0F, 0F, 84, 2, 1, 0F); // Box 136
		gunModel[68].setRotationPoint(63F, -29.25F, -9F);
		gunModel[68].rotateAngleX = 0.78539816F;

		gunModel[69].addBox(0F, 0F, 0F, 84, 2, 1, 0F); // Box 137
		gunModel[69].setRotationPoint(63F, -30F, 6.6F);
		gunModel[69].rotateAngleX = -0.78539816F;

		gunModel[70].addBox(0F, 0F, 0F, 84, 1, 14, 0F); // Box 138
		gunModel[70].setRotationPoint(63F, -28.9F, -7.7F);

		gunModel[71].addBox(0F, 0F, 0F, 155, 4, 1, 0F); // Box 140
		gunModel[71].setRotationPoint(-8F, -35.9F, 5.9F);

		gunModel[72].addBox(0F, 0F, 0F, 155, 1, 8, 0F); // Box 141
		gunModel[72].setRotationPoint(-8F, -41.95F, 1.9F);
		gunModel[72].rotateAngleX = -0.87266463F;

		gunModel[73].addBox(0F, 0F, 0F, 155, 4, 2, 0F); // Box 142
		gunModel[73].setRotationPoint(-8F, -32.9F, 5.9F);
		gunModel[73].rotateAngleX = -0.48869219F;

		gunModel[74].addBox(0F, 0F, 0F, 155, 4, 1, 0F); // Box 143
		gunModel[74].setRotationPoint(-8F, -32.9F, -9.1F);
		gunModel[74].rotateAngleX = 0.48869219F;

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gunModel[75].setRotationPoint(146F, -43F, -10F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[76].setRotationPoint(146F, -28F, 9F);
		gunModel[76].rotateAngleX = 3.14159265F;

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gunModel[77].setRotationPoint(146F, -28F, -7F);
		gunModel[77].rotateAngleX = 3.12413936F;

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[78].setRotationPoint(146F, -43F, 4F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 14, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gunModel[79].setRotationPoint(146F, -28F, 6F);
		gunModel[79].rotateAngleX = 3.14159265F;

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[80].setRotationPoint(146F, -34F, 9F);
		gunModel[80].rotateAngleX = 3.14159265F;

		gunModel[81].addBox(0F, 0F, 0F, 7, 58, 2, 0F); // Box 221
		gunModel[81].setRotationPoint(119F, -30.9F, -7.9F);
		gunModel[81].rotateAngleX = -0.38397244F;

		gunModel[82].addBox(0F, 0F, 0F, 7, 58, 2, 0F); // Box 222
		gunModel[82].setRotationPoint(119F, -30.9F, 4.5F);
		gunModel[82].rotateAngleX = 0.38397244F;

		gunModel[83].addBox(0F, 0F, 0F, 7, 2, 10, 0F); // Box 223
		gunModel[83].setRotationPoint(119F, 21.7F, -37.9F);

		gunModel[84].addBox(0F, 0F, 0F, 7, 2, 10, 0F); // Box 224
		gunModel[84].setRotationPoint(119F, 21.7F, 26.1F);


		defaultBarrelModel = new ModelRendererTurbo[30];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 144
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 147
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 148
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 150
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 158
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 159
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 160
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 161
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 162
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 163
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 164
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 166
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 167
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 168
		defaultBarrelModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 169
		defaultBarrelModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 170
		defaultBarrelModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 171
		defaultBarrelModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 173
		defaultBarrelModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 174
		defaultBarrelModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 175
		defaultBarrelModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 176
		defaultBarrelModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 177
		defaultBarrelModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 178
		defaultBarrelModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 179
		defaultBarrelModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 180
		defaultBarrelModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 181

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 108, 1, 5, 0F); // Box 139
		defaultBarrelModel[0].setRotationPoint(144F, -33F, -3.5F);

		defaultBarrelModel[1].addBox(0F, 0F, 0F, 108, 1, 3, 0F); // Box 144
		defaultBarrelModel[1].setRotationPoint(144F, -34.6F, -5.3F);
		defaultBarrelModel[1].rotateAngleX = -0.64577182F;

		defaultBarrelModel[2].addBox(0F, 0F, 0F, 108, 1, 3, 0F); // Box 145
		defaultBarrelModel[2].setRotationPoint(144F, -32.8F, 0.9F);
		defaultBarrelModel[2].rotateAngleX = 0.64577182F;

		defaultBarrelModel[3].addBox(0F, 0F, 0F, 108, 5, 1, 0F); // Box 146
		defaultBarrelModel[3].setRotationPoint(144F, -38.8F, 2.9F);

		defaultBarrelModel[4].addBox(0F, 0F, 0F, 108, 5, 1, 0F); // Box 147
		defaultBarrelModel[4].setRotationPoint(144F, -38.8F, -6F);

		defaultBarrelModel[5].addBox(0F, 0F, 0F, 108, 1, 3, 0F); // Box 148
		defaultBarrelModel[5].setRotationPoint(144F, -38.85F, -6F);
		defaultBarrelModel[5].rotateAngleX = 0.64577182F;

		defaultBarrelModel[6].addBox(0F, 0F, 0F, 108, 1, 3, 0F); // Box 149
		defaultBarrelModel[6].setRotationPoint(144F, -40.6F, 1.5F);
		defaultBarrelModel[6].rotateAngleX = -0.64577182F;

		defaultBarrelModel[7].addBox(0F, 0F, 0F, 108, 1, 5, 0F); // Box 150
		defaultBarrelModel[7].setRotationPoint(144F, -40.7F, -3.5F);

		defaultBarrelModel[8].addBox(0F, 0F, 0F, 1, 12, 10, 0F); // Box 158
		defaultBarrelModel[8].setRotationPoint(243F, -42.8F, -13.1F);
		defaultBarrelModel[8].rotateAngleY = -0.66322512F;

		defaultBarrelModel[9].addBox(0F, 0F, 0F, 1, 12, 10, 0F); // Box 159
		defaultBarrelModel[9].setRotationPoint(249F, -42.8F, 2.9F);
		defaultBarrelModel[9].rotateAngleY = 0.66322512F;

		defaultBarrelModel[10].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 160
		defaultBarrelModel[10].setRotationPoint(226.75F, -42.8F, 10.3F);

		defaultBarrelModel[11].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 161
		defaultBarrelModel[11].setRotationPoint(226.75F, -42.8F, -13.7F);

		defaultBarrelModel[12].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 162
		defaultBarrelModel[12].setRotationPoint(226.75F, -31.8F, -13.7F);

		defaultBarrelModel[13].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 163
		defaultBarrelModel[13].setRotationPoint(226.75F, -31.8F, 10.3F);

		defaultBarrelModel[14].addBox(0F, 0F, 0F, 1, 12, 11, 0F); // Box 164
		defaultBarrelModel[14].setRotationPoint(225.75F, -42.8F, -13.7F);
		defaultBarrelModel[14].rotateAngleY = -0.66322512F;

		defaultBarrelModel[15].addBox(0F, 0F, 0F, 1, 11, 9, 0F); // Box 166
		defaultBarrelModel[15].setRotationPoint(240.5F, -41.8F, 3.3F);
		defaultBarrelModel[15].rotateAngleY = 0.66322512F;

		defaultBarrelModel[16].addBox(0F, 0F, 0F, 1, 11, 11, 0F); // Box 167
		defaultBarrelModel[16].setRotationPoint(234F, -41.8F, -13.7F);
		defaultBarrelModel[16].rotateAngleY = -0.66322512F;

		defaultBarrelModel[17].addBox(0F, 0F, 0F, 1, 12, 9, 0F); // Box 168
		defaultBarrelModel[17].setRotationPoint(232.5F, -42.8F, 3.3F);
		defaultBarrelModel[17].rotateAngleY = 0.66322512F;

		defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		defaultBarrelModel[18].setRotationPoint(243F, -42.8F, -13.1F);

		defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 170
		defaultBarrelModel[19].setRotationPoint(243F, -42.8F, 2.9F);

		defaultBarrelModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 171
		defaultBarrelModel[20].setRotationPoint(232F, -42.8F, 3.9F);
		defaultBarrelModel[20].rotateAngleY = 0.66322512F;

		defaultBarrelModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 173
		defaultBarrelModel[21].setRotationPoint(227F, -42.8F, -13.1F);
		defaultBarrelModel[21].rotateAngleY = -0.66322512F;

		defaultBarrelModel[22].addBox(0F, 0F, 0F, 10, 1, 24, 0F); // Box 174
		defaultBarrelModel[22].setRotationPoint(233F, -42.8F, -13.1F);

		defaultBarrelModel[23].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 175
		defaultBarrelModel[23].setRotationPoint(242F, -42.8F, -5.1F);

		defaultBarrelModel[24].addBox(0F, 0F, 0F, 10, 1, 24, 0F); // Box 176
		defaultBarrelModel[24].setRotationPoint(233F, -31.8F, -13.1F);

		defaultBarrelModel[25].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 177
		defaultBarrelModel[25].setRotationPoint(242F, -31.8F, -5.1F);

		defaultBarrelModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 178
		defaultBarrelModel[26].setRotationPoint(227F, -31.8F, -13.1F);
		defaultBarrelModel[26].rotateAngleY = -0.66322512F;

		defaultBarrelModel[27].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		defaultBarrelModel[27].setRotationPoint(243F, -31.8F, -13.1F);

		defaultBarrelModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 180
		defaultBarrelModel[28].setRotationPoint(243F, -31.8F, 2.9F);

		defaultBarrelModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 181
		defaultBarrelModel[29].setRotationPoint(232F, -31.8F, 3.9F);
		defaultBarrelModel[29].rotateAngleY = 0.66322512F;


		defaultScopeModel = new ModelRendererTurbo[34];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 182
		defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		defaultScopeModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		defaultScopeModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 185
		defaultScopeModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 186
		defaultScopeModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 187
		defaultScopeModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 188
		defaultScopeModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 189
		defaultScopeModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 190
		defaultScopeModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 191
		defaultScopeModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 192
		defaultScopeModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 195
		defaultScopeModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 196
		defaultScopeModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 197
		defaultScopeModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 198
		defaultScopeModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 199
		defaultScopeModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 203
		defaultScopeModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 204
		defaultScopeModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 205
		defaultScopeModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 206
		defaultScopeModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 207
		defaultScopeModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 208
		defaultScopeModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 209
		defaultScopeModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 210
		defaultScopeModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 211
		defaultScopeModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 212
		defaultScopeModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 213
		defaultScopeModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 214
		defaultScopeModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 215
		defaultScopeModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 216
		defaultScopeModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 217
		defaultScopeModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 218
		defaultScopeModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 219
		defaultScopeModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 220

		defaultScopeModel[0].addBox(0F, 0F, 0F, 6, 3, 12, 0F); // Box 182
		defaultScopeModel[0].setRotationPoint(11F, -45F, -7F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 6, 3, 12, 0F); // Box 183
		defaultScopeModel[1].setRotationPoint(32F, -45F, -7F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 5, 8, 7, 0F); // Box 184
		defaultScopeModel[2].setRotationPoint(32.5F, -52F, -4.5F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 5, 8, 7, 0F); // Box 185
		defaultScopeModel[3].setRotationPoint(11.5F, -52F, -4.5F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 42, 1, 7, 0F); // Box 186
		defaultScopeModel[4].setRotationPoint(-2.5F, -53F, -4.5F);

		defaultScopeModel[5].addBox(0F, 0F, 0F, 42, 1, 4, 0F); // Box 187
		defaultScopeModel[5].setRotationPoint(-2.5F, -55.15F, -7.1F);
		defaultScopeModel[5].rotateAngleX = -0.62831853F;

		defaultScopeModel[6].addBox(0F, 0F, 0F, 42, 1, 4, 0F); // Box 188
		defaultScopeModel[6].setRotationPoint(-2.5F, -52.8F, 1.9F);
		defaultScopeModel[6].rotateAngleX = 0.62831853F;

		defaultScopeModel[7].addBox(0F, 0F, 0F, 42, 5, 1, 0F); // Box 189
		defaultScopeModel[7].setRotationPoint(-2.5F, -59.35F, 4.7F);

		defaultScopeModel[8].addBox(0F, 0F, 0F, 42, 5, 1, 0F); // Box 190
		defaultScopeModel[8].setRotationPoint(-2.5F, -59.35F, -7.65F);

		defaultScopeModel[9].addBox(0F, 0F, 0F, 42, 1, 4, 0F); // Box 191
		defaultScopeModel[9].setRotationPoint(-2.5F, -61.85F, 2.5F);
		defaultScopeModel[9].rotateAngleX = -0.68067841F;

		defaultScopeModel[10].addBox(0F, 0F, 0F, 42, 1, 4, 0F); // Box 192
		defaultScopeModel[10].setRotationPoint(-2.5F, -59.4F, -7.65F);
		defaultScopeModel[10].rotateAngleX = 0.68067841F;

		defaultScopeModel[11].addBox(0F, 0F, 0F, 42, 1, 7, 0F); // Box 195
		defaultScopeModel[11].setRotationPoint(-2.5F, -61.9F, -4.5F);

		defaultScopeModel[12].addBox(0F, 0F, 0F, 14, 1, 7, 0F); // Box 196
		defaultScopeModel[12].setRotationPoint(39.5F, -61.9F, -4.5F);
		defaultScopeModel[12].rotateAngleZ = 0.19198622F;

		defaultScopeModel[13].addBox(0F, 0F, 0F, 14, 1, 7, 0F); // Box 197
		defaultScopeModel[13].setRotationPoint(39.5F, -53F, -4.5F);
		defaultScopeModel[13].rotateAngleZ = -0.19198622F;

		defaultScopeModel[14].addBox(0F, 0F, 0F, 14, 5, 1, 0F); // Box 198
		defaultScopeModel[14].setRotationPoint(39.5F, -59.35F, -7.65F);
		defaultScopeModel[14].rotateAngleY = -0.2443461F;

		defaultScopeModel[15].addBox(0F, 0F, 0F, 14, 5, 1, 0F); // Box 199
		defaultScopeModel[15].setRotationPoint(39.5F, -59.35F, 4.7F);
		defaultScopeModel[15].rotateAngleY = 0.2443461F;

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 203
		defaultScopeModel[16].setRotationPoint(39.5F, -57.8F, -10.1F);
		defaultScopeModel[16].rotateAngleX = 0.61086524F;
		defaultScopeModel[16].rotateAngleY = -0.08726646F;
		defaultScopeModel[16].rotateAngleZ = 0.15707963F;

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 204
		defaultScopeModel[17].setRotationPoint(39.5F, -56.8F, -9.1F);
		defaultScopeModel[17].rotateAngleX = -0.61086524F;
		defaultScopeModel[17].rotateAngleY = -0.08726646F;
		defaultScopeModel[17].rotateAngleZ = -0.15707963F;

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 205
		defaultScopeModel[18].setRotationPoint(39.5F, -52F, -0.199999999999999F);
		defaultScopeModel[18].rotateAngleX = 0.61086524F;
		defaultScopeModel[18].rotateAngleY = 0.17453293F;
		defaultScopeModel[18].rotateAngleZ = -0.12217305F;

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 206
		defaultScopeModel[19].setRotationPoint(39.5F, -63.8F, -0.0999999999999996F);
		defaultScopeModel[19].rotateAngleX = -0.61086524F;
		defaultScopeModel[19].rotateAngleY = 0.17453293F;
		defaultScopeModel[19].rotateAngleZ = 0.01745329F;

		defaultScopeModel[20].addBox(0F, 0F, 0F, 10, 1, 7, 0F); // Box 207
		defaultScopeModel[20].setRotationPoint(-12.5F, -62.9F, -4.5F);
		defaultScopeModel[20].rotateAngleZ = -0.10471976F;

		defaultScopeModel[21].addBox(0F, 0F, 0F, 10, 1, 7, 0F); // Box 208
		defaultScopeModel[21].setRotationPoint(-12.5F, -51.9F, -4.5F);
		defaultScopeModel[21].rotateAngleZ = 0.10471976F;

		defaultScopeModel[22].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 209
		defaultScopeModel[22].setRotationPoint(-12.5F, -59.35F, -9.2F);
		defaultScopeModel[22].rotateAngleY = 0.15707963F;

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 210
		defaultScopeModel[23].setRotationPoint(-12.5F, -59.35F, 6.1F);
		defaultScopeModel[23].rotateAngleY = -0.19198622F;

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 211
		defaultScopeModel[24].setRotationPoint(-12.5F, -61.9F, 1.7F);
		defaultScopeModel[24].rotateAngleX = 0.9424778F;
		defaultScopeModel[24].rotateAngleY = -0.05235988F;
		defaultScopeModel[24].rotateAngleZ = -0.03490659F;

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 212
		defaultScopeModel[25].setRotationPoint(-12.5F, -62.9F, -4.3F);
		defaultScopeModel[25].rotateAngleX = -0.89011792F;
		defaultScopeModel[25].rotateAngleY = 0.05235988F;
		defaultScopeModel[25].rotateAngleZ = -0.05235988F;

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 213
		defaultScopeModel[26].setRotationPoint(-12.5F, -53.9F, -9.3F);
		defaultScopeModel[26].rotateAngleX = 1.04719755F;
		defaultScopeModel[26].rotateAngleY = 0.01745329F;
		defaultScopeModel[26].rotateAngleZ = 0.03490659F;

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 214
		defaultScopeModel[27].setRotationPoint(-12.5F, -55.9F, 6.7F);
		defaultScopeModel[27].rotateAngleX = -0.9424778F;
		defaultScopeModel[27].rotateAngleY = -0.10471976F;
		defaultScopeModel[27].rotateAngleZ = -0.05235988F;

		defaultScopeModel[28].addBox(0F, 0F, 0F, 1, 11, 7, 0F); // Box 215
		defaultScopeModel[28].setRotationPoint(-12.5F, -62.9F, -4.5F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		defaultScopeModel[29].setRotationPoint(-12.5F, -62.9F, -8.5F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		defaultScopeModel[30].setRotationPoint(-11.5F, -62.9F, 6.5F);
		defaultScopeModel[30].rotateAngleY = -3.14159265F;

		defaultScopeModel[31].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 218
		defaultScopeModel[31].setRotationPoint(52.5F, -63.9F, -4.5F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		defaultScopeModel[32].setRotationPoint(52.5F, -63.9F, -10.5F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		defaultScopeModel[33].setRotationPoint(53.5F, -63.9F, 8.5F);
		defaultScopeModel[33].rotateAngleY = -3.14159265F;


		defaultStockModel = new ModelRendererTurbo[29];
		defaultStockModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		defaultStockModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		defaultStockModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		defaultStockModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		defaultStockModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		defaultStockModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		defaultStockModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		defaultStockModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		defaultStockModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		defaultStockModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		defaultStockModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		defaultStockModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		defaultStockModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		defaultStockModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		defaultStockModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		defaultStockModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		defaultStockModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		defaultStockModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		defaultStockModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		defaultStockModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		defaultStockModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		defaultStockModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		defaultStockModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		defaultStockModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		defaultStockModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		defaultStockModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		defaultStockModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		defaultStockModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		defaultStockModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75

		defaultStockModel[0].addBox(0F, 0F, 0F, 12, 1, 9, 0F); // Box 10
		defaultStockModel[0].setRotationPoint(-98F, -42F, -5.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		defaultStockModel[1].setRotationPoint(-98F, -35.85F, -10.75F);
		defaultStockModel[1].rotateAngleX = 0.87266463F;

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 12
		defaultStockModel[2].setRotationPoint(-98F, -42F, 3.5F);
		defaultStockModel[2].rotateAngleX = -0.87266463F;

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		defaultStockModel[3].setRotationPoint(-95F, -35.9F, -10.9F);

		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 18
		defaultStockModel[4].setRotationPoint(-94F, -33.9F, -10.9F);

		defaultStockModel[5].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 20
		defaultStockModel[5].setRotationPoint(-93F, -29.9F, -10.9F);

		defaultStockModel[6].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 21
		defaultStockModel[6].setRotationPoint(-92F, -24.9F, -10.9F);

		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		defaultStockModel[7].setRotationPoint(-93F, -18.9F, -10.9F);

		defaultStockModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 23
		defaultStockModel[8].setRotationPoint(-94F, -12.9F, -10.9F);

		defaultStockModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 24
		defaultStockModel[9].setRotationPoint(-95F, -6.9F, -10.9F);

		defaultStockModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 25
		defaultStockModel[10].setRotationPoint(-95F, -35.9F, 7.6F);

		defaultStockModel[11].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 26
		defaultStockModel[11].setRotationPoint(-94F, -33.9F, 7.6F);

		defaultStockModel[12].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 27
		defaultStockModel[12].setRotationPoint(-93F, -29.9F, 7.6F);

		defaultStockModel[13].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 28
		defaultStockModel[13].setRotationPoint(-92F, -24.9F, 7.6F);

		defaultStockModel[14].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		defaultStockModel[14].setRotationPoint(-93F, -18.9F, 7.6F);

		defaultStockModel[15].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 30
		defaultStockModel[15].setRotationPoint(-94F, -12.9F, 7.6F);

		defaultStockModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		defaultStockModel[16].setRotationPoint(-95F, -6.9F, 7.6F);

		defaultStockModel[17].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		defaultStockModel[17].setRotationPoint(-93F, -29.9F, -10.5F);

		defaultStockModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
		defaultStockModel[18].setRotationPoint(-94F, -33.9F, -10.5F);

		defaultStockModel[19].addBox(0F, 0F, 0F, 1, 6, 18, 0F); // Box 34
		defaultStockModel[19].setRotationPoint(-92F, -24.9F, -10.3F);

		defaultStockModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		defaultStockModel[20].setRotationPoint(-93F, -18.9F, -10.3F);

		defaultStockModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 37
		defaultStockModel[21].setRotationPoint(-94F, -12.9F, -10.6F);

		defaultStockModel[22].addBox(0F, 0F, 0F, 8, 1, 19, 0F); // Box 38
		defaultStockModel[22].setRotationPoint(-95F, -6.9F, -10.9F);
		defaultStockModel[22].rotateAngleZ = -0.12217305F;

		defaultStockModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 39
		defaultStockModel[23].setRotationPoint(-95F, -35.9F, -10.9F);

		defaultStockModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 19, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 40
		defaultStockModel[24].setRotationPoint(-97.5F, -40.9F, -9.9F);
		defaultStockModel[24].rotateAngleZ = 0.48869219F;

		defaultStockModel[25].addBox(0F, 0F, 0F, 34, 6, 17, 0F); // Box 43
		defaultStockModel[25].setRotationPoint(-88F, -10.9F, -9.3F);
		defaultStockModel[25].rotateAngleZ = 0.17453293F;

		defaultStockModel[26].addBox(0F, 0F, 0F, 23, 4, 17, 0F); // Box 44
		defaultStockModel[26].setRotationPoint(-57F, -12.9F, -9.3F);
		defaultStockModel[26].rotateAngleZ = 1.02974426F;

		defaultStockModel[27].addShapeBox(0F, 0F, 0F, 5, 7, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F); // Box 45
		defaultStockModel[27].setRotationPoint(-57F, -12.9F, -9.3F);
		defaultStockModel[27].rotateAngleZ = 0.99483767F;

		defaultStockModel[28].addBox(0F, 0F, 0F, 5, 4, 17, 0F); // Box 75
		defaultStockModel[28].setRotationPoint(-57F, -15.9F, -9.3F);
		defaultStockModel[28].rotateAngleZ = 0.62831853F;


		defaultGripModel = new ModelRendererTurbo[16];
		defaultGripModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		defaultGripModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		defaultGripModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		defaultGripModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 58
		defaultGripModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		defaultGripModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		defaultGripModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		defaultGripModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		defaultGripModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		defaultGripModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		defaultGripModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		defaultGripModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		defaultGripModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 67
		defaultGripModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		defaultGripModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		defaultGripModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70

		defaultGripModel[0].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 55
		defaultGripModel[0].setRotationPoint(-7.6F, -21F, -7F);

		defaultGripModel[1].addBox(0F, 0F, 0F, 1, 26, 12, 0F); // Box 56
		defaultGripModel[1].setRotationPoint(-7.4F, -18.6F, -7F);
		defaultGripModel[1].rotateAngleZ = -0.61086524F;

		defaultGripModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		defaultGripModel[2].setRotationPoint(-21.8F, 2.1F, -7F);
		defaultGripModel[2].rotateAngleZ = -0.36651914F;

		defaultGripModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		defaultGripModel[3].setRotationPoint(-16.8F, 4.1F, -7F);
		defaultGripModel[3].rotateAngleZ = -0.13962634F;

		defaultGripModel[4].addBox(0F, 0F, 0F, 1, 22, 12, 0F); // Box 59
		defaultGripModel[4].setRotationPoint(0F, -13.6F, -7F);
		defaultGripModel[4].rotateAngleZ = -0.52359878F;

		defaultGripModel[5].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 60
		defaultGripModel[5].setRotationPoint(0F, -13.6F, -7F);
		defaultGripModel[5].rotateAngleZ = -0.2443461F;

		defaultGripModel[6].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 61
		defaultGripModel[6].setRotationPoint(3.2F, -12.8F, -7F);
		defaultGripModel[6].rotateAngleZ = -0.03490659F;

		defaultGripModel[7].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Box 62
		defaultGripModel[7].setRotationPoint(7.2F, -12.7F, -7F);
		defaultGripModel[7].rotateAngleZ = 0.31415927F;

		defaultGripModel[8].addBox(0F, 0F, 0F, 1, 7, 12, 0F); // Box 63
		defaultGripModel[8].setRotationPoint(12.8F, -20.7F, -7F);
		defaultGripModel[8].rotateAngleZ = 0.01745329F;

		defaultGripModel[9].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // Box 64
		defaultGripModel[9].setRotationPoint(-0.200000000000003F, -20.7F, -7F);
		defaultGripModel[9].rotateAngleZ = 0.01745329F;

		defaultGripModel[10].addShapeBox(0F, 0F, 0F, 10, 25, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 65
		defaultGripModel[10].setRotationPoint(-7F, -18.6F, -7F);
		defaultGripModel[10].rotateAngleZ = -0.59341195F;

		defaultGripModel[11].addShapeBox(0F, 0F, 0F, 10, 25, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 66
		defaultGripModel[11].setRotationPoint(-7F, -18.6F, 4F);
		defaultGripModel[11].rotateAngleZ = -0.59341195F;

		defaultGripModel[12].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 67
		defaultGripModel[12].setRotationPoint(-7F, -20.6F, -7F);
		defaultGripModel[12].rotateAngleZ = 0.01745329F;

		defaultGripModel[13].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 68
		defaultGripModel[13].setRotationPoint(-7F, -20.6F, 4F);
		defaultGripModel[13].rotateAngleZ = 0.01745329F;

		defaultGripModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 69
		defaultGripModel[14].setRotationPoint(5.8F, -20.7F, -2F);
		defaultGripModel[14].rotateAngleZ = 0.01745329F;

		defaultGripModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 70
		defaultGripModel[15].setRotationPoint(5.85F, -16.7F, -2F);
		defaultGripModel[15].rotateAngleZ = 0.80285146F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135

		ammoModel[0].addShapeBox(0F, 0F, 0F, 41, 28, 13, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 135
		ammoModel[0].setRotationPoint(17.5F, -20.9F, -7.3F);


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		slideModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72
		slideModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		slideModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		slideModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90

		slideModel[0].addBox(0F, 0F, 0F, 155, 1, 8, 0F); // Box 71
		slideModel[0].setRotationPoint(-8F, -35.95F, -9.1F);
		slideModel[0].rotateAngleX = 0.87266463F;

		slideModel[1].addBox(0F, 0F, 0F, 155, 4, 1, 0F); // Box 72
		slideModel[1].setRotationPoint(-8F, -35.9F, -9.1F);

		slideModel[2].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 88
		slideModel[2].setRotationPoint(56F, -38.3F, -8.3F);
		slideModel[2].rotateAngleX = 0.87266463F;

		slideModel[3].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 89
		slideModel[3].setRotationPoint(56.5F, -38.3F, -8F);
		slideModel[3].rotateAngleX = 1.81514242F;
		slideModel[3].rotateAngleZ = -0.19198622F;

		slideModel[4].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 90
		slideModel[4].setRotationPoint(57F, -41.3F, -14F);
		slideModel[4].rotateAngleX = 1.81514242F;
		slideModel[4].rotateAngleZ = -0.19198622F;
		
		animationType = EnumAnimationType.BOTTOM_CLIP;



		translateAll(0F, -3F, 0F);


		flipAll();
	}
}