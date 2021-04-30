//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ArachnidSoldier
// Model Creator: 
// Created on: 10.04.2016 - 09:29:38
// Last changed on: 10.04.2016 - 09:29:38

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArachnid extends ModelMecha //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelArachnid() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];
		hipsModel = new ModelRendererTurbo[9];
		leftArmModel = new ModelRendererTurbo[51];
		rightArmModel = new ModelRendererTurbo[69];
		leftLegModel = new ModelRendererTurbo[96];
		rightLegModel = new ModelRendererTurbo[134];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 120, 290, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 126, 326, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 2, 329, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 8, 290, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 95, 160, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 6, 160, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 125, 363, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 6, 201, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 225, 260, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 225, 332, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 225, 295, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 260, 369, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 130, 401, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 1, 406, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 178, 402, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 121, 231, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 71, 410, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 261, 400, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 265, 179, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 265, 156, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 265, 179, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 234, 229, textureX, textureY); // Box 48
		bodyModel[30] = new ModelRendererTurbo(this, 118, 251, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 77, 125, textureX, textureY); // Box 50
		bodyModel[32] = new ModelRendererTurbo(this, 8, 253, textureX, textureY); // Box 51
		bodyModel[33] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 1
		bodyModel[35] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 3
		bodyModel[37] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 190, 195, textureX, textureY); // Box 6
		bodyModel[39] = new ModelRendererTurbo(this, 61, 94, textureX, textureY); // Box 7
		bodyModel[40] = new ModelRendererTurbo(this, 6, 94, textureX, textureY); // Box 9
		bodyModel[41] = new ModelRendererTurbo(this, 59, 65, textureX, textureY); // Box 10
		bodyModel[42] = new ModelRendererTurbo(this, 4, 65, textureX, textureY); // Box 11
		bodyModel[43] = new ModelRendererTurbo(this, 193, 117, textureX, textureY); // Box 12
		bodyModel[44] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 13
		bodyModel[45] = new ModelRendererTurbo(this, 115, 67, textureX, textureY); // Box 14
		bodyModel[46] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 15
		bodyModel[47] = new ModelRendererTurbo(this, 160, 159, textureX, textureY); // Box 16
		bodyModel[48] = new ModelRendererTurbo(this, 143, 121, textureX, textureY); // Box 18
		bodyModel[49] = new ModelRendererTurbo(this, 145, 119, textureX, textureY); // Box 19
		bodyModel[50] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 20
		bodyModel[51] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 21
		bodyModel[52] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 22
		bodyModel[53] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 23
		bodyModel[54] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 24
		bodyModel[55] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 25
		bodyModel[56] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 26
		bodyModel[57] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 27
		bodyModel[58] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 28
		bodyModel[59] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 29
		bodyModel[60] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 30
		bodyModel[61] = new ModelRendererTurbo(this, 37, 47, textureX, textureY); // Box 31
		bodyModel[62] = new ModelRendererTurbo(this, 5, 47, textureX, textureY); // Box 32
		bodyModel[63] = new ModelRendererTurbo(this, 25, 47, textureX, textureY); // Box 33
		bodyModel[64] = new ModelRendererTurbo(this, 25, 51, textureX, textureY); // Box 34
		bodyModel[65] = new ModelRendererTurbo(this, 25, 55, textureX, textureY); // Box 35
		bodyModel[66] = new ModelRendererTurbo(this, 5, 47, textureX, textureY); // Box 36
		bodyModel[67] = new ModelRendererTurbo(this, 25, 51, textureX, textureY); // Box 37
		bodyModel[68] = new ModelRendererTurbo(this, 25, 47, textureX, textureY); // Box 38
		bodyModel[69] = new ModelRendererTurbo(this, 25, 55, textureX, textureY); // Box 39

		bodyModel[0].addShapeBox(-1F, -21F, -14F, 16, 5, 28, 0F,0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, -3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, -1.5F); // Box 9
		bodyModel[0].setRotationPoint(0F, -56F, 0F);

		bodyModel[1].addShapeBox(-13F, -21F, -14F, 12, 5, 28, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -1.5F); // Box 10
		bodyModel[1].setRotationPoint(0F, -56F, 0F);

		bodyModel[2].addShapeBox(-1F, -27F, -14F, 16, 1, 7, 0F,0F, 0F, 1F, 0F, -3F, -1F, 0F, -3.8F, -2F, 0F, -.8F, -4F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -4F); // Box 11
		bodyModel[2].setRotationPoint(0F, -56F, 0F);

		bodyModel[3].addShapeBox(-13F, -27F, -14F, 12, 1, 3, 0F,0F, -3F, 1F, 0F, 0F, 1F, 0F, -.8F, 0F, 0F, -3.8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 12
		bodyModel[3].setRotationPoint(0F, -56F, 0F);

		bodyModel[4].addShapeBox(-13F, -7F, -14F, 12, 5, 28, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(0F, -56F, 0F);

		bodyModel[5].addShapeBox(-1F, -7F, -14F, 16, 5, 28, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 14
		bodyModel[5].setRotationPoint(0F, -56F, 0F);

		bodyModel[6].addShapeBox(-13F, -16F, -12.5F, 12, 9, 25, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(0F, -56F, 0F);

		bodyModel[7].addShapeBox(-1F, -16F, -12.5F, 16, 9, 25, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[7].setRotationPoint(0F, -56F, 0F);

		bodyModel[8].addShapeBox(-43F, -21F, -14F, 30, 5, 28, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -3F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, -5.5F); // Box 17
		bodyModel[8].setRotationPoint(0F, -56F, 0F);

		bodyModel[9].addShapeBox(-43F, -24F, -14F, 30, 1, 10, 0F,0F, -1F, -2.5F, 0F, 0F, 1F, 0F, -.8F, -7F, 0F, -1.8F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, -3.5F); // Box 18
		bodyModel[9].setRotationPoint(0F, -56F, 0F);

		bodyModel[10].addShapeBox(-43F, -16F, -12.5F, 30, 9, 25, 0F,0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F); // Box 19
		bodyModel[10].setRotationPoint(0F, -56F, 0F);

		bodyModel[11].addShapeBox(-43F, -7F, -14F, 30, 5, 28, 0F,0F, 8F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 8F, -5.5F, 0F, -12F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -4.5F); // Box 20
		bodyModel[11].setRotationPoint(0F, -56F, 0F);

		bodyModel[12].addShapeBox(-1F, -23F, -14F, 16, 2, 28, 0F,0F, 3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 21
		bodyModel[12].setRotationPoint(0F, -56F, 0F);

		bodyModel[13].addShapeBox(-43F, -23F, -14F, 30, 2, 28, 0F,0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 22
		bodyModel[13].setRotationPoint(0F, -56F, 0F);

		bodyModel[14].addShapeBox(-13F, -23F, -14F, 12, 2, 28, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[14].setRotationPoint(0F, -56F, 0F);

		bodyModel[15].addShapeBox(-54F, -23F, -10F, 11, 2, 20, 0F,0F, 0F, -3.5F, 0F, -1F, .5F, 0F, -1F, .5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -3.5F); // Box 27
		bodyModel[15].setRotationPoint(0F, -56F, 0F);

		bodyModel[16].addShapeBox(-54F, -21F, -10F, 11, 2, 20, 0F,0F, 0F, -3.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -3.5F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -5.5F); // Box 28
		bodyModel[16].setRotationPoint(0F, -56F, 0F);

		bodyModel[17].addShapeBox(-54F, -19F, -8.5F, 11, 4, 17, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 29
		bodyModel[17].setRotationPoint(0F, -56F, 0F);

		bodyModel[18].addShapeBox(-54F, -15F, -10F, 11, 1, 20, 0F,0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -4.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -4.5F); // Box 30
		bodyModel[18].setRotationPoint(0F, -56F, 0F);

		bodyModel[19].addShapeBox(-59F, -21F, -6.5F, 5, 2, 13, 0F,-1F, .5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .5F, -3.5F, -2.5F, -1F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.5F, -1F, -5.5F); // Box 31
		bodyModel[19].setRotationPoint(0F, -56F, 0F);

		bodyModel[20].addShapeBox(-57F, -19F, -5F, 3, 4, 10, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, -3.5F); // Box 32
		bodyModel[20].setRotationPoint(0F, -56F, 0F);

		bodyModel[21].addShapeBox(-57F, -15F, -6.5F, 3, 1, 13, 0F,.2F, -.5F, -5.5F, 0F, 0F, -2F, 0F, 0F, -2F, .2F, -.5F, -5.5F, 1F, .8F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, .8F, -5F); // Box 33
		bodyModel[21].setRotationPoint(0F, -56F, 0F);

		bodyModel[22].addShapeBox(-59F, -23F, -6.5F, 5, 2, 13, 0F,0F, .5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3.5F, -1F, -.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -3.5F); // Box 34
		bodyModel[22].setRotationPoint(0F, -56F, 0F);

		bodyModel[23].addShapeBox(-12F, -2F, 8F, 24, 2, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 35
		bodyModel[23].setRotationPoint(0F, -56F, 0F);

		bodyModel[24].addShapeBox(-12F, -2F, -8F, 24, 2, 16, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[24].setRotationPoint(0F, -56F, 0F);

		bodyModel[25].addShapeBox(-12F, -2F, -12F, 24, 2, 4, 0F,-4F, 0F, 1F, -4F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[25].setRotationPoint(0F, -56F, 0F);

		bodyModel[26].addShapeBox(-54F, -24F, -10F, 11, 1, 9, 0F,0F, 0F, -2.5F, 0F, -1F, 1.5F, 0F, -1.8F, -6.5F, 0F, -.8F, -3.5F, 0F, 0F, -3.5F, 0F, 1F, .5F, 0F, 1F, -6.5F, 0F, 0F, -3.5F); // Box 38
		bodyModel[26].setRotationPoint(0F, -56F, 0F);

		bodyModel[27].addShapeBox(-59F, -24F, -6.5F, 5, 1, 8, 0F,0F, .5F, -3.5F, 0F, 0F, 1F, 0F, -.8F, -6F, 0F, .5F, -3.5F, 0F, -.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -.5F, -3.5F); // Box 40
		bodyModel[27].setRotationPoint(0F, -56F, 0F);

		bodyModel[28].addShapeBox(-59F, -24.5F, -3.5F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, -.25F, 0F, 0F, -.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
		bodyModel[28].setRotationPoint(0F, -56F, 0F);

		bodyModel[29].addShapeBox(15F, -23F, -12F, 7, 2, 24, 0F,0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F); // Box 48
		bodyModel[29].setRotationPoint(0F, -56F, 0F);

		bodyModel[30].addShapeBox(15F, -21F, -14F, 7, 5, 28, 0F,0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F); // Box 49
		bodyModel[30].setRotationPoint(0F, -56F, 0F);

		bodyModel[31].addShapeBox(15F, -11F, -12.5F, 7, 4, 25, 0F,0F, .5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 50
		bodyModel[31].setRotationPoint(0F, -56F, 0F);

		bodyModel[32].addShapeBox(15F, -7F, -14F, 7, 5, 28, 0F,0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, -3F, -1F, -8F, -3F, -1F, -8F, 0F, 0F, 0F); // Box 51
		bodyModel[32].setRotationPoint(0F, -56F, 0F);

		bodyModel[33].addShapeBox(-1F, -27F, 7F, 16, 1, 7, 0F,0F, -.8F, -4F, 0F, -3.8F, -2F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(0F, -56F, 0F);

		bodyModel[34].addShapeBox(-13F, -27F, 11F, 12, 1, 3, 0F,0F, -3.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 1
		bodyModel[34].setRotationPoint(0F, -56F, 0F);

		bodyModel[35].addShapeBox(-43F, -24F, 4F, 30, 1, 10, 0F,0F, -1.8F, -3.5F, 0F, -.8F, -7F, 0F, 0F, 1F, 0F, -1F, -2.5F, 0F, 1F, -3.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 1F, -3.5F); // Box 2
		bodyModel[35].setRotationPoint(0F, -56F, 0F);

		bodyModel[36].addShapeBox(-54F, -24F, 1F, 11, 1, 9, 0F,0F, -.8F, -3.5F, 0F, -1.8F, -6.5F, 0F, -1F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 1F, -6.5F, 0F, 1F, .5F, 0F, 0F, -3.5F); // Box 3
		bodyModel[36].setRotationPoint(0F, -56F, 0F);

		bodyModel[37].addShapeBox(-59F, -24F, -1.5F, 5, 1, 8, 0F,0F, .5F, -3.5F, 0F, -.8F, -6F, 0F, 0F, 1F, 0F, .5F, -3.5F, 0F, -.5F, -3.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -.5F, -3.5F); // Box 4
		bodyModel[37].setRotationPoint(0F, -56F, 0F);

		bodyModel[38].addShapeBox(22F, -20F, -9F, 5, 2, 18, 0F,0F, 0F, -2F, -2F, -1F, -8F, -2F, -1F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F); // Box 6
		bodyModel[38].setRotationPoint(0F, -56F, 0F);

		bodyModel[39].addShapeBox(22F, -18F, -11F, 5, 2, 22, 0F,0F, 0F, -2F, -1F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F); // Box 7
		bodyModel[39].setRotationPoint(0F, -56F, 0F);

		bodyModel[40].addShapeBox(22F, -7F, -11F, 3, 5, 22, 0F,0F, 0F, -1F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -1F, 3F, -1F, -5F, -2F, -3F, -8F, -2F, -3F, -8F, 3F, -1F, -5F); // Box 9
		bodyModel[40].setRotationPoint(0F, -56F, 0F);

		bodyModel[41].addShapeBox(22F, -11F, -9.5F, 5, 4, 19, 0F,0F, 0F, .5F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, .5F, 0F, 0F, .5F, -2F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, .5F); // Box 10
		bodyModel[41].setRotationPoint(0F, -56F, 0F);

		bodyModel[42].addShapeBox(22F, -16F, -9.5F, 5, 4, 19, 0F,0F, 0F, .5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, .5F, 0F, 0F, .5F, .5F, -1F, -7F, .5F, -1F, -7F, 0F, 0F, .5F); // Box 11
		bodyModel[42].setRotationPoint(0F, -56F, 0F);

		bodyModel[43].addShapeBox(22F, -16F, -9.5F, 4, 8, 19, 0F,0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, 0F); // Box 12
		bodyModel[43].setRotationPoint(0F, -56F, 0F);

		bodyModel[44].addShapeBox(15F, -16F, -12.5F, 7, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, .5F, 0F); // Box 13
		bodyModel[44].setRotationPoint(0F, -56F, 0F);

		bodyModel[45].addShapeBox(15F, -12F, -11.5F, 7, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 14
		bodyModel[45].setRotationPoint(0F, -56F, 0F);

		bodyModel[46].addShapeBox(15F, -24F, -12F, 7, 1, 12, 0F,0F, 0F, 1F, 0F, -3F, -3F, 0F, -3.8F, -5F, 0F, -.8F, -9F, 0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, -9F); // Box 15
		bodyModel[46].setRotationPoint(0F, -56F, 0F);

		bodyModel[47].addShapeBox(15F, -24F, 0F, 7, 1, 12, 0F,0F, -.8F, -9F, 0F, -3.8F, -5F, 0F, -3F, -3F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F); // Box 16
		bodyModel[47].setRotationPoint(0F, -56F, 0F);

		bodyModel[48].addShapeBox(22F, -12F, -10F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, .2F, -1.5F, 0F, .2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -1.5F, 0F, .2F, -1.5F, 0F, 0F, 0F); // Box 18
		bodyModel[48].setRotationPoint(0F, -56F, 0F);

		bodyModel[49].addShapeBox(21F, -12F, -10F, 1, 1, 20, 0F,0F, 0F, .32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .32F, 0F, 0F, .32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .32F); // Box 19
		bodyModel[49].setRotationPoint(0F, -56F, 0F);

		bodyModel[50].addShapeBox(20F, -12F, 9.8F, 1, 1, 1, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F); // Box 20
		bodyModel[50].setRotationPoint(0F, -56F, 0F);

		bodyModel[51].addShapeBox(20F, -10.7F, 9.8F, 1, 1, 1, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Box 21
		bodyModel[51].setRotationPoint(0F, -57F, 0F);

		bodyModel[52].addShapeBox(20F, -11.3F, 9.8F, 1, 1, 1, 0F,-.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F); // Box 22
		bodyModel[52].setRotationPoint(0F, -57F, 0F);

		bodyModel[53].addShapeBox(20F, -10.7F, 10.1F, 1, 1, 1, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.65F, -.35F, -.35F, -.65F, -.35F); // Box 23
		bodyModel[53].setRotationPoint(0F, -57F, 0F);

		bodyModel[54].addShapeBox(20F, -12F, 10.1F, 1, 1, 1, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Box 24
		bodyModel[54].setRotationPoint(0F, -56F, 0F);

		bodyModel[55].addShapeBox(20F, -11.3F, 10.1F, 1, 1, 1, 0F,-.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.65F, -.35F, -.35F, -.65F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Box 25
		bodyModel[55].setRotationPoint(0F, -57F, 0F);

		bodyModel[56].addShapeBox(20F, -11.3F, -10.8F, 1, 1, 1, 0F,-.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F); // Box 26
		bodyModel[56].setRotationPoint(0F, -57F, 0F);

		bodyModel[57].addShapeBox(20F, -12F, -10.8F, 1, 1, 1, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F); // Box 27
		bodyModel[57].setRotationPoint(0F, -56F, 0F);

		bodyModel[58].addShapeBox(20F, -10.7F, -10.8F, 1, 1, 1, 0F,0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Box 28
		bodyModel[58].setRotationPoint(0F, -57F, 0F);

		bodyModel[59].addShapeBox(20F, -10.7F, -11.1F, 1, 1, 1, 0F,-.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.65F, -.35F, -.35F, -.65F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F); // Box 29
		bodyModel[59].setRotationPoint(0F, -57F, 0F);

		bodyModel[60].addShapeBox(20F, -12F, -11.1F, 1, 1, 1, 0F,-.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F); // Box 30
		bodyModel[60].setRotationPoint(0F, -56F, 0F);

		bodyModel[61].addShapeBox(20F, -11.3F, -11.1F, 1, 1, 1, 0F,-.35F, -.65F, -.35F, -.35F, -.65F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, -.35F, 0F, -.35F, -.35F, 0F, -.35F, -.35F); // Box 31
		bodyModel[61].setRotationPoint(0F, -57F, 0F);

		bodyModel[62].addShapeBox(22F, -10F, 8F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 1F, 0F, -.3F, 1F, 0F); // Box 32
		bodyModel[62].setRotationPoint(0F, -56F, 0F);

		bodyModel[63].addShapeBox(22F, -9F, 15F, 1, 1, 2, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 33
		bodyModel[63].setRotationPoint(0F, -56F, 0F);

		bodyModel[64].addShapeBox(22F, -10F, 15F, 1, 1, 2, 0F,-.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 1F, -.3F, 0F, 1F); // Box 34
		bodyModel[64].setRotationPoint(0F, -56F, 0F);

		bodyModel[65].addShapeBox(22F, -8F, 15F, 1, 1, 2, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 1F, -.3F, 0F, 1F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 35
		bodyModel[65].setRotationPoint(0F, -56F, 0F);

		bodyModel[66].addShapeBox(22F, -10F, -15F, 1, 1, 7, 0F,-.3F, -1F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 1F, 0F, -.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[66].setRotationPoint(0F, -56F, 0F);

		bodyModel[67].addShapeBox(22F, -10F, -17F, 1, 1, 2, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, 0F, 1F, -.3F, 0F, 1F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 37
		bodyModel[67].setRotationPoint(0F, -56F, 0F);

		bodyModel[68].addShapeBox(22F, -9F, -17F, 1, 1, 2, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 38
		bodyModel[68].setRotationPoint(0F, -56F, 0F);

		bodyModel[69].addShapeBox(22F, -8F, -17F, 1, 1, 2, 0F,-.3F, 0F, 1F, -.3F, 0F, 1F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F); // Box 39
		bodyModel[69].setRotationPoint(0F, -56F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 357, 111, textureX, textureY); // Box 40
		hipsModel[1] = new ModelRendererTurbo(this, 256, 73, textureX, textureY); // Box 41
		hipsModel[2] = new ModelRendererTurbo(this, 357, 74, textureX, textureY); // Box 42
		hipsModel[3] = new ModelRendererTurbo(this, 357, 87, textureX, textureY); // Box 43
		hipsModel[4] = new ModelRendererTurbo(this, 256, 96, textureX, textureY); // Box 44
		hipsModel[5] = new ModelRendererTurbo(this, 357, 122, textureX, textureY); // Box 45
		hipsModel[6] = new ModelRendererTurbo(this, 357, 137, textureX, textureY); // Box 46
		hipsModel[7] = new ModelRendererTurbo(this, 256, 127, textureX, textureY); // Box 47
		hipsModel[8] = new ModelRendererTurbo(this, 357, 100, textureX, textureY); // Box 48

		hipsModel[0].addShapeBox(-12F, 0F, 8F, 24, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F); // Box 40
		hipsModel[0].setRotationPoint(0F, -56F, 0F);

		hipsModel[1].addShapeBox(-12F, 0F, -8F, 24, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 41
		hipsModel[1].setRotationPoint(0F, -56F, 0F);

		hipsModel[2].addShapeBox(-12F, 0F, -12F, 24, 2, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 42
		hipsModel[2].setRotationPoint(0F, -56F, 0F);

		hipsModel[3].addShapeBox(-13F, 2F, -13F, 26, 5, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		hipsModel[3].setRotationPoint(0F, -56F, 0F);

		hipsModel[4].addShapeBox(-13F, 2F, -9F, 26, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[4].setRotationPoint(0F, -56F, 0F);

		hipsModel[5].addShapeBox(-13F, 2F, 9F, 26, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 45
		hipsModel[5].setRotationPoint(0F, -56F, 0F);

		hipsModel[6].addShapeBox(-13F, 7F, 9F, 26, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, -1.5F, -4F, 0F, -1.5F); // Box 46
		hipsModel[6].setRotationPoint(0F, -56F, 0F);

		hipsModel[7].addShapeBox(-13F, 7F, -9F, 26, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 47
		hipsModel[7].setRotationPoint(0F, -56F, 0F);

		hipsModel[8].addShapeBox(-13F, 7F, -13F, 26, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 48
		hipsModel[8].setRotationPoint(0F, -56F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 583, 23, textureX, textureY); // Box 49
		leftArmModel[1] = new ModelRendererTurbo(this, 834, 146, textureX, textureY); // Box 50
		leftArmModel[2] = new ModelRendererTurbo(this, 697, 123, textureX, textureY); // Box 51
		leftArmModel[3] = new ModelRendererTurbo(this, 579, 123, textureX, textureY); // Box 52
		leftArmModel[4] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 53
		leftArmModel[5] = new ModelRendererTurbo(this, 581, 96, textureX, textureY); // Box 54
		leftArmModel[6] = new ModelRendererTurbo(this, 579, 146, textureX, textureY); // Box 60
		leftArmModel[7] = new ModelRendererTurbo(this, 822, 121, textureX, textureY); // Box 61
		leftArmModel[8] = new ModelRendererTurbo(this, 779, 146, textureX, textureY); // Box 62
		leftArmModel[9] = new ModelRendererTurbo(this, 708, 146, textureX, textureY); // Box 63
		leftArmModel[10] = new ModelRendererTurbo(this, 655, 146, textureX, textureY); // Box 64
		leftArmModel[11] = new ModelRendererTurbo(this, 620, 146, textureX, textureY); // Box 65
		leftArmModel[12] = new ModelRendererTurbo(this, 583, 175, textureX, textureY); // Box 66
		leftArmModel[13] = new ModelRendererTurbo(this, 644, 123, textureX, textureY); // Box 67
		leftArmModel[14] = new ModelRendererTurbo(this, 642, 96, textureX, textureY); // Box 68
		leftArmModel[15] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 0
		leftArmModel[16] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 1
		leftArmModel[17] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 2
		leftArmModel[18] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 3
		leftArmModel[19] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 4
		leftArmModel[20] = new ModelRendererTurbo(this, 581, 77, textureX, textureY); // Box 5
		leftArmModel[21] = new ModelRendererTurbo(this, 782, 173, textureX, textureY); // Box 6
		leftArmModel[22] = new ModelRendererTurbo(this, 759, 173, textureX, textureY); // Box 7
		leftArmModel[23] = new ModelRendererTurbo(this, 650, 173, textureX, textureY); // Box 8
		leftArmModel[24] = new ModelRendererTurbo(this, 625, 173, textureX, textureY); // Box 9
		leftArmModel[25] = new ModelRendererTurbo(this, 805, 173, textureX, textureY); // Box 10
		leftArmModel[26] = new ModelRendererTurbo(this, 742, 173, textureX, textureY); // Box 11
		leftArmModel[27] = new ModelRendererTurbo(this, 696, 173, textureX, textureY); // Box 12
		leftArmModel[28] = new ModelRendererTurbo(this, 719, 173, textureX, textureY); // Box 13
		leftArmModel[29] = new ModelRendererTurbo(this, 673, 173, textureX, textureY); // Box 14
		leftArmModel[30] = new ModelRendererTurbo(this, 570, 237, textureX, textureY); // Box 15
		leftArmModel[31] = new ModelRendererTurbo(this, 637, 237, textureX, textureY); // Box 16
		leftArmModel[32] = new ModelRendererTurbo(this, 757, 261, textureX, textureY); // Box 17
		leftArmModel[33] = new ModelRendererTurbo(this, 698, 261, textureX, textureY); // Box 18
		leftArmModel[34] = new ModelRendererTurbo(this, 645, 261, textureX, textureY); // Box 19
		leftArmModel[35] = new ModelRendererTurbo(this, 610, 261, textureX, textureY); // Box 20
		leftArmModel[36] = new ModelRendererTurbo(this, 806, 261, textureX, textureY); // Box 21
		leftArmModel[37] = new ModelRendererTurbo(this, 573, 261, textureX, textureY); // Box 22
		leftArmModel[38] = new ModelRendererTurbo(this, 758, 237, textureX, textureY); // Box 23
		leftArmModel[39] = new ModelRendererTurbo(this, 567, 290, textureX, textureY); // Box 24
		leftArmModel[40] = new ModelRendererTurbo(this, 648, 211, textureX, textureY); // Box 25
		leftArmModel[41] = new ModelRendererTurbo(this, 575, 211, textureX, textureY); // Box 26
		leftArmModel[42] = new ModelRendererTurbo(this, 777, 292, textureX, textureY); // Box 0
		leftArmModel[43] = new ModelRendererTurbo(this, 800, 292, textureX, textureY); // Box 1
		leftArmModel[44] = new ModelRendererTurbo(this, 756, 292, textureX, textureY); // Box 2
		leftArmModel[45] = new ModelRendererTurbo(this, 739, 292, textureX, textureY); // Box 3
		leftArmModel[46] = new ModelRendererTurbo(this, 716, 292, textureX, textureY); // Box 4
		leftArmModel[47] = new ModelRendererTurbo(this, 693, 292, textureX, textureY); // Box 5
		leftArmModel[48] = new ModelRendererTurbo(this, 670, 292, textureX, textureY); // Box 6
		leftArmModel[49] = new ModelRendererTurbo(this, 647, 292, textureX, textureY); // Box 7
		leftArmModel[50] = new ModelRendererTurbo(this, 624, 292, textureX, textureY); // Box 8

		leftArmModel[0].addShapeBox(-2F, -13F, -6F, 4, 26, 12, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 49
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.6231562F;

		leftArmModel[1].addShapeBox(2F, -12F, -4F, 9, 8, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F); // Box 50
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.57079633F;

		leftArmModel[2].addShapeBox(11F, -15F, -4F, 48, 3, 8, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 51
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.57079633F;

		leftArmModel[3].addShapeBox(-2F, -15F, -6F, 13, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.57079633F;

		leftArmModel[4].addShapeBox(11F, -17F, -4F, 48, 2, 8, 0F,0F, 0F, 2F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 53
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		leftArmModel[5].addShapeBox(-2F, -17F, -6F, 13, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -1.57079633F;

		leftArmModel[6].addShapeBox(59F, -12F, -4F, 5, 5, 8, 0F,0F, 0F, 0F, .5F, 0F, -2F, .5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 60
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -1.57079633F;

		leftArmModel[7].addShapeBox(59F, -15F, -4F, 5, 3, 8, 0F,0F, 0F, -1F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, .5F, 0F, -2F, .5F, 0F, -2F, 0F, 0F, 0F); // Box 61
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -1.57079633F;

		leftArmModel[8].addShapeBox(11F, -12F, -4F, 11, 8, 8, 0F,0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F); // Box 62
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.57079633F;

		leftArmModel[9].addShapeBox(22F, -12F, -4F, 19, 6, 8, 0F,0F, 0F, 1.5F, 0F, 0F, .6F, 0F, 0F, .6F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 63
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.57079633F;

		leftArmModel[10].addShapeBox(41F, -12F, -4F, 14, 4, 8, 0F,0F, 0F, .6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 64
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.57079633F;

		leftArmModel[11].addShapeBox(55F, -12F, -4F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -3F); // Box 65
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.57079633F;

		leftArmModel[12].addShapeBox(59F, -7F, -4F, 5, 6, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -2F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, -2F, -2F, -4F); // Box 66
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.57079633F;

		leftArmModel[13].addShapeBox(-8F, -15F, -6F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 67
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = -1.57079633F;

		leftArmModel[14].addShapeBox(-8F, -17F, -6F, 6, 2, 12, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = -1.57079633F;

		leftArmModel[15].addShapeBox(-10F, -19F, -6F, 8, 2, 2, 0F,3F, 0F, 3F, 0F, 1F, 2F, 0F, 1F, -2F, 3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = -1.57079633F;

		leftArmModel[16].addShapeBox(-2F, -20F, -6F, 6, 3, 2, 0F,0F, 0F, 2F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = -1.57079633F;

		leftArmModel[17].addShapeBox(4F, -19F, -6F, 7, 2, 2, 0F,0F, 2F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = -1.57079633F;

		leftArmModel[18].addShapeBox(4F, -19F, 4F, 7, 2, 2, 0F,0F, 2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);
		leftArmModel[18].rotateAngleZ = -1.57079633F;

		leftArmModel[19].addShapeBox(-2F, -20F, 4F, 6, 3, 2, 0F,0F, 0F, -2F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
		leftArmModel[19].rotateAngleZ = -1.57079633F;

		leftArmModel[20].addShapeBox(-10F, -19F, 4F, 8, 2, 2, 0F,3F, 0F, -4F, 0F, 1F, -2F, 0F, 1F, 2F, 3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);
		leftArmModel[20].rotateAngleZ = -1.57079633F;

		leftArmModel[21].addShapeBox(16F, -9F, -0.5F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -2F, -.4F, 0F, -2F, -.4F, 0F, 0F, -.4F); // Box 6
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -1.57079633F;

		leftArmModel[22].addShapeBox(22F, -9F, -0.5F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F); // Box 7
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = -1.57079633F;

		leftArmModel[23].addShapeBox(48F, -9F, -0.5F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, 0F, -.4F); // Box 8
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);
		leftArmModel[23].rotateAngleZ = -1.57079633F;

		leftArmModel[24].addShapeBox(55F, -9F, -0.5F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F); // Box 9
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);
		leftArmModel[24].rotateAngleZ = -1.57079633F;

		leftArmModel[25].addShapeBox(11F, -9F, -0.5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F); // Box 10
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);
		leftArmModel[25].rotateAngleZ = -1.57079633F;

		leftArmModel[26].addShapeBox(27F, -9F, -0.5F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -2F, -.4F, 0F, -2F, -.4F, 0F, 0F, -.4F); // Box 11
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = -1.57079633F;

		leftArmModel[27].addShapeBox(37F, -9F, -0.5F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -2F, -.4F, 0F, -2F, -.4F, 0F, 0F, -.4F); // Box 12
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -1.57079633F;

		leftArmModel[28].addShapeBox(32F, -9F, -0.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F); // Box 13
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);
		leftArmModel[28].rotateAngleZ = -1.57079633F;

		leftArmModel[29].addShapeBox(41F, -9F, -0.5F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F); // Box 14
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
		leftArmModel[29].rotateAngleZ = -1.57079633F;

		leftArmModel[30].addShapeBox(-1F, 11F, -6F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 15
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);
		leftArmModel[30].rotateAngleZ = -1.72787596F;

		leftArmModel[31].addShapeBox(12F, 11F, -4F, 46, 4, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 16
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);
		leftArmModel[31].rotateAngleZ = -1.72787596F;

		leftArmModel[32].addShapeBox(12F, 4F, -4F, 11, 7, 8, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F); // Box 17
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);
		leftArmModel[32].rotateAngleZ = -1.72787596F;

		leftArmModel[33].addShapeBox(23F, 6F, -4F, 18, 5, 8, 0F,0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, .6F, 0F, 0F, .6F, 0F, 0F, 1.5F); // Box 18
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = -1.72787596F;

		leftArmModel[34].addShapeBox(41F, 8F, -4F, 13, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F); // Box 19
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);
		leftArmModel[34].rotateAngleZ = -1.72787596F;

		leftArmModel[35].addShapeBox(54F, 8F, -4F, 4, 3, 8, 0F,0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);
		leftArmModel[35].rotateAngleZ = -1.72787596F;

		leftArmModel[36].addShapeBox(3F, 4F, -4F, 9, 7, 8, 0F,0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 21
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);
		leftArmModel[36].rotateAngleZ = -1.72787596F;

		leftArmModel[37].addShapeBox(58F, 7F, -4F, 5, 4, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, .5F, 0F, -2F, .5F, 0F, -2F, 0F, 0F, 0F); // Box 22
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -1.72787596F;

		leftArmModel[38].addShapeBox(58F, 11F, -4F, 5, 4, 8, 0F,0F, 0F, 0F, .5F, 0F, -2F, .5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, 0F, -1F); // Box 23
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = -1.72787596F;

		leftArmModel[39].addShapeBox(58F, 1F, -4F, 5, 6, 8, 0F,-2F, -2F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, -2F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 24
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);
		leftArmModel[39].rotateAngleZ = -1.72787596F;

		leftArmModel[40].addShapeBox(12F, 15F, -4F, 46, 2, 8, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 3F, 2F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 3F, 2F); // Box 25
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);
		leftArmModel[40].rotateAngleZ = -1.72787596F;

		leftArmModel[41].addShapeBox(-1F, 15F, -6F, 13, 5, 12, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F); // Box 26
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);
		leftArmModel[41].rotateAngleZ = -1.72787596F;

		leftArmModel[42].addShapeBox(17F, 3F, -0.5F, 6, 6, 1, 0F,0F, 0F, -.4F, 0F, -2F, -.4F, 0F, -2F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);
		leftArmModel[42].rotateAngleZ = -1.72787596F;

		leftArmModel[43].addShapeBox(12F, 3F, -0.5F, 5, 6, 1, 0F,0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);
		leftArmModel[43].rotateAngleZ = -1.72787596F;

		leftArmModel[44].addShapeBox(23F, 4F, -0.5F, 4, 5, 1, 0F,0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);
		leftArmModel[44].rotateAngleZ = -1.72787596F;

		leftArmModel[45].addShapeBox(27F, 4F, -0.5F, 4, 5, 1, 0F,0F, 0F, -.4F, 0F, -2F, -.4F, 0F, -2F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);
		leftArmModel[45].rotateAngleZ = -1.72787596F;

		leftArmModel[46].addShapeBox(31F, 5F, -0.5F, 5, 4, 1, 0F,0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);
		leftArmModel[46].rotateAngleZ = -1.72787596F;

		leftArmModel[47].addShapeBox(36F, 5F, -0.5F, 5, 4, 1, 0F,0F, 0F, -.4F, 0F, -2F, -.4F, 0F, -2F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);
		leftArmModel[47].rotateAngleZ = -1.72787596F;

		leftArmModel[48].addShapeBox(41F, 6F, -0.5F, 7, 3, 1, 0F,0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);
		leftArmModel[48].rotateAngleZ = -1.72787596F;

		leftArmModel[49].addShapeBox(48F, 6F, -0.5F, 6, 3, 1, 0F,0F, 0F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);
		leftArmModel[49].rotateAngleZ = -1.72787596F;

		leftArmModel[50].addShapeBox(54F, 6F, -0.5F, 5, 3, 1, 0F,0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);
		leftArmModel[50].rotateAngleZ = -1.72787596F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 9
		rightArmModel[1] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 10
		rightArmModel[2] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 11
		rightArmModel[3] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 12
		rightArmModel[4] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 13
		rightArmModel[5] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 14
		rightArmModel[6] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 15
		rightArmModel[7] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 16
		rightArmModel[8] = new ModelRendererTurbo(this, 444, 77, textureX, textureY); // Box 17
		rightArmModel[9] = new ModelRendererTurbo(this, 500, 122, textureX, textureY); // Box 27
		rightArmModel[10] = new ModelRendererTurbo(this, 500, 131, textureX, textureY); // Box 29
		rightArmModel[11] = new ModelRendererTurbo(this, 500, 115, textureX, textureY); // Box 31
		rightArmModel[12] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 32
		rightArmModel[13] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 33
		rightArmModel[14] = new ModelRendererTurbo(this, 511, 81, textureX, textureY); // Box 34
		rightArmModel[15] = new ModelRendererTurbo(this, 511, 81, textureX, textureY); // Box 35
		rightArmModel[16] = new ModelRendererTurbo(this, 511, 81, textureX, textureY); // Box 36
		rightArmModel[17] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 37
		rightArmModel[18] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 38
		rightArmModel[19] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 39
		rightArmModel[20] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 40
		rightArmModel[21] = new ModelRendererTurbo(this, 506, 145, textureX, textureY); // Box 41
		rightArmModel[22] = new ModelRendererTurbo(this, 541, 145, textureX, textureY); // Box 42
		rightArmModel[23] = new ModelRendererTurbo(this, 503, 161, textureX, textureY); // Box 43
		rightArmModel[24] = new ModelRendererTurbo(this, 503, 206, textureX, textureY); // Box 44
		rightArmModel[25] = new ModelRendererTurbo(this, 503, 223, textureX, textureY); // Box 45
		rightArmModel[26] = new ModelRendererTurbo(this, 525, 160, textureX, textureY); // Box 46
		rightArmModel[27] = new ModelRendererTurbo(this, 503, 174, textureX, textureY); // Box 47
		rightArmModel[28] = new ModelRendererTurbo(this, 503, 189, textureX, textureY); // Box 48
		rightArmModel[29] = new ModelRendererTurbo(this, 525, 181, textureX, textureY); // Box 49
		rightArmModel[30] = new ModelRendererTurbo(this, 525, 171, textureX, textureY); // Box 50
		rightArmModel[31] = new ModelRendererTurbo(this, 504, 272, textureX, textureY); // Box 51
		rightArmModel[32] = new ModelRendererTurbo(this, 504, 283, textureX, textureY); // Box 52
		rightArmModel[33] = new ModelRendererTurbo(this, 504, 294, textureX, textureY); // Box 53
		rightArmModel[34] = new ModelRendererTurbo(this, 504, 239, textureX, textureY); // Box 54
		rightArmModel[35] = new ModelRendererTurbo(this, 504, 239, textureX, textureY); // Box 55
		rightArmModel[36] = new ModelRendererTurbo(this, 504, 239, textureX, textureY); // Box 56
		rightArmModel[37] = new ModelRendererTurbo(this, 504, 250, textureX, textureY); // Box 57
		rightArmModel[38] = new ModelRendererTurbo(this, 504, 261, textureX, textureY); // Box 58
		rightArmModel[39] = new ModelRendererTurbo(this, 439, 131, textureX, textureY); // Box 59
		rightArmModel[40] = new ModelRendererTurbo(this, 439, 122, textureX, textureY); // Box 60
		rightArmModel[41] = new ModelRendererTurbo(this, 439, 115, textureX, textureY); // Box 61
		rightArmModel[42] = new ModelRendererTurbo(this, 439, 145, textureX, textureY); // Box 62
		rightArmModel[43] = new ModelRendererTurbo(this, 474, 145, textureX, textureY); // Box 63
		rightArmModel[44] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 64
		rightArmModel[45] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 65
		rightArmModel[46] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 66
		rightArmModel[47] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 67
		rightArmModel[48] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 68
		rightArmModel[49] = new ModelRendererTurbo(this, 511, 91, textureX, textureY); // Box 69
		rightArmModel[50] = new ModelRendererTurbo(this, 511, 81, textureX, textureY); // Box 70
		rightArmModel[51] = new ModelRendererTurbo(this, 511, 81, textureX, textureY); // Box 71
		rightArmModel[52] = new ModelRendererTurbo(this, 511, 81, textureX, textureY); // Box 72
		rightArmModel[53] = new ModelRendererTurbo(this, 439, 161, textureX, textureY); // Box 73
		rightArmModel[54] = new ModelRendererTurbo(this, 439, 174, textureX, textureY); // Box 74
		rightArmModel[55] = new ModelRendererTurbo(this, 439, 189, textureX, textureY); // Box 75
		rightArmModel[56] = new ModelRendererTurbo(this, 439, 206, textureX, textureY); // Box 76
		rightArmModel[57] = new ModelRendererTurbo(this, 439, 223, textureX, textureY); // Box 77
		rightArmModel[58] = new ModelRendererTurbo(this, 461, 160, textureX, textureY); // Box 78
		rightArmModel[59] = new ModelRendererTurbo(this, 461, 181, textureX, textureY); // Box 79
		rightArmModel[60] = new ModelRendererTurbo(this, 461, 171, textureX, textureY); // Box 80
		rightArmModel[61] = new ModelRendererTurbo(this, 443, 272, textureX, textureY); // Box 81
		rightArmModel[62] = new ModelRendererTurbo(this, 443, 239, textureX, textureY); // Box 82
		rightArmModel[63] = new ModelRendererTurbo(this, 443, 239, textureX, textureY); // Box 83
		rightArmModel[64] = new ModelRendererTurbo(this, 443, 283, textureX, textureY); // Box 84
		rightArmModel[65] = new ModelRendererTurbo(this, 443, 239, textureX, textureY); // Box 85
		rightArmModel[66] = new ModelRendererTurbo(this, 443, 294, textureX, textureY); // Box 86
		rightArmModel[67] = new ModelRendererTurbo(this, 443, 250, textureX, textureY); // Box 87
		rightArmModel[68] = new ModelRendererTurbo(this, 443, 261, textureX, textureY); // Box 88

		rightArmModel[0].addShapeBox(-2F, -1F, -14F, 4, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -2.05948852F;

		rightArmModel[1].addShapeBox(-2F, 1F, -14F, 4, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -2.05948852F;

		rightArmModel[2].addShapeBox(-2F, -2F, -14F, 4, 1, 28, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -2.05948852F;

		rightArmModel[3].addShapeBox(-2F, -2F, 14F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -2.05948852F;

		rightArmModel[4].addShapeBox(-2F, -1F, 14F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -2.05948852F;

		rightArmModel[5].addShapeBox(-2F, 1F, 14F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 14
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -2.05948852F;

		rightArmModel[6].addShapeBox(-2F, 1F, -15F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -2.05948852F;

		rightArmModel[7].addShapeBox(-2F, -1F, -15F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -2.05948852F;

		rightArmModel[8].addShapeBox(-2F, -2F, -15F, 4, 1, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -2.05948852F;

		rightArmModel[9].addShapeBox(0F, -1.5F, 12F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 27
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -2.44346095F;

		rightArmModel[10].addShapeBox(0F, -1.5F, 11F, 23, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 29
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -2.44346095F;

		rightArmModel[11].addShapeBox(0F, -1.5F, 13F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, -.5F, 6F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 6F, 0F, -.5F, 0F); // Box 31
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -2.44346095F;

		rightArmModel[12].addShapeBox(16F, 13F, 19.5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 32
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -1.74532925F;

		rightArmModel[13].addShapeBox(16F, 13F, 17.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
		rightArmModel[13].rotateAngleZ = -1.74532925F;

		rightArmModel[14].addShapeBox(16F, 12F, 17.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
		rightArmModel[14].rotateAngleZ = -1.74532925F;

		rightArmModel[15].addShapeBox(16F, 12F, 19.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
		rightArmModel[15].rotateAngleZ = -1.74532925F;

		rightArmModel[16].addShapeBox(16F, 12F, 16.5F, 4, 1, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
		rightArmModel[16].rotateAngleZ = -1.74532925F;

		rightArmModel[17].addShapeBox(16F, 13F, 16.5F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);
		rightArmModel[17].rotateAngleZ = -1.74532925F;

		rightArmModel[18].addShapeBox(16F, 15F, 16.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);
		rightArmModel[18].rotateAngleZ = -1.74532925F;

		rightArmModel[19].addShapeBox(16F, 15F, 17.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 39
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
		rightArmModel[19].rotateAngleZ = -1.74532925F;

		rightArmModel[20].addShapeBox(16F, 15F, 19.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 40
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
		rightArmModel[20].rotateAngleZ = -1.74532925F;

		rightArmModel[21].addShapeBox(2F, -1.5F, 15F, 10, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, -.8F, 0F, 0F, 0F, 0F); // Box 41
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
		rightArmModel[21].rotateAngleZ = -2.44346095F;

		rightArmModel[22].addShapeBox(-1F, -1.5F, 15F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F); // Box 42
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = -2.44346095F;

		rightArmModel[23].addShapeBox(16.5F, 11F, 17F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F); // Box 43
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);
		rightArmModel[23].rotateAngleZ = -1.74532925F;

		rightArmModel[24].addShapeBox(17F, -11F, 17.5F, 2, 6, 2, 0F,.5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);
		rightArmModel[24].rotateAngleZ = -1.74532925F;

		rightArmModel[25].addShapeBox(16.5F, -12F, 17F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);
		rightArmModel[25].rotateAngleZ = -1.74532925F;

		rightArmModel[26].addShapeBox(16.5F, -14F, 17F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = -1.74532925F;

		rightArmModel[27].addShapeBox(17F, 4F, 17.5F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 47
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);
		rightArmModel[27].rotateAngleZ = -1.74532925F;

		rightArmModel[28].addBox(17F, -5F, 17.5F, 2, 9, 2, 0F); // Box 48
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);
		rightArmModel[28].rotateAngleZ = -1.74532925F;

		rightArmModel[29].addShapeBox(15.5F, -14F, 17F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 49
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = -1.74532925F;

		rightArmModel[30].addShapeBox(15.5F, -15F, 17F, 2, 1, 3, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = -1.74532925F;

		rightArmModel[31].addShapeBox(9.5F, -21.5F, 17.5F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 51
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);
		rightArmModel[31].rotateAngleZ = -2.16420827F;

		rightArmModel[32].addShapeBox(17.5F, -21.5F, 17.5F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 52
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);
		rightArmModel[32].rotateAngleZ = -2.16420827F;

		rightArmModel[33].addShapeBox(24.5F, -21.5F, 17.5F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.6F, 0F, -1F, -.6F, 0F, 0F, 0F); // Box 53
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);
		rightArmModel[33].rotateAngleZ = -2.16420827F;

		rightArmModel[34].addShapeBox(9.5F, -22.5F, 17.5F, 8, 1, 2, 0F,2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);
		rightArmModel[34].rotateAngleZ = -2.16420827F;

		rightArmModel[35].addShapeBox(17.5F, -22.5F, 17.5F, 7, 1, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);
		rightArmModel[35].rotateAngleZ = -2.16420827F;

		rightArmModel[36].addShapeBox(24.5F, -22.5F, 17.5F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);
		rightArmModel[36].rotateAngleZ = -2.16420827F;

		rightArmModel[37].addShapeBox(34.5F, -21.5F, 17.5F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 1F, -.7F, 0F, 1F, -.7F, 0F, 0F, -.6F); // Box 57
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);
		rightArmModel[37].rotateAngleZ = -2.16420827F;

		rightArmModel[38].addShapeBox(40.5F, -20.5F, 17.5F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -4.5F, -.5F, 0F, -4.5F, -.5F, 0F, 0F, 0F, 0F, 0F, -.7F, 1.5F, 4F, -.85F, 1.5F, 4F, -.85F, 0F, 0F, -.7F); // Box 58
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);
		rightArmModel[38].rotateAngleZ = -2.16420827F;

		rightArmModel[39].addShapeBox(0F, -1.5F, -12F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, -.5F, -6F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -.5F, -6F, 0F, -.5F, 0F); // Box 59
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);
		rightArmModel[39].rotateAngleZ = -2.44346095F;

		rightArmModel[40].addShapeBox(0F, -1.5F, -13F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 60
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);
		rightArmModel[40].rotateAngleZ = -2.44346095F;

		rightArmModel[41].addShapeBox(0F, -1.5F, -14F, 23, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 61
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);
		rightArmModel[41].rotateAngleZ = -2.44346095F;

		rightArmModel[42].addShapeBox(2F, -1.5F, -17F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, 0F, -.5F, 0F, 1F, 0F); // Box 62
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);
		rightArmModel[42].rotateAngleZ = -2.44346095F;

		rightArmModel[43].addShapeBox(-1F, -1.5F, -17F, 3, 3, 2, 0F,1F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 63
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);
		rightArmModel[43].rotateAngleZ = -2.44346095F;

		rightArmModel[44].addShapeBox(16F, 13F, -17.5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 64
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);
		rightArmModel[44].rotateAngleZ = -1.74532925F;

		rightArmModel[45].addShapeBox(16F, 13F, -19.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);
		rightArmModel[45].rotateAngleZ = -1.74532925F;

		rightArmModel[46].addShapeBox(16F, 13F, -20.5F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);
		rightArmModel[46].rotateAngleZ = -1.74532925F;

		rightArmModel[47].addShapeBox(16F, 15F, -20.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 67
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);
		rightArmModel[47].rotateAngleZ = -1.74532925F;

		rightArmModel[48].addShapeBox(16F, 15F, -19.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 68
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);
		rightArmModel[48].rotateAngleZ = -1.74532925F;

		rightArmModel[49].addShapeBox(16F, 15F, -17.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 69
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);
		rightArmModel[49].rotateAngleZ = -1.74532925F;

		rightArmModel[50].addShapeBox(16F, 12F, -20.5F, 4, 1, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);
		rightArmModel[50].rotateAngleZ = -1.74532925F;

		rightArmModel[51].addShapeBox(16F, 12F, -19.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightArmModel[51].setRotationPoint(0F, 0F, 0F);
		rightArmModel[51].rotateAngleZ = -1.74532925F;

		rightArmModel[52].addShapeBox(16F, 12F, -17.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 72
		rightArmModel[52].setRotationPoint(0F, 0F, 0F);
		rightArmModel[52].rotateAngleZ = -1.74532925F;

		rightArmModel[53].addShapeBox(16.5F, 11F, -20F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F); // Box 73
		rightArmModel[53].setRotationPoint(0F, 0F, 0F);
		rightArmModel[53].rotateAngleZ = -1.74532925F;

		rightArmModel[54].addShapeBox(17F, 4F, -19.5F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 74
		rightArmModel[54].setRotationPoint(0F, 0F, 0F);
		rightArmModel[54].rotateAngleZ = -1.74532925F;

		rightArmModel[55].addBox(17F, -5F, -19.5F, 2, 9, 2, 0F); // Box 75
		rightArmModel[55].setRotationPoint(0F, 0F, 0F);
		rightArmModel[55].rotateAngleZ = -1.74532925F;

		rightArmModel[56].addShapeBox(17F, -11F, -19.5F, 2, 6, 2, 0F,.5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightArmModel[56].setRotationPoint(0F, 0F, 0F);
		rightArmModel[56].rotateAngleZ = -1.74532925F;

		rightArmModel[57].addShapeBox(16.5F, -12F, -20F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		rightArmModel[57].setRotationPoint(0F, 0F, 0F);
		rightArmModel[57].rotateAngleZ = -1.74532925F;

		rightArmModel[58].addShapeBox(16.5F, -14F, -20F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 78
		rightArmModel[58].setRotationPoint(0F, 0F, 0F);
		rightArmModel[58].rotateAngleZ = -1.74532925F;

		rightArmModel[59].addShapeBox(15.5F, -14F, -20F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		rightArmModel[59].setRotationPoint(0F, 0F, 0F);
		rightArmModel[59].rotateAngleZ = -1.74532925F;

		rightArmModel[60].addShapeBox(15.5F, -15F, -20F, 2, 1, 3, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		rightArmModel[60].setRotationPoint(0F, 0F, 0F);
		rightArmModel[60].rotateAngleZ = -1.74532925F;

		rightArmModel[61].addShapeBox(9.5F, -21.5F, -19.5F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 81
		rightArmModel[61].setRotationPoint(0F, 0F, 0F);
		rightArmModel[61].rotateAngleZ = -2.16420827F;

		rightArmModel[62].addShapeBox(9.5F, -22.5F, -19.5F, 8, 1, 2, 0F,2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightArmModel[62].setRotationPoint(0F, 0F, 0F);
		rightArmModel[62].rotateAngleZ = -2.16420827F;

		rightArmModel[63].addShapeBox(17.5F, -22.5F, -19.5F, 7, 1, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		rightArmModel[63].setRotationPoint(0F, 0F, 0F);
		rightArmModel[63].rotateAngleZ = -2.16420827F;

		rightArmModel[64].addShapeBox(17.5F, -21.5F, -19.5F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 84
		rightArmModel[64].setRotationPoint(0F, 0F, 0F);
		rightArmModel[64].rotateAngleZ = -2.16420827F;

		rightArmModel[65].addShapeBox(24.5F, -22.5F, -19.5F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		rightArmModel[65].setRotationPoint(0F, 0F, 0F);
		rightArmModel[65].rotateAngleZ = -2.16420827F;

		rightArmModel[66].addShapeBox(24.5F, -21.5F, -19.5F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.6F, 0F, -1F, -.6F, 0F, 0F, 0F); // Box 86
		rightArmModel[66].setRotationPoint(0F, 0F, 0F);
		rightArmModel[66].rotateAngleZ = -2.16420827F;

		rightArmModel[67].addShapeBox(34.5F, -21.5F, -19.5F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 1F, -.7F, 0F, 1F, -.7F, 0F, 0F, -.6F); // Box 87
		rightArmModel[67].setRotationPoint(0F, 0F, 0F);
		rightArmModel[67].rotateAngleZ = -2.16420827F;

		rightArmModel[68].addShapeBox(40.5F, -20.5F, -19.5F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -4.5F, -.5F, 0F, -4.5F, -.5F, 0F, 0F, 0F, 0F, 0F, -.7F, 1.5F, 4F, -.85F, 1.5F, 4F, -.85F, 0F, 0F, -.7F); // Box 88
		rightArmModel[68].setRotationPoint(0F, 0F, 0F);
		rightArmModel[68].rotateAngleZ = -2.16420827F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 115
		leftLegModel[1] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 116
		leftLegModel[2] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 117
		leftLegModel[3] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 118
		leftLegModel[4] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 119
		leftLegModel[5] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 120
		leftLegModel[6] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 121
		leftLegModel[7] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 122
		leftLegModel[8] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 123
		leftLegModel[9] = new ModelRendererTurbo(this, 395, 370, textureX, textureY); // Box 133
		leftLegModel[10] = new ModelRendererTurbo(this, 395, 347, textureX, textureY); // Box 1
		leftLegModel[11] = new ModelRendererTurbo(this, 395, 393, textureX, textureY); // Box 2
		leftLegModel[12] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 3
		leftLegModel[13] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 4
		leftLegModel[14] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 5
		leftLegModel[15] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 6
		leftLegModel[16] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 7
		leftLegModel[17] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 8
		leftLegModel[18] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 9
		leftLegModel[19] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 10
		leftLegModel[20] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 11
		leftLegModel[21] = new ModelRendererTurbo(this, 430, 393, textureX, textureY); // Box 15
		leftLegModel[22] = new ModelRendererTurbo(this, 430, 370, textureX, textureY); // Box 16
		leftLegModel[23] = new ModelRendererTurbo(this, 430, 347, textureX, textureY); // Box 17
		leftLegModel[24] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 18
		leftLegModel[25] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 19
		leftLegModel[26] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 20
		leftLegModel[27] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 21
		leftLegModel[28] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 22
		leftLegModel[29] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 23
		leftLegModel[30] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 24
		leftLegModel[31] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 25
		leftLegModel[32] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 26
		leftLegModel[33] = new ModelRendererTurbo(this, 395, 393, textureX, textureY); // Box 27
		leftLegModel[34] = new ModelRendererTurbo(this, 395, 370, textureX, textureY); // Box 28
		leftLegModel[35] = new ModelRendererTurbo(this, 395, 347, textureX, textureY); // Box 29
		leftLegModel[36] = new ModelRendererTurbo(this, 430, 370, textureX, textureY); // Box 30
		leftLegModel[37] = new ModelRendererTurbo(this, 430, 393, textureX, textureY); // Box 31
		leftLegModel[38] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 32
		leftLegModel[39] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 33
		leftLegModel[40] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 34
		leftLegModel[41] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 35
		leftLegModel[42] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 36
		leftLegModel[43] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 37
		leftLegModel[44] = new ModelRendererTurbo(this, 430, 347, textureX, textureY); // Box 38
		leftLegModel[45] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 39
		leftLegModel[46] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 40
		leftLegModel[47] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 41
		leftLegModel[48] = new ModelRendererTurbo(this, 390, 462, textureX, textureY); // Box 42
		leftLegModel[49] = new ModelRendererTurbo(this, 390, 479, textureX, textureY); // Box 43
		leftLegModel[50] = new ModelRendererTurbo(this, 390, 445, textureX, textureY); // Box 44
		leftLegModel[51] = new ModelRendererTurbo(this, 390, 509, textureX, textureY); // Box 46
		leftLegModel[52] = new ModelRendererTurbo(this, 390, 496, textureX, textureY); // Box 48
		leftLegModel[53] = new ModelRendererTurbo(this, 390, 522, textureX, textureY); // Box 49
		leftLegModel[54] = new ModelRendererTurbo(this, 407, 537, textureX, textureY); // Box 50
		leftLegModel[55] = new ModelRendererTurbo(this, 422, 537, textureX, textureY); // Box 52
		leftLegModel[56] = new ModelRendererTurbo(this, 390, 537, textureX, textureY); // Box 53
		leftLegModel[57] = new ModelRendererTurbo(this, 473, 431, textureX, textureY); // Box 54
		leftLegModel[58] = new ModelRendererTurbo(this, 473, 431, textureX, textureY); // Box 55
		leftLegModel[59] = new ModelRendererTurbo(this, 473, 431, textureX, textureY); // Box 56
		leftLegModel[60] = new ModelRendererTurbo(this, 473, 448, textureX, textureY); // Box 57
		leftLegModel[61] = new ModelRendererTurbo(this, 473, 448, textureX, textureY); // Box 58
		leftLegModel[62] = new ModelRendererTurbo(this, 473, 448, textureX, textureY); // Box 59
		leftLegModel[63] = new ModelRendererTurbo(this, 473, 471, textureX, textureY); // Box 60
		leftLegModel[64] = new ModelRendererTurbo(this, 473, 471, textureX, textureY); // Box 61
		leftLegModel[65] = new ModelRendererTurbo(this, 473, 494, textureX, textureY); // Box 64
		leftLegModel[66] = new ModelRendererTurbo(this, 473, 494, textureX, textureY); // Box 65
		leftLegModel[67] = new ModelRendererTurbo(this, 473, 519, textureX, textureY); // Box 66
		leftLegModel[68] = new ModelRendererTurbo(this, 473, 519, textureX, textureY); // Box 67
		leftLegModel[69] = new ModelRendererTurbo(this, 473, 519, textureX, textureY); // Box 68
		leftLegModel[70] = new ModelRendererTurbo(this, 473, 494, textureX, textureY); // Box 69
		leftLegModel[71] = new ModelRendererTurbo(this, 473, 471, textureX, textureY); // Box 70
		leftLegModel[72] = new ModelRendererTurbo(this, 390, 445, textureX, textureY); // Box 71
		leftLegModel[73] = new ModelRendererTurbo(this, 390, 462, textureX, textureY); // Box 72
		leftLegModel[74] = new ModelRendererTurbo(this, 390, 479, textureX, textureY); // Box 73
		leftLegModel[75] = new ModelRendererTurbo(this, 390, 522, textureX, textureY); // Box 74
		leftLegModel[76] = new ModelRendererTurbo(this, 390, 509, textureX, textureY); // Box 75
		leftLegModel[77] = new ModelRendererTurbo(this, 390, 496, textureX, textureY); // Box 76
		leftLegModel[78] = new ModelRendererTurbo(this, 473, 448, textureX, textureY); // Box 77
		leftLegModel[79] = new ModelRendererTurbo(this, 473, 448, textureX, textureY); // Box 78
		leftLegModel[80] = new ModelRendererTurbo(this, 473, 448, textureX, textureY); // Box 79
		leftLegModel[81] = new ModelRendererTurbo(this, 473, 431, textureX, textureY); // Box 80
		leftLegModel[82] = new ModelRendererTurbo(this, 473, 431, textureX, textureY); // Box 81
		leftLegModel[83] = new ModelRendererTurbo(this, 473, 431, textureX, textureY); // Box 82
		leftLegModel[84] = new ModelRendererTurbo(this, 473, 471, textureX, textureY); // Box 83
		leftLegModel[85] = new ModelRendererTurbo(this, 473, 471, textureX, textureY); // Box 84
		leftLegModel[86] = new ModelRendererTurbo(this, 473, 471, textureX, textureY); // Box 85
		leftLegModel[87] = new ModelRendererTurbo(this, 473, 494, textureX, textureY); // Box 86
		leftLegModel[88] = new ModelRendererTurbo(this, 473, 494, textureX, textureY); // Box 87
		leftLegModel[89] = new ModelRendererTurbo(this, 473, 494, textureX, textureY); // Box 88
		leftLegModel[90] = new ModelRendererTurbo(this, 473, 519, textureX, textureY); // Box 89
		leftLegModel[91] = new ModelRendererTurbo(this, 473, 519, textureX, textureY); // Box 90
		leftLegModel[92] = new ModelRendererTurbo(this, 473, 519, textureX, textureY); // Box 91
		leftLegModel[93] = new ModelRendererTurbo(this, 390, 537, textureX, textureY); // Box 92
		leftLegModel[94] = new ModelRendererTurbo(this, 407, 537, textureX, textureY); // Box 93
		leftLegModel[95] = new ModelRendererTurbo(this, 422, 537, textureX, textureY); // Box 94

		leftLegModel[0].addShapeBox(-5F, 2F, -2F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 115
		leftLegModel[0].setRotationPoint(9F, -48F, 13F);
		leftLegModel[0].rotateAngleZ = 0.27925268F;

		leftLegModel[1].addShapeBox(-5F, 2F, 2F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 116
		leftLegModel[1].setRotationPoint(9F, -48F, 13F);
		leftLegModel[1].rotateAngleZ = 0.27925268F;

		leftLegModel[2].addShapeBox(-5F, 2F, -5F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 117
		leftLegModel[2].setRotationPoint(9F, -48F, 13F);
		leftLegModel[2].rotateAngleZ = 0.27925268F;

		leftLegModel[3].addShapeBox(-5F, -2F, -5F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftLegModel[3].setRotationPoint(9F, -48F, 13F);
		leftLegModel[3].rotateAngleZ = 0.27925268F;

		leftLegModel[4].addShapeBox(-5F, -2F, -2F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftLegModel[4].setRotationPoint(9F, -48F, 13F);
		leftLegModel[4].rotateAngleZ = 0.27925268F;

		leftLegModel[5].addShapeBox(-5F, -2F, 2F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 120
		leftLegModel[5].setRotationPoint(9F, -48F, 13F);
		leftLegModel[5].rotateAngleZ = 0.27925268F;

		leftLegModel[6].addShapeBox(-5F, -5F, 2F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 121
		leftLegModel[6].setRotationPoint(9F, -48F, 13F);
		leftLegModel[6].rotateAngleZ = 0.27925268F;

		leftLegModel[7].addShapeBox(-5F, -5F, -2F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftLegModel[7].setRotationPoint(9F, -48F, 13F);
		leftLegModel[7].rotateAngleZ = 0.27925268F;

		leftLegModel[8].addShapeBox(-5F, -5F, -5F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		leftLegModel[8].setRotationPoint(9F, -48F, 13F);
		leftLegModel[8].rotateAngleZ = 0.27925268F;

		leftLegModel[9].addShapeBox(-3F, 1F, -1F, 6, 12, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 133
		leftLegModel[9].setRotationPoint(9F, -48F, 13F);
		leftLegModel[9].rotateAngleZ = 0.27925268F;

		leftLegModel[10].addShapeBox(-3F, 1F, 1F, 6, 12, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 3F); // Box 1
		leftLegModel[10].setRotationPoint(9F, -48F, 13F);
		leftLegModel[10].rotateAngleZ = 0.27925268F;

		leftLegModel[11].addShapeBox(-3F, 1F, -3F, 6, 12, 2, 0F,-1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 2
		leftLegModel[11].setRotationPoint(9F, -48F, 13F);
		leftLegModel[11].rotateAngleZ = 0.27925268F;

		leftLegModel[12].addShapeBox(-5F, 29F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 3
		leftLegModel[12].setRotationPoint(9F, -48F, 13F);
		leftLegModel[12].rotateAngleZ = 0.27925268F;

		leftLegModel[13].addShapeBox(-5F, 29F, 3F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 4
		leftLegModel[13].setRotationPoint(9F, -48F, 13F);
		leftLegModel[13].rotateAngleZ = 0.27925268F;

		leftLegModel[14].addShapeBox(-5F, 29F, 7F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 5
		leftLegModel[14].setRotationPoint(9F, -48F, 13F);
		leftLegModel[14].rotateAngleZ = 0.27925268F;

		leftLegModel[15].addShapeBox(-5F, 25F, 7F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftLegModel[15].setRotationPoint(9F, -48F, 13F);
		leftLegModel[15].rotateAngleZ = 0.27925268F;

		leftLegModel[16].addShapeBox(-5F, 25F, 3F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftLegModel[16].setRotationPoint(9F, -48F, 13F);
		leftLegModel[16].rotateAngleZ = 0.27925268F;

		leftLegModel[17].addShapeBox(-5F, 25F, 0F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftLegModel[17].setRotationPoint(9F, -48F, 13F);
		leftLegModel[17].rotateAngleZ = 0.27925268F;

		leftLegModel[18].addShapeBox(-5F, 22F, 0F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftLegModel[18].setRotationPoint(9F, -48F, 13F);
		leftLegModel[18].rotateAngleZ = 0.27925268F;

		leftLegModel[19].addShapeBox(-5F, 22F, 3F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftLegModel[19].setRotationPoint(9F, -48F, 13F);
		leftLegModel[19].rotateAngleZ = 0.27925268F;

		leftLegModel[20].addShapeBox(-5F, 22F, 7F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 11
		leftLegModel[20].setRotationPoint(9F, -48F, 13F);
		leftLegModel[20].rotateAngleZ = 0.27925268F;

		leftLegModel[21].addShapeBox(-3F, 13F, 0F, 6, 12, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F); // Box 15
		leftLegModel[21].setRotationPoint(9F, -48F, 13F);
		leftLegModel[21].rotateAngleZ = 0.27925268F;

		leftLegModel[22].addShapeBox(-3F, 13F, 2F, 6, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 3F, 1F, 0F, 3F); // Box 16
		leftLegModel[22].setRotationPoint(9F, -48F, 13F);
		leftLegModel[22].rotateAngleZ = 0.27925268F;

		leftLegModel[23].addShapeBox(-3F, 13F, 4F, 6, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, 4F, -1F, 0F, 4F); // Box 17
		leftLegModel[23].setRotationPoint(9F, -48F, 13F);
		leftLegModel[23].rotateAngleZ = 0.27925268F;

		leftLegModel[24].addShapeBox(-5F, -5F, -11F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 18
		leftLegModel[24].setRotationPoint(9F, -48F, 0F);
		leftLegModel[24].rotateAngleZ = 0.27925268F;

		leftLegModel[25].addShapeBox(-5F, -5F, -15F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftLegModel[25].setRotationPoint(9F, -48F, 0F);
		leftLegModel[25].rotateAngleZ = 0.27925268F;

		leftLegModel[26].addShapeBox(-5F, -5F, -18F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftLegModel[26].setRotationPoint(9F, -48F, 0F);
		leftLegModel[26].rotateAngleZ = 0.27925268F;

		leftLegModel[27].addShapeBox(-5F, -2F, -18F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftLegModel[27].setRotationPoint(9F, -48F, 0F);
		leftLegModel[27].rotateAngleZ = 0.27925268F;

		leftLegModel[28].addShapeBox(-5F, -2F, -15F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftLegModel[28].setRotationPoint(9F, -48F, 0F);
		leftLegModel[28].rotateAngleZ = 0.27925268F;

		leftLegModel[29].addShapeBox(-5F, -2F, -11F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 23
		leftLegModel[29].setRotationPoint(9F, -48F, 0F);
		leftLegModel[29].rotateAngleZ = 0.27925268F;

		leftLegModel[30].addShapeBox(-5F, 2F, -11F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 24
		leftLegModel[30].setRotationPoint(9F, -48F, 0F);
		leftLegModel[30].rotateAngleZ = 0.27925268F;

		leftLegModel[31].addShapeBox(-5F, 2F, -15F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 25
		leftLegModel[31].setRotationPoint(9F, -48F, 0F);
		leftLegModel[31].rotateAngleZ = 0.27925268F;

		leftLegModel[32].addShapeBox(-5F, 2F, -18F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 26
		leftLegModel[32].setRotationPoint(9F, -48F, 0F);
		leftLegModel[32].rotateAngleZ = 0.27925268F;

		leftLegModel[33].addShapeBox(-3F, 1F, -12F, 6, 12, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 27
		leftLegModel[33].setRotationPoint(9F, -48F, 0F);
		leftLegModel[33].rotateAngleZ = 0.27925268F;

		leftLegModel[34].addShapeBox(-3F, 1F, -14F, 6, 12, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 28
		leftLegModel[34].setRotationPoint(9F, -48F, 0F);
		leftLegModel[34].rotateAngleZ = 0.27925268F;

		leftLegModel[35].addShapeBox(-3F, 1F, -16F, 6, 12, 2, 0F,-1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 29
		leftLegModel[35].setRotationPoint(9F, -48F, 0F);
		leftLegModel[35].rotateAngleZ = 0.27925268F;

		leftLegModel[36].addShapeBox(-3F, 13F, -17F, 6, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, 1F, 0F, -3F); // Box 30
		leftLegModel[36].setRotationPoint(9F, -48F, 0F);
		leftLegModel[36].rotateAngleZ = 0.27925268F;

		leftLegModel[37].addShapeBox(-3F, 13F, -15F, 6, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		leftLegModel[37].setRotationPoint(9F, -48F, 0F);
		leftLegModel[37].rotateAngleZ = 0.27925268F;

		leftLegModel[38].addShapeBox(-5F, 25F, -16F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 32
		leftLegModel[38].setRotationPoint(9F, -48F, 0F);
		leftLegModel[38].rotateAngleZ = 0.27925268F;

		leftLegModel[39].addShapeBox(-5F, 29F, -16F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 33
		leftLegModel[39].setRotationPoint(9F, -48F, 0F);
		leftLegModel[39].rotateAngleZ = 0.27925268F;

		leftLegModel[40].addShapeBox(-5F, 29F, -20F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 34
		leftLegModel[40].setRotationPoint(9F, -48F, 0F);
		leftLegModel[40].rotateAngleZ = 0.27925268F;

		leftLegModel[41].addShapeBox(-5F, 29F, -23F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 35
		leftLegModel[41].setRotationPoint(9F, -48F, 0F);
		leftLegModel[41].rotateAngleZ = 0.27925268F;

		leftLegModel[42].addShapeBox(-5F, 25F, -23F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftLegModel[42].setRotationPoint(9F, -48F, 0F);
		leftLegModel[42].rotateAngleZ = 0.27925268F;

		leftLegModel[43].addShapeBox(-5F, 25F, -20F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftLegModel[43].setRotationPoint(9F, -48F, 0F);
		leftLegModel[43].rotateAngleZ = 0.27925268F;

		leftLegModel[44].addShapeBox(-3F, 13F, -19F, 6, 12, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, -3F, 1F, 0F, -3F); // Box 38
		leftLegModel[44].setRotationPoint(9F, -48F, 0F);
		leftLegModel[44].rotateAngleZ = 0.27925268F;

		leftLegModel[45].addShapeBox(-5F, 22F, -23F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftLegModel[45].setRotationPoint(9F, -48F, 0F);
		leftLegModel[45].rotateAngleZ = 0.27925268F;

		leftLegModel[46].addShapeBox(-5F, 22F, -20F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftLegModel[46].setRotationPoint(9F, -48F, 0F);
		leftLegModel[46].rotateAngleZ = 0.27925268F;

		leftLegModel[47].addShapeBox(-5F, 22F, -16F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 41
		leftLegModel[47].setRotationPoint(9F, -48F, 0F);
		leftLegModel[47].rotateAngleZ = 0.27925268F;

		leftLegModel[48].addShapeBox(-3F, 25F, 4F, 14, 5, 2, 0F,0F, 1.5F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 1F, 0F); // Box 42
		leftLegModel[48].setRotationPoint(9F, -48F, 13F);
		leftLegModel[48].rotateAngleZ = 0.48869219F;

		leftLegModel[49].addShapeBox(-3F, 25F, 2F, 14, 5, 2, 0F,0F, -1F, .5F, 0F, -1F, -10F, 0F, 0F, 10F, 0F, 1.5F, 0F, 0F, -1F, .5F, 0F, -1F, -10F, 0F, 0F, 10F, 0F, 1F, 0F); // Box 43
		leftLegModel[49].setRotationPoint(9F, -48F, 13F);
		leftLegModel[49].rotateAngleZ = 0.48869219F;

		leftLegModel[50].addShapeBox(-3F, 25F, 6F, 14, 5, 2, 0F,0F, 1.5F, 0F, 0F, 0F, -10F, 0F, -1F, 10F, 3F, .5F, 2F, 0F, 1F, 0F, 0F, 0F, -10F, 0F, -1F, 10F, 2F, -1.5F, 1.5F); // Box 44
		leftLegModel[50].setRotationPoint(9F, -48F, 13F);
		leftLegModel[50].rotateAngleZ = 0.48869219F;

		leftLegModel[51].addShapeBox(11F, 25F, 14F, 14, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 10F, 0F, 0F, 0F); // Box 46
		leftLegModel[51].setRotationPoint(9F, -48F, 13F);
		leftLegModel[51].rotateAngleZ = 0.48869219F;

		leftLegModel[52].addShapeBox(11F, 25F, 16F, 13, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -10F, -.5F, -1F, 10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -.5F, -1F, 10F, 0F, -1F, 0F); // Box 48
		leftLegModel[52].setRotationPoint(9F, -48F, 13F);
		leftLegModel[52].rotateAngleZ = 0.48869219F;

		leftLegModel[53].addShapeBox(11F, 25F, 12F, 14, 5, 2, 0F,0F, -1F, 0F, 1F, -1F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Box 49
		leftLegModel[53].setRotationPoint(9F, -48F, 13F);
		leftLegModel[53].rotateAngleZ = 0.48869219F;

		leftLegModel[54].addShapeBox(24F, 25F, 24F, 3, 5, 2, 0F,-1F, 0F, 0F, 4F, 2F, -2F, 3F, 2F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 50
		leftLegModel[54].setRotationPoint(9F, -48F, 13F);
		leftLegModel[54].rotateAngleZ = 0.48869219F;

		leftLegModel[55].addShapeBox(25F, 25F, 22F, 3, 5, 2, 0F,-1F, -1F, 0F, 3F, 0F, -2F, 3F, 2F, 2F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 52
		leftLegModel[55].setRotationPoint(9F, -48F, 13F);
		leftLegModel[55].rotateAngleZ = 0.48869219F;

		leftLegModel[56].addShapeBox(23F, 25F, 26F, 3, 5, 2, 0F,-1F, 0F, 0F, 4F, 2F, -2F, 2F, 0F, 2F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 0F); // Box 53
		leftLegModel[56].setRotationPoint(9F, -48F, 13F);
		leftLegModel[56].rotateAngleZ = 0.48869219F;

		leftLegModel[57].addShapeBox(15F, 33F, 26F, 6, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 54
		leftLegModel[57].setRotationPoint(9F, -48F, 13F);
		leftLegModel[57].rotateAngleZ = 0.80285146F;

		leftLegModel[58].addShapeBox(15F, 33F, 24F, 6, 4, 2, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 55
		leftLegModel[58].setRotationPoint(9F, -48F, 13F);
		leftLegModel[58].rotateAngleZ = 0.80285146F;

		leftLegModel[59].addShapeBox(15F, 33F, 28F, 6, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 56
		leftLegModel[59].setRotationPoint(9F, -48F, 13F);
		leftLegModel[59].rotateAngleZ = 0.80285146F;

		leftLegModel[60].addShapeBox(15F, 37F, 24F, 6, 12, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 57
		leftLegModel[60].setRotationPoint(9F, -48F, 13F);
		leftLegModel[60].rotateAngleZ = 0.80285146F;

		leftLegModel[61].addShapeBox(15F, 37F, 26F, 6, 12, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 58
		leftLegModel[61].setRotationPoint(9F, -48F, 13F);
		leftLegModel[61].rotateAngleZ = 0.80285146F;

		leftLegModel[62].addShapeBox(15F, 37F, 28F, 6, 12, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 59
		leftLegModel[62].setRotationPoint(9F, -48F, 13F);
		leftLegModel[62].rotateAngleZ = 0.80285146F;

		leftLegModel[63].addShapeBox(15.5F, 49F, 28F, 5, 12, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 60
		leftLegModel[63].setRotationPoint(9F, -48F, 13F);
		leftLegModel[63].rotateAngleZ = 0.80285146F;

		leftLegModel[64].addShapeBox(15.5F, 49F, 26F, 5, 12, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 61
		leftLegModel[64].setRotationPoint(9F, -48F, 13F);
		leftLegModel[64].rotateAngleZ = 0.80285146F;

		leftLegModel[65].addShapeBox(16F, 61F, 26.5F, 4, 13, 1, 0F,0F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftLegModel[65].setRotationPoint(9F, -48F, 13F);
		leftLegModel[65].rotateAngleZ = 0.80285146F;

		leftLegModel[66].addShapeBox(16F, 61F, 27.5F, 4, 13, 1, 0F,0F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 65
		leftLegModel[66].setRotationPoint(9F, -48F, 13F);
		leftLegModel[66].rotateAngleZ = 0.80285146F;

		leftLegModel[67].addShapeBox(16F, 74F, 27.5F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 66
		leftLegModel[67].setRotationPoint(9F, -48F, 13F);
		leftLegModel[67].rotateAngleZ = 0.80285146F;

		leftLegModel[68].addShapeBox(16F, 74F, 26.5F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, -.5F, 0F, 0F, -.5F); // Box 67
		leftLegModel[68].setRotationPoint(9F, -48F, 13F);
		leftLegModel[68].rotateAngleZ = 0.80285146F;

		leftLegModel[69].addShapeBox(16F, 74F, 38.5F, 3, 14, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, .5F, 0F, 0F, .5F); // Box 68
		leftLegModel[69].setRotationPoint(9F, -48F, 0F);
		leftLegModel[69].rotateAngleZ = 0.80285146F;

		leftLegModel[70].addShapeBox(16F, 61F, 38.5F, 4, 13, 1, 0F,-1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, 0F, 0F, -.5F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftLegModel[70].setRotationPoint(9F, -48F, 0F);
		leftLegModel[70].rotateAngleZ = 0.80285146F;

		leftLegModel[71].addShapeBox(15.5F, 49F, 38F, 5, 12, 1, 0F,-1.5F, 0F, 1F, -1.5F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 70
		leftLegModel[71].setRotationPoint(9F, -48F, 0F);
		leftLegModel[71].rotateAngleZ = 0.80285146F;

		leftLegModel[72].addShapeBox(-3F, 25F, -21F, 14, 5, 2, 0F,3F, .5F, 2F, 0F, -1F, 10F, 0F, 0F, -10F, 0F, 1.5F, 0F, 2F, -1.5F, 1.5F, 0F, -1F, 10F, 0F, 0F, -10F, 0F, 1F, 0F); // Box 71
		leftLegModel[72].setRotationPoint(9F, -48F, 0F);
		leftLegModel[72].rotateAngleZ = 0.48869219F;

		leftLegModel[73].addShapeBox(-3F, 25F, -19F, 14, 5, 2, 0F,0F, 1.5F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 1F, 0F); // Box 72
		leftLegModel[73].setRotationPoint(9F, -48F, 0F);
		leftLegModel[73].rotateAngleZ = 0.48869219F;

		leftLegModel[74].addShapeBox(-3F, 25F, -17F, 14, 5, 2, 0F,0F, 1.5F, 0F, 0F, 0F, 10F, 0F, -1F, -10F, 0F, -1F, .5F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, -1F, -10F, 0F, -1F, .5F); // Box 73
		leftLegModel[74].setRotationPoint(9F, -48F, 0F);
		leftLegModel[74].rotateAngleZ = 0.48869219F;

		leftLegModel[75].addShapeBox(11F, 25F, -27F, 14, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 10F, 1F, -1F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 1F, -1F, -10F, 0F, -1F, 0F); // Box 74
		leftLegModel[75].setRotationPoint(9F, -48F, 0F);
		leftLegModel[75].rotateAngleZ = 0.48869219F;

		leftLegModel[76].addShapeBox(11F, 25F, -29F, 14, 5, 2, 0F,0F, 0F, 0F, -1F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 75
		leftLegModel[76].setRotationPoint(9F, -48F, 0F);
		leftLegModel[76].rotateAngleZ = 0.48869219F;

		leftLegModel[77].addShapeBox(11F, 25F, -31F, 13, 5, 2, 0F,0F, -1F, 0F, -.5F, -1F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 76
		leftLegModel[77].setRotationPoint(9F, -48F, 0F);
		leftLegModel[77].rotateAngleZ = 0.48869219F;

		leftLegModel[78].addShapeBox(15F, 37F, -52F, 6, 12, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 77
		leftLegModel[78].setRotationPoint(9F, -48F, 13F);
		leftLegModel[78].rotateAngleZ = 0.80285146F;

		leftLegModel[79].addShapeBox(15F, 37F, -54F, 6, 12, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 78
		leftLegModel[79].setRotationPoint(9F, -48F, 13F);
		leftLegModel[79].rotateAngleZ = 0.80285146F;

		leftLegModel[80].addShapeBox(15F, 37F, -56F, 6, 12, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 79
		leftLegModel[80].setRotationPoint(9F, -48F, 13F);
		leftLegModel[80].rotateAngleZ = 0.80285146F;

		leftLegModel[81].addShapeBox(15F, 33F, -56F, 6, 4, 2, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 80
		leftLegModel[81].setRotationPoint(9F, -48F, 13F);
		leftLegModel[81].rotateAngleZ = 0.80285146F;

		leftLegModel[82].addShapeBox(15F, 33F, -54F, 6, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 81
		leftLegModel[82].setRotationPoint(9F, -48F, 13F);
		leftLegModel[82].rotateAngleZ = 0.80285146F;

		leftLegModel[83].addShapeBox(15F, 33F, -52F, 6, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 82
		leftLegModel[83].setRotationPoint(9F, -48F, 13F);
		leftLegModel[83].rotateAngleZ = 0.80285146F;

		leftLegModel[84].addShapeBox(15.5F, 49F, -42F, 5, 12, 1, 0F,-1.5F, 0F, 1F, -1.5F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 83
		leftLegModel[84].setRotationPoint(9F, -48F, 0F);
		leftLegModel[84].rotateAngleZ = 0.80285146F;

		leftLegModel[85].addShapeBox(15.5F, 49F, -54F, 5, 12, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 84
		leftLegModel[85].setRotationPoint(9F, -48F, 13F);
		leftLegModel[85].rotateAngleZ = 0.80285146F;

		leftLegModel[86].addShapeBox(15.5F, 49F, -52F, 5, 12, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 85
		leftLegModel[86].setRotationPoint(9F, -48F, 13F);
		leftLegModel[86].rotateAngleZ = 0.80285146F;

		leftLegModel[87].addShapeBox(16F, 61F, -52.5F, 4, 13, 1, 0F,0F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 86
		leftLegModel[87].setRotationPoint(9F, -48F, 13F);
		leftLegModel[87].rotateAngleZ = 0.80285146F;

		leftLegModel[88].addShapeBox(16F, 61F, -53.5F, 4, 13, 1, 0F,0F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftLegModel[88].setRotationPoint(9F, -48F, 13F);
		leftLegModel[88].rotateAngleZ = 0.80285146F;

		leftLegModel[89].addShapeBox(16F, 61F, -41.5F, 4, 13, 1, 0F,-1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, 0F, 0F, -.5F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftLegModel[89].setRotationPoint(9F, -48F, 0F);
		leftLegModel[89].rotateAngleZ = 0.80285146F;

		leftLegModel[90].addShapeBox(16F, 74F, -53.5F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, -.5F, 0F, 0F, -.5F); // Box 89
		leftLegModel[90].setRotationPoint(9F, -48F, 13F);
		leftLegModel[90].rotateAngleZ = 0.80285146F;

		leftLegModel[91].addShapeBox(16F, 74F, -41.5F, 3, 14, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, .5F, 0F, 0F, .5F); // Box 90
		leftLegModel[91].setRotationPoint(9F, -48F, 0F);
		leftLegModel[91].rotateAngleZ = 0.80285146F;

		leftLegModel[92].addShapeBox(16F, 74F, -52.5F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 91
		leftLegModel[92].setRotationPoint(9F, -48F, 13F);
		leftLegModel[92].rotateAngleZ = 0.80285146F;

		leftLegModel[93].addShapeBox(23F, 25F, -41F, 3, 5, 2, 0F,0F, -1F, 0F, 2F, 0F, 2F, 4F, 2F, -2F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 1F, 0F, -2F, -1F, 0F, 0F); // Box 92
		leftLegModel[93].setRotationPoint(9F, -48F, 0F);
		leftLegModel[93].rotateAngleZ = 0.48869219F;

		leftLegModel[94].addShapeBox(24F, 25F, -39F, 3, 5, 2, 0F,0F, 0F, 0F, 3F, 2F, 2F, 4F, 2F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, -1F, 0F, 0F); // Box 93
		leftLegModel[94].setRotationPoint(9F, -48F, 0F);
		leftLegModel[94].rotateAngleZ = 0.48869219F;

		leftLegModel[95].addShapeBox(25F, 25F, -37F, 3, 5, 2, 0F,0F, 0F, 0F, 3F, 2F, 2F, 3F, 0F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, -1F, -2F, -1F, -1F, 0F); // Box 94
		leftLegModel[95].setRotationPoint(9F, -48F, 0F);
		leftLegModel[95].rotateAngleZ = 0.48869219F;
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 95
		rightLegModel[1] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 96
		rightLegModel[2] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 97
		rightLegModel[3] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 98
		rightLegModel[4] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 99
		rightLegModel[5] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 100
		rightLegModel[6] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 101
		rightLegModel[7] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 102
		rightLegModel[8] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 103
		rightLegModel[9] = new ModelRendererTurbo(this, 518, 347, textureX, textureY); // Box 104
		rightLegModel[10] = new ModelRendererTurbo(this, 518, 370, textureX, textureY); // Box 105
		rightLegModel[11] = new ModelRendererTurbo(this, 518, 393, textureX, textureY); // Box 106
		rightLegModel[12] = new ModelRendererTurbo(this, 549, 393, textureX, textureY); // Box 107
		rightLegModel[13] = new ModelRendererTurbo(this, 549, 347, textureX, textureY); // Box 108
		rightLegModel[14] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 109
		rightLegModel[15] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 110
		rightLegModel[16] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 111
		rightLegModel[17] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 112
		rightLegModel[18] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 113
		rightLegModel[19] = new ModelRendererTurbo(this, 430, 325, textureX, textureY); // Box 114
		rightLegModel[20] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 115
		rightLegModel[21] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 116
		rightLegModel[22] = new ModelRendererTurbo(this, 391, 325, textureX, textureY); // Box 117
		rightLegModel[23] = new ModelRendererTurbo(this, 518, 347, textureX, textureY); // Box 118
		rightLegModel[24] = new ModelRendererTurbo(this, 518, 370, textureX, textureY); // Box 119
		rightLegModel[25] = new ModelRendererTurbo(this, 518, 393, textureX, textureY); // Box 120
		rightLegModel[26] = new ModelRendererTurbo(this, 549, 393, textureX, textureY); // Box 121
		rightLegModel[27] = new ModelRendererTurbo(this, 549, 370, textureX, textureY); // Box 122
		rightLegModel[28] = new ModelRendererTurbo(this, 549, 347, textureX, textureY); // Box 123
		rightLegModel[29] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 124
		rightLegModel[30] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 125
		rightLegModel[31] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 126
		rightLegModel[32] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 127
		rightLegModel[33] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 128
		rightLegModel[34] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 129
		rightLegModel[35] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 130
		rightLegModel[36] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 131
		rightLegModel[37] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 132
		rightLegModel[38] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 133
		rightLegModel[39] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 134
		rightLegModel[40] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 135
		rightLegModel[41] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 136
		rightLegModel[42] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 137
		rightLegModel[43] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 138
		rightLegModel[44] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 139
		rightLegModel[45] = new ModelRendererTurbo(this, 389, 425, textureX, textureY); // Box 140
		rightLegModel[46] = new ModelRendererTurbo(this, 549, 370, textureX, textureY); // Box 141
		rightLegModel[47] = new ModelRendererTurbo(this, 430, 425, textureX, textureY); // Box 142
		rightLegModel[48] = new ModelRendererTurbo(this, 517, 465, textureX, textureY); // Box 143
		rightLegModel[49] = new ModelRendererTurbo(this, 517, 448, textureX, textureY); // Box 144
		rightLegModel[50] = new ModelRendererTurbo(this, 517, 431, textureX, textureY); // Box 145
		rightLegModel[51] = new ModelRendererTurbo(this, 572, 465, textureX, textureY); // Box 146
		rightLegModel[52] = new ModelRendererTurbo(this, 572, 448, textureX, textureY); // Box 147
		rightLegModel[53] = new ModelRendererTurbo(this, 572, 431, textureX, textureY); // Box 148
		rightLegModel[54] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 165
		rightLegModel[55] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 166
		rightLegModel[56] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 167
		rightLegModel[57] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 168
		rightLegModel[58] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 169
		rightLegModel[59] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 170
		rightLegModel[60] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 171
		rightLegModel[61] = new ModelRendererTurbo(this, 639, 349, textureX, textureY); // Box 174
		rightLegModel[62] = new ModelRendererTurbo(this, 665, 349, textureX, textureY); // Box 175
		rightLegModel[63] = new ModelRendererTurbo(this, 664, 364, textureX, textureY); // Box 177
		rightLegModel[64] = new ModelRendererTurbo(this, 641, 364, textureX, textureY); // Box 178
		rightLegModel[65] = new ModelRendererTurbo(this, 668, 392, textureX, textureY); // Box 180
		rightLegModel[66] = new ModelRendererTurbo(this, 639, 392, textureX, textureY); // Box 181
		rightLegModel[67] = new ModelRendererTurbo(this, 638, 457, textureX, textureY); // Box 183
		rightLegModel[68] = new ModelRendererTurbo(this, 667, 457, textureX, textureY); // Box 184
		rightLegModel[69] = new ModelRendererTurbo(this, 635, 415, textureX, textureY); // Box 186
		rightLegModel[70] = new ModelRendererTurbo(this, 666, 415, textureX, textureY); // Box 187
		rightLegModel[71] = new ModelRendererTurbo(this, 669, 434, textureX, textureY); // Box 190
		rightLegModel[72] = new ModelRendererTurbo(this, 635, 434, textureX, textureY); // Box 191
		rightLegModel[73] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 192
		rightLegModel[74] = new ModelRendererTurbo(this, 667, 480, textureX, textureY); // Box 193
		rightLegModel[75] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 195
		rightLegModel[76] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 196
		rightLegModel[77] = new ModelRendererTurbo(this, 639, 375, textureX, textureY); // Box 198
		rightLegModel[78] = new ModelRendererTurbo(this, 664, 375, textureX, textureY); // Box 199
		rightLegModel[79] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 200
		rightLegModel[80] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 201
		rightLegModel[81] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 202
		rightLegModel[82] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 203
		rightLegModel[83] = new ModelRendererTurbo(this, 696, 480, textureX, textureY); // Box 204
		rightLegModel[84] = new ModelRendererTurbo(this, 696, 457, textureX, textureY); // Box 205
		rightLegModel[85] = new ModelRendererTurbo(this, 703, 434, textureX, textureY); // Box 206
		rightLegModel[86] = new ModelRendererTurbo(this, 697, 415, textureX, textureY); // Box 207
		rightLegModel[87] = new ModelRendererTurbo(this, 697, 392, textureX, textureY); // Box 208
		rightLegModel[88] = new ModelRendererTurbo(this, 693, 375, textureX, textureY); // Box 209
		rightLegModel[89] = new ModelRendererTurbo(this, 693, 364, textureX, textureY); // Box 210
		rightLegModel[90] = new ModelRendererTurbo(this, 694, 349, textureX, textureY); // Box 211
		rightLegModel[91] = new ModelRendererTurbo(this, 517, 448, textureX, textureY); // Box 212
		rightLegModel[92] = new ModelRendererTurbo(this, 517, 465, textureX, textureY); // Box 213
		rightLegModel[93] = new ModelRendererTurbo(this, 517, 431, textureX, textureY); // Box 214
		rightLegModel[94] = new ModelRendererTurbo(this, 572, 431, textureX, textureY); // Box 215
		rightLegModel[95] = new ModelRendererTurbo(this, 572, 448, textureX, textureY); // Box 216
		rightLegModel[96] = new ModelRendererTurbo(this, 572, 465, textureX, textureY); // Box 217
		rightLegModel[97] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 218
		rightLegModel[98] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 219
		rightLegModel[99] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 220
		rightLegModel[100] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 222
		rightLegModel[101] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 223
		rightLegModel[102] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 224
		rightLegModel[103] = new ModelRendererTurbo(this, 611, 353, textureX, textureY); // Box 225
		rightLegModel[104] = new ModelRendererTurbo(this, 694, 349, textureX, textureY); // Box 226
		rightLegModel[105] = new ModelRendererTurbo(this, 665, 349, textureX, textureY); // Box 227
		rightLegModel[106] = new ModelRendererTurbo(this, 639, 349, textureX, textureY); // Box 228
		rightLegModel[107] = new ModelRendererTurbo(this, 693, 364, textureX, textureY); // Box 229
		rightLegModel[108] = new ModelRendererTurbo(this, 664, 364, textureX, textureY); // Box 230
		rightLegModel[109] = new ModelRendererTurbo(this, 641, 364, textureX, textureY); // Box 231
		rightLegModel[110] = new ModelRendererTurbo(this, 639, 375, textureX, textureY); // Box 232
		rightLegModel[111] = new ModelRendererTurbo(this, 664, 375, textureX, textureY); // Box 233
		rightLegModel[112] = new ModelRendererTurbo(this, 693, 375, textureX, textureY); // Box 234
		rightLegModel[113] = new ModelRendererTurbo(this, 697, 392, textureX, textureY); // Box 235
		rightLegModel[114] = new ModelRendererTurbo(this, 668, 392, textureX, textureY); // Box 236
		rightLegModel[115] = new ModelRendererTurbo(this, 639, 392, textureX, textureY); // Box 237
		rightLegModel[116] = new ModelRendererTurbo(this, 697, 415, textureX, textureY); // Box 238
		rightLegModel[117] = new ModelRendererTurbo(this, 666, 415, textureX, textureY); // Box 239
		rightLegModel[118] = new ModelRendererTurbo(this, 635, 415, textureX, textureY); // Box 240
		rightLegModel[119] = new ModelRendererTurbo(this, 635, 434, textureX, textureY); // Box 241
		rightLegModel[120] = new ModelRendererTurbo(this, 669, 434, textureX, textureY); // Box 242
		rightLegModel[121] = new ModelRendererTurbo(this, 703, 434, textureX, textureY); // Box 243
		rightLegModel[122] = new ModelRendererTurbo(this, 696, 457, textureX, textureY); // Box 244
		rightLegModel[123] = new ModelRendererTurbo(this, 667, 457, textureX, textureY); // Box 245
		rightLegModel[124] = new ModelRendererTurbo(this, 638, 457, textureX, textureY); // Box 246
		rightLegModel[125] = new ModelRendererTurbo(this, 696, 480, textureX, textureY); // Box 247
		rightLegModel[126] = new ModelRendererTurbo(this, 667, 480, textureX, textureY); // Box 248
		rightLegModel[127] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 249
		rightLegModel[128] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 250
		rightLegModel[129] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 251
		rightLegModel[130] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 252
		rightLegModel[131] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 253
		rightLegModel[132] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 254
		rightLegModel[133] = new ModelRendererTurbo(this, 638, 480, textureX, textureY); // Box 255

		rightLegModel[0].addShapeBox(-5F, 2F, 2F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 95
		rightLegModel[0].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[0].rotateAngleZ = -0.80285146F;

		rightLegModel[1].addShapeBox(-5F, -2F, 2F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 96
		rightLegModel[1].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[1].rotateAngleZ = -0.80285146F;

		rightLegModel[2].addShapeBox(-5F, -5F, 2F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 97
		rightLegModel[2].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[2].rotateAngleZ = -0.80285146F;

		rightLegModel[3].addShapeBox(-5F, -5F, -2F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		rightLegModel[3].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[3].rotateAngleZ = -0.80285146F;

		rightLegModel[4].addShapeBox(-5F, -5F, -5F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightLegModel[4].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[4].rotateAngleZ = -0.80285146F;

		rightLegModel[5].addShapeBox(-5F, -2F, -5F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightLegModel[5].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[5].rotateAngleZ = -0.80285146F;

		rightLegModel[6].addShapeBox(-5F, -2F, -2F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightLegModel[6].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[6].rotateAngleZ = -0.80285146F;

		rightLegModel[7].addShapeBox(-5F, 2F, -5F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 102
		rightLegModel[7].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[7].rotateAngleZ = -0.80285146F;

		rightLegModel[8].addShapeBox(-5F, 2F, -2F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 103
		rightLegModel[8].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[8].rotateAngleZ = -0.80285146F;

		rightLegModel[9].addShapeBox(-3F, 1F, 1F, 6, 14, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 3F); // Box 104
		rightLegModel[9].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[9].rotateAngleZ = -0.80285146F;

		rightLegModel[10].addShapeBox(-3F, 1F, -1F, 6, 14, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 105
		rightLegModel[10].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[10].rotateAngleZ = -0.80285146F;

		rightLegModel[11].addShapeBox(-3F, 1F, -3F, 6, 14, 2, 0F,-1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 106
		rightLegModel[11].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[11].rotateAngleZ = -0.80285146F;

		rightLegModel[12].addShapeBox(-3F, 15F, 0F, 6, 14, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F); // Box 107
		rightLegModel[12].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[12].rotateAngleZ = -0.80285146F;

		rightLegModel[13].addShapeBox(-3F, 15F, 4F, 6, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, 4F, -1F, 0F, 4F); // Box 108
		rightLegModel[13].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[13].rotateAngleZ = -0.80285146F;

		rightLegModel[14].addShapeBox(-5F, -5F, -18F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		rightLegModel[14].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[14].rotateAngleZ = -0.80285146F;

		rightLegModel[15].addShapeBox(-5F, -5F, -15F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		rightLegModel[15].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[15].rotateAngleZ = -0.80285146F;

		rightLegModel[16].addShapeBox(-5F, -5F, -11F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 111
		rightLegModel[16].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[16].rotateAngleZ = -0.80285146F;

		rightLegModel[17].addShapeBox(-5F, -2F, -11F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 112
		rightLegModel[17].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[17].rotateAngleZ = -0.80285146F;

		rightLegModel[18].addShapeBox(-5F, -2F, -15F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		rightLegModel[18].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[18].rotateAngleZ = -0.80285146F;

		rightLegModel[19].addShapeBox(-5F, -2F, -18F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		rightLegModel[19].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[19].rotateAngleZ = -0.80285146F;

		rightLegModel[20].addShapeBox(-5F, 2F, -18F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 115
		rightLegModel[20].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[20].rotateAngleZ = -0.80285146F;

		rightLegModel[21].addShapeBox(-5F, 2F, -15F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 116
		rightLegModel[21].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[21].rotateAngleZ = -0.80285146F;

		rightLegModel[22].addShapeBox(-5F, 2F, -11F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 117
		rightLegModel[22].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[22].rotateAngleZ = -0.80285146F;

		rightLegModel[23].addShapeBox(-3F, 1F, -16F, 6, 14, 2, 0F,-1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 118
		rightLegModel[23].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[23].rotateAngleZ = -0.80285146F;

		rightLegModel[24].addShapeBox(-3F, 1F, -14F, 6, 14, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 119
		rightLegModel[24].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[24].rotateAngleZ = -0.80285146F;

		rightLegModel[25].addShapeBox(-3F, 1F, -12F, 6, 14, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, -3F, -2F, 0F, -3F); // Box 120
		rightLegModel[25].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[25].rotateAngleZ = -0.80285146F;

		rightLegModel[26].addShapeBox(-3F, 15F, -15F, 6, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 121
		rightLegModel[26].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[26].rotateAngleZ = -0.80285146F;

		rightLegModel[27].addShapeBox(-3F, 15F, -17F, 6, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, 1F, 0F, -3F); // Box 122
		rightLegModel[27].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[27].rotateAngleZ = -0.80285146F;

		rightLegModel[28].addShapeBox(-3F, 15F, -19F, 6, 14, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, -3F, 1F, 0F, -3F); // Box 123
		rightLegModel[28].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[28].rotateAngleZ = -0.80285146F;

		rightLegModel[29].addShapeBox(-5F, 26F, -23F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightLegModel[29].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[29].rotateAngleZ = -0.80285146F;

		rightLegModel[30].addShapeBox(-5F, 29F, -23F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightLegModel[30].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[30].rotateAngleZ = -0.80285146F;

		rightLegModel[31].addShapeBox(-5F, 33F, -23F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 126
		rightLegModel[31].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[31].rotateAngleZ = -0.80285146F;

		rightLegModel[32].addShapeBox(-5F, 26F, -16F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 127
		rightLegModel[32].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[32].rotateAngleZ = -0.80285146F;

		rightLegModel[33].addShapeBox(-5F, 26F, -20F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rightLegModel[33].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[33].rotateAngleZ = -0.80285146F;

		rightLegModel[34].addShapeBox(-5F, 29F, -20F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rightLegModel[34].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[34].rotateAngleZ = -0.80285146F;

		rightLegModel[35].addShapeBox(-5F, 29F, -16F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 130
		rightLegModel[35].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[35].rotateAngleZ = -0.80285146F;

		rightLegModel[36].addShapeBox(-5F, 33F, -16F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 131
		rightLegModel[36].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[36].rotateAngleZ = -0.80285146F;

		rightLegModel[37].addShapeBox(-5F, 33F, -20F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 132
		rightLegModel[37].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[37].rotateAngleZ = -0.80285146F;

		rightLegModel[38].addShapeBox(-5F, 26F, 0F, 10, 3, 3, 0F,-3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		rightLegModel[38].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[38].rotateAngleZ = -0.80285146F;

		rightLegModel[39].addShapeBox(-5F, 29F, 0F, 10, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		rightLegModel[39].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[39].rotateAngleZ = -0.80285146F;

		rightLegModel[40].addShapeBox(-5F, 33F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 135
		rightLegModel[40].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[40].rotateAngleZ = -0.80285146F;

		rightLegModel[41].addShapeBox(-5F, 33F, 3F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 136
		rightLegModel[41].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[41].rotateAngleZ = -0.80285146F;

		rightLegModel[42].addShapeBox(-5F, 29F, 3F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightLegModel[42].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[42].rotateAngleZ = -0.80285146F;

		rightLegModel[43].addShapeBox(-5F, 26F, 7F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 138
		rightLegModel[43].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[43].rotateAngleZ = -0.80285146F;

		rightLegModel[44].addShapeBox(-5F, 29F, 7F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 139
		rightLegModel[44].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[44].rotateAngleZ = -0.80285146F;

		rightLegModel[45].addShapeBox(-5F, 33F, 7F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F); // Box 140
		rightLegModel[45].setRotationPoint(-10F, -48F, 13F);
		rightLegModel[45].rotateAngleZ = -0.80285146F;

		rightLegModel[46].addShapeBox(-3F, 15F, 15F, 6, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 3F, 1F, 0F, 3F); // Box 141
		rightLegModel[46].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[46].rotateAngleZ = -0.80285146F;

		rightLegModel[47].addShapeBox(-5F, 26F, 16F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		rightLegModel[47].setRotationPoint(-10F, -48F, 0F);
		rightLegModel[47].rotateAngleZ = -0.80285146F;

		rightLegModel[48].addShapeBox(0F, -49F, 6F, 14, 5, 2, 0F,2F, 4F, 0F, 0F, 0F, -10F, 0F, -1F, 10F, 3F, .5F, 2F, 0F, 1F, 0F, 0F, 0F, -10F, 0F, -1F, 10F, 2F, -1.5F, 1.5F); // Box 143
		rightLegModel[48].setRotationPoint(9F, -48F, 13F);
		rightLegModel[48].rotateAngleZ = -4.29350996F;

		rightLegModel[49].addShapeBox(0F, -49F, 4F, 14, 5, 2, 0F,2F, 4F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 2F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 1F, 0F); // Box 144
		rightLegModel[49].setRotationPoint(9F, -48F, 13F);
		rightLegModel[49].rotateAngleZ = -4.29350996F;

		rightLegModel[50].addShapeBox(0F, -49F, 2F, 14, 5, 2, 0F,0F, 1.5F, .5F, 0F, -1F, -10F, 0F, 0F, 10F, 2F, 4F, 0F, 0F, -1F, .5F, 0F, -1F, -10F, 0F, 0F, 10F, 0F, 1F, 0F); // Box 145
		rightLegModel[50].setRotationPoint(9F, -48F, 13F);
		rightLegModel[50].rotateAngleZ = -4.29350996F;

		rightLegModel[51].addShapeBox(14F, -49F, 16F, 21, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, -10F, -.5F, -1F, 11F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 2F, -10F, 3F, -1F, 11F, 0F, -1F, 0F); // Box 146
		rightLegModel[51].setRotationPoint(9F, -48F, 13F);
		rightLegModel[51].rotateAngleZ = -4.29350996F;

		rightLegModel[52].addShapeBox(14F, -49F, 14F, 22, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, -10F, -1F, 1F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, -10F, 3F, 2F, 10F, 0F, 0F, 0F); // Box 147
		rightLegModel[52].setRotationPoint(9F, -48F, 13F);
		rightLegModel[52].rotateAngleZ = -4.29350996F;

		rightLegModel[53].addShapeBox(14F, -49F, 12F, 22, 5, 2, 0F,0F, -1F, 0F, 1F, -1F, -9F, 0F, 1F, 10F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, -1F, -9F, 4F, 2F, 10F, 0F, 0F, 0F); // Box 148
		rightLegModel[53].setRotationPoint(9F, -48F, 13F);
		rightLegModel[53].rotateAngleZ = -4.29350996F;

		rightLegModel[54].addShapeBox(-62F, -20F, 24F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		rightLegModel[54].setRotationPoint(9F, -48F, 13F);

		rightLegModel[55].addShapeBox(-62F, -18F, 26F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 166
		rightLegModel[55].setRotationPoint(9F, -48F, 13F);

		rightLegModel[56].addShapeBox(-62F, -16F, 26F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Box 167
		rightLegModel[56].setRotationPoint(9F, -48F, 13F);

		rightLegModel[57].addShapeBox(-62F, -20F, 26F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 168
		rightLegModel[57].setRotationPoint(9F, -48F, 13F);

		rightLegModel[58].addShapeBox(-62F, -18F, 35F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		rightLegModel[58].setRotationPoint(9F, -48F, 0F);

		rightLegModel[59].addShapeBox(-62F, -16F, 35F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 170
		rightLegModel[59].setRotationPoint(9F, -48F, 0F);

		rightLegModel[60].addShapeBox(-62F, -20F, 35F, 6, 2, 2, 0F,-2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightLegModel[60].setRotationPoint(9F, -48F, 0F);

		rightLegModel[61].addShapeBox(-64F, 17F, 26F, 6, 2, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, -2F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F); // Box 174
		rightLegModel[61].setRotationPoint(9F, -48F, 13F);
		rightLegModel[61].rotateAngleZ = -0.55850536F;

		rightLegModel[62].addShapeBox(-64F, 17F, 24F, 6, 2, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 175
		rightLegModel[62].setRotationPoint(9F, -48F, 13F);
		rightLegModel[62].rotateAngleZ = -0.55850536F;

		rightLegModel[63].addShapeBox(-64F, 19F, 24F, 6, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightLegModel[63].setRotationPoint(9F, -48F, 13F);
		rightLegModel[63].rotateAngleZ = -0.55850536F;

		rightLegModel[64].addShapeBox(-64F, 19F, 26F, 6, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 178
		rightLegModel[64].setRotationPoint(9F, -48F, 13F);
		rightLegModel[64].rotateAngleZ = -0.55850536F;

		rightLegModel[65].addShapeBox(-64.5F, 23F, 23.5F, 7, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 180
		rightLegModel[65].setRotationPoint(9F, -48F, 13F);
		rightLegModel[65].rotateAngleZ = -0.55850536F;

		rightLegModel[66].addShapeBox(-64.5F, 23F, 26.5F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F); // Box 181
		rightLegModel[66].setRotationPoint(9F, -48F, 13F);
		rightLegModel[66].rotateAngleZ = -0.55850536F;

		rightLegModel[67].addShapeBox(-63.5F, 51F, 26.5F, 7, 12, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 183
		rightLegModel[67].setRotationPoint(9F, -48F, 13F);
		rightLegModel[67].rotateAngleZ = -0.55850536F;

		rightLegModel[68].addShapeBox(-63.5F, 51F, 23.5F, 7, 12, 3, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightLegModel[68].setRotationPoint(9F, -48F, 13F);
		rightLegModel[68].rotateAngleZ = -0.55850536F;

		rightLegModel[69].addShapeBox(-65.5F, 31F, 26.5F, 9, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F); // Box 186
		rightLegModel[69].setRotationPoint(9F, -48F, 13F);
		rightLegModel[69].rotateAngleZ = -0.55850536F;

		rightLegModel[70].addShapeBox(-65.5F, 31F, 23.5F, 9, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 187
		rightLegModel[70].setRotationPoint(9F, -48F, 13F);
		rightLegModel[70].rotateAngleZ = -0.55850536F;

		rightLegModel[71].addShapeBox(-65.5F, 41F, 23.5F, 9, 10, 3, 0F,.5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightLegModel[71].setRotationPoint(9F, -48F, 13F);
		rightLegModel[71].rotateAngleZ = -0.55850536F;

		rightLegModel[72].addShapeBox(-65.5F, 41F, 26.5F, 9, 10, 3, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 191
		rightLegModel[72].setRotationPoint(9F, -48F, 13F);
		rightLegModel[72].rotateAngleZ = -0.55850536F;

		rightLegModel[73].addShapeBox(-63.5F, 63F, 26.5F, 7, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, .5F, 1F, 0F, .5F, -.5F, 0F, -1F, -4.5F, 0F, -1F); // Box 192
		rightLegModel[73].setRotationPoint(9F, -48F, 13F);
		rightLegModel[73].rotateAngleZ = -0.55850536F;

		rightLegModel[74].addShapeBox(-63.5F, 63F, 23.5F, 7, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, -.5F, -3F, 0F, -.5F); // Box 193
		rightLegModel[74].setRotationPoint(9F, -48F, 13F);
		rightLegModel[74].rotateAngleZ = -0.55850536F;

		rightLegModel[75].addShapeBox(-60.5F, 75F, 26F, 5, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, -3F, 0F, .5F, 1F, 0F, .5F, 0F, 0F, -.5F, -4F, 0F, -.5F); // Box 195
		rightLegModel[75].setRotationPoint(9F, -48F, 13F);
		rightLegModel[75].rotateAngleZ = -0.55850536F;

		rightLegModel[76].addShapeBox(-60.5F, 75F, 24F, 5, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, -.5F, -3F, 0F, -.5F); // Box 196
		rightLegModel[76].setRotationPoint(9F, -48F, 13F);
		rightLegModel[76].rotateAngleZ = -0.55850536F;

		rightLegModel[77].addShapeBox(-64F, 21F, 26F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F); // Box 198
		rightLegModel[77].setRotationPoint(9F, -48F, 13F);
		rightLegModel[77].rotateAngleZ = -0.55850536F;

		rightLegModel[78].addShapeBox(-64F, 21F, 24F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 199
		rightLegModel[78].setRotationPoint(9F, -48F, 13F);
		rightLegModel[78].rotateAngleZ = -0.55850536F;

		rightLegModel[79].addShapeBox(-57.5F, 86F, 25.5F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, -3F, 0F, -1.5F); // Box 200
		rightLegModel[79].setRotationPoint(9F, -48F, 13F);
		rightLegModel[79].rotateAngleZ = -0.55850536F;

		rightLegModel[80].addShapeBox(-57.5F, 86F, 23.5F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -3F, 0F, -.5F); // Box 201
		rightLegModel[80].setRotationPoint(9F, -48F, 14F);
		rightLegModel[80].rotateAngleZ = -0.55850536F;

		rightLegModel[81].addShapeBox(-57.5F, 86F, 36.5F, 3, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, -3F, 0F, .5F); // Box 202
		rightLegModel[81].setRotationPoint(9F, -48F, 0F);
		rightLegModel[81].rotateAngleZ = -0.55850536F;

		rightLegModel[82].addShapeBox(-60.5F, 75F, 36F, 5, 11, 1, 0F,-1.5F, 0F, .5F, -1.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, .5F, -3F, 0F, .5F); // Box 203
		rightLegModel[82].setRotationPoint(9F, -48F, 0F);
		rightLegModel[82].rotateAngleZ = -0.55850536F;

		rightLegModel[83].addShapeBox(-63.5F, 63F, 34.5F, 7, 12, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -1F, -.5F, 0F, -1F, 1F, 0F, .5F, -3F, 0F, .5F); // Box 204
		rightLegModel[83].setRotationPoint(9F, -48F, 0F);
		rightLegModel[83].rotateAngleZ = -0.55850536F;

		rightLegModel[84].addShapeBox(-63.5F, 51F, 34.5F, 7, 12, 2, 0F,0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightLegModel[84].setRotationPoint(9F, -48F, 0F);
		rightLegModel[84].rotateAngleZ = -0.55850536F;

		rightLegModel[85].addShapeBox(-65.5F, 41F, 33.5F, 9, 10, 3, 0F,-1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, .5F, 0F, -.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightLegModel[85].setRotationPoint(9F, -48F, 0F);
		rightLegModel[85].rotateAngleZ = -0.55850536F;

		rightLegModel[86].addShapeBox(-65.5F, 31F, 33.5F, 9, 10, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, .5F, 0F, -.5F); // Box 207
		rightLegModel[86].setRotationPoint(9F, -48F, 0F);
		rightLegModel[86].rotateAngleZ = -0.55850536F;

		rightLegModel[87].addShapeBox(-64.5F, 23F, 34.5F, 7, 8, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 208
		rightLegModel[87].setRotationPoint(9F, -48F, 0F);
		rightLegModel[87].rotateAngleZ = -0.55850536F;

		rightLegModel[88].addShapeBox(-64F, 21F, 35F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, .5F, 0F, -.5F); // Box 209
		rightLegModel[88].setRotationPoint(9F, -48F, 0F);
		rightLegModel[88].rotateAngleZ = -0.55850536F;

		rightLegModel[89].addShapeBox(-64F, 19F, 35F, 6, 2, 2, 0F,-2F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightLegModel[89].setRotationPoint(9F, -48F, 0F);
		rightLegModel[89].rotateAngleZ = -0.55850536F;

		rightLegModel[90].addShapeBox(-64F, 17F, 35F, 6, 2, 2, 0F,-2F, 3F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 211
		rightLegModel[90].setRotationPoint(9F, -48F, 0F);
		rightLegModel[90].rotateAngleZ = -0.55850536F;

		rightLegModel[91].addShapeBox(0F, -49F, -19F, 14, 5, 2, 0F,2F, 4F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 2F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 1F, 0F); // Box 212
		rightLegModel[91].setRotationPoint(9F, -48F, 0F);
		rightLegModel[91].rotateAngleZ = -4.29350996F;

		rightLegModel[92].addShapeBox(0F, -49F, -21F, 14, 5, 2, 0F,3F, .5F, 2F, 0F, -1F, 10F, 0F, 0F, -10F, 2F, 4F, 0F, 2F, -1.5F, 1.5F, 0F, -1F, 10F, 0F, 0F, -10F, 0F, 1F, 0F); // Box 213
		rightLegModel[92].setRotationPoint(9F, -48F, 0F);
		rightLegModel[92].rotateAngleZ = -4.29350996F;

		rightLegModel[93].addShapeBox(0F, -49F, -17F, 14, 5, 2, 0F,2F, 4F, 0F, 0F, 0F, 10F, 0F, -1F, -10F, 0F, 1.5F, .5F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, -1F, -10F, 0F, -1F, .5F); // Box 214
		rightLegModel[93].setRotationPoint(9F, -48F, 0F);
		rightLegModel[93].rotateAngleZ = -4.29350996F;

		rightLegModel[94].addShapeBox(14F, -49F, -27F, 22, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, 10F, 1F, -1F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 2F, 10F, 5F, -1F, -9F, 0F, -1F, 0F); // Box 215
		rightLegModel[94].setRotationPoint(9F, -48F, 0F);
		rightLegModel[94].rotateAngleZ = -4.29350996F;

		rightLegModel[95].addShapeBox(14F, -49F, -29F, 22, 5, 2, 0F,0F, 0F, 0F, -1F, 1F, 10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 10F, 4F, 2F, -10F, 0F, 0F, 0F); // Box 216
		rightLegModel[95].setRotationPoint(9F, -48F, 0F);
		rightLegModel[95].rotateAngleZ = -4.29350996F;

		rightLegModel[96].addShapeBox(14F, -49F, -31F, 21, 5, 2, 0F,0F, -1F, 0F, -.5F, -1F, 11F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 11F, 4F, 2F, -10F, 0F, 0F, 0F); // Box 217
		rightLegModel[96].setRotationPoint(9F, -48F, 0F);
		rightLegModel[96].rotateAngleZ = -4.29350996F;

		rightLegModel[97].addShapeBox(-62F, -18F, -50F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 218
		rightLegModel[97].setRotationPoint(9F, -48F, 13F);

		rightLegModel[98].addShapeBox(-62F, -20F, -50F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 219
		rightLegModel[98].setRotationPoint(9F, -48F, 13F);

		rightLegModel[99].addShapeBox(-62F, -20F, -52F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightLegModel[99].setRotationPoint(9F, -48F, 13F);

		rightLegModel[100].addShapeBox(-62F, -16F, -50F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F); // Box 222
		rightLegModel[100].setRotationPoint(9F, -48F, 13F);

		rightLegModel[101].addShapeBox(-62F, -16F, -41F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 223
		rightLegModel[101].setRotationPoint(9F, -48F, 0F);

		rightLegModel[102].addShapeBox(-62F, -18F, -41F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightLegModel[102].setRotationPoint(9F, -48F, 0F);

		rightLegModel[103].addShapeBox(-62F, -20F, -41F, 6, 2, 2, 0F,-2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightLegModel[103].setRotationPoint(9F, -48F, 0F);

		rightLegModel[104].addShapeBox(-64F, 17F, -50F, 6, 2, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, -2F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F); // Box 226
		rightLegModel[104].setRotationPoint(9F, -48F, 13F);
		rightLegModel[104].rotateAngleZ = -0.55850536F;

		rightLegModel[105].addShapeBox(-64F, 17F, -52F, 6, 2, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 227
		rightLegModel[105].setRotationPoint(9F, -48F, 13F);
		rightLegModel[105].rotateAngleZ = -0.55850536F;

		rightLegModel[106].addShapeBox(-64F, 17F, -41F, 6, 2, 2, 0F,-2F, 3F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 228
		rightLegModel[106].setRotationPoint(9F, -48F, 0F);
		rightLegModel[106].rotateAngleZ = -0.55850536F;

		rightLegModel[107].addShapeBox(-64F, 19F, -50F, 6, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 229
		rightLegModel[107].setRotationPoint(9F, -48F, 13F);
		rightLegModel[107].rotateAngleZ = -0.55850536F;

		rightLegModel[108].addShapeBox(-64F, 19F, -52F, 6, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightLegModel[108].setRotationPoint(9F, -48F, 13F);
		rightLegModel[108].rotateAngleZ = -0.55850536F;

		rightLegModel[109].addShapeBox(-64F, 19F, -41F, 6, 2, 2, 0F,-2F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightLegModel[109].setRotationPoint(9F, -48F, 0F);
		rightLegModel[109].rotateAngleZ = -0.55850536F;

		rightLegModel[110].addShapeBox(-64F, 21F, -41F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, .5F, 0F, -.5F); // Box 232
		rightLegModel[110].setRotationPoint(9F, -48F, 0F);
		rightLegModel[110].rotateAngleZ = -0.55850536F;

		rightLegModel[111].addShapeBox(-64F, 21F, -52F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 233
		rightLegModel[111].setRotationPoint(9F, -48F, 13F);
		rightLegModel[111].rotateAngleZ = -0.55850536F;

		rightLegModel[112].addShapeBox(-64F, 21F, -50F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F); // Box 234
		rightLegModel[112].setRotationPoint(9F, -48F, 13F);
		rightLegModel[112].rotateAngleZ = -0.55850536F;

		rightLegModel[113].addShapeBox(-64.5F, 23F, -49.5F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F); // Box 235
		rightLegModel[113].setRotationPoint(9F, -48F, 13F);
		rightLegModel[113].rotateAngleZ = -0.55850536F;

		rightLegModel[114].addShapeBox(-64.5F, 23F, -52.5F, 7, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 236
		rightLegModel[114].setRotationPoint(9F, -48F, 13F);
		rightLegModel[114].rotateAngleZ = -0.55850536F;

		rightLegModel[115].addShapeBox(-64.5F, 23F, -41.5F, 7, 8, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 237
		rightLegModel[115].setRotationPoint(9F, -48F, 0F);
		rightLegModel[115].rotateAngleZ = -0.55850536F;

		rightLegModel[116].addShapeBox(-65.5F, 31F, -49.5F, 9, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F); // Box 238
		rightLegModel[116].setRotationPoint(9F, -48F, 13F);
		rightLegModel[116].rotateAngleZ = -0.55850536F;

		rightLegModel[117].addShapeBox(-65.5F, 31F, -52.5F, 9, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 239
		rightLegModel[117].setRotationPoint(9F, -48F, 13F);
		rightLegModel[117].rotateAngleZ = -0.55850536F;

		rightLegModel[118].addShapeBox(-65.5F, 31F, -42.5F, 9, 10, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, .5F, 0F, -.5F); // Box 240
		rightLegModel[118].setRotationPoint(9F, -48F, 0F);
		rightLegModel[118].rotateAngleZ = -0.55850536F;

		rightLegModel[119].addShapeBox(-65.5F, 41F, -42.5F, 9, 10, 3, 0F,-1.5F, 0F, .5F, -1.5F, 0F, .5F, .5F, 0F, -.5F, .5F, 0F, -.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightLegModel[119].setRotationPoint(9F, -48F, 0F);
		rightLegModel[119].rotateAngleZ = -0.55850536F;

		rightLegModel[120].addShapeBox(-65.5F, 41F, -52.5F, 9, 10, 3, 0F,.5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightLegModel[120].setRotationPoint(9F, -48F, 13F);
		rightLegModel[120].rotateAngleZ = -0.55850536F;

		rightLegModel[121].addShapeBox(-65.5F, 41F, -49.5F, 9, 10, 3, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 243
		rightLegModel[121].setRotationPoint(9F, -48F, 13F);
		rightLegModel[121].rotateAngleZ = -0.55850536F;

		rightLegModel[122].addShapeBox(-63.5F, 51F, -49.5F, 7, 12, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 244
		rightLegModel[122].setRotationPoint(9F, -48F, 13F);
		rightLegModel[122].rotateAngleZ = -0.55850536F;

		rightLegModel[123].addShapeBox(-63.5F, 51F, -52.5F, 7, 12, 3, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightLegModel[123].setRotationPoint(9F, -48F, 13F);
		rightLegModel[123].rotateAngleZ = -0.55850536F;

		rightLegModel[124].addShapeBox(-63.5F, 51F, -41.5F, 7, 12, 2, 0F,0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightLegModel[124].setRotationPoint(9F, -48F, 0F);
		rightLegModel[124].rotateAngleZ = -0.55850536F;

		rightLegModel[125].addShapeBox(-63.5F, 63F, -49.5F, 7, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, .5F, 1F, 0F, .5F, -.5F, 0F, -1F, -4.5F, 0F, -1F); // Box 247
		rightLegModel[125].setRotationPoint(9F, -48F, 13F);
		rightLegModel[125].rotateAngleZ = -0.55850536F;

		rightLegModel[126].addShapeBox(-63.5F, 63F, -52.5F, 7, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, -.5F, -3F, 0F, -.5F); // Box 248
		rightLegModel[126].setRotationPoint(9F, -48F, 13F);
		rightLegModel[126].rotateAngleZ = -0.55850536F;

		rightLegModel[127].addShapeBox(-63.5F, 63F, -41.5F, 7, 12, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -1F, -.5F, 0F, -1F, 1F, 0F, .5F, -3F, 0F, .5F); // Box 249
		rightLegModel[127].setRotationPoint(9F, -48F, 0F);
		rightLegModel[127].rotateAngleZ = -0.55850536F;

		rightLegModel[128].addShapeBox(-60.5F, 75F, -50F, 5, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, .5F, -1.5F, 0F, .5F, -3F, 0F, .5F, 1F, 0F, .5F, 0F, 0F, -.5F, -4F, 0F, -.5F); // Box 250
		rightLegModel[128].setRotationPoint(9F, -48F, 13F);
		rightLegModel[128].rotateAngleZ = -0.55850536F;

		rightLegModel[129].addShapeBox(-60.5F, 75F, -52F, 5, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, -.5F, -3F, 0F, -.5F); // Box 251
		rightLegModel[129].setRotationPoint(9F, -48F, 13F);
		rightLegModel[129].rotateAngleZ = -0.55850536F;

		rightLegModel[130].addShapeBox(-60.5F, 75F, -40F, 5, 11, 1, 0F,-1.5F, 0F, .5F, -1.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, .5F, -3F, 0F, .5F); // Box 252
		rightLegModel[130].setRotationPoint(9F, -48F, 0F);
		rightLegModel[130].rotateAngleZ = -0.55850536F;

		rightLegModel[131].addShapeBox(-57.5F, 86F, -50.5F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, -3F, 0F, -1.5F); // Box 253
		rightLegModel[131].setRotationPoint(9F, -48F, 13F);
		rightLegModel[131].rotateAngleZ = -0.55850536F;

		rightLegModel[132].addShapeBox(-57.5F, 86F, -52.5F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -3F, 0F, -.5F); // Box 254
		rightLegModel[132].setRotationPoint(9F, -48F, 14F);
		rightLegModel[132].rotateAngleZ = -0.55850536F;

		rightLegModel[133].addShapeBox(-57.5F, 86F, -39.5F, 3, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, -3F, 0F, .5F); // Box 255
		rightLegModel[133].setRotationPoint(9F, -48F, 0F);
		rightLegModel[133].rotateAngleZ = -0.55850536F;
	}
}