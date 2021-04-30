//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelModelADFX02Morgan extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelModelADFX02Morgan()
	{
		bodyModel = new ModelRendererTurbo[57];
		bodyModel[0] = new ModelRendererTurbo(this, 500, 116, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this, 114, 108, textureX, textureY); // Body10
		bodyModel[2] = new ModelRendererTurbo(this, 141, 261, textureX, textureY); // Body11
		bodyModel[3] = new ModelRendererTurbo(this, 492, 61, textureX, textureY); // Body12
		bodyModel[4] = new ModelRendererTurbo(this, 412, 15, textureX, textureY); // Body13
		bodyModel[5] = new ModelRendererTurbo(this, 565, 57, textureX, textureY); // Body14
		bodyModel[6] = new ModelRendererTurbo(this, 141, 261, textureX, textureY); // Body15
		bodyModel[7] = new ModelRendererTurbo(this, 231, 145, textureX, textureY); // Body16
		bodyModel[8] = new ModelRendererTurbo(this, 231, 138, textureX, textureY); // Body17
		bodyModel[9] = new ModelRendererTurbo(this, 193, 115, textureX, textureY); // Body18
		bodyModel[10] = new ModelRendererTurbo(this, 193, 124, textureX, textureY); // Body19
		bodyModel[11] = new ModelRendererTurbo(this, 580, 116, textureX, textureY); // Body2
		bodyModel[12] = new ModelRendererTurbo(this, 129, 158, textureX, textureY); // Body20
		bodyModel[13] = new ModelRendererTurbo(this, 156, 160, textureX, textureY); // Body21
		bodyModel[14] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Body22
		bodyModel[15] = new ModelRendererTurbo(this, 168, 236, textureX, textureY); // Body23
		bodyModel[16] = new ModelRendererTurbo(this, 141, 261, textureX, textureY); // Body24
		bodyModel[17] = new ModelRendererTurbo(this, 159, 266, textureX, textureY); // Body25
		bodyModel[18] = new ModelRendererTurbo(this, 6, 69, textureX, textureY); // Body26
		bodyModel[19] = new ModelRendererTurbo(this, 129, 158, textureX, textureY); // Body27
		bodyModel[20] = new ModelRendererTurbo(this, 141, 261, textureX, textureY); // Body3
		bodyModel[21] = new ModelRendererTurbo(this, 72, 304, textureX, textureY); // Body4
		bodyModel[22] = new ModelRendererTurbo(this, 569, 13, textureX, textureY); // Body5
		bodyModel[23] = new ModelRendererTurbo(this, 454, 155, textureX, textureY); // Body6
		bodyModel[24] = new ModelRendererTurbo(this, 141, 261, textureX, textureY); // Body7
		bodyModel[25] = new ModelRendererTurbo(this, 141, 262, textureX, textureY); // Body8
		bodyModel[26] = new ModelRendererTurbo(this, 10, 102, textureX, textureY); // Body9
		bodyModel[27] = new ModelRendererTurbo(this, 267, 69, textureX, textureY); // BWing1
		bodyModel[28] = new ModelRendererTurbo(this, 267, 113, textureX, textureY); // BWing2
		bodyModel[29] = new ModelRendererTurbo(this, 287, 200, textureX, textureY); // BWing3
		bodyModel[30] = new ModelRendererTurbo(this, 288, 155, textureX, textureY); // BWing4
		bodyModel[31] = new ModelRendererTurbo(this, 307, 13, textureX, textureY); // BWing5
		bodyModel[32] = new ModelRendererTurbo(this, 306, 41, textureX, textureY); // BWing6
		bodyModel[33] = new ModelRendererTurbo(this, 23, 164, textureX, textureY); // Cockpit1
		bodyModel[34] = new ModelRendererTurbo(this, 497, 15, textureX, textureY); // Cockpit2
		bodyModel[35] = new ModelRendererTurbo(this, 7, 323, textureX, textureY); // Cockpit3
		bodyModel[36] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Cockpit4
		bodyModel[37] = new ModelRendererTurbo(this, 22, 163, textureX, textureY); // Cockpit5
		bodyModel[38] = new ModelRendererTurbo(this, 10, 272, textureX, textureY); // CockpitControl1
		bodyModel[39] = new ModelRendererTurbo(this, 6, 184, textureX, textureY); // CockpitControl2
		bodyModel[40] = new ModelRendererTurbo(this, 3, 201, textureX, textureY); // CockpitControl3
		bodyModel[41] = new ModelRendererTurbo(this, 9, 252, textureX, textureY); // CockpitControl4
		bodyModel[42] = new ModelRendererTurbo(this, 4, 232, textureX, textureY); // CockpitControl5
		bodyModel[43] = new ModelRendererTurbo(this, 34, 287, textureX, textureY); // CockpitHud1
		bodyModel[44] = new ModelRendererTurbo(this, 8, 303, textureX, textureY); // CockpitHud2
		bodyModel[45] = new ModelRendererTurbo(this, 7, 286, textureX, textureY); // CockpitHud3
		bodyModel[46] = new ModelRendererTurbo(this, 37, 311, textureX, textureY); // CockpitHud4
		bodyModel[47] = new ModelRendererTurbo(this, 70, 207, textureX, textureY); // seat1
		bodyModel[48] = new ModelRendererTurbo(this, 50, 187, textureX, textureY); // seat10
		bodyModel[49] = new ModelRendererTurbo(this, 67, 185, textureX, textureY); // seat2
		bodyModel[50] = new ModelRendererTurbo(this, 114, 184, textureX, textureY); // seat4
		bodyModel[51] = new ModelRendererTurbo(this, 112, 220, textureX, textureY); // seat5
		bodyModel[52] = new ModelRendererTurbo(this, 104, 243, textureX, textureY); // seat6
		bodyModel[53] = new ModelRendererTurbo(this, 102, 283, textureX, textureY); // seat6
		bodyModel[54] = new ModelRendererTurbo(this, 82, 285, textureX, textureY); // seat7
		bodyModel[55] = new ModelRendererTurbo(this, 75, 245, textureX, textureY); // seat8
		bodyModel[56] = new ModelRendererTurbo(this, 51, 196, textureX, textureY); // seat9

		bodyModel[0].addShapeBox(163F, 2F, -4F, 13, 25, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2.6F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -15F, -2F, 0F, -19F, -3F, 0F, -19F, -3F, 0F, -15F, -2F); // Body1
		bodyModel[0].setRotationPoint(-114F, -49F, 0F);

		bodyModel[1].addBox(-86F, 2F, -11F, 14, 18, 22, 0F); // Body10
		bodyModel[1].setRotationPoint(-43F, -49F, 0F);

		bodyModel[2].addFlexBox(-64F, -15F, -6F, 2, 1, 12, 0F, 0.50F, -0.50F, -1.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Body11
		bodyModel[2].setRotationPoint(-43F, -49F, 0F);

		bodyModel[3].addBox(48F, -5F, -10F, 6, 18, 22, 0F); // Body12
		bodyModel[3].setRotationPoint(-115F, -49F, -1F);

		bodyModel[4].addFlexBox(39F, -17F, -11F, 15, 12, 22, 0F, 0F, 0.00F, -5.00F, -5.00F, ModelRendererTurbo.MR_TOP); // Body13
		bodyModel[4].setRotationPoint(-115F, -49F, 0F);

		bodyModel[5].addShapeBox(54F, -5F, -11F, 53, 22, 22, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F); // Body14
		bodyModel[5].setRotationPoint(-115F, -49F, 0F);

		bodyModel[6].addFlexBox(-62F, -14F, -11F, 2, 11, 1, 0F, 2.00F, -2.00F, -5.00F, 5.00F, ModelRendererTurbo.MR_TOP); // Body15
		bodyModel[6].setRotationPoint(-43F, -49F, 0F);

		bodyModel[7].addFlexBox(-61F, -5F, 10F, 11, 2, 1, 0F, -1.90F, 0.00F, 0F, 0F, ModelRendererTurbo.MR_RIGHT); // Body16
		bodyModel[7].setRotationPoint(-43F, -49F, 0F);

		bodyModel[8].addFlexBox(-61F, -5F, -11F, 11, 2, 1, 0F, -1.90F, 0.00F, 0F, 0F, ModelRendererTurbo.MR_RIGHT); // Body17
		bodyModel[8].setRotationPoint(-43F, -49F, 0F);

		bodyModel[9].addBox(-50F, -5F, 10F, 26, 2, 1, 0F); // Body18
		bodyModel[9].setRotationPoint(-43F, -49F, 0F);

		bodyModel[10].addBox(-50F, -5F, -11F, 26, 2, 1, 0F); // Body19
		bodyModel[10].setRotationPoint(-43F, -49F, 0F);

		bodyModel[11].addShapeBox(107F, -5F, -6F, 57, 22, 12, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, -2F, 0F); // Body2
		bodyModel[11].setRotationPoint(-115F, -49F, 0F);

		bodyModel[12].addFlexBox(-86F, -3F, 9F, 14, 5, 2, 0F, -1.00F, 0.00F, 6.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // Body20
		bodyModel[12].setRotationPoint(-43F, -49F, 0F);

		bodyModel[13].addBox(-72F, 13F, -11F, 13, 7, 22, 0F); // Body21
		bodyModel[13].setRotationPoint(-43F, -49F, 0F);

		bodyModel[14].addBox(-72F, -3F, 10F, 48, 16, 1, 0F); // Body22
		bodyModel[14].setRotationPoint(-43F, -49F, 0F);

		bodyModel[15].addBox(-72F, -3F, -11F, 48, 16, 1, 0F); // Body23
		bodyModel[15].setRotationPoint(-43F, -49F, 0F);

		bodyModel[16].addFlexBox(-62F, -14F, 10F, 2, 11, 1, 0F, 2.00F, -2.00F, 5.00F, -5.00F, ModelRendererTurbo.MR_TOP); // Body24
		bodyModel[16].setRotationPoint(-43F, -49F, 0F);

		bodyModel[17].addFlexBox(-59F, 13F, -11F, 41, 4, 22, 0F, 0.00F, 3.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // Body25
		bodyModel[17].setRotationPoint(-43F, -49F, 0F);

		bodyModel[18].addTrapezoid(-140F, 2F, -7F, 30, 14, 14, 0F, -6.80F, ModelRendererTurbo.MR_RIGHT); // Body26
		bodyModel[18].setRotationPoint(-43F, -49F, 0F);

		bodyModel[19].addFlexBox(-86F, -3F, -11F, 14, 5, 2, 0F, -1.00F, 0.00F, 0.00F, 6.00F, ModelRendererTurbo.MR_RIGHT); // Body27
		bodyModel[19].setRotationPoint(-43F, -49F, 0F);

		bodyModel[20].addFlexBox(-35F, -15F, 10F, 2, 11, 1, 0F, 0.00F, 0.00F, 5.00F, -5.00F, ModelRendererTurbo.MR_TOP); // Body3
		bodyModel[20].setRotationPoint(-43F, -49F, 0F);

		bodyModel[21].addShapeBox(107F, -17F, -11F, 76, 7, 22, 0F, 0F, 1F, -8F, -15F, -10F, -10.5F, -15F, -10F, -10.5F, 0F, 1F, -8F, 0F, 0F, -5F, 1F, 7F, -10F, 1F, 7F, -10F, 0F, 0F, -5F); // Body4
		bodyModel[21].setRotationPoint(-115F, -44F, 0F);

		bodyModel[22].addShapeBox(54F, -17F, -11F, 53, 12, 22, 0F, 0F, 0F, -5F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Body5
		bodyModel[22].setRotationPoint(-115F, -49F, 0F);

		bodyModel[23].addShapeBox(177F, 3F, -4F, 6, 24, 8, 0F, 0F, 0F, -2.6F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, -2.6F, 0F, -19F, -3F, -3F, -20F, -3F, -3F, -20F, -3F, 0F, -19F, -3F); // Body6
		bodyModel[23].setRotationPoint(-115F, -49F, 0F);

		bodyModel[24].addFlexBox(-35F, -15F, -11F, 2, 11, 1, 0F, 0.00F, 0.00F, -5.00F, 5.00F, ModelRendererTurbo.MR_TOP); // Body7
		bodyModel[24].setRotationPoint(-43F, -49F, 0F);

		bodyModel[25].addFlexBox(-35F, -16F, -6F, 2, 1, 12, 0F, 0.00F, 0.00F, -1.00F, -1.00F, ModelRendererTurbo.MR_TOP); // Body8
		bodyModel[25].setRotationPoint(-43F, -49F, 0F);

		bodyModel[26].addTrapezoid(-110F, -2F, -11F, 24, 22, 22, 0F, -4.00F, ModelRendererTurbo.MR_RIGHT); // Body9
		bodyModel[26].setRotationPoint(-43F, -49F, 0F);

		bodyModel[27].addShapeBox(54F, -2F, -24F, 82, 11, 24, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // BWing1
		bodyModel[27].setRotationPoint(-115F, -49F, 0F);

		bodyModel[28].addShapeBox(54F, -2F, 0F, 82, 11, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // BWing2
		bodyModel[28].setRotationPoint(-115F, -49F, 0F);

		bodyModel[29].addShapeBox(136F, -2F, -24F, 48, 11, 24, 0F, 0F, -3F, 0F, 0F, -4F, -15F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -15F, 0F, -4F, 0F, 0F, 0F, 0F); // BWing3
		bodyModel[29].setRotationPoint(-115F, -49F, 0F);

		bodyModel[30].addShapeBox(136F, -2F, 0F, 48, 11, 24, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -15F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -15F, 0F, -3F, 0F); // BWing4
		bodyModel[30].setRotationPoint(-115F, -49F, 0F);

		bodyModel[31].addShapeBox(23F, -2F, -24F, 31, 5, 14, 0F, -18F, -1F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -18F, -1F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // BWing5
		bodyModel[31].setRotationPoint(-115F, -46F, 0F);

		bodyModel[32].addShapeBox(23F, -2F, 10F, 31, 5, 14, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -18F, -1F, -3F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -18F, -1F, -3F); // BWing6
		bodyModel[32].setRotationPoint(-115F, -46F, 0F);

		bodyModel[33].addBox(0F, -12F, -10F, 43, 15, 1, 0F); // Cockpit1
		bodyModel[33].setRotationPoint(-115F, -39F, 0F);

		bodyModel[34].addBox(39F, -15F, -10F, 9, 15, 20, 0F); // Cockpit2
		bodyModel[34].setRotationPoint(-115F, -39F, 0F);

		bodyModel[35].addBox(0F, -9F, -9F, 6, 9, 18, 0F); // Cockpit3
		bodyModel[35].setRotationPoint(-115F, -39F, 0F);

		bodyModel[36].addBox(0F, 0F, -9F, 48, 3, 18, 0F); // Cockpit4
		bodyModel[36].setRotationPoint(-115F, -39F, 0F);

		bodyModel[37].addBox(0F, -12F, 9F, 43, 15, 1, 0F); // Cockpit5
		bodyModel[37].setRotationPoint(-115F, -39F, 0F);

		bodyModel[38].addFlexBox(-9.8F, -12F, 2F, 12, 4, 6, 0F, -2.00F, 0.00F, 0.00F, -3.00F, ModelRendererTurbo.MR_RIGHT); // CockpitControl1
		bodyModel[38].setRotationPoint(-115F, -39F, 0F);
		bodyModel[38].rotateAngleZ = 0.17453293F;

		bodyModel[39].addFlexTrapezoid(0.2F, -13.3F, -4F, 6, 4, 10, 0F, 0.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // CockpitControl2
		bodyModel[39].setRotationPoint(-115F, -39F, -1F);

		bodyModel[40].addFlexTrapezoid(0F, -12.8F, -9F, 6, 4, 18, 0F, 0.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // CockpitControl3
		bodyModel[40].setRotationPoint(-115F, -39F, 0F);

		bodyModel[41].addFlexBox(-9.8F, -12F, -6F, 12, 4, 6, 0F, -2.00F, 0.00F, 0.00F, -3.00F, ModelRendererTurbo.MR_RIGHT); // CockpitControl4
		bodyModel[41].setRotationPoint(-115F, -39F, -2F);
		bodyModel[41].rotateAngleZ = 0.17453293F;

		bodyModel[42].addFlexBox(-10.5F, -13F, -5F, 13, 5, 10, 0F, -2.00F, 0F, -3.00F, -3.00F, ModelRendererTurbo.MR_RIGHT); // CockpitControl5
		bodyModel[42].setRotationPoint(-115F, -39F, 0F);
		bodyModel[42].rotateAngleZ = 0.17453293F;

		bodyModel[43].addShapeBox(2.15F, -18.3F, -4F, 0, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CockpitHud1
		bodyModel[43].setRotationPoint(-115F, -39F, 0F);

		bodyModel[44].addBox(1F, -18.3F, -4F, 1, 4, 8, 0F); // CockpitHud2
		bodyModel[44].setRotationPoint(-115F, -39F, 0F);

		bodyModel[45].addFlexBox(1F, -14.3F, -4F, 1, 1, 8, 0F, 0.00F, 0.00F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // CockpitHud3
		bodyModel[45].setRotationPoint(-115F, -39F, 0F);

		bodyModel[46].addFlexBox(1F, -19.3F, -3.5F, 1, 1, 3, 0F, 0F, 0F, 2.00F, 2.00F, ModelRendererTurbo.MR_BOTTOM); // CockpitHud4
		bodyModel[46].setRotationPoint(-115F, -39F, 2F);

		bodyModel[47].addFlexTrapezoid(19F, -14F, -7F, 4, 17, 14, 0F, -1.00F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // seat1
		bodyModel[47].setRotationPoint(-115F, -39F, 0F);

		bodyModel[48].addBox(10F, -1F, 3F, 2, 3, 4, 0F); // seat10
		bodyModel[48].setRotationPoint(-115F, -39F, 0F);

		bodyModel[49].addBox(12F, -1F, -7F, 7, 3, 14, 0F); // seat2
		bodyModel[49].setRotationPoint(-115F, -39F, 0F);

		bodyModel[50].addBox(23F, -14F, -7F, 2, 17, 14, 0F); // seat4
		bodyModel[50].setRotationPoint(-115F, -39F, 0F);

		bodyModel[51].addBox(20.5F, -20F, -4.5F, 4, 6, 9, 0F); // seat5
		bodyModel[51].setRotationPoint(-115F, -39F, 0F);

		bodyModel[52].addFlexTrapezoid(28F, -19F, -5F, 3, 24, 10, 0F, 0F, 0F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_TOP); // seat6
		bodyModel[52].setRotationPoint(-115F, -42F, 0F);

		bodyModel[53].addBox(22F, -22F, -5F, 3, 1, 10, 0F); // seat6
		bodyModel[53].setRotationPoint(-115F, -39F, 0F);

		bodyModel[54].addFlexTrapezoid(19F, -22F, -2.5F, 3, 1, 5, 0F, 0.00F, 0F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_TOP); // seat7
		bodyModel[54].setRotationPoint(-115F, -39F, 0F);

		bodyModel[55].addBox(25F, -19F, -5F, 3, 24, 10, 0F); // seat8
		bodyModel[55].setRotationPoint(-115F, -42F, 0F);

		bodyModel[56].addBox(10F, -1F, -7F, 2, 3, 4, 0F); // seat9
		bodyModel[56].setRotationPoint(-115F, -39F, 0F);


		noseModel = new ModelRendererTurbo[1];
		noseModel[0] = new ModelRendererTurbo(this, 15, 57, textureX, textureY); // NoseFiller1

		noseModel[0].addBox(-126F, 11.8F, -0.5F, 1, 1, 1, 0F); // NoseFiller1
		noseModel[0].setRotationPoint(-43F, -49F, 0F);


		tailModel = new ModelRendererTurbo[102];
		tailModel[0] = new ModelRendererTurbo(this, 6, 672, textureX, textureY); // Engine1
		tailModel[1] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine10
		tailModel[2] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine12
		tailModel[3] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine13
		tailModel[4] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine14
		tailModel[5] = new ModelRendererTurbo(this, 338, 585, textureX, textureY); // Engine15
		tailModel[6] = new ModelRendererTurbo(this, 3, 711, textureX, textureY); // Engine17
		tailModel[7] = new ModelRendererTurbo(this, 294, 806, textureX, textureY); // Engine18
		tailModel[8] = new ModelRendererTurbo(this, 175, 807, textureX, textureY); // Engine19
		tailModel[9] = new ModelRendererTurbo(this, 5, 594, textureX, textureY); // Engine2
		tailModel[10] = new ModelRendererTurbo(this, 175, 779, textureX, textureY); // Engine20
		tailModel[11] = new ModelRendererTurbo(this, 175, 743, textureX, textureY); // Engine21
		tailModel[12] = new ModelRendererTurbo(this, 175, 795, textureX, textureY); // Engine22
		tailModel[13] = new ModelRendererTurbo(this, 290, 779, textureX, textureY); // Engine23
		tailModel[14] = new ModelRendererTurbo(this, 113, 742, textureX, textureY); // Engine24
		tailModel[15] = new ModelRendererTurbo(this, 110, 740, textureX, textureY); // Engine25
		tailModel[16] = new ModelRendererTurbo(this, 112, 741, textureX, textureY); // Engine26
		tailModel[17] = new ModelRendererTurbo(this, 372, 649, textureX, textureY); // Engine27
		tailModel[18] = new ModelRendererTurbo(this, 372, 686, textureX, textureY); // Engine28
		tailModel[19] = new ModelRendererTurbo(this, 372, 719, textureX, textureY); // Engine29
		tailModel[20] = new ModelRendererTurbo(this, 6, 636, textureX, textureY); // Engine3
		tailModel[21] = new ModelRendererTurbo(this, 47, 710, textureX, textureY); // Engine30
		tailModel[22] = new ModelRendererTurbo(this, 6, 672, textureX, textureY); // Engine31
		tailModel[23] = new ModelRendererTurbo(this, 6, 636, textureX, textureY); // Engine32
		tailModel[24] = new ModelRendererTurbo(this, 105, 596, textureX, textureY); // Engine33
		tailModel[25] = new ModelRendererTurbo(this, 6, 739, textureX, textureY); // Engine34
		tailModel[26] = new ModelRendererTurbo(this, 85, 635, textureX, textureY); // Engine35
		tailModel[27] = new ModelRendererTurbo(this, 6, 739, textureX, textureY); // Engine36
		tailModel[28] = new ModelRendererTurbo(this, 6, 739, textureX, textureY); // Engine37
		tailModel[29] = new ModelRendererTurbo(this, 96, 687, textureX, textureY); // Engine38
		tailModel[30] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine39
		tailModel[31] = new ModelRendererTurbo(this, 105, 596, textureX, textureY); // Engine4
		tailModel[32] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine40
		tailModel[33] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine41
		tailModel[34] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine42
		tailModel[35] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine43
		tailModel[36] = new ModelRendererTurbo(this, 338, 585, textureX, textureY); // Engine44
		tailModel[37] = new ModelRendererTurbo(this, 345, 609, textureX, textureY); // Engine45
		tailModel[38] = new ModelRendererTurbo(this, 3, 711, textureX, textureY); // Engine46
		tailModel[39] = new ModelRendererTurbo(this, 294, 806, textureX, textureY); // Engine47
		tailModel[40] = new ModelRendererTurbo(this, 128, 750, textureX, textureY); // Engine48
		tailModel[41] = new ModelRendererTurbo(this, 111, 742, textureX, textureY); // Engine49
		tailModel[42] = new ModelRendererTurbo(this, 6, 739, textureX, textureY); // Engine5
		tailModel[43] = new ModelRendererTurbo(this, 111, 740, textureX, textureY); // Engine50
		tailModel[44] = new ModelRendererTurbo(this, 175, 743, textureX, textureY); // Engine51
		tailModel[45] = new ModelRendererTurbo(this, 175, 795, textureX, textureY); // Engine52
		tailModel[46] = new ModelRendererTurbo(this, 290, 779, textureX, textureY); // Engine53
		tailModel[47] = new ModelRendererTurbo(this, 47, 710, textureX, textureY); // Engine54
		tailModel[48] = new ModelRendererTurbo(this, 5, 594, textureX, textureY); // Engine54
		tailModel[49] = new ModelRendererTurbo(this, 175, 779, textureX, textureY); // Engine55
		tailModel[50] = new ModelRendererTurbo(this, 175, 807, textureX, textureY); // Engine55
		tailModel[51] = new ModelRendererTurbo(this, 372, 649, textureX, textureY); // Engine56
		tailModel[52] = new ModelRendererTurbo(this, 372, 686, textureX, textureY); // Engine57
		tailModel[53] = new ModelRendererTurbo(this, 372, 719, textureX, textureY); // Engine58
		tailModel[54] = new ModelRendererTurbo(this, 85, 635, textureX, textureY); // Engine6
		tailModel[55] = new ModelRendererTurbo(this, 96, 687, textureX, textureY); // Engine7
		tailModel[56] = new ModelRendererTurbo(this, 6, 739, textureX, textureY); // Engine8
		tailModel[57] = new ModelRendererTurbo(this, 6, 739, textureX, textureY); // Engine9
		tailModel[58] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod
		tailModel[59] = new ModelRendererTurbo(this, 88, 569, textureX, textureY); // TLSpod1
		tailModel[60] = new ModelRendererTurbo(this, 89, 547, textureX, textureY); // TLSpod10
		tailModel[61] = new ModelRendererTurbo(this, 89, 547, textureX, textureY); // TLSpod11
		tailModel[62] = new ModelRendererTurbo(this, 89, 547, textureX, textureY); // TLSpod12
		tailModel[63] = new ModelRendererTurbo(this, 89, 547, textureX, textureY); // TLSpod13
		tailModel[64] = new ModelRendererTurbo(this, 90, 460, textureX, textureY); // TLSpod14
		tailModel[65] = new ModelRendererTurbo(this, 86, 424, textureX, textureY); // TLSpod15
		tailModel[66] = new ModelRendererTurbo(this, 86, 391, textureX, textureY); // TLSpod16
		tailModel[67] = new ModelRendererTurbo(this, 88, 355, textureX, textureY); // TLSpod17
		tailModel[68] = new ModelRendererTurbo(this, 88, 355, textureX, textureY); // TLSpod18
		tailModel[69] = new ModelRendererTurbo(this, 222, 525, textureX, textureY); // TLSpod19
		tailModel[70] = new ModelRendererTurbo(this, 88, 569, textureX, textureY); // TLSpod2
		tailModel[71] = new ModelRendererTurbo(this, 158, 530, textureX, textureY); // TLSpod20
		tailModel[72] = new ModelRendererTurbo(this, 158, 530, textureX, textureY); // TLSpod21
		tailModel[73] = new ModelRendererTurbo(this, 88, 497, textureX, textureY); // TLSpod22
		tailModel[74] = new ModelRendererTurbo(this, 88, 497, textureX, textureY); // TLSpod23
		tailModel[75] = new ModelRendererTurbo(this, 207, 364, textureX, textureY); // TLSpod24
		tailModel[76] = new ModelRendererTurbo(this, 209, 343, textureX, textureY); // TLSpod25
		tailModel[77] = new ModelRendererTurbo(this, 238, 368, textureX, textureY); // TLSpod26
		tailModel[78] = new ModelRendererTurbo(this, 238, 351, textureX, textureY); // TLSpod27
		tailModel[79] = new ModelRendererTurbo(this, 207, 364, textureX, textureY); // TLSpod28
		tailModel[80] = new ModelRendererTurbo(this, 209, 343, textureX, textureY); // TLSpod29
		tailModel[81] = new ModelRendererTurbo(this, 88, 569, textureX, textureY); // TLSpod3
		tailModel[82] = new ModelRendererTurbo(this, 238, 368, textureX, textureY); // TLSpod30
		tailModel[83] = new ModelRendererTurbo(this, 238, 351, textureX, textureY); // TLSpod31
		tailModel[84] = new ModelRendererTurbo(this, 88, 530, textureX, textureY); // TLSpod32
		tailModel[85] = new ModelRendererTurbo(this, 122, 530, textureX, textureY); // TLSpod33
		tailModel[86] = new ModelRendererTurbo(this, 88, 530, textureX, textureY); // TLSpod34
		tailModel[87] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod36
		tailModel[88] = new ModelRendererTurbo(this, 122, 530, textureX, textureY); // TLSpod37
		tailModel[89] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod38
		tailModel[90] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod39
		tailModel[91] = new ModelRendererTurbo(this, 88, 569, textureX, textureY); // TLSpod4
		tailModel[92] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod40
		tailModel[93] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod41
		tailModel[94] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod42
		tailModel[95] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod43
		tailModel[96] = new ModelRendererTurbo(this, 142, 355, textureX, textureY); // TLSpod44
		tailModel[97] = new ModelRendererTurbo(this, 166, 355, textureX, textureY); // TLSpod45
		tailModel[98] = new ModelRendererTurbo(this, 118, 547, textureX, textureY); // TLSpod6
		tailModel[99] = new ModelRendererTurbo(this, 118, 547, textureX, textureY); // TLSpod7
		tailModel[100] = new ModelRendererTurbo(this, 118, 547, textureX, textureY); // TLSpod8
		tailModel[101] = new ModelRendererTurbo(this, 118, 547, textureX, textureY); // TLSpod9

		tailModel[0].addShapeBox(0F, -14F, 7F, 28, 20, 10, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Engine1
		tailModel[0].setRotationPoint(21F, -49F, 33F);

		tailModel[1].addShapeBox(88F, 15F, -6F, 34, 19, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F); // Engine10
		tailModel[1].setRotationPoint(21F, -49F, 33F);

		tailModel[2].addShapeBox(88F, 15F, 3.5F, 34, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -30F, 0F, 10F, -30F, 0F, -10F, 0F, 0F, -10F); // Engine12
		tailModel[2].setRotationPoint(21F, -49F, 33F);

		tailModel[3].addShapeBox(58F, 15F, 16.5F, 30, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F); // Engine13
		tailModel[3].setRotationPoint(21F, -49F, 33F);

		tailModel[4].addShapeBox(58F, 15F, -17.5F, 30, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F); // Engine14
		tailModel[4].setRotationPoint(21F, -49F, 33F);

		tailModel[5].addBox(63F, 33F, -6.5F, 25, 1, 13, 0F); // Engine15
		tailModel[5].setRotationPoint(21F, -49F, 33F);

		tailModel[6].addShapeBox(52F, 34F, -7.5F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Engine17
		tailModel[6].setRotationPoint(21F, -49F, 33F);

		tailModel[7].addShapeBox(34F, 34F, -7.5F, 18, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F); // Engine18
		tailModel[7].setRotationPoint(21F, -49F, 33F);

		tailModel[8].addShapeBox(10F, 15F, 15.5F, 48, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, -24F, 0F, -10F); // Engine19
		tailModel[8].setRotationPoint(21F, -49F, 33F);

		tailModel[9].addShapeBox(0F, -14F, -8F, 28, 20, 15, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Engine2
		tailModel[9].setRotationPoint(21F, -49F, 33F);

		tailModel[10].addShapeBox(3F, 8F, 11.5F, 49, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -7F, 0F, 4F); // Engine20
		tailModel[10].setRotationPoint(21F, -49F, 33F);

		tailModel[11].addShapeBox(0F, 6F, -13.5F, 52, 2, 27, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Engine21
		tailModel[11].setRotationPoint(21F, -49F, 33F);

		tailModel[12].addShapeBox(3F, 8F, -13.5F, 49, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -7F, 0F, -4F); // Engine22
		tailModel[12].setRotationPoint(21F, -49F, 33F);

		tailModel[13].addShapeBox(10F, 15F, -17.5F, 48, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, -24F, 0F, 10F); // Engine23
		tailModel[13].setRotationPoint(21F, -49F, 33F);

		tailModel[14].addBox(52F, 16F, -4.5F, 6, 10, 10, 0F); // Engine24
		tailModel[14].setRotationPoint(21F, -50F, 33F);

		tailModel[15].addShapeBox(52F, 15F, 5.5F, 6, 19, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F); // Engine25
		tailModel[15].setRotationPoint(21F, -49F, 33F);

		tailModel[16].addShapeBox(52F, 15F, -15.5F, 6, 19, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F); // Engine26
		tailModel[16].setRotationPoint(21F, -49F, 33F);

		tailModel[17].addShapeBox(141F, -6F, -11F, 19, 6, 21, 0F, 0F, 0F, -6F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Engine27
		tailModel[17].setRotationPoint(21F, -49F, 33F);

		tailModel[18].addShapeBox(141F, 0F, -11F, 19, 4, 21, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Engine28
		tailModel[18].setRotationPoint(21F, -49F, 33F);

		tailModel[19].addShapeBox(141F, 4F, -11F, 19, 6, 21, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -6F); // Engine29
		tailModel[19].setRotationPoint(21F, -49F, 33F);

		tailModel[20].addShapeBox(0F, -14F, -18F, 28, 20, 10, 0F, 0F, -15F, -9F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Engine3
		tailModel[20].setRotationPoint(21F, -49F, 33F);

		tailModel[21].addShapeBox(58F, 34F, -8.5F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F); // Engine30
		tailModel[21].setRotationPoint(21F, -49F, -32F);

		tailModel[22].addShapeBox(0F, -14F, 7F, 28, 20, 10, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Engine31
		tailModel[22].setRotationPoint(21F, -49F, -32F);

		tailModel[23].addShapeBox(0F, -14F, -18F, 28, 20, 10, 0F, 0F, -15F, -9F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Engine32
		tailModel[23].setRotationPoint(21F, -49F, -32F);

		tailModel[24].addShapeBox(28F, -14F, -8F, 94, 15, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F); // Engine33
		tailModel[24].setRotationPoint(21F, -49F, -32F);

		tailModel[25].addShapeBox(122F, -14F, -8F, 19, 15, 15, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F); // Engine34
		tailModel[25].setRotationPoint(21F, -49F, -32F);

		tailModel[26].addBox(28F, 1F, -18F, 94, 5, 35, 0F); // Engine35
		tailModel[26].setRotationPoint(21F, -49F, -32F);

		tailModel[27].addShapeBox(122F, 1F, -8F, 19, 3, 15, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F); // Engine36
		tailModel[27].setRotationPoint(21F, -49F, -32F);

		tailModel[28].addShapeBox(118F, 4F, -8F, 23, 14, 15, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, 0F); // Engine37
		tailModel[28].setRotationPoint(21F, -49F, -32F);

		tailModel[29].addBox(52F, 6F, -18.5F, 70, 9, 35, 0F); // Engine38
		tailModel[29].setRotationPoint(21F, -49F, -32F);

		tailModel[30].addShapeBox(88F, 15F, 2.5F, 34, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -30F, 0F, 10F, -30F, 0F, -10F, 0F, 0F, -10F); // Engine39
		tailModel[30].setRotationPoint(21F, -49F, -32F);

		tailModel[31].addShapeBox(28F, -14F, -8F, 94, 15, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F); // Engine4
		tailModel[31].setRotationPoint(21F, -49F, 33F);

		tailModel[32].addShapeBox(88F, 15F, -18.5F, 34, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -30F, 0F, -10F, -30F, 0F, 10F, 0F, 0F, 10F); // Engine40
		tailModel[32].setRotationPoint(21F, -49F, -32F);

		tailModel[33].addShapeBox(88F, 15F, -7F, 34, 19, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F); // Engine41
		tailModel[33].setRotationPoint(21F, -49F, -32F);

		tailModel[34].addShapeBox(58F, 15F, -18.5F, 30, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F); // Engine42
		tailModel[34].setRotationPoint(21F, -49F, -32F);

		tailModel[35].addShapeBox(58F, 15F, 15.5F, 30, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F); // Engine43
		tailModel[35].setRotationPoint(21F, -49F, -32F);

		tailModel[36].addBox(63F, 33F, -7.5F, 25, 1, 13, 0F); // Engine44
		tailModel[36].setRotationPoint(21F, -49F, -32F);

		tailModel[37].addShapeBox(88F, 15F, -17.5F, 34, 19, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -30F, 0F, -10F, -30F, 0F, 10F, 0F, 0F, 10F); // Engine45
		tailModel[37].setRotationPoint(21F, -49F, 33F);

		tailModel[38].addShapeBox(52F, 34F, -8.5F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Engine46
		tailModel[38].setRotationPoint(21F, -49F, -32F);

		tailModel[39].addShapeBox(34F, 34F, -8.5F, 18, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F); // Engine47
		tailModel[39].setRotationPoint(21F, -49F, -32F);

		tailModel[40].addBox(52F, 16F, -5.5F, 6, 10, 10, 0F); // Engine48
		tailModel[40].setRotationPoint(21F, -50F, -32F);

		tailModel[41].addShapeBox(52F, 15F, 4.5F, 6, 19, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F); // Engine49
		tailModel[41].setRotationPoint(21F, -49F, -32F);

		tailModel[42].addShapeBox(122F, -14F, -8F, 19, 15, 15, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F); // Engine5
		tailModel[42].setRotationPoint(21F, -49F, 33F);

		tailModel[43].addShapeBox(52F, 15F, -16.5F, 6, 19, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F); // Engine50
		tailModel[43].setRotationPoint(21F, -49F, -32F);

		tailModel[44].addShapeBox(0F, 6F, -14.5F, 52, 2, 27, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Engine51
		tailModel[44].setRotationPoint(21F, -49F, -32F);

		tailModel[45].addShapeBox(3F, 8F, -14.5F, 49, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -7F, 0F, -4F); // Engine52
		tailModel[45].setRotationPoint(21F, -49F, -32F);

		tailModel[46].addShapeBox(10F, 15F, -18.5F, 48, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, -24F, 0F, 10F); // Engine53
		tailModel[46].setRotationPoint(21F, -49F, -32F);

		tailModel[47].addShapeBox(58F, 34F, -7.5F, 6, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F); // Engine54
		tailModel[47].setRotationPoint(21F, -49F, 33F);

		tailModel[48].addShapeBox(0F, -14F, -8F, 28, 20, 15, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Engine54
		tailModel[48].setRotationPoint(21F, -49F, -32F);

		tailModel[49].addShapeBox(3F, 8F, 10.5F, 49, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, -7F, 0F, 4F); // Engine55
		tailModel[49].setRotationPoint(21F, -49F, -32F);

		tailModel[50].addShapeBox(10F, 15F, 14.5F, 48, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, -24F, 0F, -10F); // Engine55
		tailModel[50].setRotationPoint(21F, -49F, -32F);

		tailModel[51].addShapeBox(141F, -6F, -11F, 19, 6, 21, 0F, 0F, 0F, -6F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Engine56
		tailModel[51].setRotationPoint(21F, -49F, -32F);

		tailModel[52].addShapeBox(141F, 0F, -11F, 19, 4, 21, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Engine57
		tailModel[52].setRotationPoint(21F, -49F, -32F);

		tailModel[53].addShapeBox(141F, 4F, -11F, 19, 6, 21, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -6F); // Engine58
		tailModel[53].setRotationPoint(21F, -49F, -32F);

		tailModel[54].addBox(28F, 1F, -18F, 94, 5, 35, 0F); // Engine6
		tailModel[54].setRotationPoint(21F, -49F, 33F);

		tailModel[55].addBox(52F, 6F, -17.5F, 70, 9, 35, 0F); // Engine7
		tailModel[55].setRotationPoint(21F, -49F, 33F);

		tailModel[56].addShapeBox(122F, 1F, -8F, 19, 3, 15, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F); // Engine8
		tailModel[56].setRotationPoint(21F, -49F, 33F);

		tailModel[57].addShapeBox(118F, 4F, -8F, 23, 14, 15, 0F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -7F, -3F, 0F, 0F, 0F); // Engine9
		tailModel[57].setRotationPoint(21F, -49F, 33F);

		tailModel[58].addShapeBox(-59F, 5F, 1.5F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F); // TLSpod
		tailModel[58].setRotationPoint(80F, -88F, 0F);

		tailModel[59].addBox(-30F, 30.5F, -3F, 5, 10, 5, 0F); // TLSpod1
		tailModel[59].setRotationPoint(80F, -88F, 0F);
		tailModel[59].rotateAngleX = -0.52359878F;

		tailModel[60].addBox(-30F, 14.5F, -3F, 5, 10, 5, 0F); // TLSpod10
		tailModel[60].setRotationPoint(80F, -88F, 0F);
		tailModel[60].rotateAngleX = -0.52359878F;

		tailModel[61].addBox(15F, 14.5F, -3F, 5, 10, 5, 0F); // TLSpod11
		tailModel[61].setRotationPoint(80F, -88F, 0F);
		tailModel[61].rotateAngleX = -0.52359878F;

		tailModel[62].addBox(-30F, 14.5F, -3F, 5, 10, 5, 0F); // TLSpod12
		tailModel[62].setRotationPoint(80F, -88F, 0F);
		tailModel[62].rotateAngleX = 0.52359878F;

		tailModel[63].addBox(15F, 14.5F, -3F, 5, 10, 5, 0F); // TLSpod13
		tailModel[63].setRotationPoint(80F, -88F, 0F);
		tailModel[63].rotateAngleX = 0.52359878F;

		tailModel[64].addShapeBox(-54F, 12F, -10F, 76, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // TLSpod14
		tailModel[64].setRotationPoint(80F, -88F, 0F);

		tailModel[65].addBox(-54F, 6F, -10F, 86, 6, 20, 0F); // TLSpod15
		tailModel[65].setRotationPoint(80F, -88F, 0F);

		tailModel[66].addShapeBox(-54F, 0F, -10F, 76, 6, 20, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TLSpod16
		tailModel[66].setRotationPoint(80F, -88F, 0F);

		tailModel[67].addShapeBox(22F, 0F, -10F, 10, 6, 20, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // TLSpod17
		tailModel[67].setRotationPoint(80F, -88F, 0F);

		tailModel[68].addShapeBox(22F, 12F, -10F, 10, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F); // TLSpod18
		tailModel[68].setRotationPoint(80F, -88F, 0F);

		tailModel[69].addShapeBox(32F, 5.5F, -10F, 13, 7, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // TLSpod19
		tailModel[69].setRotationPoint(80F, -88F, 0F);

		tailModel[70].addBox(15F, 30.5F, -3F, 5, 10, 5, 0F); // TLSpod2
		tailModel[70].setRotationPoint(80F, -88F, 0F);
		tailModel[70].rotateAngleX = -0.52359878F;

		tailModel[71].addShapeBox(32F, 5.5F, -23F, 13, 7, 13, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F); // TLSpod20
		tailModel[71].setRotationPoint(80F, -88F, 0F);

		tailModel[72].addShapeBox(32F, 5.5F, 10F, 13, 7, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -10F, 0F, 0F, 0F); // TLSpod21
		tailModel[72].setRotationPoint(80F, -88F, 0F);

		tailModel[73].addBox(-33F, 5.5F, -23F, 65, 7, 13, 0F); // TLSpod22
		tailModel[73].setRotationPoint(80F, -88F, 0F);

		tailModel[74].addBox(-33F, 5.5F, 10F, 65, 7, 13, 0F); // TLSpod23
		tailModel[74].setRotationPoint(80F, -88F, 0F);

		tailModel[75].addBox(-60F, 3F, 4F, 6, 12, 3, 0F); // TLSpod24
		tailModel[75].setRotationPoint(80F, -88F, 0F);

		tailModel[76].addFlexBox(-63F, 3F, 4F, 3, 12, 3, 0F, -3.00F, -3.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // TLSpod25
		tailModel[76].setRotationPoint(80F, -88F, 0F);

		tailModel[77].addBox(-59F, 4F, 7F, 5, 10, 1, 0F); // TLSpod26
		tailModel[77].setRotationPoint(80F, -88F, 0F);

		tailModel[78].addFlexBox(-62F, 4F, 7F, 3, 10, 1, 0F, -3.00F, -3.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // TLSpod27
		tailModel[78].setRotationPoint(80F, -88F, 0F);

		tailModel[79].addBox(-60F, 3F, -7F, 6, 12, 3, 0F); // TLSpod28
		tailModel[79].setRotationPoint(80F, -88F, 0F);

		tailModel[80].addFlexBox(-63F, 3F, -7F, 3, 12, 3, 0F, -3.00F, -3.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // TLSpod29
		tailModel[80].setRotationPoint(80F, -88F, 0F);

		tailModel[81].addBox(-30F, 30.5F, -3F, 5, 10, 5, 0F); // TLSpod3
		tailModel[81].setRotationPoint(80F, -88F, 0F);
		tailModel[81].rotateAngleX = 0.52359878F;

		tailModel[82].addBox(-59F, 4F, -8F, 5, 10, 1, 0F); // TLSpod30
		tailModel[82].setRotationPoint(80F, -88F, 0F);

		tailModel[83].addFlexBox(-62F, 4F, -8F, 3, 10, 1, 0F, -3.00F, -3.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_RIGHT); // TLSpod31
		tailModel[83].setRotationPoint(80F, -88F, 0F);

		tailModel[84].addShapeBox(-41F, 5.5F, 15F, 8, 7, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // TLSpod32
		tailModel[84].setRotationPoint(80F, -88F, 0F);

		tailModel[85].addShapeBox(-49F, 6.5F, 15F, 8, 5, 3, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F); // TLSpod33
		tailModel[85].setRotationPoint(80F, -88F, 0F);

		tailModel[86].addShapeBox(-41F, 5.5F, -18F, 8, 7, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // TLSpod34
		tailModel[86].setRotationPoint(80F, -88F, 0F);

		tailModel[87].addShapeBox(-59F, 5F, -1.5F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // TLSpod36
		tailModel[87].setRotationPoint(80F, -88F, 0F);

		tailModel[88].addShapeBox(-49F, 6.5F, -18F, 8, 5, 3, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F); // TLSpod37
		tailModel[88].setRotationPoint(80F, -88F, 0F);

		tailModel[89].addShapeBox(-59F, 5F, -4.5F, 3, 8, 3, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F); // TLSpod38
		tailModel[89].setRotationPoint(80F, -88F, 0F);

		tailModel[90].addShapeBox(-62F, 5F, 1.5F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // TLSpod39
		tailModel[90].setRotationPoint(80F, -88F, 0F);

		tailModel[91].addBox(15F, 30.5F, -3F, 5, 10, 5, 0F); // TLSpod4
		tailModel[91].setRotationPoint(80F, -88F, 0F);
		tailModel[91].rotateAngleX = 0.52359878F;

		tailModel[92].addShapeBox(-62F, 5F, -4.5F, 3, 8, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TLSpod40
		tailModel[92].setRotationPoint(80F, -88F, 0F);

		tailModel[93].addBox(-62F, 5F, -1.5F, 3, 8, 3, 0F); // TLSpod41
		tailModel[93].setRotationPoint(80F, -88F, 0F);

		tailModel[94].addShapeBox(-65F, 5F, 1.5F, 3, 8, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F); // TLSpod42
		tailModel[94].setRotationPoint(80F, -88F, 0F);

		tailModel[95].addShapeBox(-65F, 5F, -1.5F, 3, 8, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // TLSpod43
		tailModel[95].setRotationPoint(80F, -88F, 0F);

		tailModel[96].addShapeBox(-65F, 5F, -4.5F, 3, 8, 3, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // TLSpod44
		tailModel[96].setRotationPoint(80F, -88F, 0F);

		tailModel[97].addBox(-65.5F, 7.5F, -1.5F, 1, 3, 3, 0F); // TLSpod45
		tailModel[97].setRotationPoint(80F, -88F, 0F);

		tailModel[98].addBox(-29F, 24.5F, -2F, 3, 6, 3, 0F); // TLSpod6
		tailModel[98].setRotationPoint(80F, -88F, 0F);
		tailModel[98].rotateAngleX = -0.52359878F;

		tailModel[99].addBox(-29F, 24.5F, -2F, 3, 6, 3, 0F); // TLSpod7
		tailModel[99].setRotationPoint(80F, -88F, 0F);
		tailModel[99].rotateAngleX = 0.52359878F;

		tailModel[100].addBox(16F, 24.5F, -2F, 3, 6, 3, 0F); // TLSpod8
		tailModel[100].setRotationPoint(80F, -88F, 0F);
		tailModel[100].rotateAngleX = -0.52359878F;

		tailModel[101].addBox(16F, 24.5F, -2F, 3, 6, 3, 0F); // TLSpod9
		tailModel[101].setRotationPoint(80F, -88F, 0F);
		tailModel[101].rotateAngleX = 0.52359878F;


		leftWingModel = new ModelRendererTurbo[7];
		leftWingModel[0] = new ModelRendererTurbo(this, 302, 246, textureX, textureY); // WingL1
		leftWingModel[1] = new ModelRendererTurbo(this, 303, 319, textureX, textureY); // WingL2
		leftWingModel[2] = new ModelRendererTurbo(this, 379, 399, textureX, textureY); // WingL3
		leftWingModel[3] = new ModelRendererTurbo(this, 318, 367, textureX, textureY); // WingL4
		leftWingModel[4] = new ModelRendererTurbo(this, 559, 339, textureX, textureY); // WingL5
		leftWingModel[5] = new ModelRendererTurbo(this, 439, 234, textureX, textureY); // WingL6
		leftWingModel[6] = new ModelRendererTurbo(this, 694, 477, textureX, textureY); // WingL7

		leftWingModel[0].addShapeBox(86F, 1F, -66F, 50, 5, 42, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WingL1
		leftWingModel[0].setRotationPoint(-115F, -49F, 0F);

		leftWingModel[1].addShapeBox(136F, 1F, -65F, 48, 5, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F); // WingL2
		leftWingModel[1].setRotationPoint(-115F, -49F, 0F);

		leftWingModel[2].addBox(126F, 1F, -67F, 132, 5, 2, 0F); // WingL3
		leftWingModel[2].setRotationPoint(-115F, -49F, 0F);

		leftWingModel[3].addBox(165F, 1F, -65F, 93, 5, 15, 0F); // WingL4
		leftWingModel[3].setRotationPoint(-115F, -49F, 0F);

		leftWingModel[4].addShapeBox(184F, -49F, -67F, 74, 50, 2, 0F, -40F, 0F, -25F, -20F, 0F, -25F, -20F, 0F, 25F, -40F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WingL5
		leftWingModel[4].setRotationPoint(-115F, -49F, 0F);

		leftWingModel[5].addShapeBox(126F, 1F, -162F, 70, 5, 95, 0F, 20F, -2F, -10F, -80F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -2F, -10F, -80F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WingL6
		leftWingModel[5].setRotationPoint(-115F, -49F, 0F);

		leftWingModel[6].addShapeBox(258F, 1F, -67F, 20, 5, 17, 0F, 0F, 0F, 0F, 0F, -2F, -20F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -20F, 0F, -2F, 5F, 0F, 0F, 0F); // WingL7
		leftWingModel[6].setRotationPoint(-115F, -49F, 0F);


		rightWingModel = new ModelRendererTurbo[7];
		rightWingModel[0] = new ModelRendererTurbo(this, 289, 416, textureX, textureY); // WingR1
		rightWingModel[1] = new ModelRendererTurbo(this, 339, 474, textureX, textureY); // WingR2
		rightWingModel[2] = new ModelRendererTurbo(this, 444, 583, textureX, textureY); // WingR3
		rightWingModel[3] = new ModelRendererTurbo(this, 345, 541, textureX, textureY); // WingR4
		rightWingModel[4] = new ModelRendererTurbo(this, 573, 521, textureX, textureY); // WingR5
		rightWingModel[5] = new ModelRendererTurbo(this, 448, 414, textureX, textureY); // WingR6
		rightWingModel[6] = new ModelRendererTurbo(this, 686, 293, textureX, textureY); // WingR7

		rightWingModel[0].addShapeBox(86F, 1F, 23F, 50, 5, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F); // WingR1
		rightWingModel[0].setRotationPoint(-115F, -49F, 0F);

		rightWingModel[1].addShapeBox(136F, 1F, 41F, 48, 5, 24, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F); // WingR2
		rightWingModel[1].setRotationPoint(-115F, -49F, 0F);

		rightWingModel[2].addBox(126F, 1F, 64F, 132, 5, 2, 0F); // WingR3
		rightWingModel[2].setRotationPoint(-115F, -49F, 0F);

		rightWingModel[3].addBox(165F, 1F, 50F, 93, 5, 15, 0F); // WingR4
		rightWingModel[3].setRotationPoint(-115F, -49F, 0F);

		rightWingModel[4].addShapeBox(184F, -49F, 64F, 74, 50, 2, 0F, -40F, 0F, 25F, -20F, 0F, 25F, -20F, 0F, -25F, -40F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WingR5
		rightWingModel[4].setRotationPoint(-115F, -49F, 0F);

		rightWingModel[5].addShapeBox(126F, 1F, 66F, 70, 5, 95, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, -2F, 0F, 20F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, -2F, 0F, 20F, -2F, -10F); // WingR6
		rightWingModel[5].setRotationPoint(-115F, -49F, 0F);

		rightWingModel[6].addShapeBox(258F, 1F, 49F, 20, 5, 17, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, -20F, 0F, 0F, 0F); // WingR7
		rightWingModel[6].setRotationPoint(-115F, -49F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 609, 204, textureX, textureY); // CanardL1
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 539, 204, textureX, textureY); // CanardL2
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 471, 204, textureX, textureY); // CanardL3

		pitchFlapLeftModel[0].addShapeBox(-8F, 0F, -22F, 10, 2, 22, 0F, -9F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CanardL1
		pitchFlapLeftModel[0].setRotationPoint(-53F, -47F, -24F);

		pitchFlapLeftModel[1].addShapeBox(2F, 0F, -22F, 4, 2, 22, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // CanardL2
		pitchFlapLeftModel[1].setRotationPoint(-53F, -47F, -24F);

		pitchFlapLeftModel[2].addShapeBox(6F, 0F, -22F, 4, 2, 22, 0F, 0F, 12F, 0F, -3.5F, 12F, 0F, 2F, 7.5F, -14F, 0F, 0F, 0F, 0F, -12F, 0F, -3.5F, -12F, 0F, 2F, -7.5F, -14F, 0F, 0F, 0F); // CanardL3
		pitchFlapLeftModel[2].setRotationPoint(-53F, -47F, -24F);


		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 609, 173, textureX, textureY); // CanardR1
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 539, 173, textureX, textureY); // CanardR2
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 471, 173, textureX, textureY); // CanardR3

		pitchFlapRightModel[0].addShapeBox(-8F, 0F, 0F, 10, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, -9F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -9F, -12F, 0F); // CanardR1
		pitchFlapRightModel[0].setRotationPoint(-53F, -47F, 24F);

		pitchFlapRightModel[1].addShapeBox(2F, 0F, 0F, 4, 2, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // CanardR2
		pitchFlapRightModel[1].setRotationPoint(-53F, -47F, 24F);

		pitchFlapRightModel[2].addShapeBox(6F, 0F, 0F, 4, 2, 22, 0F, 0F, 0F, 0F, 2F, 7.5F, -14F, -3.5F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 2F, -7.5F, -14F, -3.5F, -12F, 0F, 0F, -12F, 0F); // CanardR3
		pitchFlapRightModel[2].setRotationPoint(-53F, -47F, 24F);


		bodyWheelModel = new ModelRendererTurbo[11];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 488, 654, textureX, textureY); // WheelCore1
		bodyWheelModel[1] = new ModelRendererTurbo(this, 547, 679, textureX, textureY); // WheelCore10
		bodyWheelModel[2] = new ModelRendererTurbo(this, 547, 679, textureX, textureY); // WheelCore11
		bodyWheelModel[3] = new ModelRendererTurbo(this, 514, 655, textureX, textureY); // WheelCore2
		bodyWheelModel[4] = new ModelRendererTurbo(this, 529, 654, textureX, textureY); // WheelCore3
		bodyWheelModel[5] = new ModelRendererTurbo(this, 555, 658, textureX, textureY); // WheelCore4
		bodyWheelModel[6] = new ModelRendererTurbo(this, 557, 666, textureX, textureY); // WheelCore5
		bodyWheelModel[7] = new ModelRendererTurbo(this, 492, 679, textureX, textureY); // WheelCore6
		bodyWheelModel[8] = new ModelRendererTurbo(this, 492, 679, textureX, textureY); // WheelCore7
		bodyWheelModel[9] = new ModelRendererTurbo(this, 517, 679, textureX, textureY); // WheelCore8
		bodyWheelModel[10] = new ModelRendererTurbo(this, 517, 679, textureX, textureY); // WheelCore9

		bodyWheelModel[0].addBox(-2F, 0F, -2F, 4, 13, 4, 0F); // WheelCore1
		bodyWheelModel[0].setRotationPoint(-92F, -30F, 0F);
		bodyWheelModel[0].rotateAngleZ = -0.20943951F;

		bodyWheelModel[1].addShapeBox(4F, 30F, 1F, 3, 10, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // WheelCore10
		bodyWheelModel[1].setRotationPoint(-92F, -30F, 0F);

		bodyWheelModel[2].addShapeBox(4F, 30F, -5F, 3, 10, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // WheelCore11
		bodyWheelModel[2].setRotationPoint(-92F, -30F, 0F);

		bodyWheelModel[3].addBox(-2.5F, 13F, -1.5F, 3, 15, 3, 0F); // WheelCore2
		bodyWheelModel[3].setRotationPoint(-91F, -30F, 0F);
		bodyWheelModel[3].rotateAngleZ = -0.20943951F;

		bodyWheelModel[4].addShapeBox(-2F, 26F, -2F, 4, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelCore3
		bodyWheelModel[4].setRotationPoint(-92F, -30F, 0F);
		bodyWheelModel[4].rotateAngleZ = -0.20943951F;

		bodyWheelModel[5].addBox(2F, 32F, -0.5F, 10, 3, 1, 0F); // WheelCore4
		bodyWheelModel[5].setRotationPoint(-92F, -30F, 0F);
		bodyWheelModel[5].rotateAngleZ = -0.20943951F;

		bodyWheelModel[6].addBox(1F, 34.05F, -2F, 2, 2, 4, 0F); // WheelCore5
		bodyWheelModel[6].setRotationPoint(-92F, -30F, 0F);

		bodyWheelModel[7].addShapeBox(-3F, 30F, 1F, 3, 10, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelCore6
		bodyWheelModel[7].setRotationPoint(-92F, -30F, 0F);

		bodyWheelModel[8].addShapeBox(-3F, 30F, -5F, 3, 10, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelCore7
		bodyWheelModel[8].setRotationPoint(-92F, -30F, 0F);

		bodyWheelModel[9].addBox(0F, 30F, 1F, 4, 10, 4, 0F); // WheelCore8
		bodyWheelModel[9].setRotationPoint(-92F, -30F, 0F);

		bodyWheelModel[10].addBox(0F, 30F, -5F, 4, 10, 4, 0F); // WheelCore9
		bodyWheelModel[10].setRotationPoint(-92F, -30F, 0F);


		tailWheelModel = new ModelRendererTurbo[26];
		tailWheelModel[0] = new ModelRendererTurbo(this, 479, 713, textureX, textureY); // WheelTail1
		tailWheelModel[1] = new ModelRendererTurbo(this, 475, 728, textureX, textureY); // WheelTail10
		tailWheelModel[2] = new ModelRendererTurbo(this, 518, 728, textureX, textureY); // WheelTail11
		tailWheelModel[3] = new ModelRendererTurbo(this, 495, 728, textureX, textureY); // WheelTail12
		tailWheelModel[4] = new ModelRendererTurbo(this, 475, 728, textureX, textureY); // WheelTail13
		tailWheelModel[5] = new ModelRendererTurbo(this, 479, 713, textureX, textureY); // WheelTail14
		tailWheelModel[6] = new ModelRendererTurbo(this, 505, 702, textureX, textureY); // WheelTail15
		tailWheelModel[7] = new ModelRendererTurbo(this, 478, 713, textureX, textureY); // WheelTail16
		tailWheelModel[8] = new ModelRendererTurbo(this, 505, 713, textureX, textureY); // WheelTail17
		tailWheelModel[9] = new ModelRendererTurbo(this, 505, 713, textureX, textureY); // WheelTail18
		tailWheelModel[10] = new ModelRendererTurbo(this, 486, 702, textureX, textureY); // WheelTail19
		tailWheelModel[11] = new ModelRendererTurbo(this, 505, 702, textureX, textureY); // WheelTail2
		tailWheelModel[12] = new ModelRendererTurbo(this, 483, 700, textureX, textureY); // WheelTail20
		tailWheelModel[13] = new ModelRendererTurbo(this, 475, 728, textureX, textureY); // WheelTail21
		tailWheelModel[14] = new ModelRendererTurbo(this, 495, 728, textureX, textureY); // WheelTail22
		tailWheelModel[15] = new ModelRendererTurbo(this, 518, 728, textureX, textureY); // WheelTail23
		tailWheelModel[16] = new ModelRendererTurbo(this, 475, 728, textureX, textureY); // WheelTail24
		tailWheelModel[17] = new ModelRendererTurbo(this, 495, 728, textureX, textureY); // WheelTail25
		tailWheelModel[18] = new ModelRendererTurbo(this, 518, 728, textureX, textureY); // WheelTail26
		tailWheelModel[19] = new ModelRendererTurbo(this, 478, 713, textureX, textureY); // WheelTail3
		tailWheelModel[20] = new ModelRendererTurbo(this, 505, 713, textureX, textureY); // WheelTail4
		tailWheelModel[21] = new ModelRendererTurbo(this, 505, 713, textureX, textureY); // WheelTail5
		tailWheelModel[22] = new ModelRendererTurbo(this, 483, 700, textureX, textureY); // WheelTail6
		tailWheelModel[23] = new ModelRendererTurbo(this, 482, 701, textureX, textureY); // WheelTail7
		tailWheelModel[24] = new ModelRendererTurbo(this, 518, 728, textureX, textureY); // WheelTail8
		tailWheelModel[25] = new ModelRendererTurbo(this, 495, 728, textureX, textureY); // WheelTail9

		tailWheelModel[0].addBox(0F, 3F, -2F, 4, 6, 4, 0F); // WheelTail1
		tailWheelModel[0].setRotationPoint(95F, -18F, -30F);

		tailWheelModel[1].addShapeBox(-12F, 17F, -66F, 3, 11, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelTail10
		tailWheelModel[1].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[2].addShapeBox(13F, 17F, -66F, 3, 11, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // WheelTail11
		tailWheelModel[2].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[3].addBox(8F, 17F, -66F, 5, 11, 4, 0F); // WheelTail12
		tailWheelModel[3].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[4].addShapeBox(5F, 17F, -66F, 3, 11, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelTail13
		tailWheelModel[4].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[5].addBox(0F, 3F, -2F, 4, 6, 4, 0F); // WheelTail14
		tailWheelModel[5].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[6].addBox(0.5F, 8.5F, -1.5F, 3, 6, 3, 0F); // WheelTail15
		tailWheelModel[6].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[7].addBox(0F, 13F, -2F, 4, 6, 4, 0F); // WheelTail16
		tailWheelModel[7].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[8].addShapeBox(-9F, 16F, -2F, 11, 4, 4, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // WheelTail17
		tailWheelModel[8].setRotationPoint(95F, -17F, 30F);

		tailWheelModel[9].addShapeBox(2F, 16F, -2F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // WheelTail18
		tailWheelModel[9].setRotationPoint(95F, -17F, 30F);

		tailWheelModel[10].addShapeBox(6F, 8F, -1F, 2, 3, 2, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelTail19
		tailWheelModel[10].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[11].addBox(0.5F, 8.5F, -1.5F, 3, 6, 3, 0F); // WheelTail2
		tailWheelModel[11].setRotationPoint(95F, -18F, -30F);

		tailWheelModel[12].addShapeBox(6F, 11F, -1F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // WheelTail20
		tailWheelModel[12].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[13].addShapeBox(-12F, 17F, 2F, 3, 11, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelTail21
		tailWheelModel[13].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[14].addBox(-9F, 17F, 2F, 5, 11, 4, 0F); // WheelTail22
		tailWheelModel[14].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[15].addShapeBox(-4F, 17F, 2F, 3, 11, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // WheelTail23
		tailWheelModel[15].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[16].addShapeBox(5F, 17F, 2F, 3, 11, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // WheelTail24
		tailWheelModel[16].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[17].addBox(8F, 17F, 2F, 5, 11, 4, 0F); // WheelTail25
		tailWheelModel[17].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[18].addShapeBox(13F, 17F, 2F, 3, 11, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // WheelTail26
		tailWheelModel[18].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[19].addBox(0F, 13F, -2F, 4, 6, 4, 0F); // WheelTail3
		tailWheelModel[19].setRotationPoint(95F, -18F, -30F);

		tailWheelModel[20].addShapeBox(-9F, 16F, -2F, 11, 4, 4, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // WheelTail4
		tailWheelModel[20].setRotationPoint(95F, -17F, -30F);

		tailWheelModel[21].addShapeBox(2F, 16F, -2F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // WheelTail5
		tailWheelModel[21].setRotationPoint(95F, -17F, -30F);

		tailWheelModel[22].addShapeBox(6F, 7F, -1F, 2, 4, 2, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelTail6
		tailWheelModel[22].setRotationPoint(95F, -18F, -30F);

		tailWheelModel[23].addShapeBox(6F, 11F, -1F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // WheelTail7
		tailWheelModel[23].setRotationPoint(95F, -18F, -30F);

		tailWheelModel[24].addShapeBox(-4F, 17F, -66F, 3, 11, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // WheelTail8
		tailWheelModel[24].setRotationPoint(95F, -18F, 30F);

		tailWheelModel[25].addBox(-9F, 17F, -66F, 5, 11, 4, 0F); // WheelTail9
		tailWheelModel[25].setRotationPoint(95F, -18F, 30F);


		bodyDoorCloseModel = new ModelRendererTurbo[9];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 2, 377, textureX, textureY); // Canopy1
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 8, 356, textureX, textureY); // Canopy2
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 10, 395, textureX, textureY); // Canopy3
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 9, 416, textureX, textureY); // Canopy4
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 4, 436, textureX, textureY); // Canopy5
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 42, 436, textureX, textureY); // Canopy6
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 15, 479, textureX, textureY); // Canopy7
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 11, 459, textureX, textureY); // Canopy8
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 40, 459, textureX, textureY); // Canopy9

		bodyDoorCloseModel[0].addShapeBox(-63F, -14.4F, -5F, 29, 1, 10, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Canopy1
		bodyDoorCloseModel[0].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[1].addShapeBox(-60F, -14.4F, -10.5F, 25, 13, 1, 0F, 2F, 0F, -5F, 0F, 1F, -5F, 0F, 1F, 5F, 2F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Canopy2
		bodyDoorCloseModel[1].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[2].addShapeBox(-60F, -14.4F, 9.5F, 25, 13, 1, 0F, 2F, 0F, 5F, 0F, 1F, 5F, 0F, 1F, -5F, 2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Canopy3
		bodyDoorCloseModel[2].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[3].addShapeBox(-76F, -14.4F, -5F, 12, 1, 10, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Canopy4
		bodyDoorCloseModel[3].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[4].addShapeBox(-76F, -14.4F, 9.5F, 14, 13, 1, 0F, 0F, -4F, 5F, -2F, 0F, 5F, -2F, 0F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Canopy5
		bodyDoorCloseModel[4].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[5].addShapeBox(-76F, -14.4F, -10.5F, 14, 13, 1, 0F, 0F, -4F, -5F, -2F, 0F, -5F, -2F, 0F, 5F, 0F, -4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Canopy6
		bodyDoorCloseModel[5].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[6].addShapeBox(-86F, -10.4F, -5F, 10, 1, 10, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Canopy7
		bodyDoorCloseModel[6].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[7].addShapeBox(-86F, -10.4F, 9.5F, 10, 8, 1, 0F, 0F, -8F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -8F, -5F, 0F, 1F, 5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 1F, -5F); // Canopy8
		bodyDoorCloseModel[7].setRotationPoint(-43F, -49F, 0F);

		bodyDoorCloseModel[8].addShapeBox(-86F, -10.4F, -10.5F, 10, 8, 1, 0F, 0F, -8F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -8F, 5F, 0F, 1F, -5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 1F, 5F); // Canopy9
		bodyDoorCloseModel[8].setRotationPoint(-43F, -49F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
