//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.04.2016 - 22:17:39
// Last changed on: 03.04.2016 - 22:17:39

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHowitzer extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHowitzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 62
		bodyModel[20] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 150
		bodyModel[22] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 151
		bodyModel[23] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 152
		bodyModel[24] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 153
		bodyModel[25] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 154
		bodyModel[26] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 155
		bodyModel[27] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 156
		bodyModel[28] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 157
		bodyModel[29] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 158
		bodyModel[30] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 159
		bodyModel[31] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 160
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 161
		bodyModel[33] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 162
		bodyModel[34] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 163
		bodyModel[35] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 164
		bodyModel[36] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 165
		bodyModel[37] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 166
		bodyModel[38] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 167
		bodyModel[39] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 168
		bodyModel[40] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 169
		bodyModel[41] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 170
		bodyModel[42] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 171
		bodyModel[43] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 172
		bodyModel[44] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 173
		bodyModel[45] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 174
		bodyModel[46] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 175
		bodyModel[47] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 176
		bodyModel[48] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 177
		bodyModel[49] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 178

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 6, 27, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[0].setRotationPoint(22F, 2F, -13F);

		bodyModel[1].addBox(0F, 0F, 0F, 12, 10, 4, 0F); // Box 8
		bodyModel[1].setRotationPoint(4F, -3F, 22F);
		bodyModel[1].rotateAngleY = -0.41887902F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 133, 17, 4, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[2].setRotationPoint(-112F, -10F, 81F);
		bodyModel[2].rotateAngleY = -0.4712389F;

		bodyModel[3].addBox(0F, 0F, 0F, 10, 1, 22, 0F); // Box 10
		bodyModel[3].setRotationPoint(-110F, 7F, 70F);
		bodyModel[3].rotateAngleY = -0.4712389F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 134, 11, 7, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-113F, -11F, 80F);
		bodyModel[4].rotateAngleY = -0.4712389F;

		bodyModel[5].addBox(0F, 0F, 0F, 141, 1, 7, 0F); // Box 12
		bodyModel[5].setRotationPoint(-113F, 6F, 80F);
		bodyModel[5].rotateAngleY = -0.4712389F;

		bodyModel[6].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 13
		bodyModel[6].setRotationPoint(4F, -3.1F, 21F);
		bodyModel[6].rotateAngleY = -0.41887902F;

		bodyModel[7].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 14
		bodyModel[7].setRotationPoint(4F, 6F, 21F);
		bodyModel[7].rotateAngleY = -0.41887902F;

		bodyModel[8].addBox(0F, 0F, 0F, 2, 10, 65, 0F); // Box 12
		bodyModel[8].setRotationPoint(-15F, -3F, -32F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 17, 23, 0F); // Box 13
		bodyModel[9].setRotationPoint(22F, -10F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 17, 12, 0F); // Box 14
		bodyModel[10].setRotationPoint(22.15F, -10F, 11.4F);
		bodyModel[10].rotateAngleY = 0.59341195F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 17, 12, 0F); // Box 15
		bodyModel[11].setRotationPoint(15.45F, -10F, -20.4F);
		bodyModel[11].rotateAngleY = -0.59341195F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 133, 17, 4, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-110F, -10F, -84F);
		bodyModel[12].rotateAngleY = 0.4712389F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 134, 11, 7, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-110F, -11F, -86F);
		bodyModel[13].rotateAngleY = 0.4712389F;

		bodyModel[14].addBox(0F, 0F, 0F, 141, 1, 7, 0F); // Box 18
		bodyModel[14].setRotationPoint(-110F, 6F, -86F);
		bodyModel[14].rotateAngleY = 0.4712389F;

		bodyModel[15].addBox(0F, 0F, 0F, 10, 1, 22, 0F); // Box 19
		bodyModel[15].setRotationPoint(-100F, 7F, -89F);
		bodyModel[15].rotateAngleY = 0.4712389F;

		bodyModel[16].addBox(0F, 0F, 0F, 12, 10, 4, 0F); // Box 20
		bodyModel[16].setRotationPoint(6F, -3F, -25F);
		bodyModel[16].rotateAngleY = 0.41887902F;

		bodyModel[17].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 21
		bodyModel[17].setRotationPoint(6F, -3.1F, -26F);
		bodyModel[17].rotateAngleY = 0.41887902F;

		bodyModel[18].addBox(0F, 0F, 0F, 12, 1, 6, 0F); // Box 22
		bodyModel[18].setRotationPoint(6F, 6F, -26F);
		bodyModel[18].rotateAngleY = 0.41887902F;

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 121, 0F); // Box 62
		bodyModel[19].setRotationPoint(-70F, 0F, -60F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 4, 7, 0F); // Box 63
		bodyModel[20].setRotationPoint(-71F, -1F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[21].setRotationPoint(21F, -12F, 3F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 151
		bodyModel[22].setRotationPoint(21F, -9F, 3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 152
		bodyModel[23].setRotationPoint(21F, -9F, -3F);

		bodyModel[24].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 153
		bodyModel[24].setRotationPoint(28F, -12F, -2F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 8, 5, 0F); // Box 154
		bodyModel[25].setRotationPoint(27F, -11F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 8, 5, 0F); // Box 155
		bodyModel[26].setRotationPoint(33F, -11F, -2F);

		bodyModel[27].addBox(0F, 0F, 0F, 5, 8, 1, 0F); // Box 156
		bodyModel[27].setRotationPoint(28F, -11F, -3F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 8, 1, 0F); // Box 157
		bodyModel[28].setRotationPoint(28F, -11F, 3F);

		bodyModel[29].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 158
		bodyModel[29].setRotationPoint(28F, -3F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[30].setRotationPoint(27F, -3F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[31].setRotationPoint(33F, -3F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[32].setRotationPoint(28F, -3F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 162
		bodyModel[33].setRotationPoint(28F, -3F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[34].setRotationPoint(28F, -12F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[35].setRotationPoint(28F, -12F, 3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[36].setRotationPoint(27F, -12F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[37].setRotationPoint(33F, -12F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 167
		bodyModel[38].setRotationPoint(33F, -11F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[39].setRotationPoint(33F, -11F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[40].setRotationPoint(27F, -11F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 170
		bodyModel[41].setRotationPoint(27F, -11F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 171
		bodyModel[42].setRotationPoint(33F, -12F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 172
		bodyModel[43].setRotationPoint(33F, -3F, 3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[44].setRotationPoint(33F, -3F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[45].setRotationPoint(27F, -3F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[46].setRotationPoint(21F, -12F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 176
		bodyModel[47].setRotationPoint(27F, -3F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[48].setRotationPoint(33F, -12F, -3F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 178
		bodyModel[49].setRotationPoint(29.5F, -12.5F, -0.5F);


		turretModel = new ModelRendererTurbo[44];
		turretModel[0] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 23
		turretModel[1] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 24
		turretModel[2] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 25
		turretModel[3] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 26
		turretModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		turretModel[5] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 28
		turretModel[6] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 29
		turretModel[7] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 30
		turretModel[8] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 32
		turretModel[9] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 33
		turretModel[10] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 36
		turretModel[11] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 38
		turretModel[12] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 41
		turretModel[13] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 43
		turretModel[14] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 44
		turretModel[15] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 45
		turretModel[16] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 87
		turretModel[17] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 88
		turretModel[18] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 114
		turretModel[19] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 115
		turretModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 120
		turretModel[21] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 122
		turretModel[22] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 123
		turretModel[23] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 124
		turretModel[24] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 125
		turretModel[25] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Box 126
		turretModel[26] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 127
		turretModel[27] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 128
		turretModel[28] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 129
		turretModel[29] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 130
		turretModel[30] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 131
		turretModel[31] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 132
		turretModel[32] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 133
		turretModel[33] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Box 134
		turretModel[34] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 135
		turretModel[35] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 136
		turretModel[36] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 137
		turretModel[37] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 138
		turretModel[38] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 139
		turretModel[39] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 140
		turretModel[40] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 141
		turretModel[41] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 146
		turretModel[42] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 147
		turretModel[43] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 148

		turretModel[0].addBox(0F, 0F, 0F, 1, 14, 25, 0F); // Box 23
		turretModel[0].setRotationPoint(-13F, -7F, -12F);

		turretModel[1].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 24
		turretModel[1].setRotationPoint(-5F, -7F, -16F);

		turretModel[2].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 25
		turretModel[2].setRotationPoint(-5F, -7F, 16F);

		turretModel[3].addBox(0F, 0F, 0F, 1, 14, 25, 0F); // Box 26
		turretModel[3].setRotationPoint(20F, -7F, -12F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 8, 14, 4, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[4].setRotationPoint(13F, -7F, -16F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 8, 14, 4, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[5].setRotationPoint(-13F, -7F, -16F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 8, 14, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 29
		turretModel[6].setRotationPoint(-13F, -7F, 13F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 9, 14, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 30
		turretModel[7].setRotationPoint(13F, -7F, 13F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 33, 24, 1, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -19F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -19F, 0F); // Box 32
		turretModel[8].setRotationPoint(-20F, -21F, 10F);
		turretModel[8].rotateAngleY = 0.06981317F;

		turretModel[9].addBox(0F, 0F, 0F, 1, 15, 19, 0F); // Box 33
		turretModel[9].setRotationPoint(19F, -14F, -9F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 7, 18, 4, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 36
		turretModel[10].setRotationPoint(13F, -21F, -13F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 7, 18, 4, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 38
		turretModel[11].setRotationPoint(13F, -21F, 10F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 33, 24, 1, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -19F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -19F, 0F); // Box 41
		turretModel[12].setRotationPoint(-20F, -21F, -10F);
		turretModel[12].rotateAngleY = -0.06981317F;

		turretModel[13].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 43
		turretModel[13].setRotationPoint(-26F, -29F, 9.8F);
		turretModel[13].rotateAngleY = 0.03490659F;

		turretModel[14].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 44
		turretModel[14].setRotationPoint(-26F, -29F, -9.8F);
		turretModel[14].rotateAngleY = -0.03490659F;

		turretModel[15].addBox(0F, 0F, 0F, 48, 1, 11, 0F); // Box 45
		turretModel[15].setRotationPoint(-20F, -13F, -22F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		turretModel[16].setRotationPoint(19F, -21F, -9F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		turretModel[17].setRotationPoint(19F, -21F, 5F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 33, 11, 21, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -19F, 0F, 0F, -5F, 1F, 0F, -5F, 2F, 0F, -19F, 0F); // Box 114
		turretModel[18].setRotationPoint(-20F, -8F, -10F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 6, 5, 19, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 115
		turretModel[19].setRotationPoint(-26F, -21F, -9.2F);
		turretModel[19].rotateAngleY = 0.03490659F;

		turretModel[20].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 120
		turretModel[20].setRotationPoint(27F, -23F, -22F);

		turretModel[21].addBox(0F, 0F, 0F, 48, 1, 1, 0F); // Box 122
		turretModel[21].setRotationPoint(-20F, -23F, -22F);

		turretModel[22].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 123
		turretModel[22].setRotationPoint(-20F, -23F, -22F);

		turretModel[23].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 124
		turretModel[23].setRotationPoint(-9F, -23F, -22F);

		turretModel[24].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 125
		turretModel[24].setRotationPoint(14F, -23F, -22F);

		turretModel[25].addBox(0F, 0F, 0F, 18, 1, 10, 0F); // Box 126
		turretModel[25].setRotationPoint(-29F, -14F, -16F);

		turretModel[26].addBox(0F, 0F, 0F, 13, 1, 13, 0F); // Box 127
		turretModel[26].setRotationPoint(-40F, -13F, -18F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		turretModel[27].setRotationPoint(-40F, -15F, -19F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		turretModel[28].setRotationPoint(-40F, -15F, -5F);

		turretModel[29].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 130
		turretModel[29].setRotationPoint(-28F, -21F, -19F);

		turretModel[30].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 131
		turretModel[30].setRotationPoint(-40F, -21F, -19F);

		turretModel[31].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 132
		turretModel[31].setRotationPoint(-40F, -21F, -19F);

		turretModel[32].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 133
		turretModel[32].setRotationPoint(-40F, -15F, -18F);

		turretModel[33].addBox(0F, 0F, 0F, 13, 1, 9, 0F); // Box 134
		turretModel[33].setRotationPoint(-40F, -13F, 6F);

		turretModel[34].addBox(0F, 0F, 0F, 18, 1, 12, 0F); // Box 135
		turretModel[34].setRotationPoint(-29F, -14F, 2F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[35].setRotationPoint(-40F, -15F, 15F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		turretModel[36].setRotationPoint(-40F, -15F, 5F);

		turretModel[37].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 138
		turretModel[37].setRotationPoint(-40F, -15F, 6F);

		turretModel[38].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 139
		turretModel[38].setRotationPoint(-40F, -21F, 15F);

		turretModel[39].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 140
		turretModel[39].setRotationPoint(-28F, -21F, 15F);

		turretModel[40].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 141
		turretModel[40].setRotationPoint(-40F, -21F, 15F);

		turretModel[41].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 146
		turretModel[41].setRotationPoint(-29F, -16F, 14F);

		turretModel[42].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 147
		turretModel[42].setRotationPoint(-29F, -16F, -7F);

		turretModel[43].addBox(0F, 0F, 0F, 18, 3, 1, 0F); // Box 148
		turretModel[43].setRotationPoint(-29F, -16F, -17F);


		barrelModel = new ModelRendererTurbo[79];
		barrelModel[0] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 46
		barrelModel[1] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 47
		barrelModel[2] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 48
		barrelModel[3] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 49
		barrelModel[4] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 50
		barrelModel[5] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 51
		barrelModel[6] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 52
		barrelModel[7] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 53
		barrelModel[8] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 54
		barrelModel[9] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 55
		barrelModel[10] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 56
		barrelModel[11] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 57
		barrelModel[12] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 60
		barrelModel[13] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 64
		barrelModel[14] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 65
		barrelModel[15] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 66
		barrelModel[16] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 67
		barrelModel[17] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 68
		barrelModel[18] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 69
		barrelModel[19] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 70
		barrelModel[20] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 71
		barrelModel[21] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 72
		barrelModel[22] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 73
		barrelModel[23] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 74
		barrelModel[24] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 75
		barrelModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 76
		barrelModel[26] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 77
		barrelModel[27] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 78
		barrelModel[28] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 79
		barrelModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 80
		barrelModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 81
		barrelModel[31] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 82
		barrelModel[32] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 83
		barrelModel[33] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 84
		barrelModel[34] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 85
		barrelModel[35] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 86
		barrelModel[36] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 89
		barrelModel[37] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 90
		barrelModel[38] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 91
		barrelModel[39] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 92
		barrelModel[40] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 93
		barrelModel[41] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 94
		barrelModel[42] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 95
		barrelModel[43] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 96
		barrelModel[44] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 97
		barrelModel[45] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 98
		barrelModel[46] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 99
		barrelModel[47] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 100
		barrelModel[48] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 101
		barrelModel[49] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 102
		barrelModel[50] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 103
		barrelModel[51] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 104
		barrelModel[52] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 105
		barrelModel[53] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 106
		barrelModel[54] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 107
		barrelModel[55] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 110
		barrelModel[56] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 111
		barrelModel[57] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 112
		barrelModel[58] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 113
		barrelModel[59] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 117
		barrelModel[60] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 118
		barrelModel[61] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 119
		barrelModel[62] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 131
		barrelModel[63] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 133
		barrelModel[64] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Box 134
		barrelModel[65] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 135
		barrelModel[66] = new ModelRendererTurbo(this, 265, 281, textureX, textureY); // Box 136
		barrelModel[67] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 137
		barrelModel[68] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 138
		barrelModel[69] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 139
		barrelModel[70] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 140
		barrelModel[71] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Box 141
		barrelModel[72] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Box 142
		barrelModel[73] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 143
		barrelModel[74] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Box 144
		barrelModel[75] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 145
		barrelModel[76] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 146
		barrelModel[77] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 147
		barrelModel[78] = new ModelRendererTurbo(this, 393, 289, textureX, textureY); // Box 148

		barrelModel[0].addBox(-34F, -18F, -4F, 54, 4, 10, 0F); // Box 46
		barrelModel[0].setRotationPoint(0F, 0F, 0F);

		barrelModel[1].addBox(-34F, -31F, -4F, 54, 4, 10, 0F); // Box 47
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(-34F, -27F, -8F, 54, 9, 1, 0F); // Box 48
		barrelModel[2].setRotationPoint(0F, 0F, 0F);

		barrelModel[3].addBox(-34F, -27F, -7F, 54, 9, 17, 0F); // Box 49
		barrelModel[3].setRotationPoint(0F, 0F, 0F);

		barrelModel[4].addShapeBox(-34F, -31F, 6F, 54, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		barrelModel[4].setRotationPoint(0F, 0F, 0F);

		barrelModel[5].addShapeBox(-34F, -31F, -8F, 54, 4, 4, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[5].setRotationPoint(0F, 0F, 0F);

		barrelModel[6].addShapeBox(-34F, -18F, -8F, 54, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		barrelModel[6].setRotationPoint(0F, 0F, 0F);

		barrelModel[7].addShapeBox(-34F, -18F, 6F, 54, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 53
		barrelModel[7].setRotationPoint(0F, 0F, 0F);

		barrelModel[8].addBox(18F, -18F, -3F, 124, 1, 8, 0F); // Box 54
		barrelModel[8].setRotationPoint(0F, 0F, 0F);

		barrelModel[9].addBox(18F, -30F, -3F, 124, 1, 8, 0F); // Box 55
		barrelModel[9].setRotationPoint(0F, 0F, 0F);

		barrelModel[10].addBox(18F, -27F, -6F, 124, 7, 1, 0F); // Box 56
		barrelModel[10].setRotationPoint(0F, 0F, 0F);

		barrelModel[11].addBox(18F, -27F, 7F, 124, 7, 1, 0F); // Box 57
		barrelModel[11].setRotationPoint(0F, 0F, 0F);

		barrelModel[12].addShapeBox(20F, -20F, -6F, 122, 3, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		barrelModel[12].setRotationPoint(0F, 0F, 0F);

		barrelModel[13].addShapeBox(-29F, -35F, -7F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		barrelModel[13].setRotationPoint(0F, 0F, 0F);

		barrelModel[14].addShapeBox(-24F, -35F, -7F, 1, 9, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		barrelModel[14].setRotationPoint(0F, 0F, 0F);

		barrelModel[15].addShapeBox(-28F, -35F, -7F, 4, 3, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		barrelModel[15].setRotationPoint(0F, 0F, 0F);

		barrelModel[16].addBox(-29F, -37F, -5F, 52, 4, 3, 0F); // Box 67
		barrelModel[16].setRotationPoint(0F, 0F, 0F);

		barrelModel[17].addBox(-29F, -33F, -5F, 52, 1, 3, 0F); // Box 68
		barrelModel[17].setRotationPoint(0F, 0F, 0F);

		barrelModel[18].addBox(-29F, -36F, -6F, 52, 3, 1, 0F); // Box 69
		barrelModel[18].setRotationPoint(0F, 0F, 0F);

		barrelModel[19].addBox(-29F, -36F, -2F, 52, 3, 1, 0F); // Box 70
		barrelModel[19].setRotationPoint(0F, 0F, 0F);

		barrelModel[20].addShapeBox(-29F, -37F, -2F, 52, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		barrelModel[20].setRotationPoint(0F, 0F, 0F);

		barrelModel[21].addShapeBox(-29F, -37F, -6F, 52, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		barrelModel[21].setRotationPoint(0F, 0F, 0F);

		barrelModel[22].addShapeBox(-29F, -33F, -6F, 52, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		barrelModel[22].setRotationPoint(0F, 0F, 0F);

		barrelModel[23].addShapeBox(-29F, -33F, -2F, 52, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 74
		barrelModel[23].setRotationPoint(0F, 0F, 0F);

		barrelModel[24].addBox(5F, -36F, -7F, 1, 9, 13, 0F); // Box 75
		barrelModel[24].setRotationPoint(0F, 0F, 0F);

		barrelModel[25].addShapeBox(22F, -38F, -7F, 1, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		barrelModel[25].setRotationPoint(0F, 0F, 0F);

		barrelModel[26].addBox(22F, -38F, -5F, 1, 1, 3, 0F); // Box 77
		barrelModel[26].setRotationPoint(0F, 0F, 0F);

		barrelModel[27].addBox(22F, -33F, -5F, 1, 1, 3, 0F); // Box 78
		barrelModel[27].setRotationPoint(0F, 0F, 0F);

		barrelModel[28].addBox(22F, -36F, -1F, 1, 2, 1, 0F); // Box 79
		barrelModel[28].setRotationPoint(0F, 0F, 0F);

		barrelModel[29].addBox(22F, -36F, -7F, 1, 2, 1, 0F); // Box 80
		barrelModel[29].setRotationPoint(0F, 0F, 0F);

		barrelModel[30].addShapeBox(22F, -38F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		barrelModel[30].setRotationPoint(0F, 0F, 0F);

		barrelModel[31].addShapeBox(22F, -34F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 82
		barrelModel[31].setRotationPoint(0F, 0F, 0F);

		barrelModel[32].addShapeBox(22F, -34F, -7F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		barrelModel[32].setRotationPoint(0F, 0F, 0F);

		barrelModel[33].addShapeBox(5F, -38F, -2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[33].setRotationPoint(0F, 0F, 0F);

		barrelModel[34].addBox(5F, -38F, -5F, 1, 1, 3, 0F); // Box 85
		barrelModel[34].setRotationPoint(0F, 0F, 0F);

		barrelModel[35].addShapeBox(5F, -38F, -7F, 1, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		barrelModel[35].setRotationPoint(0F, 0F, 0F);

		barrelModel[36].addBox(-29F, -37F, 1F, 37, 3, 2, 0F); // Box 89
		barrelModel[36].setRotationPoint(0F, 0F, 0F);

		barrelModel[37].addBox(-29F, -34F, 1F, 37, 1, 2, 0F); // Box 90
		barrelModel[37].setRotationPoint(0F, 0F, 0F);

		barrelModel[38].addBox(-29F, -36F, 0F, 37, 2, 1, 0F); // Box 91
		barrelModel[38].setRotationPoint(0F, 0F, 0F);

		barrelModel[39].addBox(-29F, -36F, 3F, 37, 2, 1, 0F); // Box 92
		barrelModel[39].setRotationPoint(0F, 0F, 0F);

		barrelModel[40].addShapeBox(-29F, -37F, 0F, 37, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		barrelModel[40].setRotationPoint(0F, 0F, 0F);

		barrelModel[41].addShapeBox(-29F, -37F, 3F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		barrelModel[41].setRotationPoint(0F, 0F, 0F);

		barrelModel[42].addShapeBox(-29F, -34F, 3F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 95
		barrelModel[42].setRotationPoint(0F, 0F, 0F);

		barrelModel[43].addShapeBox(-29F, -34F, 0F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		barrelModel[43].setRotationPoint(0F, 0F, 0F);

		barrelModel[44].addBox(7F, -37.5F, 0.5F, 2, 4, 3, 0F); // Box 97
		barrelModel[44].setRotationPoint(0F, 0F, 0F);

		barrelModel[45].addBox(7F, -33.5F, 0.5F, 2, 1, 3, 0F); // Box 98
		barrelModel[45].setRotationPoint(0F, 0F, 0F);

		barrelModel[46].addBox(7F, -36.5F, 3.5F, 2, 3, 1, 0F); // Box 99
		barrelModel[46].setRotationPoint(0F, 0F, 0F);

		barrelModel[47].addBox(7F, -36.5F, -0.5F, 2, 3, 1, 0F); // Box 100
		barrelModel[47].setRotationPoint(0F, 0F, 0F);

		barrelModel[48].addShapeBox(7F, -33.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[48].setRotationPoint(0F, 0F, 0F);

		barrelModel[49].addShapeBox(7F, -37.5F, -0.5F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[49].setRotationPoint(0F, 0F, 0F);

		barrelModel[50].addShapeBox(7F, -37.5F, 3.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[50].setRotationPoint(0F, 0F, 0F);

		barrelModel[51].addShapeBox(7F, -33.5F, 3.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 104
		barrelModel[51].setRotationPoint(0F, 0F, 0F);

		barrelModel[52].addBox(5F, -38F, 1F, 1, 2, 3, 0F); // Box 105
		barrelModel[52].setRotationPoint(0F, 0F, 0F);

		barrelModel[53].addShapeBox(5F, -38F, -1F, 1, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		barrelModel[53].setRotationPoint(0F, 0F, 0F);

		barrelModel[54].addShapeBox(5F, -38F, 4F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		barrelModel[54].setRotationPoint(0F, 0F, 0F);

		barrelModel[55].addShapeBox(-12F, -17F, 10F, 20, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		barrelModel[55].setRotationPoint(0F, 0F, 0F);

		barrelModel[56].addShapeBox(-7F, -17F, 19F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		barrelModel[56].setRotationPoint(0F, 0F, 0F);

		barrelModel[57].addShapeBox(-12F, -17F, 19F, 5, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 112
		barrelModel[57].setRotationPoint(0F, 0F, 0F);

		barrelModel[58].addShapeBox(3F, -17F, 19F, 5, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 113
		barrelModel[58].setRotationPoint(0F, 0F, 0F);

		barrelModel[59].addShapeBox(20F, -20F, 5F, 122, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 117
		barrelModel[59].setRotationPoint(0F, 0F, 0F);

		barrelModel[60].addShapeBox(20F, -30F, 5F, 122, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 118
		barrelModel[60].setRotationPoint(0F, 0F, 0F);

		barrelModel[61].addShapeBox(20F, -30F, -6F, 122, 3, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		barrelModel[61].setRotationPoint(0F, 0F, 0F);

		barrelModel[62].addShapeBox(-36F, -22F, -2F, 5, 10, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		barrelModel[62].setRotationPoint(0F, 0F, 0F);

		barrelModel[63].addBox(-33F, -13F, 0F, 37, 3, 2, 0F); // Box 133
		barrelModel[63].setRotationPoint(0F, 0F, 0F);

		barrelModel[64].addBox(-33F, -10F, 0F, 37, 1, 2, 0F); // Box 134
		barrelModel[64].setRotationPoint(0F, 0F, 0F);

		barrelModel[65].addBox(-33F, -12F, -1F, 37, 2, 1, 0F); // Box 135
		barrelModel[65].setRotationPoint(0F, 0F, 0F);

		barrelModel[66].addBox(-33F, -12F, 2F, 37, 2, 1, 0F); // Box 136
		barrelModel[66].setRotationPoint(0F, 0F, 0F);

		barrelModel[67].addShapeBox(-32F, -13F, -1F, 37, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		barrelModel[67].setRotationPoint(0F, 0F, 0F);

		barrelModel[68].addShapeBox(-33F, -10F, -1F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		barrelModel[68].setRotationPoint(0F, 0F, 0F);

		barrelModel[69].addShapeBox(-33F, -10F, 2F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 139
		barrelModel[69].setRotationPoint(0F, 0F, 0F);

		barrelModel[70].addShapeBox(-33F, -13F, 2F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		barrelModel[70].setRotationPoint(0F, 0F, 0F);

		barrelModel[71].addBox(7F, -28F, -14F, 10, 13, 10, 0F); // Box 141
		barrelModel[71].setRotationPoint(0F, 0F, 0F);

		barrelModel[72].addBox(7F, -15F, -14F, 10, 1, 11, 0F); // Box 142
		barrelModel[72].setRotationPoint(0F, 0F, 0F);

		barrelModel[73].addShapeBox(17F, -28F, -14F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		barrelModel[73].setRotationPoint(0F, 0F, 0F);

		barrelModel[74].addBox(3F, -24F, -14F, 17, 6, 10, 0F); // Box 144
		barrelModel[74].setRotationPoint(0F, 0F, 0F);

		barrelModel[75].addBox(20F, -24F, -14F, 1, 6, 11, 0F); // Box 145
		barrelModel[75].setRotationPoint(0F, 0F, 0F);

		barrelModel[76].addShapeBox(17F, -18F, -14F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 146
		barrelModel[76].setRotationPoint(0F, 0F, 0F);

		barrelModel[77].addShapeBox(3F, -18F, -14F, 4, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 147
		barrelModel[77].setRotationPoint(0F, 0F, 0F);

		barrelModel[78].addShapeBox(3F, -28F, -14F, 4, 4, 10, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		barrelModel[78].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}