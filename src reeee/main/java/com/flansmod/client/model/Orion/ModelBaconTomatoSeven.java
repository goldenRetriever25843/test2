//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.Orion;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBaconTomatoSeven extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelBaconTomatoSeven()
	{
		bodyModel = new ModelRendererTurbo[54];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 78, 46, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 48, 92, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 74, 46, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 0, 132, textureX, textureY); // Box 30
		bodyModel[10] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 31
		bodyModel[11] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 32
		bodyModel[12] = new ModelRendererTurbo(this, 129, 19, textureX, textureY); // Box 33
		bodyModel[13] = new ModelRendererTurbo(this, 129, 19, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 122, 49, textureX, textureY); // Box 35
		bodyModel[15] = new ModelRendererTurbo(this, 130, 0, textureX, textureY); // Box 36
		bodyModel[16] = new ModelRendererTurbo(this, 130, 9, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 130, 0, textureX, textureY); // Box 38
		bodyModel[18] = new ModelRendererTurbo(this, 163, 9, textureX, textureY); // Box 39
		bodyModel[19] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 129, 19, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 129, 19, textureX, textureY); // Box 45
		bodyModel[25] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 46
		bodyModel[26] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 47
		bodyModel[27] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 48
		bodyModel[28] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 49
		bodyModel[29] = new ModelRendererTurbo(this, 0, 148, textureX, textureY); // Shape 57
		bodyModel[30] = new ModelRendererTurbo(this, 27, 138, textureX, textureY); // Box 58
		bodyModel[31] = new ModelRendererTurbo(this, 70, 138, textureX, textureY); // Box 59
		bodyModel[32] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 60
		bodyModel[33] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 61
		bodyModel[34] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 62
		bodyModel[35] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 53, 46, textureX, textureY); // Box 64
		bodyModel[37] = new ModelRendererTurbo(this, 53, 46, textureX, textureY); // Box 65
		bodyModel[38] = new ModelRendererTurbo(this, 77, 102, textureX, textureY); // Box 66
		bodyModel[39] = new ModelRendererTurbo(this, 14, 47, textureX, textureY); // Box 67
		bodyModel[40] = new ModelRendererTurbo(this, 14, 47, textureX, textureY); // Box 68
		bodyModel[41] = new ModelRendererTurbo(this, 28, 93, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 70
		bodyModel[43] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 71
		bodyModel[44] = new ModelRendererTurbo(this, 110, 102, textureX, textureY); // Box 72
		bodyModel[45] = new ModelRendererTurbo(this, 110, 102, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 52, 66, textureX, textureY); // Box 74
		bodyModel[47] = new ModelRendererTurbo(this, 110, 110, textureX, textureY); // Box 75
		bodyModel[48] = new ModelRendererTurbo(this, 110, 110, textureX, textureY); // Box 76
		bodyModel[49] = new ModelRendererTurbo(this, 52, 66, textureX, textureY); // Box 77
		bodyModel[50] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 99
		bodyModel[51] = new ModelRendererTurbo(this, 19, 60, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 19, 60, textureX, textureY); // Box 102

		bodyModel[0].addBox(0F, 0F, 0F, 52, 20, 26, 0F); // Box 10
		bodyModel[0].setRotationPoint(-46F, -15F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(6F, -15F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 20, 26, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-55F, -15F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 20, 20, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(19F, -15F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 15, 18, 0F,0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 14
		bodyModel[4].setRotationPoint(23F, -10F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 10, 12, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(31F, -5F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 53, 1, 5, 0F); // Box 27
		bodyModel[6].setRotationPoint(-47F, -10F, -18F);

		bodyModel[7].addBox(0F, 0F, -5F, 53, 1, 5, 0F); // Box 28
		bodyModel[7].setRotationPoint(-47F, -10F, 18F);

		bodyModel[8].addShapeBox(0F, 0F, -5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[8].setRotationPoint(-54F, -6F, 18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[9].setRotationPoint(-54F, -6F, -18F);

		bodyModel[10].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 31
		bodyModel[10].setRotationPoint(6F, -10F, -18F);

		bodyModel[11].addBox(0F, 0F, -8F, 12, 1, 8, 0F); // Box 32
		bodyModel[11].setRotationPoint(6F, -10F, 18F);

		bodyModel[12].addShapeBox(-2F, -2F, 0F, 4, 2, 28, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[12].setRotationPoint(31F, 0F, -14F);

		bodyModel[13].addShapeBox(-2F, 0F, 0F, 4, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[13].setRotationPoint(31F, 0F, -14F);

		bodyModel[14].addShapeBox(-13F, 0F, 0F, 13, 1, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 35
		bodyModel[14].setRotationPoint(31F, -2F, -11F);
		bodyModel[14].rotateAngleZ = -0.33161256F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.2F); // Box 36
		bodyModel[15].setRotationPoint(18F, -10F, -18F);
		bodyModel[15].rotateAngleZ = -0.10471976F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.6F, 0F, 0.5F, 0F, 0F, 0F); // Box 37
		bodyModel[16].setRotationPoint(18F, -9.5F, -11.25F);
		bodyModel[16].rotateAngleX = 0.2268928F;
		bodyModel[16].rotateAngleY = -0.19198622F;
		bodyModel[16].rotateAngleZ = -0.10471976F;

		bodyModel[17].addShapeBox(0F, 0F, -8F, 15, 1, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[17].setRotationPoint(18F, -10F, 18F);
		bodyModel[17].rotateAngleZ = -0.10471976F;

		bodyModel[18].addShapeBox(0F, 0F, -1F, 15, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 39
		bodyModel[18].setRotationPoint(18F, -9.5F, 11.25F);
		bodyModel[18].rotateAngleX = -0.2268928F;
		bodyModel[18].rotateAngleY = 0.19198622F;
		bodyModel[18].rotateAngleZ = -0.10471976F;

		bodyModel[19].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[19].setRotationPoint(18F, 2.5F, -13.5F);

		bodyModel[20].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[20].setRotationPoint(-1F, 2.5F, -13.5F);

		bodyModel[21].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[21].setRotationPoint(-19F, 2.5F, -13.5F);

		bodyModel[22].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[22].setRotationPoint(-35F, 2.5F, -13.5F);

		bodyModel[23].addShapeBox(-2F, -2F, 0F, 4, 2, 28, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[23].setRotationPoint(-49F, 1F, -14F);

		bodyModel[24].addShapeBox(-2F, 0F, 0F, 4, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[24].setRotationPoint(-49F, 1F, -14F);

		bodyModel[25].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[25].setRotationPoint(-35F, 4.5F, -13.5F);

		bodyModel[26].addShapeBox(-2F, 0F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[26].setRotationPoint(-19F, 2.5F, -13.5F);

		bodyModel[27].addShapeBox(-2F, 0F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[27].setRotationPoint(-1F, 2.5F, -13.5F);

		bodyModel[28].addShapeBox(-2F, 0F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		bodyModel[28].setRotationPoint(18F, 2.5F, -13.5F);

		bodyModel[29].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 57
		bodyModel[29].setRotationPoint(-24F, -15F, 0F);
		bodyModel[29].rotateAngleX = -1.57079633F;

		bodyModel[30].addBox(0F, 0F, 0F, 16, 1, 14, 0F); // Box 58
		bodyModel[30].setRotationPoint(-32F, -16F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[31].setRotationPoint(-43F, -17.5F, -10F);

		bodyModel[32].addBox(-10F, -1F, 0F, 10, 2, 2, 0F); // Box 60
		bodyModel[32].setRotationPoint(-42F, -16.25F, -7F);

		bodyModel[33].addBox(-10F, -1F, -2F, 10, 2, 2, 0F); // Box 61
		bodyModel[33].setRotationPoint(-42F, -16.25F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[34].setRotationPoint(-44F, -17.5F, -12.5F);

		bodyModel[35].addShapeBox(0F, 0F, -2F, 5, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[35].setRotationPoint(-44F, -17.5F, 12.5F);

		bodyModel[36].addShapeBox(-1F, -0.5F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 64
		bodyModel[36].setRotationPoint(-52.25F, -1F, -13F);
		bodyModel[36].rotateAngleZ = -0.82030475F;

		bodyModel[37].addShapeBox(-1F, -0.5F, -4F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 65
		bodyModel[37].setRotationPoint(-52.25F, -1F, 13F);
		bodyModel[37].rotateAngleZ = -0.82030475F;

		bodyModel[38].addBox(0F, 0F, 0F, 4, 2, 24, 0F); // Box 66
		bodyModel[38].setRotationPoint(-55F, -11F, -12F);
		bodyModel[38].rotateAngleZ = 0.61086524F;

		bodyModel[39].addShapeBox(0F, 0F, -0.25F, 1, 7, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		bodyModel[39].setRotationPoint(-48F, -17F, 13F);

		bodyModel[40].addShapeBox(0F, 0F, -0.25F, 1, 7, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 68
		bodyModel[40].setRotationPoint(-39F, -17F, 13F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 69
		bodyModel[41].setRotationPoint(-47F, -17F, 13.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.125F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.125F, 0F); // Box 70
		bodyModel[42].setRotationPoint(-38F, -17F, 13.25F);

		bodyModel[43].addShapeBox(-2F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.125F); // Box 71
		bodyModel[43].setRotationPoint(-48F, -17F, 13.25F);

		bodyModel[44].addBox(0F, 0F, 0F, 25, 3, 4, 0F); // Box 72
		bodyModel[44].setRotationPoint(-25F, -13F, -17.25F);

		bodyModel[45].addBox(0F, 0F, -4F, 25, 3, 4, 0F); // Box 73
		bodyModel[45].setRotationPoint(-25F, -13F, 17.25F);

		bodyModel[46].addBox(0F, 0F, 0F, 9, 2, 3, 0F); // Box 74
		bodyModel[46].setRotationPoint(-33F, -17F, -10.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 12, 2, 5, 0F); // Box 75
		bodyModel[47].setRotationPoint(-24F, -17F, -12.5F);

		bodyModel[48].addBox(0F, 0F, -5F, 12, 2, 5, 0F); // Box 76
		bodyModel[48].setRotationPoint(-24F, -17F, 12.5F);

		bodyModel[49].addBox(0F, 0F, -3F, 9, 2, 3, 0F); // Box 77
		bodyModel[49].setRotationPoint(-33F, -17F, 10.5F);

		bodyModel[50].addShapeBox(0F, -1.5F, -1.5F, 3, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 99
		bodyModel[50].setRotationPoint(26.5F, -7F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 100
		bodyModel[51].setRotationPoint(26F, -8F, -9.5F);

		bodyModel[52].addShapeBox(0F, -1.5F, -1.5F, 3, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 101
		bodyModel[52].setRotationPoint(26.5F, -7F, 9F);

		bodyModel[53].addBox(0F, 0F, -1F, 2, 5, 1, 0F); // Box 102
		bodyModel[53].setRotationPoint(26F, -8F, 9.5F);


		turretModel = new ModelRendererTurbo[14];
		turretModel[0] = new ModelRendererTurbo(this, 0, 163, textureX, textureY); // Box 16
		turretModel[1] = new ModelRendererTurbo(this, 37, 157, textureX, textureY); // Box 17
		turretModel[2] = new ModelRendererTurbo(this, 62, 163, textureX, textureY); // Box 18
		turretModel[3] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 19
		turretModel[4] = new ModelRendererTurbo(this, 51, 191, textureX, textureY); // Box 20
		turretModel[5] = new ModelRendererTurbo(this, 0, 163, textureX, textureY); // Box 78
		turretModel[6] = new ModelRendererTurbo(this, 0, 163, textureX, textureY); // Box 79
		turretModel[7] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 80
		turretModel[8] = new ModelRendererTurbo(this, 37, 164, textureX, textureY); // Box 103
		turretModel[9] = new ModelRendererTurbo(this, 0, 177, textureX, textureY); // Box 104
		turretModel[10] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Box 105
		turretModel[11] = new ModelRendererTurbo(this, 11, 177, textureX, textureY); // Box 106
		turretModel[12] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Box 107
		turretModel[13] = new ModelRendererTurbo(this, 0, 249, textureX, textureY); // Box 108

		turretModel[0].addShapeBox(0F, -12F, -12F, 6, 9, 24, 0F,0F, 0F, -0.75F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 16
		turretModel[0].setRotationPoint(0F, -15F, 0F);

		turretModel[1].addShapeBox(6F, -12F, -10F, 4, 9, 20, 0F,0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0.5F); // Box 17
		turretModel[1].setRotationPoint(0F, -15F, 0F);

		turretModel[2].addShapeBox(-7F, -3F, -12F, 7, 3, 24, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 18
		turretModel[2].setRotationPoint(0F, -15F, 0F);

		turretModel[3].addShapeBox(-12F, -3F, -10F, 5, 3, 20, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 19
		turretModel[3].setRotationPoint(0F, -15F, 0F);

		turretModel[4].addShapeBox(-19F, -12F, 0F, 19, 9, 24, 0F,-2F, -0.25F, -5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2F, -0.25F, -5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 20
		turretModel[4].setRotationPoint(0F, -15F, -12F);

		turretModel[5].addShapeBox(4.5F, -15.5F, -6.5F, 3, 4, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 78
		turretModel[5].setRotationPoint(0F, -15F, 0F);

		turretModel[6].addShapeBox(4.5F, -15.5F, 3.5F, 3, 4, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 79
		turretModel[6].setRotationPoint(0F, -15F, 0F);

		turretModel[7].addBox(4.5F, -13F, -2F, 4, 1, 4, 0F); // Box 80
		turretModel[7].setRotationPoint(0F, -15F, 0F);

		turretModel[8].addBox(-20F, -7F, -3F, 1, 6, 6, 0F); // Box 103
		turretModel[8].setRotationPoint(0F, -14F, 0F);
		turretModel[8].rotateAngleZ = -0.2268928F;

		turretModel[9].addBox(-22F, -8F, -0.5F, 4, 1, 1, 0F); // Box 104
		turretModel[9].setRotationPoint(0F, -14F, 0F);
		turretModel[9].rotateAngleZ = 0.01745329F;

		turretModel[10].addBox(-25F, -8F, -0.5F, 7, 1, 1, 0F); // Box 105
		turretModel[10].setRotationPoint(0F, -15.5F, 0F);
		turretModel[10].rotateAngleZ = 0.01745329F;

		turretModel[11].addShapeBox(-21.5F, -8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 106
		turretModel[11].setRotationPoint(0F, -15F, 0F);
		turretModel[11].rotateAngleZ = 0.01745329F;

		turretModel[12].addShapeBox(0F, -3F, -12F, 6, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 107
		turretModel[12].setRotationPoint(0F, -15F, 0F);

		turretModel[13].addShapeBox(6F, -3F, -10.5F, 6, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 108
		turretModel[13].setRotationPoint(0F, -15F, 0F);


		barrelModel = new ModelRendererTurbo[5];
		barrelModel[0] = new ModelRendererTurbo(this, 37, 226, textureX, textureY); // Box 22
		barrelModel[1] = new ModelRendererTurbo(this, 66, 226, textureX, textureY); // Box 23
		barrelModel[2] = new ModelRendererTurbo(this, 39, 249, textureX, textureY); // Box 24
		barrelModel[3] = new ModelRendererTurbo(this, 39, 256, textureX, textureY); // Box 25
		barrelModel[4] = new ModelRendererTurbo(this, 39, 263, textureX, textureY); // Box 26

		barrelModel[0].addShapeBox(0F, -4F, -5F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 22
		barrelModel[0].setRotationPoint(10F, -21F, 0F);

		barrelModel[1].addShapeBox(-4F, -4F, -5F, 4, 8, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 23
		barrelModel[1].setRotationPoint(10F, -21F, 0F);

		barrelModel[2].addBox(0F, -0.5F, -1.5F, 9, 3, 3, 0F); // Box 24
		barrelModel[2].setRotationPoint(10F, -22F, 0F);

		barrelModel[3].addShapeBox(9F, -0.5F, -1.5F, 9, 3, 3, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 25
		barrelModel[3].setRotationPoint(10F, -22F, 0F);

		barrelModel[4].addShapeBox(18F, -0.5F, -1.5F, 10, 3, 3, 0F,0F, -0.6F, -0.6F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.6F, -0.6F); // Box 26
		barrelModel[4].setRotationPoint(10F, -22F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[6];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 145, 110, textureX, textureY); // Shape 81
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 82
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 83
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 84
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 85
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 145, 110, textureX, textureY); // Shape 86

		leftTrackWheelModels[0].addShape3D(4.5F, -4.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 4, 9, 9, 32, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 81
		leftTrackWheelModels[0].setRotationPoint(31F, 0F, 14F);

		leftTrackWheelModels[1].addShape3D(7.5F, -7.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 82
		leftTrackWheelModels[1].setRotationPoint(18F, 2F, 13.5F);

		leftTrackWheelModels[2].addShape3D(7.5F, -7.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 83
		leftTrackWheelModels[2].setRotationPoint(-1F, 2F, 13.5F);

		leftTrackWheelModels[3].addShape3D(7.5F, -7.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 84
		leftTrackWheelModels[3].setRotationPoint(-19F, 2F, 13.5F);

		leftTrackWheelModels[4].addShape3D(7.5F, -7.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 85
		leftTrackWheelModels[4].setRotationPoint(-35F, 2F, 13.5F);

		leftTrackWheelModels[5].addShape3D(4.5F, -4.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 4, 9, 9, 32, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 86
		leftTrackWheelModels[5].setRotationPoint(-49F, 1F, 14F);


		rightTrackWheelModels = new ModelRendererTurbo[6];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 40
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 41
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 42
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 134, 125, textureX, textureY); // Shape 43
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 145, 110, textureX, textureY); // Shape 44
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 145, 110, textureX, textureY); // Shape 45

		rightTrackWheelModels[0].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 40
		rightTrackWheelModels[0].setRotationPoint(18F, 2F, -13.5F);

		rightTrackWheelModels[1].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 41
		rightTrackWheelModels[1].setRotationPoint(-1F, 2F, -13.5F);

		rightTrackWheelModels[2].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 42
		rightTrackWheelModels[2].setRotationPoint(-19F, 2F, -13.5F);

		rightTrackWheelModels[3].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10), new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0) }), 5, 15, 15, 52, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 43
		rightTrackWheelModels[3].setRotationPoint(-35F, 2F, -13.5F);

		rightTrackWheelModels[4].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 4, 9, 9, 32, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 44
		rightTrackWheelModels[4].setRotationPoint(31F, 0F, -14F);

		rightTrackWheelModels[5].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(6, 0, 6, 0), new Coord2D(9, 3, 9, 3), new Coord2D(9, 6, 9, 6), new Coord2D(6, 9, 6, 9), new Coord2D(3, 9, 3, 9), new Coord2D(0, 6, 0, 6), new Coord2D(0, 3, 0, 3) }), 4, 9, 9, 32, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,5 ,3 ,5 ,3 ,5 ,3}); // Shape 45
		rightTrackWheelModels[5].setRotationPoint(-49F, 1F, -14F);


		leftTrackModel = new ModelRendererTurbo[12];
		leftTrackModel[0] = new ModelRendererTurbo(this, 168, 19, textureX, textureY); // Box 87
		leftTrackModel[1] = new ModelRendererTurbo(this, 167, 27, textureX, textureY); // Box 88
		leftTrackModel[2] = new ModelRendererTurbo(this, 177, 31, textureX, textureY); // Box 89
		leftTrackModel[3] = new ModelRendererTurbo(this, 166, 39, textureX, textureY); // Box 90
		leftTrackModel[4] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Box 91
		leftTrackModel[5] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 92
		leftTrackModel[6] = new ModelRendererTurbo(this, 208, 38, textureX, textureY); // Box 93
		leftTrackModel[7] = new ModelRendererTurbo(this, 208, 27, textureX, textureY); // Box 94
		leftTrackModel[8] = new ModelRendererTurbo(this, 193, 24, textureX, textureY); // Box 95
		leftTrackModel[9] = new ModelRendererTurbo(this, 191, 15, textureX, textureY); // Box 96
		leftTrackModel[10] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Box 97
		leftTrackModel[11] = new ModelRendererTurbo(this, 196, 5, textureX, textureY); // Box 98

		leftTrackModel[0].addBox(-0.4F, 0F, -6F, 4, 1, 6, 0F); // Box 87
		leftTrackModel[0].setRotationPoint(34.4F, -4.25F, 19F);
		leftTrackModel[0].rotateAngleZ = -1.02974426F;

		leftTrackModel[1].addBox(0F, 0F, -6F, 1, 2, 6, 0F); // Box 88
		leftTrackModel[1].setRotationPoint(35.25F, -1.25F, 19F);
		leftTrackModel[1].rotateAngleZ = -0.05235988F;

		leftTrackModel[2].addBox(0F, -1F, -6F, 5, 1, 6, 0F); // Box 89
		leftTrackModel[2].setRotationPoint(33.5F, 5F, 19F);
		leftTrackModel[2].rotateAngleZ = 1.01229097F;

		leftTrackModel[3].addBox(0F, -1F, -6F, 14, 1, 6, 0F); // Box 90
		leftTrackModel[3].setRotationPoint(20.5F, 10F, 19F);
		leftTrackModel[3].rotateAngleZ = 0.36651914F;

		leftTrackModel[4].addBox(0F, 0F, -6F, 58, 1, 6, 0F); // Box 91
		leftTrackModel[4].setRotationPoint(-37.5F, 9F, 19F);

		leftTrackModel[5].addShapeBox(-14F, -1F, -6F, 14, 1, 6, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 92
		leftTrackModel[5].setRotationPoint(-37.5F, 10F, 19F);
		leftTrackModel[5].rotateAngleZ = -0.29670597F;

		leftTrackModel[6].addBox(0F, 0F, -6F, 1, 5, 6, 0F); // Box 93
		leftTrackModel[6].setRotationPoint(-54.32F, 2.5F, 19F);
		leftTrackModel[6].rotateAngleZ = 0.80285146F;

		leftTrackModel[7].addBox(0F, 0F, -6F, 1, 4, 6, 0F); // Box 94
		leftTrackModel[7].setRotationPoint(-53.5F, -1.37F, 19F);
		leftTrackModel[7].rotateAngleZ = -0.20943951F;

		leftTrackModel[8].addBox(-4F, 0F, -6F, 4, 1, 6, 0F); // Box 95
		leftTrackModel[8].setRotationPoint(-50.5F, -3.9F, 19F);
		leftTrackModel[8].rotateAngleZ = 0.68067841F;

		leftTrackModel[9].addBox(-13F, 0F, -6F, 13, 1, 6, 0F); // Box 96
		leftTrackModel[9].setRotationPoint(-37.7F, -6F, 19F);
		leftTrackModel[9].rotateAngleZ = 0.16144296F;

		leftTrackModel[10].addBox(-0.2F, 0F, -6F, 58, 1, 6, 0F); // Box 97
		leftTrackModel[10].setRotationPoint(-37.5F, -6F, 19F);

		leftTrackModel[11].addBox(-0.2F, 0F, -6F, 14, 1, 6, 0F); // Box 98
		leftTrackModel[11].setRotationPoint(20.5F, -6F, 19F);
		leftTrackModel[11].rotateAngleZ = -0.10471976F;


		rightTrackModel = new ModelRendererTurbo[12];
		rightTrackModel[0] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Box 46
		rightTrackModel[1] = new ModelRendererTurbo(this, 166, 39, textureX, textureY); // Box 47
		rightTrackModel[2] = new ModelRendererTurbo(this, 177, 31, textureX, textureY); // Box 48
		rightTrackModel[3] = new ModelRendererTurbo(this, 171, 51, textureX, textureY); // Box 49
		rightTrackModel[4] = new ModelRendererTurbo(this, 168, 19, textureX, textureY); // Box 50
		rightTrackModel[5] = new ModelRendererTurbo(this, 167, 27, textureX, textureY); // Box 51
		rightTrackModel[6] = new ModelRendererTurbo(this, 196, 5, textureX, textureY); // Box 52
		rightTrackModel[7] = new ModelRendererTurbo(this, 191, 15, textureX, textureY); // Box 52
		rightTrackModel[8] = new ModelRendererTurbo(this, 193, 24, textureX, textureY); // Box 53
		rightTrackModel[9] = new ModelRendererTurbo(this, 208, 27, textureX, textureY); // Box 54
		rightTrackModel[10] = new ModelRendererTurbo(this, 171, 59, textureX, textureY); // Box 55
		rightTrackModel[11] = new ModelRendererTurbo(this, 208, 38, textureX, textureY); // Box 56

		rightTrackModel[0].addBox(0F, 0F, 0F, 58, 1, 6, 0F); // Box 46
		rightTrackModel[0].setRotationPoint(-37.5F, 9F, -19F);

		rightTrackModel[1].addBox(0F, -1F, 0F, 14, 1, 6, 0F); // Box 47
		rightTrackModel[1].setRotationPoint(20.5F, 10F, -19F);
		rightTrackModel[1].rotateAngleZ = 0.36651914F;

		rightTrackModel[2].addBox(0F, -1F, 0F, 5, 1, 6, 0F); // Box 48
		rightTrackModel[2].setRotationPoint(33.5F, 5F, -19F);
		rightTrackModel[2].rotateAngleZ = 1.01229097F;

		rightTrackModel[3].addBox(-0.2F, 0F, 0F, 58, 1, 6, 0F); // Box 49
		rightTrackModel[3].setRotationPoint(-37.5F, -6F, -19F);

		rightTrackModel[4].addBox(-0.4F, 0F, 0F, 4, 1, 6, 0F); // Box 50
		rightTrackModel[4].setRotationPoint(34.4F, -4.25F, -19F);
		rightTrackModel[4].rotateAngleZ = -1.02974426F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 51
		rightTrackModel[5].setRotationPoint(35.25F, -1.25F, -19F);
		rightTrackModel[5].rotateAngleZ = -0.05235988F;

		rightTrackModel[6].addBox(-0.2F, 0F, 0F, 14, 1, 6, 0F); // Box 52
		rightTrackModel[6].setRotationPoint(20.5F, -6F, -19F);
		rightTrackModel[6].rotateAngleZ = -0.10471976F;

		rightTrackModel[7].addBox(-13F, 0F, 0F, 13, 1, 6, 0F); // Box 52
		rightTrackModel[7].setRotationPoint(-37.7F, -6F, -19F);
		rightTrackModel[7].rotateAngleZ = 0.16144296F;

		rightTrackModel[8].addBox(-4F, 0F, 0F, 4, 1, 6, 0F); // Box 53
		rightTrackModel[8].setRotationPoint(-50.5F, -3.9F, -19F);
		rightTrackModel[8].rotateAngleZ = 0.68067841F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 54
		rightTrackModel[9].setRotationPoint(-53.5F, -1.37F, -19F);
		rightTrackModel[9].rotateAngleZ = -0.20943951F;

		rightTrackModel[10].addShapeBox(-14F, -1F, 0F, 14, 1, 6, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 55
		rightTrackModel[10].setRotationPoint(-37.5F, 10F, -19F);
		rightTrackModel[10].rotateAngleZ = -0.29670597F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 56
		rightTrackModel[11].setRotationPoint(-54.32F, 2.5F, -19F);
		rightTrackModel[11].rotateAngleZ = 0.80285146F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}