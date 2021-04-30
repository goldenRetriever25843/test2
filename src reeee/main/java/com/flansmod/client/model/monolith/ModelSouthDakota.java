//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Washington
// Model Creator: 
// Created on: 31.05.2016 - 20:04:38
// Last changed on: 31.05.2016 - 20:04:38

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSouthDakota extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSouthDakota() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[161];
		leftFrontWheelModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 186
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 187
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 188
		bodyModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 189
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		bodyModel[15] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 191
		bodyModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 192
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 193
		bodyModel[18] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 194
		bodyModel[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 195
		bodyModel[20] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 196
		bodyModel[21] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 516
		bodyModel[22] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 517
		bodyModel[23] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 518
		bodyModel[24] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 519
		bodyModel[25] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 520
		bodyModel[26] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 537
		bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 538
		bodyModel[28] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 539
		bodyModel[29] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 540
		bodyModel[30] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 541
		bodyModel[31] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 542
		bodyModel[32] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 543
		bodyModel[33] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 544
		bodyModel[34] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 586
		bodyModel[35] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 587
		bodyModel[36] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 588
		bodyModel[37] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 589
		bodyModel[38] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 590
		bodyModel[39] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 591
		bodyModel[40] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 592
		bodyModel[41] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 593
		bodyModel[42] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 656
		bodyModel[43] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 657
		bodyModel[44] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 659
		bodyModel[45] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 660
		bodyModel[46] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 661
		bodyModel[47] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 662
		bodyModel[48] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 663
		bodyModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 664
		bodyModel[50] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 665
		bodyModel[51] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 666
		bodyModel[52] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 667
		bodyModel[53] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 668
		bodyModel[54] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 669
		bodyModel[55] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 670
		bodyModel[56] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 671
		bodyModel[57] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 672
		bodyModel[58] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Box 673
		bodyModel[59] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 674
		bodyModel[60] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 675
		bodyModel[61] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 676
		bodyModel[62] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 677
		bodyModel[63] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 678
		bodyModel[64] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 679
		bodyModel[65] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 680
		bodyModel[66] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 678
		bodyModel[67] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 679
		bodyModel[68] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 680
		bodyModel[69] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 681
		bodyModel[70] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 682
		bodyModel[71] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 683
		bodyModel[72] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 684
		bodyModel[73] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 685
		bodyModel[74] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 686
		bodyModel[75] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 687
		bodyModel[76] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 688
		bodyModel[77] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 689
		bodyModel[78] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 690
		bodyModel[79] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 691
		bodyModel[80] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 692
		bodyModel[81] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 693
		bodyModel[82] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 694
		bodyModel[83] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 695
		bodyModel[84] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 696
		bodyModel[85] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 697
		bodyModel[86] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 698
		bodyModel[87] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 699
		bodyModel[88] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 700
		bodyModel[89] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 701
		bodyModel[90] = new ModelRendererTurbo(this, 649, 233, textureX, textureY); // Box 101
		bodyModel[91] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 102
		bodyModel[92] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 103
		bodyModel[93] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 104
		bodyModel[94] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 105
		bodyModel[95] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 106
		bodyModel[96] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 107
		bodyModel[97] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 108
		bodyModel[98] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 109
		bodyModel[99] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 110
		bodyModel[100] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 111
		bodyModel[101] = new ModelRendererTurbo(this, 873, 249, textureX, textureY); // Box 112
		bodyModel[102] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 113
		bodyModel[103] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 114
		bodyModel[104] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 115
		bodyModel[105] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 116
		bodyModel[106] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 117
		bodyModel[107] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 118
		bodyModel[108] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 119
		bodyModel[109] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 120
		bodyModel[110] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 121
		bodyModel[111] = new ModelRendererTurbo(this, 641, 201, textureX, textureY); // Box 122
		bodyModel[112] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 123
		bodyModel[113] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 124
		bodyModel[114] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 125
		bodyModel[115] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 126
		bodyModel[116] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 127
		bodyModel[117] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 128
		bodyModel[118] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 129
		bodyModel[119] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 130
		bodyModel[120] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 131
		bodyModel[121] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 132
		bodyModel[122] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 133
		bodyModel[123] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 134
		bodyModel[124] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 135
		bodyModel[125] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 136
		bodyModel[126] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 137
		bodyModel[127] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 138
		bodyModel[128] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 139
		bodyModel[129] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 140
		bodyModel[130] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 141
		bodyModel[131] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 142
		bodyModel[132] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 143
		bodyModel[133] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 144
		bodyModel[134] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 145
		bodyModel[135] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 146
		bodyModel[136] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 147
		bodyModel[137] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 148
		bodyModel[138] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 149
		bodyModel[139] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 150
		bodyModel[140] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 151
		bodyModel[141] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 152
		bodyModel[142] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 153
		bodyModel[143] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 154
		bodyModel[144] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 155
		bodyModel[145] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 156
		bodyModel[146] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 157
		bodyModel[147] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 158
		bodyModel[148] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 159
		bodyModel[149] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 160
		bodyModel[150] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 161
		bodyModel[151] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 162
		bodyModel[152] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 163
		bodyModel[153] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 164
		bodyModel[154] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 165
		bodyModel[155] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 166
		bodyModel[156] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 167
		bodyModel[157] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 168
		bodyModel[158] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 169
		bodyModel[159] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 170
		bodyModel[160] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 171

		bodyModel[0].addShapeBox(0F, 0F, 0F, 47, 9, 56, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 1
		bodyModel[0].setRotationPoint(-45F, 3.5F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 40, 9, 56, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 2
		bodyModel[1].setRotationPoint(-85.02F, 3.5F, -28F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 78, 9, 50, 0F,0F, 0F, 3F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F); // Box 3
		bodyModel[2].setRotationPoint(2F, 3.52F, -25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 13, 24, 0F,0F, -2F, 0F, 0F, 2F, -2.5F, 0F, 2F, -2.5F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F); // Box 4
		bodyModel[3].setRotationPoint(110F, -0.5F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 30, 9, 26, 0F,0F, 0.5F, 3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0.5F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(79.99F, 3.5F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 6, 19, 0F,0F, 0F, 0F, 0F, 2.5F, -2.5F, 0F, 2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1.5F); // Box 7
		bodyModel[5].setRotationPoint(140F, -2.52F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 7, 14, 0F,0F, 0F, 0F, 0F, 1.8F, -5F, 0F, 1.8F, -5F, 0F, 0F, 0F, 0F, 0.49F, -3.5F, -2.5F, 0F, -5F, -2.5F, 0F, -5F, 0F, 0.49F, -3.5F); // Box 8
		bodyModel[6].setRotationPoint(156F, -5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 52, 9, 54, 0F,0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -9F); // Box 9
		bodyModel[7].setRotationPoint(-137F, 3.5F, -27F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 43, 9, 40, 0F,0F, 0F, -8F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -8F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -12F); // Box 10
		bodyModel[8].setRotationPoint(-180.01F, 3.5F, -20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 9, 24, 0F,-1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -4F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -7F); // Box 11
		bodyModel[9].setRotationPoint(-190.01F, 3.5F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -1.2F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.2F, -0.4F, -1.2F); // Box 186
		bodyModel[10].setRotationPoint(-3.09999999999999F, -20.3F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.5F, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.5F, -0.4F, 0F); // Box 187
		bodyModel[11].setRotationPoint(0.4F, -20.3F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.2F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0.2F, -1.3F, -0.3F, 0.2F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F); // Box 188
		bodyModel[12].setRotationPoint(2.4F, -20.3F, 5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 189
		bodyModel[13].setRotationPoint(2.25F, -18.85F, 3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F); // Box 190
		bodyModel[14].setRotationPoint(-2.1F, -17.7F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F); // Box 191
		bodyModel[15].setRotationPoint(0.9F, -17.7F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[16].setRotationPoint(0.89F, -17.7F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 193
		bodyModel[17].setRotationPoint(-2.1F, -17.7F, 4.98999999999999F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -0.4F, -1.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 194
		bodyModel[18].setRotationPoint(-3.11F, -20.3F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[19].setRotationPoint(-2.11F, -21.5F, 5.98999999999999F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[20].setRotationPoint(-2.11F, -21.5F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 516
		bodyModel[21].setRotationPoint(-18F, -4.4F, 23.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 517
		bodyModel[22].setRotationPoint(-15F, -4.4F, 23.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Box 518
		bodyModel[23].setRotationPoint(-19.5F, -2.7F, 19F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[24].setRotationPoint(-19.5F, -4.7F, 19F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 520
		bodyModel[25].setRotationPoint(-19.5F, -5.7F, 19F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 537
		bodyModel[26].setRotationPoint(54.01F, 1F, 0.01F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 538
		bodyModel[27].setRotationPoint(63F, 1F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[28].setRotationPoint(54.01F, 1F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[29].setRotationPoint(63F, 1F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 541
		bodyModel[30].setRotationPoint(-106F, 1F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[31].setRotationPoint(-106F, 1F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[32].setRotationPoint(-114.99F, 1F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 544
		bodyModel[33].setRotationPoint(-114.99F, 1F, 0.01F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[34].setRotationPoint(-189.21F, 2.8F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[35].setRotationPoint(-189.21F, 2.8F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[36].setRotationPoint(-189.21F, 1.2F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[37].setRotationPoint(-188.7F, -5.8F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,0F, -6F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, -6F, -0.3F, 0F, 0F, -0.3F, 0.8F, -7F, -0.3F, 0.8F, -7F, -0.3F, 0F, 0F, -0.3F); // Box 590
		bodyModel[38].setRotationPoint(-188.5F, -5.8F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,1F, 0F, -0.35F, 0F, -1.8F, -1F, 0F, -1.8F, -1F, 1F, 0F, -0.35F, 0.5F, -1F, -0.35F, 0F, -1F, -1F, 0F, -1F, -1F, 0.5F, -1F, -0.35F); // Box 591
		bodyModel[39].setRotationPoint(-173.51F, -7.8F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		bodyModel[40].setRotationPoint(-161.51F, -5.8F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 593
		bodyModel[41].setRotationPoint(-188.5F, -5.8F, -0.5F);
		bodyModel[41].rotateAngleZ = 0.13962634F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[42].setRotationPoint(103F, 1.5F, -3F);
		bodyModel[42].rotateAngleY = -0.13962634F;
		bodyModel[42].rotateAngleZ = 0.12217305F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[43].setRotationPoint(103F, 1.5F, 2F);
		bodyModel[43].rotateAngleY = 0.13962634F;
		bodyModel[43].rotateAngleZ = 0.12217305F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 47, 7, 52, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 659
		bodyModel[44].setRotationPoint(-45F, 12.5F, -26F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 78, 7, 50, 0F,0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -11F, 0F, 0.5F, -11F, 0F, 0F, 0F); // Box 660
		bodyModel[45].setRotationPoint(2F, 12.52F, -25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 30, 7, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0.5F, 1F); // Box 661
		bodyModel[46].setRotationPoint(80F, 12.5F, -13F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 30, 7, 26, 0F,0F, 0F, -4F, 0F, 0F, -8.01F, 0F, 0F, -8.01F, 0F, 0F, -4F, 0F, 2F, -5F, 0F, 1.5F, -9F, 0F, 1.5F, -9F, 0F, 2F, -5F); // Box 662
		bodyModel[47].setRotationPoint(110.01F, 12.5F, -13F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 7, 19, 0F,0F, 0F, -1.5F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, -1.5F, 0F, 2F, -4.4F, 0F, 1.5F, -8.5F, 0F, 1.5F, -8.5F, 0F, 2F, -4.4F); // Box 663
		bodyModel[48].setRotationPoint(140.01F, 3.48F, -9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 7, 14, 0F,0F, 0.49F, -3.5F, -2.5F, 1F, -5F, -2.5F, 1F, -5F, 0F, 0.49F, -3.5F, 0F, 2F, -6F, -5F, 1.8F, -6.5F, -5F, 1.8F, -6.5F, 0F, 2F, -6F); // Box 664
		bodyModel[49].setRotationPoint(156.01F, 3F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 10, 19, 0F,0F, -2F, -4.4F, 0F, -1.5F, -8.5F, 0F, -1.5F, -8.5F, 0F, -2F, -4.4F, 0F, 0.5F, -5.5F, 0F, 1F, -6.5F, 0F, 1F, -6.5F, 0F, 0.5F, -5.5F); // Box 665
		bodyModel[50].setRotationPoint(140.01F, 10.51F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 11, 14, 0F,0F, -2F, -6F, -5F, -1.8F, -6.5F, -5F, -1.8F, -6.5F, 0F, -2F, -6F, 0F, 0.49F, -4F, -4.5F, 1F, -6F, -4.5F, 1F, -6F, 0F, 0.49F, -4F); // Box 666
		bodyModel[51].setRotationPoint(156.01F, 10F, -7.01F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 4, 14, 0F,0F, 1.49F, -4F, -4.5F, 1F, -6F, -4.5F, 1F, -6F, 0F, 1.49F, -4F, 0F, 0F, -6F, -6F, -0.8F, -6.5F, -6F, -0.8F, -6.5F, 0F, 0F, -6F); // Box 667
		bodyModel[52].setRotationPoint(156.01F, 23F, -7.01F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 4, 19, 0F,0F, 1.5F, -5.5F, 0F, 1F, -6.5F, 0F, 1F, -6.5F, 0F, 1.5F, -5.5F, 0F, 0F, -7.4F, 0F, 0.5F, -8.5F, 0F, 0.5F, -8.5F, 0F, 0F, -7.4F); // Box 668
		bodyModel[53].setRotationPoint(140.01F, 22.51F, -9.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 30, 6, 26, 0F,0F, 2F, -5F, 0F, 2.5F, -9F, 0F, 2.5F, -9F, 0F, 2F, -5F, 0F, -3F, -9F, 0F, -3F, -11.01F, 0F, -3F, -11.01F, 0F, -3F, -9F); // Box 669
		bodyModel[54].setRotationPoint(110.01F, 23.5F, -13F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 30, 3, 26, 0F,0F, 3.5F, 1F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 3.5F, 1F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F); // Box 670
		bodyModel[55].setRotationPoint(80F, 23.5F, -13F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 78, 6, 50, 0F,0F, 1F, 0F, 0F, 0.5F, -11F, 0F, 0.5F, -11F, 0F, 1F, 0F, 0F, 0F, -7F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -7F); // Box 671
		bodyModel[56].setRotationPoint(2F, 20.52F, -25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 47, 7, 52, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -6F); // Box 672
		bodyModel[57].setRotationPoint(-45F, 19.5F, -26F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 40, 7, 52, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 673
		bodyModel[58].setRotationPoint(-85.02F, 12.5F, -26F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 52, 7, 50, 0F,0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 674
		bodyModel[59].setRotationPoint(-137.01F, 12.5F, -25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 43, 7, 40, 0F,0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -12F, -12F, -3F, -14F, 0F, 0F, -5F, 0F, 0F, -5F, -12F, -3F, -14F); // Box 675
		bodyModel[60].setRotationPoint(-180.01F, 12.5F, -20.01F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 40, 7, 52, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -7F); // Box 676
		bodyModel[61].setRotationPoint(-85.02F, 19.5F, -26F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 52, 7, 50, 0F,0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -16F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, -16F); // Box 677
		bodyModel[62].setRotationPoint(-137F, 19.51F, -25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 31, 7, 50, 0F,0F, 3F, -19F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 3F, -19F, 0F, -10F, -19F, 0F, -2F, -16F, 0F, -2F, -16F, 0F, -10F, -19F); // Box 678
		bodyModel[63].setRotationPoint(-168F, 19.52F, -25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 45, 11, 5, 0F,1F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 1F, -4F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, -4F, -1F, -2F); // Box 679
		bodyModel[64].setRotationPoint(-168F, 15.52F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 45, 11, 5, 0F,1F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 1F, -4F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, -4F, -1F, -2F); // Box 680
		bodyModel[65].setRotationPoint(-168F, 15.52F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[66].setRotationPoint(-144F, 21.52F, -12.7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[67].setRotationPoint(-144F, 21.52F, 10.7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[68].setRotationPoint(-160F, 22F, -12.2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[69].setRotationPoint(-160F, 22F, 11.2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3F, -1.2F, 0F, 3F, -1.2F, 0F, 3F, 0.8F, 0F, 3F, 0.81F); // Box 682
		bodyModel[70].setRotationPoint(-156F, 18F, 10.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 3F, 0.81F, 0F, 3F, 0.8F, 0F, 3F, -1.2F, 0F, 3F, -1.2F); // Box 683
		bodyModel[71].setRotationPoint(-156F, 18F, -11.2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 684
		bodyModel[72].setRotationPoint(-156F, 22F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 685
		bodyModel[73].setRotationPoint(-156F, 22F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		bodyModel[74].setRotationPoint(-159F, 22.5F, 11.7F);

		bodyModel[75].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		bodyModel[75].setRotationPoint(-159F, 22.5F, 11.7F);
		bodyModel[75].rotateAngleX = 2.0943951F;

		bodyModel[76].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		bodyModel[76].setRotationPoint(-159F, 22.5F, 11.7F);
		bodyModel[76].rotateAngleX = 4.1887902F;

		bodyModel[77].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[77].setRotationPoint(-159F, 22.5F, -11.7F);

		bodyModel[78].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[78].setRotationPoint(-159F, 22.5F, -11.7F);
		bodyModel[78].rotateAngleX = 2.0943951F;

		bodyModel[79].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[79].setRotationPoint(-159F, 22.5F, -11.7F);
		bodyModel[79].rotateAngleX = 4.1887902F;

		bodyModel[80].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[80].setRotationPoint(-169F, 22.5F, -5.2F);

		bodyModel[81].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[81].setRotationPoint(-169F, 22.5F, -5.2F);
		bodyModel[81].rotateAngleX = 2.0943951F;

		bodyModel[82].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		bodyModel[82].setRotationPoint(-169F, 22.5F, -5.2F);
		bodyModel[82].rotateAngleX = 4.1887902F;

		bodyModel[83].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[83].setRotationPoint(-169F, 22.5F, 5.2F);

		bodyModel[84].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[84].setRotationPoint(-169F, 22.5F, 5.2F);
		bodyModel[84].rotateAngleX = 2.0943951F;

		bodyModel[85].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		bodyModel[85].setRotationPoint(-169F, 22.5F, 5.2F);
		bodyModel[85].rotateAngleX = 4.1887902F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[86].setRotationPoint(-170F, 22F, -5.7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		bodyModel[87].setRotationPoint(-170F, 22F, 4.7F);

		bodyModel[88].addShapeBox(0F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		bodyModel[88].setRotationPoint(-178F, 12F, 6.2F);

		bodyModel[89].addShapeBox(0F, 0F, -0.5F, 4, 10, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		bodyModel[89].setRotationPoint(-178F, 12F, -6.2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 85, 6, 44, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 101
		bodyModel[90].setRotationPoint(-65F, -2F, -22F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 17, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -1F); // Box 102
		bodyModel[91].setRotationPoint(20F, -2F, -21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 103
		bodyModel[92].setRotationPoint(26.01F, -3F, 0.01F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[93].setRotationPoint(26.01F, -3F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[94].setRotationPoint(35F, -3F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 106
		bodyModel[95].setRotationPoint(35F, -3F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 24, 6, 46, 0F,0F, 0F, -18F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -18F); // Box 107
		bodyModel[96].setRotationPoint(-89F, -2F, -23F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 108
		bodyModel[97].setRotationPoint(10F, -16F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 109
		bodyModel[98].setRotationPoint(3F, -14F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[99].setRotationPoint(-4F, -14F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 9, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[100].setRotationPoint(-57F, -11F, -14F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 15, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[101].setRotationPoint(-43F, -11F, -21F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 113
		bodyModel[102].setRotationPoint(-28F, -11F, -21F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 9, 21, 8, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 114
		bodyModel[103].setRotationPoint(-62F, -22F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 19, 23, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 115
		bodyModel[104].setRotationPoint(-21F, -24F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[105].setRotationPoint(-2F, -21F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 117
		bodyModel[106].setRotationPoint(-5F, -28F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[107].setRotationPoint(-32F, -24F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 119
		bodyModel[108].setRotationPoint(10F, -12F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 120
		bodyModel[109].setRotationPoint(9F, -9F, -12F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[110].setRotationPoint(3F, -9F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 122
		bodyModel[111].setRotationPoint(-7F, -9F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 19, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 123
		bodyModel[112].setRotationPoint(-7F, -43F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 45, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[113].setRotationPoint(-34F, -46F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 125
		bodyModel[114].setRotationPoint(-18F, -4.4F, -30.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 126
		bodyModel[115].setRotationPoint(-15F, -4.4F, -30.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Box 127
		bodyModel[116].setRotationPoint(-19.5F, -2.7F, -25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[117].setRotationPoint(-19.5F, -4.7F, -25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[118].setRotationPoint(-19.5F, -5.7F, -23F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 130
		bodyModel[119].setRotationPoint(-51F, -4.4F, -32.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 131
		bodyModel[120].setRotationPoint(-48F, -4.4F, -32.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Box 132
		bodyModel[121].setRotationPoint(-52.5F, -2.7F, -27F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[122].setRotationPoint(-52.5F, -4.7F, -27F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 134
		bodyModel[123].setRotationPoint(-52.5F, -5.7F, -25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 135
		bodyModel[124].setRotationPoint(-51F, -4.4F, 25.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 136
		bodyModel[125].setRotationPoint(-48F, -4.4F, 25.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Box 137
		bodyModel[126].setRotationPoint(-52.5F, -2.7F, 21F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[127].setRotationPoint(-52.5F, -4.7F, 21F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		bodyModel[128].setRotationPoint(-52.5F, -5.7F, 21F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 140
		bodyModel[129].setRotationPoint(-6F, -9.4F, 17.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 141
		bodyModel[130].setRotationPoint(-3F, -9.4F, 17.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Box 142
		bodyModel[131].setRotationPoint(-7.5F, -7.7F, 13F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[132].setRotationPoint(-7.5F, -9.7F, 13F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 144
		bodyModel[133].setRotationPoint(-7.5F, -10.7F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 145
		bodyModel[134].setRotationPoint(-6F, -9.4F, -24.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 146
		bodyModel[135].setRotationPoint(-3F, -9.4F, -24.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 7, 7, 6, 0F); // Box 147
		bodyModel[136].setRotationPoint(-7.5F, -7.7F, -19F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[137].setRotationPoint(-7.5F, -9.7F, -19F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[138].setRotationPoint(-7.5F, -10.7F, -17F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 12, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 150
		bodyModel[139].setRotationPoint(-12F, -36F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[140].setRotationPoint(-33F, -24F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -0.4F, -1.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F); // Box 152
		bodyModel[141].setRotationPoint(-3.09999999999999F, -20.3F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.5F, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.5F, -0.4F, 0F); // Box 153
		bodyModel[142].setRotationPoint(0.4F, -20.3F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0.2F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0.2F, -1.3F, -0.3F, 0.2F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F); // Box 154
		bodyModel[143].setRotationPoint(2.4F, -20.3F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 155
		bodyModel[144].setRotationPoint(2.25F, -18.85F, -12.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 156
		bodyModel[145].setRotationPoint(-2.1F, -17.7F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[146].setRotationPoint(0.9F, -17.7F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -1.2F, 0F, 0F, -0.5F); // Box 158
		bodyModel[147].setRotationPoint(0.89F, -17.7F, -8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -1.2F); // Box 159
		bodyModel[148].setRotationPoint(-2.1F, -17.7F, -7.98999999999999F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, -1.2F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.2F, -0.4F, -1.2F); // Box 160
		bodyModel[149].setRotationPoint(-3.11F, -20.3F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 161
		bodyModel[150].setRotationPoint(-2.11F, -21.5F, -7.98999999999999F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[151].setRotationPoint(-2.11F, -21.5F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 163
		bodyModel[152].setRotationPoint(-33.5F, -64F, -0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 164
		bodyModel[153].setRotationPoint(-13.5F, -53F, -0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[154].setRotationPoint(-14.5F, -49F, -1.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[155].setRotationPoint(-13F, -54F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[156].setRotationPoint(-7F, -45F, -2.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 168
		bodyModel[157].setRotationPoint(-7F, -47F, -2.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[158].setRotationPoint(-5F, -43F, -6.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 170
		bodyModel[159].setRotationPoint(-2F, -43F, -6.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 171
		bodyModel[160].setRotationPoint(-8F, -43F, -6.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Flag
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 702
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 703
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 704
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 705

		leftFrontWheelModel[0].addShapeBox(-17.5F, 0F, -0.5F, 78, 39, 1, 0F,-1F, -1F, -0.49F, -60.5F, 0F, -0.49F, -60.5F, 0F, -0.49F, -1F, -1F, -0.49F, 1F, -29F, -0.49F, -63F, -30F, -0.49F, -63F, -30F, -0.49F, 1F, -29F, -0.49F); // Flag
		leftFrontWheelModel[0].setRotationPoint(-33F, -61F, 0F);
		leftFrontWheelModel[0].rotateAngleZ = 0.13962634F;

		leftFrontWheelModel[1].addShapeBox(-4F, 0F, -0.5F, 4, 10, 1, 0F,0.5F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0.5F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F); // Box 702
		leftFrontWheelModel[1].setRotationPoint(-178F, 16F, -6.2F);

		leftFrontWheelModel[2].addShapeBox(0F, 6F, -0.5F, 3, 4, 1, 0F,0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 703
		leftFrontWheelModel[2].setRotationPoint(-178F, 16F, -6.2F);

		leftFrontWheelModel[3].addShapeBox(-4F, 0F, -0.5F, 4, 10, 1, 0F,0.5F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0.5F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F); // Box 704
		leftFrontWheelModel[3].setRotationPoint(-178F, 16F, 6.2F);

		leftFrontWheelModel[4].addShapeBox(0F, 6F, -0.5F, 3, 4, 1, 0F,0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 705
		leftFrontWheelModel[4].setRotationPoint(-178F, 16F, 6.2F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[4];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 545
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 546
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 547
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 548

		gun_1_Model[0][0].addShapeBox(1F, -3F, -9.5F, 9, 5, 19, 0F,0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.8F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, 0F, 0F, 0.8F); // Box 545

		gun_1_Model[0][1].addShapeBox(-12.99F, -3F, -9.51F, 14, 5, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 546

		gun_1_Model[0][2].addShapeBox(-13.01F, -3F, 5.51F, 14, 5, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, -1F); // Box 547

		gun_1_Model[0][3].addShapeBox(-13.01F, -3F, -5.5F, 14, 5, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0.5F, 0F, 0F); // Box 548

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(34F, -5F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[9];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 550
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 551
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 552
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 553
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 555
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 556
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 557
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 558
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 559

		gun_1_Model[2][0].addShapeBox(13F, -1.1F, -1F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 550

		gun_1_Model[2][1].addShapeBox(21F, -1.1F, -1F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551

		gun_1_Model[2][2].addShapeBox(21F, -1.1F, 4F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 552

		gun_1_Model[2][3].addShapeBox(13F, -1.1F, 4F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 553

		gun_1_Model[2][4].addShapeBox(8F, -2F, -6F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 555

		gun_1_Model[2][5].addShapeBox(13F, -1.1F, -6F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 556

		gun_1_Model[2][6].addShapeBox(21F, -1.1F, -6F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 557

		gun_1_Model[2][7].addShapeBox(8F, -2F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 558

		gun_1_Model[2][8].addShapeBox(8F, -2F, 4F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 559

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(34F, -5F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[4];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 545
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 546
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 547
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 548

		gun_2_Model[0][0].addShapeBox(1F, -3F, -9.5F, 9, 5, 19, 0F,0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.8F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, 0F, 0F, 0.8F); // Box 545

		gun_2_Model[0][1].addShapeBox(-12.99F, -3F, -9.51F, 14, 5, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 546

		gun_2_Model[0][2].addShapeBox(-13.01F, -3F, 5.51F, 14, 5, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, -1F); // Box 547

		gun_2_Model[0][3].addShapeBox(-13.01F, -3F, -5.5F, 14, 5, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0.5F, 0F, 0F); // Box 548

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(61F, -1F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[9];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 550
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 551
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 552
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 553
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 555
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 556
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 557
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 558
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 559

		gun_2_Model[2][0].addShapeBox(13F, -1.1F, -1F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 550

		gun_2_Model[2][1].addShapeBox(21F, -1.1F, -1F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551

		gun_2_Model[2][2].addShapeBox(21F, -1.1F, 4F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 552

		gun_2_Model[2][3].addShapeBox(13F, -1.1F, 4F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 553

		gun_2_Model[2][4].addShapeBox(8F, -2F, -6F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 555

		gun_2_Model[2][5].addShapeBox(13F, -1.1F, -6F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 556

		gun_2_Model[2][6].addShapeBox(21F, -1.1F, -6F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 557

		gun_2_Model[2][7].addShapeBox(8F, -2F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 558

		gun_2_Model[2][8].addShapeBox(8F, -2F, 4F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 559

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(61F, -1F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[4];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 545
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 546
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 547
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 548

		gun_3_Model[0][0].addShapeBox(1F, -3F, -9.5F, 9, 5, 19, 0F,0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.8F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, 0F, 0F, 0.8F); // Box 545

		gun_3_Model[0][1].addShapeBox(-12.99F, -3F, -9.51F, 14, 5, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 546

		gun_3_Model[0][2].addShapeBox(-13.01F, -3F, 5.51F, 14, 5, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, -1F); // Box 547

		gun_3_Model[0][3].addShapeBox(-13.01F, -3F, -5.5F, 14, 5, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0.5F, 0F, 0F); // Box 548

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-106F, -1F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[9];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 550
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 551
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 552
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 553
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 555
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 556
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 557
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 558
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 559

		gun_3_Model[2][0].addShapeBox(13F, -1.1F, -1F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 550

		gun_3_Model[2][1].addShapeBox(21F, -1.1F, -1F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 551

		gun_3_Model[2][2].addShapeBox(21F, -1.1F, 4F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 552

		gun_3_Model[2][3].addShapeBox(13F, -1.1F, 4F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 553

		gun_3_Model[2][4].addShapeBox(8F, -2F, -6F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 555

		gun_3_Model[2][5].addShapeBox(13F, -1.1F, -6F, 8, 2, 2, 0F,0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 556

		gun_3_Model[2][6].addShapeBox(21F, -1.1F, -6F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 557

		gun_3_Model[2][7].addShapeBox(8F, -2F, -1F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 558

		gun_3_Model[2][8].addShapeBox(8F, -2F, 4F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.8F, 0F); // Box 559

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-106F, -1F, 0F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);
	}
}