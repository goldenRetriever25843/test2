//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGalmTwo extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGalmTwo()
	{

// Nose
		noseModel = new ModelRendererTurbo[62];
		noseModel[0] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose1
		noseModel[1] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose2
		noseModel[2] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose3
		noseModel[3] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose4
		noseModel[4] = new ModelRendererTurbo(this,  1,  708, textureX, textureY); // Nose5
		noseModel[5] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose6
		noseModel[6] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose7
		noseModel[7] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose8
		noseModel[8] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose9
		noseModel[9] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose10
		noseModel[10] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose11
		noseModel[11] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose12
		noseModel[12] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose13
		noseModel[13] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose14
		noseModel[14] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose15
		noseModel[15] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose16
		noseModel[16] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose17
		noseModel[17] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose18
		noseModel[18] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose19
		noseModel[19] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose20
		noseModel[20] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose21
		noseModel[21] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose22
		noseModel[22] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose23
		noseModel[23] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose24
		noseModel[24] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose25
		noseModel[25] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose26
		noseModel[26] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose27
		noseModel[27] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose28
		noseModel[28] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose29
		noseModel[29] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose30
		noseModel[30] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose31
		noseModel[31] = new ModelRendererTurbo(this,  1,  723, textureX, textureY); // Nose32
		noseModel[32] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose33
		noseModel[33] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose34
		noseModel[34] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose35
		noseModel[35] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose36
		noseModel[36] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose37
		noseModel[37] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose38
		noseModel[38] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose39
		noseModel[39] = new ModelRendererTurbo(this,  1,  717, textureX, textureY); // Nose40
		noseModel[40] = new ModelRendererTurbo(this,  1,  731, textureX, textureY); // Nose41
		noseModel[41] = new ModelRendererTurbo(this,  1,  731, textureX, textureY); // Nose42
		noseModel[42] = new ModelRendererTurbo(this,  1,  731, textureX, textureY); // Nose43
		noseModel[43] = new ModelRendererTurbo(this,  1,  731, textureX, textureY); // Nose44
		noseModel[44] = new ModelRendererTurbo(this,  1,  764, textureX, textureY); // Nose45
		noseModel[45] = new ModelRendererTurbo(this,  1,  764, textureX, textureY); // Nose46
		noseModel[46] = new ModelRendererTurbo(this,  1,  764, textureX, textureY); // Nose47
		noseModel[47] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose48
		noseModel[48] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose49
		noseModel[49] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose50
		noseModel[50] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose51
		noseModel[51] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose52
		noseModel[52] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose53
		noseModel[53] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose54
		noseModel[54] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose55
		noseModel[55] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose56
		noseModel[56] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose57
		noseModel[57] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose58
		noseModel[58] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose59
		noseModel[59] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose60
		noseModel[60] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose61
		noseModel[61] = new ModelRendererTurbo(this,  1,  752, textureX, textureY); // Nose62

		noseModel[0].addBox(-49F, -13.5F, -1F, 24, 2, 2, 0F); // Nose1
		noseModel[0].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[0].rotateAngleY = 0.2268928F;
		noseModel[0].rotateAngleZ = 0.1919862F;

		noseModel[1].addBox(-50F, 6.5F, -1F, 24, 2, 2, 0F); // Nose2
		noseModel[1].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[1].rotateAngleY = 0.2268928F;
		noseModel[1].rotateAngleZ = -0.1919862F;

		noseModel[2].addBox(-25F, -13.5F, -1F, 28, 2, 2, 0F); // Nose3
		noseModel[2].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[2].rotateAngleY = 0.2268928F;
		noseModel[2].rotateAngleZ = 0.1919862F;

		noseModel[3].addBox(-26F, 6.5F, -1F, 28, 2, 2, 0F); // Nose4
		noseModel[3].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[3].rotateAngleY = 0.2268928F;
		noseModel[3].rotateAngleZ = -0.1919862F;

		noseModel[4].addBox(-50F, -1F, -2F, 52, 3, 3, 0F); // Nose5
		noseModel[4].setRotationPoint(-63F, -3F, 0.5F);

		noseModel[5].addBox(-51F, -0.5F, -1.5F, 1, 2, 2, 0F); // Nose6
		noseModel[5].setRotationPoint(-63F, -3F, 0.5F);

		noseModel[6].addBox(-25F, -7.5F, -1F, 28, 2, 2, 0F); // Nose7
		noseModel[6].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[6].rotateAngleY = 0.2268928F;
		noseModel[6].rotateAngleZ = 0.1919862F;

		noseModel[7].addBox(-25F, -11.5F, -1F, 28, 2, 2, 0F); // Nose8
		noseModel[7].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[7].rotateAngleY = 0.2268928F;
		noseModel[7].rotateAngleZ = 0.1919862F;

		noseModel[8].addBox(-25F, -9.5F, -1F, 28, 2, 2, 0F); // Nose9
		noseModel[8].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[8].rotateAngleY = 0.2268928F;
		noseModel[8].rotateAngleZ = 0.1919862F;

		noseModel[9].addBox(-25F, -5.5F, -1F, 28, 2, 2, 0F); // Nose10
		noseModel[9].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[9].rotateAngleY = 0.2268928F;
		noseModel[9].rotateAngleZ = 0.1919862F;

		noseModel[10].addBox(-5F, -3.5F, -1F, 8, 2, 2, 0F); // Nose11
		noseModel[10].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[10].rotateAngleY = 0.2268928F;
		noseModel[10].rotateAngleZ = 0.1919862F;

		noseModel[11].addBox(-26F, 4.5F, -1F, 28, 2, 2, 0F); // Nose12
		noseModel[11].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[11].rotateAngleY = 0.2268928F;
		noseModel[11].rotateAngleZ = -0.1919862F;

		noseModel[12].addBox(-26F, 2.5F, -1F, 28, 2, 2, 0F); // Nose13
		noseModel[12].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[12].rotateAngleY = 0.2268928F;
		noseModel[12].rotateAngleZ = -0.1919862F;

		noseModel[13].addBox(-16F, 0.5F, -1F, 18, 2, 2, 0F); // Nose14
		noseModel[13].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[13].rotateAngleY = 0.2268928F;
		noseModel[13].rotateAngleZ = -0.1919862F;

		noseModel[14].addBox(-11F, -1.5F, -1F, 13, 2, 2, 0F); // Nose15
		noseModel[14].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[14].rotateAngleY = 0.2268928F;
		noseModel[14].rotateAngleZ = -0.1919862F;

		noseModel[15].addBox(-5F, -2.5F, -1F, 7, 2, 2, 0F); // Nose16
		noseModel[15].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[15].rotateAngleY = 0.2268928F;
		noseModel[15].rotateAngleZ = -0.1919862F;

		noseModel[16].addBox(-46F, -11.5F, -1F, 21, 2, 2, 0F); // Nose17
		noseModel[16].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[16].rotateAngleY = 0.2268928F;
		noseModel[16].rotateAngleZ = 0.1919862F;

		noseModel[17].addBox(-41F, -9.5F, -1F, 16, 2, 2, 0F); // Nose18
		noseModel[17].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[17].rotateAngleY = 0.2268928F;
		noseModel[17].rotateAngleZ = 0.1919862F;

		noseModel[18].addBox(-47F, 4.5F, -1F, 21, 2, 2, 0F); // Nose19
		noseModel[18].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[18].rotateAngleY = 0.2268928F;
		noseModel[18].rotateAngleZ = -0.1919862F;

		noseModel[19].addBox(-41F, 2.3F, -1F, 15, 2, 2, 0F); // Nose20
		noseModel[19].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[19].rotateAngleY = 0.2268928F;
		noseModel[19].rotateAngleZ = -0.1919862F;

		noseModel[20].addBox(-26F, 6.5F, -1F, 28, 2, 2, 0F); // Nose21
		noseModel[20].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[20].rotateAngleY = -0.2268928F;
		noseModel[20].rotateAngleZ = -0.1919862F;

		noseModel[21].addBox(-26F, 4.5F, -1F, 28, 2, 2, 0F); // Nose22
		noseModel[21].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[21].rotateAngleY = -0.2268928F;
		noseModel[21].rotateAngleZ = -0.1919862F;

		noseModel[22].addBox(-26F, 2.5F, -1F, 28, 2, 2, 0F); // Nose23
		noseModel[22].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[22].rotateAngleY = -0.2268928F;
		noseModel[22].rotateAngleZ = -0.1919862F;

		noseModel[23].addBox(-16F, 0.5F, -1F, 18, 2, 2, 0F); // Nose24
		noseModel[23].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[23].rotateAngleY = -0.2268928F;
		noseModel[23].rotateAngleZ = -0.1919862F;

		noseModel[24].addBox(-5F, -2.5F, -1F, 7, 2, 2, 0F); // Nose25
		noseModel[24].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[24].rotateAngleY = -0.2268928F;
		noseModel[24].rotateAngleZ = -0.1919862F;

		noseModel[25].addBox(-25F, -5.5F, -1F, 28, 2, 2, 0F); // Nose26
		noseModel[25].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[25].rotateAngleY = -0.2268928F;
		noseModel[25].rotateAngleZ = 0.1919862F;

		noseModel[26].addBox(-11F, -1.5F, -1F, 13, 2, 2, 0F); // Nose27
		noseModel[26].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[26].rotateAngleY = -0.2268928F;
		noseModel[26].rotateAngleZ = -0.1919862F;

		noseModel[27].addBox(-25F, -7.5F, -1F, 28, 2, 2, 0F); // Nose28
		noseModel[27].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[27].rotateAngleY = -0.2268928F;
		noseModel[27].rotateAngleZ = 0.1919862F;

		noseModel[28].addBox(-25F, -9.5F, -1F, 28, 2, 2, 0F); // Nose29
		noseModel[28].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[28].rotateAngleY = -0.2268928F;
		noseModel[28].rotateAngleZ = 0.1919862F;

		noseModel[29].addBox(-25F, -11.5F, -1F, 28, 2, 2, 0F); // Nose30
		noseModel[29].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[29].rotateAngleY = -0.2268928F;
		noseModel[29].rotateAngleZ = 0.1919862F;

		noseModel[30].addBox(-25F, -13.5F, -1F, 28, 2, 2, 0F); // Nose31
		noseModel[30].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[30].rotateAngleY = -0.2268928F;
		noseModel[30].rotateAngleZ = 0.1919862F;

		noseModel[31].addBox(-5F, -3.5F, -1F, 8, 2, 2, 0F); // Nose32
		noseModel[31].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[31].rotateAngleY = -0.2268928F;
		noseModel[31].rotateAngleZ = 0.1919862F;

		noseModel[32].addBox(-46F, -11.5F, -1F, 21, 2, 2, 0F); // Nose33
		noseModel[32].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[32].rotateAngleY = -0.2268928F;
		noseModel[32].rotateAngleZ = 0.1919862F;

		noseModel[33].addBox(-41F, -9.5F, -1F, 16, 2, 2, 0F); // Nose34
		noseModel[33].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[33].rotateAngleY = -0.2268928F;
		noseModel[33].rotateAngleZ = 0.1919862F;

		noseModel[34].addBox(-47F, 4.5F, -1F, 21, 2, 2, 0F); // Nose35
		noseModel[34].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[34].rotateAngleY = -0.2268928F;
		noseModel[34].rotateAngleZ = -0.1919862F;

		noseModel[35].addBox(-50F, 6.5F, -1F, 24, 2, 2, 0F); // Nose36
		noseModel[35].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[35].rotateAngleY = -0.2268928F;
		noseModel[35].rotateAngleZ = -0.1919862F;

		noseModel[36].addBox(-41F, 2.3F, -1F, 15, 2, 2, 0F); // Nose37
		noseModel[36].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[36].rotateAngleY = -0.2268928F;
		noseModel[36].rotateAngleZ = -0.1919862F;

		noseModel[37].addBox(-49F, -13.5F, -1F, 24, 2, 2, 0F); // Nose38
		noseModel[37].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[37].rotateAngleY = -0.2268928F;
		noseModel[37].rotateAngleZ = 0.1919862F;

		noseModel[38].addBox(-41F, 2.5F, -1F, 15, 2, 2, 0F); // Nose39
		noseModel[38].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[38].rotateAngleY = 0.2268928F;
		noseModel[38].rotateAngleZ = -0.1919862F;

		noseModel[39].addBox(-41F, 2.5F, -1F, 15, 2, 2, 0F); // Nose40
		noseModel[39].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[39].rotateAngleY = -0.2268928F;
		noseModel[39].rotateAngleZ = -0.1919862F;

		noseModel[40].addBox(-25F, -13.5F, 0.5F, 28, 2, 11, 0F); // Nose41
		noseModel[40].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[40].rotateAngleX = 0.04363323F;
		noseModel[40].rotateAngleY = -0.2268928F;
		noseModel[40].rotateAngleZ = 0.1919862F;

		noseModel[41].addBox(-25F, -13.5F, -11.5F, 28, 2, 11, 0F); // Nose42
		noseModel[41].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[41].rotateAngleX = -0.04363323F;
		noseModel[41].rotateAngleY = 0.2268928F;
		noseModel[41].rotateAngleZ = 0.1919862F;

		noseModel[42].addBox(-26F, 6.5F, 0.5F, 28, 2, 11, 0F); // Nose43
		noseModel[42].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[42].rotateAngleX = -0.04363323F;
		noseModel[42].rotateAngleY = -0.2268928F;
		noseModel[42].rotateAngleZ = -0.1919862F;

		noseModel[43].addBox(-26F, 6.5F, -11.5F, 28, 2, 11, 0F); // Nose44
		noseModel[43].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[43].rotateAngleX = 0.04363323F;
		noseModel[43].rotateAngleY = 0.2268928F;
		noseModel[43].rotateAngleZ = -0.1919862F;

		noseModel[44].addBox(-62F, 19.5F, -9.5F, 3, 1, 19, 0F); // Nose45
		noseModel[44].setRotationPoint(0F, 0F, 0F);
		noseModel[44].rotateAngleZ = -0.1919862F;

		noseModel[45].addBox(-62F, -25.5F, -9.5F, 3, 1, 19, 0F); // Nose46
		noseModel[45].setRotationPoint(0F, 0F, 0F);
		noseModel[45].rotateAngleZ = 0.1919862F;

		noseModel[46].addBox(-63F, -14.3F, -9.5F, 7, 1, 19, 0F); // Nose47
		noseModel[46].setRotationPoint(0F, 0F, 0F);

		noseModel[47].addBox(-42F, 6.5F, 3.5F, 16, 2, 2, 0F); // Nose48
		noseModel[47].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[47].rotateAngleX = -0.04363323F;
		noseModel[47].rotateAngleY = -0.2268928F;
		noseModel[47].rotateAngleZ = -0.1919862F;

		noseModel[48].addBox(-40F, 6.5F, -6.5F, 14, 2, 2, 0F); // Nose49
		noseModel[48].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[48].rotateAngleX = 0.04363323F;
		noseModel[48].rotateAngleY = 0.2268928F;
		noseModel[48].rotateAngleZ = -0.1919862F;

		noseModel[49].addBox(-48F, 6.5F, -2.5F, 22, 2, 2, 0F); // Nose50
		noseModel[49].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[49].rotateAngleX = 0.04363323F;
		noseModel[49].rotateAngleY = 0.2268928F;
		noseModel[49].rotateAngleZ = -0.1919862F;

		noseModel[50].addBox(-44F, 6.5F, -4.5F, 18, 2, 2, 0F); // Nose51
		noseModel[50].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[50].rotateAngleX = 0.04363323F;
		noseModel[50].rotateAngleY = 0.2268928F;
		noseModel[50].rotateAngleZ = -0.1919862F;

		noseModel[51].addBox(-48F, 6.5F, 0.5F, 22, 2, 2, 0F); // Nose52
		noseModel[51].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[51].rotateAngleX = -0.04363323F;
		noseModel[51].rotateAngleY = -0.2268928F;
		noseModel[51].rotateAngleZ = -0.1919862F;

		noseModel[52].addBox(-46F, 6.5F, 1.5F, 20, 2, 2, 0F); // Nose53
		noseModel[52].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[52].rotateAngleX = -0.04363323F;
		noseModel[52].rotateAngleY = -0.2268928F;
		noseModel[52].rotateAngleZ = -0.1919862F;

		noseModel[53].addBox(-39F, -13.5F, 4.5F, 14, 2, 2, 0F); // Nose54
		noseModel[53].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[53].rotateAngleX = 0.04363323F;
		noseModel[53].rotateAngleY = -0.2268928F;
		noseModel[53].rotateAngleZ = 0.1919862F;

		noseModel[54].addBox(-46F, -13.5F, 0.5F, 21, 2, 2, 0F); // Nose55
		noseModel[54].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[54].rotateAngleX = 0.04363323F;
		noseModel[54].rotateAngleY = -0.2268928F;
		noseModel[54].rotateAngleZ = 0.1919862F;

		noseModel[55].addBox(-44F, -13.5F, 1.5F, 19, 2, 2, 0F); // Nose56
		noseModel[55].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[55].rotateAngleX = 0.04363323F;
		noseModel[55].rotateAngleY = -0.2268928F;
		noseModel[55].rotateAngleZ = 0.1919862F;

		noseModel[56].addBox(-43F, -13.5F, 2.5F, 18, 2, 2, 0F); // Nose57
		noseModel[56].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[56].rotateAngleX = 0.04363323F;
		noseModel[56].rotateAngleY = -0.2268928F;
		noseModel[56].rotateAngleZ = 0.1919862F;

		noseModel[57].addBox(-40F, -13.5F, 3.5F, 15, 2, 2, 0F); // Nose58
		noseModel[57].setRotationPoint(-63F, 0F, -11.5F);
		noseModel[57].rotateAngleX = 0.04363323F;
		noseModel[57].rotateAngleY = -0.2268928F;
		noseModel[57].rotateAngleZ = 0.1919862F;

		noseModel[58].addBox(-39F, -13.5F, -6.5F, 14, 2, 2, 0F); // Nose59
		noseModel[58].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[58].rotateAngleX = -0.04363323F;
		noseModel[58].rotateAngleY = 0.2268928F;
		noseModel[58].rotateAngleZ = 0.1919862F;

		noseModel[59].addBox(-46F, -13.5F, -2.5F, 21, 2, 2, 0F); // Nose60
		noseModel[59].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[59].rotateAngleX = -0.04363323F;
		noseModel[59].rotateAngleY = 0.2268928F;
		noseModel[59].rotateAngleZ = 0.1919862F;

		noseModel[60].addBox(-45F, -13.5F, -3.5F, 20, 2, 2, 0F); // Nose61
		noseModel[60].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[60].rotateAngleX = -0.04363323F;
		noseModel[60].rotateAngleY = 0.2268928F;
		noseModel[60].rotateAngleZ = 0.1919862F;

		noseModel[61].addBox(-43F, -13.5F, -4.5F, 18, 2, 2, 0F); // Nose62
		noseModel[61].setRotationPoint(-63F, 0F, 11.5F);
		noseModel[61].rotateAngleX = -0.04363323F;
		noseModel[61].rotateAngleY = 0.2268928F;
		noseModel[61].rotateAngleZ = 0.1919862F;



// Body
		bodyModel = new ModelRendererTurbo[161];
		bodyModel[0] = new ModelRendererTurbo(this,  1,  291, textureX, textureY); // CockpitSeat1
		bodyModel[1] = new ModelRendererTurbo(this,  1,  313, textureX, textureY); // CockpitSeat2
		bodyModel[2] = new ModelRendererTurbo(this,  1,  313, textureX, textureY); // CockpitSeat3
		bodyModel[3] = new ModelRendererTurbo(this,  1,  329, textureX, textureY); // CockpitSeat4
		bodyModel[4] = new ModelRendererTurbo(this,  1,  368, textureX, textureY); // CockpitSeat5
		bodyModel[5] = new ModelRendererTurbo(this,  44,  332, textureX, textureY); // CockpitSeat6
		bodyModel[6] = new ModelRendererTurbo(this,  22,  312, textureX, textureY); // CockpitSeat7
		bodyModel[7] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat8
		bodyModel[8] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat9
		bodyModel[9] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat10
		bodyModel[10] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat11
		bodyModel[11] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat12
		bodyModel[12] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat13
		bodyModel[13] = new ModelRendererTurbo(this,  1,  329, textureX, textureY); // CockpitSeat14
		bodyModel[14] = new ModelRendererTurbo(this,  1,  397, textureX, textureY); // CockpitSeat15
		bodyModel[15] = new ModelRendererTurbo(this,  31,  372, textureX, textureY); // CockpitSeat16
		bodyModel[16] = new ModelRendererTurbo(this,  35,  386, textureX, textureY); // CockpitSeat17
		bodyModel[17] = new ModelRendererTurbo(this,  42,  368, textureX, textureY); // CockpitSeat18
		bodyModel[18] = new ModelRendererTurbo(this,  49,  389, textureX, textureY); // CockpitSeat19
		bodyModel[19] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat20
		bodyModel[20] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat21
		bodyModel[21] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat22
		bodyModel[22] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat23
		bodyModel[23] = new ModelRendererTurbo(this,  1,  390, textureX, textureY); // CockpitSeat24
		bodyModel[24] = new ModelRendererTurbo(this,  1,  456, textureX, textureY); // CockpitControl1
		bodyModel[25] = new ModelRendererTurbo(this,  1,  495, textureX, textureY); // CockpitControl2
		bodyModel[26] = new ModelRendererTurbo(this,  1,  522, textureX, textureY); // CockpitControl3
		bodyModel[27] = new ModelRendererTurbo(this,  1,  556, textureX, textureY); // CockpitControl4
		bodyModel[28] = new ModelRendererTurbo(this,  1,  580, textureX, textureY); // CockpitControl5
		bodyModel[29] = new ModelRendererTurbo(this,  1,  580, textureX, textureY); // CockpitControl6
		bodyModel[30] = new ModelRendererTurbo(this,  1,  593, textureX, textureY); // CockpitControl7
		bodyModel[31] = new ModelRendererTurbo(this,  16,  595, textureX, textureY); // CockpitControl8
		bodyModel[32] = new ModelRendererTurbo(this,  30,  579, textureX, textureY); // CockpitControl9
		bodyModel[33] = new ModelRendererTurbo(this,  30,  589, textureX, textureY); // CockpitControl10
		bodyModel[34] = new ModelRendererTurbo(this,  30,  595, textureX, textureY); // CockpitControl11
		bodyModel[35] = new ModelRendererTurbo(this,  1,  593, textureX, textureY); // CockpitControl12
		bodyModel[36] = new ModelRendererTurbo(this,  1,  604, textureX, textureY); // CockpitControl13
		bodyModel[37] = new ModelRendererTurbo(this,  1,  593, textureX, textureY); // CockpitControl14
		bodyModel[38] = new ModelRendererTurbo(this,  1,  610, textureX, textureY); // CockpitControl15
		bodyModel[39] = new ModelRendererTurbo(this,  17,  610, textureX, textureY); // CockpitControl16
		bodyModel[40] = new ModelRendererTurbo(this,  31,  610, textureX, textureY); // CockpitControl17
		bodyModel[41] = new ModelRendererTurbo(this,  44,  610, textureX, textureY); // CockpitControl18
		bodyModel[42] = new ModelRendererTurbo(this,  44,  610, textureX, textureY); // CockpitControl19
		bodyModel[43] = new ModelRendererTurbo(this,  44,  610, textureX, textureY); // CockpitControl20
		bodyModel[44] = new ModelRendererTurbo(this,  44,  610, textureX, textureY); // CockpitControl21
		bodyModel[45] = new ModelRendererTurbo(this,  40,  624, textureX, textureY); // CockpitControl22
		bodyModel[46] = new ModelRendererTurbo(this,  1,  625, textureX, textureY); // CockpitControl23
		bodyModel[47] = new ModelRendererTurbo(this,  1,  637, textureX, textureY); // CockpitControlStick1
		bodyModel[48] = new ModelRendererTurbo(this,  1,  637, textureX, textureY); // CockpitControlStick2
		bodyModel[49] = new ModelRendererTurbo(this,  1,  637, textureX, textureY); // CockpitControlStick3
		bodyModel[50] = new ModelRendererTurbo(this,  1,  637, textureX, textureY); // CockpitControlStick4
		bodyModel[51] = new ModelRendererTurbo(this,  1,  637, textureX, textureY); // CockpitControlStick5
		bodyModel[52] = new ModelRendererTurbo(this,  1,  650, textureX, textureY); // CockpitControlStick6
		bodyModel[53] = new ModelRendererTurbo(this,  1,  650, textureX, textureY); // CockpitControlStick7
		bodyModel[54] = new ModelRendererTurbo(this,  21,  625, textureX, textureY); // CockpitHudFrame1
		bodyModel[55] = new ModelRendererTurbo(this,  25,  638, textureX, textureY); // CockpitHudFrame2
		bodyModel[56] = new ModelRendererTurbo(this,  25,  638, textureX, textureY); // CockpitHudFrame3
		bodyModel[57] = new ModelRendererTurbo(this,  45,  637, textureX, textureY); // CockpitHudFrame4
		bodyModel[58] = new ModelRendererTurbo(this,  1,  425, textureX, textureY); // CockpitBase1
		bodyModel[59] = new ModelRendererTurbo(this,  1,  657, textureX, textureY); // CockpitBase2
		bodyModel[60] = new ModelRendererTurbo(this,  1,  671, textureX, textureY); // CockpitBase3
		bodyModel[61] = new ModelRendererTurbo(this,  1,  688, textureX, textureY); // CockpitBase4
		bodyModel[62] = new ModelRendererTurbo(this,  1,  688, textureX, textureY); // CockpitBase5
		bodyModel[63] = new ModelRendererTurbo(this,  58,  457, textureX, textureY); // CockpitBase6
		bodyModel[64] = new ModelRendererTurbo(this,  67,  502, textureX, textureY); // CorkpitGuff7
		bodyModel[65] = new ModelRendererTurbo(this,  67,  502, textureX, textureY); // CorkpitGuff8
		bodyModel[66] = new ModelRendererTurbo(this,  67,  502, textureX, textureY); // CorkpitGuff9
		bodyModel[67] = new ModelRendererTurbo(this,  67,  502, textureX, textureY); // CorkpitGuff10
		bodyModel[68] = new ModelRendererTurbo(this,  67,  502, textureX, textureY); // CorkpitGuff11
		bodyModel[69] = new ModelRendererTurbo(this,  89,  502, textureX, textureY); // CorkpitGuff12
		bodyModel[70] = new ModelRendererTurbo(this,  66,  519, textureX, textureY); // CorkpitGuff13
		bodyModel[71] = new ModelRendererTurbo(this,  67,  519, textureX, textureY); // CorkpitGuff14
		bodyModel[72] = new ModelRendererTurbo(this,  67,  519, textureX, textureY); // CorkpitGuff15
		bodyModel[73] = new ModelRendererTurbo(this,  66,  519, textureX, textureY); // CorkpitGuff16
		bodyModel[74] = new ModelRendererTurbo(this,  90,  520, textureX, textureY); // CorkpitGuff17
		bodyModel[75] = new ModelRendererTurbo(this,  107,  260, textureX, textureY); // F15Cockpit1
		bodyModel[76] = new ModelRendererTurbo(this,  107,  300, textureX, textureY); // F15Cockpit2
		bodyModel[77] = new ModelRendererTurbo(this,  107,  300, textureX, textureY); // F15Cockpit3
		bodyModel[78] = new ModelRendererTurbo(this,  107,  260, textureX, textureY); // F15Cockpit4
		bodyModel[79] = new ModelRendererTurbo(this,  109,  322, textureX, textureY); // F15Cockpit5
		bodyModel[80] = new ModelRendererTurbo(this,  177,  325, textureX, textureY); // F15Cockpit6
		bodyModel[81] = new ModelRendererTurbo(this,  177,  325, textureX, textureY); // F15Cockpit7
		bodyModel[82] = new ModelRendererTurbo(this,  177,  349, textureX, textureY); // F15Cockpit8
		bodyModel[83] = new ModelRendererTurbo(this,  7,  154, textureX, textureY); // Galm1LCPNo
		bodyModel[84] = new ModelRendererTurbo(this,  7,  154, textureX, textureY); // Galm1RCPNo
		bodyModel[85] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy1
		bodyModel[86] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy2
		bodyModel[87] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy3
		bodyModel[88] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy4
		bodyModel[89] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy5
		bodyModel[90] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy6
		bodyModel[91] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy7
		bodyModel[92] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy8
		bodyModel[93] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy9
		bodyModel[94] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy10
		bodyModel[95] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy11
		bodyModel[96] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy12
		bodyModel[97] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy13
		bodyModel[98] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy14
		bodyModel[99] = new ModelRendererTurbo(this,  0,  793, textureX, textureY); // Canopy15
		bodyModel[100] = new ModelRendererTurbo(this,  0,  793, textureX, textureY); // Canopy16
		bodyModel[101] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy17
		bodyModel[102] = new ModelRendererTurbo(this,  1,  793, textureX, textureY); // Canopy18
		bodyModel[103] = new ModelRendererTurbo(this,  1,  800, textureX, textureY); // Canopy19
		bodyModel[104] = new ModelRendererTurbo(this,  1,  802, textureX, textureY); // Canopy20
		bodyModel[105] = new ModelRendererTurbo(this,  1,  801, textureX, textureY); // Canopy21
		bodyModel[106] = new ModelRendererTurbo(this,  1,  800, textureX, textureY); // Canopy22
		bodyModel[107] = new ModelRendererTurbo(this,  168,  376, textureX, textureY); // F15CoreBody1
		bodyModel[108] = new ModelRendererTurbo(this,  168,  430, textureX, textureY); // F15CoreBody2
		bodyModel[109] = new ModelRendererTurbo(this,  168,  465, textureX, textureY); // F15CoreBody3
		bodyModel[110] = new ModelRendererTurbo(this,  126,  465, textureX, textureY); // F15CoreBody4
		bodyModel[111] = new ModelRendererTurbo(this,  126,  465, textureX, textureY); // F15CoreBody5
		bodyModel[112] = new ModelRendererTurbo(this,  132,  506, textureX, textureY); // F15CoreBody6
		bodyModel[113] = new ModelRendererTurbo(this,  248,  476, textureX, textureY); // F15CoreBody7
		bodyModel[114] = new ModelRendererTurbo(this,  248,  419, textureX, textureY); // F15CoreBody8
		bodyModel[115] = new ModelRendererTurbo(this,  248,  442, textureX, textureY); // F15CoreBody9
		bodyModel[116] = new ModelRendererTurbo(this,  248,  442, textureX, textureY); // F15CoreBody10
		bodyModel[117] = new ModelRendererTurbo(this,  132,  600, textureX, textureY); // F15CoreBody11
		bodyModel[118] = new ModelRendererTurbo(this,  180,  600, textureX, textureY); // F15CoreBody12
		bodyModel[119] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody13
		bodyModel[120] = new ModelRendererTurbo(this,  290,  600, textureX, textureY); // F15CoreBody14
		bodyModel[121] = new ModelRendererTurbo(this,  182,  626, textureX, textureY); // F15CoreBody15
		bodyModel[122] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody16
		bodyModel[123] = new ModelRendererTurbo(this,  180,  600, textureX, textureY); // F15CoreBody17
		bodyModel[124] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody18
		bodyModel[125] = new ModelRendererTurbo(this,  182,  625, textureX, textureY); // F15CoreBody19
		bodyModel[126] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody20
		bodyModel[127] = new ModelRendererTurbo(this,  290,  600, textureX, textureY); // F15CoreBody21
		bodyModel[128] = new ModelRendererTurbo(this,  132,  600, textureX, textureY); // F15CoreBody22
		bodyModel[129] = new ModelRendererTurbo(this,  248,  453, textureX, textureY); // F15CoreBody23
		bodyModel[130] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody24
		bodyModel[131] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody25
		bodyModel[132] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody26
		bodyModel[133] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody27
		bodyModel[134] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody28
		bodyModel[135] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody29
		bodyModel[136] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody30
		bodyModel[137] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody31
		bodyModel[138] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody32
		bodyModel[139] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody33
		bodyModel[140] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody34
		bodyModel[141] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody35
		bodyModel[142] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody36
		bodyModel[143] = new ModelRendererTurbo(this,  132,  646, textureX, textureY); // F15CoreBody37
		bodyModel[144] = new ModelRendererTurbo(this,  132,  655, textureX, textureY); // F15CoreBody38
		bodyModel[145] = new ModelRendererTurbo(this,  132,  655, textureX, textureY); // F15CoreBody39
		bodyModel[146] = new ModelRendererTurbo(this,  132,  686, textureX, textureY); // F15CoreBody40
		bodyModel[147] = new ModelRendererTurbo(this,  132,  686, textureX, textureY); // F15CoreBody41
		bodyModel[148] = new ModelRendererTurbo(this,  132,  711, textureX, textureY); // F15CoreBody42
		bodyModel[149] = new ModelRendererTurbo(this,  132,  711, textureX, textureY); // F15CoreBody43
		bodyModel[150] = new ModelRendererTurbo(this,  132,  686, textureX, textureY); // F15CoreBody44
		bodyModel[151] = new ModelRendererTurbo(this,  132,  686, textureX, textureY); // F15CoreBody45
		bodyModel[152] = new ModelRendererTurbo(this,  160,  737, textureX, textureY); // F15CoreBody46
		bodyModel[153] = new ModelRendererTurbo(this,  130,  737, textureX, textureY); // F15CoreBody47
		bodyModel[154] = new ModelRendererTurbo(this,  157,  760, textureX, textureY); // F15CoreBody48
		bodyModel[155] = new ModelRendererTurbo(this,  131,  759, textureX, textureY); // F15CoreBody49
		bodyModel[156] = new ModelRendererTurbo(this,  132,  711, textureX, textureY); // F15CoreBody50
		bodyModel[157] = new ModelRendererTurbo(this,  132,  711, textureX, textureY); // F15CoreBody51
		bodyModel[158] = new ModelRendererTurbo(this,  132,  711, textureX, textureY); // F15CoreBody52
		bodyModel[159] = new ModelRendererTurbo(this,  159,  776, textureX, textureY); // F15CoreBody53
		bodyModel[160] = new ModelRendererTurbo(this,  131,  776, textureX, textureY); // F15CoreMG1

		bodyModel[0].addBox(-45F, -2F, -8F, 17, 3, 16, 0F); // CockpitSeat1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-48F, -2F, -8F, 3, 3, 5, 0F); // CockpitSeat2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-48F, -2F, 3F, 3, 3, 5, 0F); // CockpitSeat3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-33F, -16F, -6.5F, 4, 20, 13, 0F); // CockpitSeat4
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
		bodyModel[3].rotateAngleZ = -0.1396263F;

		bodyModel[4].addBox(-34F, -20F, -5F, 2, 4, 10, 0F); // CockpitSeat5
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
		bodyModel[4].rotateAngleZ = -0.1396263F;

		bodyModel[5].addBox(-34.5F, -16F, -6F, 2, 18, 12, 0F); // CockpitSeat6
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
		bodyModel[5].rotateAngleZ = -0.1396263F;

		bodyModel[6].addBox(-45F, -2.5F, -6F, 12, 1, 12, 0F); // CockpitSeat7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(-20F, -43.5F, 6.5F, 4, 1, 1, 0F); // CockpitSeat8
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
		bodyModel[7].rotateAngleZ = 1.117011F;

		bodyModel[8].addBox(-46F, -5F, 6.5F, 4, 1, 1, 0F); // CockpitSeat9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(-43F, -5F, 6.5F, 1, 4, 1, 0F); // CockpitSeat10
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(-46F, -5F, -7.5F, 4, 1, 1, 0F); // CockpitSeat11
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addBox(-20F, -43.5F, -7.5F, 4, 1, 1, 0F); // CockpitSeat12
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		bodyModel[11].rotateAngleZ = 1.117011F;

		bodyModel[12].addBox(-43F, -5F, -7.5F, 1, 4, 1, 0F); // CockpitSeat13
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addBox(-30F, -16F, -8F, 2, 20, 16, 0F); // CockpitSeat14
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
		bodyModel[13].rotateAngleZ = -0.1396263F;

		bodyModel[14].addBox(-33F, -16F, -8F, 4, 4, 16, 0F); // CockpitSeat15
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
		bodyModel[14].rotateAngleZ = -0.1396263F;

		bodyModel[15].addBox(-32.5F, -11F, -8F, 2, 9, 2, 0F); // CockpitSeat16
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
		bodyModel[15].rotateAngleZ = -0.1396263F;

		bodyModel[16].addBox(-32F, -2F, -7.5F, 1, 2, 1, 0F); // CockpitSeat17
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
		bodyModel[16].rotateAngleZ = -0.1396263F;

		bodyModel[17].addBox(-30F, -21F, -6F, 4, 3, 12, 0F); // CockpitSeat18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addBox(-30F, -23F, -4.5F, 4, 2, 9, 0F); // CockpitSeat19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addBox(-38.5F, -4F, 6.5F, 1, 1, 1, 0F); // CockpitSeat20
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addBox(-40F, -5F, 6.5F, 4, 1, 1, 0F); // CockpitSeat21
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addBox(-40F, -3F, 6.5F, 4, 1, 1, 0F); // CockpitSeat22
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addBox(-40F, -4F, 6.5F, 1, 1, 1, 0F); // CockpitSeat23
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addBox(-37F, -4F, 6.5F, 1, 1, 1, 0F); // CockpitSeat24
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addBox(-54F, -19F, -11F, 4, 10, 22, 0F); // CockpitControl1
		bodyModel[24].setRotationPoint(0F, 0F, 0F);
		bodyModel[24].rotateAngleZ = 0.2094395F;

		bodyModel[25].addBox(-50F, -19F, -4F, 1, 10, 8, 0F); // CockpitControl2
		bodyModel[25].setRotationPoint(0F, 0F, 0F);
		bodyModel[25].rotateAngleZ = 0.2094395F;

		bodyModel[26].addBox(-54F, -24F, -11F, 6, 5, 22, 0F); // CockpitControl3
		bodyModel[26].setRotationPoint(0F, 0F, 0F);
		bodyModel[26].rotateAngleZ = 0.2094395F;

		bodyModel[27].addBox(-56F, -26F, -9F, 8, 2, 18, 0F); // CockpitControl4
		bodyModel[27].setRotationPoint(0F, 0F, 0F);
		bodyModel[27].rotateAngleZ = 0.2094395F;

		bodyModel[28].addBox(-54F, -12.2F, 21.6F, 6, 3, 3, 0F); // CockpitControl5
		bodyModel[28].setRotationPoint(0F, 0F, 0F);
		bodyModel[28].rotateAngleX = 0.7853982F;
		bodyModel[28].rotateAngleZ = 0.2094395F;

		bodyModel[29].addBox(-54F, -24.7F, 9F, 6, 3, 3, 0F); // CockpitControl6
		bodyModel[29].setRotationPoint(0F, 0F, 0F);
		bodyModel[29].rotateAngleX = 0.7853982F;
		bodyModel[29].rotateAngleZ = 0.2094395F;

		bodyModel[30].addBox(-48.8F, -21F, -2F, 1, 2, 4, 0F); // CockpitControl7
		bodyModel[30].setRotationPoint(0F, 0F, 0F);
		bodyModel[30].rotateAngleZ = 0.2094395F;

		bodyModel[31].addBox(-48.8F, -23.2F, -2F, 1, 2, 4, 0F); // CockpitControl8
		bodyModel[31].setRotationPoint(0F, 0F, 0F);
		bodyModel[31].rotateAngleZ = 0.2094395F;

		bodyModel[32].addBox(-48.8F, -22.6F, -4.5F, 1, 2, 2, 0F); // CockpitControl9
		bodyModel[32].setRotationPoint(0F, 0F, 0F);
		bodyModel[32].rotateAngleZ = 0.2094395F;

		bodyModel[33].addBox(-48.8F, -20.1F, -4F, 1, 1, 1, 0F); // CockpitControl10
		bodyModel[33].setRotationPoint(0F, 0F, 0F);
		bodyModel[33].rotateAngleZ = 0.2094395F;

		bodyModel[34].addBox(-48.8F, -21F, -4F, 1, 1, 1, 0F); // CockpitControl11
		bodyModel[34].setRotationPoint(0F, 0F, 0F);
		bodyModel[34].rotateAngleZ = 0.2094395F;

		bodyModel[35].addBox(-48.8F, -23.5F, -10F, 1, 4, 4, 0F); // CockpitControl12
		bodyModel[35].setRotationPoint(0F, 0F, 0F);
		bodyModel[35].rotateAngleZ = 0.2094395F;

		bodyModel[36].addBox(-48.8F, -22.5F, -6F, 1, 3, 1, 0F); // CockpitControl13
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
		bodyModel[36].rotateAngleZ = 0.2094395F;

		bodyModel[37].addBox(-48.8F, -24.9F, -9.3F, 1, 1, 1, 0F); // CockpitControl14
		bodyModel[37].setRotationPoint(0F, 0F, 0F);
		bodyModel[37].rotateAngleZ = 0.2094395F;

		bodyModel[38].addBox(-48.8F, -22.5F, 7F, 1, 3, 3, 0F); // CockpitControl15
		bodyModel[38].setRotationPoint(0F, 0F, 0F);
		bodyModel[38].rotateAngleZ = 0.2094395F;

		bodyModel[39].addBox(-48.8F, -25.5F, 3F, 1, 3, 3, 0F); // CockpitControl16
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
		bodyModel[39].rotateAngleZ = 0.2094395F;

		bodyModel[40].addBox(-48.8F, -25.5F, -6F, 1, 3, 3, 0F); // CockpitControl17
		bodyModel[40].setRotationPoint(0F, 0F, 0F);
		bodyModel[40].rotateAngleZ = 0.2094395F;

		bodyModel[41].addBox(-48.8F, -22.5F, 4.2F, 1, 1, 1, 0F); // CockpitControl18
		bodyModel[41].setRotationPoint(0F, 0F, 0F);
		bodyModel[41].rotateAngleZ = 0.2094395F;

		bodyModel[42].addBox(-48.8F, -21.2F, 4.2F, 1, 1, 1, 0F); // CockpitControl19
		bodyModel[42].setRotationPoint(0F, 0F, 0F);
		bodyModel[42].rotateAngleZ = 0.2094395F;

		bodyModel[43].addBox(-48.8F, -21.2F, 3F, 1, 1, 1, 0F); // CockpitControl20
		bodyModel[43].setRotationPoint(0F, 0F, 0F);
		bodyModel[43].rotateAngleZ = 0.2094395F;

		bodyModel[44].addBox(-48.8F, -22.5F, 3F, 1, 1, 1, 0F); // CockpitControl21
		bodyModel[44].setRotationPoint(0F, 0F, 0F);
		bodyModel[44].rotateAngleZ = 0.2094395F;

		bodyModel[45].addBox(-52.5F, -15.4F, -3F, 2, 2, 6, 0F); // CockpitControl22
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addBox(-56.5F, -15.4F, -2F, 2, 2, 4, 0F); // CockpitControl23
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addBox(-49.5F, -1.4F, -1.5F, 3, 3, 3, 0F); // CockpitControlStick1
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addBox(-48.5F, -4.4F, -0.5F, 1, 7, 1, 0F); // CockpitControlStick2
		bodyModel[48].setRotationPoint(0F, 0F, 0F);
		bodyModel[48].rotateAngleZ = -0.06981317F;

		bodyModel[49].addBox(-48.78F, 3.6F, -0.2F, 2, 2, 1, 0F); // CockpitControlStick3
		bodyModel[49].setRotationPoint(0F, 0F, 0F);
		bodyModel[49].rotateAngleZ = -0.2617994F;

		bodyModel[50].addBox(-48.78F, 3.6F, -0.8F, 2, 2, 1, 0F); // CockpitControlStick4
		bodyModel[50].setRotationPoint(0F, 0F, 0F);
		bodyModel[50].rotateAngleZ = -0.2617994F;

		bodyModel[51].addBox(-47.5F, -7.7F, -0.5F, 1, 1, 1, 0F); // CockpitControlStick5
		bodyModel[51].setRotationPoint(0F, 0F, 0F);
		bodyModel[51].rotateAngleZ = -0.03490658F;

		bodyModel[52].addBox(-47.5F, -9.7F, -0.5F, 1, 2, 1, 0F); // CockpitControlStick6
		bodyModel[52].setRotationPoint(0F, 0F, 0F);
		bodyModel[52].rotateAngleZ = -0.03490658F;

		bodyModel[53].addBox(-47.5F, -9.7F, -1F, 1, 1, 2, 0F); // CockpitControlStick7
		bodyModel[53].setRotationPoint(0F, 0F, 0F);
		bodyModel[53].rotateAngleZ = -0.03490658F;

		bodyModel[54].addBox(-55.5F, -16.4F, -2.5F, 4, 2, 5, 0F); // CockpitHudFrame1
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addBox(-22.5F, 51.6F, -3.5F, 7, 1, 1, 0F); // CockpitHudFrame2
		bodyModel[55].setRotationPoint(0F, 0F, 0F);
		bodyModel[55].rotateAngleZ = -1.570796F;

		bodyModel[56].addBox(-22.5F, 51.6F, 2.5F, 7, 1, 1, 0F); // CockpitHudFrame3
		bodyModel[56].setRotationPoint(0F, 0F, 0F);
		bodyModel[56].rotateAngleZ = -1.570796F;

		bodyModel[57].addBox(-22.5F, 51.6F, -3.5F, 1, 1, 7, 0F); // CockpitHudFrame4
		bodyModel[57].setRotationPoint(0F, 0F, 0F);
		bodyModel[57].rotateAngleZ = -1.570796F;

		bodyModel[58].addBox(-55F, 1F, -11.5F, 55, 2, 23, 0F); // CockpitBase1
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addBox(-53F, -6F, -11F, 26, 7, 3, 0F); // CockpitBase2
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addBox(-53F, -6F, 8F, 26, 7, 3, 0F); // CockpitBase3
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addBox(-55F, -12F, -11.5F, 55, 13, 1, 0F); // CockpitBase4
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addBox(-55F, -12F, 10.5F, 55, 13, 1, 0F); // CockpitBase5
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addBox(0F, -12F, -12F, 1, 15, 24, 0F); // CockpitBase6
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addBox(-26.4F, -9F, -11F, 5, 10, 4, 0F); // CorkpitGuff7
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addBox(-5.2F, -9F, -11F, 5, 10, 4, 0F); // CorkpitGuff8
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addBox(-10.5F, -9F, -11F, 5, 10, 4, 0F); // CorkpitGuff9
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addBox(-15.8F, -9F, -11F, 5, 10, 4, 0F); // CorkpitGuff10
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addBox(-21.1F, -9F, -11F, 5, 10, 4, 0F); // CorkpitGuff11
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addBox(-2.2F, -9F, -4F, 3, 10, 3, 0F); // CorkpitGuff12
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addBox(-22.2F, -9F, 9F, 4, 10, 2, 0F); // CorkpitGuff13
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addBox(-7.2F, -9F, 9F, 4, 10, 2, 0F); // CorkpitGuff14
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addBox(-12.2F, -9F, 9F, 4, 10, 2, 0F); // CorkpitGuff15
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addBox(-17.2F, -9F, 9F, 4, 10, 2, 0F); // CorkpitGuff16
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addBox(-1.2F, -9F, 4F, 2, 10, 6, 0F); // CorkpitGuff17
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addBox(-63F, 3F, -12.5F, 64, 6, 25, 0F); // F15Cockpit1
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addBox(-63F, -14F, -12.5F, 64, 17, 1, 0F); // F15Cockpit2
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addBox(-63F, -14F, 11.5F, 64, 17, 1, 0F); // F15Cockpit3
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addBox(-63F, 3F, -12.5F, 64, 6, 25, 0F); // F15Cockpit4
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addBox(-63F, -14F, -12.5F, 7, 17, 25, 0F); // F15Cockpit5
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addBox(-62F, -8F, -13.2F, 63, 12, 1, 0F); // F15Cockpit6
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addBox(-62F, -8F, 12.2F, 63, 12, 1, 0F); // F15Cockpit7
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addBox(-63F, 8.4F, -9.5F, 64, 1, 19, 0F); // F15Cockpit8
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addBox(-47F, -7.1F, 12.3F, 18, 9, 1, 0F); // Galm1LCPNo
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addBox(-47F, -7.1F, -13.3F, 18, 9, 1, 0F); // Galm1RCPNo
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addBox(-47.8F, -32.8F, 7F, 11, 1, 1, 0F); // Canopy1
		bodyModel[85].setRotationPoint(0F, 0F, 0F);
		bodyModel[85].rotateAngleZ = 0.1745329F;

		bodyModel[86].addBox(-42F, -26F, 7F, 35, 1, 1, 0F); // Canopy2
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addBox(-13.1F, -23.5F, 7F, 15, 1, 1, 0F); // Canopy3
		bodyModel[87].setRotationPoint(0F, 0F, 0F);
		bodyModel[87].rotateAngleZ = -0.2443461F;

		bodyModel[88].addBox(-13.1F, -23.5F, -8F, 15, 1, 1, 0F); // Canopy4
		bodyModel[88].setRotationPoint(0F, 0F, 0F);
		bodyModel[88].rotateAngleZ = -0.2443461F;

		bodyModel[89].addBox(-42F, -26F, -8F, 35, 1, 1, 0F); // Canopy5
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addBox(-47.8F, -32.8F, -8F, 11, 1, 1, 0F); // Canopy6
		bodyModel[90].setRotationPoint(0F, 0F, 0F);
		bodyModel[90].rotateAngleZ = 0.1745329F;

		bodyModel[91].addBox(-54F, 33F, -8F, 2, 2, 16, 0F); // Canopy7
		bodyModel[91].setRotationPoint(0F, 0F, 0F);
		bodyModel[91].rotateAngleZ = -0.8028514F;

		bodyModel[92].addBox(-47.8F, -32.8F, -8F, 1, 1, 16, 0F); // Canopy8
		bodyModel[92].setRotationPoint(0F, 0F, 0F);
		bodyModel[92].rotateAngleZ = 0.1745329F;

		bodyModel[93].addBox(-26F, -26F, -8F, 1, 1, 16, 0F); // Canopy9
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addBox(-1.1F, -23.5F, -8F, 3, 1, 16, 0F); // Canopy10
		bodyModel[94].setRotationPoint(0F, 0F, 0F);
		bodyModel[94].rotateAngleZ = -0.2443461F;

		bodyModel[95].addBox(-49.3F, -15F, -37.5F, 1, 1, 6, 0F); // Canopy11
		bodyModel[95].setRotationPoint(0F, 0F, 0F);
		bodyModel[95].rotateAngleY = -0.7853982F;

		bodyModel[96].addBox(-38F, -15F, -49.1F, 6, 2, 1, 0F); // Canopy12
		bodyModel[96].setRotationPoint(0F, 0F, 0F);
		bodyModel[96].rotateAngleY = -0.7853982F;

		bodyModel[97].addBox(-57.2F, -15F, 11.5F, 59, 1, 1, 0F); // Canopy13
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addBox(-57.2F, -15F, -12.5F, 59, 1, 1, 0F); // Canopy14
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addBox(-52.8F, -17.6F, 8F, 1, 1, 10, 0F); // Canopy15
		bodyModel[99].setRotationPoint(0F, 0F, 0F);
		bodyModel[99].rotateAngleX = 1.117011F;

		bodyModel[100].addBox(-52.8F, -17.6F, -18F, 1, 1, 10, 0F); // Canopy16
		bodyModel[100].setRotationPoint(0F, 0F, 0F);
		bodyModel[100].rotateAngleX = -1.117011F;

		bodyModel[101].addBox(-26F, -17.4F, 8.8F, 1, 1, 12, 0F); // Canopy17
		bodyModel[101].setRotationPoint(0F, 0F, 0F);
		bodyModel[101].rotateAngleX = 1.169371F;

		bodyModel[102].addBox(-26F, -17.4F, -20.8F, 1, 1, 12, 0F); // Canopy18
		bodyModel[102].setRotationPoint(0F, 0F, 0F);
		bodyModel[102].rotateAngleX = -1.169371F;

		bodyModel[103].addBox(-8F, -18F, -12.5F, 1, 6, 1, 0F); // Canopy19
		bodyModel[103].setRotationPoint(0F, 0F, 0F);
		bodyModel[103].rotateAngleZ = -0.6108652F;

		bodyModel[104].addBox(-8F, -18F, 11.5F, 1, 6, 1, 0F); // Canopy20
		bodyModel[104].setRotationPoint(0F, 0F, 0F);
		bodyModel[104].rotateAngleZ = -0.6108652F;

		bodyModel[105].addBox(-8F, -21.5F, 3.9F, 1, 1, 6, 0F); // Canopy21
		bodyModel[105].setRotationPoint(0F, 0F, 0F);
		bodyModel[105].rotateAngleX = 0.7853982F;
		bodyModel[105].rotateAngleZ = -0.6108652F;

		bodyModel[106].addBox(-8F, -10.2F, 20.4F, 1, 6, 1, 0F); // Canopy22
		bodyModel[106].setRotationPoint(0F, 0F, 0F);
		bodyModel[106].rotateAngleX = 0.7853982F;
		bodyModel[106].rotateAngleZ = -0.6108652F;

		bodyModel[107].addBox(1F, -14F, -13F, 12, 24, 26, 0F); // F15CoreBody1
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addBox(-7F, -23F, -8F, 16, 11, 16, 0F); // F15CoreBody2
		bodyModel[108].setRotationPoint(0F, 0F, 0F);
		bodyModel[108].rotateAngleZ = -0.6108652F;

		bodyModel[109].addBox(-7F, -18F, -13F, 10, 6, 26, 0F); // F15CoreBody3
		bodyModel[109].setRotationPoint(0F, 0F, 0F);
		bodyModel[109].rotateAngleZ = -0.6108652F;

		bodyModel[110].addBox(-7F, -21.9F, 3.5F, 16, 5, 7, 0F); // F15CoreBody4
		bodyModel[110].setRotationPoint(0F, 0F, 0F);
		bodyModel[110].rotateAngleX = 0.7853982F;
		bodyModel[110].rotateAngleZ = -0.6108652F;

		bodyModel[111].addBox(-7F, -10.7F, 16.8F, 16, 7, 5, 0F); // F15CoreBody5
		bodyModel[111].setRotationPoint(0F, 0F, 0F);
		bodyModel[111].rotateAngleX = 0.7853982F;
		bodyModel[111].rotateAngleZ = -0.6108652F;

		bodyModel[112].addBox(13F, -14F, -30F, 85, 24, 60, 0F); // F15CoreBody6
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addBox(1F, -23.8F, -8F, 31, 5, 16, 0F); // F15CoreBody7
		bodyModel[113].setRotationPoint(0F, 0F, 0F);
		bodyModel[113].rotateAngleZ = -0.2792527F;

		bodyModel[114].addBox(3F, -23.8F, -6F, 47, 5, 12, 0F); // F15CoreBody8
		bodyModel[114].setRotationPoint(0F, 0F, 0F);
		bodyModel[114].rotateAngleZ = -0.1919862F;

		bodyModel[115].addBox(16.7F, -28.4F, -1F, 3, 6, 1, 0F); // F15CoreBody9
		bodyModel[115].setRotationPoint(0F, 0F, 0F);
		bodyModel[115].rotateAngleZ = -0.1570796F;

		bodyModel[116].addBox(20F, -25.8F, -1F, 3, 6, 1, 0F); // F15CoreBody10
		bodyModel[116].setRotationPoint(0F, 0F, 0F);
		bodyModel[116].rotateAngleZ = -0.03490658F;

		bodyModel[117].addBox(8F, -14F, 13F, 5, 24, 17, 0F); // F15CoreBody11
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addBox(-24F, -13.3F, 13F, 33, 2, 17, 0F); // F15CoreBody12
		bodyModel[118].setRotationPoint(0F, 0F, 0F);
		bodyModel[118].rotateAngleZ = 0.06981317F;

		bodyModel[119].addBox(-25F, 5.6F, 13F, 31, 2, 2, 0F); // F15CoreBody13
		bodyModel[119].setRotationPoint(0F, 0F, 0F);
		bodyModel[119].rotateAngleZ = -0.6981317F;

		bodyModel[120].addBox(-1F, -12F, 13F, 9, 22, 17, 0F); // F15CoreBody14
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addBox(-24F, 4.6F, 15F, 29, 1, 14, 0F); // F15CoreBody15
		bodyModel[121].setRotationPoint(0F, 0F, 0F);
		bodyModel[121].rotateAngleZ = -0.6981317F;

		bodyModel[122].addBox(-25F, 5.6F, 28F, 31, 2, 2, 0F); // F15CoreBody16
		bodyModel[122].setRotationPoint(0F, 0F, 0F);
		bodyModel[122].rotateAngleZ = -0.6981317F;

		bodyModel[123].addBox(-24F, -13.3F, -30F, 33, 2, 17, 0F); // F15CoreBody17
		bodyModel[123].setRotationPoint(0F, 0F, 0F);
		bodyModel[123].rotateAngleZ = 0.06981317F;

		bodyModel[124].addBox(-25F, 5.6F, -15F, 31, 2, 2, 0F); // F15CoreBody18
		bodyModel[124].setRotationPoint(0F, 0F, 0F);
		bodyModel[124].rotateAngleZ = -0.6981317F;

		bodyModel[125].addBox(-24F, 4.6F, -28F, 29, 1, 14, 0F); // F15CoreBody19
		bodyModel[125].setRotationPoint(0F, 0F, 0F);
		bodyModel[125].rotateAngleZ = -0.6981317F;

		bodyModel[126].addBox(-25F, 5.6F, -30F, 31, 2, 2, 0F); // F15CoreBody20
		bodyModel[126].setRotationPoint(0F, 0F, 0F);
		bodyModel[126].rotateAngleZ = -0.6981317F;

		bodyModel[127].addBox(-1F, -12F, -30F, 9, 22, 17, 0F); // F15CoreBody21
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addBox(8F, -14F, -30F, 5, 24, 17, 0F); // F15CoreBody22
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addBox(5F, -23.5F, -4F, 61, 5, 8, 0F); // F15CoreBody23
		bodyModel[129].setRotationPoint(0F, 0F, 0F);
		bodyModel[129].rotateAngleZ = -0.1396263F;

		bodyModel[130].addBox(-10.3F, -8.4F, 28F, 6, 2, 2, 0F); // F15CoreBody24
		bodyModel[130].setRotationPoint(0F, 0F, 0F);
		bodyModel[130].rotateAngleZ = -0.6981317F;

		bodyModel[131].addBox(-22.8F, 3.6F, 28F, 27, 2, 2, 0F); // F15CoreBody25
		bodyModel[131].setRotationPoint(0F, 0F, 0F);
		bodyModel[131].rotateAngleZ = -0.6981317F;

		bodyModel[132].addBox(-20.8F, 1.6F, 28F, 23, 2, 2, 0F); // F15CoreBody26
		bodyModel[132].setRotationPoint(0F, 0F, 0F);
		bodyModel[132].rotateAngleZ = -0.6981317F;

		bodyModel[133].addBox(-18.7F, -0.4F, 28F, 21, 2, 2, 0F); // F15CoreBody27
		bodyModel[133].setRotationPoint(0F, 0F, 0F);
		bodyModel[133].rotateAngleZ = -0.6981317F;

		bodyModel[134].addBox(-16.7F, -2.4F, 28F, 16, 2, 2, 0F); // F15CoreBody28
		bodyModel[134].setRotationPoint(0F, 0F, 0F);
		bodyModel[134].rotateAngleZ = -0.6981317F;

		bodyModel[135].addBox(-14.5F, -4.4F, 28F, 13, 2, 2, 0F); // F15CoreBody29
		bodyModel[135].setRotationPoint(0F, 0F, 0F);
		bodyModel[135].rotateAngleZ = -0.6981317F;

		bodyModel[136].addBox(-12.4F, -6.4F, 28F, 8, 2, 2, 0F); // F15CoreBody30
		bodyModel[136].setRotationPoint(0F, 0F, 0F);
		bodyModel[136].rotateAngleZ = -0.6981317F;

		bodyModel[137].addBox(-22.8F, 3.6F, -30F, 27, 2, 2, 0F); // F15CoreBody31
		bodyModel[137].setRotationPoint(0F, 0F, 0F);
		bodyModel[137].rotateAngleZ = -0.6981317F;

		bodyModel[138].addBox(-20.8F, 1.6F, -30F, 23, 2, 2, 0F); // F15CoreBody32
		bodyModel[138].setRotationPoint(0F, 0F, 0F);
		bodyModel[138].rotateAngleZ = -0.6981317F;

		bodyModel[139].addBox(-18.7F, -0.4F, -30F, 21, 2, 2, 0F); // F15CoreBody33
		bodyModel[139].setRotationPoint(0F, 0F, 0F);
		bodyModel[139].rotateAngleZ = -0.6981317F;

		bodyModel[140].addBox(-16.7F, -2.4F, -30F, 16, 2, 2, 0F); // F15CoreBody34
		bodyModel[140].setRotationPoint(0F, 0F, 0F);
		bodyModel[140].rotateAngleZ = -0.6981317F;

		bodyModel[141].addBox(-14.5F, -4.4F, -30F, 13, 2, 2, 0F); // F15CoreBody35
		bodyModel[141].setRotationPoint(0F, 0F, 0F);
		bodyModel[141].rotateAngleZ = -0.6981317F;

		bodyModel[142].addBox(-12.4F, -6.4F, -30F, 8, 2, 2, 0F); // F15CoreBody36
		bodyModel[142].setRotationPoint(0F, 0F, 0F);
		bodyModel[142].rotateAngleZ = -0.6981317F;

		bodyModel[143].addBox(-10.3F, -8.4F, -30F, 6, 2, 2, 0F); // F15CoreBody37
		bodyModel[143].setRotationPoint(0F, 0F, 0F);
		bodyModel[143].rotateAngleZ = -0.6981317F;

		bodyModel[144].addBox(0F, 10F, 13F, 122, 2, 17, 0F); // F15CoreBody38
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addBox(0F, 10F, -30F, 122, 2, 17, 0F); // F15CoreBody39
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addBox(98F, -12F, 30F, 26, 11, 7, 0F); // F15CoreBody40
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addBox(98F, -12F, -37F, 26, 11, 7, 0F); // F15CoreBody41
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addBox(4.4F, -12F, -48F, 13, 11, 7, 0F); // F15CoreBody42
		bodyModel[148].setRotationPoint(0F, 0F, 0F);
		bodyModel[148].rotateAngleY = 0.6108652F;

		bodyModel[149].addBox(12.2F, -12F, -27.6F, 13, 11, 7, 0F); // F15CoreBody43
		bodyModel[149].setRotationPoint(0F, 0F, 0F);
		bodyModel[149].rotateAngleY = -0.6108652F;

		bodyModel[150].addBox(5F, -12F, 30F, 26, 11, 7, 0F); // F15CoreBody44
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addBox(5F, -12F, -37F, 26, 11, 7, 0F); // F15CoreBody45
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addBox(21.2F, -12F, 20.5F, 4, 11, 7, 0F); // F15CoreBody46
		bodyModel[152].setRotationPoint(0F, 0F, 0F);
		bodyModel[152].rotateAngleY = 0.6108652F;

		bodyModel[153].addBox(12.2F, -12F, 20.5F, 4, 11, 7, 0F); // F15CoreBody47
		bodyModel[153].setRotationPoint(0F, 0F, 0F);
		bodyModel[153].rotateAngleY = 0.6108652F;

		bodyModel[154].addBox(16.2F, -5F, 20.5F, 5, 4, 7, 0F); // F15CoreBody48
		bodyModel[154].setRotationPoint(0F, 0F, 0F);
		bodyModel[154].rotateAngleY = 0.6108652F;

		bodyModel[155].addBox(16.2F, -12F, 20.5F, 5, 4, 7, 0F); // F15CoreBody49
		bodyModel[155].setRotationPoint(0F, 0F, 0F);
		bodyModel[155].rotateAngleY = 0.6108652F;

		bodyModel[156].addBox(4.4F, -12F, 41F, 13, 11, 7, 0F); // F15CoreBody50
		bodyModel[156].setRotationPoint(0F, 0F, 0F);
		bodyModel[156].rotateAngleY = -0.6108652F;

		bodyModel[157].addBox(88.5F, -12F, -32.6F, 13, 11, 7, 0F); // F15CoreBody51
		bodyModel[157].setRotationPoint(0F, 0F, 0F);
		bodyModel[157].rotateAngleY = 0.6108652F;

		bodyModel[158].addBox(88.5F, -12F, 25.4F, 13, 11, 7, 0F); // F15CoreBody52
		bodyModel[158].setRotationPoint(0F, 0F, 0F);
		bodyModel[158].rotateAngleY = -0.6108652F;

		bodyModel[159].addBox(-1.8F, -8.5F, 30.5F, 7, 4, 1, 0F); // F15CoreBody53
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addBox(0.2F, -7.5F, 32F, 3, 2, 2, 0F); // F15CoreMG1
		bodyModel[160].setRotationPoint(0F, 0F, 0F);



// Tail
		tailModel = new ModelRendererTurbo[136];
		tailModel[0] = new ModelRendererTurbo(this,  413,  253, textureX, textureY); // F15CoreTail1
		tailModel[1] = new ModelRendererTurbo(this,  413,  343, textureX, textureY); // F15CoreTail2
		tailModel[2] = new ModelRendererTurbo(this,  413,  343, textureX, textureY); // F15CoreTail3
		tailModel[3] = new ModelRendererTurbo(this,  450,  402, textureX, textureY); // F15CoreTail4
		tailModel[4] = new ModelRendererTurbo(this,  489,  343, textureX, textureY); // F15CoreTail5
		tailModel[5] = new ModelRendererTurbo(this,  489,  343, textureX, textureY); // F15CoreTail6
		tailModel[6] = new ModelRendererTurbo(this,  594,  256, textureX, textureY); // F15CoreTail7
		tailModel[7] = new ModelRendererTurbo(this,  594,  256, textureX, textureY); // F15CoreTail8
		tailModel[8] = new ModelRendererTurbo(this,  595,  277, textureX, textureY); // F15CoreTail9
		tailModel[9] = new ModelRendererTurbo(this,  595,  277, textureX, textureY); // F15CoreTail10
		tailModel[10] = new ModelRendererTurbo(this,  595,  277, textureX, textureY); // F15CoreTail11
		tailModel[11] = new ModelRendererTurbo(this,  595,  277, textureX, textureY); // F15CoreTail12
		tailModel[12] = new ModelRendererTurbo(this,  587,  296, textureX, textureY); // F15CoreTail13
		tailModel[13] = new ModelRendererTurbo(this,  594,  256, textureX, textureY); // F15CoreTail14
		tailModel[14] = new ModelRendererTurbo(this,  594,  322, textureX, textureY); // F15CoreTail15
		tailModel[15] = new ModelRendererTurbo(this,  594,  344, textureX, textureY); // F15CoreTail16
		tailModel[16] = new ModelRendererTurbo(this,  587,  296, textureX, textureY); // F15CoreTail17
		tailModel[17] = new ModelRendererTurbo(this,  587,  296, textureX, textureY); // F15CoreTail18
		tailModel[18] = new ModelRendererTurbo(this,  587,  296, textureX, textureY); // F15CoreTail19
		tailModel[19] = new ModelRendererTurbo(this,  594,  256, textureX, textureY); // F15CoreTail20
		tailModel[20] = new ModelRendererTurbo(this,  594,  322, textureX, textureY); // F15CoreTail21
		tailModel[21] = new ModelRendererTurbo(this,  594,  344, textureX, textureY); // F15CoreTail22
		tailModel[22] = new ModelRendererTurbo(this,  436,  487, textureX, textureY); // F15CoreTail23
		tailModel[23] = new ModelRendererTurbo(this,  436,  487, textureX, textureY); // F15CoreTail24
		tailModel[24] = new ModelRendererTurbo(this,  663,  258, textureX, textureY); // F15CoreTail25
		tailModel[25] = new ModelRendererTurbo(this,  663,  260, textureX, textureY); // F15CoreTail26
		tailModel[26] = new ModelRendererTurbo(this,  663,  258, textureX, textureY); // F15CoreTail27
		tailModel[27] = new ModelRendererTurbo(this,  663,  258, textureX, textureY); // F15CoreTail28
		tailModel[28] = new ModelRendererTurbo(this,  663,  260, textureX, textureY); // F15CoreTail29
		tailModel[29] = new ModelRendererTurbo(this,  663,  258, textureX, textureY); // F15CoreTail30
		tailModel[30] = new ModelRendererTurbo(this,  663,  258, textureX, textureY); // F15CoreTail31
		tailModel[31] = new ModelRendererTurbo(this,  663,  258, textureX, textureY); // F15CoreTail32
		tailModel[32] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust1
		tailModel[33] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust2
		tailModel[34] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust3
		tailModel[35] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust4
		tailModel[36] = new ModelRendererTurbo(this,  662,  335, textureX, textureY); // F15Exhaust5
		tailModel[37] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust6
		tailModel[38] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust7
		tailModel[39] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust8
		tailModel[40] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust9
		tailModel[41] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust10
		tailModel[42] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust11
		tailModel[43] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust12
		tailModel[44] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust13
		tailModel[45] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust14
		tailModel[46] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust15
		tailModel[47] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust16
		tailModel[48] = new ModelRendererTurbo(this,  662,  299, textureX, textureY); // F15Exhaust17
		tailModel[49] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust18
		tailModel[50] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust19
		tailModel[51] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust20
		tailModel[52] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust21
		tailModel[53] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust22
		tailModel[54] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust23
		tailModel[55] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust24
		tailModel[56] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust25
		tailModel[57] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust26
		tailModel[58] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust27
		tailModel[59] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust28
		tailModel[60] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust29
		tailModel[61] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust30
		tailModel[62] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust31
		tailModel[63] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust32
		tailModel[64] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust33
		tailModel[65] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust34
		tailModel[66] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust35
		tailModel[67] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust36
		tailModel[68] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust37
		tailModel[69] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust38
		tailModel[70] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust39
		tailModel[71] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust40
		tailModel[72] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust41
		tailModel[73] = new ModelRendererTurbo(this,  662,  299, textureX, textureY); // F15Exhaust42
		tailModel[74] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust43
		tailModel[75] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust44
		tailModel[76] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust45
		tailModel[77] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust46
		tailModel[78] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust47
		tailModel[79] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust48
		tailModel[80] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust49
		tailModel[81] = new ModelRendererTurbo(this,  712,  281, textureX, textureY); // F15Exhaust50
		tailModel[82] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust51
		tailModel[83] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust52
		tailModel[84] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust53
		tailModel[85] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust54
		tailModel[86] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust55
		tailModel[87] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust56
		tailModel[88] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust57
		tailModel[89] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust58
		tailModel[90] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust59
		tailModel[91] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust60
		tailModel[92] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust61
		tailModel[93] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust62
		tailModel[94] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust63
		tailModel[95] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust64
		tailModel[96] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust65
		tailModel[97] = new ModelRendererTurbo(this,  725,  279, textureX, textureY); // F15Exhaust66
		tailModel[98] = new ModelRendererTurbo(this,  662,  279, textureX, textureY); // F15Exhaust67
		tailModel[99] = new ModelRendererTurbo(this,  662,  338, textureX, textureY); // F15Exhaust68
		tailModel[100] = new ModelRendererTurbo(this,  296,  808, textureX, textureY); // RBackWing1
		tailModel[101] = new ModelRendererTurbo(this,  294,  826, textureX, textureY); // RBackWing2
		tailModel[102] = new ModelRendererTurbo(this,  326,  826, textureX, textureY); // RBackWing3
		tailModel[103] = new ModelRendererTurbo(this,  296,  838, textureX, textureY); // RBackWing4
		tailModel[104] = new ModelRendererTurbo(this,  296,  920, textureX, textureY); // RBackWing5
		tailModel[105] = new ModelRendererTurbo(this,  296,  851, textureX, textureY); // RBackWing6
		tailModel[106] = new ModelRendererTurbo(this,  296,  909, textureX, textureY); // RBackWing7
		tailModel[107] = new ModelRendererTurbo(this,  296,  881, textureX, textureY); // RBackWing8
		tailModel[108] = new ModelRendererTurbo(this,  296,  808, textureX, textureY); // LBackWing1
		tailModel[109] = new ModelRendererTurbo(this,  294,  826, textureX, textureY); // LBackWing2
		tailModel[110] = new ModelRendererTurbo(this,  326,  826, textureX, textureY); // LBackWing3
		tailModel[111] = new ModelRendererTurbo(this,  296,  838, textureX, textureY); // LBackWing4
		tailModel[112] = new ModelRendererTurbo(this,  296,  851, textureX, textureY); // LBackWing5
		tailModel[113] = new ModelRendererTurbo(this,  296,  881, textureX, textureY); // LBackWing6
		tailModel[114] = new ModelRendererTurbo(this,  296,  920, textureX, textureY); // LBackWing7
		tailModel[115] = new ModelRendererTurbo(this,  296,  909, textureX, textureY); // LBackWing8
		tailModel[116] = new ModelRendererTurbo(this,  443,  862, textureX, textureY); // LTailWing1
		tailModel[117] = new ModelRendererTurbo(this,  443,  793, textureX, textureY); // LTailWing2
		tailModel[118] = new ModelRendererTurbo(this,  462,  796, textureX, textureY); // LTailWing3
		tailModel[119] = new ModelRendererTurbo(this,  443,  873, textureX, textureY); // LTailWing4
		tailModel[120] = new ModelRendererTurbo(this,  443,  888, textureX, textureY); // LTailWing5
		tailModel[121] = new ModelRendererTurbo(this,  488,  873, textureX, textureY); // LTailWing6
		tailModel[122] = new ModelRendererTurbo(this,  486,  796, textureX, textureY); // LTailWing7
		tailModel[123] = new ModelRendererTurbo(this,  527,  803, textureX, textureY); // LTailWing8
		tailModel[124] = new ModelRendererTurbo(this,  7,  125, textureX, textureY); // Galm2LTwingInsiginia1
		tailModel[125] = new ModelRendererTurbo(this,  7,  154, textureX, textureY); // Galm2LTwingNo1
		tailModel[126] = new ModelRendererTurbo(this,  486,  796, textureX, textureY); // RTailWing1
		tailModel[127] = new ModelRendererTurbo(this,  443,  873, textureX, textureY); // RTailWing2
		tailModel[128] = new ModelRendererTurbo(this,  443,  888, textureX, textureY); // RTailWing3
		tailModel[129] = new ModelRendererTurbo(this,  443,  793, textureX, textureY); // RTailWing4
		tailModel[130] = new ModelRendererTurbo(this,  527,  803, textureX, textureY); // RTailWing5
		tailModel[131] = new ModelRendererTurbo(this,  443,  862, textureX, textureY); // RTailWing6
		tailModel[132] = new ModelRendererTurbo(this,  462,  796, textureX, textureY); // RTailWing7
		tailModel[133] = new ModelRendererTurbo(this,  488,  873, textureX, textureY); // RTailWing8
		tailModel[134] = new ModelRendererTurbo(this,  7,  125, textureX, textureY); // Galm2RTwingInsiginia1
		tailModel[135] = new ModelRendererTurbo(this,  7,  154, textureX, textureY); // Galm2RTwingNo1

		tailModel[0].addBox(98F, -14F, -30F, 24, 24, 60, 0F); // F15CoreTail1
		tailModel[0].setRotationPoint(0F, 0F, 0F);

		tailModel[1].addBox(113F, -17F, 2F, 9, 25, 25, 0F); // F15CoreTail2
		tailModel[1].setRotationPoint(0F, 0F, 0F);

		tailModel[2].addBox(113F, -17F, -28F, 9, 25, 25, 0F); // F15CoreTail3
		tailModel[2].setRotationPoint(0F, 0F, 0F);

		tailModel[3].addBox(122F, -13F, -30F, 18, 17, 60, 0F); // F15CoreTail4
		tailModel[3].setRotationPoint(0F, 0F, 0F);

		tailModel[4].addBox(122F, -17F, -28F, 18, 25, 25, 0F); // F15CoreTail5
		tailModel[4].setRotationPoint(0F, 0F, 0F);

		tailModel[5].addBox(122F, -17F, 2F, 18, 25, 25, 0F); // F15CoreTail6
		tailModel[5].setRotationPoint(0F, 0F, 0F);

		tailModel[6].addBox(102F, -17F, 10F, 11, 3, 9, 0F); // F15CoreTail7
		tailModel[6].setRotationPoint(0F, 0F, 0F);

		tailModel[7].addBox(102F, -17F, -20F, 11, 3, 9, 0F); // F15CoreTail8
		tailModel[7].setRotationPoint(0F, 0F, 0F);

		tailModel[8].addBox(77.3F, -17F, 68.3F, 13, 3, 9, 0F); // F15CoreTail9
		tailModel[8].setRotationPoint(0F, 0F, 0F);
		tailModel[8].rotateAngleY = -0.6283185F;

		tailModel[9].addBox(95F, -17F, 44F, 13, 3, 9, 0F); // F15CoreTail10
		tailModel[9].setRotationPoint(0F, 0F, 0F);
		tailModel[9].rotateAngleY = -0.6283185F;

		tailModel[10].addBox(76.5F, -17F, -78F, 13, 3, 9, 0F); // F15CoreTail11
		tailModel[10].setRotationPoint(0F, 0F, 0F);
		tailModel[10].rotateAngleY = 0.6283185F;

		tailModel[11].addBox(94.5F, -17F, -53.7F, 13, 3, 9, 0F); // F15CoreTail12
		tailModel[11].setRotationPoint(0F, 0F, 0F);
		tailModel[11].rotateAngleY = 0.6283185F;

		tailModel[12].addBox(86.5F, 7.1F, 10F, 22, 6, 9, 0F); // F15CoreTail13
		tailModel[12].setRotationPoint(0F, 0F, 0F);
		tailModel[12].rotateAngleZ = 0.2443461F;

		tailModel[13].addBox(107F, -19.2F, 10F, 15, 3, 9, 0F); // F15CoreTail14
		tailModel[13].setRotationPoint(0F, 0F, 0F);

		tailModel[14].addBox(111F, -18.2F, 8F, 11, 2, 13, 0F); // F15CoreTail15
		tailModel[14].setRotationPoint(0F, 0F, 0F);

		tailModel[15].addBox(104.5F, 26.5F, 8F, 5, 2, 13, 0F); // F15CoreTail16
		tailModel[15].setRotationPoint(0F, 0F, 0F);
		tailModel[15].rotateAngleZ = 0.4014257F;

		tailModel[16].addBox(76.7F, -0.4F, 12F, 32, 3, 5, 0F); // F15CoreTail17
		tailModel[16].setRotationPoint(0F, 0F, 0F);
		tailModel[16].rotateAngleZ = 0.1745329F;

		tailModel[17].addBox(76.7F, -0.4F, -18F, 32, 3, 5, 0F); // F15CoreTail18
		tailModel[17].setRotationPoint(0F, 0F, 0F);
		tailModel[17].rotateAngleZ = 0.1745329F;

		tailModel[18].addBox(86.5F, 7.1F, -20F, 22, 6, 9, 0F); // F15CoreTail19
		tailModel[18].setRotationPoint(0F, 0F, 0F);
		tailModel[18].rotateAngleZ = 0.2443461F;

		tailModel[19].addBox(107F, -19.2F, -20F, 15, 3, 9, 0F); // F15CoreTail20
		tailModel[19].setRotationPoint(0F, 0F, 0F);

		tailModel[20].addBox(111F, -18.2F, -22F, 11, 2, 13, 0F); // F15CoreTail21
		tailModel[20].setRotationPoint(0F, 0F, 0F);

		tailModel[21].addBox(104.5F, 26.5F, -22F, 5, 2, 13, 0F); // F15CoreTail22
		tailModel[21].setRotationPoint(0F, 0F, 0F);
		tailModel[21].rotateAngleZ = 0.4014257F;

		tailModel[22].addBox(122F, -19F, 6F, 18, 29, 17, 0F); // F15CoreTail23
		tailModel[22].setRotationPoint(0F, 0F, 0F);

		tailModel[23].addBox(122F, -19F, -24F, 18, 29, 17, 0F); // F15CoreTail24
		tailModel[23].setRotationPoint(0F, 0F, 0F);

		tailModel[24].addBox(123F, 7F, 30F, 50, 3, 7, 0F); // F15CoreTail25
		tailModel[24].setRotationPoint(0F, 0F, 0F);
		tailModel[24].rotateAngleZ = 0.08726646F;

		tailModel[25].addBox(122F, -23F, 30F, 51, 3, 7, 0F); // F15CoreTail26
		tailModel[25].setRotationPoint(0F, 0F, 0F);
		tailModel[25].rotateAngleZ = -0.08726646F;

		tailModel[26].addBox(124F, -4F, 30F, 21, 5, 7, 0F); // F15CoreTail27
		tailModel[26].setRotationPoint(0F, 0F, 0F);
		tailModel[26].rotateAngleZ = 0.03490658F;

		tailModel[27].addBox(122F, -23F, 30F, 35, 5, 7, 0F); // F15CoreTail28
		tailModel[27].setRotationPoint(0F, 0F, 0F);
		tailModel[27].rotateAngleZ = -0.08726646F;

		tailModel[28].addBox(122F, -23F, -37F, 51, 3, 7, 0F); // F15CoreTail29
		tailModel[28].setRotationPoint(0F, 0F, 0F);
		tailModel[28].rotateAngleZ = -0.08726646F;

		tailModel[29].addBox(123F, 7F, -37F, 50, 3, 7, 0F); // F15CoreTail30
		tailModel[29].setRotationPoint(0F, 0F, 0F);
		tailModel[29].rotateAngleZ = 0.08726646F;

		tailModel[30].addBox(124F, -4F, -37F, 21, 5, 7, 0F); // F15CoreTail31
		tailModel[30].setRotationPoint(0F, 0F, 0F);
		tailModel[30].rotateAngleZ = 0.03490658F;

		tailModel[31].addBox(122F, -23F, -37F, 35, 5, 7, 0F); // F15CoreTail32
		tailModel[31].setRotationPoint(0F, 0F, 0F);
		tailModel[31].rotateAngleZ = -0.08726646F;

		tailModel[32].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust1
		tailModel[32].setRotationPoint(140F, -4F, 14.5F);
		tailModel[32].rotateAngleX = -1.58825F;

		tailModel[33].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust2
		tailModel[33].setRotationPoint(140F, -4F, 14.5F);
		tailModel[33].rotateAngleX = 0.7853982F;

		tailModel[34].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust3
		tailModel[34].setRotationPoint(140F, -4F, 14.5F);
		tailModel[34].rotateAngleX = -0.7853982F;
		tailModel[34].rotateAngleY = 0.06981317F;
		tailModel[34].rotateAngleZ = 0.06981317F;

		tailModel[35].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust4
		tailModel[35].setRotationPoint(140F, -4F, 14.5F);
		tailModel[35].rotateAngleX = 0.7853982F;

		tailModel[36].addBox(-5F, -15F, -4F, 31, 6, 3, 0F); // F15Exhaust5
		tailModel[36].setRotationPoint(140F, -4F, 14.5F);
		tailModel[36].rotateAngleX = -1.570796F;
		tailModel[36].rotateAngleY = 0.2792527F;

		tailModel[37].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust6
		tailModel[37].setRotationPoint(140F, -4F, 14.5F);

		tailModel[38].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust7
		tailModel[38].setRotationPoint(140F, -4F, 14.5F);

		tailModel[39].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust8
		tailModel[39].setRotationPoint(140F, -4F, 14.5F);
		tailModel[39].rotateAngleX = -0.7853982F;

		tailModel[40].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust9
		tailModel[40].setRotationPoint(140F, -4F, 14.5F);
		tailModel[40].rotateAngleX = -1.570796F;

		tailModel[41].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust10
		tailModel[41].setRotationPoint(140F, -4F, 14.5F);
		tailModel[41].rotateAngleX = 0.7853982F;

		tailModel[42].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust11
		tailModel[42].setRotationPoint(140F, -4F, 14.5F);
		tailModel[42].rotateAngleX = -0.7853982F;

		tailModel[43].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust12
		tailModel[43].setRotationPoint(140F, -4F, 14.5F);
		tailModel[43].rotateAngleX = -1.570796F;

		tailModel[44].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust13
		tailModel[44].setRotationPoint(140F, -4F, 14.5F);

		tailModel[45].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust14
		tailModel[45].setRotationPoint(140F, -4F, 14.5F);

		tailModel[46].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust15
		tailModel[46].setRotationPoint(140F, -4F, 14.5F);
		tailModel[46].rotateAngleX = 0.7853982F;

		tailModel[47].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust16
		tailModel[47].setRotationPoint(140F, -4F, 14.5F);
		tailModel[47].rotateAngleX = -0.7853982F;

		tailModel[48].addBox(-1F, -8F, -8F, 2, 16, 16, 0F); // F15Exhaust17
		tailModel[48].setRotationPoint(139.5F, -4F, 14.5F);

		tailModel[49].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust18
		tailModel[49].setRotationPoint(140F, -4F, 14.5F);
		tailModel[49].rotateAngleX = -3.577925F;

		tailModel[50].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust19
		tailModel[50].setRotationPoint(140F, -4F, 14.5F);
		tailModel[50].rotateAngleX = -2.70526F;

		tailModel[51].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust20
		tailModel[51].setRotationPoint(140F, -4F, 14.5F);
		tailModel[51].rotateAngleX = 1.134464F;

		tailModel[52].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust21
		tailModel[52].setRotationPoint(140F, -4F, 14.5F);
		tailModel[52].rotateAngleX = 2.007129F;

		tailModel[53].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust22
		tailModel[53].setRotationPoint(140F, -4F, 14.5F);
		tailModel[53].rotateAngleX = -1.972222F;

		tailModel[54].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust23
		tailModel[54].setRotationPoint(140F, -4F, 14.5F);
		tailModel[54].rotateAngleX = -1.099557F;

		tailModel[55].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust24
		tailModel[55].setRotationPoint(140F, -4F, 14.5F);
		tailModel[55].rotateAngleX = -0.4363323F;

		tailModel[56].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust25
		tailModel[56].setRotationPoint(140F, -4F, 14.5F);
		tailModel[56].rotateAngleX = 0.4363323F;

		tailModel[57].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust26
		tailModel[57].setRotationPoint(140F, -4F, 14.5F);
		tailModel[57].rotateAngleZ = -0.1047198F;

		tailModel[58].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust27
		tailModel[58].setRotationPoint(140F, -4F, 14.5F);
		tailModel[58].rotateAngleX = 0.7853982F;
		tailModel[58].rotateAngleY = 0.06981317F;
		tailModel[58].rotateAngleZ = -0.06981317F;

		tailModel[59].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust28
		tailModel[59].setRotationPoint(140F, -4F, 14.5F);
		tailModel[59].rotateAngleX = -1.58825F;
		tailModel[59].rotateAngleY = 0.1047198F;

		tailModel[60].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust29
		tailModel[60].setRotationPoint(140F, -4F, 14.5F);
		tailModel[60].rotateAngleX = -0.7853982F;

		tailModel[61].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust30
		tailModel[61].setRotationPoint(140F, -4F, 14.5F);
		tailModel[61].rotateAngleZ = 0.1047198F;

		tailModel[62].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust31
		tailModel[62].setRotationPoint(140F, -4F, 14.5F);
		tailModel[62].rotateAngleX = 0.7853982F;
		tailModel[62].rotateAngleY = -0.06981317F;
		tailModel[62].rotateAngleZ = 0.06981317F;

		tailModel[63].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust32
		tailModel[63].setRotationPoint(140F, -4F, 14.5F);
		tailModel[63].rotateAngleX = -1.570796F;
		tailModel[63].rotateAngleY = -0.1047198F;

		tailModel[64].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust33
		tailModel[64].setRotationPoint(140F, -4F, 14.5F);
		tailModel[64].rotateAngleX = -0.7853982F;
		tailModel[64].rotateAngleY = -0.06981317F;
		tailModel[64].rotateAngleZ = -0.06981317F;

		tailModel[65].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust34
		tailModel[65].setRotationPoint(140F, -4F, -15.5F);

		tailModel[66].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust35
		tailModel[66].setRotationPoint(140F, -4F, -15.5F);
		tailModel[66].rotateAngleX = 0.7853982F;

		tailModel[67].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust36
		tailModel[67].setRotationPoint(140F, -4F, -15.5F);
		tailModel[67].rotateAngleX = -1.58825F;

		tailModel[68].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust37
		tailModel[68].setRotationPoint(140F, -4F, -15.5F);
		tailModel[68].rotateAngleX = -0.7853982F;

		tailModel[69].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust38
		tailModel[69].setRotationPoint(140F, -4F, -15.5F);

		tailModel[70].addBox(-3F, 8F, -5F, 9, 4, 10, 0F); // F15Exhaust39
		tailModel[70].setRotationPoint(140F, -4F, -15.5F);
		tailModel[70].rotateAngleX = 0.7853982F;

		tailModel[71].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust40
		tailModel[71].setRotationPoint(140F, -4F, -15.5F);
		tailModel[71].rotateAngleX = -1.570796F;

		tailModel[72].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust41
		tailModel[72].setRotationPoint(140F, -4F, -15.5F);
		tailModel[72].rotateAngleX = -0.7853982F;

		tailModel[73].addBox(-1F, -8F, -8F, 2, 16, 16, 0F); // F15Exhaust42
		tailModel[73].setRotationPoint(139.5F, -4F, -15.5F);

		tailModel[74].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust43
		tailModel[74].setRotationPoint(140F, -4F, -15.5F);
		tailModel[74].rotateAngleX = 0.4363323F;

		tailModel[75].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust44
		tailModel[75].setRotationPoint(140F, -4F, -15.5F);
		tailModel[75].rotateAngleX = 1.134464F;

		tailModel[76].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust45
		tailModel[76].setRotationPoint(140F, -4F, -15.5F);
		tailModel[76].rotateAngleX = 2.007129F;

		tailModel[77].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust46
		tailModel[77].setRotationPoint(140F, -4F, -15.5F);
		tailModel[77].rotateAngleX = -3.577925F;

		tailModel[78].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust47
		tailModel[78].setRotationPoint(140F, -4F, -15.5F);
		tailModel[78].rotateAngleX = -2.70526F;

		tailModel[79].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust48
		tailModel[79].setRotationPoint(140F, -4F, -15.5F);
		tailModel[79].rotateAngleX = -1.972222F;

		tailModel[80].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust49
		tailModel[80].setRotationPoint(140F, -4F, -15.5F);
		tailModel[80].rotateAngleX = -1.099557F;

		tailModel[81].addBox(-1F, -9F, -0.5F, 3, 6, 1, 0F); // F15Exhaust50
		tailModel[81].setRotationPoint(140F, -4F, -15.5F);
		tailModel[81].rotateAngleX = -0.4363323F;

		tailModel[82].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust51
		tailModel[82].setRotationPoint(140F, -4F, -15.5F);

		tailModel[83].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust52
		tailModel[83].setRotationPoint(140F, -4F, -15.5F);
		tailModel[83].rotateAngleX = 0.7853982F;

		tailModel[84].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust53
		tailModel[84].setRotationPoint(140F, -4F, -15.5F);
		tailModel[84].rotateAngleX = -1.570796F;

		tailModel[85].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust54
		tailModel[85].setRotationPoint(140F, -4F, -15.5F);
		tailModel[85].rotateAngleX = -0.7853982F;

		tailModel[86].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust55
		tailModel[86].setRotationPoint(140F, -4F, -15.5F);
		tailModel[86].rotateAngleX = 0.7853982F;

		tailModel[87].addBox(-1F, -4F, -2F, 3, 2, 4, 0F); // F15Exhaust56
		tailModel[87].setRotationPoint(140F, -4F, -15.5F);
		tailModel[87].rotateAngleX = -1.570796F;

		tailModel[88].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust57
		tailModel[88].setRotationPoint(140F, -4F, -15.5F);

		tailModel[89].addBox(-1F, 2F, -2F, 3, 2, 4, 0F); // F15Exhaust58
		tailModel[89].setRotationPoint(140F, -4F, -15.5F);
		tailModel[89].rotateAngleX = -0.7853982F;

		tailModel[90].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust59
		tailModel[90].setRotationPoint(140F, -4F, -15.5F);
		tailModel[90].rotateAngleZ = -0.1047198F;

		tailModel[91].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust60
		tailModel[91].setRotationPoint(140F, -4F, -15.5F);
		tailModel[91].rotateAngleX = -0.7853982F;
		tailModel[91].rotateAngleY = -0.06981317F;
		tailModel[91].rotateAngleZ = -0.06981317F;

		tailModel[92].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust61
		tailModel[92].setRotationPoint(140F, -4F, -15.5F);
		tailModel[92].rotateAngleX = 0.7853982F;
		tailModel[92].rotateAngleY = 0.06981317F;
		tailModel[92].rotateAngleZ = -0.06981317F;

		tailModel[93].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust62
		tailModel[93].setRotationPoint(140F, -4F, -15.5F);
		tailModel[93].rotateAngleX = -1.58825F;
		tailModel[93].rotateAngleY = 0.1047198F;

		tailModel[94].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust63
		tailModel[94].setRotationPoint(140F, -4F, -15.5F);
		tailModel[94].rotateAngleX = -0.7853982F;
		tailModel[94].rotateAngleY = 0.06981317F;
		tailModel[94].rotateAngleZ = 0.06981317F;

		tailModel[95].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust64
		tailModel[95].setRotationPoint(140F, -4F, -15.5F);
		tailModel[95].rotateAngleZ = 0.1047198F;

		tailModel[96].addBox(5F, 9F, -4F, 14, 2, 8, 0F); // F15Exhaust65
		tailModel[96].setRotationPoint(140F, -4F, -15.5F);
		tailModel[96].rotateAngleX = 0.7853982F;
		tailModel[96].rotateAngleY = -0.06981317F;
		tailModel[96].rotateAngleZ = 0.06981317F;

		tailModel[97].addBox(5F, -11F, -4F, 14, 2, 8, 0F); // F15Exhaust66
		tailModel[97].setRotationPoint(140F, -4F, -15.5F);
		tailModel[97].rotateAngleX = -1.570796F;
		tailModel[97].rotateAngleY = -0.1047198F;

		tailModel[98].addBox(-3F, -12F, -5F, 9, 4, 10, 0F); // F15Exhaust67
		tailModel[98].setRotationPoint(140F, -4F, 14.5F);
		tailModel[98].rotateAngleX = -1.570796F;

		tailModel[99].addBox(-3F, 9F, -4F, 36, 6, 3, 0F); // F15Exhaust68
		tailModel[99].setRotationPoint(140F, -4F, -15.5F);
		tailModel[99].rotateAngleX = -1.58825F;
		tailModel[99].rotateAngleY = -0.2094395F;

		tailModel[100].addBox(-142.5F, -8F, -109.4F, 30, 3, 13, 0F); // RBackWing1
		tailModel[100].setRotationPoint(0F, 0F, 0F);
		tailModel[100].rotateAngleY = 2.094395F;

		tailModel[101].addBox(153.8F, -8F, -77F, 12, 3, 5, 0F); // RBackWing2
		tailModel[101].setRotationPoint(0F, 0F, 0F);

		tailModel[102].addBox(118F, -8F, -139.4F, 13, 3, 4, 0F); // RBackWing3
		tailModel[102].setRotationPoint(0F, 0F, 0F);
		tailModel[102].rotateAngleY = 0.4363323F;

		tailModel[103].addBox(-90F, -8F, -168F, 40, 3, 8, 0F); // RBackWing4
		tailModel[103].setRotationPoint(0F, 0F, 0F);
		tailModel[103].rotateAngleY = 1.692969F;

		tailModel[104].addBox(139F, -8F, -50.4F, 8, 3, 4, 0F); // RBackWing5
		tailModel[104].setRotationPoint(0F, 0F, 0F);

		tailModel[105].addBox(-119.5F, -8F, -147F, 40, 3, 22, 0F); // RBackWing6
		tailModel[105].setRotationPoint(0F, 0F, 0F);
		tailModel[105].rotateAngleY = 1.884956F;

		tailModel[106].addBox(-112.5F, -8F, -98.4F, 4, 3, 2, 0F); // RBackWing7
		tailModel[106].setRotationPoint(0F, 0F, 0F);
		tailModel[106].rotateAngleY = 2.094395F;

		tailModel[107].addBox(-91.5F, -8F, -130F, 17, 3, 8, 0F); // RBackWing8
		tailModel[107].setRotationPoint(0F, 0F, 0F);
		tailModel[107].rotateAngleY = 1.884956F;

		tailModel[108].addBox(-141.6F, -8F, 96.8F, 30, 3, 13, 0F); // LBackWing1
		tailModel[108].setRotationPoint(0F, 0F, 0F);
		tailModel[108].rotateAngleY = -2.094395F;

		tailModel[109].addBox(153.8F, -8F, 71F, 12, 3, 5, 0F); // LBackWing2
		tailModel[109].setRotationPoint(0F, 0F, 0F);

		tailModel[110].addBox(118F, -8F, 134.4F, 13, 3, 4, 0F); // LBackWing3
		tailModel[110].setRotationPoint(0F, 0F, 0F);
		tailModel[110].rotateAngleY = -0.4363323F;

		tailModel[111].addBox(-89.5F, -8F, 159.7F, 40, 3, 8, 0F); // LBackWing4
		tailModel[111].setRotationPoint(0F, 0F, 0F);
		tailModel[111].rotateAngleY = -1.692969F;

		tailModel[112].addBox(-118F, -8F, 125F, 40, 3, 22, 0F); // LBackWing5
		tailModel[112].setRotationPoint(0F, 0F, 0F);
		tailModel[112].rotateAngleY = -1.884956F;

		tailModel[113].addBox(-91.5F, -8F, 122F, 17, 3, 8, 0F); // LBackWing6
		tailModel[113].setRotationPoint(0F, 0F, 0F);
		tailModel[113].rotateAngleY = -1.884956F;

		tailModel[114].addBox(139.1F, -8F, 45.9F, 8, 3, 4, 0F); // LBackWing7
		tailModel[114].setRotationPoint(0F, 0F, 0F);

		tailModel[115].addBox(-112.2F, -8F, 96.8F, 4, 3, 2, 0F); // LBackWing8
		tailModel[115].setRotationPoint(0F, 0F, 0F);
		tailModel[115].rotateAngleY = -2.094395F;

		tailModel[116].addBox(-17F, -3F, -1.5F, 34, 4, 3, 0F); // LTailWing1
		tailModel[116].setRotationPoint(137F, -11F, 33.5F);
		tailModel[116].rotateAngleZ = -0.08726646F;

		tailModel[117].addBox(-19F, -49F, -1.5F, 5, 60, 3, 0F); // LTailWing2
		tailModel[117].setRotationPoint(137F, -11F, 33.5F);
		tailModel[117].rotateAngleZ = -0.5235988F;

		tailModel[118].addBox(17F, -53F, -1.5F, 5, 54, 3, 0F); // LTailWing3
		tailModel[118].setRotationPoint(137F, -11F, 33.5F);
		tailModel[118].rotateAngleZ = -0.08726646F;

		tailModel[119].addBox(8F, -52F, -1.5F, 18, 5, 3, 0F); // LTailWing4
		tailModel[119].setRotationPoint(137F, -11F, 33.5F);

		tailModel[120].addBox(-0.4F, -52F, -1F, 9, 2, 2, 0F); // LTailWing5
		tailModel[120].setRotationPoint(137F, -11F, 33.5F);

		tailModel[121].addBox(21F, -54F, -1.5F, 1, 1, 3, 0F); // LTailWing6
		tailModel[121].setRotationPoint(137F, -11F, 33.5F);
		tailModel[121].rotateAngleZ = -0.08726646F;

		tailModel[122].addBox(2F, -49F, -1.5F, 15, 46, 3, 0F); // LTailWing7
		tailModel[122].setRotationPoint(137F, -11F, 33.5F);
		tailModel[122].rotateAngleZ = -0.08726646F;

		tailModel[123].addBox(-14F, -36F, -1.5F, 16, 39, 3, 0F); // LTailWing8
		tailModel[123].setRotationPoint(137F, -11F, 33.5F);
		tailModel[123].rotateAngleZ = -0.5235988F;

		tailModel[124].addBox(-4.8F, -37.1F, 0.7F, 18, 18, 1, 0F); // Galm2LTwingInsiginia1
		tailModel[124].setRotationPoint(137F, -11F, 33.5F);

		tailModel[125].addBox(-5.8F, -13.1F, 0.7F, 18, 9, 1, 0F); // Galm2LTwingNo1
		tailModel[125].setRotationPoint(137F, -11F, 33.5F);

		tailModel[126].addBox(2F, -49F, -1.5F, 15, 46, 3, 0F); // RTailWing1
		tailModel[126].setRotationPoint(137F, -11F, -33.5F);
		tailModel[126].rotateAngleZ = -0.08726646F;

		tailModel[127].addBox(8F, -52F, -1.5F, 18, 5, 3, 0F); // RTailWing2
		tailModel[127].setRotationPoint(137F, -11F, -33.5F);

		tailModel[128].addBox(-0.4F, -52F, -1F, 9, 2, 2, 0F); // RTailWing3
		tailModel[128].setRotationPoint(137F, -11F, -33.5F);

		tailModel[129].addBox(-19F, -49F, -1.5F, 5, 60, 3, 0F); // RTailWing4
		tailModel[129].setRotationPoint(137F, -11F, -33.5F);
		tailModel[129].rotateAngleZ = -0.5235988F;

		tailModel[130].addBox(-14F, -36F, -1.5F, 16, 39, 3, 0F); // RTailWing5
		tailModel[130].setRotationPoint(137F, -11F, -33.5F);
		tailModel[130].rotateAngleZ = -0.5235988F;

		tailModel[131].addBox(-17F, -3F, -1.5F, 34, 4, 3, 0F); // RTailWing6
		tailModel[131].setRotationPoint(137F, -11F, -33.5F);
		tailModel[131].rotateAngleZ = -0.08726646F;

		tailModel[132].addBox(17F, -53F, -1.5F, 5, 54, 3, 0F); // RTailWing7
		tailModel[132].setRotationPoint(137F, -11F, -33.5F);
		tailModel[132].rotateAngleZ = -0.08726646F;

		tailModel[133].addBox(21F, -54F, -1.5F, 1, 1, 3, 0F); // RTailWing8
		tailModel[133].setRotationPoint(137F, -11F, -33.5F);
		tailModel[133].rotateAngleZ = -0.08726646F;

		tailModel[134].addBox(-4.8F, -37.1F, -1.7F, 18, 18, 1, 0F); // Galm2RTwingInsiginia1
		tailModel[134].setRotationPoint(137F, -11F, -33.5F);

		tailModel[135].addBox(-5.8F, -13.1F, -1.7F, 18, 9, 1, 0F); // Galm2RTwingNo1
		tailModel[135].setRotationPoint(137F, -11F, -33.5F);



// Left Wing
		leftWingModel = new ModelRendererTurbo[54];
		leftWingModel[0] = new ModelRendererTurbo(this,  431,  552, textureX, textureY); // LFrontWing1
		leftWingModel[1] = new ModelRendererTurbo(this,  431,  664, textureX, textureY); // LFrontWing2
		leftWingModel[2] = new ModelRendererTurbo(this,  416,  675, textureX, textureY); // LFrontWing3
		leftWingModel[3] = new ModelRendererTurbo(this,  481,  664, textureX, textureY); // LFrontWing4
		leftWingModel[4] = new ModelRendererTurbo(this,  199,  676, textureX, textureY); // LFrontWing5
		leftWingModel[5] = new ModelRendererTurbo(this,  296,  725, textureX, textureY); // LFrontWing6
		leftWingModel[6] = new ModelRendererTurbo(this,  358,  724, textureX, textureY); // LFrontWing7
		leftWingModel[7] = new ModelRendererTurbo(this,  416,  721, textureX, textureY); // LFrontWing8
		leftWingModel[8] = new ModelRendererTurbo(this,  260,  740, textureX, textureY); // LFlapFrontWing1
		leftWingModel[9] = new ModelRendererTurbo(this,  296,  792, textureX, textureY); // LFlapFrontWing2
		leftWingModel[10] = new ModelRendererTurbo(this,  556,  655, textureX, textureY); // LWingLight1
		leftWingModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL2
		leftWingModel[12] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL4
		leftWingModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL6
		leftWingModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL7
		leftWingModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL8
		leftWingModel[16] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL9
		leftWingModel[17] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL10
		leftWingModel[18] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL11
		leftWingModel[19] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL12
		leftWingModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL13
		leftWingModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL14
		leftWingModel[22] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL15
		leftWingModel[23] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL16
		leftWingModel[24] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL17
		leftWingModel[25] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL18
		leftWingModel[26] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL20
		leftWingModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL21
		leftWingModel[28] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL22
		leftWingModel[29] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL23
		leftWingModel[30] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL24
		leftWingModel[31] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL25
		leftWingModel[32] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL26
		leftWingModel[33] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL27
		leftWingModel[34] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL28
		leftWingModel[35] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL29
		leftWingModel[36] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL30
		leftWingModel[37] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL31
		leftWingModel[38] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL32
		leftWingModel[39] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL33
		leftWingModel[40] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL34
		leftWingModel[41] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL35
		leftWingModel[42] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL36
		leftWingModel[43] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL37
		leftWingModel[44] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL38
		leftWingModel[45] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL39
		leftWingModel[46] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL40
		leftWingModel[47] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL41
		leftWingModel[48] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL42
		leftWingModel[49] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL43
		leftWingModel[50] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL44
		leftWingModel[51] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL45
		leftWingModel[52] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Galm2wingL46
		leftWingModel[53] = new ModelRendererTurbo(this,  1,  176, textureX, textureY); // Galm2Llogo1

		leftWingModel[0].addBox(6F, -8F, 45F, 5, 3, 105, 0F); // LFrontWing1
		leftWingModel[0].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[0].rotateAngleY = -0.6632251F;

		leftWingModel[1].addBox(78F, -8F, 123.5F, 13, 3, 5, 0F); // LFrontWing2
		leftWingModel[1].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[1].rotateAngleY = -0.1570796F;

		leftWingModel[2].addBox(11F, -8F, 44.5F, 26, 3, 108, 0F); // LFrontWing3
		leftWingModel[2].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[2].rotateAngleY = -0.6632251F;

		leftWingModel[3].addBox(1.5F, -8F, 152F, 30, 3, 5, 0F); // LFrontWing4
		leftWingModel[3].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[3].rotateAngleY = -0.7679449F;

		leftWingModel[4].addBox(-81F, -8F, 72F, 58, 3, 41, 0F); // LFrontWing5
		leftWingModel[4].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[4].rotateAngleY = -1.570796F;

		leftWingModel[5].addBox(-41F, -8F, 59F, 12, 3, 6, 0F); // LFrontWing6
		leftWingModel[5].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[5].rotateAngleY = -1.727876F;

		leftWingModel[6].addBox(100F, -8F, 107.5F, 13, 3, 5, 0F); // LFrontWing7
		leftWingModel[6].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[6].rotateAngleY = -0.1570796F;

		leftWingModel[7].addBox(60F, -8F, 107.5F, 5, 3, 28, 0F); // LFrontWing8
		leftWingModel[7].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[7].rotateAngleY = -0.4712389F;

		leftWingModel[8].addBox(65F, -7.5F, 102.5F, 9, 2, 35, 0F); // LFlapFrontWing1
		leftWingModel[8].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[8].rotateAngleY = -0.4712389F;

		leftWingModel[9].addBox(-75.5F, -7.5F, 112F, 37, 2, 9, 0F); // LFlapFrontWing2
		leftWingModel[9].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[9].rotateAngleY = -1.570796F;

		leftWingModel[10].addBox(34F, -7F, 41.5F, 1, 1, 1, 0F); // LWingLight1
		leftWingModel[10].setRotationPoint(0F, 0F, 0F);

		leftWingModel[11].addBox(90.1F, -8.1F, 123.6F, 1, 3, 5, 0F); // Galm2wingL2
		leftWingModel[11].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[11].rotateAngleY = -0.1570796F;

		leftWingModel[12].addBox(5.9F, -8.1F, 91F, 14, 3, 59, 0F); // Galm2wingL4
		leftWingModel[12].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[12].rotateAngleY = -0.6632251F;

		leftWingModel[13].addBox(5.9F, -7.9F, 91F, 14, 3, 59, 0F); // Galm2wingL6
		leftWingModel[13].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[13].rotateAngleY = -0.6632251F;

		leftWingModel[14].addBox(77.6F, -8.1F, 123.6F, 13, 3, 5, 0F); // Galm2wingL7
		leftWingModel[14].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[14].rotateAngleY = -0.1570796F;

		leftWingModel[15].addBox(77.6F, -7.9F, 123.6F, 13, 3, 5, 0F); // Galm2wingL8
		leftWingModel[15].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[15].rotateAngleY = -0.1570796F;

		leftWingModel[16].addBox(-81F, -7.9F, 72.1F, 11, 3, 41, 0F); // Galm2wingL9
		leftWingModel[16].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[16].rotateAngleY = -1.570796F;

		leftWingModel[17].addBox(90.1F, -7.9F, 123.6F, 1, 3, 5, 0F); // Galm2wingL10
		leftWingModel[17].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[17].rotateAngleY = -0.1570796F;

		leftWingModel[18].addBox(-75.7F, -7.4F, 112.1F, 19, 2, 9, 0F); // Galm2wingL11
		leftWingModel[18].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[18].rotateAngleY = -1.570796F;

		leftWingModel[19].addBox(1.6F, -8.1F, 152.1F, 30, 3, 5, 0F); // Galm2wingL12
		leftWingModel[19].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[19].rotateAngleY = -0.7679449F;

		leftWingModel[20].addBox(-81F, -8.1F, 72.1F, 11, 3, 41, 0F); // Galm2wingL13
		leftWingModel[20].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[20].rotateAngleY = -1.570796F;

		leftWingModel[21].addBox(1.6F, -7.9F, 152.1F, 30, 3, 5, 0F); // Galm2wingL14
		leftWingModel[21].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[21].rotateAngleY = -0.7679449F;

		leftWingModel[22].addBox(60.1F, -7.9F, 118.5F, 5, 3, 22, 0F); // Galm2wingL15
		leftWingModel[22].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[22].rotateAngleY = -0.4712389F;

		leftWingModel[23].addBox(11F, -8.1F, 102.5F, 26, 3, 49, 0F); // Galm2wingL16
		leftWingModel[23].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[23].rotateAngleY = -0.6632251F;

		leftWingModel[24].addBox(11F, -7.9F, 102.5F, 26, 3, 49, 0F); // Galm2wingL17
		leftWingModel[24].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[24].rotateAngleY = -0.6632251F;

		leftWingModel[25].addBox(64.1F, -7.6F, 117.5F, 10, 2, 23, 0F); // Galm2wingL18
		leftWingModel[25].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[25].rotateAngleY = -0.4712389F;

		leftWingModel[26].addBox(60.1F, -8.1F, 118.5F, 5, 3, 22, 0F); // Galm2wingL20
		leftWingModel[26].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[26].rotateAngleY = -0.4712389F;

		leftWingModel[27].addBox(64.1F, -7.4F, 117.5F, 10, 2, 23, 0F); // Galm2wingL21
		leftWingModel[27].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[27].rotateAngleY = -0.4712389F;

		leftWingModel[28].addBox(-75.7F, -7.6F, 112.1F, 19, 2, 9, 0F); // Galm2wingL22
		leftWingModel[28].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[28].rotateAngleY = -1.570796F;

		leftWingModel[29].addBox(99.8F, -7.9F, 107.4F, 13, 3, 5, 0F); // Galm2wingL23
		leftWingModel[29].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[29].rotateAngleY = -0.1570796F;

		leftWingModel[30].addBox(99.8F, -8.1F, 107.4F, 13, 3, 5, 0F); // Galm2wingL24
		leftWingModel[30].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[30].rotateAngleY = -0.1570796F;

		leftWingModel[31].addBox(-67.7F, -8.1F, 61.1F, 10, 3, 3, 0F); // Galm2wingL25
		leftWingModel[31].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[31].rotateAngleY = -1.570796F;

		leftWingModel[32].addBox(-64.4F, -8.1F, 58.1F, 7, 2, 1, 0F); // Galm2wingL26
		leftWingModel[32].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[32].rotateAngleY = -1.570796F;

		leftWingModel[33].addBox(-64.4F, -7.9F, 58.1F, 7, 3, 1, 0F); // Galm2wingL27
		leftWingModel[33].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[33].rotateAngleY = -1.570796F;

		leftWingModel[34].addBox(-65.7F, -7.9F, 59.1F, 8, 3, 1, 0F); // Galm2wingL28
		leftWingModel[34].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[34].rotateAngleY = -1.570796F;

		leftWingModel[35].addBox(-70.7F, -7.9F, 64.1F, 13, 3, 49, 0F); // Galm2wingL29
		leftWingModel[35].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[35].rotateAngleY = -1.570796F;

		leftWingModel[36].addBox(-63.2F, -7.9F, 57.1F, 6, 3, 1, 0F); // Galm2wingL30
		leftWingModel[36].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[36].rotateAngleY = -1.570796F;

		leftWingModel[37].addBox(5.9F, -7.9F, 77.8F, 1, 3, 14, 0F); // Galm2wingL31
		leftWingModel[37].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[37].rotateAngleY = -0.6632251F;

		leftWingModel[38].addBox(-66.7F, -7.9F, 60.1F, 9, 3, 1, 0F); // Galm2wingL32
		leftWingModel[38].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[38].rotateAngleY = -1.570796F;

		leftWingModel[39].addBox(-67.7F, -7.9F, 61.1F, 10, 3, 3, 0F); // Galm2wingL33
		leftWingModel[39].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[39].rotateAngleY = -1.570796F;

		leftWingModel[40].addBox(-61.8F, -7.9F, 56.1F, 4, 3, 1, 0F); // Galm2wingL34
		leftWingModel[40].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[40].rotateAngleY = -1.570796F;

		leftWingModel[41].addBox(-65.7F, -8.1F, 59.1F, 8, 2, 1, 0F); // Galm2wingL35
		leftWingModel[41].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[41].rotateAngleY = -1.570796F;

		leftWingModel[42].addBox(-57.7F, -8.1F, 53.1F, 1, 3, 60, 0F); // Galm2wingL36
		leftWingModel[42].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[42].rotateAngleY = -1.570796F;

		leftWingModel[43].addBox(-60.4F, -7.9F, 55.1F, 3, 3, 1, 0F); // Galm2wingL37
		leftWingModel[43].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[43].rotateAngleY = -1.570796F;

		leftWingModel[44].addBox(-70.7F, -8.1F, 64.1F, 13, 3, 49, 0F); // Galm2wingL38
		leftWingModel[44].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[44].rotateAngleY = -1.570796F;

		leftWingModel[45].addBox(5.9F, -8.1F, 77.8F, 1, 3, 14, 0F); // Galm2wingL39
		leftWingModel[45].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[45].rotateAngleY = -0.6632251F;

		leftWingModel[46].addBox(-59.3F, -8.1F, 54.1F, 2, 2, 1, 0F); // Galm2wingL40
		leftWingModel[46].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[46].rotateAngleY = -1.570796F;

		leftWingModel[47].addBox(-60.4F, -8.1F, 55.1F, 3, 2, 1, 0F); // Galm2wingL41
		leftWingModel[47].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[47].rotateAngleY = -1.570796F;

		leftWingModel[48].addBox(-61.8F, -8.1F, 56.1F, 4, 2, 1, 0F); // Galm2wingL42
		leftWingModel[48].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[48].rotateAngleY = -1.570796F;

		leftWingModel[49].addBox(-63.2F, -8.1F, 57.1F, 6, 2, 1, 0F); // Galm2wingL43
		leftWingModel[49].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[49].rotateAngleY = -1.570796F;

		leftWingModel[50].addBox(-66.7F, -8.1F, 60.1F, 9, 2, 1, 0F); // Galm2wingL44
		leftWingModel[50].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[50].rotateAngleY = -1.570796F;

		leftWingModel[51].addBox(-59.3F, -7.9F, 54.1F, 2, 3, 1, 0F); // Galm2wingL45
		leftWingModel[51].setRotationPoint(-9F, 0F, -4.5F);
		leftWingModel[51].rotateAngleY = -1.570796F;

		leftWingModel[52].addBox(-57.7F, -7.9F, 53.1F, 1, 3, 60, 0F); // Galm2wingL46
		leftWingModel[52].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[52].rotateAngleY = -1.570796F;

		leftWingModel[53].addBox(-101.9F, -8.2F, 98.1F, 24, 2, 12, 0F); // Galm2Llogo1
		leftWingModel[53].setRotationPoint(-9F, 0F, -4F);
		leftWingModel[53].rotateAngleY = -1.570796F;



// Right Wing
		rightWingModel = new ModelRendererTurbo[12];
		rightWingModel[0] = new ModelRendererTurbo(this,  431,  552, textureX, textureY); // RWingLight1.rotateAngleY
		rightWingModel[1] = new ModelRendererTurbo(this,  431,  664, textureX, textureY); // RFrontWing2
		rightWingModel[2] = new ModelRendererTurbo(this,  416,  675, textureX, textureY); // RFrontWing3
		rightWingModel[3] = new ModelRendererTurbo(this,  481,  664, textureX, textureY); // RFrontWing4
		rightWingModel[4] = new ModelRendererTurbo(this,  199,  676, textureX, textureY); // RFrontWing5
		rightWingModel[5] = new ModelRendererTurbo(this,  296,  725, textureX, textureY); // RFrontWing6
		rightWingModel[6] = new ModelRendererTurbo(this,  358,  724, textureX, textureY); // RFrontWing7
		rightWingModel[7] = new ModelRendererTurbo(this,  416,  721, textureX, textureY); // RFrontWing8
		rightWingModel[8] = new ModelRendererTurbo(this,  260,  740, textureX, textureY); // RFlapFrontWing1
		rightWingModel[9] = new ModelRendererTurbo(this,  296,  792, textureX, textureY); // RFlapFrontWing2
		rightWingModel[10] = new ModelRendererTurbo(this,  556,  655, textureX, textureY); // RWingLight1
		rightWingModel[11] = new ModelRendererTurbo(this,  1,  176, textureX, textureY); // Galm2Rlogo1

		rightWingModel[0].addBox(6F, -8F, -151F, 5, 3, 105, 0F); // RFrontWing1
		rightWingModel[0].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[0].rotateAngleY = 0.6632251F;

		rightWingModel[1].addBox(78F, -8F, -129.5F, 13, 3, 5, 0F); // RFrontWing2
		rightWingModel[1].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[1].rotateAngleY = 0.1570796F;

		rightWingModel[2].addBox(11F, -8F, -153.5F, 26, 3, 108, 0F); // RFrontWing3
		rightWingModel[2].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[2].rotateAngleY = 0.6632251F;

		rightWingModel[3].addBox(1F, -8F, -158F, 30, 3, 5, 0F); // RFrontWing4
		rightWingModel[3].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[3].rotateAngleY = 0.7679449F;

		rightWingModel[4].addBox(24F, -8F, 72F, 59, 3, 41, 0F); // RFrontWing5
		rightWingModel[4].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[4].rotateAngleY = -1.570796F;

		rightWingModel[5].addBox(30F, -8F, 59F, 12, 3, 6, 0F); // RFrontWing6
		rightWingModel[5].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[5].rotateAngleY = -1.413717F;

		rightWingModel[6].addBox(100F, -8F, -113.5F, 13, 3, 5, 0F); // RFrontWing7
		rightWingModel[6].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[6].rotateAngleY = 0.1570796F;

		rightWingModel[7].addBox(60F, -8F, -136.5F, 5, 3, 28, 0F); // RFrontWing8
		rightWingModel[7].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[7].rotateAngleY = 0.4712389F;

		rightWingModel[8].addBox(65F, -7.5F, -137.5F, 9, 2, 35, 0F); // RFlapFrontWing1
		rightWingModel[8].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[8].rotateAngleY = 0.4712389F;

		rightWingModel[9].addBox(40.5F, -7.5F, 112F, 37, 2, 9, 0F); // RFlapFrontWing2
		rightWingModel[9].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[9].rotateAngleY = -1.570796F;

		rightWingModel[10].addBox(34F, -7F, -42.5F, 1, 1, 1, 0F); // RWingLight1

		rightWingModel[11].addBox(80.5F, -8.2F, 98.1F, 24, 2, 12, 0F); // Galm2Rlogo1
		rightWingModel[11].setRotationPoint(-9F, 0F, 4F);
		rightWingModel[11].rotateAngleY = -1.570796F;



// Top Wing
		topWingModel = new ModelRendererTurbo[1];
		topWingModel[0] = new ModelRendererTurbo(this,  63,  637, textureX, textureY); // CockpitHudFrame5

		topWingModel[0].addBox(-21.5F, 52F, -2.5F, 5, 0, 5, 0F); // CockpitHudFrame5
		topWingModel[0].setRotationPoint(0F, 0F, 0F);
		topWingModel[0].rotateAngleZ = -1.570796F;



// Body Wheel
		bodyWheelModel = new ModelRendererTurbo[13];
		bodyWheelModel[0] = new ModelRendererTurbo(this,  805,  258, textureX, textureY); // LandingGear1
		bodyWheelModel[1] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear2
		bodyWheelModel[2] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear3
		bodyWheelModel[3] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear4
		bodyWheelModel[4] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear5
		bodyWheelModel[5] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear6
		bodyWheelModel[6] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear7
		bodyWheelModel[7] = new ModelRendererTurbo(this,  805,  290, textureX, textureY); // LandingGear8
		bodyWheelModel[8] = new ModelRendererTurbo(this,  866,  302, textureX, textureY); // LandingGearWheel6
		bodyWheelModel[9] = new ModelRendererTurbo(this,  866,  302, textureX, textureY); // LandingGearWheel7
		bodyWheelModel[10] = new ModelRendererTurbo(this,  840,  295, textureX, textureY); // LandingGearWheel8
		bodyWheelModel[11] = new ModelRendererTurbo(this,  866,  296, textureX, textureY); // LandingGearWheel9
		bodyWheelModel[12] = new ModelRendererTurbo(this,  866,  296, textureX, textureY); // LandingGearWheel10

		bodyWheelModel[0].addBox(-18F, 4F, -5F, 2, 16, 10, 0F); // LandingGear1
		bodyWheelModel[0].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[0].rotateAngleZ = 0.296706F;

		bodyWheelModel[1].addBox(-29F, -9F, -0.5F, 5, 1, 1, 0F); // LandingGear2
		bodyWheelModel[1].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[1].rotateAngleZ = 0.6981317F;

		bodyWheelModel[2].addBox(-33.4F, 7.3F, 0.5F, 2, 4, 1, 0F); // LandingGear3
		bodyWheelModel[2].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[2].rotateAngleZ = 0.6981317F;

		bodyWheelModel[3].addBox(-21.5F, 20F, -1.5F, 3, 1, 3, 0F); // LandingGear4
		bodyWheelModel[3].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[4].addBox(-21.5F, 21F, 0.5F, 3, 1, 1, 0F); // LandingGear5
		bodyWheelModel[4].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[5].addBox(-21F, 22F, 0.5F, 2, 5, 1, 0F); // LandingGear6
		bodyWheelModel[5].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[6].addBox(-22F, 9F, -2F, 4, 11, 4, 0F); // LandingGear7
		bodyWheelModel[6].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[7].addBox(-29F, -12F, -0.5F, 1, 14, 1, 0F); // LandingGear8
		bodyWheelModel[7].setRotationPoint(0F, 0F, 0F);
		bodyWheelModel[7].rotateAngleZ = 0.6981317F;

		bodyWheelModel[8].addBox(-14.5F, 26F, -1F, 1, 7, 2, 0F); // LandingGearWheel6
		bodyWheelModel[8].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[9].addBox(-22.5F, 26F, -1F, 1, 7, 2, 0F); // LandingGearWheel7
		bodyWheelModel[9].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[10].addBox(-22F, 25.5F, -1F, 8, 8, 2, 0F); // LandingGearWheel8
		bodyWheelModel[10].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[11].addBox(-21.5F, 25F, -1F, 7, 1, 2, 0F); // LandingGearWheel9
		bodyWheelModel[11].setRotationPoint(0F, 0F, 0F);

		bodyWheelModel[12].addBox(-21.5F, 33F, -1F, 7, 1, 2, 0F); // LandingGearWheel10
		bodyWheelModel[12].setRotationPoint(0F, 0F, 0F);



// Tail Wheel
		tailWheelModel = new ModelRendererTurbo[24];
		tailWheelModel[0] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear9
		tailWheelModel[1] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear10
		tailWheelModel[2] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear11
		tailWheelModel[3] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear12
		tailWheelModel[4] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear13
		tailWheelModel[5] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear14
		tailWheelModel[6] = new ModelRendererTurbo(this,  861,  262, textureX, textureY); // LandingGear15
		tailWheelModel[7] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear16
		tailWheelModel[8] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear17
		tailWheelModel[9] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear18
		tailWheelModel[10] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear19
		tailWheelModel[11] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear20
		tailWheelModel[12] = new ModelRendererTurbo(this,  838,  262, textureX, textureY); // LandingGear21
		tailWheelModel[13] = new ModelRendererTurbo(this,  861,  262, textureX, textureY); // LandingGear22
		tailWheelModel[14] = new ModelRendererTurbo(this,  840,  295, textureX, textureY); // LandingGearWheel1
		tailWheelModel[15] = new ModelRendererTurbo(this,  866,  302, textureX, textureY); // LandingGearWheel2
		tailWheelModel[16] = new ModelRendererTurbo(this,  866,  296, textureX, textureY); // LandingGearWheel3
		tailWheelModel[17] = new ModelRendererTurbo(this,  866,  296, textureX, textureY); // LandingGearWheel4
		tailWheelModel[18] = new ModelRendererTurbo(this,  866,  302, textureX, textureY); // LandingGearWheel5
		tailWheelModel[19] = new ModelRendererTurbo(this,  866,  302, textureX, textureY); // LandingGearWheel11
		tailWheelModel[20] = new ModelRendererTurbo(this,  866,  302, textureX, textureY); // LandingGearWheel12
		tailWheelModel[21] = new ModelRendererTurbo(this,  840,  295, textureX, textureY); // LandingGearWheel13
		tailWheelModel[22] = new ModelRendererTurbo(this,  866,  296, textureX, textureY); // LandingGearWheel14
		tailWheelModel[23] = new ModelRendererTurbo(this,  866,  296, textureX, textureY); // LandingGearWheel15

		tailWheelModel[0].addBox(83F, 23F, 19.5F, 2, 7, 1, 0F); // LandingGear9
		tailWheelModel[0].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[1].addBox(51F, 58F, 20F, 2, 9, 2, 0F); // LandingGear10
		tailWheelModel[1].setRotationPoint(0F, 0F, 0F);
		tailWheelModel[1].rotateAngleZ = 0.6981317F;

		tailWheelModel[2].addBox(79F, 36.1F, 20F, 3, 1, 2, 0F); // LandingGear11
		tailWheelModel[2].setRotationPoint(0F, 0F, 0F);
		tailWheelModel[2].rotateAngleZ = 0.1745329F;

		tailWheelModel[3].addBox(82F, 12F, 19F, 4, 8, 4, 0F); // LandingGear12
		tailWheelModel[3].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[4].addBox(82.5F, 20F, 19.5F, 3, 3, 3, 0F); // LandingGear13
		tailWheelModel[4].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[5].addBox(86.5F, 5.3F, 20F, 3, 1, 2, 0F); // LandingGear14
		tailWheelModel[5].setRotationPoint(0F, 0F, 0F);
		tailWheelModel[5].rotateAngleZ = -0.1745329F;

		tailWheelModel[6].addBox(75F, 12F, 16F, 19, 10, 1, 0F); // LandingGear15
		tailWheelModel[6].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[7].addBox(51F, 58F, -22F, 2, 9, 2, 0F); // LandingGear16
		tailWheelModel[7].setRotationPoint(0F, 0F, 0F);
		tailWheelModel[7].rotateAngleZ = 0.6981317F;

		tailWheelModel[8].addBox(82F, 12F, -23F, 4, 8, 4, 0F); // LandingGear17
		tailWheelModel[8].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[9].addBox(82.5F, 20F, -22.5F, 3, 3, 3, 0F); // LandingGear18
		tailWheelModel[9].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[10].addBox(86.5F, 5.3F, -22F, 3, 1, 2, 0F); // LandingGear19
		tailWheelModel[10].setRotationPoint(0F, 0F, 0F);
		tailWheelModel[10].rotateAngleZ = -0.1745329F;

		tailWheelModel[11].addBox(79F, 36.1F, -22F, 3, 1, 2, 0F); // LandingGear20
		tailWheelModel[11].setRotationPoint(0F, 0F, 0F);
		tailWheelModel[11].rotateAngleZ = 0.1745329F;

		tailWheelModel[12].addBox(83F, 23F, -20.5F, 2, 7, 1, 0F); // LandingGear21
		tailWheelModel[12].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[13].addBox(75F, 12F, -17F, 19, 10, 1, 0F); // LandingGear22
		tailWheelModel[13].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[14].addBox(80F, 25.5F, 20F, 8, 8, 2, 0F); // LandingGearWheel1
		tailWheelModel[14].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[15].addBox(87.5F, 26F, 20F, 1, 7, 2, 0F); // LandingGearWheel2
		tailWheelModel[15].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[16].addBox(80.5F, 25F, 20F, 7, 1, 2, 0F); // LandingGearWheel3
		tailWheelModel[16].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[17].addBox(80.5F, 33F, 20F, 7, 1, 2, 0F); // LandingGearWheel4
		tailWheelModel[17].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[18].addBox(79.5F, 26F, 20F, 1, 7, 2, 0F); // LandingGearWheel5
		tailWheelModel[18].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[19].addBox(87.5F, 26F, -22F, 1, 7, 2, 0F); // LandingGearWheel11
		tailWheelModel[19].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[20].addBox(79.5F, 26F, -22F, 1, 7, 2, 0F); // LandingGearWheel12
		tailWheelModel[20].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[21].addBox(80F, 25.5F, -22F, 8, 8, 2, 0F); // LandingGearWheel13
		tailWheelModel[21].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[22].addBox(80.5F, 25F, -22F, 7, 1, 2, 0F); // LandingGearWheel14
		tailWheelModel[22].setRotationPoint(0F, 0F, 0F);

		tailWheelModel[23].addBox(80.5F, 33F, -22F, 7, 1, 2, 0F); // LandingGearWheel15
		tailWheelModel[23].setRotationPoint(0F, 0F, 0F);



// Body Door Close
		bodyDoorCloseModel = new ModelRendererTurbo[46];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this,  1,  814, textureX, textureY); // CanopyGlass1
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this,  1,  847, textureX, textureY); // CanopyGlass2
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this,  1,  866, textureX, textureY); // CanopyGlass3
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this,  1,  885, textureX, textureY); // CanopyGlass4
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this,  1,  909, textureX, textureY); // CanopyGlass5
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this,  41,  820, textureX, textureY); // CanopyGlass6
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this,  52,  820, textureX, textureY); // CanopyGlass7
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this,  64,  820, textureX, textureY); // CanopyGlass8
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this,  72,  820, textureX, textureY); // CanopyGlass9
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this,  83,  820, textureX, textureY); // CanopyGlass10
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this,  92,  820, textureX, textureY); // CanopyGlass11
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this,  60,  834, textureX, textureY); // CanopyGlass12
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this,  84,  834, textureX, textureY); // CanopyGlass13
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this,  101,  834, textureX, textureY); // CanopyGlass14
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this,  117,  834, textureX, textureY); // CanopyGlass15
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this,  135,  834, textureX, textureY); // CanopyGlass16
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this,  148,  834, textureX, textureY); // CanopyGlass17
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this,  161,  834, textureX, textureY); // CanopyGlass18
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this,  0,  929, textureX, textureY); // CanopyGlass19
		bodyDoorCloseModel[19] = new ModelRendererTurbo(this,  32,  930, textureX, textureY); // CanopyGlass20
		bodyDoorCloseModel[20] = new ModelRendererTurbo(this,  70,  930, textureX, textureY); // CanopyGlass21
		bodyDoorCloseModel[21] = new ModelRendererTurbo(this,  1,  947, textureX, textureY); // CanopyGlass22
		bodyDoorCloseModel[22] = new ModelRendererTurbo(this,  100,  947, textureX, textureY); // CanopyGlass23
		bodyDoorCloseModel[23] = new ModelRendererTurbo(this,  67,  947, textureX, textureY); // CanopyGlass24
		bodyDoorCloseModel[24] = new ModelRendererTurbo(this,  132,  947, textureX, textureY); // CanopyGlass25
		bodyDoorCloseModel[25] = new ModelRendererTurbo(this,  160,  947, textureX, textureY); // CanopyGlass26
		bodyDoorCloseModel[26] = new ModelRendererTurbo(this,  176,  818, textureX, textureY); // CanopyGlass27
		bodyDoorCloseModel[27] = new ModelRendererTurbo(this,  175,  834, textureX, textureY); // CanopyGlass28
		bodyDoorCloseModel[28] = new ModelRendererTurbo(this,  185,  818, textureX, textureY); // CanopyGlass29
		bodyDoorCloseModel[29] = new ModelRendererTurbo(this,  197,  818, textureX, textureY); // CanopyGlass30
		bodyDoorCloseModel[30] = new ModelRendererTurbo(this,  206,  818, textureX, textureY); // CanopyGlass31
		bodyDoorCloseModel[31] = new ModelRendererTurbo(this,  216,  818, textureX, textureY); // CanopyGlass32
		bodyDoorCloseModel[32] = new ModelRendererTurbo(this,  227,  818, textureX, textureY); // CanopyGlass33
		bodyDoorCloseModel[33] = new ModelRendererTurbo(this,  198,  834, textureX, textureY); // CanopyGlass34
		bodyDoorCloseModel[34] = new ModelRendererTurbo(this,  219,  834, textureX, textureY); // CanopyGlass35
		bodyDoorCloseModel[35] = new ModelRendererTurbo(this,  237,  834, textureX, textureY); // CanopyGlass36
		bodyDoorCloseModel[36] = new ModelRendererTurbo(this,  252,  834, textureX, textureY); // CanopyGlass37
		bodyDoorCloseModel[37] = new ModelRendererTurbo(this,  263,  834, textureX, textureY); // CanopyGlass38
		bodyDoorCloseModel[38] = new ModelRendererTurbo(this,  83,  857, textureX, textureY); // CanopyGlass39
		bodyDoorCloseModel[39] = new ModelRendererTurbo(this,  116,  856, textureX, textureY); // CanopyGlass40
		bodyDoorCloseModel[40] = new ModelRendererTurbo(this,  156,  857, textureX, textureY); // CanopyGlass41
		bodyDoorCloseModel[41] = new ModelRendererTurbo(this,  73,  886, textureX, textureY); // CanopyGlass42
		bodyDoorCloseModel[42] = new ModelRendererTurbo(this,  140,  887, textureX, textureY); // CanopyGlass43
		bodyDoorCloseModel[43] = new ModelRendererTurbo(this,  177,  886, textureX, textureY); // CanopyGlass44
		bodyDoorCloseModel[44] = new ModelRendererTurbo(this,  210,  887, textureX, textureY); // CanopyGlass45
		bodyDoorCloseModel[45] = new ModelRendererTurbo(this,  236,  887, textureX, textureY); // CanopyGlass46

		bodyDoorCloseModel[0].addBox(-54F, 21F, -8F, 1, 12, 16, 0F); // CanopyGlass1
		bodyDoorCloseModel[0].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.8028514F;

		bodyDoorCloseModel[1].addBox(-46.8F, -32.8F, -7F, 10, 1, 14, 0F); // CanopyGlass2
		bodyDoorCloseModel[1].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.1745329F;

		bodyDoorCloseModel[2].addBox(-42F, -26F, -7F, 16, 1, 14, 0F); // CanopyGlass3
		bodyDoorCloseModel[2].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[3].addBox(-25F, -26F, -7F, 18, 1, 14, 0F); // CanopyGlass4
		bodyDoorCloseModel[3].setRotationPoint(0F, 0F, 0F);

		bodyDoorCloseModel[4].addBox(-13.1F, -23.5F, -7F, 12, 1, 14, 0F); // CanopyGlass5
		bodyDoorCloseModel[4].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[4].rotateAngleZ = -0.2443461F;

		bodyDoorCloseModel[5].addBox(-32.8F, 4.4F, -48.5F, 1, 10, 1, 0F); // CanopyGlass6
		bodyDoorCloseModel[5].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[5].rotateAngleX = -0.5934119F;
		bodyDoorCloseModel[5].rotateAngleY = -0.7853982F;

		bodyDoorCloseModel[6].addBox(-33.8F, 6F, -48.5F, 1, 9, 1, 0F); // CanopyGlass7
		bodyDoorCloseModel[6].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[6].rotateAngleX = -0.5934119F;
		bodyDoorCloseModel[6].rotateAngleY = -0.7853982F;

		bodyDoorCloseModel[7].addBox(-34.8F, 7.6F, -48.5F, 1, 7, 1, 0F); // CanopyGlass8
		bodyDoorCloseModel[7].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[7].rotateAngleX = -0.5934119F;
		bodyDoorCloseModel[7].rotateAngleY = -0.7853982F;

		bodyDoorCloseModel[8].addBox(-35.8F, 9.6F, -48.5F, 1, 5, 1, 0F); // CanopyGlass9
		bodyDoorCloseModel[8].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[8].rotateAngleX = -0.5934119F;
		bodyDoorCloseModel[8].rotateAngleY = -0.7853982F;

		bodyDoorCloseModel[9].addBox(-36.8F, 10.6F, -48.5F, 1, 4, 1, 0F); // CanopyGlass10
		bodyDoorCloseModel[9].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[9].rotateAngleX = -0.5934119F;
		bodyDoorCloseModel[9].rotateAngleY = -0.7853982F;

		bodyDoorCloseModel[10].addBox(-37.8F, 12.6F, -48.5F, 1, 2, 1, 0F); // CanopyGlass11
		bodyDoorCloseModel[10].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[10].rotateAngleX = -0.5934119F;
		bodyDoorCloseModel[10].rotateAngleY = -0.7853982F;

		bodyDoorCloseModel[11].addBox(-53.8F, -18F, 6F, 1, 1, 9, 0F); // CanopyGlass12
		bodyDoorCloseModel[11].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[11].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[12].addBox(-54.4F, -18F, 6F, 1, 1, 7, 0F); // CanopyGlass13
		bodyDoorCloseModel[12].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[12].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[13].addBox(-55F, -18F, 6.5F, 1, 1, 5, 0F); // CanopyGlass14
		bodyDoorCloseModel[13].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[13].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[14].addBox(-55F, -18F, 6.5F, 1, 1, 5, 0F); // CanopyGlass15
		bodyDoorCloseModel[14].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[14].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[15].addBox(-55.3F, -18F, 6.3F, 1, 1, 4, 0F); // CanopyGlass16
		bodyDoorCloseModel[15].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[15].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[16].addBox(-55.6F, -18F, 6.5F, 1, 1, 3, 0F); // CanopyGlass17
		bodyDoorCloseModel[16].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[16].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[17].addBox(-56F, -18F, 6.5F, 1, 1, 2, 0F); // CanopyGlass18
		bodyDoorCloseModel[17].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[17].rotateAngleX = 1.047198F;

		bodyDoorCloseModel[18].addBox(-51.8F, -17.6F, 8F, 4, 1, 10, 0F); // CanopyGlass19
		bodyDoorCloseModel[18].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[18].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[19].addBox(-47.8F, -17.6F, 8F, 6, 1, 11, 0F); // CanopyGlass20
		bodyDoorCloseModel[19].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[19].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[20].addBox(-41.8F, -17.6F, 8F, 16, 1, 12, 0F); // CanopyGlass21
		bodyDoorCloseModel[20].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[20].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[21].addBox(-25.8F, -17.6F, 8F, 19, 1, 12, 0F); // CanopyGlass22
		bodyDoorCloseModel[21].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[21].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[22].addBox(-2.8F, -17.6F, 7.9F, 4, 1, 10, 0F); // CanopyGlass23
		bodyDoorCloseModel[22].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[22].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[23].addBox(-6.8F, -17.6F, 8F, 4, 1, 11, 0F); // CanopyGlass24
		bodyDoorCloseModel[23].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[23].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[24].addBox(1.2F, -17.6F, 8.3F, 2, 1, 9, 0F); // CanopyGlass25
		bodyDoorCloseModel[24].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[24].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[25].addBox(2.8F, -17.6F, 10.8F, 3, 1, 6, 0F); // CanopyGlass26
		bodyDoorCloseModel[25].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[25].rotateAngleX = 1.117011F;

		bodyDoorCloseModel[26].addBox(-32.8F, 4.4F, 47.5F, 1, 10, 1, 0F); // CanopyGlass27
		bodyDoorCloseModel[26].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[26].rotateAngleX = 0.5934119F;
		bodyDoorCloseModel[26].rotateAngleY = 0.7853982F;

		bodyDoorCloseModel[27].addBox(-53.8F, -18F, -15F, 1, 1, 9, 0F); // CanopyGlass28
		bodyDoorCloseModel[27].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[27].rotateAngleX = -1.047198F;

		bodyDoorCloseModel[28].addBox(-33.8F, 6.2F, 47.5F, 1, 9, 1, 0F); // CanopyGlass29
		bodyDoorCloseModel[28].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[28].rotateAngleX = 0.5934119F;
		bodyDoorCloseModel[28].rotateAngleY = 0.7853982F;

		bodyDoorCloseModel[29].addBox(-34.8F, 8F, 47.5F, 1, 7, 1, 0F); // CanopyGlass30
		bodyDoorCloseModel[29].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[29].rotateAngleX = 0.5934119F;
		bodyDoorCloseModel[29].rotateAngleY = 0.7853982F;

		bodyDoorCloseModel[30].addBox(-35.8F, 9F, 47.5F, 1, 6, 1, 0F); // CanopyGlass31
		bodyDoorCloseModel[30].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[30].rotateAngleX = 0.5934119F;
		bodyDoorCloseModel[30].rotateAngleY = 0.7853982F;

		bodyDoorCloseModel[31].addBox(-36.8F, 11F, 47.5F, 1, 4, 1, 0F); // CanopyGlass32
		bodyDoorCloseModel[31].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[31].rotateAngleX = 0.5934119F;
		bodyDoorCloseModel[31].rotateAngleY = 0.7853982F;

		bodyDoorCloseModel[32].addBox(-37.8F, 12F, 47.5F, 1, 3, 1, 0F); // CanopyGlass33
		bodyDoorCloseModel[32].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[32].rotateAngleX = 0.5934119F;
		bodyDoorCloseModel[32].rotateAngleY = 0.7853982F;

		bodyDoorCloseModel[33].addBox(-54.4F, -18F, -13F, 1, 1, 7, 0F); // CanopyGlass34
		bodyDoorCloseModel[33].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[33].rotateAngleX = -1.047198F;

		bodyDoorCloseModel[34].addBox(-54.9F, -18F, -11.5F, 1, 1, 5, 0F); // CanopyGlass35
		bodyDoorCloseModel[34].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[34].rotateAngleX = -1.047198F;

		bodyDoorCloseModel[35].addBox(-55.3F, -18F, -10.5F, 1, 1, 4, 0F); // CanopyGlass36
		bodyDoorCloseModel[35].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[35].rotateAngleX = -1.047198F;

		bodyDoorCloseModel[36].addBox(-55.8F, -18F, -9.1F, 1, 1, 3, 0F); // CanopyGlass37
		bodyDoorCloseModel[36].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[36].rotateAngleX = -1.047198F;

		bodyDoorCloseModel[37].addBox(-56.2F, -18F, -8.1F, 1, 1, 2, 0F); // CanopyGlass38
		bodyDoorCloseModel[37].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[37].rotateAngleX = -1.047198F;

		bodyDoorCloseModel[38].addBox(-51.8F, -17.6F, -18F, 4, 1, 10, 0F); // CanopyGlass39
		bodyDoorCloseModel[38].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[38].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[39].addBox(-47.8F, -17.6F, -19F, 6, 1, 11, 0F); // CanopyGlass40
		bodyDoorCloseModel[39].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[39].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[40].addBox(-41.8F, -17.6F, -20F, 16, 1, 12, 0F); // CanopyGlass41
		bodyDoorCloseModel[40].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[40].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[41].addBox(-25.8F, -17.6F, -20F, 19, 1, 12, 0F); // CanopyGlass42
		bodyDoorCloseModel[41].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[41].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[42].addBox(-6.8F, -17.6F, -19F, 4, 1, 11, 0F); // CanopyGlass43
		bodyDoorCloseModel[42].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[42].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[43].addBox(-2.8F, -17.6F, -17.9F, 4, 1, 10, 0F); // CanopyGlass44
		bodyDoorCloseModel[43].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[43].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[44].addBox(1.2F, -17.6F, -17.3F, 2, 1, 9, 0F); // CanopyGlass45
		bodyDoorCloseModel[44].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[44].rotateAngleX = -1.117011F;

		bodyDoorCloseModel[45].addBox(2.8F, -17.6F, -16.6F, 3, 1, 6, 0F); // CanopyGlass46
		bodyDoorCloseModel[45].setRotationPoint(0F, 0F, 0F);
		bodyDoorCloseModel[45].rotateAngleX = -1.117011F;

// Propeller
		propellerModels = new ModelRendererTurbo[0][0];
		
		

		translateAll(0, 0, 0);


		flipAll();
	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}