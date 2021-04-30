//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMig31Fix extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMig31Fix() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 3
		bodyModel[24] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 7
		bodyModel[28] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 8
		bodyModel[29] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 9
		bodyModel[30] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 10
		bodyModel[31] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 12
		bodyModel[33] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 13
		bodyModel[34] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 14
		bodyModel[35] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
		bodyModel[36] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 17
		bodyModel[37] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 18
		bodyModel[38] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 19
		bodyModel[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		bodyModel[40] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 14
		bodyModel[41] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 15
		bodyModel[42] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 16
		bodyModel[43] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 18
		bodyModel[45] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 19
		bodyModel[46] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 20
		bodyModel[47] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 21
		bodyModel[48] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 22
		bodyModel[49] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 23
		bodyModel[50] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 24
		bodyModel[51] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Box 25
		bodyModel[52] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 26
		bodyModel[53] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 27
		bodyModel[54] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 28
		bodyModel[55] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 29
		bodyModel[56] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 30
		bodyModel[57] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 31
		bodyModel[58] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 32
		bodyModel[59] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 33
		bodyModel[60] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 34
		bodyModel[61] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 35
		bodyModel[62] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 36
		bodyModel[63] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 37
		bodyModel[64] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 38
		bodyModel[65] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 39
		bodyModel[66] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 40
		bodyModel[67] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 42
		bodyModel[69] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Box 43
		bodyModel[70] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 44
		bodyModel[71] = new ModelRendererTurbo(this, 913, 153, textureX, textureY); // Box 45
		bodyModel[72] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 46
		bodyModel[73] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 47
		bodyModel[74] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 48
		bodyModel[75] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 49
		bodyModel[76] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 51
		bodyModel[77] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 52
		bodyModel[78] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 53
		bodyModel[79] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 54
		bodyModel[80] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 10
		bodyModel[81] = new ModelRendererTurbo(this, 825, 233, textureX, textureY); // Box 11
		bodyModel[82] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 14
		bodyModel[83] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 15
		bodyModel[84] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 16
		bodyModel[85] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 17
		bodyModel[86] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 18
		bodyModel[87] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 19
		bodyModel[88] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 20
		bodyModel[89] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 21
		bodyModel[90] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 22
		bodyModel[91] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 23
		bodyModel[92] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 9
		bodyModel[93] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 10
		bodyModel[94] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 11
		bodyModel[95] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 12
		bodyModel[96] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Box 13
		bodyModel[97] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 64
		bodyModel[98] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 65
		bodyModel[99] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 66
		bodyModel[100] = new ModelRendererTurbo(this, 609, 265, textureX, textureY); // Box 67

		bodyModel[0].addShapeBox(0F, 0F, 0F, 150, 3, 48, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-53F, -37F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 150, 1, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-53F, -10F, -24F);

		bodyModel[2].addBox(0F, 0F, 0F, 150, 17, 48, 0F); // Box 2
		bodyModel[2].setRotationPoint(-53F, -34F, -24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 22, 24, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-75F, -34F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 3, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-75F, -37F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-109F, -17F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 6
		bodyModel[6].setRotationPoint(-129F, -17F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 18, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-109F, -34F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 18, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-109F, -34F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 34, 3, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-109F, -37F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 34, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-109F, -37F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 20, 17, 3, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-129F, -34F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 17, 3, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 12
		bodyModel[12].setRotationPoint(-129F, -34F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 7, 20, 0F, 0F, -3F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -6F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F); // Box 13
		bodyModel[13].setRotationPoint(-129F, -37F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 15, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-129F, -32F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 40, 7, 14, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-75F, -44F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 68, 6, 14, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-35F, -43F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 64, 4, 10, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(33F, -41F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(97F, -41F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 21
		bodyModel[19].setRotationPoint(97F, -37F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 46, 1, 14, 0F); // Box 0
		bodyModel[20].setRotationPoint(-99F, -34F, -24F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 46, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F); // Box 1
		bodyModel[21].setRotationPoint(-99F, -33F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 46, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-99F, -33F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 46, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F); // Box 3
		bodyModel[23].setRotationPoint(-99F, -33F, 23F);

		bodyModel[24].addBox(0F, 0F, 0F, 46, 1, 14, 0F); // Box 4
		bodyModel[24].setRotationPoint(-99F, -34F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 46, 23, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F); // Box 5
		bodyModel[25].setRotationPoint(-99F, -33F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 23, 8, 18, 0F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, -6F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -2F); // Box 6
		bodyModel[26].setRotationPoint(-152F, -34F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 23, 5, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -5F); // Box 7
		bodyModel[27].setRotationPoint(-152F, -20F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 23, 10, 18, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 8
		bodyModel[28].setRotationPoint(-152F, -30F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 6, 14, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bodyModel[29].setRotationPoint(-162F, -26F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, -1F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, -2F); // Box 10
		bodyModel[30].setRotationPoint(-162F, -30F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 4, 14, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -5F); // Box 11
		bodyModel[31].setRotationPoint(-162F, -20F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 9, 10, 0F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -3F); // Box 12
		bodyModel[32].setRotationPoint(-173F, -28F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 13
		bodyModel[33].setRotationPoint(-173F, -23F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -4F); // Box 14
		bodyModel[34].setRotationPoint(-173F, -20F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 16
		bodyModel[35].setRotationPoint(-176F, -23F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 17
		bodyModel[36].setRotationPoint(-176F, -25F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1F); // Box 18
		bodyModel[37].setRotationPoint(-176F, -20F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 19
		bodyModel[38].setRotationPoint(-190F, -22.5F, -1F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 17, 14, 0F); // Box 13
		bodyModel[39].setRotationPoint(-112F, -34F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 150, 7, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[40].setRotationPoint(-53F, -17F, -24F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[41].setRotationPoint(-93F, -34F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[42].setRotationPoint(-93F, -34F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[43].setRotationPoint(-93F, -17F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F); // Box 18
		bodyModel[44].setRotationPoint(-86F, -43F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 19
		bodyModel[45].setRotationPoint(-86F, -43F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[46].setRotationPoint(-86F, -44F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[47].setRotationPoint(-86F, -44F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[48].setRotationPoint(-89F, -45F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[49].setRotationPoint(-98F, -45F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 24
		bodyModel[50].setRotationPoint(-98F, -44F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[51].setRotationPoint(-98F, -44F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[52].setRotationPoint(-95F, -45F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[53].setRotationPoint(-95F, -45F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[54].setRotationPoint(-84F, -38F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[55].setRotationPoint(-84F, -38F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[56].setRotationPoint(-110F, -44F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F); // Box 31
		bodyModel[57].setRotationPoint(-110F, -44F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[58].setRotationPoint(-110F, -45F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[59].setRotationPoint(-110F, -45F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 34
		bodyModel[60].setRotationPoint(-129F, -38F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F, -1F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[61].setRotationPoint(-122F, -45F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -6F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[62].setRotationPoint(-122F, -45F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[63].setRotationPoint(-110F, -45F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[64].setRotationPoint(-108F, -38F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[65].setRotationPoint(-108F, -38F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[66].setRotationPoint(-122F, -38F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 41
		bodyModel[67].setRotationPoint(-122F, -38F, 4F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 21, 10, 0F); // Box 42
		bodyModel[68].setRotationPoint(-89F, -40F, -5F);

		bodyModel[69].addBox(0F, 0F, 0F, 12, 2, 10, 0F); // Box 43
		bodyModel[69].setRotationPoint(-99F, -19F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 17, 14, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[70].setRotationPoint(-109F, -34F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[71].setRotationPoint(-109F, -37F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[72].setRotationPoint(-106F, -38F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[73].setRotationPoint(-108F, -38F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[74].setRotationPoint(-106F, -41F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[75].setRotationPoint(-106F, -41F, 2F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 51
		bodyModel[76].setRotationPoint(-90F, -39F, -4F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 52
		bodyModel[77].setRotationPoint(-103.5F, -25F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[78].setRotationPoint(-104F, -20F, -1.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[79].setRotationPoint(-106F, -22F, 4.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 22, 10, 11, 0F); // Box 10
		bodyModel[80].setRotationPoint(97F, -30F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 58, 47, 7, 0F, -57F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 11
		bodyModel[81].setRotationPoint(55F, -76F, 20F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 58, 47, 7, 0F, -57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -57F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[82].setRotationPoint(55F, -76F, -27F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[83].setRotationPoint(-33.5F, -50.5F, -0.5F);
		bodyModel[83].rotateAngleZ = -0.15707963F;

		bodyModel[84].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 16
		bodyModel[84].setRotationPoint(-51.5F, -37F, 16F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 17
		bodyModel[85].setRotationPoint(-51.5F, -37F, -18F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[86].setRotationPoint(-134F, -35F, -4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[87].setRotationPoint(-135F, -34.5F, -4.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[88].setRotationPoint(-136F, -34F, -4.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[89].setRotationPoint(-137F, -33.5F, -4.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 22
		bodyModel[90].setRotationPoint(-134F, -34F, 3F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 23
		bodyModel[91].setRotationPoint(-138F, -35F, 3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[92].setRotationPoint(-85F, -34F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 22, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[93].setRotationPoint(-85F, -34F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 21, 10, 0F); // Box 11
		bodyModel[94].setRotationPoint(-77F, -40F, -5F);

		bodyModel[95].addBox(0F, 0F, 0F, 11, 2, 10, 0F); // Box 12
		bodyModel[95].setRotationPoint(-86F, -19F, -5F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 13
		bodyModel[96].setRotationPoint(-78F, -39F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 64
		bodyModel[97].setRotationPoint(115F, -40F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F); // Box 65
		bodyModel[98].setRotationPoint(115F, -37F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 46, 3, 17, 0F, 0F, -3F, -10F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[99].setRotationPoint(-99F, -37F, -24F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 46, 3, 17, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -3F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 67
		bodyModel[100].setRotationPoint(-99F, -37F, 7F);


		tailModel = new ModelRendererTurbo[26];
		tailModel[0] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 22
		tailModel[1] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 23
		tailModel[2] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 24
		tailModel[3] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 25
		tailModel[4] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 26
		tailModel[5] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 27
		tailModel[6] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 3
		tailModel[7] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 4
		tailModel[8] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 5
		tailModel[9] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 6
		tailModel[10] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Box 7
		tailModel[11] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 8
		tailModel[12] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 9
		tailModel[13] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 10
		tailModel[14] = new ModelRendererTurbo(this, 681, 137, textureX, textureY); // Box 11
		tailModel[15] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 12
		tailModel[16] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 1
		tailModel[17] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 2
		tailModel[18] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 3
		tailModel[19] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 4
		tailModel[20] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 6
		tailModel[21] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 7
		tailModel[22] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 8
		tailModel[23] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 9
		tailModel[24] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 12
		tailModel[25] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 13

		tailModel[0].addShapeBox(0F, 0F, 0F, 20, 7, 18, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		tailModel[0].setRotationPoint(111F, -34F, -21F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 20, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 23
		tailModel[1].setRotationPoint(111F, -20F, -21F);

		tailModel[2].addBox(0F, 0F, 0F, 20, 7, 18, 0F); // Box 24
		tailModel[2].setRotationPoint(111F, -27F, -21F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 20, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 25
		tailModel[3].setRotationPoint(111F, -20F, 4F);

		tailModel[4].addBox(0F, 0F, 0F, 20, 7, 18, 0F); // Box 26
		tailModel[4].setRotationPoint(111F, -27F, 4F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 20, 7, 18, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[5].setRotationPoint(111F, -34F, 4F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F); // Box 3
		tailModel[6].setRotationPoint(97F, -36F, 3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		tailModel[7].setRotationPoint(97F, -29F, 3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F); // Box 5
		tailModel[8].setRotationPoint(97F, -18F, 3F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		tailModel[9].setRotationPoint(97F, -27F, 3F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 14, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F); // Box 7
		tailModel[10].setRotationPoint(97F, -20F, 3F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F); // Box 8
		tailModel[11].setRotationPoint(97F, -36F, -22F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		tailModel[12].setRotationPoint(97F, -29F, -22F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 10
		tailModel[13].setRotationPoint(97F, -27F, -22F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 14, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F); // Box 11
		tailModel[14].setRotationPoint(97F, -20F, -22F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -5F); // Box 12
		tailModel[15].setRotationPoint(97F, -18F, -22F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 58, 2, 42, 0F, -47F, -1F, 0F, 0F, -1F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -47F, 0F, 0F, 0F, 0F, 0F, -18F, -1F, 0F, 0F, -1F, 0F); // Box 1
		tailModel[16].setRotationPoint(76F, -21F, -63F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 58, 2, 42, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, -1F, 0F, -47F, -1F, 0F, 0F, -1F, 0F, -18F, -1F, 0F, 0F, 0F, 0F, -47F, 0F, 0F); // Box 2
		tailModel[17].setRotationPoint(76F, -21F, 22F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 34, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3
		tailModel[18].setRotationPoint(97F, -31F, -6F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 34, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		tailModel[19].setRotationPoint(97F, -31F, 1F);

		tailModel[20].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 6
		tailModel[20].setRotationPoint(97F, -31F, 0F);

		tailModel[21].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 7
		tailModel[21].setRotationPoint(97F, -21F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 34, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[22].setRotationPoint(97F, -21F, 1F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 34, 2, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		tailModel[23].setRotationPoint(97F, -21F, -6F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 47, 7, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -5F); // Box 12
		tailModel[24].setRotationPoint(113F, -76F, 20F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 10, 47, 7, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 13
		tailModel[25].setRotationPoint(113F, -76F, -27F);


		leftWingModel = new ModelRendererTurbo[7];
		leftWingModel[0] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 55
		leftWingModel[1] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 24
		leftWingModel[2] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 28
		leftWingModel[3] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 0
		leftWingModel[4] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 1
		leftWingModel[5] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 2
		leftWingModel[6] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 3

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 93, 13, 75, 0F, -65F, -12F, 0F, 0F, -12F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, -65F, 0F, 0F, 0F, 0F, 0F, -31F, -12F, 0F, 0F, -12F, 0F); // Box 55
		leftWingModel[0].setRotationPoint(-16F, -34F, -99F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 38, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingModel[1].setRotationPoint(-4F, -23F, -50.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 34, 6, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftWingModel[2].setRotationPoint(-4F, -29F, -49.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 38, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		leftWingModel[3].setRotationPoint(-4F, -21F, -50.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		leftWingModel[4].setRotationPoint(-14F, -23F, -50.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 2
		leftWingModel[5].setRotationPoint(-14F, -21F, -50.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 3
		leftWingModel[6].setRotationPoint(-6F, -21.5F, -52.5F);


		rightWingModel = new ModelRendererTurbo[7];
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 0
		rightWingModel[1] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Box 33
		rightWingModel[2] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 4
		rightWingModel[3] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 5
		rightWingModel[4] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 6
		rightWingModel[5] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Box 7
		rightWingModel[6] = new ModelRendererTurbo(this, 745, 233, textureX, textureY); // Box 8

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 93, 13, 75, 0F, 0F, 0F, 0F, -31F, 0F, 0F, 0F, -12F, 0F, -65F, -12F, 0F, 0F, -12F, 0F, -31F, -12F, 0F, 0F, 0F, 0F, -65F, 0F, 0F); // Box 0
		rightWingModel[0].setRotationPoint(-16F, -34F, 24F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 34, 6, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[1].setRotationPoint(-4F, -29F, 47.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
		rightWingModel[2].setRotationPoint(-14F, -23F, 46.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 5
		rightWingModel[3].setRotationPoint(-14F, -21F, 46.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		rightWingModel[4].setRotationPoint(-6F, -21.5F, 44.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 38, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		rightWingModel[5].setRotationPoint(-4F, -21F, 46.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 38, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightWingModel[6].setRotationPoint(-4F, -23F, 46.5F);


		bodyWheelModel = new ModelRendererTurbo[39];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 34
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 35
		bodyWheelModel[2] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 36
		bodyWheelModel[3] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 39
		bodyWheelModel[4] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 40
		bodyWheelModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 42
		bodyWheelModel[6] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 44
		bodyWheelModel[7] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 45
		bodyWheelModel[8] = new ModelRendererTurbo(this, 841, 89, textureX, textureY); // Box 46
		bodyWheelModel[9] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 47
		bodyWheelModel[10] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 14
		bodyWheelModel[11] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 15
		bodyWheelModel[12] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Box 37
		bodyWheelModel[13] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 38
		bodyWheelModel[14] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Box 39
		bodyWheelModel[15] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 40
		bodyWheelModel[16] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 41
		bodyWheelModel[17] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 42
		bodyWheelModel[18] = new ModelRendererTurbo(this, 681, 161, textureX, textureY); // Box 43
		bodyWheelModel[19] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 44
		bodyWheelModel[20] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 45
		bodyWheelModel[21] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 46
		bodyWheelModel[22] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 47
		bodyWheelModel[23] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 48
		bodyWheelModel[24] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 49
		bodyWheelModel[25] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 50
		bodyWheelModel[26] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 51
		bodyWheelModel[27] = new ModelRendererTurbo(this, 993, 185, textureX, textureY); // Box 52
		bodyWheelModel[28] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 53
		bodyWheelModel[29] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 54
		bodyWheelModel[30] = new ModelRendererTurbo(this, 985, 193, textureX, textureY); // Box 55
		bodyWheelModel[31] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 56
		bodyWheelModel[32] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 57
		bodyWheelModel[33] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 58
		bodyWheelModel[34] = new ModelRendererTurbo(this, 1001, 201, textureX, textureY); // Box 59
		bodyWheelModel[35] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 60
		bodyWheelModel[36] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Box 61
		bodyWheelModel[37] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 62
		bodyWheelModel[38] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 63

		bodyWheelModel[0].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Box 34
		bodyWheelModel[0].setRotationPoint(-106F, -14F, -4F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 35
		bodyWheelModel[1].setRotationPoint(-105F, -6F, -2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyWheelModel[2].setRotationPoint(-105F, -1F, -1F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Box 39
		bodyWheelModel[3].setRotationPoint(19F, -13F, 15F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 40
		bodyWheelModel[4].setRotationPoint(20F, -5F, 17F);

		bodyWheelModel[5].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // Box 42
		bodyWheelModel[5].setRotationPoint(20F, 0F, 18F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 4, 8, 8, 0F); // Box 44
		bodyWheelModel[6].setRotationPoint(19F, -13F, -23F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 45
		bodyWheelModel[7].setRotationPoint(20F, -5F, -21F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyWheelModel[8].setRotationPoint(13F, 1F, -22F);

		bodyWheelModel[9].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // Box 47
		bodyWheelModel[9].setRotationPoint(20F, 0F, -20F);

		bodyWheelModel[10].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 14
		bodyWheelModel[10].setRotationPoint(13F, 4F, -22F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		bodyWheelModel[11].setRotationPoint(13F, 7F, -22F);

		bodyWheelModel[12].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 37
		bodyWheelModel[12].setRotationPoint(23F, 4F, -22F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 38
		bodyWheelModel[13].setRotationPoint(23F, 7F, -22F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyWheelModel[14].setRotationPoint(23F, 1F, -22F);

		bodyWheelModel[15].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 40
		bodyWheelModel[15].setRotationPoint(23F, 4F, -18F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 41
		bodyWheelModel[16].setRotationPoint(23F, 7F, -18F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyWheelModel[17].setRotationPoint(23F, 1F, -18F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyWheelModel[18].setRotationPoint(13F, 1F, -18F);

		bodyWheelModel[19].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 44
		bodyWheelModel[19].setRotationPoint(13F, 4F, -18F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 45
		bodyWheelModel[20].setRotationPoint(13F, 7F, -18F);

		bodyWheelModel[21].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 46
		bodyWheelModel[21].setRotationPoint(23F, 4F, 16F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 47
		bodyWheelModel[22].setRotationPoint(23F, 7F, 16F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyWheelModel[23].setRotationPoint(23F, 1F, 16F);

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyWheelModel[24].setRotationPoint(13F, 1F, 16F);

		bodyWheelModel[25].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 50
		bodyWheelModel[25].setRotationPoint(13F, 4F, 16F);

		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 51
		bodyWheelModel[26].setRotationPoint(13F, 7F, 16F);

		bodyWheelModel[27].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 52
		bodyWheelModel[27].setRotationPoint(23F, 4F, 20F);

		bodyWheelModel[28].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 53
		bodyWheelModel[28].setRotationPoint(23F, 7F, 20F);

		bodyWheelModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyWheelModel[29].setRotationPoint(23F, 1F, 20F);

		bodyWheelModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyWheelModel[30].setRotationPoint(13F, 1F, 20F);

		bodyWheelModel[31].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 56
		bodyWheelModel[31].setRotationPoint(13F, 4F, 20F);

		bodyWheelModel[32].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 57
		bodyWheelModel[32].setRotationPoint(13F, 7F, 20F);

		bodyWheelModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyWheelModel[33].setRotationPoint(-107F, 1F, -3F);

		bodyWheelModel[34].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 59
		bodyWheelModel[34].setRotationPoint(-107F, 4F, -3F);

		bodyWheelModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 60
		bodyWheelModel[35].setRotationPoint(-107F, 7F, -3F);

		bodyWheelModel[36].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 61
		bodyWheelModel[36].setRotationPoint(-107F, 7F, 1F);

		bodyWheelModel[37].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 62
		bodyWheelModel[37].setRotationPoint(-107F, 4F, 1F);

		bodyWheelModel[38].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyWheelModel[38].setRotationPoint(-107F, 1F, 1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}