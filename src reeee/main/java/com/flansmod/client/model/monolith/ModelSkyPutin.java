//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelSkyPutin extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelSkyPutin()
	{
		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Main Body
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // The Spine Bottom
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 43
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 47
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 66
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 68
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 69
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 70
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 71
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 73
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 74
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 75
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 76
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 77
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 78
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 79
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 85
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 86
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 87
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 88
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 93
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 94
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 95
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 98
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 100
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 103
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 104

		bodyModel[0].addShapeBox(0F, 0F, 0F, 38, 10, 114, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Main Body
		bodyModel[0].setRotationPoint(52F, -38F, -57F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 36, 10, 120, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(16F, -38F, -60F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 43, 10, 120, 0F, 0F, -2F, -14F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -14F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F); // Box 2
		bodyModel[2].setRotationPoint(-27F, -38F, -60F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 96, 0F, 0F, -2F, -32F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -32F, 0F, -2F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -30F); // Box 3
		bodyModel[3].setRotationPoint(-62F, -36F, -48F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 75, 10, 46, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 23
		bodyModel[4].setRotationPoint(90F, -38F, -57F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 75, 10, 46, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[5].setRotationPoint(90F, -38F, 11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 34, 4, 16, 0F, 0F, 6F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 27
		bodyModel[6].setRotationPoint(164F, -32F, -57F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 34, 4, 16, 0F, 0F, 6F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 28
		bodyModel[7].setRotationPoint(164F, -32F, 41F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 40, 13, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F); // The Spine Bottom
		bodyModel[8].setRotationPoint(-50F, -38F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 82, 13, 42, 0F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, -1F, -14F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, -14F); // Box 43
		bodyModel[9].setRotationPoint(-132F, -38F, -21F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 37, 13, 28, 0F, 0F, -2.5F, -7F, 0F, -2F, -2F, 0F, -2F, -25F, 0F, -2.5F, -18F, 0F, 0.5F, 0F, 0F, -0.8F, 3F, 0F, -0.5F, -30F, 0F, 0.5F, -18F); // Box 45
		bodyModel[10].setRotationPoint(-132F, -48.5F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 37, 13, 28, 0F, 0F, -2.5F, -18F, 0F, -2F, -25F, 0F, -2F, -2F, 0F, -2.5F, -7F, 0F, 0.5F, -18F, 0F, -0.5F, -30F, 0F, -0.8F, 3F, 0F, 0.5F, 0F); // Box 47
		bodyModel[11].setRotationPoint(-132F, -48.5F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 75, 7, 26, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 7F, -4F, 0F, 4F, -7F, 0F, 3F, -7F, 0F, 3.5F, -7F, 0F, 4F, 2F); // Box 66
		bodyModel[12].setRotationPoint(10F, -28F, -40F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 175, 13, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -8F); // Box 68
		bodyModel[13].setRotationPoint(-10F, -38F, -21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 7, 26, 0F, 15F, 4F, 0F, 0F, 4F, 0F, 0F, 7F, -4F, 30F, 6F, 2F, 8F, 0F, -7F, 0F, 4F, -7F, 0F, 4F, 2F, 18F, 0F, 2F); // Box 69
		bodyModel[14].setRotationPoint(2F, -28F, -40F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 7, 26, 0F, 30F, 6F, 2F, 0F, 7F, -4F, 0F, 4F, 0F, 15F, 4F, 0F, 18F, 0F, 2F, 0F, 4F, 2F, 0F, 4F, -7F, 8F, 0F, -7F); // Box 70
		bodyModel[15].setRotationPoint(2F, -28F, 14F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 75, 7, 26, 0F, 0F, 7F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 2F, 0F, 3.5F, -7F, 0F, 3F, -7F, 0F, 4F, -7F); // Box 71
		bodyModel[16].setRotationPoint(10F, -28F, 14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 110, 2, 26, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[17].setRotationPoint(55F, -40F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 20, 2, 26, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 74
		bodyModel[18].setRotationPoint(165F, -40F, -13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 2, 26, 0F, 0F, 0F, -7F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 75
		bodyModel[19].setRotationPoint(185F, -40F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 2, 26, 0F, 0F, -0.5F, -8F, 0F, -2F, -13F, 0F, -2F, -13F, 0F, -0.5F, -8F, 0F, 0F, -4F, -8F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, -4F); // Box 76
		bodyModel[20].setRotationPoint(194F, -40F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 20, 11, 26, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -1F); // Box 77
		bodyModel[21].setRotationPoint(165F, -38F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 10, 26, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1.5F, -8F, 0F, -1.5F, -8F, 0F, 0F, -4F); // Box 78
		bodyModel[22].setRotationPoint(185F, -38F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 9, 26, 0F, 0F, 0F, -4F, -8F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, -4F, 0F, -0.5F, -8F, 0F, -9F, -13F, 0F, -9F, -13F, 0F, -0.5F, -8F); // Box 79
		bodyModel[23].setRotationPoint(194F, -38F, -13F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 13, 34, 0F, 0F, -2.5F, -18F, -10F, -2.5F, -20F, 0F, -2.5F, -6F, 0F, -2.5F, -7F, 0F, 0.5F, -18F, -8F, -0.5F, -20F, 0F, -0.8F, 0F, 0F, 0.5F, 0F); // Box 80
		bodyModel[24].setRotationPoint(-132F, -48.5F, -20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 13, 34, 0F, 0F, -2.5F, -7F, 0F, -2.5F, -6F, -10F, -2.5F, -20F, 0F, -2.5F, -18F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, -8F, -0.5F, -20F, 0F, 0.5F, -18F); // Box 82
		bodyModel[25].setRotationPoint(-132F, -48.5F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 19, 4, 18, 0F, 12F, 2F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 12F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[26].setRotationPoint(-119F, -47.5F, -9F);
		bodyModel[26].rotateAngleZ = 0.34906585F;

		bodyModel[27].addShapeBox(-2F, 4F, 0F, 19, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[27].setRotationPoint(-119F, -47.5F, -9F);
		bodyModel[27].rotateAngleZ = 0.34906585F;

		bodyModel[28].addShapeBox(-2F, 4F, 0F, 30, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[28].setRotationPoint(-102F, -47.5F, -11F);

		bodyModel[29].addShapeBox(-2F, 4F, 0F, 30, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 88
		bodyModel[29].setRotationPoint(-102F, -47.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[30].setRotationPoint(-102F, -45.5F, -11F);
		bodyModel[30].rotateAngleZ = -0.29670597F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[31].setRotationPoint(-102F, -45.5F, 6F);
		bodyModel[31].rotateAngleZ = -0.29670597F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[32].setRotationPoint(-103.5F, -43.5F, -2.5F);
		bodyModel[32].rotateAngleZ = 0.52359878F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[33].setRotationPoint(-100.5F, -54.5F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 95
		bodyModel[34].setRotationPoint(-100.5F, -57.4F, -2.5F);

		bodyModel[35].addShapeBox(0F, -15F, 0F, 4, 24, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[35].setRotationPoint(-83.5F, -44.5F, -5F);
		bodyModel[35].rotateAngleZ = -0.06981317F;

		bodyModel[36].addShapeBox(0F, -15F, 0F, 4, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[36].setRotationPoint(-84F, -44.5F, -5F);
		bodyModel[36].rotateAngleZ = -0.06981317F;

		bodyModel[37].addShapeBox(0F, -15F, 0F, 4, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[37].setRotationPoint(-77F, -36.5F, -5F);
		bodyModel[37].rotateAngleZ = 1.50098316F;

		bodyModel[38].addShapeBox(-26F, 0F, 0F, 66, 4, 10, 0F, -20F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[38].setRotationPoint(120F, -39F, -53F);

		bodyModel[39].addShapeBox(-26F, 0F, 0F, 66, 4, 10, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[39].setRotationPoint(120F, -39F, 43F);


		noseModel = new ModelRendererTurbo[29];
		noseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Cone Bottom
		noseModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		noseModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		noseModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		noseModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		noseModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		noseModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		noseModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		noseModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		noseModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		noseModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		noseModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 56
		noseModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 57
		noseModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 80
		noseModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 81
		noseModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 82
		noseModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		noseModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		noseModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 83
		noseModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 84
		noseModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 89
		noseModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 91
		noseModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92
		noseModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 105
		noseModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
		noseModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
		noseModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
		noseModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 109
		noseModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 110

		noseModel[0].addShapeBox(0F, 0F, 0F, 22, 13, 28, 0F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, 0F, -6F, -9F, 0F, -4.5F, -7F, 0F, -4.5F, -7F, 0F, -6F, -9F); // Cone Bottom
		noseModel[0].setRotationPoint(-154F, -34.5F, -14F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 18, 13, 28, 0F, 0F, -12F, -14F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -12F, -14F, 0F, 0.5F, -13F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, -13F); // Box 45
		noseModel[1].setRotationPoint(-172F, -48.5F, -14F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 22, 13, 28, 0F, 0F, -6F, -9F, 0F, -2.5F, -7F, 0F, -2.5F, -7F, 0F, -6F, -9F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F); // Box 48
		noseModel[2].setRotationPoint(-154F, -48.5F, -14F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 18, 13, 28, 0F, 0F, 0.5F, -13F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, -13F, 0F, -12F, -14F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, -12F, -14F); // Box 49
		noseModel[3].setRotationPoint(-172F, -34.5F, -14F);

		noseModel[4].addShapeBox(0F, -0.5F, -0.5F, 35, 1, 1, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F); // Box 44
		noseModel[4].setRotationPoint(-205F, -35F, 0F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 16, 13, 28, 0F, 0F, -2F, -2F, 0F, 4F, -2F, 0F, 4F, -25F, 0F, -2F, -25F, 0F, -0.8F, 3F, 0F, -1.5F, 4.5F, 0F, 0.5F, -30F, 0F, -0.5F, -30F); // Box 48
		noseModel[5].setRotationPoint(-95F, -48.5F, -14F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 16, 13, 28, 0F, 0F, -2F, -25F, 0F, 4F, -25F, 0F, 4F, -2F, 0F, -2F, -2F, 0F, -0.5F, -30F, 0F, 0.5F, -30F, 0F, -1.5F, 4.5F, 0F, -0.8F, 3F); // Box 49
		noseModel[6].setRotationPoint(-95F, -48.5F, -14F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 16, 13, 28, 0F, 0F, 4F, -2F, 12F, 3F, -2F, 12F, 8F, -14F, 0F, 4F, -25F, 0F, -1.5F, 4.5F, 12F, -2.5F, 6.8F, 12F, -0.5F, -14F, 0F, 0.5F, -30F); // Box 50
		noseModel[7].setRotationPoint(-79F, -48.5F, -14F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 27, 13, 28, 0F, 12F, 3F, -2F, 0F, -3F, -2F, 0F, 3.8F, -14F, 12F, 8F, -14F, 12F, -2.5F, 6.8F, 0F, -1.5F, 8F, 0F, 0.5F, -14F, 12F, -0.5F, -14F); // Box 52
		noseModel[8].setRotationPoint(-39F, -48.5F, -14F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 52, 13, 28, 0F, 0F, -3F, -2F, 12F, -5F, 2F, 12F, -3F, -14F, 0F, 3.8F, -14F, 0F, -1.5F, 8F, 12F, -2.5F, 18F, 12F, 2F, -14F, 0F, 0.5F, -14F); // Box 53
		noseModel[9].setRotationPoint(-12F, -48.5F, -14F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 27, 13, 28, 0F, 12F, 8F, -14F, 0F, 3.8F, -14F, 0F, -3F, -2F, 12F, 3F, -2F, 12F, -0.5F, -14F, 0F, 0.5F, -14F, 0F, -1.5F, 8F, 12F, -2.5F, 6.8F); // Box 55
		noseModel[10].setRotationPoint(-39F, -48.5F, -14F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 16, 13, 28, 0F, 0F, 4F, -25F, 12F, 8F, -14F, 12F, 3F, -2F, 0F, 4F, -2F, 0F, 0.5F, -30F, 12F, -0.5F, -14F, 12F, -2.5F, 6.8F, 0F, -1.5F, 4.5F); // Box 56
		noseModel[11].setRotationPoint(-79F, -48.5F, -14F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 52, 13, 28, 0F, 0F, 3.8F, -14F, 12F, -3F, -14F, 12F, -5F, 2F, 0F, -3F, -2F, 0F, 0.5F, -14F, 12F, 2F, -14F, 12F, -2.5F, 18F, 0F, -1.5F, 8F); // Box 57
		noseModel[12].setRotationPoint(-12F, -48.5F, -14F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 80
		noseModel[13].setRotationPoint(-100F, -56.5F, -7F);
		noseModel[13].rotateAngleX = -0.40142573F;
		noseModel[13].rotateAngleZ = 0.43633231F;

		noseModel[14].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 81
		noseModel[14].setRotationPoint(-100F, -56.5F, 6F);
		noseModel[14].rotateAngleX = 0.40142573F;
		noseModel[14].rotateAngleZ = 0.43633231F;

		noseModel[15].addShapeBox(-0.8F, -4.3F, 1.2F, 1, 5, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 82
		noseModel[15].setRotationPoint(-100F, -58.5F, -7F);
		noseModel[15].rotateAngleX = -0.80285146F;
		noseModel[15].rotateAngleZ = 0.43633231F;

		noseModel[16].addShapeBox(-0.8F, -3.6F, -1.4F, 1, 5, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 83
		noseModel[16].setRotationPoint(-100F, -58.5F, 6F);
		noseModel[16].rotateAngleX = 0.80285146F;
		noseModel[16].rotateAngleZ = 0.43633231F;

		noseModel[17].addShapeBox(0F, 0F, -2.5F, 1, 1, 5, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 84
		noseModel[17].setRotationPoint(-101.5F, -60.5F, 0F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 28, 26, 13, 0F, 0F, -10F, -2F, 0F, -12F, -1F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 83
		noseModel[18].setRotationPoint(-79F, -62.5F, -13F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 28, 26, 13, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -12F, -1F, 0F, -10F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		noseModel[19].setRotationPoint(-79F, -62.5F, 0F);

		noseModel[20].addShapeBox(-2F, 4F, 0F, 30, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		noseModel[20].setRotationPoint(-102F, -47.5F, -11F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		noseModel[21].setRotationPoint(-108F, -38.5F, -5F);
		noseModel[21].rotateAngleZ = -0.34906585F;

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		noseModel[22].setRotationPoint(-108F, -38.5F, 2.5F);
		noseModel[22].rotateAngleZ = -0.34906585F;

		noseModel[23].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 105
		noseModel[23].setRotationPoint(-195F, -35F, 0F);

		noseModel[24].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 106
		noseModel[24].setRotationPoint(-195F, -39F, 0F);

		noseModel[25].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 107
		noseModel[25].setRotationPoint(-195F, -35F, 0F);
		noseModel[25].rotateAngleX = 1.57079633F;

		noseModel[26].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 108
		noseModel[26].setRotationPoint(-195F, -35F, -4F);
		noseModel[26].rotateAngleX = 1.57079633F;

		noseModel[27].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 109
		noseModel[27].setRotationPoint(-182F, -35F, -4F);
		noseModel[27].rotateAngleX = 1.57079633F;

		noseModel[28].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 110
		noseModel[28].setRotationPoint(-182F, -35F, 0F);
		noseModel[28].rotateAngleX = 1.57079633F;


		tailModel = new ModelRendererTurbo[20];
		tailModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 30
		tailModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		tailModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		tailModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		tailModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 34
		tailModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		tailModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 36
		tailModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 37
		tailModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38
		tailModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 39
		tailModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 40
		tailModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41
		tailModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 59
		tailModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 60
		tailModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		tailModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		tailModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 63
		tailModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 64
		tailModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 65
		tailModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 72

		tailModel[0].addShapeBox(0F, 0F, 0F, 10, 10, 24, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		tailModel[0].setRotationPoint(165F, -38F, -39F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F, 0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		tailModel[1].setRotationPoint(165F, -45F, -39F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F); // Box 32
		tailModel[2].setRotationPoint(165F, -28F, -39F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 15, 10, 22, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 33
		tailModel[3].setRotationPoint(175F, -38F, -38F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 15, 6, 22, 0F, 0F, 0F, -7F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 34
		tailModel[4].setRotationPoint(175F, -44F, -38F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 15, 6, 22, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -7F); // Box 35
		tailModel[5].setRotationPoint(175F, -28F, -38F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F, 0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 36
		tailModel[6].setRotationPoint(165F, -45F, 15F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 15, 6, 22, 0F, 0F, 0F, -7F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 37
		tailModel[7].setRotationPoint(175F, -44F, 16F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 15, 10, 22, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 38
		tailModel[8].setRotationPoint(175F, -38F, 16F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 10, 10, 24, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		tailModel[9].setRotationPoint(165F, -38F, 15F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 7, 24, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F); // Box 40
		tailModel[10].setRotationPoint(165F, -28F, 15F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 15, 6, 22, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -7F); // Box 41
		tailModel[11].setRotationPoint(175F, -28F, 16F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 58, 7, 26, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[12].setRotationPoint(107F, -45F, -40F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 58, 7, 26, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[13].setRotationPoint(107F, -45F, 14F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 18, 7, 26, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 61
		tailModel[14].setRotationPoint(89F, -45F, -40F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 18, 7, 26, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 62
		tailModel[15].setRotationPoint(89F, -45F, 14F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 37, 7, 26, 0F, 0F, -1.5F, -8F, 0F, 0F, 8F, 0F, 0F, -22F, 0F, 0.5F, -2F, 0F, 0F, 8F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 1F); // Box 63
		tailModel[16].setRotationPoint(52F, -45F, -24F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 37, 7, 26, 0F, 0F, 0.5F, -2F, 0F, 0F, -22F, 0F, 0F, 8F, 0F, -1.5F, -8F, 0F, 0F, 1F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 8F); // Box 64
		tailModel[17].setRotationPoint(52F, -45F, -2F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 80, 7, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 3.5F, -7F); // Box 65
		tailModel[18].setRotationPoint(85F, -28F, -40F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 80, 7, 26, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 3F, -7F); // Box 72
		tailModel[19].setRotationPoint(85F, -28F, 14F);


		leftWingModel = new ModelRendererTurbo[5];
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Flap Foogle
		leftWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Illuminatti
		leftWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // What outer
		leftWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		leftWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // WingTip

		leftWingModel[0].addBox(0F, 0F, 0F, 14, 3, 68, 0F); // Flap Foogle
		leftWingModel[0].setRotationPoint(106F, -33F, -125F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 74, 3, 68, 0F, 0F, 0F, -68F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -68F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Illuminatti
		leftWingModel[1].setRotationPoint(32F, -33F, -125F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 27, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // What outer
		leftWingModel[2].setRotationPoint(120F, -33F, -125F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 44, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 6F, 0F, -7.5F, 0F, 0F, 0F); // Box 9
		leftWingModel[3].setRotationPoint(120F, -33F, -98F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 39, 3, 13, 0F, -14F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WingTip
		leftWingModel[4].setRotationPoint(89.7F, -33F, -138F);


		rightWingModel = new ModelRendererTurbo[5];
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		rightWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		rightWingModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		rightWingModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 27, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightWingModel[0].setRotationPoint(120F, -33F, 98F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 44, 0F, 0F, 0F, 0F, 6F, 0F, -6.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -6.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightWingModel[1].setRotationPoint(120F, -33F, 54F);

		rightWingModel[2].addBox(0F, 0F, 0F, 14, 3, 68, 0F); // Box 17
		rightWingModel[2].setRotationPoint(106F, -33F, 57F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 39, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -14F, 0F, 0F); // Box 18
		rightWingModel[3].setRotationPoint(89.7F, -33F, 125F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 74, 3, 68, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -68F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -68F); // Box 19
		rightWingModel[4].setRotationPoint(32F, -33F, 57F);


		yawFlapModel = new ModelRendererTurbo[3];
		yawFlapModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 97
		yawFlapModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 101
		yawFlapModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 102

		yawFlapModel[0].addShapeBox(-0.5F, -15F, -0.5F, 1, 15, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		yawFlapModel[0].setRotationPoint(-96.5F, -35.5F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.13962634F;

		yawFlapModel[1].addShapeBox(-26F, -48F, -1F, 59, 48, 2, 0F, -32F, 0F, -0.2F, -6F, 0F, -0.2F, -6F, 0F, -0.2F, -32F, 0F, -0.2F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F); // Box 101
		yawFlapModel[1].setRotationPoint(132F, -39F, -47F);
		yawFlapModel[1].rotateAngleX = 0.45378561F;

		yawFlapModel[2].addShapeBox(-26F, -48F, 1F, 59, 48, 2, 0F, -32F, 0F, -0.2F, -6F, 0F, -0.2F, -6F, 0F, -0.2F, -32F, 0F, -0.2F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F); // Box 102
		yawFlapModel[2].setRotationPoint(132F, -39F, 45F);
		yawFlapModel[2].rotateAngleX = -0.45378561F;


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Flap

		pitchFlapLeftModel[0].addShapeBox(-42F, 0F, -44F, 80, 3, 49, 0F, -50F, 0F, 0F, -9F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, -50F, 0F, 0F, -9F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F); // Flap
		pitchFlapLeftModel[0].setRotationPoint(160F, -33F, -55F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Flap

		pitchFlapRightModel[0].addShapeBox(-42F, 0F, 44F, 80, 3, 49, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -6F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -6F, -50F, 0F, 0F); // Flap
		pitchFlapRightModel[0].setRotationPoint(160F, -33F, 6F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[3];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Left Back
		pitchFlapLeftWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12

		pitchFlapLeftWingModel[0].addShapeBox(-11F, 0F, 0F, 11, 3, 98, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F); // Box 7
		pitchFlapLeftWingModel[0].setRotationPoint(106F, -33F, -125F);
		pitchFlapLeftWingModel[0].rotateAngleY = 0.82903139F;

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, -27F, 9, 3, 27, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Left Back
		pitchFlapLeftWingModel[1].setRotationPoint(120F, -33F, -98F);

		pitchFlapLeftWingModel[2].addShapeBox(0F, 0F, 0F, 21, 3, 41, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -5F, 0F, -13F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -3F, -5F, 0F, -13F, 0F, 0F, -3F); // Box 12
		pitchFlapLeftWingModel[2].setRotationPoint(120F, -33F, -98F);
		pitchFlapLeftWingModel[2].rotateAngleY = -0.19198622F;


		pitchFlapRightWingModel = new ModelRendererTurbo[3];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		pitchFlapRightWingModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 21, 3, 41, 0F, 0F, 0F, -3F, -5F, 0F, -13F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -13F, -6F, 0F, -3F, 0F, 0F, 0F); // Box 13
		pitchFlapRightWingModel[0].setRotationPoint(128F, -33F, 57F);
		pitchFlapRightWingModel[0].rotateAngleY = 0.19198622F;

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 27F, 9, 3, 27, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 15
		pitchFlapRightWingModel[1].setRotationPoint(120F, -33F, 71F);

		pitchFlapRightWingModel[2].addShapeBox(-11F, 0F, -2F, 11, 3, 98, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 20
		pitchFlapRightWingModel[2].setRotationPoint(35F, -33F, 60F);
		pitchFlapRightWingModel[2].rotateAngleY = -0.82903139F;


		bodyWheelModel = new ModelRendererTurbo[27];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 111
		bodyWheelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 112
		bodyWheelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 113
		bodyWheelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 114
		bodyWheelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyWheelModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 117
		bodyWheelModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyWheelModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 119
		bodyWheelModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 120
		bodyWheelModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 121
		bodyWheelModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 122
		bodyWheelModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 123
		bodyWheelModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 124
		bodyWheelModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 125
		bodyWheelModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 126
		bodyWheelModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 127
		bodyWheelModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 128
		bodyWheelModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 129
		bodyWheelModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 130
		bodyWheelModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 131
		bodyWheelModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyWheelModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 133
		bodyWheelModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		bodyWheelModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 135
		bodyWheelModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		bodyWheelModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyWheelModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyWheelModel[0].setRotationPoint(-64F, -26F, -1F);
		bodyWheelModel[0].rotateAngleZ = -0.10471976F;

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyWheelModel[1].setRotationPoint(-66F, -26F, 6F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyWheelModel[2].setRotationPoint(-66F, -26F, -7F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyWheelModel[3].setRotationPoint(-64.5F, -16F, -0.5F);
		bodyWheelModel[3].rotateAngleZ = 0.03490659F;

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 116
		bodyWheelModel[4].setRotationPoint(-64.5F, -3F, -1.5F);
		bodyWheelModel[4].rotateAngleZ = 0.03490659F;

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyWheelModel[5].setRotationPoint(-68F, -3F, 1.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 118
		bodyWheelModel[6].setRotationPoint(-68F, 0F, 1.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyWheelModel[7].setRotationPoint(-68F, -6F, 1.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 120
		bodyWheelModel[8].setRotationPoint(-68F, 0F, -4.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyWheelModel[9].setRotationPoint(-68F, -3F, -4.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyWheelModel[10].setRotationPoint(-68F, -6F, -4.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 31, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyWheelModel[11].setRotationPoint(20F, -29F, -48F);
		bodyWheelModel[11].rotateAngleX = -0.38397244F;

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyWheelModel[12].setRotationPoint(45F, -26F, -45.5F);
		bodyWheelModel[12].rotateAngleZ = -0.10471976F;

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyWheelModel[13].setRotationPoint(44F, -11F, -45F);
		bodyWheelModel[13].rotateAngleZ = 0.03490659F;

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyWheelModel[14].setRotationPoint(40F, -6F, -51F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyWheelModel[15].setRotationPoint(40F, -3F, -51F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyWheelModel[16].setRotationPoint(40F, 0F, -51F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyWheelModel[17].setRotationPoint(44F, -3F, -48F);
		bodyWheelModel[17].rotateAngleZ = 0.03490659F;

		bodyWheelModel[18].addShapeBox(0F, -4F, 0F, 2, 29, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyWheelModel[18].setRotationPoint(25F, -26F, -43.5F);
		bodyWheelModel[18].rotateAngleX = -0.08726646F;
		bodyWheelModel[18].rotateAngleZ = 0.87266463F;

		bodyWheelModel[19].addShapeBox(0F, -4F, 0F, 2, 29, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyWheelModel[19].setRotationPoint(25F, -26F, 41.5F);
		bodyWheelModel[19].rotateAngleX = 0.08726646F;
		bodyWheelModel[19].rotateAngleZ = 0.87266463F;

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyWheelModel[20].setRotationPoint(45F, -26F, 43.5F);
		bodyWheelModel[20].rotateAngleZ = -0.10471976F;

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 31, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyWheelModel[21].setRotationPoint(20F, -29F, 47F);
		bodyWheelModel[21].rotateAngleX = 0.38397244F;

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyWheelModel[22].setRotationPoint(44F, -11F, 44F);
		bodyWheelModel[22].rotateAngleZ = 0.03490659F;

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyWheelModel[23].setRotationPoint(44F, -3F, 44F);
		bodyWheelModel[23].rotateAngleZ = 0.03490659F;

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyWheelModel[24].setRotationPoint(40F, -3F, 48F);

		bodyWheelModel[25].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 137
		bodyWheelModel[25].setRotationPoint(40F, 0F, 48F);

		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyWheelModel[26].setRotationPoint(40F, -6F, 48F);


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 96

		hudModel[0].addShapeBox(0F, -1.5F, -2F, 1, 3, 4, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 96
		hudModel[0].setRotationPoint(-100.5F, -56F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
