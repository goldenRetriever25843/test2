//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.06.2016 - 00:47:25
// Last changed on: 12.06.2016 - 00:47:25

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBizonFlagship extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBizonFlagship() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[50];
		ammoModel = new ModelRendererTurbo[6];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 1
		gunModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		gunModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		gunModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		gunModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
		gunModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
		gunModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		gunModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 12
		gunModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 13
		gunModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		gunModel[25] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 37
		gunModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 38
		gunModel[27] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 39
		gunModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 46
		gunModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 47
		gunModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 48
		gunModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 59
		gunModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 60
		gunModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 61
		gunModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 62
		gunModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 63
		gunModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 64
		gunModel[37] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 65
		gunModel[38] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 66
		gunModel[39] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 67
		gunModel[40] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 68
		gunModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 69
		gunModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 70
		gunModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 71
		gunModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		gunModel[45] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 1
		gunModel[46] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		gunModel[47] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 1
		gunModel[48] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[49] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 5

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.05F, 0.2F, 0.02F, -0.2F, 0.2F, 0.02F, -0.2F, 0.2F, 0.02F, 0.05F, 0.2F, 0.02F, 0.05F, 0.2F, 0.02F, -0.2F, 0.1F, 0.02F, -0.2F, 0.1F, 0.02F, 0.05F, 0.2F, 0.02F); // Box 0
		gunModel[0].setRotationPoint(-1.15F, -4.2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, 0F, -0.25F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 0
		gunModel[1].setRotationPoint(-0.42F, -0.7F, -0.5F);
		gunModel[1].rotateAngleZ = -0.34906585F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.1F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, 0.1F, -0.3F, 0.05F, 0.1F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, 0.1F, -0.3F, 0.05F); // Box 1
		gunModel[2].setRotationPoint(-1F, -4.9F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.25F, -0.4F, -0.05F, 0.6F, -0.4F, -0.05F, 0.6F, -0.4F, -0.05F, -0.25F, -0.4F, -0.05F, 0F, -0.4F, 0.05F, 0.6F, -0.4F, 0.05F, 0.6F, -0.4F, 0.05F, 0F, -0.4F, 0.05F); // Box 5
		gunModel[3].setRotationPoint(-1.1F, -5.2F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, 0.6F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.25F, -0.3F, -0.05F, 0.6F, -0.3F, -0.05F, 0.6F, -0.3F, -0.05F, -0.25F, -0.3F, -0.05F); // Box 6
		gunModel[4].setRotationPoint(-1.1F, -5.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0.05F, -0.1F, -0.15F, 0.05F, -0.1F, -0.15F, 0F, -0.1F, -0.15F); // Box 9
		gunModel[5].setRotationPoint(5.1F, -5.3F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.6F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 10
		gunModel[6].setRotationPoint(5.1F, -5.9F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.15F, -0.05F, -0.4F, -0.15F, -0.05F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 11
		gunModel[7].setRotationPoint(6.1F, -5.9F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.2F, 0F, 0.6F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.6F, -0.1F, 0F); // Box 12
		gunModel[8].setRotationPoint(0.2F, -3.2F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 14
		gunModel[9].setRotationPoint(-0.5F, -2.6F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.26F, -0.1F, 0F, 0.26F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 15
		gunModel[10].setRotationPoint(-0.45F, -2.4F, -0.5F);
		gunModel[10].rotateAngleZ = -0.34906585F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0.25F, -0.35F, 0F, 0.25F, -0.35F, 0F, 0F, -0.4F, 0F, -0.1F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 16
		gunModel[11].setRotationPoint(-0.96F, -1F, -0.5F);
		gunModel[11].rotateAngleZ = -0.34906585F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 15
		gunModel[12].setRotationPoint(-0.35F, -0.45F, -0.5F);
		gunModel[12].rotateAngleZ = -0.34906585F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.6F, -2.3F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.6F, -2.3F, -0.1F, 0.6F, 2F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.6F, 2F, -0.1F); // Box 0
		gunModel[13].setRotationPoint(-7.15F, -3.8F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.05F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0.6F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.2F, 0.6F, 0F); // Box 1
		gunModel[14].setRotationPoint(-2.2F, -4.35F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F, 0.15F, -0.46F, -0.3F); // Box 5
		gunModel[15].setRotationPoint(1.45F, -2.56F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F); // Box 6
		gunModel[16].setRotationPoint(1.95F, -2.15F, -0.5F);
		gunModel[16].rotateAngleZ = 0.73303829F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F); // Box 7
		gunModel[17].setRotationPoint(2.2F, -3.15F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F); // Box 8
		gunModel[18].setRotationPoint(1.33F, -2.9F, -0.5F);
		gunModel[18].rotateAngleZ = -0.9424778F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.46F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.52F, -0.3F, -0.3F, -0.52F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 9
		gunModel[19].setRotationPoint(1.8F, -3.2F, -0.5F);
		gunModel[19].rotateAngleZ = -0.9250245F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.42F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.42F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F); // Box 10
		gunModel[20].setRotationPoint(1.85F, -3.35F, -0.5F);
		gunModel[20].rotateAngleZ = -1.29154365F;

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F); // Box 11
		gunModel[21].setRotationPoint(2.12F, -3.25F, -0.5F);
		gunModel[21].rotateAngleZ = -1.85004901F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.46F, -0.3F, -0.4F, -0.35F, -0.3F); // Box 12
		gunModel[22].setRotationPoint(2.2F, -3.4F, -0.5F);
		gunModel[22].rotateAngleZ = -1.85004901F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F); // Box 13
		gunModel[23].setRotationPoint(2.55F, -3.4F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F); // Box 14
		gunModel[24].setRotationPoint(2.55F, -2.9F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.12F, -0.42F, -0.37F, -0.15F, -0.42F, -0.37F, -0.15F, -0.42F, -0.37F, -0.12F, -0.42F, -0.37F, -0.12F, -0.42F, -0.27F, -0.15F, -0.42F, -0.27F, -0.15F, -0.42F, -0.27F, -0.12F, -0.42F, -0.27F); // Box 37
		gunModel[25].setRotationPoint(6.63F, -4.69F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.35F); // Box 38
		gunModel[26].setRotationPoint(12.3F, -4.42F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F, -0.12F, -0.45F, -0.25F); // Box 39
		gunModel[27].setRotationPoint(12.3F, -4.57F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F, -0.12F, -0.46F, -0.27F); // Box 46
		gunModel[28].setRotationPoint(6.6F, -4.57F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.35F, -0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.25F, -0.12F, -0.4F, -0.25F); // Box 47
		gunModel[29].setRotationPoint(12.3F, -4.72F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.12F, -0.42F, -0.27F, -0.15F, -0.42F, -0.27F, -0.15F, -0.42F, -0.27F, -0.12F, -0.42F, -0.27F, -0.12F, -0.42F, -0.37F, -0.15F, -0.42F, -0.37F, -0.15F, -0.42F, -0.37F, -0.12F, -0.42F, -0.37F); // Box 48
		gunModel[30].setRotationPoint(6.63F, -4.45F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.35F, -0.18F, -0.15F, -0.35F, -0.18F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.25F, -0.3F, -0.35F, -0.18F, -0.3F, -0.35F, -0.18F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F); // Box 59
		gunModel[31].setRotationPoint(11.3F, -5.4F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F); // Box 60
		gunModel[32].setRotationPoint(11.57F, -5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.45F, -0.15F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F); // Box 61
		gunModel[33].setRotationPoint(11.16F, -4.98F, -0.5F);
		gunModel[33].rotateAngleZ = -0.26179939F;

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F); // Box 62
		gunModel[34].setRotationPoint(11.3F, -5.8F, -0.7F);
		gunModel[34].rotateAngleX = 0.13962634F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F); // Box 63
		gunModel[35].setRotationPoint(11.3F, -5.95F, -0.28F);
		gunModel[35].rotateAngleX = -0.13962634F;

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.5F, -0.5F, -0.47F, -0.45F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F); // Box 64
		gunModel[36].setRotationPoint(11.3F, -6.03F, -0.36F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.18F, -0.5F, -0.47F, -0.5F, -0.5F, -0.47F, -0.45F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.18F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F); // Box 65
		gunModel[37].setRotationPoint(11.3F, -6.03F, -0.63F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F, -0.45F, -0.35F, -0.47F); // Box 66
		gunModel[38].setRotationPoint(11.5F, -5.95F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0.5F, -0.45F, -0.25F); // Box 67
		gunModel[39].setRotationPoint(6.5F, -6F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F); // Box 68
		gunModel[40].setRotationPoint(5.55F, -6.1F, -0.35F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F); // Box 69
		gunModel[41].setRotationPoint(5.55F, -6.1F, -0.65F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Box 70
		gunModel[42].setRotationPoint(5.9F, -5.99F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F); // Box 71
		gunModel[43].setRotationPoint(6.95F, -5.95F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.6F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.6F, -0.25F, -0.1F, 0.6F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.6F, -0.25F, -0.1F); // Box 0
		gunModel[44].setRotationPoint(-7.15F, -4.23F, -0.5F);
		gunModel[44].rotateAngleZ = 0.06108652F;

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.1F, -0.25F, 0.01F, -0.1F, -0.25F, 0.01F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0.17F, -0.1F, -0.25F, 0.02F, -0.1F, -0.25F, 0.02F, -0.1F, -0.25F, 0.17F, -0.1F); // Box 1
		gunModel[45].setRotationPoint(-8.1F, -3.95F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, 0F, 0.02F, -0.2F, 0F, 0.02F, -0.2F, 0F, 0.02F, 0.05F, 0F, 0.02F, 0.05F, 0F, 0.02F, -0.2F, 0F, 0.02F, -0.2F, 0F, 0.02F, 0.05F, 0F, 0.02F); // Box 0
		gunModel[46].setRotationPoint(3.7F, -4.3F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.4F, -0.35F, 0.02F, -0.6F, -0.35F, 0.02F, -0.6F, -0.35F, 0.02F, -0.4F, -0.35F, 0.02F, -0.4F, -0.25F, 0.02F, -0.8F, -0.4F, 0.02F, -0.8F, -0.4F, 0.02F, -0.4F, -0.25F, 0.02F); // Box 1
		gunModel[47].setRotationPoint(5.1F, -5.15F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.02F, 0F, -0.3F, 0.02F, 0F, -0.3F, 0.02F, 0F, -0.3F, 0.02F); // Box 2
		gunModel[48].setRotationPoint(5.5F, -5.5F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -1F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -1F, 0.2F, -0.2F); // Box 5
		gunModel[49].setRotationPoint(2.9F, -2.9F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		ammoModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		ammoModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 1
		ammoModel[3] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 2
		ammoModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 3
		ammoModel[5] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 4

		ammoModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F); // Box 22
		ammoModel[0].setRotationPoint(3.4F, -3.65F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, -0.2F); // Box 0
		ammoModel[1].setRotationPoint(3.4F, -3F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F, -0.4F, -0.35F, -0.6F); // Box 1
		ammoModel[2].setRotationPoint(3.4F, -2.35F, -1F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F); // Box 2
		ammoModel[3].setRotationPoint(9.4F, -3.65F, -1F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F, -0.4F, -0.25F, -0.6F); // Box 3
		ammoModel[4].setRotationPoint(9.4F, -2.35F, -1F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F, -0.4F, -0.05F, -0.1F); // Box 4
		ammoModel[5].setRotationPoint(9.4F, -3F, -1F);
		translateAll(0F, -0.5F, 0F);
		animationType = EnumAnimationType.BOTTOM_CLIP;
	}
}