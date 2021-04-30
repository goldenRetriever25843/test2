//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PLZ05
// Model Creator: 
// Created on: 23.06.2017 - 21:40:31
// Last changed on: 23.06.2017 - 21:40:31

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPLZ05 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPLZ05() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[29];
		turretModel = new ModelRendererTurbo[70];
		barrelModel = new ModelRendererTurbo[24];
		leftTrackWheelModels = new ModelRendererTurbo[33];
		rightTrackWheelModels = new ModelRendererTurbo[33];
		leftTrackModel = new ModelRendererTurbo[14];
		rightTrackModel = new ModelRendererTurbo[14];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 595
		bodyModel[1] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 596
		bodyModel[2] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 597
		bodyModel[3] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 598
		bodyModel[4] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 599
		bodyModel[5] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 600
		bodyModel[6] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 601
		bodyModel[7] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 602
		bodyModel[8] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 603
		bodyModel[9] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 604
		bodyModel[10] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 605
		bodyModel[11] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 606
		bodyModel[12] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 607
		bodyModel[13] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 608
		bodyModel[14] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 609
		bodyModel[15] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 610
		bodyModel[16] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 611
		bodyModel[17] = new ModelRendererTurbo(this, 319, 120, textureX, textureY); // Box 612
		bodyModel[18] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 613
		bodyModel[19] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 614
		bodyModel[20] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 615
		bodyModel[21] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 616
		bodyModel[22] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 617
		bodyModel[23] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 618
		bodyModel[24] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 619
		bodyModel[25] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 620
		bodyModel[26] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 621
		bodyModel[27] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 622
		bodyModel[28] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 623

		bodyModel[0].addShapeBox(0F, 0F, 0F, 104, 22, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[0].setRotationPoint(-42F, -20F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 25, 22, 44, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[1].setRotationPoint(62F, -20F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 3, 42, 0F,0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F); // Box 597
		bodyModel[2].setRotationPoint(-21F, -23F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[3].setRotationPoint(-7F, -23F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F); // Box 599
		bodyModel[4].setRotationPoint(7F, -23F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 8, 11, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[5].setRotationPoint(62F, -20F, -33F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 8, 11, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[6].setRotationPoint(62F, -20F, 22F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 104, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[7].setRotationPoint(-42F, -20F, -33F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 104, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[8].setRotationPoint(-42F, -20F, 22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 604
		bodyModel[9].setRotationPoint(51F, -12F, -33F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[10].setRotationPoint(62F, -12F, -33F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[11].setRotationPoint(78F, -12F, -33F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 607
		bodyModel[12].setRotationPoint(85F, -12F, -33F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 608
		bodyModel[13].setRotationPoint(51F, -12F, 32F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[14].setRotationPoint(62F, -12F, 32F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[15].setRotationPoint(78F, -12F, 32F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 611
		bodyModel[16].setRotationPoint(85F, -12F, 20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[17].setRotationPoint(84F, -17.5F, 25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[18].setRotationPoint(84F, -17.5F, -31F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 5, 14, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[19].setRotationPoint(54F, -22F, -32.8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 615
		bodyModel[20].setRotationPoint(54F, -23F, -32.8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 19, 4, 30, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[21].setRotationPoint(63F, -19F, -15F);

		bodyModel[22].addShapeBox(0F, -1F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[22].setRotationPoint(-42F, -12F, 22F);
		bodyModel[22].rotateAngleZ = -0.80285146F;

		bodyModel[23].addShapeBox(0F, -1F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[23].setRotationPoint(-42F, -12F, -33F);
		bodyModel[23].rotateAngleZ = -0.80285146F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[24].setRotationPoint(-43F, -15F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[25].setRotationPoint(-43F, -18F, 1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 621
		bodyModel[26].setRotationPoint(-43F, -3F, 1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[27].setRotationPoint(-43.5F, -14F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[28].setRotationPoint(-43.5F, -5F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 123
		turretModel[1] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 124
		turretModel[2] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 125
		turretModel[3] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 126
		turretModel[4] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Box 127
		turretModel[5] = new ModelRendererTurbo(this, 337, 321, textureX, textureY); // Box 128
		turretModel[6] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 144
		turretModel[7] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Box 145
		turretModel[8] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 147
		turretModel[9] = new ModelRendererTurbo(this, 41, 369, textureX, textureY); // Box 148
		turretModel[10] = new ModelRendererTurbo(this, 89, 369, textureX, textureY); // Box 149
		turretModel[11] = new ModelRendererTurbo(this, 153, 369, textureX, textureY); // Box 150
		turretModel[12] = new ModelRendererTurbo(this, 225, 369, textureX, textureY); // Box 152
		turretModel[13] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Box 153
		turretModel[14] = new ModelRendererTurbo(this, 353, 369, textureX, textureY); // Box 154
		turretModel[15] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // Box 155
		turretModel[16] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Box 156
		turretModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 157
		turretModel[18] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 158
		turretModel[19] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 159
		turretModel[20] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 160
		turretModel[21] = new ModelRendererTurbo(this, 209, 393, textureX, textureY); // Box 161
		turretModel[22] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 162
		turretModel[23] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 163
		turretModel[24] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Box 164
		turretModel[25] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 165
		turretModel[26] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 166
		turretModel[27] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 167
		turretModel[28] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 168
		turretModel[29] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 169
		turretModel[30] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 170
		turretModel[31] = new ModelRendererTurbo(this, 153, 265, textureX, textureY); // Box 171
		turretModel[32] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 172
		turretModel[33] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 173
		turretModel[34] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 174
		turretModel[35] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 175
		turretModel[36] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 176
		turretModel[37] = new ModelRendererTurbo(this, 257, 393, textureX, textureY); // Box 177
		turretModel[38] = new ModelRendererTurbo(this, 353, 393, textureX, textureY); // Box 178
		turretModel[39] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 179
		turretModel[40] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 180
		turretModel[41] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 181
		turretModel[42] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 182
		turretModel[43] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 183
		turretModel[44] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 184
		turretModel[45] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 194
		turretModel[46] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 195
		turretModel[47] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 196
		turretModel[48] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 197
		turretModel[49] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 198
		turretModel[50] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 199
		turretModel[51] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 200
		turretModel[52] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 201
		turretModel[53] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 202
		turretModel[54] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 203
		turretModel[55] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 204
		turretModel[56] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 205
		turretModel[57] = new ModelRendererTurbo(this, 265, 425, textureX, textureY); // Box 206
		turretModel[58] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Box 207
		turretModel[59] = new ModelRendererTurbo(this, 321, 393, textureX, textureY); // Box 208
		turretModel[60] = new ModelRendererTurbo(this, 385, 393, textureX, textureY); // Box 209
		turretModel[61] = new ModelRendererTurbo(this, 25, 393, textureX, textureY); // Box 210
		turretModel[62] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 211
		turretModel[63] = new ModelRendererTurbo(this, 209, 401, textureX, textureY); // Box 212
		turretModel[64] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Box 213
		turretModel[65] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 214
		turretModel[66] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 215
		turretModel[67] = new ModelRendererTurbo(this, 329, 425, textureX, textureY); // Box 216
		turretModel[68] = new ModelRendererTurbo(this, 193, 433, textureX, textureY); // Box 217
		turretModel[69] = new ModelRendererTurbo(this, 353, 433, textureX, textureY); // Box 218

		turretModel[0].addShapeBox(0F, 0F, 0F, 63, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 123
		turretModel[0].setRotationPoint(-38F, -38F, 9.5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 67, 10, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
		turretModel[1].setRotationPoint(-38F, -30F, 9.5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 63, 4, 23, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		turretModel[2].setRotationPoint(-38F, -42F, 9.5F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 63, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 126
		turretModel[3].setRotationPoint(-38F, -38F, -32.5F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 67, 10, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		turretModel[4].setRotationPoint(-38F, -30F, -32.5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 63, 4, 23, 0F,0F, 0F, -3F, -2.5F, 0F, -3F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		turretModel[5].setRotationPoint(-38F, -42F, -32.5F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 13, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 144
		turretModel[6].setRotationPoint(10F, -44F, 6.5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 3, 24, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[7].setRotationPoint(10F, -44F, -6.5F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 13, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[8].setRotationPoint(10F, -44F, -9.5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 7, 14, 13, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 148
		turretModel[9].setRotationPoint(10F, -34F, -6.5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		turretModel[10].setRotationPoint(11F, -33F, -6.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 22, 5, 13, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 150
		turretModel[11].setRotationPoint(5F, -43F, -6.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 18, 5, 13, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		turretModel[12].setRotationPoint(11F, -38F, -6.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 18, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 153
		turretModel[13].setRotationPoint(11F, -27F, -6.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 22, 5, 13, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 154
		turretModel[14].setRotationPoint(5F, -22F, -6.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 48, 22, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[15].setRotationPoint(-38F, -42.5F, -10F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 156
		turretModel[16].setRotationPoint(-42F, -39.5F, -28F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 1F, 0F, -0.6F); // Box 157
		turretModel[17].setRotationPoint(-38.25F, -41.5F, -28F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 158
		turretModel[18].setRotationPoint(-38.25F, -41.5F, 27F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 159
		turretModel[19].setRotationPoint(-42F, -41.3F, -27F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 160
		turretModel[20].setRotationPoint(-42F, -41.3F, 17F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 6, 4, 28, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 161
		turretModel[21].setRotationPoint(-44F, -43.3F, -14F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 1F, 0F, -0.6F); // Box 162
		turretModel[22].setRotationPoint(-38.25F, -41.5F, -15F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 163
		turretModel[23].setRotationPoint(-38.25F, -41.5F, 14F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		turretModel[24].setRotationPoint(-44F, -39.5F, -14F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 165
		turretModel[25].setRotationPoint(-44F, -33.9F, -32.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 166
		turretModel[26].setRotationPoint(-40F, -33.9F, -32.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		turretModel[27].setRotationPoint(-42F, -33.9F, -32.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		turretModel[28].setRotationPoint(-42F, -37F, -32.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 169
		turretModel[29].setRotationPoint(-44F, -37F, -32.5F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -2F, -1.9F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 170
		turretModel[30].setRotationPoint(-40F, -37F, -32.5F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 171
		turretModel[31].setRotationPoint(-44F, -33.9F, 26.5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 172
		turretModel[32].setRotationPoint(-40F, -33.9F, 26.5F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 2, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		turretModel[33].setRotationPoint(-42F, -33.9F, 26.5F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		turretModel[34].setRotationPoint(-42F, -37F, 26.5F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 175
		turretModel[35].setRotationPoint(-44F, -37F, 26.5F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -2F, -1.9F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 176
		turretModel[36].setRotationPoint(-40F, -37F, 26.5F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		turretModel[37].setRotationPoint(-44F, -33.9F, 7.5F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 6, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		turretModel[38].setRotationPoint(-44F, -33.9F, -23.5F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		turretModel[39].setRotationPoint(-39F, -36.9F, 3.5F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		turretModel[40].setRotationPoint(-39F, -36.9F, -2.5F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		turretModel[41].setRotationPoint(-38.5F, -35.9F, -1.5F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		turretModel[42].setRotationPoint(-38.5F, -31.9F, -1.5F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		turretModel[43].setRotationPoint(-38.5F, -27.9F, -1.5F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		turretModel[44].setRotationPoint(-38.5F, -23.9F, -1.5F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		turretModel[45].setRotationPoint(25F, -38F, -26.5F);
		turretModel[45].rotateAngleY = -0.20943951F;
		turretModel[45].rotateAngleZ = 0.48869219F;

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		turretModel[46].setRotationPoint(26F, -36F, -26.5F);
		turretModel[46].rotateAngleY = -0.2443461F;
		turretModel[46].rotateAngleZ = 0.29670597F;

		turretModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		turretModel[47].setRotationPoint(26F, -36F, -23.5F);
		turretModel[47].rotateAngleY = 0.2443461F;
		turretModel[47].rotateAngleZ = 0.29670597F;

		turretModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		turretModel[48].setRotationPoint(25F, -38F, -23.5F);
		turretModel[48].rotateAngleY = 0.20943951F;
		turretModel[48].rotateAngleZ = 0.48869219F;

		turretModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		turretModel[49].setRotationPoint(26F, -36F, 23.5F);
		turretModel[49].rotateAngleY = 0.2443461F;
		turretModel[49].rotateAngleZ = 0.29670597F;

		turretModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		turretModel[50].setRotationPoint(25F, -38F, 23.5F);
		turretModel[50].rotateAngleY = 0.20943951F;
		turretModel[50].rotateAngleZ = 0.48869219F;

		turretModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		turretModel[51].setRotationPoint(25F, -38F, 20.5F);
		turretModel[51].rotateAngleY = -0.20943951F;
		turretModel[51].rotateAngleZ = 0.48869219F;

		turretModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		turretModel[52].setRotationPoint(26F, -36F, 20.5F);
		turretModel[52].rotateAngleY = -0.2443461F;
		turretModel[52].rotateAngleZ = 0.29670597F;

		turretModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		turretModel[53].setRotationPoint(-37.25F, -44.5F, -18F);
		turretModel[53].rotateAngleZ = 0.17453293F;

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,-0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 203
		turretModel[54].setRotationPoint(-43.5F, -80.5F, -18F);
		turretModel[54].rotateAngleZ = 0.17453293F;

		turretModel[55].addShapeBox(0F, 0F, 0F, 14, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		turretModel[55].setRotationPoint(-37F, -43.5F, -11F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 12, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		turretModel[56].setRotationPoint(-36F, -42.5F, -29F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 12, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		turretModel[57].setRotationPoint(-36F, -42.5F, 11F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 207
		turretModel[58].setRotationPoint(-18F, -44F, 13.5F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		turretModel[59].setRotationPoint(-14F, -44F, 13.5F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 209
		turretModel[60].setRotationPoint(-10F, -44F, 13.5F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		turretModel[61].setRotationPoint(14F, -47F, 15.5F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 211
		turretModel[62].setRotationPoint(17F, -47F, 15.5F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 212
		turretModel[63].setRotationPoint(11F, -47F, 15.5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		turretModel[64].setRotationPoint(12F, -42.5F, -19.5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[65].setRotationPoint(13F, -43F, -18.5F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		turretModel[66].setRotationPoint(13.5F, -46F, -17.5F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 216
		turretModel[67].setRotationPoint(-16F, -43F, -26.5F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		turretModel[68].setRotationPoint(-14F, -43F, -26.5F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 218
		turretModel[69].setRotationPoint(-10F, -43F, -26.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 129
		barrelModel[1] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 130
		barrelModel[2] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 131
		barrelModel[3] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 132
		barrelModel[4] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 133
		barrelModel[5] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 134
		barrelModel[6] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 135
		barrelModel[7] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 136
		barrelModel[8] = new ModelRendererTurbo(this, 241, 353, textureX, textureY); // Box 137
		barrelModel[9] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 138
		barrelModel[10] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 139
		barrelModel[11] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 140
		barrelModel[12] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 141
		barrelModel[13] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 142
		barrelModel[14] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 143
		barrelModel[15] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 185
		barrelModel[16] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 186
		barrelModel[17] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 187
		barrelModel[18] = new ModelRendererTurbo(this, 337, 313, textureX, textureY); // Box 188
		barrelModel[19] = new ModelRendererTurbo(this, 425, 313, textureX, textureY); // Box 189
		barrelModel[20] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 190
		barrelModel[21] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 191
		barrelModel[22] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 192
		barrelModel[23] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 193

		barrelModel[0].addShapeBox(0F, -1F, -3F, 34, 2, 6, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 129
		barrelModel[0].setRotationPoint(17F, -32F, 0F);

		barrelModel[1].addShapeBox(0F, -3F, -3F, 34, 2, 6, 0F,0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 130
		barrelModel[1].setRotationPoint(17F, -32F, 0F);

		barrelModel[2].addShapeBox(0F, 1F, -3F, 34, 2, 6, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -1F); // Box 131
		barrelModel[2].setRotationPoint(17F, -32F, 0F);

		barrelModel[3].addShapeBox(145F, 1F, -3F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 132
		barrelModel[3].setRotationPoint(17F, -32F, 0F);

		barrelModel[4].addShapeBox(145F, -3F, -3F, 14, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		barrelModel[4].setRotationPoint(17F, -32F, 0F);

		barrelModel[5].addShapeBox(145F, -1F, -3F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		barrelModel[5].setRotationPoint(17F, -32F, 0F);

		barrelModel[6].addShapeBox(34F, -1F, -2F, 111, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		barrelModel[6].setRotationPoint(17F, -32F, 0F);

		barrelModel[7].addShapeBox(34F, -3F, -3F, 111, 2, 6, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
		barrelModel[7].setRotationPoint(17F, -32F, 0F);

		barrelModel[8].addShapeBox(34F, 1F, -3F, 111, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 137
		barrelModel[8].setRotationPoint(17F, -32F, 0F);

		barrelModel[9].addShapeBox(43F, -3F, -3F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		barrelModel[9].setRotationPoint(17F, -32F, 0F);

		barrelModel[10].addShapeBox(43F, -1F, -3F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		barrelModel[10].setRotationPoint(17F, -32F, 0F);

		barrelModel[11].addShapeBox(43F, 1F, -3F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 140
		barrelModel[11].setRotationPoint(17F, -32F, 0F);

		barrelModel[12].addShapeBox(73F, -3F, -3F, 16, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		barrelModel[12].setRotationPoint(17F, -32F, 0F);

		barrelModel[13].addShapeBox(73F, -1F, -3F, 16, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		barrelModel[13].setRotationPoint(17F, -32F, 0F);

		barrelModel[14].addShapeBox(73F, 1F, -3F, 16, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 143
		barrelModel[14].setRotationPoint(17F, -32F, 0F);

		barrelModel[15].addShapeBox(9F, -8F, -5F, 37, 2, 6, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 185
		barrelModel[15].setRotationPoint(17F, -32F, 0F);

		barrelModel[16].addShapeBox(9F, -4F, -5F, 37, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 186
		barrelModel[16].setRotationPoint(17F, -32F, 0F);

		barrelModel[17].addShapeBox(9F, -6F, -4F, 37, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		barrelModel[17].setRotationPoint(17F, -32F, 0F);

		barrelModel[18].addShapeBox(9F, -7.8F, 1F, 35, 2, 5, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 188
		barrelModel[18].setRotationPoint(17F, -32F, 0F);

		barrelModel[19].addShapeBox(9F, -4.8F, 1F, 35, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 189
		barrelModel[19].setRotationPoint(17F, -32F, 0F);

		barrelModel[20].addShapeBox(9F, -5.8F, 2F, 35, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		barrelModel[20].setRotationPoint(17F, -32F, 0F);

		barrelModel[21].addShapeBox(9F, -8F, -5F, 12, 2, 11, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		barrelModel[21].setRotationPoint(17F, -32F, 0F);

		barrelModel[22].addShapeBox(10F, -12F, -2.5F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		barrelModel[22].setRotationPoint(17F, -32F, 0F);

		barrelModel[23].addShapeBox(10F, -9F, -2F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		barrelModel[23].setRotationPoint(17F, -32F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 113
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 114
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 117
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 118
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 119
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 121
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 122
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 123
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 124
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 125
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 126
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 127
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 128
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 132
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 133
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 134
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 135
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 136
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 137
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 138
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 139
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 140
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 204
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 205
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 206
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 207
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 208
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 209
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 210
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 211
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 212

		leftTrackWheelModels[0].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 113
		leftTrackWheelModels[0].setRotationPoint(11.75F, 3F, 24F);

		leftTrackWheelModels[1].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[1].setRotationPoint(11.75F, 3F, 24F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 116
		leftTrackWheelModels[2].setRotationPoint(11.75F, 3F, 24F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 117
		leftTrackWheelModels[3].setRotationPoint(28F, 3F, 24F);

		leftTrackWheelModels[4].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 118
		leftTrackWheelModels[4].setRotationPoint(28F, 3F, 24F);

		leftTrackWheelModels[5].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftTrackWheelModels[5].setRotationPoint(28F, 3F, 24F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 120
		leftTrackWheelModels[6].setRotationPoint(43.25F, 3F, 24F);

		leftTrackWheelModels[7].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 121
		leftTrackWheelModels[7].setRotationPoint(43.25F, 3F, 24F);

		leftTrackWheelModels[8].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftTrackWheelModels[8].setRotationPoint(43.25F, 3F, 24F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 123
		leftTrackWheelModels[9].setRotationPoint(62F, 3F, 24F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 124
		leftTrackWheelModels[10].setRotationPoint(62F, 3F, 24F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftTrackWheelModels[11].setRotationPoint(62F, 3F, 24F);

		leftTrackWheelModels[12].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 126
		leftTrackWheelModels[12].setRotationPoint(-4F, 3F, 24F);

		leftTrackWheelModels[13].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[13].setRotationPoint(-4F, 3F, 24F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 128
		leftTrackWheelModels[14].setRotationPoint(-4F, 3F, 24F);

		leftTrackWheelModels[15].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftTrackWheelModels[15].setRotationPoint(-24.75F, 3F, 24F);

		leftTrackWheelModels[16].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 133
		leftTrackWheelModels[16].setRotationPoint(-24.75F, 3F, 24F);

		leftTrackWheelModels[17].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 134
		leftTrackWheelModels[17].setRotationPoint(-24.75F, 3F, 24F);

		leftTrackWheelModels[18].addShapeBox(-5.75F, -5.5F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftTrackWheelModels[18].setRotationPoint(-37.25F, -4.5F, 24F);

		leftTrackWheelModels[19].addBox(-5.75F, -2F, 0F, 12, 3, 8, 0F); // Box 136
		leftTrackWheelModels[19].setRotationPoint(-37.25F, -4F, 24F);

		leftTrackWheelModels[20].addShapeBox(-5.75F, 1.5F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 137
		leftTrackWheelModels[20].setRotationPoint(-37.25F, -4.5F, 24F);

		leftTrackWheelModels[21].addBox(-5.75F, -2F, 0F, 12, 4, 8, 0F); // Box 138
		leftTrackWheelModels[21].setRotationPoint(76.25F, -5.25F, 24F);

		leftTrackWheelModels[22].addShapeBox(-5.75F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 139
		leftTrackWheelModels[22].setRotationPoint(76.25F, -5.25F, 24F);

		leftTrackWheelModels[23].addShapeBox(-5.75F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftTrackWheelModels[23].setRotationPoint(76.25F, -5.25F, 24F);

		leftTrackWheelModels[24].addShapeBox(-1F, -0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 204
		leftTrackWheelModels[24].setRotationPoint(49F, -8.5F, 21F);

		leftTrackWheelModels[25].addShapeBox(-1F, -1.5F, 2F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 205
		leftTrackWheelModels[25].setRotationPoint(49F, -8.5F, 21F);

		leftTrackWheelModels[26].addShapeBox(-1F, 0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 206
		leftTrackWheelModels[26].setRotationPoint(49F, -8.5F, 21F);

		leftTrackWheelModels[27].addShapeBox(-1F, 0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 207
		leftTrackWheelModels[27].setRotationPoint(-16F, -8.5F, 21F);

		leftTrackWheelModels[28].addShapeBox(-1F, -1.5F, 2F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 208
		leftTrackWheelModels[28].setRotationPoint(-16F, -8.5F, 21F);

		leftTrackWheelModels[29].addShapeBox(-1F, -0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 209
		leftTrackWheelModels[29].setRotationPoint(-16F, -8.5F, 21F);

		leftTrackWheelModels[30].addShapeBox(-1F, 0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 210
		leftTrackWheelModels[30].setRotationPoint(17F, -8.5F, 21F);

		leftTrackWheelModels[31].addShapeBox(-1F, -1.5F, 2F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 211
		leftTrackWheelModels[31].setRotationPoint(17F, -8.5F, 21F);

		leftTrackWheelModels[32].addShapeBox(-1F, -0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 212
		leftTrackWheelModels[32].setRotationPoint(17F, -8.5F, 21F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 141
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 142
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 143
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 144
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 145
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 146
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 147
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 148
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 149
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 150
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 151
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 152
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 153
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 154
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 155
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 156
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 157
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 158
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 162
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 163
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 164
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 213
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 214
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 215
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 216
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 217
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 218
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 219
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 220
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 221
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 572
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 573
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 574

		rightTrackWheelModels[0].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightTrackWheelModels[0].setRotationPoint(62F, 3F, -31F);

		rightTrackWheelModels[1].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 142
		rightTrackWheelModels[1].setRotationPoint(62F, 3F, -31F);

		rightTrackWheelModels[2].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 143
		rightTrackWheelModels[2].setRotationPoint(62F, 3F, -31F);

		rightTrackWheelModels[3].addShapeBox(-5.75F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		rightTrackWheelModels[3].setRotationPoint(76F, -5F, -32F);

		rightTrackWheelModels[4].addBox(-5.75F, -2F, 0F, 12, 4, 8, 0F); // Box 145
		rightTrackWheelModels[4].setRotationPoint(76F, -5F, -32F);

		rightTrackWheelModels[5].addShapeBox(-5.75F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 146
		rightTrackWheelModels[5].setRotationPoint(76F, -5F, -32F);

		rightTrackWheelModels[6].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightTrackWheelModels[6].setRotationPoint(43.25F, 3F, -31F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 148
		rightTrackWheelModels[7].setRotationPoint(43.25F, 3F, -31F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 149
		rightTrackWheelModels[8].setRotationPoint(43.25F, 3F, -31F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 150
		rightTrackWheelModels[9].setRotationPoint(28F, 3F, -31F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 151
		rightTrackWheelModels[10].setRotationPoint(28F, 3F, -31F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightTrackWheelModels[11].setRotationPoint(28F, 3F, -31F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackWheelModels[12].setRotationPoint(11.75F, 3F, -31F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 154
		rightTrackWheelModels[13].setRotationPoint(11.75F, 3F, -31F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 155
		rightTrackWheelModels[14].setRotationPoint(11.75F, 3F, -31F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightTrackWheelModels[15].setRotationPoint(-4F, 3F, -31F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 157
		rightTrackWheelModels[16].setRotationPoint(-4F, 3F, -31F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackWheelModels[17].setRotationPoint(-4F, 3F, -31F);

		rightTrackWheelModels[18].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 162
		rightTrackWheelModels[18].setRotationPoint(-24.75F, 3F, -31F);

		rightTrackWheelModels[19].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 163
		rightTrackWheelModels[19].setRotationPoint(-24.75F, 3F, -31F);

		rightTrackWheelModels[20].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightTrackWheelModels[20].setRotationPoint(-24.75F, 3F, -31F);

		rightTrackWheelModels[21].addShapeBox(-1F, 0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 213
		rightTrackWheelModels[21].setRotationPoint(17F, -8.5F, -30F);

		rightTrackWheelModels[22].addShapeBox(-1F, -1.5F, 2F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 214
		rightTrackWheelModels[22].setRotationPoint(17F, -8.5F, -30F);

		rightTrackWheelModels[23].addShapeBox(-1F, -0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 215
		rightTrackWheelModels[23].setRotationPoint(17F, -8.5F, -30F);

		rightTrackWheelModels[24].addShapeBox(-1F, -1.5F, 2F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 216
		rightTrackWheelModels[24].setRotationPoint(-16F, -8.5F, -30F);

		rightTrackWheelModels[25].addShapeBox(-1F, -0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 217
		rightTrackWheelModels[25].setRotationPoint(-16F, -8.5F, -30F);

		rightTrackWheelModels[26].addShapeBox(-1F, 0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 218
		rightTrackWheelModels[26].setRotationPoint(-16F, -8.5F, -30F);

		rightTrackWheelModels[27].addShapeBox(-1F, -1.5F, 2F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		rightTrackWheelModels[27].setRotationPoint(49F, -8.5F, -30F);

		rightTrackWheelModels[28].addShapeBox(-1F, -0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 220
		rightTrackWheelModels[28].setRotationPoint(49F, -8.5F, -30F);

		rightTrackWheelModels[29].addShapeBox(-1F, 0.5F, 2F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 221
		rightTrackWheelModels[29].setRotationPoint(49F, -8.5F, -30F);

		rightTrackWheelModels[30].addShapeBox(-5.75F, -5.5F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		rightTrackWheelModels[30].setRotationPoint(-37.25F, -4.5F, -31F);

		rightTrackWheelModels[31].addBox(-5.75F, -2F, 0F, 12, 3, 8, 0F); // Box 573
		rightTrackWheelModels[31].setRotationPoint(-37.25F, -4F, -31F);

		rightTrackWheelModels[32].addShapeBox(-5.75F, 1.5F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 574
		rightTrackWheelModels[32].setRotationPoint(-37.25F, -4.5F, -31F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 168
		leftTrackModel[1] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 169
		leftTrackModel[2] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 170
		leftTrackModel[3] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 171
		leftTrackModel[4] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 172
		leftTrackModel[5] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 173
		leftTrackModel[6] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 174
		leftTrackModel[7] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 175
		leftTrackModel[8] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 179
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 181
		leftTrackModel[10] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 183
		leftTrackModel[11] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 184
		leftTrackModel[12] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 185
		leftTrackModel[13] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 186

		leftTrackModel[0].addShapeBox(-5.75F, 2F, 0F, 84, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 168
		leftTrackModel[0].setRotationPoint(-17.5F, 7F, 23F);

		leftTrackModel[1].addShapeBox(-5.75F, 2F, 0F, 75, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 169
		leftTrackModel[1].setRotationPoint(-8.5F, -13F, 23F);

		leftTrackModel[2].addShapeBox(-5.75F, 2F, 0F, 25, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 170
		leftTrackModel[2].setRotationPoint(-33.5F, -13F, 23F);

		leftTrackModel[3].addShapeBox(-5.75F, 2F, 0F, 18, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 171
		leftTrackModel[3].setRotationPoint(66.5F, -13F, 23F);

		leftTrackModel[4].addShapeBox(-5.75F, 2F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 172
		leftTrackModel[4].setRotationPoint(66.5F, 7F, 23F);

		leftTrackModel[5].addShapeBox(-5.75F, 2F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0.5F, 0F, 0F, 0.5F); // Box 173
		leftTrackModel[5].setRotationPoint(71.5F, 6F, 23F);

		leftTrackModel[6].addShapeBox(-5.75F, 2F, 0F, 14, 1, 9, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 8F, 0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -8F, 0.5F); // Box 174
		leftTrackModel[6].setRotationPoint(-34.5F, 6F, 23F);

		leftTrackModel[7].addShapeBox(-5.75F, 2F, 0F, 3, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 175
		leftTrackModel[7].setRotationPoint(-20.5F, 7F, 23F);

		leftTrackModel[8].addShapeBox(-5.75F, -2F, 0F, 1, 5, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 179
		leftTrackModel[8].setRotationPoint(88.25F, -6F, 23.5F);

		leftTrackModel[9].addShapeBox(-5.75F, 2F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F); // Box 181
		leftTrackModel[9].setRotationPoint(85.5F, -2F, 23F);

		leftTrackModel[10].addShapeBox(-5.75F, 2F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 183
		leftTrackModel[10].setRotationPoint(84.5F, -14F, 23F);

		leftTrackModel[11].addShapeBox(-5.75F, -2F, 0F, 1, 4, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 184
		leftTrackModel[11].setRotationPoint(-38.25F, -5F, 23.5F);

		leftTrackModel[12].addShapeBox(-5.75F, 2F, 0F, 4, 1, 9, 0F,0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F, 0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F); // Box 185
		leftTrackModel[12].setRotationPoint(-37.5F, -13F, 23F);

		leftTrackModel[13].addShapeBox(-5.75F, 2F, 0F, 3, 1, 9, 0F,0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F, 0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F); // Box 186
		leftTrackModel[13].setRotationPoint(-37.5F, -2F, 23F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 187
		rightTrackModel[1] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 188
		rightTrackModel[2] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 189
		rightTrackModel[3] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 190
		rightTrackModel[4] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 191
		rightTrackModel[5] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 192
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 193
		rightTrackModel[7] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 194
		rightTrackModel[8] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 195
		rightTrackModel[9] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 196
		rightTrackModel[10] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 197
		rightTrackModel[11] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 198
		rightTrackModel[12] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 199
		rightTrackModel[13] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 200

		rightTrackModel[0].addShapeBox(-5.75F, 2F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0.5F, 0F, 0F, 0.5F); // Box 187
		rightTrackModel[0].setRotationPoint(71.5F, 6F, -32F);

		rightTrackModel[1].addShapeBox(-5.75F, 2F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F); // Box 188
		rightTrackModel[1].setRotationPoint(85.5F, -2F, -32F);

		rightTrackModel[2].addShapeBox(-5.75F, -2F, 0F, 1, 5, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 189
		rightTrackModel[2].setRotationPoint(88.25F, -6F, -31.5F);

		rightTrackModel[3].addShapeBox(-5.75F, 2F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 190
		rightTrackModel[3].setRotationPoint(84.5F, -14F, -32F);

		rightTrackModel[4].addShapeBox(-5.75F, 2F, 0F, 18, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 191
		rightTrackModel[4].setRotationPoint(66.5F, -13F, -32F);

		rightTrackModel[5].addShapeBox(-5.75F, 2F, 0F, 75, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 192
		rightTrackModel[5].setRotationPoint(-8.5F, -13F, -32F);

		rightTrackModel[6].addShapeBox(-5.75F, 2F, 0F, 25, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 193
		rightTrackModel[6].setRotationPoint(-33.5F, -13F, -32F);

		rightTrackModel[7].addShapeBox(-5.75F, 2F, 0F, 4, 1, 9, 0F,0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F, 0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F); // Box 194
		rightTrackModel[7].setRotationPoint(-37.5F, -13F, -32F);

		rightTrackModel[8].addShapeBox(-5.75F, -2F, 0F, 1, 4, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 195
		rightTrackModel[8].setRotationPoint(-38.25F, -5F, -31.5F);

		rightTrackModel[9].addShapeBox(-5.75F, 2F, 0F, 3, 1, 9, 0F,0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F, 0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F); // Box 196
		rightTrackModel[9].setRotationPoint(-37.5F, -2F, -32F);

		rightTrackModel[10].addShapeBox(-5.75F, 2F, 0F, 14, 1, 9, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 8F, 0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -8F, 0.5F); // Box 197
		rightTrackModel[10].setRotationPoint(-34.5F, 6F, -32F);

		rightTrackModel[11].addShapeBox(-5.75F, 2F, 0F, 3, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 198
		rightTrackModel[11].setRotationPoint(-20.5F, 7F, -32F);

		rightTrackModel[12].addShapeBox(-5.75F, 2F, 0F, 84, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 199
		rightTrackModel[12].setRotationPoint(-17.5F, 7F, -32F);

		rightTrackModel[13].addShapeBox(-5.75F, 2F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 200
		rightTrackModel[13].setRotationPoint(66.5F, 7F, -32F);
	}
}