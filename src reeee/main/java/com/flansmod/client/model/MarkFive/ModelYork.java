//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: York
// Model Creator: 
// Created on: 16.03.2018 - 00:49:20
// Last changed on: 16.03.2018 - 00:49:20

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYork extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelYork() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[81];
		turretModel = new ModelRendererTurbo[59];
		barrelModel = new ModelRendererTurbo[25];
		leftTrackWheelModels = new ModelRendererTurbo[42];
		rightTrackWheelModels = new ModelRendererTurbo[36];
		leftTrackModel = new ModelRendererTurbo[30];
		rightTrackModel = new ModelRendererTurbo[30];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 289, 457, textureX, textureY); // Box 244
		bodyModel[44] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 245
		bodyModel[45] = new ModelRendererTurbo(this, 209, 473, textureX, textureY); // Box 246
		bodyModel[46] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 248
		bodyModel[47] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Box 269
		bodyModel[48] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 270
		bodyModel[49] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 271
		bodyModel[50] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 272
		bodyModel[51] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 273
		bodyModel[52] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 274
		bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 275
		bodyModel[54] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 276
		bodyModel[55] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 277
		bodyModel[56] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 278
		bodyModel[57] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 279
		bodyModel[58] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 280
		bodyModel[59] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 281
		bodyModel[60] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 282
		bodyModel[61] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 283
		bodyModel[62] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 284
		bodyModel[63] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 285
		bodyModel[64] = new ModelRendererTurbo(this, 361, 393, textureX, textureY); // Box 286
		bodyModel[65] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 287
		bodyModel[66] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 288
		bodyModel[67] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 289
		bodyModel[68] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 290
		bodyModel[69] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 291
		bodyModel[70] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 292
		bodyModel[71] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 293
		bodyModel[72] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 294
		bodyModel[73] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 295
		bodyModel[74] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 296
		bodyModel[75] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 297
		bodyModel[76] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 298
		bodyModel[77] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 299
		bodyModel[78] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 300
		bodyModel[79] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 301
		bodyModel[80] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 302

		bodyModel[0].addShapeBox(0F, 0F, 0F, 87, 8, 11, 0F,17F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-54F, -2.25F, -5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 87, 8, 8, 0F,17F, 1F, 0F, 9F, 0F, 0F, 13F, 0F, 0F, 17F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-54F, -2.25F, -13.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 87, 8, 8, 0F,17F, 0F, 0F, 13F, 0F, 0F, 9F, 0F, 0F, 17F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-54F, -2.25F, 5.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 87, 6, 11, 0F,34F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 34F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-41F, -8.25F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 87, 6, 8, 0F,34F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 34F, 0F, 0F, 30F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-41F, -8.25F, -13.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 87, 6, 8, 0F,34F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 34F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 30F, -1F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-41F, -8.25F, 5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 90, 8, 11, 0F,34F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, -0.5F, 0F, 34F, -0.5F, 0F, 34F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 34F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-44F, -16.25F, -5.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 90, 8, 8, 0F,34F, -0.5F, 0F, -11F, -0.5F, 0F, -8F, -0.5F, 0F, 34F, -0.5F, 0F, 34F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 34F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-44F, -16.25F, -13.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 90, 8, 8, 0F,34F, -0.5F, 0F, -8F, -0.5F, 0F, -11F, -0.5F, 0F, 34F, -0.5F, 0F, 34F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 34F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-44F, -16.25F, 5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 79, 3, 11, 0F,34F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 34F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-44F, -18.75F, -5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 79, 3, 8, 0F,34F, 0F, 0F, -18F, 0F, 0F, -8F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 34F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-44F, -18.75F, -13.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 79, 3, 8, 0F,34F, 0F, 0F, -8F, 0F, 0F, -18F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 34F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-44F, -18.75F, 5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 87, 7, 5, 0F,17F, 2F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, 17F, 1F, 0F, -4F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-54F, -2.25F, -18.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 87, 7, 5, 0F,17F, 1F, 0F, 9F, 0F, 0F, 6F, 0F, 0F, 17F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -3F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-54F, -2.25F, 13.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 117, 6, 5, 0F,4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, -2F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-71F, -8.25F, 13.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 117, 6, 5, 0F,2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-71F, -8.25F, -18.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 90, 8, 5, 0F,34F, -0.5F, 0F, -11F, -0.5F, 0F, -15F, -0.5F, 0F, 34F, -0.5F, 0F, 34F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 32F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-44F, -16.25F, 13.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 79, 3, 5, 0F,34F, 0F, 0F, -18F, 0F, 0F, -23F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 34F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-44F, -18.75F, 13.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 79, 3, 5, 0F,34F, 0F, 0F, -23F, 0F, 0F, -18F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 34F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-44F, -18.75F, -18.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 90, 8, 5, 0F,34F, -0.5F, 0F, -15F, -0.5F, 0F, -11F, -0.5F, 0F, 34F, -0.5F, 0F, 32F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 34F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-44F, -16.25F, -18.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 5, 37, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-55F, -23.75F, -18.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 5, 37, 0F,0F, 0F, -4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 11F, 0F, -5F, 11F, 0F, -5F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-49F, -23.75F, -18.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 23, 5, 37, 0F,0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-78F, -23.75F, -18.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 90, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-75F, -17.75F, -36.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 32, 1, 18, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(15F, -17.75F, -36.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(47F, -15.75F, -36.5F);
		bodyModel[25].rotateAngleZ = -0.4712389F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(51.5F, -13.5F, -36.5F);
		bodyModel[26].rotateAngleZ = -1.11701072F;

		bodyModel[27].addShapeBox(-3F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(-75F, -17.75F, -36.5F);
		bodyModel[27].rotateAngleZ = 0.34906585F;

		bodyModel[28].addShapeBox(-5F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-77.85F, -16.75F, -36.5F);
		bodyModel[28].rotateAngleZ = 0.54105207F;

		bodyModel[29].addShapeBox(-3.65F, 0.05F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-81.85F, -14.75F, -36.5F);
		bodyModel[29].rotateAngleZ = 0.99483767F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(51.5F, -13.5F, 18.5F);
		bodyModel[30].rotateAngleZ = -1.11701072F;

		bodyModel[31].addShapeBox(-3.65F, 0.05F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(-81.85F, -14.75F, 18.5F);
		bodyModel[31].rotateAngleZ = 0.99483767F;

		bodyModel[32].addShapeBox(-5F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-77.85F, -16.75F, 18.5F);
		bodyModel[32].rotateAngleZ = 0.54105207F;

		bodyModel[33].addShapeBox(-3F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-75F, -17.75F, 18.5F);
		bodyModel[33].rotateAngleZ = 0.34906585F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 90, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-75F, -17.75F, 18.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(47F, -15.75F, 18.5F);
		bodyModel[35].rotateAngleZ = -0.4712389F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 32, 1, 18, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(15F, -17.75F, 18.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 40
		bodyModel[37].setRotationPoint(47F, -15.75F, 18.5F);
		bodyModel[37].rotateAngleZ = -0.4712389F;

		bodyModel[38].addShapeBox(0F, 0.25F, 0F, 4, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -3F, 0F, -0.9F); // Box 41
		bodyModel[38].setRotationPoint(51.5F, -13.5F, 18.5F);
		bodyModel[38].rotateAngleZ = -1.13446401F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 32, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 1.5F, 0F, -3.75F, 1.5F, -0.9F, 0F, 0F, -0.9F); // Box 42
		bodyModel[39].setRotationPoint(15F, -16.75F, 18.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 32, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -3.75F, 1.5F, -0.9F, -3.75F, 1.5F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(15F, -16.75F, -20.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -4F, 0F, -0.9F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[41].setRotationPoint(47F, -15.75F, -20.5F);
		bodyModel[41].rotateAngleZ = -0.4712389F;

		bodyModel[42].addShapeBox(0F, 0.25F, 0F, 4, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[42].setRotationPoint(51.5F, -13.5F, -20.5F);
		bodyModel[42].rotateAngleZ = -1.13446401F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 97, 6, 5, 0F,2F, 0F, 2F, -1F, 0F, -1F, 2F, 0F, 0F, 4F, 0F, 0F, -1F, -2F, 0F, -7F, -4F, -1F, -4F, 0F, 0F, 2F, 1F, 0F); // Box 244
		bodyModel[43].setRotationPoint(-54F, -8.25F, -23.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 97, 6, 5, 0F,2F, 1F, 2F, -10F, -2F, -1F, -8F, 0F, 0F, 4F, 3F, 0F, 2F, 0F, 2F, -1F, 0F, -1F, 1F, 0F, -1F, 4F, 0F, 0F); // Box 245
		bodyModel[44].setRotationPoint(-54F, -14.25F, -23.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 97, 6, 5, 0F,4F, 3F, 0F, -8F, 0F, 0F, -10F, -2F, -1F, 2F, 1F, 2F, 4F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 2F, 0F, 2F); // Box 246
		bodyModel[45].setRotationPoint(-54F, -14.25F, 18.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 97, 6, 5, 0F,4F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -1F, 2F, 0F, 2F, 2F, 1F, 0F, -4F, 0F, 0F, -7F, -4F, -1F, -1F, -2F, 0F); // Box 248
		bodyModel[46].setRotationPoint(-54F, -8.25F, 18.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 269
		bodyModel[47].setRotationPoint(40F, -14F, -17.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 270
		bodyModel[48].setRotationPoint(40F, -17F, -18.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, -2.3F, 0F, -0.3F, -2.3F); // Box 271
		bodyModel[49].setRotationPoint(40F, -19.4F, -16.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 272
		bodyModel[50].setRotationPoint(40F, -19.8F, -16.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 273
		bodyModel[51].setRotationPoint(40F, -17F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -2.3F, 0F, -0.3F, -2.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F); // Box 274
		bodyModel[52].setRotationPoint(40F, -19.4F, -11.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 275
		bodyModel[53].setRotationPoint(40F, -14F, -17.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 276
		bodyModel[54].setRotationPoint(40F, -14F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[55].setRotationPoint(40F, -17F, -17.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[56].setRotationPoint(40F, -16F, -17.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 279
		bodyModel[57].setRotationPoint(40F, -15F, -17.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[58].setRotationPoint(40F, -17F, -12.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 281
		bodyModel[59].setRotationPoint(40F, -15F, -12.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[60].setRotationPoint(40F, -16F, -12.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[61].setRotationPoint(40F, -19F, -15F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 284
		bodyModel[62].setRotationPoint(40F, -17F, -15F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[63].setRotationPoint(40F, -18F, -15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 286
		bodyModel[64].setRotationPoint(40F, -14F, 9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 287
		bodyModel[65].setRotationPoint(40F, -17F, 17.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -2.3F, 0F, -0.3F, -2.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F); // Box 288
		bodyModel[66].setRotationPoint(40F, -19.4F, 15.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, -0.3F, -1.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 289
		bodyModel[67].setRotationPoint(40F, -19.8F, 10.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 290
		bodyModel[68].setRotationPoint(40F, -17F, 8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, -2.3F, 0F, -0.3F, -2.3F); // Box 291
		bodyModel[69].setRotationPoint(40F, -19.4F, 10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 292
		bodyModel[70].setRotationPoint(40F, -14F, 16.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 293
		bodyModel[71].setRotationPoint(40F, -14F, 9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[72].setRotationPoint(40F, -17F, 14.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[73].setRotationPoint(40F, -16F, 14.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
		bodyModel[74].setRotationPoint(40F, -15F, 14.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[75].setRotationPoint(40F, -17F, 9.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 298
		bodyModel[76].setRotationPoint(40F, -15F, 9.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[77].setRotationPoint(40F, -16F, 9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[78].setRotationPoint(40F, -19F, 12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 301
		bodyModel[79].setRotationPoint(40F, -17F, 12F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[80].setRotationPoint(40F, -18F, 12F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 401, 473, textureX, textureY); // Box 212
		turretModel[1] = new ModelRendererTurbo(this, 209, 489, textureX, textureY); // Box 213
		turretModel[2] = new ModelRendererTurbo(this, 257, 489, textureX, textureY); // Box 214
		turretModel[3] = new ModelRendererTurbo(this, 337, 489, textureX, textureY); // Box 215
		turretModel[4] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 216
		turretModel[5] = new ModelRendererTurbo(this, 465, 497, textureX, textureY); // Box 217
		turretModel[6] = new ModelRendererTurbo(this, 113, 505, textureX, textureY); // Box 218
		turretModel[7] = new ModelRendererTurbo(this, 481, 473, textureX, textureY); // Box 219
		turretModel[8] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 220
		turretModel[9] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 221
		turretModel[10] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 222
		turretModel[11] = new ModelRendererTurbo(this, 385, 489, textureX, textureY); // Box 223
		turretModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 224
		turretModel[13] = new ModelRendererTurbo(this, 177, 505, textureX, textureY); // Box 225
		turretModel[14] = new ModelRendererTurbo(this, 313, 513, textureX, textureY); // Box 226
		turretModel[15] = new ModelRendererTurbo(this, 209, 513, textureX, textureY); // Box 227
		turretModel[16] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 228
		turretModel[17] = new ModelRendererTurbo(this, 233, 513, textureX, textureY); // Box 229
		turretModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 230
		turretModel[19] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 231
		turretModel[20] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 232
		turretModel[21] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 233
		turretModel[22] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 234
		turretModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 235
		turretModel[24] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 236
		turretModel[25] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 237
		turretModel[26] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 238
		turretModel[27] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 239
		turretModel[28] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 240
		turretModel[29] = new ModelRendererTurbo(this, 353, 513, textureX, textureY); // Box 241
		turretModel[30] = new ModelRendererTurbo(this, 489, 497, textureX, textureY); // Box 242
		turretModel[31] = new ModelRendererTurbo(this, 377, 521, textureX, textureY); // Box 243
		turretModel[32] = new ModelRendererTurbo(this, 153, 537, textureX, textureY); // Box 244
		turretModel[33] = new ModelRendererTurbo(this, 233, 537, textureX, textureY); // Box 246
		turretModel[34] = new ModelRendererTurbo(this, 297, 537, textureX, textureY); // Box 247
		turretModel[35] = new ModelRendererTurbo(this, 441, 537, textureX, textureY); // Box 248
		turretModel[36] = new ModelRendererTurbo(this, 113, 521, textureX, textureY); // Box 249
		turretModel[37] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 250
		turretModel[38] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 251
		turretModel[39] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 252
		turretModel[40] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 253
		turretModel[41] = new ModelRendererTurbo(this, 361, 545, textureX, textureY); // Box 254
		turretModel[42] = new ModelRendererTurbo(this, 153, 561, textureX, textureY); // Box 255
		turretModel[43] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 257
		turretModel[44] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 258
		turretModel[45] = new ModelRendererTurbo(this, 481, 537, textureX, textureY); // Box 259
		turretModel[46] = new ModelRendererTurbo(this, 393, 561, textureX, textureY); // Box 287
		turretModel[47] = new ModelRendererTurbo(this, 449, 561, textureX, textureY); // Box 290
		turretModel[48] = new ModelRendererTurbo(this, 1, 569, textureX, textureY); // Box 291
		turretModel[49] = new ModelRendererTurbo(this, 65, 569, textureX, textureY); // Box 292
		turretModel[50] = new ModelRendererTurbo(this, 73, 569, textureX, textureY); // Box 260
		turretModel[51] = new ModelRendererTurbo(this, 137, 569, textureX, textureY); // Box 261
		turretModel[52] = new ModelRendererTurbo(this, 281, 569, textureX, textureY); // Box 262
		turretModel[53] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 263
		turretModel[54] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 264
		turretModel[55] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 265
		turretModel[56] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 266
		turretModel[57] = new ModelRendererTurbo(this, 401, 369, textureX, textureY); // Box 267
		turretModel[58] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Box 268

		turretModel[0].addShapeBox(0F, 0F, 0F, 21, 22, 15, 0F,0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.5F, 0F, 0F, 0F); // Box 212
		turretModel[0].setRotationPoint(2F, -47F, 7F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 21, 22, 1, 0F,0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -0.5F, -1F, 0F, 5F, 8F, 0F, 7F); // Box 213
		turretModel[1].setRotationPoint(2F, -47F, 22F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 21, 22, 15, 0F,0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0.5F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[2].setRotationPoint(2F, -47F, -23F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 21, 22, 1, 0F,0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 8F, 0F, 7F, -1F, 0F, 5F, 5F, 0F, -0.5F, 0F, 0F, 0F); // Box 215
		turretModel[3].setRotationPoint(2F, -47F, -24F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 36, 22, 37, 0F,0F, 0F, 0F, 0.5F, 0F, 4.5F, 0.5F, 0F, 5.5F, 0F, 0F, 0F, 6F, -0.5F, 7.5F, -7.5F, 0F, 11.5F, -7.5F, 0F, 12.5F, 6F, 0F, 8.5F); // Box 216
		turretModel[4].setRotationPoint(-34.5F, -47F, -19.5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 1, 22, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		turretModel[5].setRotationPoint(2F, -47F, -8F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 31, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 3.5F, 0F, 2F, 0F, 1.5F, 0.5F, 0F); // Box 218
		turretModel[6].setRotationPoint(-37.5F, -28.5F, -33.5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 8, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		turretModel[7].setRotationPoint(-42.5F, -53.5F, -15.5F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 8, 19, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		turretModel[8].setRotationPoint(-42.5F, -53.5F, -7.5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 221
		turretModel[9].setRotationPoint(-43F, -59F, -11.5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 2, 23, 4, 0F,0F, 0F, 0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F); // Box 222
		turretModel[10].setRotationPoint(-38F, -68.5F, -11.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 2, 23, 4, 0F,0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.7F); // Box 223
		turretModel[11].setRotationPoint(-40F, -68.5F, -11.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		turretModel[12].setRotationPoint(-39F, -75.5F, -10.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Box 225
		turretModel[13].setRotationPoint(-40F, -74.5F, -20.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 10, 4, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		turretModel[14].setRotationPoint(-22.5F, -50.5F, 1F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 13, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 227
		turretModel[15].setRotationPoint(-22.5F, -50.5F, 18F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 228
		turretModel[16].setRotationPoint(-9.5F, -50.5F, 18F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 15, 0F,-1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 229
		turretModel[17].setRotationPoint(-21.5F, -52.5F, 2F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 230
		turretModel[18].setRotationPoint(-17.5F, -52.5F, 2F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 231
		turretModel[19].setRotationPoint(-17.5F, -52.5F, 12F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 232
		turretModel[20].setRotationPoint(-12F, -56F, 22F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		turretModel[21].setRotationPoint(-11F, -56F, 22F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 234
		turretModel[22].setRotationPoint(-10F, -56F, 22F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 235
		turretModel[23].setRotationPoint(-16F, -57F, 22F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 236
		turretModel[24].setRotationPoint(-16F, -58.5F, 22F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 237
		turretModel[25].setRotationPoint(-16F, -62.5F, 22F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 238
		turretModel[26].setRotationPoint(-16F, -64F, 22F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 239
		turretModel[27].setRotationPoint(-7F, -64F, 22F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 240
		turretModel[28].setRotationPoint(-7F, -62.5F, 22F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F); // Box 241
		turretModel[29].setRotationPoint(-14F, -65F, 21F);

		turretModel[30].addShapeBox(0F, 3F, 4F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		turretModel[30].setRotationPoint(-14F, -65F, 21.5F);
		turretModel[30].rotateAngleX = 0.45378561F;

		turretModel[31].addShapeBox(-11.5F, 0F, 5F, 30, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 243
		turretModel[31].setRotationPoint(-14F, -65F, 21.5F);
		turretModel[31].rotateAngleX = 0.45378561F;

		turretModel[32].addShapeBox(-11.5F, -10F, 5F, 30, 10, 7, 0F,-10F, 0F, 0F, -10F, 0F, 0F, -10F, -9.9F, 0F, -10F, -9.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 244
		turretModel[32].setRotationPoint(-14F, -65F, 21.5F);
		turretModel[32].rotateAngleX = 0.45378561F;

		turretModel[33].addShapeBox(-11.5F, 10F, 5F, 30, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, -9.9F, 0F, -10F, -9.9F, 0F); // Box 246
		turretModel[33].setRotationPoint(-14F, -65F, 21.5F);
		turretModel[33].rotateAngleX = 0.45378561F;

		turretModel[34].addShapeBox(0F, 0F, 0F, 10, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3.5F, 0F, 1F); // Box 247
		turretModel[34].setRotationPoint(-47F, -34.5F, 12F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.6F, 0F); // Box 248
		turretModel[35].setRotationPoint(-47F, -34.5F, -4F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.6F, 0F); // Box 249
		turretModel[36].setRotationPoint(-47F, -34.5F, -21F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Box 250
		turretModel[37].setRotationPoint(-48F, -37.5F, -19.5F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Box 251
		turretModel[38].setRotationPoint(-48F, -37.5F, 27.5F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -15.4F, 0F, -0.4F, 14.6F, 0F, -0.4F, 14.6F, 0F, -0.4F, -15.4F, 0F, -0.4F); // Box 252
		turretModel[39].setRotationPoint(-62F, -58.5F, 28F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -15.4F, 0F, -0.4F, 14.6F, 0F, -0.4F, 14.6F, 0F, -0.4F, -15.4F, 0F, -0.4F); // Box 253
		turretModel[40].setRotationPoint(-62F, -58.5F, -19F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 21, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		turretModel[41].setRotationPoint(-37F, -46.5F, 36F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 18, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F, 0F); // Box 255
		turretModel[42].setRotationPoint(-16F, -46.5F, 36F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 6.7F, 0F, -0.3F, 6.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -7.3F, 0F, -0.3F, -7.3F, 0F); // Box 257
		turretModel[43].setRotationPoint(-37F, -33.5F, 29.5F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 258
		turretModel[44].setRotationPoint(-37F, -27.5F, 29.5F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 4, 8, 9, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 259
		turretModel[45].setRotationPoint(-37F, -34.5F, 21F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,0F, 0F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		turretModel[46].setRotationPoint(3F, -46F, -7F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 16, 5, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		turretModel[47].setRotationPoint(3F, -41F, -7F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 15, 5, 13, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		turretModel[48].setRotationPoint(2F, -36F, -7F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 13, 6, 13, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F); // Box 292
		turretModel[49].setRotationPoint(3F, -31F, -7F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 6, 6, 46, 0F,0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 14F, 0F, 0F, -5F, 0F, -12F, -5F, 0F, -12F, 14F, 0F, 0F); // Box 260
		turretModel[50].setRotationPoint(22F, -25F, -23.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 14, 6, 57, 0F,0F, 0F, 2.5F, 14F, 0F, 0.5F, 14F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -4.5F); // Box 261
		turretModel[51].setRotationPoint(-6F, -25F, -28.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 14, 6, 57, 0F,14F, 1F, -15.5F, 0F, 0F, 2.5F, 0F, 0F, 1.5F, 14F, 1F, -16.5F, 0F, 0F, -11F, 0F, 0F, -2.5F, 0F, 0F, -4.5F, 0F, 0F, -12F); // Box 262
		turretModel[52].setRotationPoint(-20F, -25F, -28.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		turretModel[53].setRotationPoint(-19.5F, -52F, -18.5F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		turretModel[54].setRotationPoint(-17.5F, -55F, -18.5F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 265
		turretModel[55].setRotationPoint(-18.5F, -55F, -18.5F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 266
		turretModel[56].setRotationPoint(-16.5F, -55F, -18.5F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 1F, -2.5F, -3F, 1.5F, 2F, 2F, 0.5F, -2F, 0.5F, 0F, -2.5F, -2F, 0F, -5F, -3F, 0F, 1F, 1.5F, 0F, -1.5F); // Box 267
		turretModel[57].setRotationPoint(9F, -31.5F, 26.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,2F, 0.5F, -2F, -3F, 1.5F, 2F, 0F, 1F, -2.5F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, -3F, 0F, 1F, -2F, 0F, -5F, 0.5F, 0F, -2.5F); // Box 268
		turretModel[58].setRotationPoint(9F, -31.5F, -32.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 337
		barrelModel[1] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 338
		barrelModel[2] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 339
		barrelModel[3] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 347
		barrelModel[4] = new ModelRendererTurbo(this, 177, 385, textureX, textureY); // Box 348
		barrelModel[5] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 351
		barrelModel[6] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 355
		barrelModel[7] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 356
		barrelModel[8] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 357
		barrelModel[9] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 272
		barrelModel[10] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 273
		barrelModel[11] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 274
		barrelModel[12] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 275
		barrelModel[13] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 276
		barrelModel[14] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 277
		barrelModel[15] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 278
		barrelModel[16] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 279
		barrelModel[17] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 280
		barrelModel[18] = new ModelRendererTurbo(this, 57, 409, textureX, textureY); // Box 281
		barrelModel[19] = new ModelRendererTurbo(this, 321, 417, textureX, textureY); // Box 282
		barrelModel[20] = new ModelRendererTurbo(this, 193, 561, textureX, textureY); // Box 283
		barrelModel[21] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 284
		barrelModel[22] = new ModelRendererTurbo(this, 473, 305, textureX, textureY); // Box 285
		barrelModel[23] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Box 286
		barrelModel[24] = new ModelRendererTurbo(this, 1, 529, textureX, textureY); // Box 293

		barrelModel[0].addShapeBox(8F, 0.5F, 2F, 12, 2, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.05F, -1F, 0F, 0.05F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 337
		barrelModel[0].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[1].addShapeBox(8F, -2.5F, 2F, 12, 2, 3, 0F,0F, 0.05F, -1F, 0F, -0.05F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 338
		barrelModel[1].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[2].addShapeBox(8F, -0.5F, 2F, 12, 1, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 339
		barrelModel[2].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[3].addShapeBox(17F, -0.5F, 2F, 40, 1, 3, 0F,0F, -0.1F, -0.35F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.1F, -0.35F); // Box 347
		barrelModel[3].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[4].addShapeBox(17F, -1.5F, 2F, 40, 1, 3, 0F,0F, -0.45F, -1F, 0F, -0.75F, -1.3F, 0F, -0.75F, -1.3F, 0F, -0.45F, -1F, 0F, 0.1F, -0.35F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.1F, -0.35F); // Box 348
		barrelModel[4].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[5].addShapeBox(17F, 0.5F, 2F, 40, 1, 3, 0F,0F, 0.1F, -0.35F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.1F, -0.35F, 0F, -0.45F, -1F, 0F, -0.75F, -1.3F, 0F, -0.75F, -1.3F, 0F, -0.45F, -1F); // Box 351
		barrelModel[5].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[6].addShapeBox(52F, -1.5F, 2F, 5, 1, 3, 0F,-0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F); // Box 355
		barrelModel[6].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[7].addShapeBox(52F, 0.5F, 2F, 5, 1, 3, 0F,-0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 356
		barrelModel[7].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[8].addShapeBox(52F, -0.2F, 2F, 5, 1, 3, 0F,-0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F); // Box 357
		barrelModel[8].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[9].addShapeBox(56.5F, -1.5F, 2F, 5, 1, 3, 0F,-0.25F, -0.5F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, 0.2F, -0.35F, -0.25F, -0.2F, 0.15F, -0.25F, -0.2F, 0.15F, -0.25F, 0.2F, -0.35F); // Box 272
		barrelModel[9].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[10].addShapeBox(56.5F, -0.2F, 2F, 5, 1, 3, 0F,-0.25F, 0.1F, -0.35F, -0.25F, 0.5F, 0.15F, -0.25F, 0.5F, 0.15F, -0.25F, 0.1F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, -0.5F, -0.35F); // Box 273
		barrelModel[10].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[11].addShapeBox(56.5F, 0.5F, 2F, 5, 1, 3, 0F,-0.25F, 0.2F, -0.35F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.25F, 0.2F, -0.35F, -0.25F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, -1F); // Box 274
		barrelModel[11].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[12].addShapeBox(56.5F, -1.5F, -5.5F, 5, 1, 3, 0F,-0.25F, -0.5F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, 0.2F, -0.35F, -0.25F, -0.2F, 0.15F, -0.25F, -0.2F, 0.15F, -0.25F, 0.2F, -0.35F); // Box 275
		barrelModel[12].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[13].addShapeBox(56.5F, 0.5F, -5.5F, 5, 1, 3, 0F,-0.25F, 0.2F, -0.35F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.25F, 0.2F, -0.35F, -0.25F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, -1F); // Box 276
		barrelModel[13].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[14].addShapeBox(56.5F, -0.2F, -5.5F, 5, 1, 3, 0F,-0.25F, 0.1F, -0.35F, -0.25F, 0.5F, 0.15F, -0.25F, 0.5F, 0.15F, -0.25F, 0.1F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, -0.5F, -0.35F); // Box 277
		barrelModel[14].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[15].addShapeBox(52F, -1.5F, -5.5F, 5, 1, 3, 0F,-0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F); // Box 278
		barrelModel[15].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[16].addShapeBox(52F, -0.2F, -5.5F, 5, 1, 3, 0F,-0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F); // Box 279
		barrelModel[16].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[17].addShapeBox(52F, 0.5F, -5.5F, 5, 1, 3, 0F,-0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F); // Box 280
		barrelModel[17].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[18].addShapeBox(17F, -1.5F, -5.5F, 40, 1, 3, 0F,0F, -0.45F, -1F, 0F, -0.75F, -1.3F, 0F, -0.75F, -1.3F, 0F, -0.45F, -1F, 0F, 0.1F, -0.35F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.1F, -0.35F); // Box 281
		barrelModel[18].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[19].addShapeBox(17F, -0.5F, -5.5F, 40, 1, 3, 0F,0F, -0.1F, -0.35F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.1F, -0.35F); // Box 282
		barrelModel[19].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[20].addShapeBox(17F, 0.5F, -5.5F, 40, 1, 3, 0F,0F, 0.1F, -0.35F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.1F, -0.35F, 0F, -0.45F, -1F, 0F, -0.75F, -1.3F, 0F, -0.75F, -1.3F, 0F, -0.45F, -1F); // Box 283
		barrelModel[20].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[21].addShapeBox(8F, -2.5F, -5.5F, 12, 2, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.05F, -1F, 0F, 0.05F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 284
		barrelModel[21].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[22].addShapeBox(8F, -0.5F, -5.5F, 12, 1, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 285
		barrelModel[22].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[23].addShapeBox(8F, 0.5F, -5.5F, 12, 2, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.05F, -1F, 0F, 0.05F, -1F); // Box 286
		barrelModel[23].setRotationPoint(6.95F, -35.8F, 0F);

		barrelModel[24].addShapeBox(8F, -2.5F, -3.5F, 12, 5, 6, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		barrelModel[24].setRotationPoint(6.95F, -35.8F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 523
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 524
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 525
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 85
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 86
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 87
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 88
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 89
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 90
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 91
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 92
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 93
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 94
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 95
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 96
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 97
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 98
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 99
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 848
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Box 849
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 850
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 142
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Box 143
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Box 144
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 97, 329, textureX, textureY); // Box 154
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Box 155
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 156
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 79
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 80
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 81
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 217
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 218
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 97, 305, textureX, textureY); // Box 219
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 220
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 221
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 222
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 223
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Box 224
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 241, 345, textureX, textureY); // Box 225
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 393, 393, textureX, textureY); // Box 226
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 193, 417, textureX, textureY); // Box 227
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 233, 417, textureX, textureY); // Box 228

		leftTrackWheelModels[0].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		leftTrackWheelModels[0].setRotationPoint(-6F, 4.2F, 33F);

		leftTrackWheelModels[1].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 524
		leftTrackWheelModels[1].setRotationPoint(-6F, 4.2F, 33F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 525
		leftTrackWheelModels[2].setRotationPoint(-6F, 4.2F, 33F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 85
		leftTrackWheelModels[3].setRotationPoint(9F, 4.2F, 33F);

		leftTrackWheelModels[4].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		leftTrackWheelModels[4].setRotationPoint(9F, 4.2F, 33F);

		leftTrackWheelModels[5].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 87
		leftTrackWheelModels[5].setRotationPoint(9F, 4.2F, 33F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 88
		leftTrackWheelModels[6].setRotationPoint(25F, 4.2F, 33F);

		leftTrackWheelModels[7].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftTrackWheelModels[7].setRotationPoint(25F, 4.2F, 33F);

		leftTrackWheelModels[8].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 90
		leftTrackWheelModels[8].setRotationPoint(25F, 4.2F, 33F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftTrackWheelModels[9].setRotationPoint(-22F, 4.2F, 33F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 92
		leftTrackWheelModels[10].setRotationPoint(-22F, 4.2F, 33F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 93
		leftTrackWheelModels[11].setRotationPoint(-22F, 4.2F, 33F);

		leftTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackWheelModels[12].setRotationPoint(-56F, 4.2F, 33F);

		leftTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 95
		leftTrackWheelModels[13].setRotationPoint(-56F, 4.2F, 33F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 96
		leftTrackWheelModels[14].setRotationPoint(-56F, 4.2F, 33F);

		leftTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackWheelModels[15].setRotationPoint(-38F, 4.2F, 33F);

		leftTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 98
		leftTrackWheelModels[16].setRotationPoint(-38F, 4.2F, 33F);

		leftTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 99
		leftTrackWheelModels[17].setRotationPoint(-38F, 4.2F, 33F);

		leftTrackWheelModels[18].addShapeBox(-6F, -2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 848
		leftTrackWheelModels[18].setRotationPoint(-71.65F, -7.25F, 32F);

		leftTrackWheelModels[19].addShapeBox(-6F, -6F, -8.8F, 12, 4, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 849
		leftTrackWheelModels[19].setRotationPoint(-71.65F, -7.25F, 32F);

		leftTrackWheelModels[20].addShapeBox(-6F, 2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 850
		leftTrackWheelModels[20].setRotationPoint(-71.65F, -7.25F, 32F);

		leftTrackWheelModels[21].addShapeBox(-6F, -2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 142
		leftTrackWheelModels[21].setRotationPoint(42.35F, -5.75F, 32F);

		leftTrackWheelModels[22].addShapeBox(-6F, -6F, -8.8F, 12, 4, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 143
		leftTrackWheelModels[22].setRotationPoint(42.35F, -5.75F, 32F);

		leftTrackWheelModels[23].addShapeBox(-6F, 2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 144
		leftTrackWheelModels[23].setRotationPoint(42.35F, -5.75F, 32F);

		leftTrackWheelModels[24].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 154
		leftTrackWheelModels[24].setRotationPoint(-6F, 4.2F, -26F);

		leftTrackWheelModels[25].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 155
		leftTrackWheelModels[25].setRotationPoint(-6F, 4.2F, -26F);

		leftTrackWheelModels[26].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftTrackWheelModels[26].setRotationPoint(-6F, 4.2F, -26F);

		leftTrackWheelModels[27].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 79
		leftTrackWheelModels[27].setRotationPoint(-1F, -10F, 32.25F);

		leftTrackWheelModels[28].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 80
		leftTrackWheelModels[28].setRotationPoint(-1F, -10F, 32.25F);

		leftTrackWheelModels[29].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 81
		leftTrackWheelModels[29].setRotationPoint(-1F, -10F, 32.25F);

		leftTrackWheelModels[30].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 217
		leftTrackWheelModels[30].setRotationPoint(15F, -10F, 32.25F);

		leftTrackWheelModels[31].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 218
		leftTrackWheelModels[31].setRotationPoint(15F, -10F, 32.25F);

		leftTrackWheelModels[32].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 219
		leftTrackWheelModels[32].setRotationPoint(15F, -10F, 32.25F);

		leftTrackWheelModels[33].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 220
		leftTrackWheelModels[33].setRotationPoint(-16F, -10F, 32.25F);

		leftTrackWheelModels[34].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 221
		leftTrackWheelModels[34].setRotationPoint(-16F, -10F, 32.25F);

		leftTrackWheelModels[35].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 222
		leftTrackWheelModels[35].setRotationPoint(-16F, -10F, 32.25F);

		leftTrackWheelModels[36].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 223
		leftTrackWheelModels[36].setRotationPoint(-32F, -10F, 32.25F);

		leftTrackWheelModels[37].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 224
		leftTrackWheelModels[37].setRotationPoint(-32F, -10F, 32.25F);

		leftTrackWheelModels[38].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 225
		leftTrackWheelModels[38].setRotationPoint(-32F, -10F, 32.25F);

		leftTrackWheelModels[39].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 226
		leftTrackWheelModels[39].setRotationPoint(-49F, -10F, 32.25F);

		leftTrackWheelModels[40].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 227
		leftTrackWheelModels[40].setRotationPoint(-49F, -10F, 32.25F);

		leftTrackWheelModels[41].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 228
		leftTrackWheelModels[41].setRotationPoint(-49F, -10F, 32.25F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Box 145
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Box 146
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Box 147
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 148
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 329, 321, textureX, textureY); // Box 149
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 150
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Box 151
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 152
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 49, 329, textureX, textureY); // Box 153
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 157
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Box 158
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Box 159
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Box 160
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); // Box 161
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 162
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 163
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 49, 345, textureX, textureY); // Box 164
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 97, 345, textureX, textureY); // Box 165
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 166
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 201, 345, textureX, textureY); // Box 167
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 257, 345, textureX, textureY); // Box 168
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 321, 441, textureX, textureY); // Box 229
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 353, 441, textureX, textureY); // Box 230
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 385, 441, textureX, textureY); // Box 231
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 417, 441, textureX, textureY); // Box 232
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 449, 441, textureX, textureY); // Box 233
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 481, 441, textureX, textureY); // Box 234
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 235
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 33, 457, textureX, textureY); // Box 236
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 65, 457, textureX, textureY); // Box 237
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 97, 457, textureX, textureY); // Box 238
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 129, 457, textureX, textureY); // Box 239
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 161, 457, textureX, textureY); // Box 240
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 193, 457, textureX, textureY); // Box 241
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 225, 457, textureX, textureY); // Box 242
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 257, 457, textureX, textureY); // Box 243

		rightTrackWheelModels[0].addShapeBox(-6F, -2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 145
		rightTrackWheelModels[0].setRotationPoint(42.35F, -5.75F, -27F);

		rightTrackWheelModels[1].addShapeBox(-6F, -6F, -8.8F, 12, 4, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 146
		rightTrackWheelModels[1].setRotationPoint(42.35F, -5.75F, -27F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 147
		rightTrackWheelModels[2].setRotationPoint(42.35F, -5.75F, -27F);

		rightTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		rightTrackWheelModels[3].setRotationPoint(25F, 4.2F, -26F);

		rightTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 149
		rightTrackWheelModels[4].setRotationPoint(25F, 4.2F, -26F);

		rightTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 150
		rightTrackWheelModels[5].setRotationPoint(25F, 4.2F, -26F);

		rightTrackWheelModels[6].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 151
		rightTrackWheelModels[6].setRotationPoint(9F, 4.2F, -26F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 152
		rightTrackWheelModels[7].setRotationPoint(9F, 4.2F, -26F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackWheelModels[8].setRotationPoint(9F, 4.2F, -26F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 157
		rightTrackWheelModels[9].setRotationPoint(-22F, 4.2F, -26F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 158
		rightTrackWheelModels[10].setRotationPoint(-22F, 4.2F, -26F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightTrackWheelModels[11].setRotationPoint(-22F, 4.2F, -26F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		rightTrackWheelModels[12].setRotationPoint(-38F, 4.2F, -26F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 161
		rightTrackWheelModels[13].setRotationPoint(-38F, 4.2F, -26F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 162
		rightTrackWheelModels[14].setRotationPoint(-38F, 4.2F, -26F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 163
		rightTrackWheelModels[15].setRotationPoint(-56F, 4.2F, -26F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 164
		rightTrackWheelModels[16].setRotationPoint(-56F, 4.2F, -26F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		rightTrackWheelModels[17].setRotationPoint(-56F, 4.2F, -26F);

		rightTrackWheelModels[18].addShapeBox(-6F, 2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 166
		rightTrackWheelModels[18].setRotationPoint(-71.65F, -7.25F, -27F);

		rightTrackWheelModels[19].addShapeBox(-6F, -2F, -8.8F, 12, 4, 12, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 167
		rightTrackWheelModels[19].setRotationPoint(-71.65F, -7.25F, -27F);

		rightTrackWheelModels[20].addShapeBox(-6F, -6F, -8.8F, 12, 4, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 168
		rightTrackWheelModels[20].setRotationPoint(-71.65F, -7.25F, -27F);

		rightTrackWheelModels[21].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 229
		rightTrackWheelModels[21].setRotationPoint(-49F, -10F, -27.75F);

		rightTrackWheelModels[22].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 230
		rightTrackWheelModels[22].setRotationPoint(-49F, -10F, -27.75F);

		rightTrackWheelModels[23].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 231
		rightTrackWheelModels[23].setRotationPoint(-49F, -10F, -27.75F);

		rightTrackWheelModels[24].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 232
		rightTrackWheelModels[24].setRotationPoint(-32F, -10F, -27.75F);

		rightTrackWheelModels[25].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 233
		rightTrackWheelModels[25].setRotationPoint(-32F, -10F, -27.75F);

		rightTrackWheelModels[26].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 234
		rightTrackWheelModels[26].setRotationPoint(-32F, -10F, -27.75F);

		rightTrackWheelModels[27].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 235
		rightTrackWheelModels[27].setRotationPoint(-16F, -10F, -27.75F);

		rightTrackWheelModels[28].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 236
		rightTrackWheelModels[28].setRotationPoint(-16F, -10F, -27.75F);

		rightTrackWheelModels[29].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 237
		rightTrackWheelModels[29].setRotationPoint(-16F, -10F, -27.75F);

		rightTrackWheelModels[30].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 238
		rightTrackWheelModels[30].setRotationPoint(-1F, -10F, -27.75F);

		rightTrackWheelModels[31].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 239
		rightTrackWheelModels[31].setRotationPoint(-1F, -10F, -27.75F);

		rightTrackWheelModels[32].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 240
		rightTrackWheelModels[32].setRotationPoint(-1F, -10F, -27.75F);

		rightTrackWheelModels[33].addShapeBox(-3F, -3.5F, -5F, 6, 3, 6, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 241
		rightTrackWheelModels[33].setRotationPoint(15F, -10F, -27.75F);

		rightTrackWheelModels[34].addShapeBox(-3F, -1.5F, -5F, 6, 3, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 242
		rightTrackWheelModels[34].setRotationPoint(15F, -10F, -27.75F);

		rightTrackWheelModels[35].addShapeBox(-3F, 0.5F, -5F, 6, 3, 6, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 243
		rightTrackWheelModels[35].setRotationPoint(15F, -10F, -27.75F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Box 184
		leftTrackModel[1] = new ModelRendererTurbo(this, 409, 369, textureX, textureY); // Box 185
		leftTrackModel[2] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 186
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 187
		leftTrackModel[4] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 188
		leftTrackModel[5] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 189
		leftTrackModel[6] = new ModelRendererTurbo(this, 145, 385, textureX, textureY); // Box 190
		leftTrackModel[7] = new ModelRendererTurbo(this, 177, 393, textureX, textureY); // Box 191
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 192
		leftTrackModel[9] = new ModelRendererTurbo(this, 369, 393, textureX, textureY); // Box 193
		leftTrackModel[10] = new ModelRendererTurbo(this, 409, 393, textureX, textureY); // Box 194
		leftTrackModel[11] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Box 195
		leftTrackModel[12] = new ModelRendererTurbo(this, 209, 417, textureX, textureY); // Box 196
		leftTrackModel[13] = new ModelRendererTurbo(this, 249, 417, textureX, textureY); // Box 197
		leftTrackModel[14] = new ModelRendererTurbo(this, 289, 417, textureX, textureY); // Box 198
		leftTrackModel[15] = new ModelRendererTurbo(this, 329, 425, textureX, textureY); // Box 199
		leftTrackModel[16] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 200
		leftTrackModel[17] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 201
		leftTrackModel[18] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 202
		leftTrackModel[19] = new ModelRendererTurbo(this, 49, 441, textureX, textureY); // Box 203
		leftTrackModel[20] = new ModelRendererTurbo(this, 241, 441, textureX, textureY); // Box 204
		leftTrackModel[21] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 205
		leftTrackModel[22] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 206
		leftTrackModel[23] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 207
		leftTrackModel[24] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 208
		leftTrackModel[25] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 209
		leftTrackModel[26] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 210
		leftTrackModel[27] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 211
		leftTrackModel[28] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 212
		leftTrackModel[29] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 213

		leftTrackModel[0].addShapeBox(-1F, -2F, -7F, 5, 2, 14, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 184
		leftTrackModel[0].setRotationPoint(49.65F, -2.2F, 29.5F);
		leftTrackModel[0].rotateAngleZ = 1.30899694F;

		leftTrackModel[1].addBox(-0.4F, -2F, -7F, 5, 2, 14, 0F); // Box 185
		leftTrackModel[1].setRotationPoint(47.5F, -10F, 29.5F);
		leftTrackModel[1].rotateAngleZ = -1.27409035F;

		leftTrackModel[2].addShapeBox(1F, -2.5F, -7F, 4, 2, 14, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		leftTrackModel[2].setRotationPoint(43.75F, -10.9F, 29.5F);
		leftTrackModel[2].rotateAngleZ = -0.45378561F;

		leftTrackModel[3].addShapeBox(0.25F, -2.55F, -7F, 30, 2, 14, 0F,0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[3].setRotationPoint(15F, -11.8F, 29.5F);
		leftTrackModel[3].rotateAngleZ = -0.05235988F;

		leftTrackModel[4].addBox(0F, -2F, -7F, 5, 2, 14, 0F); // Box 188
		leftTrackModel[4].setRotationPoint(46F, 2.5F, 29.5F);
		leftTrackModel[4].rotateAngleZ = 0.82030475F;

		leftTrackModel[5].addBox(0.25F, -2F, -7F, 17, 2, 14, 0F); // Box 189
		leftTrackModel[5].setRotationPoint(30.8F, 10.6F, 29.5F);
		leftTrackModel[5].rotateAngleZ = 0.48869219F;

		leftTrackModel[6].addBox(0.25F, -2F, -7F, 6, 2, 14, 0F); // Box 190
		leftTrackModel[6].setRotationPoint(25F, 12.2F, 29.5F);
		leftTrackModel[6].rotateAngleZ = 0.27925268F;

		leftTrackModel[7].addBox(-5.75F, -2F, -7F, 81, 2, 14, 0F); // Box 191
		leftTrackModel[7].setRotationPoint(-50F, 12.2F, 29.5F);

		leftTrackModel[8].addBox(-5.75F, -2F, -7F, 88, 2, 14, 0F); // Box 192
		leftTrackModel[8].setRotationPoint(-67F, -12.3F, 29.5F);

		leftTrackModel[9].addShapeBox(2.5F, -2F, -7F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F); // Box 193
		leftTrackModel[9].setRotationPoint(-62.2F, 11.2F, 29.5F);
		leftTrackModel[9].rotateAngleZ = -0.15707963F;

		leftTrackModel[10].addBox(-0.35F, -2.15F, -7F, 22, 2, 14, 0F); // Box 194
		leftTrackModel[10].setRotationPoint(-76.9F, -1F, 29.5F);
		leftTrackModel[10].rotateAngleZ = -0.62831853F;

		leftTrackModel[11].addBox(-5.4F, -2F, -7F, 5, 2, 14, 0F); // Box 195
		leftTrackModel[11].setRotationPoint(-76.9F, -1F, 29.5F);
		leftTrackModel[11].rotateAngleZ = -1.04719755F;

		leftTrackModel[12].addBox(-5.4F, -2F, -7F, 2, 3, 14, 0F); // Box 196
		leftTrackModel[12].setRotationPoint(-74.35F, -7.1F, 29.5F);
		leftTrackModel[12].rotateAngleZ = 0.08726646F;

		leftTrackModel[13].addBox(-5.4F, -2F, -7F, 5, 2, 14, 0F); // Box 197
		leftTrackModel[13].setRotationPoint(-75.5F, -12.3F, 29.5F);
		leftTrackModel[13].rotateAngleZ = 1.04719755F;

		leftTrackModel[14].addBox(-5F, -2F, -7F, 5, 2, 14, 0F); // Box 198
		leftTrackModel[14].setRotationPoint(-72.1F, -12.4F, 29.5F);
		leftTrackModel[14].rotateAngleZ = 0.27925268F;

		leftTrackModel[15].addBox(-5.75F, -3F, -2.5F, 81, 2, 6, 0F); // Box 199
		leftTrackModel[15].setRotationPoint(-50F, 12.2F, 29.5F);

		leftTrackModel[16].addBox(-0.35F, -3.15F, -2.5F, 22, 2, 7, 0F); // Box 200
		leftTrackModel[16].setRotationPoint(-76.9F, -1F, 29.5F);
		leftTrackModel[16].rotateAngleZ = -0.62831853F;

		leftTrackModel[17].addBox(0.25F, -3F, -2.5F, 6, 2, 6, 0F); // Box 201
		leftTrackModel[17].setRotationPoint(25F, 12.2F, 29.5F);
		leftTrackModel[17].rotateAngleZ = 0.27925268F;

		leftTrackModel[18].addBox(0.25F, -3F, -2.5F, 17, 2, 6, 0F); // Box 202
		leftTrackModel[18].setRotationPoint(30.8F, 10.6F, 29.5F);
		leftTrackModel[18].rotateAngleZ = 0.48869219F;

		leftTrackModel[19].addBox(-5.75F, -1F, -2.5F, 88, 2, 6, 0F); // Box 203
		leftTrackModel[19].setRotationPoint(-67F, -12.3F, 29.5F);

		leftTrackModel[20].addShapeBox(0.25F, -1.55F, -2.5F, 30, 2, 6, 0F,0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackModel[20].setRotationPoint(15F, -11.8F, 29.5F);
		leftTrackModel[20].rotateAngleZ = -0.05235988F;

		leftTrackModel[21].addBox(0F, -3F, -2.5F, 5, 2, 6, 0F); // Box 205
		leftTrackModel[21].setRotationPoint(46F, 2.5F, 29.5F);
		leftTrackModel[21].rotateAngleZ = 0.82030475F;

		leftTrackModel[22].addShapeBox(-1F, -3F, -2.5F, 5, 2, 6, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 206
		leftTrackModel[22].setRotationPoint(49.65F, -2.2F, 29.5F);
		leftTrackModel[22].rotateAngleZ = 1.30899694F;

		leftTrackModel[23].addBox(-0.4F, -1F, -2.5F, 5, 2, 6, 0F); // Box 207
		leftTrackModel[23].setRotationPoint(47.5F, -10F, 29.5F);
		leftTrackModel[23].rotateAngleZ = -1.27409035F;

		leftTrackModel[24].addShapeBox(1F, -1.5F, -2.5F, 4, 2, 6, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftTrackModel[24].setRotationPoint(43.75F, -10.9F, 29.5F);
		leftTrackModel[24].rotateAngleZ = -0.45378561F;

		leftTrackModel[25].addShapeBox(2.5F, -3F, -2.5F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F); // Box 209
		leftTrackModel[25].setRotationPoint(-62.2F, 11.2F, 29.5F);
		leftTrackModel[25].rotateAngleZ = -0.15707963F;

		leftTrackModel[26].addBox(-5.4F, -3F, -2.5F, 5, 2, 6, 0F); // Box 210
		leftTrackModel[26].setRotationPoint(-76.9F, -1F, 29.5F);
		leftTrackModel[26].rotateAngleZ = -1.04719755F;

		leftTrackModel[27].addBox(-5.4F, -1F, -2.5F, 5, 2, 6, 0F); // Box 211
		leftTrackModel[27].setRotationPoint(-75.5F, -12.3F, 29.5F);
		leftTrackModel[27].rotateAngleZ = 1.04719755F;

		leftTrackModel[28].addBox(-4.4F, -2F, -2.5F, 2, 3, 6, 0F); // Box 212
		leftTrackModel[28].setRotationPoint(-74.35F, -7.1F, 29.5F);
		leftTrackModel[28].rotateAngleZ = 0.08726646F;

		leftTrackModel[29].addBox(-5F, -1F, -2.5F, 5, 2, 6, 0F); // Box 213
		leftTrackModel[29].setRotationPoint(-72.1F, -12.4F, 29.5F);
		leftTrackModel[29].rotateAngleZ = 0.27925268F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 115
		rightTrackModel[1] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 116
		rightTrackModel[2] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 117
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 118
		rightTrackModel[4] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 119
		rightTrackModel[5] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 120
		rightTrackModel[6] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 121
		rightTrackModel[7] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Box 122
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 123
		rightTrackModel[9] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 124
		rightTrackModel[10] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Box 125
		rightTrackModel[11] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 126
		rightTrackModel[12] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 127
		rightTrackModel[13] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 128
		rightTrackModel[14] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 129
		rightTrackModel[15] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 169
		rightTrackModel[16] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 170
		rightTrackModel[17] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 171
		rightTrackModel[18] = new ModelRendererTurbo(this, 65, 361, textureX, textureY); // Box 172
		rightTrackModel[19] = new ModelRendererTurbo(this, 113, 369, textureX, textureY); // Box 173
		rightTrackModel[20] = new ModelRendererTurbo(this, 305, 369, textureX, textureY); // Box 174
		rightTrackModel[21] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 175
		rightTrackModel[22] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 176
		rightTrackModel[23] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 177
		rightTrackModel[24] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 178
		rightTrackModel[25] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 179
		rightTrackModel[26] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 180
		rightTrackModel[27] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 181
		rightTrackModel[28] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 182
		rightTrackModel[29] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 183

		rightTrackModel[0].addShapeBox(-1F, -2F, -7F, 5, 2, 14, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 115
		rightTrackModel[0].setRotationPoint(49.65F, -2.2F, -29.5F);
		rightTrackModel[0].rotateAngleZ = 1.30899694F;

		rightTrackModel[1].addBox(-0.4F, -2F, -7F, 5, 2, 14, 0F); // Box 116
		rightTrackModel[1].setRotationPoint(47.5F, -10F, -29.5F);
		rightTrackModel[1].rotateAngleZ = -1.27409035F;

		rightTrackModel[2].addShapeBox(1F, -2.5F, -7F, 4, 2, 14, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightTrackModel[2].setRotationPoint(43.75F, -10.9F, -29.5F);
		rightTrackModel[2].rotateAngleZ = -0.45378561F;

		rightTrackModel[3].addShapeBox(0.25F, -2.55F, -7F, 30, 2, 14, 0F,0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		rightTrackModel[3].setRotationPoint(15F, -11.8F, -29.5F);
		rightTrackModel[3].rotateAngleZ = -0.05235988F;

		rightTrackModel[4].addBox(0F, -2F, -7F, 5, 2, 14, 0F); // Box 119
		rightTrackModel[4].setRotationPoint(46F, 2.5F, -29.5F);
		rightTrackModel[4].rotateAngleZ = 0.82030475F;

		rightTrackModel[5].addBox(0.25F, -2F, -7F, 17, 2, 14, 0F); // Box 120
		rightTrackModel[5].setRotationPoint(30.8F, 10.6F, -29.5F);
		rightTrackModel[5].rotateAngleZ = 0.48869219F;

		rightTrackModel[6].addBox(0.25F, -2F, -7F, 6, 2, 14, 0F); // Box 121
		rightTrackModel[6].setRotationPoint(25F, 12.2F, -29.5F);
		rightTrackModel[6].rotateAngleZ = 0.27925268F;

		rightTrackModel[7].addBox(-5.75F, -2F, -7F, 81, 2, 14, 0F); // Box 122
		rightTrackModel[7].setRotationPoint(-50F, 12.2F, -29.5F);

		rightTrackModel[8].addBox(-5.75F, -2F, -7F, 88, 2, 14, 0F); // Box 123
		rightTrackModel[8].setRotationPoint(-67F, -12.3F, -29.5F);

		rightTrackModel[9].addShapeBox(2.5F, -2F, -7F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F); // Box 124
		rightTrackModel[9].setRotationPoint(-62.2F, 11.2F, -29.5F);
		rightTrackModel[9].rotateAngleZ = -0.15707963F;

		rightTrackModel[10].addBox(-0.35F, -2.15F, -7F, 22, 2, 14, 0F); // Box 125
		rightTrackModel[10].setRotationPoint(-76.9F, -1F, -29.5F);
		rightTrackModel[10].rotateAngleZ = -0.62831853F;

		rightTrackModel[11].addBox(-5.4F, -2F, -7F, 5, 2, 14, 0F); // Box 126
		rightTrackModel[11].setRotationPoint(-76.9F, -1F, -29.5F);
		rightTrackModel[11].rotateAngleZ = -1.04719755F;

		rightTrackModel[12].addBox(-5.4F, -2F, -7F, 2, 3, 14, 0F); // Box 127
		rightTrackModel[12].setRotationPoint(-74.35F, -7.1F, -29.5F);
		rightTrackModel[12].rotateAngleZ = 0.08726646F;

		rightTrackModel[13].addBox(-5.4F, -2F, -7F, 5, 2, 14, 0F); // Box 128
		rightTrackModel[13].setRotationPoint(-75.5F, -12.3F, -29.5F);
		rightTrackModel[13].rotateAngleZ = 1.04719755F;

		rightTrackModel[14].addBox(-5F, -2F, -7F, 5, 2, 14, 0F); // Box 129
		rightTrackModel[14].setRotationPoint(-72.1F, -12.4F, -29.5F);
		rightTrackModel[14].rotateAngleZ = 0.27925268F;

		rightTrackModel[15].addBox(-5.75F, -3F, -2.5F, 81, 2, 6, 0F); // Box 169
		rightTrackModel[15].setRotationPoint(-50F, 12.2F, -29.5F);

		rightTrackModel[16].addBox(-0.35F, -3.15F, -2.5F, 22, 2, 7, 0F); // Box 170
		rightTrackModel[16].setRotationPoint(-76.9F, -1F, -29.5F);
		rightTrackModel[16].rotateAngleZ = -0.62831853F;

		rightTrackModel[17].addBox(0.25F, -3F, -2.5F, 6, 2, 6, 0F); // Box 171
		rightTrackModel[17].setRotationPoint(25F, 12.2F, -29.5F);
		rightTrackModel[17].rotateAngleZ = 0.27925268F;

		rightTrackModel[18].addBox(0.25F, -3F, -2.5F, 17, 2, 6, 0F); // Box 172
		rightTrackModel[18].setRotationPoint(30.8F, 10.6F, -29.5F);
		rightTrackModel[18].rotateAngleZ = 0.48869219F;

		rightTrackModel[19].addBox(-5.75F, -1F, -2.5F, 88, 2, 6, 0F); // Box 173
		rightTrackModel[19].setRotationPoint(-67F, -12.3F, -29.5F);

		rightTrackModel[20].addShapeBox(0.25F, -1.55F, -2.5F, 30, 2, 6, 0F,0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		rightTrackModel[20].setRotationPoint(15F, -11.8F, -29.5F);
		rightTrackModel[20].rotateAngleZ = -0.05235988F;

		rightTrackModel[21].addBox(0F, -3F, -2.5F, 5, 2, 6, 0F); // Box 175
		rightTrackModel[21].setRotationPoint(46F, 2.5F, -29.5F);
		rightTrackModel[21].rotateAngleZ = 0.82030475F;

		rightTrackModel[22].addShapeBox(-1F, -3F, -2.5F, 5, 2, 6, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 176
		rightTrackModel[22].setRotationPoint(49.65F, -2.2F, -29.5F);
		rightTrackModel[22].rotateAngleZ = 1.30899694F;

		rightTrackModel[23].addBox(-0.4F, -1F, -2.5F, 5, 2, 6, 0F); // Box 177
		rightTrackModel[23].setRotationPoint(47.5F, -10F, -29.5F);
		rightTrackModel[23].rotateAngleZ = -1.27409035F;

		rightTrackModel[24].addShapeBox(1F, -1.5F, -2.5F, 4, 2, 6, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightTrackModel[24].setRotationPoint(43.75F, -10.9F, -29.5F);
		rightTrackModel[24].rotateAngleZ = -0.45378561F;

		rightTrackModel[25].addShapeBox(2.5F, -3F, -2.5F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.05F, 0F); // Box 179
		rightTrackModel[25].setRotationPoint(-62.2F, 11.2F, -29.5F);
		rightTrackModel[25].rotateAngleZ = -0.15707963F;

		rightTrackModel[26].addBox(-5.4F, -3F, -2.5F, 5, 2, 6, 0F); // Box 180
		rightTrackModel[26].setRotationPoint(-76.9F, -1F, -29.5F);
		rightTrackModel[26].rotateAngleZ = -1.04719755F;

		rightTrackModel[27].addBox(-5.4F, -1F, -2.5F, 5, 2, 6, 0F); // Box 181
		rightTrackModel[27].setRotationPoint(-75.5F, -12.3F, -29.5F);
		rightTrackModel[27].rotateAngleZ = 1.04719755F;

		rightTrackModel[28].addBox(-4.4F, -2F, -2.5F, 2, 3, 6, 0F); // Box 182
		rightTrackModel[28].setRotationPoint(-74.35F, -7.1F, -29.5F);
		rightTrackModel[28].rotateAngleZ = 0.08726646F;

		rightTrackModel[29].addBox(-5F, -1F, -2.5F, 5, 2, 6, 0F); // Box 183
		rightTrackModel[29].setRotationPoint(-72.1F, -12.4F, -29.5F);
		rightTrackModel[29].rotateAngleZ = 0.27925268F;
	}
}