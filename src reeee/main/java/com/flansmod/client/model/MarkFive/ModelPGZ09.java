//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PGZ09
// Model Creator: 
// Created on: 23.06.2017 - 21:40:31
// Last changed on: 23.06.2017 - 21:40:31

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPGZ09 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelPGZ09() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[29];
		turretModel = new ModelRendererTurbo[97];
		barrelModel = new ModelRendererTurbo[87];
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
		bodyModel[0] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 595
		bodyModel[1] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 596
		bodyModel[2] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 597
		bodyModel[3] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 598
		bodyModel[4] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 599
		bodyModel[5] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 600
		bodyModel[6] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 601
		bodyModel[7] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Box 602
		bodyModel[8] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 603
		bodyModel[9] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 604
		bodyModel[10] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 605
		bodyModel[11] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 606
		bodyModel[12] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 607
		bodyModel[13] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 608
		bodyModel[14] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 609
		bodyModel[15] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 610
		bodyModel[16] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 611
		bodyModel[17] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 612
		bodyModel[18] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 613
		bodyModel[19] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 614
		bodyModel[20] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 615
		bodyModel[21] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 616
		bodyModel[22] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 617
		bodyModel[23] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 618
		bodyModel[24] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 619
		bodyModel[25] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 620
		bodyModel[26] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 621
		bodyModel[27] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 622
		bodyModel[28] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 623

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

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
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
		bodyModel[24].setRotationPoint(-43F, -15F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[25].setRotationPoint(-43F, -18F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 621
		bodyModel[26].setRotationPoint(-43F, -3F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[27].setRotationPoint(-43.5F, -14F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[28].setRotationPoint(-43.5F, -5F, -12F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 532
		turretModel[1] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 533
		turretModel[2] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 534
		turretModel[3] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 535
		turretModel[4] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 536
		turretModel[5] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 537
		turretModel[6] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 538
		turretModel[7] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 539
		turretModel[8] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 540
		turretModel[9] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 541
		turretModel[10] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 542
		turretModel[11] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 546
		turretModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 548
		turretModel[13] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 549
		turretModel[14] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 550
		turretModel[15] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 551
		turretModel[16] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 552
		turretModel[17] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 553
		turretModel[18] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 556
		turretModel[19] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 557
		turretModel[20] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 558
		turretModel[21] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 559
		turretModel[22] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 563
		turretModel[23] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 582
		turretModel[24] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 609
		turretModel[25] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 610
		turretModel[26] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 617
		turretModel[27] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 618
		turretModel[28] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 619
		turretModel[29] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 659
		turretModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 669
		turretModel[31] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 670
		turretModel[32] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 671
		turretModel[33] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 677
		turretModel[34] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 678
		turretModel[35] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 679
		turretModel[36] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 681
		turretModel[37] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 682
		turretModel[38] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 683
		turretModel[39] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 686
		turretModel[40] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 687
		turretModel[41] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 688
		turretModel[42] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 689
		turretModel[43] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 690
		turretModel[44] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 691
		turretModel[45] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 692
		turretModel[46] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 693
		turretModel[47] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 694
		turretModel[48] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 695
		turretModel[49] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 696
		turretModel[50] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 697
		turretModel[51] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 698
		turretModel[52] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 699
		turretModel[53] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 700
		turretModel[54] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 701
		turretModel[55] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 702
		turretModel[56] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 703
		turretModel[57] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 713
		turretModel[58] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 714
		turretModel[59] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 715
		turretModel[60] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 716
		turretModel[61] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 717
		turretModel[62] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 718
		turretModel[63] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 719
		turretModel[64] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 720
		turretModel[65] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 721
		turretModel[66] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 722
		turretModel[67] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 723
		turretModel[68] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 724
		turretModel[69] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 725
		turretModel[70] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 726
		turretModel[71] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 727
		turretModel[72] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 740
		turretModel[73] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 741
		turretModel[74] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 745
		turretModel[75] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 748
		turretModel[76] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 749
		turretModel[77] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 750
		turretModel[78] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 576
		turretModel[79] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 577
		turretModel[80] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 578
		turretModel[81] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 579
		turretModel[82] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 580
		turretModel[83] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 581
		turretModel[84] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 582
		turretModel[85] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 583
		turretModel[86] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 584
		turretModel[87] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 585
		turretModel[88] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 586
		turretModel[89] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 587
		turretModel[90] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 588
		turretModel[91] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 589
		turretModel[92] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 590
		turretModel[93] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 591
		turretModel[94] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 592
		turretModel[95] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 593
		turretModel[96] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 594

		turretModel[0].addShapeBox(-8F, -0.75F, -21.5F, 8, 2, 43, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 532
		turretModel[0].setRotationPoint(-3F, -24F, 0F);

		turretModel[1].addShapeBox(0F, -0.75F, -21.5F, 8, 2, 43, 0F,0F, 0.5F, 0.25F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F); // Box 533
		turretModel[1].setRotationPoint(-3F, -24F, 0F);

		turretModel[2].addShapeBox(-13.5F, -0.75F, -21.5F, 6, 2, 43, 0F,0F, 0.5F, -1.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -1.75F, 0F, 0F, -1.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.75F); // Box 534
		turretModel[2].setRotationPoint(-3F, -24F, 0F);

		turretModel[3].addShapeBox(-20F, -0.75F, -20F, 7, 2, 40, 0F,0F, 0.5F, -4.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -4.75F, 0F, 0F, -4.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -4.75F); // Box 535
		turretModel[3].setRotationPoint(-3F, -24F, 0F);

		turretModel[4].addShapeBox(-24.5F, -0.75F, -15.5F, 5, 2, 31, 0F,0F, 0.5F, -6.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -6.75F, 0F, 0F, -6.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -6.75F); // Box 536
		turretModel[4].setRotationPoint(-15F, -24F, 0F);

		turretModel[5].addShapeBox(7.5F, -0.75F, -20F, 7, 2, 40, 0F,-0.5F, 0.5F, -0.25F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.25F); // Box 537
		turretModel[5].setRotationPoint(-3F, -24F, 0F);

		turretModel[6].addShapeBox(14F, -0.75F, -15.5F, 6, 2, 31, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, -7.75F, 0F, 0.5F, -7.75F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, -0.5F, 0F, 0F); // Box 538
		turretModel[6].setRotationPoint(-3F, -24F, 0F);

		turretModel[7].addShapeBox(0F, -5.25F, -21.5F, 8, 4, 23, 0F,0F, 0.75F, -2.25F, 0F, 0.75F, -3.75F, 0F, 2.75F, -2F, 0F, 2.75F, -2F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 539
		turretModel[7].setRotationPoint(-3F, -24F, 0F);

		turretModel[8].addShapeBox(-8F, -5.25F, -21.5F, 8, 4, 23, 0F,-1F, 0.75F, -2.5F, 0F, 0.75F, -2.25F, 0F, 2.75F, -2F, -1F, 2.75F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 540
		turretModel[8].setRotationPoint(-3F, -24F, 0F);

		turretModel[9].addShapeBox(-13.5F, -5.25F, -21.5F, 6, 4, 23, 0F,-6F, 0.75F, -2.5F, 0.5F, 0.75F, -2.5F, 0.5F, 2.75F, -2F, -6F, 2.75F, -2F, 0F, 0F, -1.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 541
		turretModel[9].setRotationPoint(-3F, -24F, 0F);

		turretModel[10].addShapeBox(7.5F, -5.25F, -20F, 7, 4, 19, 0F,-0.5F, 0.75F, -2.25F, -4F, 0.75F, -4.5F, 0F, 0.75F, 0.5F, -0.5F, 2.75F, 0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 542
		turretModel[10].setRotationPoint(-3F, -24F, 0F);

		turretModel[11].addShapeBox(0F, -5.25F, -2.5F, 8, 4, 24, 0F,0F, 2.75F, -2F, 0F, 2.75F, -2F, 0F, 0.75F, -3.75F, 0F, 0.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, 0.25F); // Box 546
		turretModel[11].setRotationPoint(-3F, -24F, 0F);

		turretModel[12].addShapeBox(-8F, -5.25F, -2.5F, 8, 4, 24, 0F,-1F, 2.75F, -2F, 0F, 2.75F, -2F, 0F, 0.75F, -2.25F, -1F, 0.75F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 548
		turretModel[12].setRotationPoint(-3F, -24F, 0F);

		turretModel[13].addShapeBox(-13.5F, -5.25F, -2.5F, 6, 4, 24, 0F,-6F, 2.75F, -2F, 0.5F, 2.75F, -2F, 0.5F, 0.75F, -2.5F, -6F, 0.75F, -2.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.25F, 0F, 0F, -1.75F); // Box 549
		turretModel[13].setRotationPoint(-3F, -24F, 0F);

		turretModel[14].addShapeBox(-22F, -20.75F, -12F, 14, 19, 24, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		turretModel[14].setRotationPoint(-3F, -23F, 0F);

		turretModel[15].addShapeBox(-8F, -20.75F, -12F, 3, 19, 24, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 551
		turretModel[15].setRotationPoint(-3F, -23F, 0F);

		turretModel[16].addShapeBox(-5F, -20.75F, -13F, 26, 20, 26, 0F,0F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 552
		turretModel[16].setRotationPoint(-3F, -22F, 0F);

		turretModel[17].addShapeBox(12.5F, -20.75F, -13F, 5, 20, 26, 0F,0F, 0.5F, 0F, 0F, -4.75F, -3F, 0F, -4.75F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 553
		turretModel[17].setRotationPoint(5F, -22F, 0F);

		turretModel[18].addShapeBox(25F, -4F, -9F, 4, 5, 19, 0F,-0.5F, 0F, 0F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, -0.5F, 0F, 0F); // Box 556
		turretModel[18].setRotationPoint(-3F, -24F, 0F);

		turretModel[19].addShapeBox(29F, -4F, -6F, 3, 5, 13, 0F,-0.5F, 0F, -0.25F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -0.25F); // Box 557
		turretModel[19].setRotationPoint(-3F, -24F, 0F);

		turretModel[20].addShapeBox(29.5F, -3.75F, -4.5F, 2, 2, 9, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, -3.5F, 0.5F, 0.5F, -3.5F, -0.5F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F, -0.5F, -0.25F, 0F); // Box 558
		turretModel[20].setRotationPoint(-3F, -24F, 0F);

		turretModel[21].addShapeBox(7.5F, -5.25F, 0F, 7, 4, 20, 0F,-0.5F, 2.75F, 0.5F, 0F, 0.75F, 0.5F, -4F, 0.75F, -4.5F, -0.5F, 0.75F, -2.25F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.25F); // Box 559
		turretModel[21].setRotationPoint(-3F, -24F, 0F);

		turretModel[22].addShapeBox(-36F, -20.75F, -12F, 14, 19, 24, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		turretModel[22].setRotationPoint(-3F, -23F, 0F);

		turretModel[23].addShapeBox(-34F, -7F, -18F, 3, 4, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		turretModel[23].setRotationPoint(-1F, -35F, 0F);

		turretModel[24].addShapeBox(-24F, -23.75F, -5F, 7, 5, 10, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		turretModel[24].setRotationPoint(-8F, -24F, 0F);

		turretModel[25].addShapeBox(-26F, -25.75F, -5F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		turretModel[25].setRotationPoint(-8F, -24F, 0F);

		turretModel[26].addShapeBox(-4F, -22.25F, -8F, 8, 2, 16, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 617
		turretModel[26].setRotationPoint(-3F, -22F, 0F);

		turretModel[27].addShapeBox(-4F, -22.25F, -11F, 8, 2, 3, 0F,-2F, 0.5F, 0F, -2.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 618
		turretModel[27].setRotationPoint(-3F, -22F, 0F);

		turretModel[28].addShapeBox(-4F, -22.25F, 8F, 8, 2, 3, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F); // Box 619
		turretModel[28].setRotationPoint(-3F, -22F, 0F);

		turretModel[29].addShapeBox(7.5F, -2.75F, -22.5F, 7, 1, 45, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 659
		turretModel[29].setRotationPoint(-19F, -24F, 0F);

		turretModel[30].addShapeBox(7F, -8.25F, -20.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 669
		turretModel[30].setRotationPoint(-19F, -24F, -2F);
		turretModel[30].rotateAngleZ = -0.38397244F;

		turretModel[31].addShapeBox(9F, -9.25F, -19.25F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 670
		turretModel[31].setRotationPoint(-19F, -24F, -3F);
		turretModel[31].rotateAngleZ = -0.38397244F;

		turretModel[32].addShapeBox(11F, -10F, -17.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 671
		turretModel[32].setRotationPoint(-19F, -24F, -4F);
		turretModel[32].rotateAngleZ = -0.38397244F;

		turretModel[33].addShapeBox(0F, -21.25F, -16.25F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 677
		turretModel[33].setRotationPoint(-32F, -23F, 0F);
		turretModel[33].rotateAngleZ = 0.08726646F;

		turretModel[34].addShapeBox(0F, -21.25F, 15.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 678
		turretModel[34].setRotationPoint(-32F, -23F, 0F);
		turretModel[34].rotateAngleZ = 0.08726646F;

		turretModel[35].addShapeBox(21F, -17F, -5F, 9, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		turretModel[35].setRotationPoint(4F, -24F, 0F);

		turretModel[36].addShapeBox(20F, -8F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		turretModel[36].setRotationPoint(7F, -22F, -3F);

		turretModel[37].addShapeBox(19F, -6F, -5F, 9, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		turretModel[37].setRotationPoint(5F, -22F, 0F);

		turretModel[38].addShapeBox(28F, -6F, -5F, 3, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 683
		turretModel[38].setRotationPoint(5F, -22F, 0F);

		turretModel[39].addShapeBox(22F, -13.5F, -2F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		turretModel[39].setRotationPoint(3.5F, -28F, 0F);

		turretModel[40].addShapeBox(26.5F, -15.75F, -5F, 1, 3, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 687
		turretModel[40].setRotationPoint(11F, -23F, 0F);

		turretModel[41].addShapeBox(26.5F, -12.75F, -5F, 1, 3, 10, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 688
		turretModel[41].setRotationPoint(11F, -23F, 0F);

		turretModel[42].addShapeBox(26.5F, -18.75F, -4F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		turretModel[42].setRotationPoint(11F, -23F, 0F);

		turretModel[43].addShapeBox(26.5F, -18.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 690
		turretModel[43].setRotationPoint(11F, -23F, 0F);

		turretModel[44].addShapeBox(26.5F, -9.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 691
		turretModel[44].setRotationPoint(11F, -23F, 0F);

		turretModel[45].addShapeBox(26.5F, -9.75F, -4F, 1, 3, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		turretModel[45].setRotationPoint(11F, -24F, 0F);

		turretModel[46].addShapeBox(27.5F, -18.75F, -4F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 2F, 0F, 0F, 0F, 0F); // Box 693
		turretModel[46].setRotationPoint(11F, -23F, 0F);

		turretModel[47].addShapeBox(27.5F, -18.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 694
		turretModel[47].setRotationPoint(11F, -23F, 0F);

		turretModel[48].addShapeBox(27.5F, -9.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -1F); // Box 695
		turretModel[48].setRotationPoint(11F, -23F, 0F);

		turretModel[49].addShapeBox(27.5F, -9.75F, -4F, 1, 3, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 696
		turretModel[49].setRotationPoint(11F, -23F, 0F);

		turretModel[50].addShapeBox(27.5F, -12.75F, -5F, 1, 3, 5, 0F,0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1.5F, -2F, 0F, 0F, 0F, 0F); // Box 697
		turretModel[50].setRotationPoint(11F, -23F, 0F);

		turretModel[51].addShapeBox(27.5F, -12.75F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 698
		turretModel[51].setRotationPoint(11F, -23F, 0F);

		turretModel[52].addShapeBox(27.5F, -15.75F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 699
		turretModel[52].setRotationPoint(11F, -23F, 0F);

		turretModel[53].addShapeBox(27.5F, -15.75F, -5F, 1, 3, 5, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 700
		turretModel[53].setRotationPoint(11F, -23F, 0F);

		turretModel[54].addShapeBox(19.25F, -14F, -7F, 7, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 701
		turretModel[54].setRotationPoint(7F, -24F, 0F);

		turretModel[55].addShapeBox(19.25F, -15.75F, -7F, 7, 2, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		turretModel[55].setRotationPoint(7F, -24F, 0F);

		turretModel[56].addShapeBox(19.25F, -11.25F, -7F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 703
		turretModel[56].setRotationPoint(7F, -24F, 0F);

		turretModel[57].addShapeBox(22.75F, -14.5F, 6.75F, 4, 4, 1, 0F,0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, -0.25F, 0F); // Box 713
		turretModel[57].setRotationPoint(7F, -24F, 0F);

		turretModel[58].addShapeBox(22.75F, -17.5F, 6.75F, 4, 4, 1, 0F,0F, -0.5F, 0F, -1.75F, -1.25F, 0F, -1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.75F, 0F); // Box 714
		turretModel[58].setRotationPoint(7F, -24F, 0F);

		turretModel[59].addShapeBox(18.75F, -17.5F, 6.75F, 4, 4, 1, 0F,-1.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F); // Box 715
		turretModel[59].setRotationPoint(7F, -24F, 0F);

		turretModel[60].addShapeBox(18.75F, -14.5F, 6.75F, 4, 4, 1, 0F,0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -0.5F); // Box 716
		turretModel[60].setRotationPoint(7F, -24F, 0F);

		turretModel[61].addShapeBox(18.75F, -11.5F, 6.75F, 4, 4, 1, 0F,0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F, -1.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F); // Box 717
		turretModel[61].setRotationPoint(7F, -24F, 0F);

		turretModel[62].addShapeBox(22.75F, -11.5F, 6.75F, 4, 4, 1, 0F,0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -1.75F, -1.25F, 0F, -1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F); // Box 718
		turretModel[62].setRotationPoint(7F, -24F, 0F);

		turretModel[63].addShapeBox(19.25F, -15.75F, 5F, 7, 2, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[63].setRotationPoint(7F, -24F, 0F);

		turretModel[64].addShapeBox(19.25F, -11.25F, 5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 720
		turretModel[64].setRotationPoint(7F, -24F, 0F);

		turretModel[65].addShapeBox(19.25F, -14F, 5F, 7, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 721
		turretModel[65].setRotationPoint(7F, -24F, 0F);

		turretModel[66].addShapeBox(18.75F, -14.5F, -7.75F, 4, 4, 1, 0F,0.25F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F); // Box 722
		turretModel[66].setRotationPoint(7F, -24F, 0F);

		turretModel[67].addShapeBox(22.75F, -14.5F, -7.75F, 4, 4, 1, 0F,0F, -0.25F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, -0.25F, 0F); // Box 723
		turretModel[67].setRotationPoint(7F, -24F, 0F);

		turretModel[68].addShapeBox(22.75F, -17.5F, -7.75F, 4, 4, 1, 0F,0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F, -1.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -0.75F, 0F); // Box 724
		turretModel[68].setRotationPoint(7F, -24F, 0F);

		turretModel[69].addShapeBox(18.75F, -17.5F, -7.75F, 4, 4, 1, 0F,-1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1.75F, -1.25F, 0F, 0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F); // Box 725
		turretModel[69].setRotationPoint(7F, -24F, 0F);

		turretModel[70].addShapeBox(18.75F, -11.5F, -7.75F, 4, 4, 1, 0F,0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1.75F, -1.25F, 0F); // Box 726
		turretModel[70].setRotationPoint(7F, -24F, 0F);

		turretModel[71].addShapeBox(22.75F, -11.5F, -7.75F, 4, 4, 1, 0F,0F, -0.75F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F, -1.75F, -1.25F, 0F, 0F, -0.5F, 0F); // Box 727
		turretModel[71].setRotationPoint(7F, -24F, 0F);

		turretModel[72].addShapeBox(-22F, -15.75F, -13.5F, 12, 3, 27, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F); // Box 740
		turretModel[72].setRotationPoint(-3F, -24F, 0F);

		turretModel[73].addShapeBox(-16F, -18.75F, -13.5F, 5, 3, 27, 0F,0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 741
		turretModel[73].setRotationPoint(-3F, -24F, 0F);

		turretModel[74].addShapeBox(-21F, -18.75F, -13.5F, 5, 3, 27, 0F,-1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 745
		turretModel[74].setRotationPoint(-3F, -24F, 0F);

		turretModel[75].addShapeBox(-22F, -11.75F, -13F, 22, 3, 30, 0F,1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 748
		turretModel[75].setRotationPoint(-12F, -13F, -2F);

		turretModel[76].addShapeBox(-21F, -8.75F, -13.5F, 5, 3, 27, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F); // Box 749
		turretModel[76].setRotationPoint(-3F, -24F, 0F);

		turretModel[77].addShapeBox(-16F, -8.75F, -13.5F, 5, 3, 27, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 750
		turretModel[77].setRotationPoint(-3F, -24F, 0F);

		turretModel[78].addShapeBox(27.5F, -18.75F, -4F, 1, 3, 4, 0F,0F, -1.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, 2F, 0F); // Box 576
		turretModel[78].setRotationPoint(9F, -23F, 0F);

		turretModel[79].addShapeBox(27.5F, -15.75F, -5F, 1, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 577
		turretModel[79].setRotationPoint(9F, -23F, 0F);

		turretModel[80].addShapeBox(27.5F, -12.75F, -5F, 1, 3, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, -2F, 0F); // Box 578
		turretModel[80].setRotationPoint(9F, -23F, 0F);

		turretModel[81].addShapeBox(27.5F, -9.75F, -4F, 1, 3, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, 2F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 579
		turretModel[81].setRotationPoint(9F, -23F, 0F);

		turretModel[82].addShapeBox(27.5F, -9.75F, 0F, 1, 3, 4, 0F,1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, -2F); // Box 580
		turretModel[82].setRotationPoint(9F, -23F, 0F);

		turretModel[83].addShapeBox(27.5F, -12.75F, 0F, 1, 3, 5, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 581
		turretModel[83].setRotationPoint(9F, -23F, 0F);

		turretModel[84].addShapeBox(27.5F, -15.75F, 0F, 1, 3, 5, 0F,1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F); // Box 582
		turretModel[84].setRotationPoint(9F, -23F, 0F);

		turretModel[85].addShapeBox(27.5F, -18.75F, 0F, 1, 3, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, -2F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F); // Box 583
		turretModel[85].setRotationPoint(9F, -23F, 0F);

		turretModel[86].addShapeBox(21F, -17F, -2F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		turretModel[86].setRotationPoint(11F, -21F, 0F);

		turretModel[87].addShapeBox(22F, -13.5F, -2F, 9, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		turretModel[87].setRotationPoint(3F, -31F, 0F);

		turretModel[88].addShapeBox(7F, -8.25F, 20.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 586
		turretModel[88].setRotationPoint(-19F, -24F, 0.5F);
		turretModel[88].rotateAngleZ = -0.38397244F;

		turretModel[89].addShapeBox(9F, -9.25F, 21.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 587
		turretModel[89].setRotationPoint(-19F, -24F, -0.5F);
		turretModel[89].rotateAngleZ = -0.38397244F;

		turretModel[90].addShapeBox(11F, -10F, 23.25F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 588
		turretModel[90].setRotationPoint(-19F, -24F, -2F);
		turretModel[90].rotateAngleZ = -0.38397244F;

		turretModel[91].addShapeBox(-42F, -20.75F, -10F, 4, 14, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 589
		turretModel[91].setRotationPoint(-1F, -21F, 0F);

		turretModel[92].addShapeBox(0F, -26.75F, -5F, 3, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		turretModel[92].setRotationPoint(-31F, -36F, -4F);
		turretModel[92].rotateAngleZ = 0.20943951F;

		turretModel[93].addShapeBox(-26F, -25.75F, -5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		turretModel[93].setRotationPoint(-7F, -26F, 2F);

		turretModel[94].addShapeBox(-26F, -25.75F, -5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		turretModel[94].setRotationPoint(-7F, -26F, 8F);

		turretModel[95].addShapeBox(0F, -54.25F, -16.25F, 1, 33, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 593
		turretModel[95].setRotationPoint(-32F, -23F, 0F);
		turretModel[95].rotateAngleZ = 0.08726646F;

		turretModel[96].addShapeBox(0F, -54.25F, 15.75F, 1, 33, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 594
		turretModel[96].setRotationPoint(-32F, -23F, 0F);
		turretModel[96].rotateAngleZ = 0.08726646F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 728
		barrelModel[1] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 729
		barrelModel[2] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 730
		barrelModel[3] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 731
		barrelModel[4] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 733
		barrelModel[5] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 734
		barrelModel[6] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 735
		barrelModel[7] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 736
		barrelModel[8] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 737
		barrelModel[9] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 738
		barrelModel[10] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 739
		barrelModel[11] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 751
		barrelModel[12] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 752
		barrelModel[13] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 753
		barrelModel[14] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 754
		barrelModel[15] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 755
		barrelModel[16] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 756
		barrelModel[17] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 757
		barrelModel[18] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 758
		barrelModel[19] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 759
		barrelModel[20] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 760
		barrelModel[21] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 761
		barrelModel[22] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 762
		barrelModel[23] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 763
		barrelModel[24] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 794
		barrelModel[25] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 795
		barrelModel[26] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 797
		barrelModel[27] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 798
		barrelModel[28] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 799
		barrelModel[29] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 800
		barrelModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 801
		barrelModel[31] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 802
		barrelModel[32] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 803
		barrelModel[33] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 804
		barrelModel[34] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 805
		barrelModel[35] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 806
		barrelModel[36] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 807
		barrelModel[37] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 808
		barrelModel[38] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 809
		barrelModel[39] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 810
		barrelModel[40] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 811
		barrelModel[41] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 812
		barrelModel[42] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 836
		barrelModel[43] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 837
		barrelModel[44] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 838
		barrelModel[45] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 839
		barrelModel[46] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 840
		barrelModel[47] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 841
		barrelModel[48] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 842
		barrelModel[49] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 843
		barrelModel[50] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 844
		barrelModel[51] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 845
		barrelModel[52] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 846
		barrelModel[53] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 847
		barrelModel[54] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 848
		barrelModel[55] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 849
		barrelModel[56] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 850
		barrelModel[57] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 851
		barrelModel[58] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 852
		barrelModel[59] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 853
		barrelModel[60] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 854
		barrelModel[61] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 855
		barrelModel[62] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 856
		barrelModel[63] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 857
		barrelModel[64] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 858
		barrelModel[65] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 859
		barrelModel[66] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 860
		barrelModel[67] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 861
		barrelModel[68] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 862
		barrelModel[69] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 863
		barrelModel[70] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 864
		barrelModel[71] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 865
		barrelModel[72] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 866
		barrelModel[73] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 867
		barrelModel[74] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 868
		barrelModel[75] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 869
		barrelModel[76] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 870
		barrelModel[77] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 871
		barrelModel[78] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 872
		barrelModel[79] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 873
		barrelModel[80] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 874
		barrelModel[81] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 875
		barrelModel[82] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 876
		barrelModel[83] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 624
		barrelModel[84] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 625
		barrelModel[85] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 626
		barrelModel[86] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 627

		barrelModel[0].addBox(-4F, -2F, -0.75F, 8, 4, 11, 0F); // Box 728
		barrelModel[0].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[1].addShapeBox(-4F, -5F, -0.75F, 8, 3, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		barrelModel[1].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[2].addShapeBox(-4F, 2F, -0.75F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Box 730
		barrelModel[2].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[3].addShapeBox(-12F, -2F, -0.75F, 8, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 731
		barrelModel[3].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[4].addShapeBox(-12F, 2F, -0.75F, 8, 3, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -3.5F, -4F); // Box 733
		barrelModel[4].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[5].addShapeBox(-12F, -5F, 1.25F, 8, 3, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 734
		barrelModel[5].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[6].addShapeBox(-8F, -5F, -0.75F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		barrelModel[6].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[7].addShapeBox(4F, -2F, -0.75F, 6, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 736
		barrelModel[7].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[8].addShapeBox(4F, -4F, -0.75F, 6, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 737
		barrelModel[8].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[9].addShapeBox(4F, 2F, -0.75F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, -4F, 0F, -0.5F, -3.5F); // Box 738
		barrelModel[9].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[10].addShapeBox(10F, -4.5F, 0.25F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 739
		barrelModel[10].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[11].addShapeBox(-11F, 3.5F, -1F, 7, 3, 11, 0F,0.75F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, -3.5F, 0.75F, 3F, -4F, 0F, -3.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -3.5F, 0F, -3.5F, -4F); // Box 751
		barrelModel[11].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[12].addShapeBox(-14F, -1.5F, 1.25F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		barrelModel[12].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[13].addShapeBox(-14F, -4.5F, 1.25F, 2, 3, 5, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		barrelModel[13].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[14].addShapeBox(-13.5F, 1.5F, 1.25F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2.5F, 0F, 0F); // Box 754
		barrelModel[14].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[15].addShapeBox(-4F, -8.5F, 3.5F, 6, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, -3.5F, 0F, 5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 755
		barrelModel[15].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[16].addShapeBox(-4F, -8.5F, 1.5F, 6, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		barrelModel[16].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[17].addShapeBox(2F, -8.5F, 1.5F, 5, 4, 2, 0F,0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 757
		barrelModel[17].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[18].addShapeBox(-9F, -8.5F, 1.5F, 5, 4, 2, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 758
		barrelModel[18].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[19].addShapeBox(-12F, -6F, 1.5F, 3, 1, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F); // Box 759
		barrelModel[19].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[20].addShapeBox(11F, -2.5F, 1.25F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 760
		barrelModel[20].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[21].addShapeBox(11F, -3.5F, 1.25F, 9, 2, 5, 0F,1F, 1F, -1.25F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 1F, 1F, -1.25F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F); // Box 761
		barrelModel[21].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[22].addShapeBox(11F, 0.5F, 1.25F, 9, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, -0.5F, -1.25F, 0F, -1.9F, -2F, 0F, -1.9F, -2F, 2F, -0.5F, -1.25F); // Box 762
		barrelModel[22].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[23].addShapeBox(18F, -1.5F, 2.75F, 49, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 763
		barrelModel[23].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[24].addShapeBox(61F, -1.5F, 2.75F, 4, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 794
		barrelModel[24].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[25].addShapeBox(66F, -1.5F, 2.75F, 2, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 795
		barrelModel[25].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[26].addShapeBox(74F, -1.5F, 2.7F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 797
		barrelModel[26].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[27].addShapeBox(66F, -2F, 3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 798
		barrelModel[27].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[28].addShapeBox(66F, 0F, 3.25F, 10, 1, 1, 0F,0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 799
		barrelModel[28].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[29].addShapeBox(66F, -1F, 4.3F, 10, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 800
		barrelModel[29].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[30].addShapeBox(66F, -1F, 2.2F, 10, 1, 1, 0F,0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 801
		barrelModel[30].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[31].addShapeBox(74F, -1.5F, 3.7F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 802
		barrelModel[31].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[32].addShapeBox(74F, -1.6F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 803
		barrelModel[32].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[33].addShapeBox(74F, -0.15F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 804
		barrelModel[33].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[34].addShapeBox(70.5F, -1.5F, 3.7F, 2, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 805
		barrelModel[34].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[35].addShapeBox(70.5F, -1.6F, 2.6F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 806
		barrelModel[35].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[36].addShapeBox(70.5F, -1.5F, 2.7F, 2, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 807
		barrelModel[36].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[37].addShapeBox(70.5F, -0.15F, 2.6F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 808
		barrelModel[37].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[38].addShapeBox(68F, -1.5F, 3.7F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 809
		barrelModel[38].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[39].addShapeBox(68F, -1.6F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 810
		barrelModel[39].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[40].addShapeBox(68F, -1.5F, 2.7F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 811
		barrelModel[40].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[41].addShapeBox(68F, -0.15F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 812
		barrelModel[41].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[42].addShapeBox(-4F, -8.5F, 3.5F, 6, 4, 3, 0F,5F, -2.5F, 0F, 5F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		barrelModel[42].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[43].addShapeBox(2F, -8.5F, 6.5F, 5, 4, 2, 0F,0F, -0.5F, 0F, 0F, -3.5F, 3F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		barrelModel[43].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[44].addShapeBox(-4F, -8.5F, 6.5F, 6, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		barrelModel[44].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[45].addShapeBox(-9F, -8.5F, 6.5F, 5, 4, 2, 0F,0F, -2.5F, 3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		barrelModel[45].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[46].addShapeBox(-12F, -6F, 3.5F, 3, 1, 5, 0F,0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 840
		barrelModel[46].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[47].addShapeBox(-14F, -4.5F, 3.5F, 2, 3, 5, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		barrelModel[47].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[48].addShapeBox(-14F, -1.5F, 3.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 842
		barrelModel[48].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[49].addShapeBox(-13.5F, 1.5F, 3.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2.5F, 0F, 0F); // Box 843
		barrelModel[49].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[50].addShapeBox(-11F, 3.5F, 0F, 7, 3, 11, 0F,0.75F, 3F, -4F, 1F, 0F, -3.5F, 1F, 0F, 0F, 0.75F, 3F, 0F, 0F, -3.5F, -4F, -0.5F, -0.75F, -3.5F, -0.5F, -0.75F, 0F, 0F, -3.5F, 0F); // Box 844
		barrelModel[50].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[51].addShapeBox(-12F, 2F, -0.5F, 8, 3, 11, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3.5F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -3.5F, 0F); // Box 845
		barrelModel[51].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[52].addShapeBox(-12F, -2F, -0.5F, 8, 4, 11, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 846
		barrelModel[52].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[53].addShapeBox(-12F, -5F, -0.5F, 8, 3, 9, 0F,0F, -0.5F, -4F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		barrelModel[53].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[54].addShapeBox(-4F, -5F, -0.5F, 8, 3, 11, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		barrelModel[54].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[55].addBox(-4F, -2F, -0.5F, 8, 4, 11, 0F); // Box 849
		barrelModel[55].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[56].addShapeBox(-4F, 2F, -0.5F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 850
		barrelModel[56].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[57].addShapeBox(4F, 2F, -0.5F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, -5F, -0.5F, -4F, -5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 851
		barrelModel[57].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[58].addShapeBox(4F, -2F, -0.5F, 6, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		barrelModel[58].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[59].addShapeBox(4F, -4F, -0.5F, 6, 2, 11, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		barrelModel[59].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[60].addShapeBox(10F, -4.5F, 3.5F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 854
		barrelModel[60].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[61].addShapeBox(11F, -2.5F, 3.5F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 855
		barrelModel[61].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[62].addShapeBox(11F, -3.5F, 3.5F, 9, 2, 5, 0F,1F, 1F, -1.25F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 1F, 1F, -1.25F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F); // Box 856
		barrelModel[62].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[63].addShapeBox(11F, 0.5F, 3.5F, 9, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, -0.5F, -1.25F, 0F, -1.9F, -2F, 0F, -1.9F, -2F, 2F, -0.5F, -1.25F); // Box 857
		barrelModel[63].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[64].addShapeBox(66F, -1.5F, 3F, 2, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 858
		barrelModel[64].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[65].addShapeBox(61F, -1.5F, 3F, 4, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 859
		barrelModel[65].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[66].addShapeBox(18F, -1.5F, 3F, 49, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 860
		barrelModel[66].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[67].addShapeBox(66F, -1F, 4.55F, 10, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 861
		barrelModel[67].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[68].addShapeBox(66F, -2F, 3.5F, 10, 1, 1, 0F,0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 862
		barrelModel[68].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[69].addShapeBox(68F, -1.5F, 3.95F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 863
		barrelModel[69].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[70].addShapeBox(68F, -1.6F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 864
		barrelModel[70].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[71].addShapeBox(68F, -1.5F, 2.95F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 865
		barrelModel[71].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[72].addShapeBox(70.5F, -1.6F, 2.85F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 866
		barrelModel[72].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[73].addShapeBox(70.5F, -1.5F, 3.95F, 2, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 867
		barrelModel[73].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[74].addShapeBox(70.5F, -1.5F, 2.95F, 2, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 868
		barrelModel[74].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[75].addShapeBox(74F, -1.6F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 869
		barrelModel[75].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[76].addShapeBox(74F, -1.5F, 2.95F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 870
		barrelModel[76].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[77].addShapeBox(74F, -1.5F, 3.95F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 871
		barrelModel[77].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[78].addShapeBox(70.5F, -0.15F, 2.85F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 872
		barrelModel[78].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[79].addShapeBox(68F, -0.15F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 873
		barrelModel[79].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[80].addShapeBox(74F, -0.15F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 874
		barrelModel[80].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[81].addShapeBox(66F, 0F, 3.5F, 10, 1, 1, 0F,0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 875
		barrelModel[81].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[82].addShapeBox(66F, -1F, 2.45F, 10, 1, 1, 0F,0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 876
		barrelModel[82].setRotationPoint(-18F, -36.25F, -20F);

		barrelModel[83].addBox(-4F, -2F, 8.25F, 46, 3, 3, 0F); // Box 624
		barrelModel[83].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[84].addBox(-4F, 4F, 8.25F, 46, 3, 3, 0F); // Box 625
		barrelModel[84].setRotationPoint(-18F, -36.25F, 12F);

		barrelModel[85].addBox(-4F, 4F, -2F, 46, 3, 3, 0F); // Box 626
		barrelModel[85].setRotationPoint(-18F, -36.25F, -22F);

		barrelModel[86].addBox(-4F, -2F, -2F, 46, 3, 3, 0F); // Box 627
		barrelModel[86].setRotationPoint(-18F, -36.25F, -22F);
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
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 126
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 127
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 128
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 132
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 133
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 134
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 135
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 136
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 137
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 138
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 139
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 140
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
		leftTrackWheelModels[0].setRotationPoint(9.75F, 3F, 24F);

		leftTrackWheelModels[1].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[1].setRotationPoint(9.75F, 3F, 24F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 116
		leftTrackWheelModels[2].setRotationPoint(9.75F, 3F, 24F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 117
		leftTrackWheelModels[3].setRotationPoint(26F, 3F, 24F);

		leftTrackWheelModels[4].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 118
		leftTrackWheelModels[4].setRotationPoint(26F, 3F, 24F);

		leftTrackWheelModels[5].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftTrackWheelModels[5].setRotationPoint(26F, 3F, 24F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 120
		leftTrackWheelModels[6].setRotationPoint(44.25F, 3F, 24F);

		leftTrackWheelModels[7].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 121
		leftTrackWheelModels[7].setRotationPoint(44.25F, 3F, 24F);

		leftTrackWheelModels[8].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftTrackWheelModels[8].setRotationPoint(44.25F, 3F, 24F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 123
		leftTrackWheelModels[9].setRotationPoint(62F, 3F, 24F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 124
		leftTrackWheelModels[10].setRotationPoint(62F, 3F, 24F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftTrackWheelModels[11].setRotationPoint(62F, 3F, 24F);

		leftTrackWheelModels[12].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 126
		leftTrackWheelModels[12].setRotationPoint(-8F, 3F, 24F);

		leftTrackWheelModels[13].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[13].setRotationPoint(-8F, 3F, 24F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 128
		leftTrackWheelModels[14].setRotationPoint(-8F, 3F, 24F);

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
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 141
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 142
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 143
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 144
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 145
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 146
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 147
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 148
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 149
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 150
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 151
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 152
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 153
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 154
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 155
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 156
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 157
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 158
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 162
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 163
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 164
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 213
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 214
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 215
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 216
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 217
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 218
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 219
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 220
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 221
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 572
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 573
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 574

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
		rightTrackWheelModels[6].setRotationPoint(44.25F, 3F, -31F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 148
		rightTrackWheelModels[7].setRotationPoint(44.25F, 3F, -31F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 149
		rightTrackWheelModels[8].setRotationPoint(44.25F, 3F, -31F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 150
		rightTrackWheelModels[9].setRotationPoint(26F, 3F, -31F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 151
		rightTrackWheelModels[10].setRotationPoint(26F, 3F, -31F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightTrackWheelModels[11].setRotationPoint(26F, 3F, -31F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackWheelModels[12].setRotationPoint(9.75F, 3F, -31F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 154
		rightTrackWheelModels[13].setRotationPoint(9.75F, 3F, -31F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 155
		rightTrackWheelModels[14].setRotationPoint(9.75F, 3F, -31F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, 2F, 0F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightTrackWheelModels[15].setRotationPoint(-8F, 3F, -31F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, 0F, 12, 4, 7, 0F); // Box 157
		rightTrackWheelModels[16].setRotationPoint(-8F, 3F, -31F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, -6F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackWheelModels[17].setRotationPoint(-8F, 3F, -31F);

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
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 168
		leftTrackModel[1] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 169
		leftTrackModel[2] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 170
		leftTrackModel[3] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 171
		leftTrackModel[4] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 172
		leftTrackModel[5] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 173
		leftTrackModel[6] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 174
		leftTrackModel[7] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 175
		leftTrackModel[8] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 179
		leftTrackModel[9] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 181
		leftTrackModel[10] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 183
		leftTrackModel[11] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 184
		leftTrackModel[12] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 185
		leftTrackModel[13] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 186

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
		rightTrackModel[0] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 187
		rightTrackModel[1] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 188
		rightTrackModel[2] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 189
		rightTrackModel[3] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 190
		rightTrackModel[4] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 191
		rightTrackModel[5] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 192
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 193
		rightTrackModel[7] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 194
		rightTrackModel[8] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 195
		rightTrackModel[9] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 196
		rightTrackModel[10] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 197
		rightTrackModel[11] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 198
		rightTrackModel[12] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 199
		rightTrackModel[13] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 200

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