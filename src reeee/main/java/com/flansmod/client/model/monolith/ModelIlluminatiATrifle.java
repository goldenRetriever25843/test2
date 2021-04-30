//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: g28
// Model Creator: 
// Created on: 28.08.2016 - 20:14:00
// Last changed on: 28.08.2016 - 20:14:00

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIlluminatiATrifle extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelIlluminatiATrifle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[88];
		defaultBarrelModel = new ModelRendererTurbo[5];
		defaultStockModel = new ModelRendererTurbo[2];
		defaultGripModel = new ModelRendererTurbo[1];
		ammoModel = new ModelRendererTurbo[2];
		slideModel = new ModelRendererTurbo[1];
		pumpModel = new ModelRendererTurbo[2];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initdefaultStockModel_1();
		initdefaultGripModel_1();
		initammoModel_1();
		initslideModel_1();
		initpumpModel_1();

		gunSlideDistance = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box1
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box2
		gunModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box3
		gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box4
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box5
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box6
		gunModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box7
		gunModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box8
		gunModel[9] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box9
		gunModel[10] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box10
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box11
		gunModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box13
		gunModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box14
		gunModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box15
		gunModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box16
		gunModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box17
		gunModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box18
		gunModel[18] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box22
		gunModel[19] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box23
		gunModel[20] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box24
		gunModel[21] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box31
		gunModel[22] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box32
		gunModel[23] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box33
		gunModel[24] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import Box34
		gunModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box35
		gunModel[26] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box36
		gunModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box50
		gunModel[28] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 0
		gunModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 1
		gunModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 2
		gunModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 3
		gunModel[32] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 4
		gunModel[33] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 5
		gunModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 6
		gunModel[35] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 7
		gunModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 8
		gunModel[37] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 9
		gunModel[38] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 10
		gunModel[39] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 11
		gunModel[40] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 12
		gunModel[41] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 13
		gunModel[42] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 14
		gunModel[43] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 15
		gunModel[44] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 16
		gunModel[45] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 17
		gunModel[46] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 18
		gunModel[47] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 19
		gunModel[48] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 20
		gunModel[49] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 21
		gunModel[50] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 22
		gunModel[51] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 23
		gunModel[52] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 24
		gunModel[53] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 25
		gunModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		gunModel[55] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 27
		gunModel[56] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 28
		gunModel[57] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 29
		gunModel[58] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 30
		gunModel[59] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 31
		gunModel[60] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 32
		gunModel[61] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 33
		gunModel[62] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 34
		gunModel[63] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 35
		gunModel[64] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 36
		gunModel[65] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 37
		gunModel[66] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 38
		gunModel[67] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 39
		gunModel[68] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 40
		gunModel[69] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 41
		gunModel[70] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 42
		gunModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 43
		gunModel[72] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 44
		gunModel[73] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 45
		gunModel[74] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 46
		gunModel[75] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 47
		gunModel[76] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 48
		gunModel[77] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 49
		gunModel[78] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 50
		gunModel[79] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 51
		gunModel[80] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 52
		gunModel[81] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 56
		gunModel[82] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 58
		gunModel[83] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 60
		gunModel[84] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 61
		gunModel[85] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 62
		gunModel[86] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 67
		gunModel[87] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 117

		gunModel[0].addShapeBox(0F, -16F, -2F, 11, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, -15F, -2F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(2F, -12F, -2F, 10, 4, 4, 0F); // Import Box2
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-13F, -15F, -2F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(-15F, -13F, -2F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box4
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(12F, -11F, -2F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box5
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(11F, -13F, -2F, 11, 2, 4, 0F); // Import Box6
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(22F, -15F, -2F, 44, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(22F, -14F, -2F, 44, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(22F, -13F, -2F, 44, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box9
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-2F, -18F, -1F, 68, 3, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(22F, -12F, -1F, 44, 2, 2, 0F); // Import Box11
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-3F, -10F, -2F, 4, 13, 4, 0F,-2F, -4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, -4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(0F, -12F, -2F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-7F, -12F, -2F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-7F, -15F, -2F, 8, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(11F, -10F, -3F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(11F, -9F, -3F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box18
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(-32F, -15F, -2.5F, 19, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box22
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-36F, -13F, -4F, 4, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box23
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-36F, -16F, -4F, 4, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(4F, -6F, -1F, 8, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(1F, -15F, -4F, 7, 2, 2, 0F,0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box32
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(22F, -14F, -3F, 44, 2, 1, 0F); // Import Box33
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addBox(22F, -14F, 2F, 44, 2, 1, 0F); // Import Box34
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(9F, -21F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(20F, -21F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(-1F, -17F, -2F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box50
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(2F, -19F, -1F, 5, 1, 2, 0F,-4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(8F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(10F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(12F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(14F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(16F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(18F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(22F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(24F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(26F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addShapeBox(28F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addShapeBox(30F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addShapeBox(32F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addShapeBox(34F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(36F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addShapeBox(38F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(40F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(42F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addShapeBox(44F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addShapeBox(46F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addShapeBox(48F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[48].setRotationPoint(0F, 0F, 0F);

		gunModel[49].addShapeBox(50F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[49].setRotationPoint(0F, 0F, 0F);

		gunModel[50].addShapeBox(52F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(54F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(56F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(58F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(60F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(62F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[55].setRotationPoint(0F, 0F, 0F);

		gunModel[56].addShapeBox(64F, -19F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[56].setRotationPoint(0F, 0F, 0F);

		gunModel[57].addShapeBox(64F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
		gunModel[57].setRotationPoint(0F, 0F, 0F);

		gunModel[58].addShapeBox(62F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		gunModel[58].setRotationPoint(0F, 0F, 0F);

		gunModel[59].addShapeBox(60F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		gunModel[59].setRotationPoint(0F, 0F, 0F);

		gunModel[60].addShapeBox(58F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		gunModel[60].setRotationPoint(0F, 0F, 0F);

		gunModel[61].addShapeBox(56F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		gunModel[61].setRotationPoint(0F, 0F, 0F);

		gunModel[62].addShapeBox(58F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		gunModel[62].setRotationPoint(0F, 0F, 0F);

		gunModel[63].addShapeBox(56F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		gunModel[63].setRotationPoint(0F, 0F, 0F);

		gunModel[64].addShapeBox(54F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		gunModel[64].setRotationPoint(0F, 0F, 0F);

		gunModel[65].addShapeBox(52F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		gunModel[65].setRotationPoint(0F, 0F, 0F);

		gunModel[66].addShapeBox(50F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		gunModel[66].setRotationPoint(0F, 0F, 0F);

		gunModel[67].addShapeBox(48F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		gunModel[67].setRotationPoint(0F, 0F, 0F);

		gunModel[68].addShapeBox(46F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		gunModel[68].setRotationPoint(0F, 0F, 0F);

		gunModel[69].addShapeBox(44F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		gunModel[69].setRotationPoint(0F, 0F, 0F);

		gunModel[70].addShapeBox(42F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		gunModel[70].setRotationPoint(0F, 0F, 0F);

		gunModel[71].addShapeBox(40F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		gunModel[71].setRotationPoint(0F, 0F, 0F);

		gunModel[72].addShapeBox(38F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		gunModel[72].setRotationPoint(0F, 0F, 0F);

		gunModel[73].addShapeBox(36F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		gunModel[73].setRotationPoint(0F, 0F, 0F);

		gunModel[74].addShapeBox(34F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		gunModel[74].setRotationPoint(0F, 0F, 0F);

		gunModel[75].addShapeBox(32F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		gunModel[75].setRotationPoint(0F, 0F, 0F);

		gunModel[76].addShapeBox(30F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48
		gunModel[76].setRotationPoint(0F, 0F, 0F);

		gunModel[77].addShapeBox(28F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		gunModel[77].setRotationPoint(0F, 0F, 0F);

		gunModel[78].addShapeBox(26F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		gunModel[78].setRotationPoint(0F, 0F, 0F);

		gunModel[79].addShapeBox(24F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		gunModel[79].setRotationPoint(0F, 0F, 0F);

		gunModel[80].addShapeBox(22F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		gunModel[80].setRotationPoint(0F, 0F, 0F);

		gunModel[81].addShapeBox(3F, -13F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		gunModel[81].setRotationPoint(0F, 0F, 0F);

		gunModel[82].addShapeBox(3F, -11F, 2F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		gunModel[82].setRotationPoint(0F, 0F, 0F);

		gunModel[83].addShapeBox(19F, -16F, -2F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[83].setRotationPoint(0F, 0F, 0F);

		gunModel[84].addBox(11F, -15F, -2F, 11, 2, 2, 0F); // Box 61
		gunModel[84].setRotationPoint(0F, 0F, 0F);

		gunModel[85].addBox(11F, -14F, -2F, 11, 1, 4, 0F); // Box 62
		gunModel[85].setRotationPoint(0F, 0F, 0F);

		gunModel[86].addShapeBox(23F, -22F, -1F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		gunModel[86].setRotationPoint(0F, 0F, 0F);

		gunModel[87].addShapeBox(6F, -24F, -2F, 21, 4, 4, 0F,0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[87].setRotationPoint(0F, 0F, 0F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box26
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box27
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box28
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box29
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Box30

		defaultBarrelModel[0].addShapeBox(66F, -15F, -2F, 41, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[1].addShapeBox(66F, -13F, -2F, 41, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box27
		defaultBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[2].addShapeBox(107F, -15F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box28
		defaultBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[3].addShapeBox(107F, -13F, -2F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box29
		defaultBarrelModel[3].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[4].addShapeBox(60F, -14F, -2F, 42, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		defaultBarrelModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initdefaultStockModel_1()
	{
		defaultStockModel[0] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box20
		defaultStockModel[1] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box21

		defaultStockModel[0].addShapeBox(-32F, -10F, -1F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[1].addShapeBox(-32F, -8F, -1F, 10, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		defaultStockModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initdefaultGripModel_1()
	{
		defaultGripModel[0] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box12

		defaultGripModel[0].addShapeBox(1F, -8F, -2F, 5, 11, 4, 0F,0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 3F, 0F, -0.4F); // Import Box12
		defaultGripModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 63
		ammoModel[1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 64

		ammoModel[0].addBox(13F, -15F, 0F, 5, 1, 1, 0F); // Box 63
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addShapeBox(18F, -15F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 64
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 59

		slideModel[0].addShapeBox(11F, -13F, 7F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		slideModel[0].setRotationPoint(0F, 0F, 0F);
		slideModel[0].rotateAngleX = 0.52359878F;
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 65
		pumpModel[1] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 66

		pumpModel[0].addBox(39F, -19F, -19F, 2, 2, 6, 0F); // Box 65
		pumpModel[0].setRotationPoint(0F, 0F, 0F);
		pumpModel[0].rotateAngleY = 0.4712389F;
		pumpModel[0].rotateAngleZ = -0.12217305F;

		pumpModel[1].addShapeBox(11F, -15F, -2F, 11, 1, 4, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 66
		pumpModel[1].setRotationPoint(0F, 0F, 0F);
	}
}