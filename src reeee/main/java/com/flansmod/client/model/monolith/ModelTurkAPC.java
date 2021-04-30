//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GTK Boxer with with 20mm Cannon
// Model Creator: 
// Created on: 05.01.2016 - 08:36:32
// Last changed on: 05.01.2016 - 08:36:32

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTurkAPC extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTurkAPC() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[101];
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel = new ModelRendererTurbo[2];
		turretModel = new ModelRendererTurbo[5];
		barrelModel = new ModelRendererTurbo[30];
		leftFrontWheelModel = new ModelRendererTurbo[169];
		rightFrontWheelModel = new ModelRendererTurbo[165];
		steeringWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initsteeringWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Boden
		bodyModel[1] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import SeiteR
		bodyModel[2] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import SeiteL
		bodyModel[3] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Dach
		bodyModel[4] = new ModelRendererTurbo(this, 210, 360, textureX, textureY); // Import Dachluke
		bodyModel[5] = new ModelRendererTurbo(this, 0, 345, textureX, textureY); // Import KFR
		bodyModel[6] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import KFL
		bodyModel[7] = new ModelRendererTurbo(this, 310, 330, textureX, textureY); // Import Front
		bodyModel[8] = new ModelRendererTurbo(this, 70, 480, textureX, textureY); // Import FahrerSicht
		bodyModel[9] = new ModelRendererTurbo(this, 230, 480, textureX, textureY); // Import HM
		bodyModel[10] = new ModelRendererTurbo(this, 285, 480, textureX, textureY); // Import HL1
		bodyModel[11] = new ModelRendererTurbo(this, 300, 480, textureX, textureY); // Import HL2
		bodyModel[12] = new ModelRendererTurbo(this, 315, 480, textureX, textureY); // Import HR1
		bodyModel[13] = new ModelRendererTurbo(this, 330, 480, textureX, textureY); // Import HR2
		bodyModel[14] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 381, 330, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 381, 330, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 60, 270, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 160, 270, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 160, 270, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 270, 270, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 320, 270, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 370, 270, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 420, 270, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 470, 270, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 265, 440, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 295, 440, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 270, 290, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 320, 290, textureX, textureY); // Import 
		bodyModel[29] = new ModelRendererTurbo(this, 370, 290, textureX, textureY); // Import 
		bodyModel[30] = new ModelRendererTurbo(this, 420, 290, textureX, textureY); // Import 
		bodyModel[31] = new ModelRendererTurbo(this, 470, 290, textureX, textureY); // Import 
		bodyModel[32] = new ModelRendererTurbo(this, 315, 440, textureX, textureY); // Import 
		bodyModel[33] = new ModelRendererTurbo(this, 345, 440, textureX, textureY); // Import 
		bodyModel[34] = new ModelRendererTurbo(this, 345, 480, textureX, textureY); // Import 
		bodyModel[35] = new ModelRendererTurbo(this, 345, 490, textureX, textureY); // Import 
		bodyModel[36] = new ModelRendererTurbo(this, 345, 500, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 355, 500, textureX, textureY); // Import 
		bodyModel[38] = new ModelRendererTurbo(this, 370, 480, textureX, textureY); // Import 
		bodyModel[39] = new ModelRendererTurbo(this, 370, 480, textureX, textureY); // Import 
		bodyModel[40] = new ModelRendererTurbo(this, 370, 500, textureX, textureY); // Import 
		bodyModel[41] = new ModelRendererTurbo(this, 380, 500, textureX, textureY); // Import 
		bodyModel[42] = new ModelRendererTurbo(this, 390, 490, textureX, textureY); // Import 
		bodyModel[43] = new ModelRendererTurbo(this, 325, 230, textureX, textureY); // Import Sitz11
		bodyModel[44] = new ModelRendererTurbo(this, 325, 250, textureX, textureY); // Import Sitz12
		bodyModel[45] = new ModelRendererTurbo(this, 325, 230, textureX, textureY); // Import Sitz21
		bodyModel[46] = new ModelRendererTurbo(this, 325, 250, textureX, textureY); // Import Sitz22
		bodyModel[47] = new ModelRendererTurbo(this, 185, 230, textureX, textureY); // Import Konsole1
		bodyModel[48] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Import Konsole2
		bodyModel[49] = new ModelRendererTurbo(this, 260, 225, textureX, textureY); // Import Konsole3
		bodyModel[50] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Trennwand1
		bodyModel[51] = new ModelRendererTurbo(this, 20, 230, textureX, textureY); // Import Trennwand2
		bodyModel[52] = new ModelRendererTurbo(this, 55, 230, textureX, textureY); // Import Trennwand3
		bodyModel[53] = new ModelRendererTurbo(this, 80, 230, textureX, textureY); // Import Trennwand4
		bodyModel[54] = new ModelRendererTurbo(this, 266, 405, textureX, textureY); // Import FahrerSicht
		bodyModel[55] = new ModelRendererTurbo(this, 494, 494, textureX, textureY); // Import Moni1
		bodyModel[56] = new ModelRendererTurbo(this, 470, 494, textureX, textureY); // Import Moni2
		bodyModel[57] = new ModelRendererTurbo(this, 494, 480, textureX, textureY); // Import Moni3
		bodyModel[58] = new ModelRendererTurbo(this, 470, 480, textureX, textureY); // Import Moni4
		bodyModel[59] = new ModelRendererTurbo(this, 435, 499, textureX, textureY); // Import Feuer1
		bodyModel[60] = new ModelRendererTurbo(this, 425, 499, textureX, textureY); // Import Feuer2
		bodyModel[61] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import SL1
		bodyModel[62] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import SL2
		bodyModel[63] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import SL3
		bodyModel[64] = new ModelRendererTurbo(this, 25, 200, textureX, textureY); // Import SL4
		bodyModel[65] = new ModelRendererTurbo(this, 175, 200, textureX, textureY); // Import SL5
		bodyModel[66] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SL6
		bodyModel[67] = new ModelRendererTurbo(this, 175, 200, textureX, textureY); // Import SL7
		bodyModel[68] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SL8
		bodyModel[69] = new ModelRendererTurbo(this, 175, 200, textureX, textureY); // Import SL9
		bodyModel[70] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SL10
		bodyModel[71] = new ModelRendererTurbo(this, 175, 200, textureX, textureY); // Import SL11
		bodyModel[72] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SL12
		bodyModel[73] = new ModelRendererTurbo(this, 175, 200, textureX, textureY); // Import SL13
		bodyModel[74] = new ModelRendererTurbo(this, 395, 200, textureX, textureY); // Import SL14
		bodyModel[75] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import SR1
		bodyModel[76] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import SR2
		bodyModel[77] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import SR3
		bodyModel[78] = new ModelRendererTurbo(this, 225, 200, textureX, textureY); // Import SR4
		bodyModel[79] = new ModelRendererTurbo(this, 370, 200, textureX, textureY); // Import SR5
		bodyModel[80] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SR6
		bodyModel[81] = new ModelRendererTurbo(this, 370, 200, textureX, textureY); // Import SR7
		bodyModel[82] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SR8
		bodyModel[83] = new ModelRendererTurbo(this, 370, 200, textureX, textureY); // Import SR9
		bodyModel[84] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SR10
		bodyModel[85] = new ModelRendererTurbo(this, 370, 200, textureX, textureY); // Import SR11
		bodyModel[86] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Import SR12
		bodyModel[87] = new ModelRendererTurbo(this, 370, 200, textureX, textureY); // Import SR13
		bodyModel[88] = new ModelRendererTurbo(this, 300, 380, textureX, textureY); // Import Luftnase
		bodyModel[89] = new ModelRendererTurbo(this, 260, 360, textureX, textureY); // Import Dach1
		bodyModel[90] = new ModelRendererTurbo(this, 275, 370, textureX, textureY); // Import Dach2
		bodyModel[91] = new ModelRendererTurbo(this, 300, 370, textureX, textureY); // Import WL1
		bodyModel[92] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WL2
		bodyModel[93] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WL3
		bodyModel[94] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WL4
		bodyModel[95] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import Wl5
		bodyModel[96] = new ModelRendererTurbo(this, 300, 370, textureX, textureY); // Import WR1
		bodyModel[97] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WR2
		bodyModel[98] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WR3
		bodyModel[99] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WR4
		bodyModel[100] = new ModelRendererTurbo(this, 340, 370, textureX, textureY); // Import WR5

		bodyModel[0].addBox(0F, 0F, 0F, 112, 1, 34, 0F); // Import Boden
		bodyModel[0].setRotationPoint(-54F, -1F, -17F);

		bodyModel[1].addBox(0F, 0F, 0F, 112, 15, 2, 0F); // Import SeiteR
		bodyModel[1].setRotationPoint(-54F, -16F, -17F);

		bodyModel[2].addBox(0F, 0F, 0F, 112, 15, 2, 0F); // Import SeiteL
		bodyModel[2].setRotationPoint(-54F, -16F, 15F);

		bodyModel[3].addBox(0F, 0F, 0F, 83, 1, 30, 0F); // Import Dach
		bodyModel[3].setRotationPoint(-55F, -31F, -15F);

		bodyModel[4].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Import Dachluke
		bodyModel[4].setRotationPoint(-7F, -32F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 129, 1, 9, 0F); // Import KFR
		bodyModel[5].setRotationPoint(-55F, -17F, -24F);

		bodyModel[6].addBox(0F, 0F, 0F, 129, 1, 9, 0F); // Import KFL
		bodyModel[6].setRotationPoint(-55F, -17F, 15F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 1, 30, 0F); // Import Front
		bodyModel[7].setRotationPoint(72F, -17F, -15F);

		bodyModel[8].addBox(0F, 0F, 0F, 21, 3, 36, 0F); // Import FahrerSicht
		bodyModel[8].setRotationPoint(28F, -29F, -18F);
		bodyModel[8].rotateAngleZ = -0.08726646F;

		bodyModel[9].addBox(0F, 0F, 0F, 2, 4, 24, 0F); // Import HM
		bodyModel[9].setRotationPoint(-55F, -30F, -12F);
		bodyModel[9].rotateAngleZ = 0.06981317F;

		bodyModel[10].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // Import HL1
		bodyModel[10].setRotationPoint(-54F, -17F, 11F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 15, 4, 0F); // Import HL2
		bodyModel[11].setRotationPoint(-55F, -30F, 11F);
		bodyModel[11].rotateAngleZ = 0.06981317F;

		bodyModel[12].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // Import HR1
		bodyModel[12].setRotationPoint(-54F, -17F, -15F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 15, 4, 0F); // Import HR2
		bodyModel[13].setRotationPoint(-55F, -30F, -15F);
		bodyModel[13].rotateAngleZ = 0.06981317F;

		bodyModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(16, 0, 16, 0), new Coord2D(16, 16, 16, 16), new Coord2D(0, 16, 0, 16) }), 34, 16, 16, 55, 34, ModelRendererTurbo.MR_FRONT, new float[] {23 ,16 ,16}); // Import 
		bodyModel[14].setRotationPoint(74F, 0F, 17F);

		bodyModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(9, 0, 9, 0), new Coord2D(6, 14, 6, 14), new Coord2D(0, 14, 0, 14) }), 83, 9, 14, 44, 83, ModelRendererTurbo.MR_FRONT, new float[] {14 ,6 ,15 ,9}); // Import 
		bodyModel[15].setRotationPoint(28F, -17F, 15F);
		bodyModel[15].rotateAngleY = -1.57079633F;

		bodyModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(9, 0, 9, 0), new Coord2D(6, 14, 6, 14), new Coord2D(0, 14, 0, 14) }), 83, 9, 14, 44, 83, ModelRendererTurbo.MR_FRONT, new float[] {14 ,6 ,15 ,9}); // Import 
		bodyModel[16].setRotationPoint(-55F, -17F, -15F);
		bodyModel[16].rotateAngleY = 1.57079633F;

		bodyModel[17].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(48, 0, 48, 0), new Coord2D(45, 48, 45, 48), new Coord2D(3, 48, 3, 48) }), 1, 48, 48, 188, 1, ModelRendererTurbo.MR_FRONT, new float[] {49 ,42 ,49 ,48}); // Import 
		bodyModel[17].setRotationPoint(74F, -17F, -24F);
		bodyModel[17].rotateAngleX = 1.27409034F;
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(46, 0, 46, 0), new Coord2D(46, 14, 46, 14) }), 1, 46, 14, 109, 1, ModelRendererTurbo.MR_FRONT, new float[] {49 ,14 ,46}); // Import 
		bodyModel[18].setRotationPoint(74F, -17F, 24F);
		bodyModel[18].rotateAngleX = 0.20943951F;

		bodyModel[19].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(46, 0, 46, 0), new Coord2D(46, 14, 46, 14) }), 1, 46, 14, 109, 1, ModelRendererTurbo.MR_FRONT, new float[] {49 ,14 ,46}); // Import 
		bodyModel[19].setRotationPoint(74F, -17F, -24F);
		bodyModel[19].rotateAngleX = -0.20943951F;

		bodyModel[20].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(14, 0, 14, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 47, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,7 ,10}); // Import 
		bodyModel[20].setRotationPoint(74F, -9F, 24F);

		bodyModel[21].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,6 ,10}); // Import 
		bodyModel[21].setRotationPoint(45F, -9F, 24F);

		bodyModel[22].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,6 ,10}); // Import 
		bodyModel[22].setRotationPoint(15F, -9F, 24F);

		bodyModel[23].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,6 ,10}); // Import 
		bodyModel[23].setRotationPoint(-14F, -9F, 24F);

		bodyModel[24].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(9, 0, 9, 0), new Coord2D(10, 7, 10, 7) }), 9, 10, 7, 30, 9, ModelRendererTurbo.MR_FRONT, new float[] {10 ,8 ,2 ,10}); // Import 
		bodyModel[24].setRotationPoint(-45F, -9F, 24F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 9, 7, 0F); // Import 
		bodyModel[25].setRotationPoint(2F, -9F, 17F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 9, 7, 0F); // Import 
		bodyModel[26].setRotationPoint(-54F, -9F, 17F);

		bodyModel[27].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(14, 0, 14, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 47, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,7 ,10}); // Import 
		bodyModel[27].setRotationPoint(74F, -9F, -17F);

		bodyModel[28].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,6 ,10}); // Import 
		bodyModel[28].setRotationPoint(45F, -9F, -17F);

		bodyModel[29].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,6 ,10}); // Import 
		bodyModel[29].setRotationPoint(15F, -9F, -17F);

		bodyModel[30].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) }), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20 ,10 ,6 ,10}); // Import 
		bodyModel[30].setRotationPoint(-14F, -9F, -17F);

		bodyModel[31].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(9, 0, 9, 0), new Coord2D(10, 7, 10, 7) }), 9, 10, 7, 30, 9, ModelRendererTurbo.MR_FRONT, new float[] {10 ,8 ,2 ,10}); // Import 
		bodyModel[31].setRotationPoint(-45F, -9F, -15F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 9, 7, 0F); // Import 
		bodyModel[32].setRotationPoint(2F, -9F, -24F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 9, 7, 0F); // Import 
		bodyModel[33].setRotationPoint(-54F, -9F, -24F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import 
		bodyModel[34].setRotationPoint(66F, -17F, 24F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import 
		bodyModel[35].setRotationPoint(66F, -15F, 24F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Import 
		bodyModel[36].setRotationPoint(66F, -20F, 28F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Import 
		bodyModel[37].setRotationPoint(66F, -27F, 26F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import 
		bodyModel[38].setRotationPoint(66F, -17F, -28F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import 
		bodyModel[39].setRotationPoint(66F, -15F, -28F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Import 
		bodyModel[40].setRotationPoint(66F, -20F, -29F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Import 
		bodyModel[41].setRotationPoint(66F, -27F, -30F);

		bodyModel[42].addBox(0F, 0F, 0F, 17, 3, 5, 0F); // Import 
		bodyModel[42].setRotationPoint(46F, -19F, 25F);
		bodyModel[42].rotateAngleX = 1.361357F;
		bodyModel[42].rotateAngleY = 3.176499F;
		bodyModel[42].rotateAngleZ = 0.296706F;

		bodyModel[43].addBox(0F, 0F, 0F, 14, 2, 12, 0F); // Import Sitz11
		bodyModel[43].setRotationPoint(32F, -3F, -15F);

		bodyModel[44].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Import Sitz12
		bodyModel[44].setRotationPoint(32F, -3F, -15F);
		bodyModel[44].rotateAngleZ = 1.815142F;

		bodyModel[45].addBox(0F, 0F, 0F, 14, 2, 12, 0F); // Import Sitz21
		bodyModel[45].setRotationPoint(32F, -3F, 3F);

		bodyModel[46].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Import Sitz22
		bodyModel[46].setRotationPoint(32F, -3F, 3F);
		bodyModel[46].rotateAngleZ = 1.815142F;

		bodyModel[47].addTrapezoid(0F, 0F, 0F, 9, 11, 4, 0F, -1.0F, ModelRendererTurbo.MR_TOP); // Import Konsole1
		bodyModel[47].setRotationPoint(49F, -12F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 5, 11, 30, 0F); // Import Konsole2
		bodyModel[48].setRotationPoint(53F, -12F, -15F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 12, 30, 0F); // Import Konsole3
		bodyModel[49].setRotationPoint(53F, -12F, -15F);
		bodyModel[49].rotateAngleZ = -0.2792527F;

		bodyModel[50].addBox(0F, 0F, 0F, 1, 29, 8, 0F); // Import Trennwand1
		bodyModel[50].setRotationPoint(27F, -30F, -15F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Import Trennwand2
		bodyModel[51].setRotationPoint(27F, -30F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 29, 8, 0F); // Import Trennwand3
		bodyModel[52].setRotationPoint(27F, -30F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Import Trennwand4
		bodyModel[53].setRotationPoint(27F, -3F, -7F);

		bodyModel[54].addBox(0F, 0F, 0F, 21, 3, 14, 0F); // Import FahrerSicht
		bodyModel[54].setRotationPoint(28F, -29F, -16F);
		bodyModel[54].rotateAngleZ = -0.08726646F;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Import Moni1
		bodyModel[55].setRotationPoint(55F, -12F, -5F);
		bodyModel[55].rotateAngleY = 3.14159265F;
		bodyModel[55].rotateAngleZ = -2.722714F;

		bodyModel[56].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Import Moni2
		bodyModel[56].setRotationPoint(55F, -12F, 13F);
		bodyModel[56].rotateAngleY = 3.14159265F;
		bodyModel[56].rotateAngleZ = -2.722714F;

		bodyModel[57].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Import Moni3
		bodyModel[57].setRotationPoint(41F, -26F, -15F);
		bodyModel[57].rotateAngleX = 0.2617994F;
		bodyModel[57].rotateAngleY = 3.14159265F;

		bodyModel[58].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Import Moni4
		bodyModel[58].setRotationPoint(33F, -26F, 15F);
		bodyModel[58].rotateAngleX = 0.2617994F;

		bodyModel[59].addBox(0F, 0F, 0F, 11, 9, 4, 0F); // Import Feuer1
		bodyModel[59].setRotationPoint(47F, -10F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Import Feuer2
		bodyModel[60].setRotationPoint(48F, -15F, 8.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Import SL1
		bodyModel[61].setRotationPoint(-51F, -4F, 5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Import SL2
		bodyModel[62].setRotationPoint(-22F, -4F, 5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Import SL3
		bodyModel[63].setRotationPoint(7F, -4F, 5F);

		bodyModel[64].addBox(0F, 0F, 0F, 61, 2, 11, 0F); // Import SL4
		bodyModel[64].setRotationPoint(-52F, -6F, 4F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SL5
		bodyModel[65].setRotationPoint(-52F, -10F, 5F);

		bodyModel[66].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SL6
		bodyModel[66].setRotationPoint(-51F, -6F, 12F);
		bodyModel[66].rotateAngleX = 1.308997F;

		bodyModel[67].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SL7
		bodyModel[67].setRotationPoint(-37F, -10F, 5F);

		bodyModel[68].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SL8
		bodyModel[68].setRotationPoint(-36F, -6F, 12F);
		bodyModel[68].rotateAngleX = 1.308997F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SL9
		bodyModel[69].setRotationPoint(-22F, -10F, 5F);

		bodyModel[70].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SL10
		bodyModel[70].setRotationPoint(-21F, -6F, 12F);
		bodyModel[70].rotateAngleX = 1.308997F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SL11
		bodyModel[71].setRotationPoint(-7F, -10F, 5F);

		bodyModel[72].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SL12
		bodyModel[72].setRotationPoint(-6F, -6F, 12F);
		bodyModel[72].rotateAngleX = 1.308997F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SL13
		bodyModel[73].setRotationPoint(8F, -10F, 5F);

		bodyModel[74].addBox(0F, 0F, 0F, 15, 29, 6, 0F); // Import SL14
		bodyModel[74].setRotationPoint(11F, -30F, 9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Import SR1
		bodyModel[75].setRotationPoint(-51F, -4F, -15F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Import SR2
		bodyModel[76].setRotationPoint(-22F, -4F, -15F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Import SR3
		bodyModel[77].setRotationPoint(7F, -4F, -15F);

		bodyModel[78].addBox(0F, 0F, 0F, 61, 2, 11, 0F); // Import SR4
		bodyModel[78].setRotationPoint(-52F, -6F, -15F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SR5
		bodyModel[79].setRotationPoint(-52F, -10F, -15F);

		bodyModel[80].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SR6
		bodyModel[80].setRotationPoint(-37F, -6F, -12F);
		bodyModel[80].rotateAngleX = 1.308997F;
		bodyModel[80].rotateAngleY = 3.14159265F;

		bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SR7
		bodyModel[81].setRotationPoint(-37F, -10F, -15F);

		bodyModel[82].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SR8
		bodyModel[82].setRotationPoint(-22F, -6F, -12F);
		bodyModel[82].rotateAngleX = 1.308997F;
		bodyModel[82].rotateAngleY = 3.14159265F;

		bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SR9
		bodyModel[83].setRotationPoint(-22F, -10F, -15F);

		bodyModel[84].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SR10
		bodyModel[84].setRotationPoint(-7F, -6F, -12F);
		bodyModel[84].rotateAngleX = 1.308997F;
		bodyModel[84].rotateAngleY = 3.14159265F;

		bodyModel[85].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SR11
		bodyModel[85].setRotationPoint(-7F, -10F, -15F);

		bodyModel[86].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Import SR12
		bodyModel[86].setRotationPoint(8F, -6F, -12F);
		bodyModel[86].rotateAngleX = 1.308997F;
		bodyModel[86].rotateAngleY = 3.14159265F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Import SR13
		bodyModel[87].setRotationPoint(8F, -10F, -15F);

		bodyModel[88].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Import Luftnase
		bodyModel[88].setRotationPoint(59F, -22F, 5F);
		bodyModel[88].rotateAngleY = 3.14159265F;
		bodyModel[88].rotateAngleZ = 0.296706F;

		bodyModel[89].addBox(0F, 0F, 0F, 11, 2, 6, 0F); // Import Dach1
		bodyModel[89].setRotationPoint(-26F, -33F, -17F);

		bodyModel[90].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Import Dach2
		bodyModel[90].setRotationPoint(-55F, -34F, -2F);

		bodyModel[91].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Import WL1
		bodyModel[91].setRotationPoint(-52F, -32F, 15F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WL2
		bodyModel[92].setRotationPoint(-49F, -32F, 15.5F);
		bodyModel[92].rotateAngleY = 0.9599311F;
		bodyModel[92].rotateAngleZ = 2.268928F;

		bodyModel[93].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WL3
		bodyModel[93].setRotationPoint(-46F, -32F, 15.5F);
		bodyModel[93].rotateAngleY = 0.8726646F;
		bodyModel[93].rotateAngleZ = 2.268928F;

		bodyModel[94].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WL4
		bodyModel[94].setRotationPoint(-43F, -32F, 15.5F);
		bodyModel[94].rotateAngleY = 0.8726646F;
		bodyModel[94].rotateAngleZ = 2.268928F;

		bodyModel[95].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import Wl5
		bodyModel[95].setRotationPoint(-40F, -32F, 15.5F);
		bodyModel[95].rotateAngleY = 0.6108652F;
		bodyModel[95].rotateAngleZ = 2.268928F;

		bodyModel[96].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Import WR1
		bodyModel[96].setRotationPoint(-52F, -32F, -18F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WR2
		bodyModel[97].setRotationPoint(-51F, -32F, -16.5F);
		bodyModel[97].rotateAngleY = -0.9599311F;
		bodyModel[97].rotateAngleZ = 2.268928F;

		bodyModel[98].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WR3
		bodyModel[98].setRotationPoint(-48F, -32F, -16.5F);
		bodyModel[98].rotateAngleY = -0.8726646F;
		bodyModel[98].rotateAngleZ = 2.268928F;

		bodyModel[99].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WR4
		bodyModel[99].setRotationPoint(-45F, -32F, -16.5F);
		bodyModel[99].rotateAngleY = -0.8726646F;
		bodyModel[99].rotateAngleZ = 2.268928F;

		bodyModel[100].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Import WR5
		bodyModel[100].setRotationPoint(-42F, -32F, -16.5F);
		bodyModel[100].rotateAngleY = -0.6108652F;
		bodyModel[100].rotateAngleZ = 2.268928F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 115, 230, textureX, textureY); // Import Trennwand
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 125, 480, textureX, textureY); // Import Heckluke

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 1, 24, 15, 0F); // Import Trennwand
		bodyDoorOpenModel[0].setRotationPoint(27.5F, -26.5F, -7.5F);
		bodyDoorOpenModel[0].rotateAngleY = 2.094395F;

		bodyDoorOpenModel[1].addBox(0F, 0F, 0F, 27, 1, 24, 0F); // Import Heckluke
		bodyDoorOpenModel[1].setRotationPoint(-54F, 0F, -12F);
		bodyDoorOpenModel[1].rotateAngleZ = -2.77507351F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 115, 230, textureX, textureY); // Import Trennwand
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 125, 480, textureX, textureY); // Import Heckluke

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 1, 24, 15, 0F); // Import Trennwand
		bodyDoorCloseModel[0].setRotationPoint(26.5F, -26.5F, -7.5F);

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 27, 1, 24, 0F); // Import Heckluke
		bodyDoorCloseModel[1].setRotationPoint(-55F, 0F, -12F);
		bodyDoorCloseModel[1].rotateAngleZ = 1.605703F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 69, 138, textureX, textureY); // Import Turret1
		turretModel[1] = new ModelRendererTurbo(this, 340, 129, textureX, textureY); // Import Turret2
		turretModel[2] = new ModelRendererTurbo(this, 66, 70, textureX, textureY); // Import Turret3
		turretModel[3] = new ModelRendererTurbo(this, 275, 74, textureX, textureY); // Import Turret4
		turretModel[4] = new ModelRendererTurbo(this, 409, 91, textureX, textureY); // Import Turret5

		turretModel[0].addBox(-10F, -32F, -10F, 20, 1, 20, 0F); // Import Turret1
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(-13F, -46F, -13F, 23, 14, 26, 0F); // Import Turret2
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addTrapezoid(-17F, -46F, -13F, 4, 12, 26, 0F, -1.0F, ModelRendererTurbo.MR_RIGHT); // Import Turret3
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addTrapezoid(10F, -46F, -13F, 3, 13, 26, 0F, -1.0F, ModelRendererTurbo.MR_LEFT); // Import Turret4
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addTrapezoid(13F, -44F, -5F, 3, 7, 17, 0F, -1.5F, ModelRendererTurbo.MR_LEFT); // Import Turret5
		turretModel[4].setRotationPoint(0F, 0F, -4F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 590
		barrelModel[1] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 590
		barrelModel[2] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 590
		barrelModel[3] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 590
		barrelModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 590
		barrelModel[5] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 590
		barrelModel[6] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 590
		barrelModel[7] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 590
		barrelModel[8] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 590
		barrelModel[9] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 590
		barrelModel[10] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 590
		barrelModel[11] = new ModelRendererTurbo(this, 13, 99, textureX, textureY); // Box 590
		barrelModel[12] = new ModelRendererTurbo(this, 181, 144, textureX, textureY); // Box 590
		barrelModel[13] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 590
		barrelModel[14] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 590
		barrelModel[15] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 590
		barrelModel[16] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 590
		barrelModel[17] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 590
		barrelModel[18] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 590
		barrelModel[19] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 590
		barrelModel[20] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 590
		barrelModel[21] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 590
		barrelModel[22] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 590
		barrelModel[23] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 590
		barrelModel[24] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 590
		barrelModel[25] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 590
		barrelModel[26] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 590
		barrelModel[27] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 590
		barrelModel[28] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 590
		barrelModel[29] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 590

		barrelModel[0].addShapeBox(-4F, -3F, -4.5F, 8, 2, 9, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[0].setRotationPoint(14F, -39F, 0F);

		barrelModel[1].addShapeBox(0F, -5F, -4.5F, 4, 2, 9, 0F,0F, -0.25F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[1].setRotationPoint(14F, -39F, 0F);

		barrelModel[2].addShapeBox(-4F, -5F, -4.5F, 4, 2, 9, 0F,-2F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 590
		barrelModel[2].setRotationPoint(14F, -39F, 0F);

		barrelModel[3].addShapeBox(-4F, -1F, -4.5F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 590
		barrelModel[3].setRotationPoint(14F, -39F, 0F);

		barrelModel[4].addShapeBox(2.5F, -3F, -3F, 2, 2, 4, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[4].setRotationPoint(14F, -39F, 0F);

		barrelModel[5].addShapeBox(2.5F, -3F, -4F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 590
		barrelModel[5].setRotationPoint(14F, -39F, 0F);

		barrelModel[6].addShapeBox(4.5F, -3F, -2.8F, 9, 1, 2, 0F,0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 590
		barrelModel[6].setRotationPoint(14F, -39F, 0F);

		barrelModel[7].addShapeBox(4.5F, -1.5F, -2.3F, 9, 1, 1, 0F,0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F); // Box 590
		barrelModel[7].setRotationPoint(14F, -39F, 0F);

		barrelModel[8].addShapeBox(13.5F, -2F, -2.8F, 3, 1, 2, 0F,0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 590
		barrelModel[8].setRotationPoint(14F, -39F, 0F);

		barrelModel[9].addShapeBox(13.5F, -1.5F, -2.8F, 3, 1, 2, 0F,0F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.55F, -1F, -0.5F, -0.55F, -1F, -0.5F, -0.55F, -1F, 0F, -0.55F, -1F); // Box 590
		barrelModel[9].setRotationPoint(14F, -39F, 0F);

		barrelModel[10].addShapeBox(13.5F, -3.7F, -2.8F, 3, 1, 2, 0F,0F, -0.55F, -1F, -0.5F, -0.55F, -1F, -0.5F, -0.55F, -1F, 0F, -0.55F, -1F, 0F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 590
		barrelModel[10].setRotationPoint(14F, -39F, 0F);

		barrelModel[11].addShapeBox(16F, -2.6F, -2.3F, 19, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0.25F); // Box 590
		barrelModel[11].setRotationPoint(14F, -39F, 0F);

		barrelModel[12].addShapeBox(16F, -2.6F, -2.3F, 19, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F); // Box 590
		barrelModel[12].setRotationPoint(14F, -39F, 0F);

		barrelModel[13].addShapeBox(16F, -2.6F, -2.3F, 19, 1, 1, 0F,0F, -0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.25F); // Box 590
		barrelModel[13].setRotationPoint(14F, -39F, 0F);

		barrelModel[14].addShapeBox(33F, -2.6F, -3.3F, 1, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[14].setRotationPoint(14F, -39F, 0F);

		barrelModel[15].addShapeBox(33F, -2.6F, -1.3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 590
		barrelModel[15].setRotationPoint(14F, -39F, 0F);

		barrelModel[16].addShapeBox(33F, -3.6F, -2.3F, 1, 1, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[16].setRotationPoint(14F, -39F, 0F);

		barrelModel[17].addShapeBox(33F, -1.6F, -2.3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 590
		barrelModel[17].setRotationPoint(14F, -39F, 0F);

		barrelModel[18].addShapeBox(35F, -2.6F, -3.3F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[18].setRotationPoint(14F, -39F, 0F);

		barrelModel[19].addShapeBox(35F, -2.6F, -1.3F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 590
		barrelModel[19].setRotationPoint(14F, -39F, 0F);

		barrelModel[20].addShapeBox(35.5F, -2.6F, -1.3F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 590
		barrelModel[20].setRotationPoint(14F, -39F, 0F);

		barrelModel[21].addShapeBox(35.5F, -2.6F, -3.3F, 1, 1, 1, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 590
		barrelModel[21].setRotationPoint(14F, -39F, 0F);

		barrelModel[22].addShapeBox(37.5F, -2.6F, -1.3F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 590
		barrelModel[22].setRotationPoint(14F, -39F, 0F);

		barrelModel[23].addShapeBox(37.5F, -2.6F, -3.3F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[23].setRotationPoint(14F, -39F, 0F);

		barrelModel[24].addShapeBox(35F, -3.6F, -3.3F, 3, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 590
		barrelModel[24].setRotationPoint(14F, -39F, 0F);

		barrelModel[25].addShapeBox(35F, -1.6F, -3.3F, 3, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 590
		barrelModel[25].setRotationPoint(14F, -39F, 0F);

		barrelModel[26].addShapeBox(4.5F, -3F, -1F, 5, 2, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelModel[26].setRotationPoint(14F, -39F, 0F);

		barrelModel[27].addShapeBox(9.5F, -3F, -1F, 7, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 590
		barrelModel[27].setRotationPoint(14F, -39F, 0F);

		barrelModel[28].addShapeBox(13.5F, -2.2F, -2.8F, 3, 1, 2, 0F,0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 590
		barrelModel[28].setRotationPoint(14F, -40F, 0F);

		barrelModel[29].addShapeBox(4.5F, -1F, -2.8F, 9, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 590
		barrelModel[29].setRotationPoint(14F, -40F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[28] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[29] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[30] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[31] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[32] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[33] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[34] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[35] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[36] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[37] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[38] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[39] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[40] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[41] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[42] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[43] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[44] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[45] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[46] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[47] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[48] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[49] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[50] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[51] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[52] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[53] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[54] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[55] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[56] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[57] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[58] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[59] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[60] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[61] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[62] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[63] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[64] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[65] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[66] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[67] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[68] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[69] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[70] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[71] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[72] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[73] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[74] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[75] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[76] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[77] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[78] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[79] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[80] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[81] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[82] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[83] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[84] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[85] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[86] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[87] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[88] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[89] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[90] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[91] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[92] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[93] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[94] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[95] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[96] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[97] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[98] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[99] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[100] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[101] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[102] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[103] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[104] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[105] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[106] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[107] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[108] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[109] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[110] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[111] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[112] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[113] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[114] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[115] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[116] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[117] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[118] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[119] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[120] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[121] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[122] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[123] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[124] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[125] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[126] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[127] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[128] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[129] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[130] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[131] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[132] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[133] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[134] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[135] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[136] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[137] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[138] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 590
		leftFrontWheelModel[139] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[140] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[141] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[142] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[143] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[144] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[145] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[146] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[147] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[148] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[149] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[150] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[151] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[152] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[153] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[154] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 590
		leftFrontWheelModel[155] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[156] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[157] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[158] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 590
		leftFrontWheelModel[159] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[160] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[161] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[162] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[163] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[164] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[165] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[166] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[167] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 590
		leftFrontWheelModel[168] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 590

		leftFrontWheelModel[0].addShapeBox(0F, -11.5F, 0F, 6, 3, 8, 0F,0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[0].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[1].addShapeBox(-6F, -11.5F, 0F, 6, 3, 8, 0F,-0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F); // Box 590
		leftFrontWheelModel[1].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[2].addShapeBox(8.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F); // Box 590
		leftFrontWheelModel[2].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[3].addShapeBox(8.5F, -6F, 0F, 3, 6, 8, 0F,1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[3].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[4].addShapeBox(-11.5F, -6F, 0F, 3, 6, 8, 0F,-1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[4].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[5].addShapeBox(-11.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F); // Box 590
		leftFrontWheelModel[5].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[6].addShapeBox(-6F, 8.5F, 0F, 6, 3, 8, 0F,-1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[6].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[7].addShapeBox(0F, 8.5F, 0F, 6, 3, 8, 0F,0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[7].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[8].addShapeBox(-10.5F, 7F, 0F, 6, 3, 8, 0F,-3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F); // Box 590
		leftFrontWheelModel[8].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[9].addShapeBox(4.5F, 7F, 0F, 6, 3, 8, 0F,0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[9].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[10].addShapeBox(-4F, -8.5F, 0F, 4, 3, 8, 0F,0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F); // Box 590
		leftFrontWheelModel[10].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[11].addShapeBox(0F, -8.5F, 0F, 4, 3, 8, 0F,0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[11].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[12].addShapeBox(5.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[12].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[13].addShapeBox(5.5F, -4F, 0F, 3, 4, 8, 0F,0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[13].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[14].addShapeBox(-8.5F, -4F, 0F, 3, 4, 8, 0F,-1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[14].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[15].addShapeBox(-8.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F); // Box 590
		leftFrontWheelModel[15].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[16].addShapeBox(0F, 5.5F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[16].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[17].addShapeBox(-4F, 5.5F, 0F, 4, 3, 8, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F); // Box 590
		leftFrontWheelModel[17].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[18].addShapeBox(-10.5F, -10F, 0F, 6, 3, 8, 0F,-0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F); // Box 590
		leftFrontWheelModel[18].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[19].addShapeBox(4.5F, -10F, 0F, 6, 3, 8, 0F,-1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[19].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[20].addShapeBox(3F, -7.5F, 0F, 4, 3, 8, 0F,-1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 590
		leftFrontWheelModel[20].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[21].addShapeBox(-7F, -7.5F, 0F, 4, 3, 8, 0F,0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F); // Box 590
		leftFrontWheelModel[21].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[22].addShapeBox(-7F, 4.5F, 0F, 4, 3, 8, 0F,-2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F); // Box 590
		leftFrontWheelModel[22].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[23].addShapeBox(3F, 4.5F, 0F, 4, 3, 8, 0F,0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F); // Box 590
		leftFrontWheelModel[23].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[24].addShapeBox(-5.5F, -5.5F, 0F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[24].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[25].addShapeBox(-5.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 590
		leftFrontWheelModel[25].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[26].addShapeBox(2.5F, -5.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[26].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[27].addShapeBox(2.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[27].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[28].addShapeBox(-0.5F, -5.5F, 0F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[28].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[29].addShapeBox(-2.5F, -2.5F, 7F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[29].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[30].addShapeBox(2.5F, -2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[30].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[31].addShapeBox(2.5F, 0.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[31].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[32].addShapeBox(-4.5F, 0.5F, 7F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[32].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[33].addShapeBox(-4.5F, -2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[33].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[34].addShapeBox(0.5F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[34].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[35].addShapeBox(-2.5F, -4.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[35].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[36].addShapeBox(-5F, -4.5F, 7F, 2, 2, 1, 0F,-1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 590
		leftFrontWheelModel[36].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[37].addShapeBox(3F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[37].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[38].addShapeBox(3F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[38].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[39].addShapeBox(-5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F); // Box 590
		leftFrontWheelModel[39].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[40].addShapeBox(0.5F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[40].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[41].addShapeBox(-2.5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[41].setRotationPoint(49.5F, -2F, 17F);

		leftFrontWheelModel[42].addShapeBox(0F, -11.5F, 0F, 6, 3, 8, 0F,0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[42].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[43].addShapeBox(-6F, -11.5F, 0F, 6, 3, 8, 0F,-0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F); // Box 590
		leftFrontWheelModel[43].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[44].addShapeBox(8.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F); // Box 590
		leftFrontWheelModel[44].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[45].addShapeBox(8.5F, -6F, 0F, 3, 6, 8, 0F,1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[45].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[46].addShapeBox(-11.5F, -6F, 0F, 3, 6, 8, 0F,-1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[46].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[47].addShapeBox(-11.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F); // Box 590
		leftFrontWheelModel[47].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[48].addShapeBox(-6F, 8.5F, 0F, 6, 3, 8, 0F,-1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[48].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[49].addShapeBox(0F, 8.5F, 0F, 6, 3, 8, 0F,0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[49].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[50].addShapeBox(-10.5F, 7F, 0F, 6, 3, 8, 0F,-3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F); // Box 590
		leftFrontWheelModel[50].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[51].addShapeBox(4.5F, 7F, 0F, 6, 3, 8, 0F,0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[51].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[52].addShapeBox(-4F, -8.5F, 0F, 4, 3, 8, 0F,0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F); // Box 590
		leftFrontWheelModel[52].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[53].addShapeBox(0F, -8.5F, 0F, 4, 3, 8, 0F,0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[53].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[54].addShapeBox(5.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[54].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[55].addShapeBox(5.5F, -4F, 0F, 3, 4, 8, 0F,0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[55].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[56].addShapeBox(-8.5F, -4F, 0F, 3, 4, 8, 0F,-1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[56].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[57].addShapeBox(-8.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F); // Box 590
		leftFrontWheelModel[57].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[58].addShapeBox(0F, 5.5F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[58].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[59].addShapeBox(-4F, 5.5F, 0F, 4, 3, 8, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F); // Box 590
		leftFrontWheelModel[59].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[60].addShapeBox(-10.5F, -10F, 0F, 6, 3, 8, 0F,-0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F); // Box 590
		leftFrontWheelModel[60].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[61].addShapeBox(4.5F, -10F, 0F, 6, 3, 8, 0F,-1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[61].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[62].addShapeBox(3F, -7.5F, 0F, 4, 3, 8, 0F,-1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 590
		leftFrontWheelModel[62].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[63].addShapeBox(-7F, -7.5F, 0F, 4, 3, 8, 0F,0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F); // Box 590
		leftFrontWheelModel[63].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[64].addShapeBox(-7F, 4.5F, 0F, 4, 3, 8, 0F,-2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F); // Box 590
		leftFrontWheelModel[64].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[65].addShapeBox(3F, 4.5F, 0F, 4, 3, 8, 0F,0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F); // Box 590
		leftFrontWheelModel[65].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[66].addShapeBox(-5.5F, -5.5F, 0F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[66].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[67].addShapeBox(-5.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 590
		leftFrontWheelModel[67].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[68].addShapeBox(2.5F, -5.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[68].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[69].addShapeBox(2.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[69].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[70].addShapeBox(-0.5F, -5.5F, 0F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[70].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[71].addShapeBox(-2.5F, -2.5F, 7F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[71].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[72].addShapeBox(2.5F, -2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[72].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[73].addShapeBox(2.5F, 0.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[73].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[74].addShapeBox(-4.5F, 0.5F, 7F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[74].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[75].addShapeBox(-4.5F, -2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[75].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[76].addShapeBox(0.5F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[76].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[77].addShapeBox(-2.5F, -4.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[77].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[78].addShapeBox(-5F, -4.5F, 7F, 2, 2, 1, 0F,-1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 590
		leftFrontWheelModel[78].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[79].addShapeBox(3F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[79].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[80].addShapeBox(3F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[80].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[81].addShapeBox(-5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F); // Box 590
		leftFrontWheelModel[81].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[82].addShapeBox(0.5F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[82].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[83].addShapeBox(-2.5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[83].setRotationPoint(21.5F, -2F, 17F);

		leftFrontWheelModel[84].addShapeBox(0F, -11.5F, 0F, 6, 3, 8, 0F,0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[84].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[85].addShapeBox(-6F, -11.5F, 0F, 6, 3, 8, 0F,-0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F); // Box 590
		leftFrontWheelModel[85].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[86].addShapeBox(8.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F); // Box 590
		leftFrontWheelModel[86].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[87].addShapeBox(8.5F, -6F, 0F, 3, 6, 8, 0F,1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[87].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[88].addShapeBox(-11.5F, -6F, 0F, 3, 6, 8, 0F,-1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[88].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[89].addShapeBox(-11.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F); // Box 590
		leftFrontWheelModel[89].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[90].addShapeBox(-6F, 8.5F, 0F, 6, 3, 8, 0F,-1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[90].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[91].addShapeBox(0F, 8.5F, 0F, 6, 3, 8, 0F,0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[91].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[92].addShapeBox(-10.5F, 7F, 0F, 6, 3, 8, 0F,-3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F); // Box 590
		leftFrontWheelModel[92].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[93].addShapeBox(4.5F, 7F, 0F, 6, 3, 8, 0F,0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[93].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[94].addShapeBox(-4F, -8.5F, 0F, 4, 3, 8, 0F,0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F); // Box 590
		leftFrontWheelModel[94].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[95].addShapeBox(0F, -8.5F, 0F, 4, 3, 8, 0F,0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[95].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[96].addShapeBox(5.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[96].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[97].addShapeBox(5.5F, -4F, 0F, 3, 4, 8, 0F,0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[97].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[98].addShapeBox(-8.5F, -4F, 0F, 3, 4, 8, 0F,-1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[98].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[99].addShapeBox(-8.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F); // Box 590
		leftFrontWheelModel[99].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[100].addShapeBox(0F, 5.5F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[100].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[101].addShapeBox(-4F, 5.5F, 0F, 4, 3, 8, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F); // Box 590
		leftFrontWheelModel[101].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[102].addShapeBox(-10.5F, -10F, 0F, 6, 3, 8, 0F,-0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F); // Box 590
		leftFrontWheelModel[102].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[103].addShapeBox(4.5F, -10F, 0F, 6, 3, 8, 0F,-1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[103].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[104].addShapeBox(3F, -7.5F, 0F, 4, 3, 8, 0F,-1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 590
		leftFrontWheelModel[104].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[105].addShapeBox(-7F, -7.5F, 0F, 4, 3, 8, 0F,0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F); // Box 590
		leftFrontWheelModel[105].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[106].addShapeBox(-7F, 4.5F, 0F, 4, 3, 8, 0F,-2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F); // Box 590
		leftFrontWheelModel[106].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[107].addShapeBox(3F, 4.5F, 0F, 4, 3, 8, 0F,0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F); // Box 590
		leftFrontWheelModel[107].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[108].addShapeBox(-5.5F, -5.5F, 0F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[108].setRotationPoint(-11F, -2F, 17F);

		leftFrontWheelModel[109].addShapeBox(-5.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 590
		leftFrontWheelModel[109].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[110].addShapeBox(2.5F, -5.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[110].setRotationPoint(-11F, -2F, 17F);

		leftFrontWheelModel[111].addShapeBox(2.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[111].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[112].addShapeBox(-0.5F, -5.5F, 0F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[112].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[113].addShapeBox(-2.5F, -2.5F, 7F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[113].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[114].addShapeBox(2.5F, -2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[114].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[115].addShapeBox(2.5F, 0.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[115].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[116].addShapeBox(-4.5F, 0.5F, 7F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[116].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[117].addShapeBox(-4.5F, -2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[117].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[118].addShapeBox(0.5F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[118].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[119].addShapeBox(-2.5F, -4.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[119].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[120].addShapeBox(-5F, -4.5F, 7F, 2, 2, 1, 0F,-1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 590
		leftFrontWheelModel[120].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[121].addShapeBox(3F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[121].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[122].addShapeBox(3F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[122].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[123].addShapeBox(-5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F); // Box 590
		leftFrontWheelModel[123].setRotationPoint(-11F, -2F, 17F);

		leftFrontWheelModel[124].addShapeBox(0.5F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[124].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[125].addShapeBox(-2.5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[125].setRotationPoint(-10F, -2F, 18F);

		leftFrontWheelModel[126].addShapeBox(0F, -11.5F, 0F, 6, 3, 8, 0F,0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[126].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[127].addShapeBox(-6F, -11.5F, 0F, 6, 3, 8, 0F,-0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F); // Box 590
		leftFrontWheelModel[127].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[128].addShapeBox(8.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F); // Box 590
		leftFrontWheelModel[128].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[129].addShapeBox(8.5F, -6F, 0F, 3, 6, 8, 0F,1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[129].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[130].addShapeBox(-11.5F, -6F, 0F, 3, 6, 8, 0F,-1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[130].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[131].addShapeBox(-11.5F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F); // Box 590
		leftFrontWheelModel[131].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[132].addShapeBox(-6F, 8.5F, 0F, 6, 3, 8, 0F,-1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 1F, 0F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[132].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[133].addShapeBox(0F, 8.5F, 0F, 6, 3, 8, 0F,0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[133].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[134].addShapeBox(-10.5F, 7F, 0F, 6, 3, 8, 0F,-3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F); // Box 590
		leftFrontWheelModel[134].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[135].addShapeBox(4.5F, 7F, 0F, 6, 3, 8, 0F,0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[135].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[136].addShapeBox(-4F, -8.5F, 0F, 4, 3, 8, 0F,0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F); // Box 590
		leftFrontWheelModel[136].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[137].addShapeBox(0F, -8.5F, 0F, 4, 3, 8, 0F,0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[137].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[138].addShapeBox(5.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F); // Box 590
		leftFrontWheelModel[138].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[139].addShapeBox(5.5F, -4F, 0F, 3, 4, 8, 0F,0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 590
		leftFrontWheelModel[139].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[140].addShapeBox(-8.5F, -4F, 0F, 3, 4, 8, 0F,-1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[140].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[141].addShapeBox(-8.5F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F); // Box 590
		leftFrontWheelModel[141].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[142].addShapeBox(0F, 5.5F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[142].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[143].addShapeBox(-4F, 5.5F, 0F, 4, 3, 8, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -1F, 0F); // Box 590
		leftFrontWheelModel[143].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[144].addShapeBox(-10.5F, -10F, 0F, 6, 3, 8, 0F,-0.5F, -4.25F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F); // Box 590
		leftFrontWheelModel[144].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[145].addShapeBox(4.5F, -10F, 0F, 6, 3, 8, 0F,-1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[145].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[146].addShapeBox(3F, -7.5F, 0F, 4, 3, 8, 0F,-1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 590
		leftFrontWheelModel[146].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[147].addShapeBox(-7F, -7.5F, 0F, 4, 3, 8, 0F,0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F); // Box 590
		leftFrontWheelModel[147].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[148].addShapeBox(-7F, 4.5F, 0F, 4, 3, 8, 0F,-2F, 2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F); // Box 590
		leftFrontWheelModel[148].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[149].addShapeBox(3F, 4.5F, 0F, 4, 3, 8, 0F,0.5F, -0.5F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F); // Box 590
		leftFrontWheelModel[149].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[150].addShapeBox(-5.5F, -5.5F, 0F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[150].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[151].addShapeBox(-5.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 590
		leftFrontWheelModel[151].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[152].addShapeBox(2.5F, -5.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[152].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[153].addShapeBox(2.5F, -0.5F, 0F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[153].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[154].addShapeBox(-0.5F, -5.5F, 0F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[154].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[155].addShapeBox(-2.5F, -2.5F, 7F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[155].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[156].addShapeBox(2.5F, -2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[156].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[157].addShapeBox(2.5F, 0.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[157].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[158].addShapeBox(-4.5F, 0.5F, 7F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[158].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[159].addShapeBox(-4.5F, -2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 590
		leftFrontWheelModel[159].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[160].addShapeBox(0.5F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[160].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[161].addShapeBox(-2.5F, -4.5F, 7F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftFrontWheelModel[161].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[162].addShapeBox(-5F, -4.5F, 7F, 2, 2, 1, 0F,-1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Box 590
		leftFrontWheelModel[162].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[163].addShapeBox(3F, -4.5F, 7F, 2, 2, 1, 0F,0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[163].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[164].addShapeBox(3F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[164].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[165].addShapeBox(-5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F); // Box 590
		leftFrontWheelModel[165].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[166].addShapeBox(0.5F, 2.5F, 7F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F); // Box 590
		leftFrontWheelModel[166].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[167].addShapeBox(-2.5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 590
		leftFrontWheelModel[167].setRotationPoint(-39.5F, -2F, 17F);

		leftFrontWheelModel[168].addShapeBox(-5F, 2.5F, 7F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F); // Box 590
		leftFrontWheelModel[168].setRotationPoint(-10F, -2F, 18F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 951
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 952
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 953
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 954
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 955
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 956
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 957
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 958
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 959
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 960
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 961
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 962
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 963
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 964
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 965
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 966
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 967
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 968
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 969
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 970
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 971
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 972
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 973
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 974
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 975
		rightFrontWheelModel[25] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 976
		rightFrontWheelModel[26] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 977
		rightFrontWheelModel[27] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 978
		rightFrontWheelModel[28] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 979
		rightFrontWheelModel[29] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 981
		rightFrontWheelModel[30] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 982
		rightFrontWheelModel[31] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 983
		rightFrontWheelModel[32] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 984
		rightFrontWheelModel[33] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 985
		rightFrontWheelModel[34] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 986
		rightFrontWheelModel[35] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 987
		rightFrontWheelModel[36] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 988
		rightFrontWheelModel[37] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 989
		rightFrontWheelModel[38] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 990
		rightFrontWheelModel[39] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 991
		rightFrontWheelModel[40] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 992
		rightFrontWheelModel[41] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 993
		rightFrontWheelModel[42] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 951
		rightFrontWheelModel[43] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 952
		rightFrontWheelModel[44] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 953
		rightFrontWheelModel[45] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 954
		rightFrontWheelModel[46] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 955
		rightFrontWheelModel[47] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 956
		rightFrontWheelModel[48] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 957
		rightFrontWheelModel[49] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 958
		rightFrontWheelModel[50] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 959
		rightFrontWheelModel[51] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 960
		rightFrontWheelModel[52] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 961
		rightFrontWheelModel[53] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 962
		rightFrontWheelModel[54] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 963
		rightFrontWheelModel[55] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 964
		rightFrontWheelModel[56] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 965
		rightFrontWheelModel[57] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 966
		rightFrontWheelModel[58] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 967
		rightFrontWheelModel[59] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 968
		rightFrontWheelModel[60] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 969
		rightFrontWheelModel[61] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 970
		rightFrontWheelModel[62] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 971
		rightFrontWheelModel[63] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 972
		rightFrontWheelModel[64] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 973
		rightFrontWheelModel[65] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 974
		rightFrontWheelModel[66] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 975
		rightFrontWheelModel[67] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 976
		rightFrontWheelModel[68] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 977
		rightFrontWheelModel[69] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 978
		rightFrontWheelModel[70] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 979
		rightFrontWheelModel[71] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 981
		rightFrontWheelModel[72] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 982
		rightFrontWheelModel[73] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 983
		rightFrontWheelModel[74] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 984
		rightFrontWheelModel[75] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 985
		rightFrontWheelModel[76] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 986
		rightFrontWheelModel[77] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 987
		rightFrontWheelModel[78] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 988
		rightFrontWheelModel[79] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 989
		rightFrontWheelModel[80] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 990
		rightFrontWheelModel[81] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 991
		rightFrontWheelModel[82] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 992
		rightFrontWheelModel[83] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 993
		rightFrontWheelModel[84] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 951
		rightFrontWheelModel[85] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 952
		rightFrontWheelModel[86] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 953
		rightFrontWheelModel[87] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 954
		rightFrontWheelModel[88] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 955
		rightFrontWheelModel[89] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 956
		rightFrontWheelModel[90] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 957
		rightFrontWheelModel[91] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 958
		rightFrontWheelModel[92] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 959
		rightFrontWheelModel[93] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 960
		rightFrontWheelModel[94] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 961
		rightFrontWheelModel[95] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 962
		rightFrontWheelModel[96] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 963
		rightFrontWheelModel[97] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 964
		rightFrontWheelModel[98] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 965
		rightFrontWheelModel[99] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 966
		rightFrontWheelModel[100] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 967
		rightFrontWheelModel[101] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 968
		rightFrontWheelModel[102] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 969
		rightFrontWheelModel[103] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 970
		rightFrontWheelModel[104] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 971
		rightFrontWheelModel[105] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 972
		rightFrontWheelModel[106] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 973
		rightFrontWheelModel[107] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 974
		rightFrontWheelModel[108] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 975
		rightFrontWheelModel[109] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 976
		rightFrontWheelModel[110] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 977
		rightFrontWheelModel[111] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 978
		rightFrontWheelModel[112] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 979
		rightFrontWheelModel[113] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 981
		rightFrontWheelModel[114] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 982
		rightFrontWheelModel[115] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 983
		rightFrontWheelModel[116] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 984
		rightFrontWheelModel[117] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 985
		rightFrontWheelModel[118] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 986
		rightFrontWheelModel[119] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 987
		rightFrontWheelModel[120] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 988
		rightFrontWheelModel[121] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 989
		rightFrontWheelModel[122] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 990
		rightFrontWheelModel[123] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 991
		rightFrontWheelModel[124] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 992
		rightFrontWheelModel[125] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 993
		rightFrontWheelModel[126] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 951
		rightFrontWheelModel[127] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 952
		rightFrontWheelModel[128] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 953
		rightFrontWheelModel[129] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 954
		rightFrontWheelModel[130] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 955
		rightFrontWheelModel[131] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 956
		rightFrontWheelModel[132] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 957
		rightFrontWheelModel[133] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 958
		rightFrontWheelModel[134] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 959
		rightFrontWheelModel[135] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 960
		rightFrontWheelModel[136] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 961
		rightFrontWheelModel[137] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 962
		rightFrontWheelModel[138] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 963
		rightFrontWheelModel[139] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 964
		rightFrontWheelModel[140] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 965
		rightFrontWheelModel[141] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 966
		rightFrontWheelModel[142] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 967
		rightFrontWheelModel[143] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 968
		rightFrontWheelModel[144] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 969
		rightFrontWheelModel[145] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 970
		rightFrontWheelModel[146] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 971
		rightFrontWheelModel[147] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 972
		rightFrontWheelModel[148] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 973
		rightFrontWheelModel[149] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 974
		rightFrontWheelModel[150] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 976
		rightFrontWheelModel[151] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 978
		rightFrontWheelModel[152] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 979
		rightFrontWheelModel[153] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 981
		rightFrontWheelModel[154] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 982
		rightFrontWheelModel[155] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 983
		rightFrontWheelModel[156] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 984
		rightFrontWheelModel[157] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 985
		rightFrontWheelModel[158] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 986
		rightFrontWheelModel[159] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 987
		rightFrontWheelModel[160] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 988
		rightFrontWheelModel[161] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 990
		rightFrontWheelModel[162] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 991
		rightFrontWheelModel[163] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 992
		rightFrontWheelModel[164] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 993

		rightFrontWheelModel[0].addShapeBox(0F, -11.5F, -8F, 6, 3, 8, 0F,0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 951
		rightFrontWheelModel[0].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[1].addShapeBox(-6F, -11.5F, -8F, 6, 3, 8, 0F,-0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F); // Box 952
		rightFrontWheelModel[1].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[2].addShapeBox(8.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F); // Box 953
		rightFrontWheelModel[2].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[3].addShapeBox(8.5F, -6F, -8F, 3, 6, 8, 0F,1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 954
		rightFrontWheelModel[3].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[4].addShapeBox(-11.5F, -6F, -8F, 3, 6, 8, 0F,-1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 955
		rightFrontWheelModel[4].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[5].addShapeBox(-11.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F); // Box 956
		rightFrontWheelModel[5].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[6].addShapeBox(-6F, 8.5F, -8F, 6, 3, 8, 0F,-1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F); // Box 957
		rightFrontWheelModel[6].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[7].addShapeBox(0F, 8.5F, -8F, 6, 3, 8, 0F,0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F); // Box 958
		rightFrontWheelModel[7].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[8].addShapeBox(-10.5F, 7F, -8F, 6, 3, 8, 0F,-3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F); // Box 959
		rightFrontWheelModel[8].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[9].addShapeBox(4.5F, 7F, -8F, 6, 3, 8, 0F,0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F); // Box 960
		rightFrontWheelModel[9].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[10].addShapeBox(-4F, -8.5F, -8F, 4, 3, 8, 0F,0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 961
		rightFrontWheelModel[10].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[11].addShapeBox(0F, -8.5F, -8F, 4, 3, 8, 0F,0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 962
		rightFrontWheelModel[11].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[12].addShapeBox(5.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F); // Box 963
		rightFrontWheelModel[12].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[13].addShapeBox(5.5F, -4F, -8F, 3, 4, 8, 0F,0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 964
		rightFrontWheelModel[13].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[14].addShapeBox(-8.5F, -4F, -8F, 3, 4, 8, 0F,-1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 965
		rightFrontWheelModel[14].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[15].addShapeBox(-8.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F); // Box 966
		rightFrontWheelModel[15].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[16].addShapeBox(0F, 5.5F, -8F, 4, 3, 8, 0F,0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 967
		rightFrontWheelModel[16].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[17].addShapeBox(-4F, 5.5F, -8F, 4, 3, 8, 0F,-1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F); // Box 968
		rightFrontWheelModel[17].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[18].addShapeBox(-10.5F, -10F, -8F, 6, 3, 8, 0F,-0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F); // Box 969
		rightFrontWheelModel[18].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[19].addShapeBox(4.5F, -10F, -8F, 6, 3, 8, 0F,-1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 970
		rightFrontWheelModel[19].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[20].addShapeBox(3F, -7.5F, -8F, 4, 3, 8, 0F,-1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F); // Box 971
		rightFrontWheelModel[20].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[21].addShapeBox(-7F, -7.5F, -8F, 4, 3, 8, 0F,0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F); // Box 972
		rightFrontWheelModel[21].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[22].addShapeBox(-7F, 4.5F, -8F, 4, 3, 8, 0F,-2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F); // Box 973
		rightFrontWheelModel[22].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[23].addShapeBox(3F, 4.5F, -8F, 4, 3, 8, 0F,0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 974
		rightFrontWheelModel[23].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[24].addShapeBox(-5.5F, -5.5F, -7F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 975
		rightFrontWheelModel[24].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[25].addShapeBox(-5.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 976
		rightFrontWheelModel[25].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[26].addShapeBox(2.5F, -5.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 977
		rightFrontWheelModel[26].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[27].addShapeBox(2.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 978
		rightFrontWheelModel[27].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[28].addShapeBox(-0.5F, -5.5F, -7F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 979
		rightFrontWheelModel[28].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[29].addShapeBox(-2.5F, -2.5F, -8F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		rightFrontWheelModel[29].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[30].addShapeBox(2.5F, -2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 982
		rightFrontWheelModel[30].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[31].addShapeBox(2.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 983
		rightFrontWheelModel[31].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[32].addShapeBox(-4.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 984
		rightFrontWheelModel[32].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[33].addShapeBox(-4.5F, -2.5F, -8F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 985
		rightFrontWheelModel[33].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[34].addShapeBox(0.5F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 986
		rightFrontWheelModel[34].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[35].addShapeBox(-2.5F, -4.5F, -8F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 987
		rightFrontWheelModel[35].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[36].addShapeBox(-5F, -4.5F, -8F, 2, 2, 1, 0F,-1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 988
		rightFrontWheelModel[36].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[37].addShapeBox(3F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 989
		rightFrontWheelModel[37].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[38].addShapeBox(3F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F); // Box 990
		rightFrontWheelModel[38].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[39].addShapeBox(-5F, 2.5F, -8F, 2, 2, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F); // Box 991
		rightFrontWheelModel[39].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[40].addShapeBox(0.5F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F); // Box 992
		rightFrontWheelModel[40].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[41].addShapeBox(-2.5F, 2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F); // Box 993
		rightFrontWheelModel[41].setRotationPoint(-39.5F, -2F, -16F);

		rightFrontWheelModel[42].addShapeBox(0F, -11.5F, -8F, 6, 3, 8, 0F,0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 951
		rightFrontWheelModel[42].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[43].addShapeBox(-6F, -11.5F, -8F, 6, 3, 8, 0F,-0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F); // Box 952
		rightFrontWheelModel[43].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[44].addShapeBox(8.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F); // Box 953
		rightFrontWheelModel[44].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[45].addShapeBox(8.5F, -6F, -8F, 3, 6, 8, 0F,1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 954
		rightFrontWheelModel[45].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[46].addShapeBox(-11.5F, -6F, -8F, 3, 6, 8, 0F,-1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 955
		rightFrontWheelModel[46].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[47].addShapeBox(-11.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F); // Box 956
		rightFrontWheelModel[47].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[48].addShapeBox(-6F, 8.5F, -8F, 6, 3, 8, 0F,-1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F); // Box 957
		rightFrontWheelModel[48].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[49].addShapeBox(0F, 8.5F, -8F, 6, 3, 8, 0F,0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F); // Box 958
		rightFrontWheelModel[49].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[50].addShapeBox(-10.5F, 7F, -8F, 6, 3, 8, 0F,-3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F); // Box 959
		rightFrontWheelModel[50].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[51].addShapeBox(4.5F, 7F, -8F, 6, 3, 8, 0F,0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F); // Box 960
		rightFrontWheelModel[51].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[52].addShapeBox(-4F, -8.5F, -8F, 4, 3, 8, 0F,0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 961
		rightFrontWheelModel[52].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[53].addShapeBox(0F, -8.5F, -8F, 4, 3, 8, 0F,0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 962
		rightFrontWheelModel[53].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[54].addShapeBox(5.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F); // Box 963
		rightFrontWheelModel[54].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[55].addShapeBox(5.5F, -4F, -8F, 3, 4, 8, 0F,0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 964
		rightFrontWheelModel[55].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[56].addShapeBox(-8.5F, -4F, -8F, 3, 4, 8, 0F,-1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 965
		rightFrontWheelModel[56].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[57].addShapeBox(-8.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F); // Box 966
		rightFrontWheelModel[57].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[58].addShapeBox(0F, 5.5F, -8F, 4, 3, 8, 0F,0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 967
		rightFrontWheelModel[58].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[59].addShapeBox(-4F, 5.5F, -8F, 4, 3, 8, 0F,-1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F); // Box 968
		rightFrontWheelModel[59].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[60].addShapeBox(-10.5F, -10F, -8F, 6, 3, 8, 0F,-0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F); // Box 969
		rightFrontWheelModel[60].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[61].addShapeBox(4.5F, -10F, -8F, 6, 3, 8, 0F,-1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 970
		rightFrontWheelModel[61].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[62].addShapeBox(3F, -7.5F, -8F, 4, 3, 8, 0F,-1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F); // Box 971
		rightFrontWheelModel[62].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[63].addShapeBox(-7F, -7.5F, -8F, 4, 3, 8, 0F,0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F); // Box 972
		rightFrontWheelModel[63].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[64].addShapeBox(-7F, 4.5F, -8F, 4, 3, 8, 0F,-2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F); // Box 973
		rightFrontWheelModel[64].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[65].addShapeBox(3F, 4.5F, -8F, 4, 3, 8, 0F,0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 974
		rightFrontWheelModel[65].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[66].addShapeBox(-5.5F, -5.5F, -7F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 975
		rightFrontWheelModel[66].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[67].addShapeBox(-5.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 976
		rightFrontWheelModel[67].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[68].addShapeBox(2.5F, -5.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 977
		rightFrontWheelModel[68].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[69].addShapeBox(2.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 978
		rightFrontWheelModel[69].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[70].addShapeBox(-0.5F, -5.5F, -7F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 979
		rightFrontWheelModel[70].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[71].addShapeBox(-2.5F, -2.5F, -8F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		rightFrontWheelModel[71].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[72].addShapeBox(2.5F, -2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 982
		rightFrontWheelModel[72].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[73].addShapeBox(2.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 983
		rightFrontWheelModel[73].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[74].addShapeBox(-4.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 984
		rightFrontWheelModel[74].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[75].addShapeBox(-4.5F, -2.5F, -8F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 985
		rightFrontWheelModel[75].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[76].addShapeBox(0.5F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 986
		rightFrontWheelModel[76].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[77].addShapeBox(-2.5F, -4.5F, -8F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 987
		rightFrontWheelModel[77].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[78].addShapeBox(-5F, -4.5F, -8F, 2, 2, 1, 0F,-1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 988
		rightFrontWheelModel[78].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[79].addShapeBox(3F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 989
		rightFrontWheelModel[79].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[80].addShapeBox(3F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F); // Box 990
		rightFrontWheelModel[80].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[81].addShapeBox(-5F, 2.5F, -8F, 2, 2, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F); // Box 991
		rightFrontWheelModel[81].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[82].addShapeBox(0.5F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F); // Box 992
		rightFrontWheelModel[82].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[83].addShapeBox(-2.5F, 2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F); // Box 993
		rightFrontWheelModel[83].setRotationPoint(21.5F, -2F, -16F);

		rightFrontWheelModel[84].addShapeBox(0F, -11.5F, -8F, 6, 3, 8, 0F,0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 951
		rightFrontWheelModel[84].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[85].addShapeBox(-6F, -11.5F, -8F, 6, 3, 8, 0F,-0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F); // Box 952
		rightFrontWheelModel[85].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[86].addShapeBox(8.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F); // Box 953
		rightFrontWheelModel[86].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[87].addShapeBox(8.5F, -6F, -8F, 3, 6, 8, 0F,1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 954
		rightFrontWheelModel[87].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[88].addShapeBox(-11.5F, -6F, -8F, 3, 6, 8, 0F,-1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 955
		rightFrontWheelModel[88].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[89].addShapeBox(-11.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F); // Box 956
		rightFrontWheelModel[89].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[90].addShapeBox(-6F, 8.5F, -8F, 6, 3, 8, 0F,-1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F); // Box 957
		rightFrontWheelModel[90].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[91].addShapeBox(0F, 8.5F, -8F, 6, 3, 8, 0F,0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F); // Box 958
		rightFrontWheelModel[91].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[92].addShapeBox(-10.5F, 7F, -8F, 6, 3, 8, 0F,-3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F); // Box 959
		rightFrontWheelModel[92].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[93].addShapeBox(4.5F, 7F, -8F, 6, 3, 8, 0F,0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F); // Box 960
		rightFrontWheelModel[93].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[94].addShapeBox(-4F, -8.5F, -8F, 4, 3, 8, 0F,0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 961
		rightFrontWheelModel[94].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[95].addShapeBox(0F, -8.5F, -8F, 4, 3, 8, 0F,0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 962
		rightFrontWheelModel[95].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[96].addShapeBox(5.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F); // Box 963
		rightFrontWheelModel[96].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[97].addShapeBox(5.5F, -4F, -8F, 3, 4, 8, 0F,0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 964
		rightFrontWheelModel[97].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[98].addShapeBox(-8.5F, -4F, -8F, 3, 4, 8, 0F,-1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 965
		rightFrontWheelModel[98].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[99].addShapeBox(-8.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F); // Box 966
		rightFrontWheelModel[99].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[100].addShapeBox(0F, 5.5F, -8F, 4, 3, 8, 0F,0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 967
		rightFrontWheelModel[100].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[101].addShapeBox(-4F, 5.5F, -8F, 4, 3, 8, 0F,-1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F); // Box 968
		rightFrontWheelModel[101].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[102].addShapeBox(-10.5F, -10F, -8F, 6, 3, 8, 0F,-0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F); // Box 969
		rightFrontWheelModel[102].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[103].addShapeBox(4.5F, -10F, -8F, 6, 3, 8, 0F,-1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 970
		rightFrontWheelModel[103].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[104].addShapeBox(3F, -7.5F, -8F, 4, 3, 8, 0F,-1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F); // Box 971
		rightFrontWheelModel[104].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[105].addShapeBox(-7F, -7.5F, -8F, 4, 3, 8, 0F,0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F); // Box 972
		rightFrontWheelModel[105].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[106].addShapeBox(-7F, 4.5F, -8F, 4, 3, 8, 0F,-2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F); // Box 973
		rightFrontWheelModel[106].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[107].addShapeBox(3F, 4.5F, -8F, 4, 3, 8, 0F,0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 974
		rightFrontWheelModel[107].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[108].addShapeBox(-5.5F, -5.5F, -7F, 3, 6, 7, 0F,-0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 975
		rightFrontWheelModel[108].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[109].addShapeBox(-5.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 976
		rightFrontWheelModel[109].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[110].addShapeBox(2.5F, -5.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 977
		rightFrontWheelModel[110].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[111].addShapeBox(2.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 978
		rightFrontWheelModel[111].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[112].addShapeBox(-0.5F, -5.5F, -7F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 979
		rightFrontWheelModel[112].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[113].addShapeBox(-2.5F, -2.5F, -8F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		rightFrontWheelModel[113].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[114].addShapeBox(2.5F, -2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 982
		rightFrontWheelModel[114].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[115].addShapeBox(2.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 983
		rightFrontWheelModel[115].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[116].addShapeBox(-4.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 984
		rightFrontWheelModel[116].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[117].addShapeBox(-4.5F, -2.5F, -8F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 985
		rightFrontWheelModel[117].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[118].addShapeBox(0.5F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 986
		rightFrontWheelModel[118].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[119].addShapeBox(-2.5F, -4.5F, -8F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 987
		rightFrontWheelModel[119].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[120].addShapeBox(-5F, -4.5F, -8F, 2, 2, 1, 0F,-1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 988
		rightFrontWheelModel[120].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[121].addShapeBox(3F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 989
		rightFrontWheelModel[121].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[122].addShapeBox(3F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F); // Box 990
		rightFrontWheelModel[122].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[123].addShapeBox(-5F, 2.5F, -8F, 2, 2, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F); // Box 991
		rightFrontWheelModel[123].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[124].addShapeBox(0.5F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F); // Box 992
		rightFrontWheelModel[124].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[125].addShapeBox(-2.5F, 2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F); // Box 993
		rightFrontWheelModel[125].setRotationPoint(-9.5F, -2F, -17F);

		rightFrontWheelModel[126].addShapeBox(0F, -11.5F, -8F, 6, 3, 8, 0F,0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 951
		rightFrontWheelModel[126].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[127].addShapeBox(-6F, -11.5F, -8F, 6, 3, 8, 0F,-0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F, -1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F); // Box 952
		rightFrontWheelModel[127].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[128].addShapeBox(8.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F); // Box 953
		rightFrontWheelModel[128].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[129].addShapeBox(8.5F, -6F, -8F, 3, 6, 8, 0F,1F, -1.75F, 0F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1F, 1F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 954
		rightFrontWheelModel[129].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[130].addShapeBox(-11.5F, -6F, -8F, 3, 6, 8, 0F,-1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 955
		rightFrontWheelModel[130].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[131].addShapeBox(-11.5F, 0F, -8F, 3, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, -0.25F, -0.5F, 1F, -1.75F, 0F, 1F, -1.75F, -0.5F, -1.5F, -0.25F, -1F); // Box 956
		rightFrontWheelModel[131].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[132].addShapeBox(-6F, 8.5F, -8F, 6, 3, 8, 0F,-1.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.75F, 1F, -0.5F, -0.25F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1.5F, -1F); // Box 957
		rightFrontWheelModel[132].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[133].addShapeBox(0F, 8.5F, -8F, 6, 3, 8, 0F,0F, 0F, 0F, -1.75F, 1F, 0F, -1.75F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -1F, 0F, 0F, -1F); // Box 958
		rightFrontWheelModel[133].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[134].addShapeBox(-10.5F, 7F, -8F, 6, 3, 8, 0F,-3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F, -0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F); // Box 959
		rightFrontWheelModel[134].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[135].addShapeBox(4.5F, 7F, -8F, 6, 3, 8, 0F,0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F); // Box 960
		rightFrontWheelModel[135].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[136].addShapeBox(-4F, -8.5F, -8F, 4, 3, 8, 0F,0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, -1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 961
		rightFrontWheelModel[136].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[137].addShapeBox(0F, -8.5F, -8F, 4, 3, 8, 0F,0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 962
		rightFrontWheelModel[137].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[138].addShapeBox(5.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F); // Box 963
		rightFrontWheelModel[138].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[139].addShapeBox(5.5F, -4F, -8F, 3, 4, 8, 0F,0.5F, -1.5F, -0.5F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 964
		rightFrontWheelModel[139].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[140].addShapeBox(-8.5F, -4F, -8F, 3, 4, 8, 0F,-1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 965
		rightFrontWheelModel[140].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[141].addShapeBox(-8.5F, 0F, -8F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.25F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, -1F, 0.25F, -0.5F); // Box 966
		rightFrontWheelModel[141].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[142].addShapeBox(0F, 5.5F, -8F, 4, 3, 8, 0F,0F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 967
		rightFrontWheelModel[142].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[143].addShapeBox(-4F, 5.5F, -8F, 4, 3, 8, 0F,-1.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F); // Box 968
		rightFrontWheelModel[143].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[144].addShapeBox(-10.5F, -10F, -8F, 6, 3, 8, 0F,-0.5F, -4.25F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.5F, -4.25F, -1F, -3F, 2.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, -3F, 2.75F, -0.5F); // Box 969
		rightFrontWheelModel[144].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[145].addShapeBox(4.5F, -10F, -8F, 6, 3, 8, 0F,-1.25F, 0F, -0.5F, -0.5F, -4.25F, -0.5F, -0.5F, -4.25F, -1F, -1.25F, 0F, -1F, 0.25F, -0.5F, 0F, -3F, 2.75F, 0F, -3F, 2.75F, -0.5F, 0.25F, -0.5F, -0.5F); // Box 970
		rightFrontWheelModel[145].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[146].addShapeBox(3F, -7.5F, -8F, 4, 3, 8, 0F,-1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F); // Box 971
		rightFrontWheelModel[146].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[147].addShapeBox(-7F, -7.5F, -8F, 4, 3, 8, 0F,0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F, -2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F); // Box 972
		rightFrontWheelModel[147].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[148].addShapeBox(-7F, 4.5F, -8F, 4, 3, 8, 0F,-2F, 2F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -2F, 2F, 0F, 0.5F, -3.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0.5F, -3.25F, -0.5F); // Box 973
		rightFrontWheelModel[148].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[149].addShapeBox(3F, 4.5F, -8F, 4, 3, 8, 0F,0.5F, -0.5F, -0.5F, -2F, 2F, -0.5F, -2F, 2F, 0F, 0.5F, -0.5F, 0F, -1.25F, 0F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, -0.5F, -1.25F, 0F, -0.5F); // Box 974
		rightFrontWheelModel[149].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[150].addShapeBox(-5.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F); // Box 976
		rightFrontWheelModel[150].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[151].addShapeBox(2.5F, -0.5F, -7F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F); // Box 978
		rightFrontWheelModel[151].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[152].addShapeBox(-0.5F, -5.5F, -7F, 3, 11, 7, 0F,-0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 979
		rightFrontWheelModel[152].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[153].addShapeBox(-2.5F, -2.5F, -8F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		rightFrontWheelModel[153].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[154].addShapeBox(2.5F, -2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 982
		rightFrontWheelModel[154].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[155].addShapeBox(2.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 983
		rightFrontWheelModel[155].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[156].addShapeBox(-4.5F, 0.5F, -8F, 2, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 984
		rightFrontWheelModel[156].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[157].addShapeBox(-4.5F, -2.5F, -8F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 985
		rightFrontWheelModel[157].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[158].addShapeBox(0.5F, -4.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 986
		rightFrontWheelModel[158].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[159].addShapeBox(-2.5F, -4.5F, -8F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 987
		rightFrontWheelModel[159].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[160].addShapeBox(-5F, -4.5F, -8F, 2, 2, 1, 0F,-1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 988
		rightFrontWheelModel[160].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[161].addShapeBox(3F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -1F, 0F, -1.25F, -0.75F, 0F, 0.5F, 0.5F, 0F); // Box 990
		rightFrontWheelModel[161].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[162].addShapeBox(-5F, 2.5F, -8F, 2, 2, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -0.75F, 0F); // Box 991
		rightFrontWheelModel[162].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[163].addShapeBox(0.5F, 2.5F, -8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F); // Box 992
		rightFrontWheelModel[163].setRotationPoint(49.5F, -2F, -17F);

		rightFrontWheelModel[164].addShapeBox(-2.5F, 2.5F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F); // Box 993
		rightFrontWheelModel[164].setRotationPoint(49.5F, -2F, -17F);
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import 

		steeringWheelModel[0].addBox(0F, -4F, -4F, 1, 8, 8, 0F); // Import 
		steeringWheelModel[0].setRotationPoint(50F, -11F, -8F);
		steeringWheelModel[0].rotateAngleZ = -0.19198621F;
	}
}