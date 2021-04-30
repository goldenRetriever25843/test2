//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.CroneGuy;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM551A1Sheridan extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelM551A1Sheridan()
	{

// Body
		bodyModel = new ModelRendererTurbo[52];
		bodyModel[0] = new ModelRendererTurbo(this,  248,  66, textureX, textureY); // Box1
		bodyModel[1] = new ModelRendererTurbo(this,  275,  2, textureX, textureY); // Box_7
		bodyModel[2] = new ModelRendererTurbo(this,  382,  409, textureX, textureY); // Box_18
		bodyModel[3] = new ModelRendererTurbo(this,  388,  230, textureX, textureY); // Box_19
		bodyModel[4] = new ModelRendererTurbo(this,  376,  167, textureX, textureY); // Box_20
		bodyModel[5] = new ModelRendererTurbo(this,  122,  355, textureX, textureY); // Box_1
		bodyModel[6] = new ModelRendererTurbo(this,  123,  383, textureX, textureY); // Box_2
		bodyModel[7] = new ModelRendererTurbo(this,  286,  285, textureX, textureY); // Box_3
		bodyModel[8] = new ModelRendererTurbo(this,  286,  234, textureX, textureY); // Box_4
		bodyModel[9] = new ModelRendererTurbo(this,  123,  370, textureX, textureY); // Box_0
		bodyModel[10] = new ModelRendererTurbo(this,  120,  255, textureX, textureY); // Box_1
		bodyModel[11] = new ModelRendererTurbo(this,  123,  296, textureX, textureY); // Box_15
		bodyModel[12] = new ModelRendererTurbo(this,  123,  269, textureX, textureY); // Box_16
		bodyModel[13] = new ModelRendererTurbo(this,  222,  333, textureX, textureY); // Box_24
		bodyModel[14] = new ModelRendererTurbo(this,  423,  354, textureX, textureY); // Box_6
		bodyModel[15] = new ModelRendererTurbo(this,  391,  295, textureX, textureY); // Box_7
		bodyModel[16] = new ModelRendererTurbo(this,  281,  179, textureX, textureY); // Box_0
		bodyModel[17] = new ModelRendererTurbo(this,  149,  262, textureX, textureY); // Box_0
		bodyModel[18] = new ModelRendererTurbo(this,  149,  276, textureX, textureY); // Box_1
		bodyModel[19] = new ModelRendererTurbo(this,  210,  168, textureX, textureY); // Box_3
		bodyModel[20] = new ModelRendererTurbo(this,  171,  201, textureX, textureY); // Box_4
		bodyModel[21] = new ModelRendererTurbo(this,  174,  190, textureX, textureY); // Box_5
		bodyModel[22] = new ModelRendererTurbo(this,  173,  179, textureX, textureY); // Box_10
		bodyModel[23] = new ModelRendererTurbo(this,  173,  168, textureX, textureY); // Box_11
		bodyModel[24] = new ModelRendererTurbo(this,  58,  115, textureX, textureY); // Box_1
		bodyModel[25] = new ModelRendererTurbo(this,  51,  17, textureX, textureY); // Box_2
		bodyModel[26] = new ModelRendererTurbo(this,  58,  124, textureX, textureY); // Box_3
		bodyModel[27] = new ModelRendererTurbo(this,  55,  49, textureX, textureY); // Box_4
		bodyModel[28] = new ModelRendererTurbo(this,  55,  79, textureX, textureY); // Box_5
		bodyModel[29] = new ModelRendererTurbo(this,  52,  29, textureX, textureY); // Box_6
		bodyModel[30] = new ModelRendererTurbo(this,  55,  85, textureX, textureY); // Box_7
		bodyModel[31] = new ModelRendererTurbo(this,  55,  92, textureX, textureY); // Box_9
		bodyModel[32] = new ModelRendererTurbo(this,  58,  107, textureX, textureY); // Box_10
		bodyModel[33] = new ModelRendererTurbo(this,  51,  5, textureX, textureY); // Box_11
		bodyModel[34] = new ModelRendererTurbo(this,  58,  97, textureX, textureY); // Box_12
		bodyModel[35] = new ModelRendererTurbo(this,  52,  39, textureX, textureY); // Box_13
		bodyModel[36] = new ModelRendererTurbo(this,  55,  73, textureX, textureY); // Box_14
		bodyModel[37] = new ModelRendererTurbo(this,  55,  67, textureX, textureY); // Box_15
		bodyModel[38] = new ModelRendererTurbo(this,  55,  61, textureX, textureY); // Box_16
		bodyModel[39] = new ModelRendererTurbo(this,  55,  55, textureX, textureY); // Box_17
		bodyModel[40] = new ModelRendererTurbo(this,  123,  478, textureX, textureY); // Box_2
		bodyModel[41] = new ModelRendererTurbo(this,  124,  420, textureX, textureY); // Box_3
		bodyModel[42] = new ModelRendererTurbo(this,  5,  168, textureX, textureY); // Box_9
		bodyModel[43] = new ModelRendererTurbo(this,  451,  386, textureX, textureY); // Box_10
		bodyModel[44] = new ModelRendererTurbo(this,  386,  384, textureX, textureY); // Box_11
		bodyModel[45] = new ModelRendererTurbo(this,  153,  310, textureX, textureY); // Box_0
		bodyModel[46] = new ModelRendererTurbo(this,  155,  460, textureX, textureY); // Box_1
		bodyModel[47] = new ModelRendererTurbo(this,  155,  436, textureX, textureY); // Box_2
		bodyModel[48] = new ModelRendererTurbo(this,  152,  312, textureX, textureY); // Box_3
		bodyModel[49] = new ModelRendererTurbo(this,  152,  305, textureX, textureY); // Box_4
		bodyModel[50] = new ModelRendererTurbo(this,  152,  298, textureX, textureY); // Box_5
		bodyModel[51] = new ModelRendererTurbo(this,  151,  291, textureX, textureY); // Box_6

		bodyModel[0].addBox(0F, 0F, 0F, 95, 12, 36, 0F); // Box1
		bodyModel[0].setRotationPoint(-51F, -8F, -18F);

		bodyModel[1].addBox(0F, 0F, 0F, 68, 9, 50, 0F); // Box_7
		bodyModel[1].setRotationPoint(-46F, -17F, -25F);

		bodyModel[2].addBox(0F, 0F, 0F, 14, 2, 50, 0F); // Box_18
		bodyModel[2].setRotationPoint(38F, -10F, -25F);

		bodyModel[3].addBox(0F, 0F, 0F, 11, 9, 50, 0F); // Box_19
		bodyModel[3].setRotationPoint(-57F, -17F, -25F);

		bodyModel[4].addBox(0F, 0F, 0F, 16, 9, 50, 0F); // Box_20
		bodyModel[4].setRotationPoint(22F, -17F, -25F);

		bodyModel[5].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box_1
		bodyModel[5].setRotationPoint(47F, -4F, 19F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box_2
		bodyModel[6].setRotationPoint(47F, -4F, -24F);

		bodyModel[7].addBox(0F, 0F, 0F, 5, 10, 36, 0F); // Box_3
		bodyModel[7].setRotationPoint(47F, -8F, -18F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 12, 36, 0F); // Box_4
		bodyModel[8].setRotationPoint(44F, -8F, -18F);

		bodyModel[9].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box_0
		bodyModel[9].setRotationPoint(-53F, -4F, 19F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box_1
		bodyModel[10].setRotationPoint(-53F, -4F, -24F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box_15
		bodyModel[11].setRotationPoint(51F, -8F, 18F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box_16
		bodyModel[12].setRotationPoint(51F, -8F, -25F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 3, 16, 0F); // Box_24
		bodyModel[13].setRotationPoint(29F, -15.5F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 1, 20, 0F); // Box_6
		bodyModel[14].setRotationPoint(38F, -11F, -10F);
		bodyModel[14].rotateAngleZ = 0.15707963F;

		bodyModel[15].addBox(0F, 0F, 0F, 9, 1, 50, 0F); // Box_7
		bodyModel[15].setRotationPoint(30F, -14F, -25F);
		bodyModel[15].rotateAngleZ = 0.34906585F;

		bodyModel[16].addBox(0F, 0F, 0F, 6, 12, 36, 0F); // Box_0
		bodyModel[16].setRotationPoint(-57F, -8F, -18F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box_0
		bodyModel[17].setRotationPoint(-49F, -17F, 16F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box_1
		bodyModel[18].setRotationPoint(-49F, -17F, -19F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 4, 20, 0F); // Box_3
		bodyModel[19].setRotationPoint(24F, -17F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box_4
		bodyModel[20].setRotationPoint(27F, -18.5F, -2.5F);

		bodyModel[21].addBox(0F, 0F, -2F, 1, 2, 4, 0F); // Box_5
		bodyModel[21].setRotationPoint(32.9F, -17F, 0F);

		bodyModel[22].addBox(0F, 0F, -2F, 1, 2, 4, 0F); // Box_10
		bodyModel[22].setRotationPoint(31.5F, -17F, -4F);
		bodyModel[22].rotateAngleY = -0.78539816F;

		bodyModel[23].addBox(0F, 0F, -2F, 1, 2, 4, 0F); // Box_11
		bodyModel[23].setRotationPoint(31.5F, -17F, 4F);
		bodyModel[23].rotateAngleY = 0.78539816F;

		bodyModel[24].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box_1
		bodyModel[24].setRotationPoint(31F, -17F, -23F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box_2
		bodyModel[25].setRotationPoint(29F, -16F, -22F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box_3
		bodyModel[26].setRotationPoint(31F, -17F, -17F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_4
		bodyModel[27].setRotationPoint(28F, -17F, -23F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_5
		bodyModel[28].setRotationPoint(28F, -17F, -17F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box_6
		bodyModel[29].setRotationPoint(31F, -17F, -22F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_7
		bodyModel[30].setRotationPoint(25.3F, -15.5F, -23F);
		bodyModel[30].rotateAngleZ = -0.50614548F;

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_9
		bodyModel[31].setRotationPoint(25.3F, -15.5F, -17F);
		bodyModel[31].rotateAngleZ = -0.50614548F;

		bodyModel[32].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box_10
		bodyModel[32].setRotationPoint(31F, -17F, 22F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box_11
		bodyModel[33].setRotationPoint(29F, -16F, 17F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box_12
		bodyModel[34].setRotationPoint(31F, -17F, 16F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box_13
		bodyModel[35].setRotationPoint(31F, -17F, 17F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_14
		bodyModel[36].setRotationPoint(25.3F, -15.5F, 16F);
		bodyModel[36].rotateAngleZ = -0.50614548F;

		bodyModel[37].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_15
		bodyModel[37].setRotationPoint(28F, -17F, 16F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_16
		bodyModel[38].setRotationPoint(28F, -17F, 22F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box_17
		bodyModel[39].setRotationPoint(25.3F, -15.5F, 22F);
		bodyModel[39].rotateAngleZ = -0.50614548F;

		bodyModel[40].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box_2
		bodyModel[40].setRotationPoint(49F, -3F, -19F);
		bodyModel[40].rotateAngleZ = 0.43633231F;

		bodyModel[41].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box_3
		bodyModel[41].setRotationPoint(49F, -3F, 13F);
		bodyModel[41].rotateAngleZ = 0.43633231F;

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 50, 0F); // Box_9
		bodyModel[42].setRotationPoint(47.5F, -9.4F, -25F);
		bodyModel[42].rotateAngleZ = 0.15707963F;

		bodyModel[43].addBox(0F, 0F, 0F, 10, 1, 15, 0F); // Box_10
		bodyModel[43].setRotationPoint(38F, -11F, -25F);
		bodyModel[43].rotateAngleZ = 0.16580628F;

		bodyModel[44].addBox(0F, 0F, 0F, 10, 1, 15, 0F); // Box_11
		bodyModel[44].setRotationPoint(38F, -11F, 10F);
		bodyModel[44].rotateAngleZ = 0.16580628F;

		bodyModel[45].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // Box_0
		bodyModel[45].setRotationPoint(-41F, -17.4F, 0F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 1, 38, 0F); // Box_1
		bodyModel[46].setRotationPoint(-25F, -17.6F, -19F);

		bodyModel[47].addBox(0F, 0F, 0F, 19, 1, 11, 0F); // Box_2
		bodyModel[47].setRotationPoint(-45F, -17.4F, -12F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box_3
		bodyModel[48].setRotationPoint(-40F, -17.7F, 11F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box_4
		bodyModel[49].setRotationPoint(-29F, -17.7F, 11F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box_5
		bodyModel[50].setRotationPoint(-29F, -17.7F, -13F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box_6
		bodyModel[51].setRotationPoint(-44F, -17.7F, -13F);



// Turret
		turretModel = new ModelRendererTurbo[59];
		turretModel[0] = new ModelRendererTurbo(this,  65,  229, textureX, textureY); // tur
		turretModel[1] = new ModelRendererTurbo(this,  306,  421, textureX, textureY); // tur
		turretModel[2] = new ModelRendererTurbo(this,  298,  377, textureX, textureY); // tur
		turretModel[3] = new ModelRendererTurbo(this,  204,  74, textureX, textureY); // tur
		turretModel[4] = new ModelRendererTurbo(this,  211,  133, textureX, textureY); // tur
		turretModel[5] = new ModelRendererTurbo(this,  207,  103, textureX, textureY); // tur
		turretModel[6] = new ModelRendererTurbo(this,  268,  11, textureX, textureY); // tur
		turretModel[7] = new ModelRendererTurbo(this,  166,  231, textureX, textureY); // tur
		turretModel[8] = new ModelRendererTurbo(this,  218,  304, textureX, textureY); // tur
		turretModel[9] = new ModelRendererTurbo(this,  211,  10, textureX, textureY); // tur
		turretModel[10] = new ModelRendererTurbo(this,  212,  42, textureX, textureY); // tur
		turretModel[11] = new ModelRendererTurbo(this,  168,  270, textureX, textureY); // tur
		turretModel[12] = new ModelRendererTurbo(this,  219,  278, textureX, textureY); // tur
		turretModel[13] = new ModelRendererTurbo(this,  290,  138, textureX, textureY); // tur
		turretModel[14] = new ModelRendererTurbo(this,  250,  203, textureX, textureY); // tur
		turretModel[15] = new ModelRendererTurbo(this,  119,  247, textureX, textureY); // tur
		turretModel[16] = new ModelRendererTurbo(this,  284,  338, textureX, textureY); // tur
		turretModel[17] = new ModelRendererTurbo(this,  216,  357, textureX, textureY); // tur
		turretModel[18] = new ModelRendererTurbo(this,  117,  152, textureX, textureY); // tur
		turretModel[19] = new ModelRendererTurbo(this,  116,  144, textureX, textureY); // tur
		turretModel[20] = new ModelRendererTurbo(this,  114,  137, textureX, textureY); // tur
		turretModel[21] = new ModelRendererTurbo(this,  113,  86, textureX, textureY); // tur
		turretModel[22] = new ModelRendererTurbo(this,  115,  130, textureX, textureY); // tur
		turretModel[23] = new ModelRendererTurbo(this,  113,  67, textureX, textureY); // tur
		turretModel[24] = new ModelRendererTurbo(this,  114,  59, textureX, textureY); // tur
		turretModel[25] = new ModelRendererTurbo(this,  159,  55, textureX, textureY); // tur
		turretModel[26] = new ModelRendererTurbo(this,  160,  91, textureX, textureY); // tur
		turretModel[27] = new ModelRendererTurbo(this,  157,  119, textureX, textureY); // tur
		turretModel[28] = new ModelRendererTurbo(this,  111,  94, textureX, textureY); // tur
		turretModel[29] = new ModelRendererTurbo(this,  158,  60, textureX, textureY); // tur
		turretModel[30] = new ModelRendererTurbo(this,  111,  112, textureX, textureY); // tur
		turretModel[31] = new ModelRendererTurbo(this,  158,  142, textureX, textureY); // tur
		turretModel[32] = new ModelRendererTurbo(this,  87,  44, textureX, textureY); // tur
		turretModel[33] = new ModelRendererTurbo(this,  88,  34, textureX, textureY); // tur
		turretModel[34] = new ModelRendererTurbo(this,  86,  121, textureX, textureY); // tur
		turretModel[35] = new ModelRendererTurbo(this,  86,  75, textureX, textureY); // tur
		turretModel[36] = new ModelRendererTurbo(this,  87,  65, textureX, textureY); // tur
		turretModel[37] = new ModelRendererTurbo(this,  86,  88, textureX, textureY); // tur
		turretModel[38] = new ModelRendererTurbo(this,  87,  19, textureX, textureY); // tur
		turretModel[39] = new ModelRendererTurbo(this,  87,  5, textureX, textureY); // tur
		turretModel[40] = new ModelRendererTurbo(this,  158,  65, textureX, textureY); // tur
		turretModel[41] = new ModelRendererTurbo(this,  158,  75, textureX, textureY); // tur
		turretModel[42] = new ModelRendererTurbo(this,  158,  50, textureX, textureY); // tur
		turretModel[43] = new ModelRendererTurbo(this,  159,  80, textureX, textureY); // tur
		turretModel[44] = new ModelRendererTurbo(this,  274,  347, textureX, textureY); // tur
		turretModel[45] = new ModelRendererTurbo(this,  273,  294, textureX, textureY); // tur
		turretModel[46] = new ModelRendererTurbo(this,  274,  325, textureX, textureY); // tur
		turretModel[47] = new ModelRendererTurbo(this,  171,  420, textureX, textureY); // tur
		turretModel[48] = new ModelRendererTurbo(this,  152,  379, textureX, textureY); // tur
		turretModel[49] = new ModelRendererTurbo(this,  194,  385, textureX, textureY); // tur
		turretModel[50] = new ModelRendererTurbo(this,  168,  407, textureX, textureY); // tur
		turretModel[51] = new ModelRendererTurbo(this,  151,  356, textureX, textureY); // tur
		turretModel[52] = new ModelRendererTurbo(this,  154,  332, textureX, textureY); // tur
		turretModel[53] = new ModelRendererTurbo(this,  65,  242, textureX, textureY); // tur
		turretModel[54] = new ModelRendererTurbo(this,  65,  255, textureX, textureY); // tur
		turretModel[55] = new ModelRendererTurbo(this,  213,  241, textureX, textureY); // tur
		turretModel[56] = new ModelRendererTurbo(this,  253,  229, textureX, textureY); // tur
		turretModel[57] = new ModelRendererTurbo(this,  201,  204, textureX, textureY); // tur
		turretModel[58] = new ModelRendererTurbo(this,  249,  80, textureX, textureY); // tur

		turretModel[0].addBox(-18F, -31F, -11F, 15, 2, 5, 0F); // tur
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(-10F, -29F, -23F, 21, 8, 5, 0F); // tur
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleY = -1.57079633F;

		turretModel[2].addBox(12F, -29F, -10F, 12, 11, 20, 0F); // tur
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(-18F, -29F, 10F, 5, 12, 12, 0F); // tur
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(-13F, -29F, 10F, 8, 12, 15, 0F); // tur
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addBox(-5F, -29F, 10F, 10, 12, 15, 0F); // tur
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addBox(5F, -29F, 10F, 7, 12, 15, 0F); // tur
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addBox(12F, -29F, 10F, 12, 11, 2, 0F); // tur
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addBox(12F, -28F, 12F, 12, 10, 10, 0F); // tur
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addBox(-3F, -29F, -25F, 8, 12, 15, 0F); // tur
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addBox(5F, -29F, -25F, 7, 12, 15, 0F); // tur
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addBox(12F, -29F, -12F, 12, 11, 2, 0F); // tur
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addBox(12F, -28F, -22F, 12, 10, 10, 0F); // tur
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addBox(-13F, -29F, -25F, 5, 12, 15, 0F); // tur
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addBox(-23F, -29F, -17F, 5, 8, 6, 0F); // tur
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addBox(28F, -10F, -6F, 7, 2, 2, 0F); // tur
		turretModel[15].setRotationPoint(0F, 0F, 0F);
		turretModel[15].rotateAngleY = 0.71558499F;
		turretModel[15].rotateAngleZ = -0.36651914F;

		turretModel[16].addBox(-13F, -29F, -10F, 25, 12, 20, 0F); // tur
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addBox(22F, -24F, -13F, 4, 3, 26, 0F); // tur
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addBox(28F, -10.5F, -8F, 6, 2, 2, 0F); // tur
		turretModel[18].setRotationPoint(0F, 0F, 0F);
		turretModel[18].rotateAngleY = 0.95993109F;
		turretModel[18].rotateAngleZ = -0.36651914F;

		turretModel[19].addBox(27F, -10F, -5F, 7, 2, 2, 0F); // tur
		turretModel[19].setRotationPoint(0F, 0F, 0F);
		turretModel[19].rotateAngleY = 0.99483767F;
		turretModel[19].rotateAngleZ = -0.37524579F;

		turretModel[20].addBox(24F, -12F, -4F, 9, 2, 2, 0F); // tur
		turretModel[20].setRotationPoint(0F, 0F, 0F);
		turretModel[20].rotateAngleY = 1.13446401F;
		turretModel[20].rotateAngleZ = -0.29670597F;

		turretModel[21].addBox(28F, -10F, 3F, 8, 2, 2, 0F); // tur
		turretModel[21].setRotationPoint(0F, 0F, 0F);
		turretModel[21].rotateAngleY = -0.6981317F;
		turretModel[21].rotateAngleZ = -0.36651914F;

		turretModel[22].addBox(27F, -10.5F, 5F, 8, 2, 2, 0F); // tur
		turretModel[22].setRotationPoint(0F, 0F, 0F);
		turretModel[22].rotateAngleY = -0.9424778F;
		turretModel[22].rotateAngleZ = -0.36651914F;

		turretModel[23].addBox(26.5F, -10.5F, 3.5F, 8, 2, 2, 0F); // tur
		turretModel[23].setRotationPoint(0F, 0F, 0F);
		turretModel[23].rotateAngleY = -1.06465084F;
		turretModel[23].rotateAngleZ = -0.36651914F;

		turretModel[24].addBox(26.5F, -10.5F, 2F, 8, 2, 2, 0F); // tur
		turretModel[24].setRotationPoint(0F, 0F, 0F);
		turretModel[24].rotateAngleY = -1.18682389F;
		turretModel[24].rotateAngleZ = -0.36651914F;

		turretModel[25].addBox(-35.5F, -19F, 11F, 19, 1, 1, 0F); // tur
		turretModel[25].setRotationPoint(0F, 0F, 0F);
		turretModel[25].rotateAngleZ = 0.08726646F;

		turretModel[26].addBox(-37F, -18F, -4F, 17, 1, 1, 0F); // tur
		turretModel[26].setRotationPoint(0F, 0F, 0F);
		turretModel[26].rotateAngleY = 0.41887902F;
		turretModel[26].rotateAngleZ = 0.10471976F;

		turretModel[27].addBox(-34F, -22F, -7F, 1, 1, 18, 0F); // tur
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addBox(-34.5F, -22F, -9F, 1, 1, 12, 0F); // tur
		turretModel[28].setRotationPoint(0F, 0F, 0F);
		turretModel[28].rotateAngleY = 0.26179939F;

		turretModel[29].addBox(-34F, -28F, 11F, 20, 1, 1, 0F); // tur
		turretModel[29].setRotationPoint(0F, 0F, 0F);

		turretModel[30].addBox(-34.5F, -28F, -9F, 1, 1, 11, 0F); // tur
		turretModel[30].setRotationPoint(0F, 0F, 0F);
		turretModel[30].rotateAngleY = 0.26179939F;

		turretModel[31].addBox(-34F, -28F, -7F, 1, 1, 18, 0F); // tur
		turretModel[31].setRotationPoint(0F, 0F, 0F);

		turretModel[32].addBox(-34F, -27F, 11F, 1, 5, 1, 0F); // tur
		turretModel[32].setRotationPoint(0F, 0F, 0F);

		turretModel[33].addBox(-34F, -27F, 5F, 1, 5, 1, 0F); // tur
		turretModel[33].setRotationPoint(0F, 0F, 0F);

		turretModel[34].addBox(-34F, -27F, -1F, 1, 5, 1, 0F); // tur
		turretModel[34].setRotationPoint(0F, 0F, 0F);

		turretModel[35].addBox(-34F, -27F, -7F, 1, 5, 1, 0F); // tur
		turretModel[35].setRotationPoint(0F, 0F, 0F);

		turretModel[36].addBox(-34.6F, -27F, -4F, 1, 5, 1, 0F); // tur
		turretModel[36].setRotationPoint(0F, 0F, 0F);
		turretModel[36].rotateAngleY = 0.2443461F;

		turretModel[37].addBox(-34F, -27F, -10.3F, 1, 5, 1, 0F); // tur
		turretModel[37].setRotationPoint(0F, 0F, 0F);
		turretModel[37].rotateAngleY = 0.2268928F;

		turretModel[38].addBox(-36F, -4F, 11F, 1, 9, 1, 0F); // tur
		turretModel[38].setRotationPoint(0F, 0F, 0F);
		turretModel[38].rotateAngleZ = 0.76794487F;

		turretModel[39].addBox(-36F, -3.5F, -4.1F, 1, 9, 1, 0F); // tur
		turretModel[39].setRotationPoint(0F, 0F, 0F);
		turretModel[39].rotateAngleY = 0.41887902F;
		turretModel[39].rotateAngleZ = 0.76794487F;

		turretModel[40].addBox(-35F, -19F, 5F, 19, 1, 1, 0F); // tur
		turretModel[40].setRotationPoint(0F, 0F, 0F);
		turretModel[40].rotateAngleZ = 0.08726646F;

		turretModel[41].addBox(-35F, -19F, -1F, 19, 1, 1, 0F); // tur
		turretModel[41].setRotationPoint(0F, 0F, 0F);
		turretModel[41].rotateAngleZ = 0.08726646F;

		turretModel[42].addBox(-35F, -19F, -7F, 19, 1, 1, 0F); // tur
		turretModel[42].setRotationPoint(0F, 0F, 0F);
		turretModel[42].rotateAngleZ = 0.08726646F;

		turretModel[43].addBox(-35F, -28F, -5F, 18, 1, 1, 0F); // tur
		turretModel[43].setRotationPoint(0F, 0F, 0F);
		turretModel[43].rotateAngleY = 0.38397244F;

		turretModel[44].addBox(12F, -29F, 12F, 2, 4, 2, 0F); // tur
		turretModel[44].setRotationPoint(0F, 0F, 0F);

		turretModel[45].addBox(12.5F, -51F, 12.5F, 1, 22, 1, 0F); // tur
		turretModel[45].setRotationPoint(0F, 0F, 0F);

		turretModel[46].addBox(-8.5F, -43F, 9.5F, 1, 16, 1, 0F); // tur
		turretModel[46].setRotationPoint(0F, 0F, 0F);

		turretModel[47].addBox(-33F, -27F, 11.5F, 16, 6, 0, 0F); // tur
		turretModel[47].setRotationPoint(0F, 0F, 0F);

		turretModel[48].addBox(-33.5F, -27F, -6F, 0, 5, 17, 0F); // tur
		turretModel[48].setRotationPoint(0F, 0F, 0F);

		turretModel[49].addBox(-34F, -27F, -9F, 0, 5, 11, 0F); // tur
		turretModel[49].setRotationPoint(0F, 0F, 0F);
		turretModel[49].rotateAngleY = 0.26179939F;

		turretModel[50].addBox(-35F, -27F, -4.5F, 18, 6, 0, 0F); // tur
		turretModel[50].setRotationPoint(0F, 0F, 0F);
		turretModel[50].rotateAngleY = 0.38397244F;

		turretModel[51].addBox(-35.5F, -18.5F, -6F, 19, 0, 17, 0F); // tur
		turretModel[51].setRotationPoint(0F, 0F, 0F);
		turretModel[51].rotateAngleZ = 0.08726646F;

		turretModel[52].addBox(-34.5F, -18.5F, -18F, 16, 0, 11, 0F); // tur
		turretModel[52].setRotationPoint(0F, 0F, 0F);
		turretModel[52].rotateAngleZ = 0.08726646F;

		turretModel[53].addBox(-18F, -31F, -6F, 15, 2, 5, 0F); // tur
		turretModel[53].setRotationPoint(0F, 0F, 0F);

		turretModel[54].addBox(-18F, -31F, -16F, 15, 2, 5, 0F); // tur
		turretModel[54].setRotationPoint(0F, 0F, 0F);

		turretModel[55].addBox(-18F, -29F, -10F, 5, 12, 20, 0F); // tur
		turretModel[55].setRotationPoint(0F, 0F, 0F);

		turretModel[56].addBox(-18F, -29F, -22F, 5, 12, 12, 0F); // tur
		turretModel[56].setRotationPoint(0F, 0F, 0F);

		turretModel[57].addBox(-8F, -29F, -25F, 5, 12, 15, 0F); // tur
		turretModel[57].setRotationPoint(0F, 0F, 0F);

		turretModel[58].addBox(-23F, -29F, 10F, 5, 8, 8, 0F); // tur
		turretModel[58].setRotationPoint(0F, 0F, 0F);



// Barrel
		barrelModel = new ModelRendererTurbo[8];
		barrelModel[0] = new ModelRendererTurbo(this,  306,  442, textureX, textureY); // bar
		barrelModel[1] = new ModelRendererTurbo(this,  168,  290, textureX, textureY); // bar
		barrelModel[2] = new ModelRendererTurbo(this,  230,  455, textureX, textureY); // bar
		barrelModel[3] = new ModelRendererTurbo(this,  167,  251, textureX, textureY); // bar
		barrelModel[4] = new ModelRendererTurbo(this,  83,  134, textureX, textureY); // bar
		barrelModel[5] = new ModelRendererTurbo(this,  126,  436, textureX, textureY); // bar
		barrelModel[6] = new ModelRendererTurbo(this,  122,  455, textureX, textureY); // bar
		barrelModel[7] = new ModelRendererTurbo(this,  168,  213, textureX, textureY); // bar

		barrelModel[0].addBox(0F, -3.5F, -11F, 4, 8, 22, 0F); // bar
		barrelModel[0].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[1].addBox(4F, -2F, -3F, 8, 5, 6, 0F); // bar
		barrelModel[1].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[2].addBox(13F, -1.5F, -2F, 12, 4, 4, 0F); // bar
		barrelModel[2].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[3].addBox(0F, -6F, -3.5F, 8, 3, 7, 0F); // bar
		barrelModel[3].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[4].addBox(1F, 2F, 6F, 4, 1, 1, 0F); // bar
		barrelModel[4].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[5].addBox(12F, -2F, -3F, 1, 5, 6, 0F); // bar
		barrelModel[5].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[6].addBox(0F, -3F, -4F, 5, 7, 8, 0F); // bar
		barrelModel[6].setRotationPoint(25F, -23.5F, 0F);

		barrelModel[7].addBox(-1F, -10.5F, 5F, 6, 7, 7, 0F); // bar
		barrelModel[7].setRotationPoint(25F, -23.5F, 0F);



// Left Track
		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this,  339,  155, textureX, textureY); // trl
		leftTrackModel[1] = new ModelRendererTurbo(this,  342,  119, textureX, textureY); // trl
		leftTrackModel[2] = new ModelRendererTurbo(this,  156,  18, textureX, textureY); // trl
		leftTrackModel[3] = new ModelRendererTurbo(this,  123,  340, textureX, textureY); // trl
		leftTrackModel[4] = new ModelRendererTurbo(this,  123,  340, textureX, textureY); // trl
		leftTrackModel[5] = new ModelRendererTurbo(this,  223,  412, textureX, textureY); // trl
		leftTrackModel[6] = new ModelRendererTurbo(this,  156,  30, textureX, textureY); // trl
		leftTrackModel[7] = new ModelRendererTurbo(this,  123,  324, textureX, textureY); // trl
		leftTrackModel[8] = new ModelRendererTurbo(this,  123,  324, textureX, textureY); // trl
		leftTrackModel[9] = new ModelRendererTurbo(this,  229,  427, textureX, textureY); // trl

		leftTrackModel[0].addBox(0F, 0F, 0F, 79, 2, 7, 0F); // trl
		leftTrackModel[0].setRotationPoint(-39F, 9F, 18F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 77, 2, 7, 0F); // trl
		leftTrackModel[1].setRotationPoint(-38F, -4F, 18F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 16, 2, 7, 0F); // trl
		leftTrackModel[2].setRotationPoint(-53F, -6F, 18F);
		leftTrackModel[2].rotateAngleZ = 0.13089969F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // trl
		leftTrackModel[3].setRotationPoint(-53F, -6F, 18F);
		leftTrackModel[3].rotateAngleZ = 0.75049158F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 2, 5, 7, 0F); // trl
		leftTrackModel[4].setRotationPoint(-55F, -4F, 18F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 19, 2, 7, 0F); // trl
		leftTrackModel[5].setRotationPoint(-54F, -0.5F, 18F);
		leftTrackModel[5].rotateAngleZ = 0.55850536F;

		leftTrackModel[6].addBox(-17F, -2F, 0F, 17, 2, 7, 0F); // trl
		leftTrackModel[6].setRotationPoint(54F, 1F, 18F);
		leftTrackModel[6].rotateAngleZ = -0.62831853F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 2, 5, 7, 0F); // trl
		leftTrackModel[7].setRotationPoint(52F, -4F, 18F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // trl
		leftTrackModel[8].setRotationPoint(50.4F, -4.1F, 18F);
		leftTrackModel[8].rotateAngleZ = -0.9424778F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 13, 2, 7, 0F); // trl
		leftTrackModel[9].setRotationPoint(38.8F, -4F, 18F);
		leftTrackModel[9].rotateAngleZ = -0.13089969F;



// Right Track
		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this,  123,  340, textureX, textureY); // trr
		rightTrackModel[1] = new ModelRendererTurbo(this,  123,  324, textureX, textureY); // trr
		rightTrackModel[2] = new ModelRendererTurbo(this,  123,  340, textureX, textureY); // trr
		rightTrackModel[3] = new ModelRendererTurbo(this,  156,  30, textureX, textureY); // trr
		rightTrackModel[4] = new ModelRendererTurbo(this,  342,  119, textureX, textureY); // trr
		rightTrackModel[5] = new ModelRendererTurbo(this,  156,  18, textureX, textureY); // trr
		rightTrackModel[6] = new ModelRendererTurbo(this,  229,  467, textureX, textureY); // trr
		rightTrackModel[7] = new ModelRendererTurbo(this,  123,  324, textureX, textureY); // trr
		rightTrackModel[8] = new ModelRendererTurbo(this,  339,  155, textureX, textureY); // trr
		rightTrackModel[9] = new ModelRendererTurbo(this,  224,  397, textureX, textureY); // trr

		rightTrackModel[0].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // trr
		rightTrackModel[0].setRotationPoint(-53F, -6F, -25F);
		rightTrackModel[0].rotateAngleZ = 0.75049158F;

		rightTrackModel[1].addBox(0F, 0F, 0F, 2, 5, 7, 0F); // trr
		rightTrackModel[1].setRotationPoint(52F, -4F, -25F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 2, 5, 7, 0F); // trr
		rightTrackModel[2].setRotationPoint(-55F, -4F, -25F);

		rightTrackModel[3].addBox(-17F, -2F, 0F, 17, 2, 7, 0F); // trr
		rightTrackModel[3].setRotationPoint(54F, 1F, -25F);
		rightTrackModel[3].rotateAngleZ = -0.62831853F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 77, 2, 7, 0F); // trr
		rightTrackModel[4].setRotationPoint(-38F, -4F, -25F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 16, 2, 7, 0F); // trr
		rightTrackModel[5].setRotationPoint(-53F, -6F, -25F);
		rightTrackModel[5].rotateAngleZ = 0.13089969F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 13, 2, 7, 0F); // trr
		rightTrackModel[6].setRotationPoint(38.8F, -4F, -25F);
		rightTrackModel[6].rotateAngleZ = -0.13089969F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // trr
		rightTrackModel[7].setRotationPoint(50.4F, -4.1F, -25F);
		rightTrackModel[7].rotateAngleZ = -0.9424778F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 79, 2, 7, 0F); // trr
		rightTrackModel[8].setRotationPoint(-39F, 9F, -25F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 19, 2, 7, 0F); // trr
		rightTrackModel[9].setRotationPoint(-54F, -0.5F, -25F);
		rightTrackModel[9].rotateAngleZ = 0.55850536F;



// Left Track Wheel
		leftTrackWheelModels = new ModelRendererTurbo[15];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whl
		leftTrackWheelModels[1] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whl
		leftTrackWheelModels[2] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whl
		leftTrackWheelModels[3] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whl
		leftTrackWheelModels[4] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whl
		leftTrackWheelModels[5] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whl
		leftTrackWheelModels[6] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whl
		leftTrackWheelModels[7] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whl
		leftTrackWheelModels[8] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whl
		leftTrackWheelModels[9] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whl
		leftTrackWheelModels[10] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whl
		leftTrackWheelModels[11] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whl
		leftTrackWheelModels[12] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // 
		leftTrackWheelModels[13] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whl
		leftTrackWheelModels[14] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whl

		leftTrackWheelModels[0].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whl
		leftTrackWheelModels[0].setRotationPoint(34.5F, 3.5F, 19F);

		leftTrackWheelModels[1].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whl
		leftTrackWheelModels[1].setRotationPoint(0.5F, 3.5F, 19F);

		leftTrackWheelModels[2].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whl
		leftTrackWheelModels[2].setRotationPoint(-16.5F, 3.5F, 19F);

		leftTrackWheelModels[3].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whl
		leftTrackWheelModels[3].setRotationPoint(-33.5F, 3.5F, 19F);

		leftTrackWheelModels[4].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[4].setRotationPoint(34.5F, 3.5F, 19F);

		leftTrackWheelModels[5].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[5].setRotationPoint(0.5F, 3.5F, 19F);

		leftTrackWheelModels[6].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[6].setRotationPoint(-16.5F, 3.5F, 19F);

		leftTrackWheelModels[7].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[7].setRotationPoint(-33.5F, 3.5F, 19F);

		leftTrackWheelModels[8].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[8].setRotationPoint(34.5F, 3.5F, 19F);

		leftTrackWheelModels[9].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[9].setRotationPoint(0.5F, 3.5F, 19F);

		leftTrackWheelModels[10].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[10].setRotationPoint(-16.5F, 3.5F, 19F);

		leftTrackWheelModels[11].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[11].setRotationPoint(-33.5F, 3.5F, 19F);

		leftTrackWheelModels[12].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[12].setRotationPoint(17.5F, 3.5F, 19F);

		leftTrackWheelModels[13].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whl
		leftTrackWheelModels[13].setRotationPoint(17.5F, 3.5F, 19F);

		leftTrackWheelModels[14].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whl
		leftTrackWheelModels[14].setRotationPoint(17.5F, 3.5F, 19F);



// Right Track Wheel
		rightTrackWheelModels = new ModelRendererTurbo[15];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whr
		rightTrackWheelModels[1] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whr
		rightTrackWheelModels[2] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whr
		rightTrackWheelModels[3] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whr
		rightTrackWheelModels[4] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whr
		rightTrackWheelModels[5] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whr
		rightTrackWheelModels[6] = new ModelRendererTurbo(this,  74,  174, textureX, textureY); // whr
		rightTrackWheelModels[7] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whr
		rightTrackWheelModels[8] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whr
		rightTrackWheelModels[9] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whr
		rightTrackWheelModels[10] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whr
		rightTrackWheelModels[11] = new ModelRendererTurbo(this,  73,  192, textureX, textureY); // whr
		rightTrackWheelModels[12] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whr
		rightTrackWheelModels[13] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whr
		rightTrackWheelModels[14] = new ModelRendererTurbo(this,  76,  160, textureX, textureY); // whr

		rightTrackWheelModels[0].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whr
		rightTrackWheelModels[0].setRotationPoint(34.5F, 3.5F, -24F);

		rightTrackWheelModels[1].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[1].setRotationPoint(34.5F, 3.5F, -24F);

		rightTrackWheelModels[2].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[2].setRotationPoint(34.5F, 3.5F, -24F);

		rightTrackWheelModels[3].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whr
		rightTrackWheelModels[3].setRotationPoint(17.5F, 3.5F, -24F);

		rightTrackWheelModels[4].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whr
		rightTrackWheelModels[4].setRotationPoint(0.5F, 3.5F, -24F);

		rightTrackWheelModels[5].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whr
		rightTrackWheelModels[5].setRotationPoint(-16.5F, 3.5F, -24F);

		rightTrackWheelModels[6].addBox(-5.5F, -2.5F, 0F, 11, 5, 5, 0F); // whr
		rightTrackWheelModels[6].setRotationPoint(-33.5F, 3.5F, -24F);

		rightTrackWheelModels[7].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[7].setRotationPoint(17.5F, 3.5F, -24F);

		rightTrackWheelModels[8].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[8].setRotationPoint(17.5F, 3.5F, -24F);

		rightTrackWheelModels[9].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[9].setRotationPoint(0.5F, 3.5F, -24F);

		rightTrackWheelModels[10].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[10].setRotationPoint(-16.5F, 3.5F, -24F);

		rightTrackWheelModels[11].addBox(-5.5F, 2.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[11].setRotationPoint(-33.5F, 3.5F, -24F);

		rightTrackWheelModels[12].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[12].setRotationPoint(0.5F, 3.5F, -24F);

		rightTrackWheelModels[13].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[13].setRotationPoint(-16.5F, 3.5F, -24F);

		rightTrackWheelModels[14].addBox(-5.5F, -5.5F, 0F, 11, 3, 5, 0F); // whr
		rightTrackWheelModels[14].setRotationPoint(-33.5F, 3.5F, -24F);


		translateAll(0, 0, 0);


		flipAll();
	}
}