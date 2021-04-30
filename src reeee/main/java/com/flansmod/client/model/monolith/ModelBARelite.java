//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBARelite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBARelite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[67];
		ammoModel = new ModelRendererTurbo[1];
		slideModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		gunModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		gunModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		gunModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		gunModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		gunModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		gunModel[16] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		gunModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		gunModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		gunModel[19] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 13
		gunModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		gunModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		gunModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 16
		gunModel[23] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		gunModel[24] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		gunModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		gunModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21
		gunModel[27] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 23
		gunModel[28] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 24
		gunModel[29] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 25
		gunModel[30] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 26
		gunModel[31] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		gunModel[32] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 28
		gunModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 29
		gunModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 30
		gunModel[35] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 31
		gunModel[36] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 32
		gunModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 33
		gunModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 34
		gunModel[39] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 35
		gunModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 36
		gunModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 37
		gunModel[42] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 38
		gunModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 39
		gunModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 40
		gunModel[45] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 41
		gunModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 42
		gunModel[47] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 43
		gunModel[48] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 44
		gunModel[49] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 45
		gunModel[50] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 46
		gunModel[51] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 47
		gunModel[52] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 48
		gunModel[53] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 49
		gunModel[54] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 50
		gunModel[55] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 52
		gunModel[56] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 53
		gunModel[57] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 54
		gunModel[58] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 55
		gunModel[59] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 57
		gunModel[60] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 58
		gunModel[61] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 59
		gunModel[62] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 60
		gunModel[63] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 61
		gunModel[64] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 62
		gunModel[65] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 63
		gunModel[66] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 64

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 1F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 1F, -0.15F, 0F); // Box 0
		gunModel[0].setRotationPoint(-0.1F, -4.95F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[1].setRotationPoint(-1.04F, -4.27F, -0.5F);
		gunModel[1].rotateAngleZ = 0.80285146F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0.1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.2F, 0.1F, 0F); // Box 1
		gunModel[2].setRotationPoint(-1.75F, -4.23F, -0.5F);
		gunModel[2].rotateAngleZ = 0.2268928F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.65F, 0F, 1F, -0.65F, 0F, 1F, -0.65F, 0F, 0.4F, -0.65F, 0F); // Box 2
		gunModel[3].setRotationPoint(2.6F, -5.3F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 3
		gunModel[4].setRotationPoint(3.9F, -5.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.15F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F); // Box 4
		gunModel[5].setRotationPoint(3.3F, -3.25F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.65F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 5
		gunModel[6].setRotationPoint(1.5F, -3.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.65F, -0.2F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F); // Box 6
		gunModel[7].setRotationPoint(1.55F, -3F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.15F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.15F, -0.15F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -0.25F); // Box 7
		gunModel[8].setRotationPoint(2F, -3.25F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F); // Box 8
		gunModel[9].setRotationPoint(0.7F, -2.82F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.65F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.65F, -0.35F, -0.25F); // Box 0
		gunModel[10].setRotationPoint(0F, -3.45F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F, -0.42F, -0.3F, -0.25F); // Box 2
		gunModel[11].setRotationPoint(0.15F, -3.2F, -0.5F);
		gunModel[11].rotateAngleZ = 0.05235988F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.4F, -0.25F, -0.42F, -0.4F, -0.25F, -0.42F, -0.4F, -0.25F, -0.42F, -0.4F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.4F, -0.25F, -0.42F, -0.4F, -0.25F, -0.42F, -0.35F, -0.25F); // Box 4
		gunModel[12].setRotationPoint(0.05F, -2.63F, -0.5F);
		gunModel[12].rotateAngleZ = 0.55850536F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F, -0.35F, -0.42F, -0.25F); // Box 5
		gunModel[13].setRotationPoint(0.55F, -2.95F, -0.5F);
		gunModel[13].rotateAngleZ = -0.2268928F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F, -0.42F, -0.35F, -0.25F); // Box 6
		gunModel[14].setRotationPoint(1.65F, -3.25F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F); // Box 8
		gunModel[15].setRotationPoint(1.5F, -3.23F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, 0.6F, -0.15F, -0.45F, 0.6F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, 0.6F, -0.15F, -0.45F); // Box 9
		gunModel[16].setRotationPoint(3.9F, -3.1F, -0.05F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, 0.6F, -0.15F, -0.45F, 0.6F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, -1F, -0.15F, -0.45F, 0.6F, -0.15F, -0.45F); // Box 10
		gunModel[17].setRotationPoint(3.9F, -3.1F, -0.95F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 2.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 2.2F, 0F); // Box 12
		gunModel[18].setRotationPoint(-8.65F, -3.75F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0F); // Box 13
		gunModel[19].setRotationPoint(-2.7F, -3.1F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[20].setRotationPoint(-1.7F, -3.1F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 15
		gunModel[21].setRotationPoint(-1.7F, -3.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[22].setRotationPoint(-3F, -3.4F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0.23F, 0F, -0.4F, 0.23F, 0F, -0.2F, 0F, 0F); // Box 17
		gunModel[23].setRotationPoint(-8.9F, -3.75F, -0.5F);
		gunModel[23].rotateAngleZ = 0.04363323F;

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 18
		gunModel[24].setRotationPoint(-9.05F, -4.2F, -0.5F);
		gunModel[24].rotateAngleZ = 0.13962634F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.27F, 0F, -0.2F, -0.27F, 0F, -0.2F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, -0.2F, -0.27F, 0F, -0.2F, -0.27F, 0F, 0F, -0.27F, 0F); // Box 19
		gunModel[25].setRotationPoint(-0.9F, -4.65F, -0.35F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 21
		gunModel[26].setRotationPoint(-0.9F, -4.65F, -0.3F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.25F, 0.1F, -0.15F, -0.25F, 0.1F, -0.15F, -0.25F, -0.9F, -0.1F, -0.25F, -0.9F, -0.1F, -0.35F, 0.1F, -0.15F, -0.35F, 0.1F, -0.15F, -0.2F, -0.9F, -0.1F, -0.2F, -0.9F); // Box 23
		gunModel[27].setRotationPoint(-0.25F, -5.7F, -0.4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.25F, 0.1F, -0.15F, -0.25F, 0.1F, -0.15F, -0.25F, -0.9F, -0.1F, -0.25F, -0.9F, -0.1F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.35F, -0.9F, -0.1F, -0.35F, -0.9F); // Box 24
		gunModel[28].setRotationPoint(-0.25F, -5.7F, 0.35F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.4F, 0.3F, -0.15F, -0.4F, 0.3F, -0.15F, -0.4F, -0.75F, -0.1F, -0.4F, -0.75F, -0.1F, -0.4F, 0.3F, -0.15F, -0.4F, 0.3F, -0.15F, -0.4F, -0.75F, -0.1F, -0.4F, -0.75F); // Box 25
		gunModel[29].setRotationPoint(-0.25F, -5.5F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.18F, 0.5F, -0.35F, -0.18F, 0.5F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0.5F, -0.35F, -0.18F, 0.5F, -0.35F, -0.18F, 0F, -0.35F, -0.18F); // Box 26
		gunModel[30].setRotationPoint(5.9F, -5.1F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.41F, -0.4F, 0.2F, -0.41F, -0.4F, 0.2F, -0.41F, -0.4F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.18F, 0.5F, -0.41F, -0.18F, 0.5F, -0.41F, -0.18F, 0F, -0.41F, -0.18F); // Box 27
		gunModel[31].setRotationPoint(5.9F, -5.34F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.41F, -0.18F, 0.5F, -0.41F, -0.18F, 0.5F, -0.41F, -0.18F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.4F, 0.2F, -0.41F, -0.4F, 0.2F, -0.41F, -0.4F, 0F, -0.41F, -0.4F); // Box 28
		gunModel[32].setRotationPoint(5.9F, -4.86F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 29
		gunModel[33].setRotationPoint(8.9F, -5.09F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.45F, -0.4F, 0.5F, -0.45F, -0.4F, 0.5F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 30
		gunModel[34].setRotationPoint(8.9F, -5.29F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 31
		gunModel[35].setRotationPoint(8.9F, -4.94F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.41F, -0.4F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.18F); // Box 32
		gunModel[36].setRotationPoint(22F, -5.34F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F, 0F, -0.35F, -0.18F); // Box 33
		gunModel[37].setRotationPoint(22F, -5.1F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.41F, -0.18F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.18F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.4F, 0F, -0.41F, -0.4F); // Box 34
		gunModel[38].setRotationPoint(22F, -4.86F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F); // Box 35
		gunModel[39].setRotationPoint(21.5F, -5.1F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.45F, -0.4F, 0.5F, -0.45F, -0.4F, 0.5F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 36
		gunModel[40].setRotationPoint(5.9F, -4.45F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 37
		gunModel[41].setRotationPoint(5.9F, -4.25F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 38
		gunModel[42].setRotationPoint(5.9F, -4.1F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F, -0.1F, -0.15F, -0.35F); // Box 39
		gunModel[43].setRotationPoint(17.9F, -4.7F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F); // Box 40
		gunModel[44].setRotationPoint(21.5F, -5.1F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.55F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0.55F, -0.6F, 0.2F, 0.55F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.55F, 0F, 0.2F); // Box 41
		gunModel[45].setRotationPoint(7F, -4.3F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, -0.5F, -0.4F, 0.25F, 0F, -0.4F, 0.25F); // Box 42
		gunModel[46].setRotationPoint(7F, -3.3F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.55F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0.55F, -0.4F, 0.25F, 0.55F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.55F, 0F, 0.2F); // Box 43
		gunModel[47].setRotationPoint(7F, -4.7F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 44
		gunModel[48].setRotationPoint(16.5F, -4.45F, 0F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0F, -0.4F, -0.45F); // Box 45
		gunModel[49].setRotationPoint(16.5F, -4.15F, 0F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 46
		gunModel[50].setRotationPoint(16.5F, -4.3F, 0F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 47
		gunModel[51].setRotationPoint(16.5F, -4.45F, -1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 48
		gunModel[52].setRotationPoint(16.5F, -4.3F, -1F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0.5F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0F, -0.4F, -0.45F); // Box 49
		gunModel[53].setRotationPoint(16.5F, -4.15F, -1F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F); // Box 50
		gunModel[54].setRotationPoint(21.5F, -4.25F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, -0.15F, -0.9F, 0F, -0.15F, -0.9F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, -0.9F, 0F, -0.15F, -0.9F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 52
		gunModel[55].setRotationPoint(16.5F, -4.2F, 0.15F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, -0.15F, -0.9F, 0F, -0.15F, -0.9F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, -0.9F, 0F, -0.15F, -0.9F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 53
		gunModel[56].setRotationPoint(16.5F, -4.2F, -1.15F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 54
		gunModel[57].setRotationPoint(21.1F, -5.45F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.3F, -0.3F, -0.35F, -0.42F, -0.3F, -0.35F, -0.42F, -0.3F, -0.35F, -0.42F, -0.3F, -0.35F, -0.42F, -0.3F, -0.35F); // Box 55
		gunModel[58].setRotationPoint(0.6F, -3.6F, -0.5F);
		gunModel[58].rotateAngleZ = -0.40142573F;

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.35F, -0.42F, -0.3F, -0.35F, -0.42F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.48F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 57
		gunModel[59].setRotationPoint(0.25F, -2.9F, -0.5F);
		gunModel[59].rotateAngleZ = 0.31415927F;

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.15F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F); // Box 58
		gunModel[60].setRotationPoint(21.1F, -5.65F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, -0.95F, -0.45F, -0.25F, -0.95F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, 0.1F, -0.45F, -0.25F, -0.95F, -0.45F, -0.25F, -0.95F); // Box 59
		gunModel[61].setRotationPoint(-0.55F, -6.3F, 0.2F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.9F, -0.45F, -0.25F, -0.9F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, 0.05F, -0.45F, -0.25F, -0.9F, -0.45F, -0.25F, -0.9F); // Box 60
		gunModel[62].setRotationPoint(-0.55F, -6.3F, -0.25F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, -0.8F, -0.45F, -0.4F, -0.8F, -0.45F, -0.45F, 0.2F, -0.45F, -0.45F, 0.2F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, -0.8F); // Box 61
		gunModel[63].setRotationPoint(-0.55F, -6.45F, 0F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, -0.85F, -0.4F, -0.4F, -0.85F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, -0.85F, -0.4F, -0.45F, -0.85F); // Box 62
		gunModel[64].setRotationPoint(-0.55F, -6.05F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.92F, -0.4F, -0.4F, -0.92F, -0.4F, -0.45F, 0.08F, -0.4F, -0.45F, 0.08F, -0.4F, -0.45F, -0.92F, -0.4F, -0.45F, -0.92F); // Box 63
		gunModel[65].setRotationPoint(-0.55F, -6.15F, 0.05F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.08F, -0.4F, -0.4F, 0.08F, -0.4F, -0.4F, -1F, -0.4F, -0.4F, -1F, -0.4F, -0.45F, 0.08F, -0.4F, -0.45F, 0.08F, -0.4F, -0.45F, -0.92F, -0.4F, -0.45F, -0.92F); // Box 64
		gunModel[66].setRotationPoint(-0.55F, -6.15F, -0.08F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 11

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.1F, -0.1F); // Box 11
		ammoModel[0].setRotationPoint(3.35F, -3.35F, -0.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 22
		slideModel[0].setRotationPoint(3.3F, -4.65F, 0.1F);
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -0.2F, 0F);

		gunSlideDistance = 0.0F;
		
	}
}