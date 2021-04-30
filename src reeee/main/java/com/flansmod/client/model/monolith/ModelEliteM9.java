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

public class ModelEliteM9 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteM9() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[43];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 41
		gunModel[18] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 43
		gunModel[19] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 44
		gunModel[20] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 48
		gunModel[21] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 49
		gunModel[22] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 50
		gunModel[23] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 51
		gunModel[24] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 52
		gunModel[25] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 53
		gunModel[26] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 54
		gunModel[27] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 55
		gunModel[28] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 56
		gunModel[29] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 57
		gunModel[30] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 59
		gunModel[31] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 60
		gunModel[32] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 61
		gunModel[33] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 62
		gunModel[34] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 63
		gunModel[35] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 64
		gunModel[36] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 65
		gunModel[37] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 66
		gunModel[38] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 67
		gunModel[39] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 68
		gunModel[40] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 69
		gunModel[41] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 70
		gunModel[42] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 71

		gunModel[0].addShapeBox(0F, 0F, 0F, 42, 8, 17, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-66F, -69F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 22, 12, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-66F, -61F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 25, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-44F, -58F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 20, 27, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-44F, -53F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-44F, -61F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 20, 22, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-52F, -26F, 0F);

		gunModel[6].addBox(0F, 0F, 0F, 19, 3, 17, 0F); // Box 6
		gunModel[6].setRotationPoint(-63F, -49F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 26, 20, 17, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-70F, -46F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 25, 17, 17, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-77F, -26F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 26, 5, 17, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(-78F, -9F, 0F);

		gunModel[10].addBox(0F, 0F, 0F, 41, 4, 17, 0F); // Box 10
		gunModel[10].setRotationPoint(-78F, -4F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 26, 7, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(-78F, 0F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 16, 7, 17, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(-52F, 0F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 31, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F); // Box 13
		gunModel[13].setRotationPoint(-67F, 7F, 0F);

		gunModel[14].addBox(0F, 0F, 0F, 40, 1, 16, 0F); // Box 14
		gunModel[14].setRotationPoint(-64F, -70F, 0.5F);

		gunModel[15].addBox(0F, 0F, 0F, 45, 13, 16, 0F); // Box 15
		gunModel[15].setRotationPoint(-27F, -70F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 45, 13, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(18F, -70F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 11, 7, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 41
		gunModel[17].setRotationPoint(63F, -70F, 0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 11, 11, 0F, 50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F); // Box 43
		gunModel[18].setRotationPoint(74F, -85F, 3F);

		gunModel[19].addBox(0F, 0F, 0F, 29, 9, 14, 0F); // Box 44
		gunModel[19].setRotationPoint(-39F, -79F, 1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[20].setRotationPoint(-70F, -70F, 0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[21].setRotationPoint(-77F, -65F, 0.5F);

		gunModel[22].addBox(0F, 0F, 0F, 12, 2, 16, 0F); // Box 50
		gunModel[22].setRotationPoint(-77F, -63F, 0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		gunModel[23].setRotationPoint(-77F, -61F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 52
		gunModel[24].setRotationPoint(-72F, -59F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 53
		gunModel[25].setRotationPoint(-70F, -58F, 0.5F);

		gunModel[26].addBox(0F, 0F, 0F, 8, 9, 9, 0F); // Box 54
		gunModel[26].setRotationPoint(-75F, -72F, 3.5F);
		gunModel[26].rotateAngleZ = 0.83775804F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 15, 7, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F); // Box 55
		gunModel[27].setRotationPoint(4F, -57F, 2.5F);

		gunModel[28].addBox(0F, 0F, 0F, 4, 8, 12, 0F); // Box 56
		gunModel[28].setRotationPoint(10F, -50F, 2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[29].setRotationPoint(7F, -42F, 2.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 11, 6, 12, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[30].setRotationPoint(-1F, -39F, 2.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[31].setRotationPoint(-12F, -35F, 2.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[32].setRotationPoint(-30F, -45F, 2.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[33].setRotationPoint(-31F, -36F, 2.5F);

		gunModel[34].addBox(0F, 0F, 0F, 8, 2, 12, 0F); // Box 63
		gunModel[34].setRotationPoint(-31F, -38F, 2.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 64
		gunModel[35].setRotationPoint(-23F, -38F, 2.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[36].setRotationPoint(7F, -39F, 2.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[37].setRotationPoint(-18F, -57F, 0F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		gunModel[38].setRotationPoint(-18F, -52F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[39].setRotationPoint(-17.5F, -50F, 0F);

		gunModel[40].addBox(0F, 0F, 0F, 3, 4, 6, 0F); // Box 69
		gunModel[40].setRotationPoint(-17.5F, -48F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 70
		gunModel[41].setRotationPoint(-17.5F, -44F, 0F);

		gunModel[42].addBox(0F, 0F, 0F, 4, 4, 17, 0F); // Box 71
		gunModel[42].setRotationPoint(-74F, 7F, 0F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 25, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F); // Box 0
		ammoModel[0].setRotationPoint(-61F, -36F, 2F);
		ammoModel[0].rotateAngleZ = -0.12217305F;


		slideModel = new ModelRendererTurbo[27];
		slideModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 17
		slideModel[1] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 18
		slideModel[2] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 19
		slideModel[3] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 20
		slideModel[4] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 21
		slideModel[5] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 22
		slideModel[6] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 23
		slideModel[7] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 24
		slideModel[8] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 25
		slideModel[9] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 26
		slideModel[10] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 27
		slideModel[11] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 28
		slideModel[12] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 29
		slideModel[13] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 30
		slideModel[14] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 31
		slideModel[15] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 32
		slideModel[16] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 34
		slideModel[17] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 35
		slideModel[18] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 36
		slideModel[19] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 37
		slideModel[20] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 38
		slideModel[21] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 39
		slideModel[22] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 40
		slideModel[23] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 42
		slideModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		slideModel[25] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
		slideModel[26] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 47

		slideModel[0].addBox(0F, 0F, 0F, 55, 12, 16, 0F); // Box 17
		slideModel[0].setRotationPoint(8F, -82F, 0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 20, 9, 16, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		slideModel[1].setRotationPoint(-12F, -79F, 0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		slideModel[2].setRotationPoint(-14F, -79F, 0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		slideModel[3].setRotationPoint(-16F, -79F, 0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 21
		slideModel[4].setRotationPoint(-18F, -79F, 0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		slideModel[5].setRotationPoint(-24F, -79F, 0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 23
		slideModel[6].setRotationPoint(-20F, -79F, 0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 24
		slideModel[7].setRotationPoint(-22F, -79F, 0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 25
		slideModel[8].setRotationPoint(-32F, -79F, 0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 26
		slideModel[9].setRotationPoint(-28F, -79F, 0.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 27
		slideModel[10].setRotationPoint(-30F, -79F, 0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 28
		slideModel[11].setRotationPoint(-26F, -79F, 0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 29
		slideModel[12].setRotationPoint(-38F, -79F, 0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 30
		slideModel[13].setRotationPoint(-34F, -79F, 0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 31
		slideModel[14].setRotationPoint(-36F, -79F, 0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 4, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 32
		slideModel[15].setRotationPoint(-40F, -79F, 0.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 23, 9, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 34
		slideModel[16].setRotationPoint(-60F, -79F, 0.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 5, 9, 16, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		slideModel[17].setRotationPoint(-65F, -79F, 0.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 12, 9, 16, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		slideModel[18].setRotationPoint(-62F, -88F, 0.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 41, 9, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		slideModel[19].setRotationPoint(-50F, -88F, 0.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 18, 1, 16, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		slideModel[20].setRotationPoint(-10F, -80F, 0.5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 72, 7, 14, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		slideModel[21].setRotationPoint(-9F, -87F, 1.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 11, 7, 16, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		slideModel[22].setRotationPoint(63F, -88F, 0.5F);

		slideModel[23].addBox(0F, 0F, 0F, 11, 11, 16, 0F); // Box 42
		slideModel[23].setRotationPoint(63F, -81F, 0.5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		slideModel[24].setRotationPoint(-51F, -92F, 3.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		slideModel[25].setRotationPoint(-51F, -92F, 11.5F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		slideModel[26].setRotationPoint(65F, -92F, 7.5F);
		
		gunSlideDistance = 2.5F;
		animationType = EnumAnimationType.ALT_PISTOL_CLIP;



		translateAll(15F, 0F, -8F);


		flipAll();
	}
}