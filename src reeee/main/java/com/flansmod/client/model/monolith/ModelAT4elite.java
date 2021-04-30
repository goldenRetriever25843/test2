//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.08.2016 - 12:15:30
// Last changed on: 22.08.2016 - 12:15:30

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAT4elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAT4elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[51];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 35
		gunModel[36] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 36
		gunModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		gunModel[38] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 38
		gunModel[39] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 39
		gunModel[40] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 40
		gunModel[41] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 41
		gunModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 42
		gunModel[43] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 43
		gunModel[44] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 44
		gunModel[45] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 45
		gunModel[46] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 46
		gunModel[47] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 47
		gunModel[48] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 48
		gunModel[49] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 49
		gunModel[50] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 50

		gunModel[0].addShapeBox(0F, 0F, 0F, 33, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-90F, -48F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 33, 7, 19, 0F); // Box 1
		gunModel[1].setRotationPoint(-90F, -42F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 33, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 2
		gunModel[2].setRotationPoint(-90F, -35F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 33, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 3
		gunModel[3].setRotationPoint(-53F, -35F, 0F);

		gunModel[4].addBox(0F, 0F, 0F, 33, 7, 19, 0F); // Box 4
		gunModel[4].setRotationPoint(-53F, -42F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 33, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-53F, -48F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 76, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 6
		gunModel[6].setRotationPoint(-16F, -35F, 0F);

		gunModel[7].addBox(0F, 0F, 0F, 76, 7, 19, 0F); // Box 7
		gunModel[7].setRotationPoint(-16F, -42F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 76, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-16F, -48F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 9
		gunModel[9].setRotationPoint(60F, -35F, 0F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 7, 19, 0F); // Box 10
		gunModel[10].setRotationPoint(60F, -42F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(60F, -48F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 12
		gunModel[12].setRotationPoint(61F, -35F, 0F);

		gunModel[13].addBox(0F, 0F, 0F, 3, 7, 19, 0F); // Box 13
		gunModel[13].setRotationPoint(61F, -42F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(61F, -48F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 15
		gunModel[15].setRotationPoint(64F, -35F, 0F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 7, 19, 0F); // Box 16
		gunModel[16].setRotationPoint(64F, -42F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(64F, -48F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 37, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 18
		gunModel[18].setRotationPoint(65F, -35F, 0F);

		gunModel[19].addBox(0F, 0F, 0F, 37, 7, 19, 0F); // Box 19
		gunModel[19].setRotationPoint(65F, -42F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 37, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(65F, -48F, 0F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[21].setRotationPoint(-57F, -48F, 0F);

		gunModel[22].addBox(0F, 0F, 0F, 4, 7, 19, 0F); // Box 22
		gunModel[22].setRotationPoint(-57F, -42F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 23
		gunModel[23].setRotationPoint(-57F, -35F, 0F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[24].setRotationPoint(-20F, -48F, 0F);

		gunModel[25].addBox(0F, 0F, 0F, 4, 7, 19, 0F); // Box 25
		gunModel[25].setRotationPoint(-20F, -42F, 0F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 26
		gunModel[26].setRotationPoint(-20F, -35F, 0F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 13, 10, 25, 0F,0F, 0F, -4F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 27
		gunModel[27].setRotationPoint(-103F, -52F, -3F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 13, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, -4F); // Box 28
		gunModel[28].setRotationPoint(-103F, -35F, -3F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 13, 7, 25, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 29
		gunModel[29].setRotationPoint(-103F, -42F, -3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 7, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[30].setRotationPoint(-106F, -42F, -3F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 10, 25, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[31].setRotationPoint(-106F, -52F, -3F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 32
		gunModel[32].setRotationPoint(-106F, -35F, -3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 8, 23, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[33].setRotationPoint(102F, -50F, -2F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[34].setRotationPoint(102F, -42F, -2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 35
		gunModel[35].setRotationPoint(102F, -34F, -2F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 36
		gunModel[36].setRotationPoint(23F, -51F, 12.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 37
		gunModel[37].setRotationPoint(23F, -51F, 16.5F);

		gunModel[38].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 38
		gunModel[38].setRotationPoint(23F, -57F, 16.5F);

		gunModel[39].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 39
		gunModel[39].setRotationPoint(23F, -57F, 22.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[40].setRotationPoint(23F, -60F, 16.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[41].setRotationPoint(23F, -60F, 20.5F);

		gunModel[42].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 42
		gunModel[42].setRotationPoint(23F, -60F, 19.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 43
		gunModel[43].setRotationPoint(23F, -57F, 17.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[44].setRotationPoint(23F, -53F, 17.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[45].setRotationPoint(23F, -53F, 20.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[46].setRotationPoint(23F, -57F, 20.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 47
		gunModel[47].setRotationPoint(91F, -51F, 13.25F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[48].setRotationPoint(91F, -52F, 20.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[49].setRotationPoint(91F, -52F, 19.25F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[50].setRotationPoint(91F, -52F, 21.75F);
		
animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;
		
		translateAll(2F, 8F, -20F);
	}
}