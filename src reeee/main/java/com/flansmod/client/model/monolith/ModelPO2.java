//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPO2 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPO2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];
		bodyModel[0] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 48
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 50
		bodyModel[27] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 51
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 52
		bodyModel[29] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 53
		bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 54
		bodyModel[31] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 17
		bodyModel[32] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 18
		bodyModel[33] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 19
		bodyModel[34] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 20
		bodyModel[35] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 21
		bodyModel[36] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 22
		bodyModel[37] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 23
		bodyModel[38] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 24
		bodyModel[39] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 25
		bodyModel[40] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 26
		bodyModel[41] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 27
		bodyModel[42] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 28
		bodyModel[43] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 29
		bodyModel[44] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 30
		bodyModel[45] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 31
		bodyModel[46] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 32
		bodyModel[47] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 39
		bodyModel[48] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 40
		bodyModel[49] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 41
		bodyModel[50] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 42
		bodyModel[51] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 43
		bodyModel[52] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 44
		bodyModel[53] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 45
		bodyModel[54] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 46
		bodyModel[55] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 1
		bodyModel[57] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 2

		bodyModel[0].addBox(0F, 0F, 0F, 31, 2, 48, 0F); // Box 15
		bodyModel[0].setRotationPoint(-16F, -42F, -62F);

		bodyModel[1].addBox(0F, 0F, 0F, 31, 2, 48, 0F); // Box 16
		bodyModel[1].setRotationPoint(-16F, -42F, 14F);

		bodyModel[2].addBox(0F, 0F, 0F, 28, 2, 28, 0F); // Box 18
		bodyModel[2].setRotationPoint(-16F, -42F, -14F);

		bodyModel[3].addBox(0F, 0F, 0F, 47, 6, 14, 0F); // Box 19
		bodyModel[3].setRotationPoint(-16F, -14F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 16, 10, 14, 0F); // Box 20
		bodyModel[4].setRotationPoint(-16F, -24F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 10, 14, 0F); // Box 21
		bodyModel[5].setRotationPoint(10F, -24F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 10, 14, 0F); // Box 22
		bodyModel[6].setRotationPoint(25F, -24F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 24
		bodyModel[7].setRotationPoint(0F, -24F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 25
		bodyModel[8].setRotationPoint(0F, -24F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 26
		bodyModel[9].setRotationPoint(15F, -24F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 27
		bodyModel[10].setRotationPoint(15F, -24F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 4, 6, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[11].setRotationPoint(-16F, -28F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[12].setRotationPoint(10F, -28F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[13].setRotationPoint(10F, -28F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[14].setRotationPoint(-16F, -28F, 1F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 4, 2, 0F); // Box 33
		bodyModel[15].setRotationPoint(-16F, -28F, -1F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 34
		bodyModel[16].setRotationPoint(10F, -28F, -1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 77, 4, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[17].setRotationPoint(24F, -28F, -1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 16, 7, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 38
		bodyModel[18].setRotationPoint(-27F, -24F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 16, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F); // Box 39
		bodyModel[19].setRotationPoint(-27F, -24F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[20].setRotationPoint(-27F, -28F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[21].setRotationPoint(-27F, -28F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 43
		bodyModel[22].setRotationPoint(-27F, -28F, 1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 6, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[23].setRotationPoint(-9F, -2F, -17F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 28, 0F); // Box 48
		bodyModel[24].setRotationPoint(-4F, 3F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 11F, 0F, -6F, -11F, 0F, -6F, -11F, 0F, 6F, 11F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[25].setRotationPoint(-5F, -8F, -13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 11F, 0F, 6F, -11F, 0F, 6F, -11F, 0F, -6F, 11F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[26].setRotationPoint(-5F, -8F, 12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, -1F, 0F, -6F, 1F, 0F, -6F, 1F, 0F, 6F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[27].setRotationPoint(-3F, -8F, -13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, -1F, 0F, 6F, 1F, 0F, 6F, 1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[28].setRotationPoint(-3F, -8F, 12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 2F, -1F, -5F, 3F, -1F, -5F, 3F, -1F, 7F, 2F, -1F, 7F, 3F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 3F, 3F, 0F, 3F); // Box 53
		bodyModel[29].setRotationPoint(-3F, -8F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 2F, -1F, 7F, 3F, -1F, 7F, 3F, -1F, -5F, 2F, -1F, -5F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -2F, 3F, 0F, -2F); // Box 54
		bodyModel[30].setRotationPoint(-3F, -8F, 12F);

		bodyModel[31].addFlexTrapezoid(0F, 0F, 0F, 4, 11, 4, 0F, -2.00F, -2.00F, 0.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_FRONT); // Box 17
		bodyModel[31].setRotationPoint(-31F, -24F, -4F);

		bodyModel[32].addFlexTrapezoid(0F, 0F, 0F, 4, 11, 4, 0F, -2.00F, -2.00F, 0.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_BACK); // Box 18
		bodyModel[32].setRotationPoint(-31F, -24F, 0F);

		bodyModel[33].addFlexTrapezoid(0F, 0F, 0F, 7, 7, 3, 0F, -2.00F, -2.00F, 0.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_FRONT); // Box 19
		bodyModel[33].setRotationPoint(-38F, -22F, -3F);

		bodyModel[34].addFlexTrapezoid(0F, 0F, 0F, 7, 7, 3, 0F, -2.00F, -2.00F, 0.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_BACK); // Box 20
		bodyModel[34].setRotationPoint(-38F, -22F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 21
		bodyModel[35].setRotationPoint(-36F, -24F, -1F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 22
		bodyModel[36].setRotationPoint(-36.5F, -27F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 23
		bodyModel[37].setRotationPoint(-36F, -20F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 24
		bodyModel[38].setRotationPoint(-36F, -20F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 25
		bodyModel[39].setRotationPoint(-36.5F, -25F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 3F, -2F, 0F, 3F, -2F); // Box 26
		bodyModel[40].setRotationPoint(-36.5F, -25F, 5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[41].setRotationPoint(-36F, -16F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 28
		bodyModel[42].setRotationPoint(-36.5F, -13F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 29
		bodyModel[43].setRotationPoint(-36.5F, -13F, 3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 30
		bodyModel[44].setRotationPoint(-36F, -16F, 1F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 31
		bodyModel[45].setRotationPoint(-1F, -32F, -5F);
		bodyModel[45].rotateAngleZ = -0.48869219F;

		bodyModel[46].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 32
		bodyModel[46].setRotationPoint(15F, -32F, -5F);
		bodyModel[46].rotateAngleZ = -0.48869219F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -6F, 0F, 9F, 6F, 0F, 9F, 6F, 0F, -9F, -6F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[47].setRotationPoint(-16F, -40F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -6F, 0F, -9F, 6F, 0F, -9F, 6F, 0F, 9F, -6F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[48].setRotationPoint(-16F, -40F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -6F, 0F, 9F, 6F, 0F, 9F, 6F, 0F, -9F, -6F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[49].setRotationPoint(0F, -40F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -6F, 0F, -9F, 6F, 0F, -9F, 6F, 0F, 9F, -6F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[50].setRotationPoint(0F, -40F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 8F, 0F, 9F, -8F, 0F, 9F, -8F, 0F, -9F, 8F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[51].setRotationPoint(-1F, -40F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, 9F, 8F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[52].setRotationPoint(-1F, -40F, 7F);

		bodyModel[53].addFlexTrapezoid(0F, 0F, 0F, 3, 4, 2, 0F, -2.00F, -2.00F, 0.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_FRONT); // Box 45
		bodyModel[53].setRotationPoint(-41F, -21F, -2F);

		bodyModel[54].addFlexTrapezoid(0F, 0F, 0F, 3, 4, 2, 0F, -2.00F, -2.00F, 0.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_BACK); // Box 46
		bodyModel[54].setRotationPoint(-41F, -21F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 11, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-9F, 4F, -17F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 6, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[56].setRotationPoint(-9F, -2F, 14F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 11, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[57].setRotationPoint(-9F, 4F, 14F);



		
		propellerModels = new ModelRendererTurbo[1][2]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); //Propeller 0 - Blade 1	
        propellerModels[0][0].addBox(0F, 0F, -1F, 1, 21, 2, 0F);		//Propeller Blades
        propellerModels[0][1].addBox(0F, 0F, -1F, 1, 21, 2, 0F);		//They will all be the same		
        propellerModels[0][0].setRotationPoint(-40F, -19F, 0F);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-40F, -19F, 0F);
      


		tailModel = new ModelRendererTurbo[10];
		tailModel[0] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 23
		tailModel[1] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 35
		tailModel[2] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 36
		tailModel[3] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 0
		tailModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 5
		tailModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 6
		tailModel[6] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 7
		tailModel[7] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 8
		tailModel[8] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 9
		tailModel[9] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 10

		tailModel[0].addShapeBox(0F, 0F, 0F, 70, 16, 14, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, 0F); // Box 23
		tailModel[0].setRotationPoint(31F, -24F, -7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 77, 4, 6, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[1].setRotationPoint(24F, -28F, -7F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 77, 4, 6, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 36
		tailModel[2].setRotationPoint(24F, -28F, 1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 20, 21, 1, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 0
		tailModel[3].setRotationPoint(84F, -37F, -0.5F);

		tailModel[4].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 5
		tailModel[4].setRotationPoint(90F, -15F, -0.5F);
		tailModel[4].rotateAngleZ = 0.73303829F;

		tailModel[5].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 6
		tailModel[5].setRotationPoint(94F, -10F, -1F);
		tailModel[5].rotateAngleZ = 0.73303829F;

		tailModel[6].addBox(0F, 0F, 0F, 14, 1, 29, 0F); // Box 7
		tailModel[6].setRotationPoint(89F, -26F, -30F);

		tailModel[7].addBox(0F, 0F, 0F, 14, 1, 29, 0F); // Box 8
		tailModel[7].setRotationPoint(89F, -26F, 1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tailModel[8].setRotationPoint(89F, -26F, -46F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F); // Box 10
		tailModel[9].setRotationPoint(89F, -26F, 30F);


		leftWingModel = new ModelRendererTurbo[10];
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		leftWingModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3
		leftWingModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		leftWingModel[3] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 7
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 9
		leftWingModel[5] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 11
		leftWingModel[6] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 13
		leftWingModel[7] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 33
		leftWingModel[8] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 35
		leftWingModel[9] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 37

		leftWingModel[0].addBox(0F, 0F, 0F, 31, 2, 48, 0F); // Box 0
		leftWingModel[0].setRotationPoint(2F, -10F, -55F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 3
		leftWingModel[1].setRotationPoint(2F, -11F, -78F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftWingModel[2].setRotationPoint(2F, -11F, -101F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 46, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -17F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		leftWingModel[3].setRotationPoint(24F, -11F, -101F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftWingModel[4].setRotationPoint(-16F, -43F, -108F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 46, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -17F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[5].setRotationPoint(6F, -43F, -108F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 13
		leftWingModel[6].setRotationPoint(-16F, -43F, -85F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -10F, 16F, 0F, -10F, 16F, 0F, 10F, -16F, 0F, 10F); // Box 33
		leftWingModel[7].setRotationPoint(-9F, -41F, -72F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -10F, 16F, 0F, -10F, 16F, 0F, 10F, -16F, 0F, 10F); // Box 35
		leftWingModel[8].setRotationPoint(6F, -41F, -72F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F, -16F, 0F, -10F, 16F, 0F, -10F, 16F, 0F, 10F, -16F, 0F, 10F); // Box 37
		leftWingModel[9].setRotationPoint(-9F, -41F, -72F);


		rightWingModel = new ModelRendererTurbo[10];
		rightWingModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		rightWingModel[1] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 6
		rightWingModel[2] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 8
		rightWingModel[3] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 10
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 12
		rightWingModel[5] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 14
		rightWingModel[6] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 17
		rightWingModel[7] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 34
		rightWingModel[8] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 36
		rightWingModel[9] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 38

		rightWingModel[0].addBox(0F, 0F, 0F, 31, 2, 48, 0F); // Box 2
		rightWingModel[0].setRotationPoint(2F, -10F, 7F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F); // Box 6
		rightWingModel[1].setRotationPoint(2F, -11F, 78F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 46, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -17F, 0F, -1F, 0F); // Box 8
		rightWingModel[2].setRotationPoint(24F, -11F, 55F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F); // Box 10
		rightWingModel[3].setRotationPoint(-16F, -43F, 85F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 46, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -17F, 0F, -1F, 0F); // Box 12
		rightWingModel[4].setRotationPoint(6F, -43F, 62F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightWingModel[5].setRotationPoint(2F, -11F, 55F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 22, 2, 23, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightWingModel[6].setRotationPoint(-16F, -43F, 62F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 10F, 16F, 0F, 10F, 16F, 0F, -10F, -16F, 0F, -10F); // Box 34
		rightWingModel[7].setRotationPoint(-9F, -41F, 71F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 10F, 16F, 0F, 10F, 16F, 0F, -10F, -16F, 0F, -10F); // Box 36
		rightWingModel[8].setRotationPoint(6F, -41F, 71F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F, -16F, 0F, 10F, 16F, 0F, 10F, 16F, 0F, -10F, -16F, 0F, -10F); // Box 38
		rightWingModel[9].setRotationPoint(-9F, -41F, 71F);


		yawFlapModel = new ModelRendererTurbo[4];
		yawFlapModel[0] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 1
		yawFlapModel[1] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 2
		yawFlapModel[2] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 3
		yawFlapModel[3] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 4

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 20, 21, 1, 0F, -13F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -13F, 0F, 0F, -7F, -17F, 0F, 4F, -17F, 0F, 4F, -17F, 0F, -7F, -17F, 0F); // Box 1
		yawFlapModel[0].setRotationPoint(94F, -50F, -0.5F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 17, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F); // Box 2
		yawFlapModel[1].setRotationPoint(101F, -46F, -0.5F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 16, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		yawFlapModel[2].setRotationPoint(104F, -37F, -0.5F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 15, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F); // Box 4
		yawFlapModel[3].setRotationPoint(104F, -28F, -0.5F);


		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 11
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 13
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 15

		pitchFlapLeftModel[0].addBox(0F, 0F, 0F, 11, 1, 22, 0F); // Box 11
		pitchFlapLeftModel[0].setRotationPoint(103F, -26F, -30F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 16, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		pitchFlapLeftModel[1].setRotationPoint(103F, -26F, -46F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 15
		pitchFlapLeftModel[2].setRotationPoint(103F, -26F, -8F);


		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 12
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 14
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 16

		pitchFlapRightModel[0].addBox(0F, 0F, 0F, 11, 1, 22, 0F); // Box 12
		pitchFlapRightModel[0].setRotationPoint(103F, -26F, 8F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F); // Box 14
		pitchFlapRightModel[1].setRotationPoint(103F, -26F, 30F);

		pitchFlapRightModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		pitchFlapRightModel[2].setRotationPoint(103F, -26F, 1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}