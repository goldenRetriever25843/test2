//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.10.2015 - 22:14:46
// Last changed on: 29.10.2015 - 22:14:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPPK extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPPK() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[51];
		ammoModel = new ModelRendererTurbo[4];
		slideModel = new ModelRendererTurbo[7];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 22
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 24
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 25
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 26
		gunModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 27
		gunModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 28
		gunModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 29
		gunModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 30
		gunModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 32
		gunModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 33
		gunModel[11] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 34
		gunModel[12] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 35
		gunModel[13] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 36
		gunModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 37
		gunModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 38
		gunModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 39
		gunModel[17] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 4
		gunModel[18] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 40
		gunModel[19] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 41
		gunModel[20] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 42
		gunModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 43
		gunModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 44
		gunModel[23] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 45
		gunModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
		gunModel[25] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 47
		gunModel[26] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 48
		gunModel[27] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 5
		gunModel[28] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 6
		gunModel[29] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 63
		gunModel[30] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 64
		gunModel[31] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 65
		gunModel[32] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 66
		gunModel[33] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 67
		gunModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 68
		gunModel[35] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 69
		gunModel[36] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		gunModel[37] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 71
		gunModel[38] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 72
		gunModel[39] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 74
		gunModel[40] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 76
		gunModel[41] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 77
		gunModel[42] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 78
		gunModel[43] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 79
		gunModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 80
		gunModel[45] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 81
		gunModel[46] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 82
		gunModel[47] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 83
		gunModel[48] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 84
		gunModel[49] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 85
		gunModel[50] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 86

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 22
		gunModel[0].setRotationPoint(-7F, -12F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 4F, 0F, 0F); // Box 23
		gunModel[1].setRotationPoint(-7F, -2F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 3F, 0F, 0F); // Box 24
		gunModel[2].setRotationPoint(-7F, 0F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,4F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 25
		gunModel[3].setRotationPoint(-3F, -13F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,4F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 4F, 0F, 0F); // Box 26
		gunModel[4].setRotationPoint(-3F, -14F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,3.7F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 3.7F, 0F, 0F, 3.25F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 3.25F, 0F, 0F); // Box 27
		gunModel[5].setRotationPoint(-3.75F, -15F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,4.7F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 4.7F, 0F, 0F, 3.95F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 3.95F, 0F, 0F); // Box 28
		gunModel[6].setRotationPoint(-3.5F, -16F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,4.7F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 4.7F, 0F, 0F, 4.95F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 4.95F, 0F, 0F); // Box 29
		gunModel[7].setRotationPoint(-3.25F, -17F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 9, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[8].setRotationPoint(-5F, -21F, -3F);

		gunModel[9].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 32
		gunModel[9].setRotationPoint(4F, -21F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[10].setRotationPoint(24F, -21F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[11].setRotationPoint(4F, -18F, -3F);

		gunModel[12].addBox(0F, 0F, 0F, 18, 2, 3, 0F); // Box 35
		gunModel[12].setRotationPoint(2F, -17F, -2F);

		gunModel[13].addBox(0F, 0F, 0F, 5, 6, 3, 0F); // Box 36
		gunModel[13].setRotationPoint(1F, -15F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 10, 3, 0F,0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 37
		gunModel[14].setRotationPoint(1F, -9F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[15].setRotationPoint(6F, -15F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,2F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F); // Box 39
		gunModel[16].setRotationPoint(3F, -11F, -2F);

		gunModel[17].addBox(0F, 0F, 0F, 20, 3, 1, 0F); // Box 4
		gunModel[17].setRotationPoint(4F, -21F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 40
		gunModel[18].setRotationPoint(6F, -12F, -2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[19].setRotationPoint(6F, -14F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[20].setRotationPoint(6F, -10.5F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[21].setRotationPoint(6F, -10F, -2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[22].setRotationPoint(17F, -15F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		gunModel[23].setRotationPoint(13F, -15F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[24].setRotationPoint(15F, -15F, -2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[25].setRotationPoint(20F, -17F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 48
		gunModel[26].setRotationPoint(23F, -17F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[27].setRotationPoint(24F, -21F, 1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		gunModel[28].setRotationPoint(4F, -18F, 1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[29].setRotationPoint(3F, -9.5F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[30].setRotationPoint(6F, -10.5F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[31].setRotationPoint(8F, -9.5F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 66
		gunModel[32].setRotationPoint(15F, -14F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[33].setRotationPoint(15F, -12F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F); // Box 68
		gunModel[34].setRotationPoint(14F, -10F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[35].setRotationPoint(24F, -20F, -2F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[36].setRotationPoint(4F, -22F, -2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[37].setRotationPoint(4F, -21F, -2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		gunModel[38].setRotationPoint(4F, -20F, -2F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		gunModel[39].setRotationPoint(-9F, -21F, -3F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 76
		gunModel[40].setRotationPoint(-11F, -17F, -2F);

		gunModel[41].addShapeBox(0F, -1F, 0F, 2, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[41].setRotationPoint(-9F, -20F, -2F);

		gunModel[42].addShapeBox(0F, -1F, 0F, 3, 1, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[42].setRotationPoint(-11F, -17F, -2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[43].setRotationPoint(-8F, -22F, -1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		gunModel[44].setRotationPoint(8F, -15F, -1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 81
		gunModel[45].setRotationPoint(8F, -14F, -1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[46].setRotationPoint(10F, -15F, -1F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 83
		gunModel[47].setRotationPoint(9F, -13F, -1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		gunModel[48].setRotationPoint(9.5F, -13F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 85
		gunModel[49].setRotationPoint(9F, -12F, -1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 86
		gunModel[50].setRotationPoint(10F, -11F, -1F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		ammoModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		ammoModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 3

		ammoModel[0].addShapeBox(0F, 0F, 0F, 7, 18, 3, 0F,0.5F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0.5F, -2F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(-5F, -17F, -2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 5, 7, 4, 0F,1.5F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 1.5F, -7F, 0F, 1.5F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 1F, 0F); // Box 1
		ammoModel[1].setRotationPoint(-5F, -6F, -2.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0.5F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		ammoModel[2].setRotationPoint(-4.5F, -18F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.5F, -2F, 0F, -1F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, 0F, 0F); // Box 3
		ammoModel[3].setRotationPoint(-1F, -18F, -1.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 3
		slideModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 31
		slideModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 49
		slideModel[3] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 75
		slideModel[4] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 88
		slideModel[5] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 89
		slideModel[6] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 90

		slideModel[0].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		slideModel[0].setRotationPoint(-5F, -23F, 0F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		slideModel[1].setRotationPoint(-5F, -23F, -3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		slideModel[2].setRotationPoint(-5F, -23F, -1F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 75
		slideModel[3].setRotationPoint(-8F, -23F, -3F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		slideModel[4].setRotationPoint(-4F, -24F, 0F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		slideModel[5].setRotationPoint(23F, -24F, -1F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		slideModel[6].setRotationPoint(-4F, -24F, -2F);
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(-1F, -6, 0.7F);
		gunSlideDistance = 0.7F;
		
		
	}
}