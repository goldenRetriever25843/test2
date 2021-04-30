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

public class ModelEliteP90 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteP90() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[64];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 1
		gunModel[7] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 2
		gunModel[8] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 4
		gunModel[9] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 5
		gunModel[10] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 6
		gunModel[11] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 7
		gunModel[12] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 8
		gunModel[13] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 9
		gunModel[14] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 10
		gunModel[15] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 11
		gunModel[16] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 12
		gunModel[17] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 13
		gunModel[18] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 14
		gunModel[19] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 15
		gunModel[20] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 16
		gunModel[21] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 17
		gunModel[22] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 18
		gunModel[23] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 19
		gunModel[24] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 21
		gunModel[25] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 22
		gunModel[26] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 23
		gunModel[27] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 24
		gunModel[28] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 25
		gunModel[29] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 26
		gunModel[30] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 27
		gunModel[31] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 28
		gunModel[32] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 29
		gunModel[33] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 30
		gunModel[34] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 31
		gunModel[35] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 32
		gunModel[36] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 33
		gunModel[37] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 34
		gunModel[38] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 35
		gunModel[39] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 36
		gunModel[40] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 37
		gunModel[41] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 38
		gunModel[42] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 39
		gunModel[43] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 40
		gunModel[44] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 41
		gunModel[45] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 42
		gunModel[46] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 43
		gunModel[47] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 44
		gunModel[48] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 45
		gunModel[49] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 46
		gunModel[50] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Box 47
		gunModel[51] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 48
		gunModel[52] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 49
		gunModel[53] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 50
		gunModel[54] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 51
		gunModel[55] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 52
		gunModel[56] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 53
		gunModel[57] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 55
		gunModel[58] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 56
		gunModel[59] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 57
		gunModel[60] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 58
		gunModel[61] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Box 59
		gunModel[62] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 60
		gunModel[63] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 61

		gunModel[0].addBox(0F, 0F, 0F, 54, 27, 16, 0F); // Box 0
		gunModel[0].setRotationPoint(-106F, -26F, 1F);

		gunModel[1].addBox(0F, 0F, 0F, 63, 25, 18, 0F); // Box 1
		gunModel[1].setRotationPoint(-106F, -51F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 131, 15, 18, 0F); // Box 2
		gunModel[2].setRotationPoint(-43F, -41F, 0F);

		gunModel[3].addBox(0F, 0F, 0F, 15, 15, 18, 0F); // Box 4
		gunModel[3].setRotationPoint(76F, -54F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 15, 7, 18, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(76F, -61F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 69, 7, 18, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[5].setRotationPoint(20F, -68F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[6].setRotationPoint(16F, -68F, 18F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 21, 11, 2, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F); // Box 2
		gunModel[7].setRotationPoint(10F, -52F, 17F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[8].setRotationPoint(16F, -68F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 21, 11, 2, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[9].setRotationPoint(10F, -52F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[10].setRotationPoint(24F, -70F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[11].setRotationPoint(29F, -70F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[12].setRotationPoint(39F, -70F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[13].setRotationPoint(34F, -70F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[14].setRotationPoint(59F, -70F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[15].setRotationPoint(54F, -70F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[16].setRotationPoint(49F, -70F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[17].setRotationPoint(44F, -70F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[18].setRotationPoint(69F, -70F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[19].setRotationPoint(64F, -70F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[20].setRotationPoint(79F, -70F, 0F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[21].setRotationPoint(74F, -70F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 45, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 18
		gunModel[22].setRotationPoint(31F, -61F, 1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 18, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[23].setRotationPoint(19F, -61F, 0F);

		gunModel[24].addBox(0F, 0F, 0F, 6, 10, 10, 0F); // Box 21
		gunModel[24].setRotationPoint(88F, -38F, 4F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 17, 12, 12, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[25].setRotationPoint(94F, -39F, 3F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 28, 33, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 23
		gunModel[26].setRotationPoint(-52F, -26F, 0F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 16, 12, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 24
		gunModel[27].setRotationPoint(-26F, -1F, 0F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 22, 12, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[28].setRotationPoint(-10F, -1F, 0F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 32, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[29].setRotationPoint(12F, -26F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 5, 27, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[30].setRotationPoint(19F, -26F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 22, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[31].setRotationPoint(24F, -26F, 0F);

		gunModel[32].addBox(0F, 0F, 0F, 3, 19, 18, 0F); // Box 29
		gunModel[32].setRotationPoint(26F, -26F, 0F);

		gunModel[33].addBox(0F, 0F, 0F, 13, 5, 18, 0F); // Box 30
		gunModel[33].setRotationPoint(29F, -12F, 0F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 8, 7, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 31
		gunModel[34].setRotationPoint(34F, -7F, 0F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 14, 10, 18, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[35].setRotationPoint(34F, 0F, 0F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 8, 18, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[36].setRotationPoint(48F, -8F, 0F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 6, 33, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[37].setRotationPoint(56F, -26F, 0F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 30, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[38].setRotationPoint(62F, -26F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 27, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[39].setRotationPoint(65F, -26F, 0F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 24, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[40].setRotationPoint(67F, -26F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 21, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[41].setRotationPoint(68F, -26F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 12, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[42].setRotationPoint(69F, -26F, 0F);

		gunModel[43].addBox(0F, 0F, 0F, 17, 9, 18, 0F); // Box 40
		gunModel[43].setRotationPoint(71F, -26F, 0F);

		gunModel[44].addBox(0F, 0F, 0F, 3, 11, 18, 0F); // Box 41
		gunModel[44].setRotationPoint(88F, -28F, 0F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 9, 10, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[45].setRotationPoint(82F, -17F, 0F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 43
		gunModel[46].setRotationPoint(79F, -17F, 0F);

		gunModel[47].addBox(0F, 0F, 0F, 6, 8, 18, 0F); // Box 44
		gunModel[47].setRotationPoint(42F, -8F, 0F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 4, 18, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[48].setRotationPoint(42F, -12F, 0F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[49].setRotationPoint(52F, -12F, 0F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 4, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 47
		gunModel[50].setRotationPoint(52F, -21F, 0F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 9, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 48
		gunModel[51].setRotationPoint(47F, -26F, 0F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[52].setRotationPoint(29F, -25F, 0F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 18, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[53].setRotationPoint(29F, -17F, 0F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[54].setRotationPoint(29F, -26F, 0F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 4, 18, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[55].setRotationPoint(-24F, -9F, 0F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 9, 4, 18, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[56].setRotationPoint(-24F, -5F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[57].setRotationPoint(-24F, -26F, 0F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 20, 5, 18, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[58].setRotationPoint(-8F, -6F, 0F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[59].setRotationPoint(5F, -12F, 0F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 9, 4, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 58
		gunModel[60].setRotationPoint(3F, -26F, 0F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 4, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 59
		gunModel[61].setRotationPoint(8F, -22F, 0F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 6, 28, 18, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		gunModel[62].setRotationPoint(-112F, -51F, 0F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 6, 24, 18, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 61
		gunModel[63].setRotationPoint(-112F, -23F, 0F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 3
		ammoModel[1] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 20

		ammoModel[0].addBox(0F, 0F, 0F, 115, 11, 16, 0F); // Box 3
		ammoModel[0].setRotationPoint(-39F, -52F, 1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 11, 16, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 20
		ammoModel[1].setRotationPoint(-43F, -52F, 1F);



		translateAll(0F, 0F, -8F);
		animationType = EnumAnimationType.P90;


		flipAll();
	}
}