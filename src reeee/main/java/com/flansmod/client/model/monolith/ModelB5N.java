//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.06.2016 - 21:37:10
// Last changed on: 21.06.2016 - 21:37:10

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB5N extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelB5N() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[72];
		noseModel = new ModelRendererTurbo[10];
		tailModel = new ModelRendererTurbo[9];
		leftWingModel = new ModelRendererTurbo[4];
		rightWingModel = new ModelRendererTurbo[4];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 90
		bodyModel[52] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 91
		bodyModel[53] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 11, 9, 0F,0F, -4.5F, -2.5F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-62F, -32.5F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 11, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -4.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-62F, -32.5F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, -2F, 0F, -4.5F, -2.5F); // Box 0
		bodyModel[2].setRotationPoint(-62F, -21.5F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 68, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -4F, -2F, 0F, -5F, -3F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-53F, -21.5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 59, 11, 9, 0F,0F, -3F, -6F, 0F, -3F, -5F, 0F, -3F, -3F, 0F, -3F, -2F, 0F, 0F, -7F, 0F, 1F, -7F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-44F, -32.5F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -2.5F, 0F, -4F, -2F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-62F, -21.5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 68, 11, 9, 0F,0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -5F, -3F, 0F, -4F, -2F); // Box 0
		bodyModel[6].setRotationPoint(-53F, -21.5F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 35, 11, 9, 0F,0F, -3F, -3F, 0F, -7F, -5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(15F, -32.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 59, 11, 9, 0F,0F, -3F, -2F, 0F, -3F, -3F, 0F, -3F, -5F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -7F, 0F, 0F, -7F); // Box 0
		bodyModel[8].setRotationPoint(-44F, -32.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 11, 9, 0F,0F, -3F, -2F, 0F, -3F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-53F, -32.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 11, 9, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-53F, -32.5F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 11, 9, 0F,2F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(10F, -32.5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 11, 9, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 2F, -3F, -3F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 0
		bodyModel[12].setRotationPoint(10F, -32.5F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 35, 11, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1F); // Box 0
		bodyModel[13].setRotationPoint(15F, -32.5F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 35, 9, 9, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -7F, -5F, 0F, -4.5F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[14].setRotationPoint(15F, -21.5F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 35, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -7F, -5F, 0F, -3F, -3F); // Box 0
		bodyModel[15].setRotationPoint(15F, -21.5F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 31, 11, 9, 0F,0F, -7F, -5F, 0F, -9F, -9F, 1F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, -3.5F, 0F, -2F, -9F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(50F, -32.5F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 11, 9, 0F,0F, -4F, 0F, 1F, -9F, 0F, 0F, -9F, -9F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, 0F, -3.5F); // Box 0
		bodyModel[17].setRotationPoint(50F, -32.5F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 31, 9, 9, 0F,0F, 0F, -3.5F, 0F, 2F, -9F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -11F, -9F, 0F, -11F, 0F, 0F, -4.5F, 0F); // Box 0
		bodyModel[18].setRotationPoint(50F, -21.5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 31, 9, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -9F, 0F, 0F, -3.5F, 0F, -4.5F, 0F, 0F, -11F, 0F, 0F, -11F, -9F, 0F, -7F, -5F); // Box 0
		bodyModel[19].setRotationPoint(50F, -21.5F, 0F);

		bodyModel[20].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[20].setRotationPoint(-43F, -35.5F, 4F);
		bodyModel[20].rotateAngleX = 0.34906585F;

		bodyModel[21].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[21].setRotationPoint(-43F, -35.5F, -4F);
		bodyModel[21].rotateAngleX = -0.34906585F;

		bodyModel[22].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[22].setRotationPoint(-43F, -37.5F, 0F);
		bodyModel[22].rotateAngleX = 1.13446401F;

		bodyModel[23].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[23].setRotationPoint(-43F, -37.5F, 0F);
		bodyModel[23].rotateAngleX = -1.13446401F;

		bodyModel[24].addBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F); // Box 0
		bodyModel[24].setRotationPoint(-43F, -35.5F, 4F);
		bodyModel[24].rotateAngleX = 0.85521133F;
		bodyModel[24].rotateAngleY = 1.57079633F;

		bodyModel[25].addBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F); // Box 0
		bodyModel[25].setRotationPoint(-43F, -35.5F, -4F);
		bodyModel[25].rotateAngleX = 0.85521133F;
		bodyModel[25].rotateAngleY = 1.57079633F;

		bodyModel[26].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[26].setRotationPoint(-33F, -35.3F, 4F);
		bodyModel[26].rotateAngleX = 0.33161256F;

		bodyModel[27].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[27].setRotationPoint(-33F, -37.3F, 0F);
		bodyModel[27].rotateAngleX = 1.13446401F;

		bodyModel[28].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[28].setRotationPoint(-33F, -37.3F, 0F);
		bodyModel[28].rotateAngleX = -1.13446401F;

		bodyModel[29].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[29].setRotationPoint(-33F, -35.3F, -4F);
		bodyModel[29].rotateAngleX = -0.33161256F;

		bodyModel[30].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[30].setRotationPoint(-24F, -35.1F, 4F);
		bodyModel[30].rotateAngleX = 0.31415927F;

		bodyModel[31].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(-24F, -37.1F, 0F);
		bodyModel[31].rotateAngleX = 1.13446401F;

		bodyModel[32].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-24F, -37.1F, 0F);
		bodyModel[32].rotateAngleX = -1.13446401F;

		bodyModel[33].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[33].setRotationPoint(-24F, -35.1F, -4F);
		bodyModel[33].rotateAngleX = -0.31415927F;

		bodyModel[34].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[34].setRotationPoint(-15F, -34.9F, 4F);
		bodyModel[34].rotateAngleX = 0.29670597F;

		bodyModel[35].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[35].setRotationPoint(-15F, -36.9F, 0F);
		bodyModel[35].rotateAngleX = 1.13446401F;

		bodyModel[36].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[36].setRotationPoint(-15F, -36.9F, 0F);
		bodyModel[36].rotateAngleX = -1.13446401F;

		bodyModel[37].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(-15F, -34.9F, -4F);
		bodyModel[37].rotateAngleX = -0.29670597F;

		bodyModel[38].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(-5F, -34.7F, 4F);
		bodyModel[38].rotateAngleX = 0.27925268F;

		bodyModel[39].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[39].setRotationPoint(-5F, -36.7F, 0F);
		bodyModel[39].rotateAngleX = 1.13446401F;

		bodyModel[40].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[40].setRotationPoint(-5F, -36.7F, 0F);
		bodyModel[40].rotateAngleX = -1.13446401F;

		bodyModel[41].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[41].setRotationPoint(-5F, -34.7F, -4F);
		bodyModel[41].rotateAngleX = -0.27925268F;

		bodyModel[42].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[42].setRotationPoint(3F, -34.5F, 4F);
		bodyModel[42].rotateAngleX = 0.26179939F;

		bodyModel[43].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[43].setRotationPoint(3F, -36.5F, 0F);
		bodyModel[43].rotateAngleX = 1.13446401F;

		bodyModel[44].addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F); // Box 0
		bodyModel[44].setRotationPoint(3F, -36.5F, 0F);
		bodyModel[44].rotateAngleX = -1.13446401F;

		bodyModel[45].addBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F); // Box 0
		bodyModel[45].setRotationPoint(3F, -34.5F, -4F);
		bodyModel[45].rotateAngleX = -0.26179939F;

		bodyModel[46].addBox(-0.5F, -0.5F, -0.5F, 1, 47, 1, 0F); // Box 0
		bodyModel[46].setRotationPoint(-43F, -35.5F, 4F);
		bodyModel[46].rotateAngleZ = 1.55334303F;

		bodyModel[47].addBox(-0.5F, -0.5F, -0.5F, 1, 47, 1, 0F); // Box 0
		bodyModel[47].setRotationPoint(-43F, -35.5F, -4F);
		bodyModel[47].rotateAngleZ = 1.55334303F;

		bodyModel[48].addBox(0F, 0F, 0F, 9, 7, 10, 0F); // Box 0
		bodyModel[48].setRotationPoint(-53F, -30.5F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 0
		bodyModel[49].setRotationPoint(-47F, -32.5F, -1F);
		bodyModel[49].rotateAngleZ = 0.01745329F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 7, 16, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F, -7F, 7F, 0F, -7F, 0F, 0F, -2F); // Box 0
		bodyModel[50].setRotationPoint(-50F, -22.5F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 6, 6, 8, 0F); // Box 90
		bodyModel[51].setRotationPoint(-38F, -21.5F, -4F);

		bodyModel[52].addBox(0F, -1F, 0F, 2, 13, 8, 0F); // Box 91
		bodyModel[52].setRotationPoint(-31F, -32.5F, -4F);
		bodyModel[52].rotateAngleZ = -0.10471976F;

		bodyModel[53].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0
		bodyModel[53].setRotationPoint(3F, -47.5F, 0F);

		bodyModel[54].addShapeBox(-4.5F, -1F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.3F, 0F); // Box 0
		bodyModel[54].setRotationPoint(12F, -32.5F, 0F);

		bodyModel[55].addShapeBox(3.5F, -1F, -0.5F, 4, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 0
		bodyModel[55].setRotationPoint(12F, -32.5F, 0F);

		bodyModel[56].addShapeBox(4.5F, -1.2F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 0
		bodyModel[56].setRotationPoint(15F, -32.5F, 0F);

		bodyModel[57].addShapeBox(0.2F, -1.9F, -1.5F, 3, 1, 3, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 0
		bodyModel[57].setRotationPoint(12F, -32.5F, 0F);

		bodyModel[58].addShapeBox(-1.5F, -1F, -0.5F, 5, 1, 1, 0F,0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 0
		bodyModel[58].setRotationPoint(12F, -32.5F, 0F);

		bodyModel[59].addBox(0F, -1F, 0F, 2, 13, 8, 0F); // Box 0
		bodyModel[59].setRotationPoint(-9F, -32.5F, -4F);
		bodyModel[59].rotateAngleZ = 0.10471976F;

		bodyModel[60].addBox(0F, 0F, 0F, 6, 6, 8, 0F); // Box 0
		bodyModel[60].setRotationPoint(-7F, -21.5F, -4F);

		bodyModel[61].addBox(0F, 0F, 0F, 11, 11, 6, 0F); // Box 0
		bodyModel[61].setRotationPoint(-65F, -21.5F, -3F);
		bodyModel[61].rotateAngleZ = 0.12217305F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 0
		bodyModel[62].setRotationPoint(-42F, -10F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -2F, -2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -2F, -2F); // Box 0
		bodyModel[63].setRotationPoint(-19F, -10F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 8, 8, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); // Box 0
		bodyModel[64].setRotationPoint(-51F, -10F, -4F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 0
		bodyModel[65].setRotationPoint(-50F, -12F, -0.5F);
		bodyModel[65].rotateAngleZ = 0.57595865F;

		bodyModel[66].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[66].setRotationPoint(-41F, -12F, -0.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[67].setRotationPoint(-28F, -12F, -0.5F);
		bodyModel[67].rotateAngleZ = -0.17453293F;

		bodyModel[68].addShapeBox(0F, -6F, -0.5F, 5, 12, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[68].setRotationPoint(-26F, -6F, 0F);
		bodyModel[68].rotateAngleX = 0.78539816F;

		bodyModel[69].addBox(0F, -6F, -0.5F, 12, 12, 1, 0F); // Box 0
		bodyModel[69].setRotationPoint(-21F, -6F, 0F);
		bodyModel[69].rotateAngleX = 0.78539816F;

		bodyModel[70].addShapeBox(0F, -6F, -0.5F, 5, 12, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[70].setRotationPoint(-26F, -6F, 0F);
		bodyModel[70].rotateAngleX = -0.78539816F;

		bodyModel[71].addBox(0F, -6F, -0.5F, 12, 12, 1, 0F); // Box 0
		bodyModel[71].setRotationPoint(-21F, -6F, 0F);
		bodyModel[71].rotateAngleX = -0.78539816F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		noseModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
		noseModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		noseModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		noseModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		noseModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		noseModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 0
		noseModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 0
		noseModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 0
		noseModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 0

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 9, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.75F, -2.5F, 0F, -3.25F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F); // Box 0
		noseModel[0].setRotationPoint(-73F, -31F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 9, 9, 0F,0F, -3.25F, -3F, 0F, -2.75F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		noseModel[1].setRotationPoint(-73F, -31F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 11, 9, 9, 0F,0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.25F, -3F, 0F, -2.75F, -2.5F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 0
		noseModel[2].setRotationPoint(-73F, -21F, -9F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 11, 9, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -2.75F, -2.5F, 0F, -3.25F, -3F); // Box 0
		noseModel[3].setRotationPoint(-73F, -21F, 0F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F,0F, -5.75F, -5F, 0F, -3.25F, -3F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		noseModel[4].setRotationPoint(-76F, -31F, -9F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -3.25F, -3F, 0F, -5.75F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -4F); // Box 0
		noseModel[5].setRotationPoint(-76F, -31F, 0F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -4F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3.25F, -3F, 0F, -5.75F, -5F); // Box 0
		noseModel[6].setRotationPoint(-76F, -21F, 0F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F,0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5.75F, -5F, 0F, -3.25F, -3F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 0
		noseModel[7].setRotationPoint(-76F, -21F, -9F);

		noseModel[8].addShapeBox(0F, -3.5F, -3.5F, 3, 7, 7, 0F,0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F); // Box 0
		noseModel[8].setRotationPoint(-79F, -21.5F, 0F);

		noseModel[9].addShapeBox(0F, -3.5F, -3.5F, 3, 7, 7, 0F,0F, -3.5F, -3.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -3.5F, -3.5F); // Box 0
		noseModel[9].setRotationPoint(-82F, -21.5F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 0
		tailModel[2] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 0
		tailModel[3] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 0
		tailModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 0
		tailModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 0
		tailModel[6] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 0
		tailModel[7] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 0
		tailModel[8] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 0

		tailModel[0].addShapeBox(0F, 0F, -0.5F, 5, 23, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F); // Box 0
		tailModel[0].setRotationPoint(61F, -48F, 0F);

		tailModel[1].addShapeBox(0F, 0F, -0.5F, 16, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -9F); // Box 0
		tailModel[1].setRotationPoint(53F, -23F, 0F);

		tailModel[2].addShapeBox(0F, 0F, -0.5F, 16, 1, 40, 0F,-8F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[2].setRotationPoint(53F, -23F, -40F);

		tailModel[3].addShapeBox(-0.5F, -0.5F, -0.5F, 62, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 0
		tailModel[3].setRotationPoint(3.5F, -47.6F, 0F);
		tailModel[3].rotateAngleZ = -0.01745329F;

		tailModel[4].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[4].setRotationPoint(71F, -22F, 0F);

		tailModel[5].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 0
		tailModel[5].setRotationPoint(71F, -20F, 0.7F);
		tailModel[5].rotateAngleZ = 0.52359878F;

		tailModel[6].addShapeBox(0F, 0F, -0.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[6].setRotationPoint(72F, -18.5F, 0F);

		tailModel[7].addShapeBox(0F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		tailModel[7].setRotationPoint(72F, -15.5F, 0F);

		tailModel[8].addBox(0F, 0F, -0.5F, 4, 2, 1, 0F); // Box 0
		tailModel[8].setRotationPoint(72F, -17.5F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 0
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 0
		leftWingModel[2] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 0
		leftWingModel[3] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 0

		leftWingModel[0].addShapeBox(0F, -3F, -90F, 52, 5, 90, 0F,-7F, -2F, 0F, -16F, -2F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -15F, 0F, 0F, 4F, -2F, 0F, 0F, -0.7F, 0.3F); // Box 0
		leftWingModel[0].setRotationPoint(-47F, -13F, 0F);
		leftWingModel[0].rotateAngleX = -0.08726646F;

		leftWingModel[1].addShapeBox(0F, -3F, -107F, 52, 5, 17, 0F,-9F, -3F, 0F, -20F, -3F, 0F, -16F, -2F, 0F, -7F, -2F, 0F, -8F, 0F, 0F, -19F, 0F, 0F, -15F, 0F, 0F, -6F, 0F, 0F); // Box 0
		leftWingModel[1].setRotationPoint(-47F, -13F, 0F);
		leftWingModel[1].rotateAngleX = -0.08726646F;

		leftWingModel[2].addShapeBox(0F, -3F, -114F, 52, 5, 7, 0F,-15F, -3F, 0F, -34F, -3F, 0F, -20F, -3F, 0F, -9F, -3F, 0F, -13F, 0F, 0F, -32F, 0F, 0F, -19F, 0F, 0F, -8F, 0F, 0F); // Box 0
		leftWingModel[2].setRotationPoint(-47F, -13F, 0F);
		leftWingModel[2].rotateAngleX = -0.08726646F;

		leftWingModel[3].addShapeBox(0F, -3F, -3F, 32, 5, 5, 0F,-8F, 2F, 16F, 9F, 0F, -2F, -16F, -2F, 0F, -7F, -2F, 0F, -9F, -3.7F, 15.3F, 8F, -5F, -2F, -15F, 0F, 0F, -6F, 0F, 0F); // Box 0
		leftWingModel[3].setRotationPoint(-5F, -15F, 0F);
		leftWingModel[3].rotateAngleX = 0.08726646F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		rightWingModel[1] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 0
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		rightWingModel[3] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 0

		rightWingModel[0].addShapeBox(0F, -3F, 0F, 52, 5, 90, 0F,0F, 0F, 0F, 2F, 1F, 0F, -16F, -2F, 0F, -7F, -2F, 0F, 0F, -0.7F, 0.2F, 4F, -2F, 0F, -15F, 0F, 0F, -6F, 0F, 0F); // Box 0
		rightWingModel[0].setRotationPoint(-47F, -13F, 0F);
		rightWingModel[0].rotateAngleX = 0.08726646F;

		rightWingModel[1].addShapeBox(0F, -3F, 90F, 52, 5, 17, 0F,-7F, -2F, 0F, -16F, -2F, 0F, -20F, -3F, 0F, -9F, -3F, 0F, -6F, 0F, 0F, -15F, 0F, 0F, -19F, 0F, 0F, -8F, 0F, 0F); // Box 0
		rightWingModel[1].setRotationPoint(-47F, -13F, 0F);
		rightWingModel[1].rotateAngleX = 0.08726646F;

		rightWingModel[2].addShapeBox(0F, -3F, 107F, 52, 5, 7, 0F,-9F, -3F, 0F, -20F, -3F, 0F, -34F, -3F, 0F, -15F, -3F, 0F, -8F, 0F, 0F, -19F, 0F, 0F, -32F, 0F, 0F, -13F, 0F, 0F); // Box 0
		rightWingModel[2].setRotationPoint(-47F, -13F, 0F);
		rightWingModel[2].rotateAngleX = 0.08726646F;

		rightWingModel[3].addShapeBox(0F, -3F, -2F, 32, 5, 5, 0F,-7F, -2F, 0F, -16F, -2F, 0F, 9F, 0F, -2F, -8F, 2F, 16F, -6F, 0F, 0F, -15F, 0F, 0F, 8F, -5F, -2F, -9F, -3.7F, 15.3F); // Box 0
		rightWingModel[3].setRotationPoint(-5F, -15F, 0F);
		rightWingModel[3].rotateAngleX = -0.08726646F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 0
		yawFlapModel[1] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 0

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 5, 23, 1, 0F,0F, -3F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 6F, 1F, 0F, 0F, 0F, 0F); // Box 0
		yawFlapModel[0].setRotationPoint(66F, -48F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 5, 9, 1, 0F,0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 0
		yawFlapModel[1].setRotationPoint(66F, -54F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 0

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 40, 0F,0F, 0F, 0F, -11F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		pitchFlapLeftModel[0].setRotationPoint(69F, -22.5F, -40F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 0

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 40, 0F,0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, -5F, 0F, 0F, 0F); // Box 0
		pitchFlapRightModel[0].setRotationPoint(69F, -22.5F, 0F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 0
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 0
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 0
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 0
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 0
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 0

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 0
		leftWingWheelModel[0].setRotationPoint(-35F, -2F, -37F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 12, 4, 4, 0F); // Box 0
		leftWingWheelModel[1].setRotationPoint(-39F, 2F, -37F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingWheelModel[2].setRotationPoint(-35F, 6F, -37F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 0
		leftWingWheelModel[3].setRotationPoint(-34.5F, -3.5F, -33F);

		leftWingWheelModel[4].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 0
		leftWingWheelModel[4].setRotationPoint(-34.5F, -3.5F, -36.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftWingWheelModel[5].setRotationPoint(-33.5F, -14.5F, -35.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 0
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 0
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 0
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 0
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 0

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 0
		rightWingWheelModel[0].setRotationPoint(-35F, -2F, 33F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 12, 4, 4, 0F); // Box 0
		rightWingWheelModel[1].setRotationPoint(-39F, 2F, 33F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingWheelModel[2].setRotationPoint(-35F, 6F, 33F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 0
		rightWingWheelModel[3].setRotationPoint(-34.5F, -3.5F, 32F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 0
		rightWingWheelModel[4].setRotationPoint(-34.5F, -3.5F, 32.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		rightWingWheelModel[5].setRotationPoint(-33.5F, -14.5F, 34.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-78F, -22F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY);
		prop[0].addBox(-0.5F, -22F, -1F, 1, 22, 2, 0.0F);
		prop[1].addBox(-0.5F, -22F, -1F, 1, 22, 2, 0.0F);
		prop[2].addBox(-0.5F, -22F, -1F, 1, 22, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}