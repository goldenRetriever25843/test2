//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelBMPT extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBMPT()
	{
		bodyModel = new ModelRendererTurbo[65];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 55, textureX, textureY); // Import ImportBody1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 108, textureX, textureY); // Import ImportBody2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import ImportBody4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportBody5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportBody6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportBody7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import ImportBody8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import ImportBody9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import ImportBody10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import ImportBody11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import ImportBody12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import ImportBody13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportBody14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import ImportBody15
		bodyModel[14] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody17
		bodyModel[16] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody19
		bodyModel[18] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody21
		bodyModel[20] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody22
		bodyModel[21] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody23
		bodyModel[22] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import ImportBody24
		bodyModel[23] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportBody25
		bodyModel[24] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import ImportBody26
		bodyModel[25] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import ImportBody27
		bodyModel[26] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportBody28
		bodyModel[27] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody29
		bodyModel[28] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody30
		bodyModel[29] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportBody31
		bodyModel[30] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import ImportBody32
		bodyModel[31] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import ImportBody33
		bodyModel[32] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import ImportBody34
		bodyModel[33] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBody35
		bodyModel[34] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import ImportBody36
		bodyModel[35] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import ImportBody37
		bodyModel[36] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import ImportBody38
		bodyModel[37] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import ImportBody39
		bodyModel[38] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody40
		bodyModel[39] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody41
		bodyModel[40] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody42
		bodyModel[41] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import ImportBody43
		bodyModel[42] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody44
		bodyModel[43] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody45
		bodyModel[44] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody46
		bodyModel[45] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody47
		bodyModel[46] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import ImportBody48
		bodyModel[47] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportBody49
		bodyModel[48] = new ModelRendererTurbo(this, 0, 490, textureX, textureY); // Import ImportBody50
		bodyModel[49] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import ImportBody51
		bodyModel[50] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Import ImportBody52
		bodyModel[51] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody53
		bodyModel[52] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBody54
		bodyModel[53] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import ImportBody55
		bodyModel[54] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Import ImportBody56
		bodyModel[55] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import ImportBody57
		bodyModel[56] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import ImportBody58
		bodyModel[57] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBody59
		bodyModel[58] = new ModelRendererTurbo(this, 0, 680, textureX, textureY); // Import ImportBody60
		bodyModel[59] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Box 1
		bodyModel[61] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 400, 670, textureX, textureY); // Box 3
		bodyModel[63] = new ModelRendererTurbo(this, 400, 740, textureX, textureY); // Box 4
		bodyModel[64] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Box 5

		bodyModel[0].addShapeBox(0F, 0F, 0F, 27, 10, 40, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody1
		bodyModel[0].setRotationPoint(40F, -19F, -20F);

		bodyModel[1].addBox(0F, 0F, 0F, 101, 10, 40, 0F); // Import ImportBody2
		bodyModel[1].setRotationPoint(-61F, -19F, -20F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Import ImportBody4
		bodyModel[2].setRotationPoint(-71F, -19F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 38, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportBody5
		bodyModel[3].setRotationPoint(-73F, -16F, -19F);

		bodyModel[4].addBox(0F, 0F, 0F, 12, 4, 38, 0F); // Import ImportBody6
		bodyModel[4].setRotationPoint(-73F, -20F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 38, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody7
		bodyModel[5].setRotationPoint(-73F, -24F, -19F);

		bodyModel[6].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Import ImportBody8
		bodyModel[6].setRotationPoint(-71F, -19F, 19F);

		bodyModel[7].addBox(0F, 0F, 0F, 20, 2, 40, 0F); // Import ImportBody9
		bodyModel[7].setRotationPoint(-58F, -21F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,-2F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody10
		bodyModel[8].setRotationPoint(-53F, -22F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,-2F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody11
		bodyModel[9].setRotationPoint(-53F, -22F, 5F);

		bodyModel[10].addBox(0F, 0F, 0F, 93, 2, 14, 0F); // Import ImportBody12
		bodyModel[10].setRotationPoint(-61F, -19F, -34F);

		bodyModel[11].addBox(0F, 0F, 0F, 93, 8, 2, 0F); // Import ImportBody13
		bodyModel[11].setRotationPoint(-61F, -17F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 17, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F); // Import ImportBody14
		bodyModel[12].setRotationPoint(-41F, -18F, -34.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 18, 9, 1, 0F); // Import ImportBody15
		bodyModel[13].setRotationPoint(-60F, -18F, -34.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody16
		bodyModel[14].setRotationPoint(-19F, -18F, -34.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody17
		bodyModel[15].setRotationPoint(-6F, -18F, -34.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody18
		bodyModel[16].setRotationPoint(7F, -18F, -34.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody19
		bodyModel[17].setRotationPoint(20F, -18F, -34.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody20
		bodyModel[18].setRotationPoint(-19F, -1F, -34.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody21
		bodyModel[19].setRotationPoint(-6F, -1F, -34.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody22
		bodyModel[20].setRotationPoint(7F, -1F, -34.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody23
		bodyModel[21].setRotationPoint(20F, -1F, -34.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 78, 8, 2, 0F); // Import ImportBody24
		bodyModel[22].setRotationPoint(-20F, -9F, -34F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 36, 6, 14, 0F,0F, 0F, 0F,-35F, 0F, 0F,-35F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody25
		bodyModel[23].setRotationPoint(32F, -19F, -34F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 40, 4, 14, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody26
		bodyModel[24].setRotationPoint(32F, -13F, -34F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 1F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody27
		bodyModel[25].setRotationPoint(33F, -17F, -34.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody28
		bodyModel[26].setRotationPoint(46F, -16F, -34.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody29
		bodyModel[27].setRotationPoint(33F, -1F, -34.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody30
		bodyModel[28].setRotationPoint(46F, -1F, -34.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 3, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-13F, 0F, 0F,-13F, 0F, 0F,0F, 0F, 0F); // Import ImportBody31
		bodyModel[29].setRotationPoint(58F, -9F, -34F);

		bodyModel[30].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // Import ImportBody32
		bodyModel[30].setRotationPoint(-60F, -19.5F, -33F);

		bodyModel[31].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Import ImportBody33
		bodyModel[31].setRotationPoint(-38F, -19.5F, -33F);

		bodyModel[32].addBox(0F, 0F, 0F, 51, 1, 12, 0F); // Import ImportBody34
		bodyModel[32].setRotationPoint(-22F, -19.5F, -33F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 119, 16, 1, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody35
		bodyModel[33].setRotationPoint(-61F, -17F, -21F);

		bodyModel[34].addBox(0F, 0F, 0F, 93, 2, 14, 0F); // Import ImportBody36
		bodyModel[34].setRotationPoint(-61F, -19F, 20F);

		bodyModel[35].addBox(0F, 0F, 0F, 93, 8, 2, 0F); // Import ImportBody37
		bodyModel[35].setRotationPoint(-61F, -17F, 32F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 21, 17, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F); // Import ImportBody38
		bodyModel[36].setRotationPoint(-41F, -18F, 33.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 18, 9, 1, 0F); // Import ImportBody39
		bodyModel[37].setRotationPoint(-60F, -18F, 33.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody40
		bodyModel[38].setRotationPoint(-19F, -18F, 33.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody41
		bodyModel[39].setRotationPoint(-6F, -18F, 33.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody42
		bodyModel[40].setRotationPoint(7F, -18F, 33.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 12, 17, 1, 0F); // Import ImportBody43
		bodyModel[41].setRotationPoint(20F, -18F, 33.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody44
		bodyModel[42].setRotationPoint(-19F, -1F, 33.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody45
		bodyModel[43].setRotationPoint(-6F, -1F, 33.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody46
		bodyModel[44].setRotationPoint(7F, -1F, 33.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody47
		bodyModel[45].setRotationPoint(20F, -1F, 33.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 78, 8, 2, 0F); // Import ImportBody48
		bodyModel[46].setRotationPoint(-20F, -9F, 32F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 36, 6, 14, 0F,0F, 0F, 0F,-35F, 0F, 0F,-35F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody49
		bodyModel[47].setRotationPoint(32F, -19F, 20F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 40, 4, 14, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody50
		bodyModel[48].setRotationPoint(32F, -13F, 20F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 1F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody51
		bodyModel[49].setRotationPoint(33F, -17F, 33.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 15, 1, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody52
		bodyModel[50].setRotationPoint(46F, -16F, 33.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody53
		bodyModel[51].setRotationPoint(33F, -1F, 33.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportBody54
		bodyModel[52].setRotationPoint(46F, -1F, 33.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 3, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-13F, 0F, 0F,-13F, 0F, 0F,0F, 0F, 0F); // Import ImportBody55
		bodyModel[53].setRotationPoint(58F, -9F, 20F);

		bodyModel[54].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // Import ImportBody56
		bodyModel[54].setRotationPoint(-60F, -19.5F, 21F);

		bodyModel[55].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Import ImportBody57
		bodyModel[55].setRotationPoint(-38F, -19.5F, 21F);

		bodyModel[56].addBox(0F, 0F, 0F, 51, 1, 12, 0F); // Import ImportBody58
		bodyModel[56].setRotationPoint(-22F, -19.5F, 21F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 119, 16, 1, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportBody59
		bodyModel[57].setRotationPoint(-61F, -17F, 20F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 128, 8, 40, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F,-20F, 0F, 0F); // Import ImportBody60
		bodyModel[58].setRotationPoint(-61F, -9F, -20F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 6, 16, 0F,0F, 0F, 0F,-12F, 0F, 0F,-12F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F); // Box 0
		bodyModel[59].setRotationPoint(21F, -24.5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 12, 6, 16, 0F,0F, 0F, -4F,-12F, 0F, -4F,-12F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		bodyModel[60].setRotationPoint(21F, -24.5F, -22F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 6, 56, 0F,0F, 0F, -4F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F); // Box 2
		bodyModel[61].setRotationPoint(8F, -24.5F, -28F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 6, 56, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		bodyModel[62].setRotationPoint(-8F, -24.5F, -28F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 13, 6, 56, 0F,0F, 0F, -10F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -10F,4F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,4F, 0F, -6F); // Box 4
		bodyModel[63].setRotationPoint(-21F, -24.5F, -28F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 6, 26, 0F); // Box 5
		bodyModel[64].setRotationPoint(-28F, -24.5F, -14F);


		turretModel = new ModelRendererTurbo[43];
		turretModel[0] = new ModelRendererTurbo(this, 700, 0, textureX, textureY); // Box 6
		turretModel[1] = new ModelRendererTurbo(this, 700, 50, textureX, textureY); // Box 7
		turretModel[2] = new ModelRendererTurbo(this, 700, 90, textureX, textureY); // Box 8
		turretModel[3] = new ModelRendererTurbo(this, 700, 130, textureX, textureY); // Box 9
		turretModel[4] = new ModelRendererTurbo(this, 700, 170, textureX, textureY); // Box 10
		turretModel[5] = new ModelRendererTurbo(this, 700, 210, textureX, textureY); // Box 11
		turretModel[6] = new ModelRendererTurbo(this, 700, 230, textureX, textureY); // Box 12
		turretModel[7] = new ModelRendererTurbo(this, 700, 250, textureX, textureY); // Box 13
		turretModel[8] = new ModelRendererTurbo(this, 701, 250, textureX, textureY); // Box 14
		turretModel[9] = new ModelRendererTurbo(this, 700, 260, textureX, textureY); // Box 16
		turretModel[10] = new ModelRendererTurbo(this, 700, 270, textureX, textureY); // Box 17
		turretModel[11] = new ModelRendererTurbo(this, 700, 270, textureX, textureY); // Box 18
		turretModel[12] = new ModelRendererTurbo(this, 700, 290, textureX, textureY); // Box 19
		turretModel[13] = new ModelRendererTurbo(this, 700, 310, textureX, textureY); // Box 20
		turretModel[14] = new ModelRendererTurbo(this, 700, 330, textureX, textureY); // Box 21
		turretModel[15] = new ModelRendererTurbo(this, 700, 330, textureX, textureY); // Box 22
		turretModel[16] = new ModelRendererTurbo(this, 700, 350, textureX, textureY); // Box 23
		turretModel[17] = new ModelRendererTurbo(this, 700, 350, textureX, textureY); // Box 24
		turretModel[18] = new ModelRendererTurbo(this, 700, 370, textureX, textureY); // Box 25
		turretModel[19] = new ModelRendererTurbo(this, 700, 370, textureX, textureY); // Box 26
		turretModel[20] = new ModelRendererTurbo(this, 700, 380, textureX, textureY); // Box 28
		turretModel[21] = new ModelRendererTurbo(this, 700, 420, textureX, textureY); // Box 29
		turretModel[22] = new ModelRendererTurbo(this, 700, 440, textureX, textureY); // Box 30
		turretModel[23] = new ModelRendererTurbo(this, 700, 460, textureX, textureY); // Box 31
		turretModel[24] = new ModelRendererTurbo(this, 700, 480, textureX, textureY); // Box 32
		turretModel[25] = new ModelRendererTurbo(this, 700, 500, textureX, textureY); // Box 33
		turretModel[26] = new ModelRendererTurbo(this, 700, 520, textureX, textureY); // Box 34
		turretModel[27] = new ModelRendererTurbo(this, 700, 500, textureX, textureY); // Box 35
		turretModel[28] = new ModelRendererTurbo(this, 700, 480, textureX, textureY); // Box 36
		turretModel[29] = new ModelRendererTurbo(this, 700, 520, textureX, textureY); // Box 37
		turretModel[30] = new ModelRendererTurbo(this, 700, 540, textureX, textureY); // Box 38
		turretModel[31] = new ModelRendererTurbo(this, 700, 560, textureX, textureY); // Box 39
		turretModel[32] = new ModelRendererTurbo(this, 700, 570, textureX, textureY); // Box 40
		turretModel[33] = new ModelRendererTurbo(this, 700, 600, textureX, textureY); // Box 41
		turretModel[34] = new ModelRendererTurbo(this, 700, 600, textureX, textureY); // Box 42
		turretModel[35] = new ModelRendererTurbo(this, 700, 620, textureX, textureY); // Box 43
		turretModel[36] = new ModelRendererTurbo(this, 700, 640, textureX, textureY); // Box 61
		turretModel[37] = new ModelRendererTurbo(this, 700, 640, textureX, textureY); // Box 62
		turretModel[38] = new ModelRendererTurbo(this, 700, 640, textureX, textureY); // Box 63
		turretModel[39] = new ModelRendererTurbo(this, 700, 660, textureX, textureY); // Box 64
		turretModel[40] = new ModelRendererTurbo(this, 700, 680, textureX, textureY); // Box 65
		turretModel[41] = new ModelRendererTurbo(this, 700, 700, textureX, textureY); // Box 66
		turretModel[42] = new ModelRendererTurbo(this, 700, 720, textureX, textureY); // Box 68

		turretModel[0].addBox(0F, 0F, 0F, 12, 1, 36, 0F); // Box 6
		turretModel[0].setRotationPoint(-10F, -25.5F, -18F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 36, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Box 7
		turretModel[1].setRotationPoint(-16F, -25.5F, -18F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 28, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F); // Box 8
		turretModel[2].setRotationPoint(-20F, -25.5F, -14F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 36, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Box 9
		turretModel[3].setRotationPoint(2F, -25.5F, -18F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 28, 0F,0F, 0F, 0F,0F, -0.8F, -6F,0F, -0.8F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,0F, 0F, -6F,0F, 0F, 0F); // Box 10
		turretModel[4].setRotationPoint(9F, -25.5F, -14F);

		turretModel[5].addBox(0F, 0F, 0F, 6, 8, 8, 0F); // Box 11
		turretModel[5].setRotationPoint(-3F, -33.5F, 6F);

		turretModel[6].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 12
		turretModel[6].setRotationPoint(3F, -32.5F, 8F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 13
		turretModel[7].setRotationPoint(3F, -32.5F, 7F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 14
		turretModel[8].setRotationPoint(3F, -32.5F, 12F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, -2F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 16
		turretModel[9].setRotationPoint(-6F, -30.5F, 8F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Box 17
		turretModel[10].setRotationPoint(-1F, -27.5F, -12F);

		turretModel[11].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 18
		turretModel[11].setRotationPoint(-5F, -27.5F, -12F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 19
		turretModel[12].setRotationPoint(-7F, -27.5F, -12F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 20
		turretModel[13].setRotationPoint(-7F, -29.5F, -12F);

		turretModel[14].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 21
		turretModel[14].setRotationPoint(-5F, -29.5F, -12F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Box 22
		turretModel[15].setRotationPoint(-1F, -29.5F, -12F);

		turretModel[16].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 23
		turretModel[16].setRotationPoint(-5F, -28.5F, -12F);

		turretModel[17].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 24
		turretModel[17].setRotationPoint(-5F, -28.5F, -1F);

		turretModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 25
		turretModel[18].setRotationPoint(2F, -28.5F, -8F);

		turretModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 26
		turretModel[19].setRotationPoint(2F, -28.5F, -5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 6, 8, 25, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,0F, 0F, 0F); // Box 28
		turretModel[20].setRotationPoint(-17F, -33.5F, -12.5F);

		turretModel[21].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 29
		turretModel[21].setRotationPoint(-12F, -31.5F, -11F);
		turretModel[21].rotateAngleZ = 0.36651914F;

		turretModel[22].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Box 30
		turretModel[22].setRotationPoint(-12F, -27.5F, 2F);

		turretModel[23].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 31
		turretModel[23].setRotationPoint(-2F, -30.5F, 2F);

		turretModel[24].addBox(0F, 0F, 0F, 10, 7, 6, 0F); // Box 32
		turretModel[24].setRotationPoint(-22F, -39.5F, -12F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Box 33
		turretModel[25].setRotationPoint(-26F, -39.5F, -12F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 34
		turretModel[26].setRotationPoint(-12F, -39.5F, -12F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F); // Box 35
		turretModel[27].setRotationPoint(-26F, -39.5F, 6F);

		turretModel[28].addBox(0F, 0F, 0F, 10, 7, 6, 0F); // Box 36
		turretModel[28].setRotationPoint(-22F, -39.5F, 6F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F); // Box 37
		turretModel[29].setRotationPoint(-12F, -39.5F, 6F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 38
		turretModel[30].setRotationPoint(-18F, -39.5F, -6F);

		turretModel[31].addBox(0F, 0F, 0F, 8, 4, 12, 0F); // Box 39
		turretModel[31].setRotationPoint(-26F, -39.5F, -6F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F); // Box 40
		turretModel[32].setRotationPoint(-27F, -39.5F, -6F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 10, 14, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F); // Box 41
		turretModel[33].setRotationPoint(-25F, -38.5F, 7F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 10, 14, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F); // Box 42
		turretModel[34].setRotationPoint(-25F, -38.5F, -11F);

		turretModel[35].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Box 43
		turretModel[35].setRotationPoint(-31F, -39.5F, -3F);

		turretModel[36].addBox(0F, -4F, 0F, 2, 4, 6, 0F); // Box 61
		turretModel[36].setRotationPoint(-22F, -39.5F, -12F);

		turretModel[37].addShapeBox(0F, -4F, 0F, 2, 4, 6, 0F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 62
		turretModel[37].setRotationPoint(-24F, -39.5F, -12F);

		turretModel[38].addShapeBox(0F, -4F, 0F, 2, 4, 6, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 63
		turretModel[38].setRotationPoint(-20F, -39.5F, -12F);

		turretModel[39].addBox(0F, -4F, 0F, 2, 4, 5, 0F); // Box 64
		turretModel[39].setRotationPoint(-22F, -43.5F, -11.5F);

		turretModel[40].addShapeBox(-1F, -4F, 0F, 1, 4, 5, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 65
		turretModel[40].setRotationPoint(-22F, -43.5F, -11.5F);

		turretModel[41].addShapeBox(0F, 1F, 0F, 6, 1, 6, 0F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 66
		turretModel[41].setRotationPoint(-22F, -41.5F, 6F);

		turretModel[42].addBox(0F, 1F, 0F, 2, 11, 2, 0F); // Box 68
		turretModel[42].setRotationPoint(-20F, -52.5F, 8F);


		barrelModel = new ModelRendererTurbo[17];
		barrelModel[0] = new ModelRendererTurbo(this, 700, 740, textureX, textureY); // Box 44
		barrelModel[1] = new ModelRendererTurbo(this, 700, 760, textureX, textureY); // Box 45
		barrelModel[2] = new ModelRendererTurbo(this, 700, 760, textureX, textureY); // Box 46
		barrelModel[3] = new ModelRendererTurbo(this, 700, 780, textureX, textureY); // Box 47
		barrelModel[4] = new ModelRendererTurbo(this, 700, 800, textureX, textureY); // Box 48
		barrelModel[5] = new ModelRendererTurbo(this, 700, 800, textureX, textureY); // Box 49
		barrelModel[6] = new ModelRendererTurbo(this, 700, 780, textureX, textureY); // Box 50
		barrelModel[7] = new ModelRendererTurbo(this, 700, 820, textureX, textureY); // Box 51
		barrelModel[8] = new ModelRendererTurbo(this, 700, 840, textureX, textureY); // Box 52
		barrelModel[9] = new ModelRendererTurbo(this, 700, 860, textureX, textureY); // Box 53
		barrelModel[10] = new ModelRendererTurbo(this, 700, 860, textureX, textureY); // Box 54
		barrelModel[11] = new ModelRendererTurbo(this, 700, 820, textureX, textureY); // Box 55
		barrelModel[12] = new ModelRendererTurbo(this, 700, 840, textureX, textureY); // Box 56
		barrelModel[13] = new ModelRendererTurbo(this, 700, 880, textureX, textureY); // Box 57
		barrelModel[14] = new ModelRendererTurbo(this, 700, 880, textureX, textureY); // Box 58
		barrelModel[15] = new ModelRendererTurbo(this, 700, 880, textureX, textureY); // Box 59
		barrelModel[16] = new ModelRendererTurbo(this, 700, 880, textureX, textureY); // Box 60

		barrelModel[0].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F,0F, 0F, 1F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, 0F, 1F); // Box 44
		barrelModel[0].setRotationPoint(-16F, -38F, -4F);

		barrelModel[1].addShapeBox(0F, -1F, 0F, 18, 1, 8, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 1F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0F, 1F); // Box 45
		barrelModel[1].setRotationPoint(-16F, -38F, -4F);

		barrelModel[2].addShapeBox(0F, 2F, 0F, 18, 1, 8, 0F,0F, 0F, 1F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0F, 1F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F); // Box 46
		barrelModel[2].setRotationPoint(-16F, -38F, -4F);

		barrelModel[3].addBox(18F, 0F, 1F, 21, 1, 1, 0F); // Box 47
		barrelModel[3].setRotationPoint(-16F, -37.5F, -4F);

		barrelModel[4].addShapeBox(39F, 0F, 0.5F, 2, 1, 2, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F); // Box 48
		barrelModel[4].setRotationPoint(-16F, -37.5F, -4F);

		barrelModel[5].addShapeBox(39F, 0F, 5.5F, 2, 1, 2, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F,0F, 0.2F, 0F); // Box 49
		barrelModel[5].setRotationPoint(-16F, -37.5F, -4F);

		barrelModel[6].addBox(18F, 0F, 6F, 21, 1, 1, 0F); // Box 50
		barrelModel[6].setRotationPoint(-16F, -37.5F, -4F);

		barrelModel[7].addShapeBox(-4F, -3F, 0F, 10, 8, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 51
		barrelModel[7].setRotationPoint(-18F, -36.5F, 12F);

		barrelModel[8].addShapeBox(6F, -3F, 0F, 17, 8, 8, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -2F, -2F,0F, -2F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -2F, -2F,0F, -1F, 0F); // Box 52
		barrelModel[8].setRotationPoint(-18F, -36.5F, 12F);

		barrelModel[9].addShapeBox(-14F, -3F, 0F, 10, 7, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F); // Box 53
		barrelModel[9].setRotationPoint(-18F, -36.5F, 12F);

		barrelModel[10].addShapeBox(-14F, -3F, 0F, 10, 7, 8, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 54
		barrelModel[10].setRotationPoint(-18F, -36.5F, -20F);

		barrelModel[11].addShapeBox(-4F, -3F, 0F, 10, 8, 8, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 55
		barrelModel[11].setRotationPoint(-18F, -36.5F, -20F);

		barrelModel[12].addShapeBox(6F, -3F, 0F, 17, 8, 8, 0F,0F, -2F, 0F,0F, -2F, -2F,0F, -1F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -2F, -2F,0F, -3F, 0F,0F, 0F, 0F); // Box 56
		barrelModel[12].setRotationPoint(-18F, -36.5F, -20F);

		barrelModel[13].addShapeBox(23F, -1F, 0.5F, 1, 2, 2, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F); // Box 57
		barrelModel[13].setRotationPoint(-18F, -36.5F, 12F);

		barrelModel[14].addShapeBox(23F, 0F, 3.5F, 1, 2, 2, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F); // Box 58
		barrelModel[14].setRotationPoint(-18F, -36.5F, 12F);

		barrelModel[15].addShapeBox(23F, 0F, 2.5F, 1, 2, 2, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F); // Box 59
		barrelModel[15].setRotationPoint(-18F, -36.5F, -20F);

		barrelModel[16].addShapeBox(23F, -1F, 5.5F, 1, 2, 2, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F); // Box 60
		barrelModel[16].setRotationPoint(-18F, -36.5F, -20F);


		leftTrackModel = new ModelRendererTurbo[27];
		leftTrackModel[0] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import ImportLeftTrack1
		leftTrackModel[1] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import ImportLeftTrack2
		leftTrackModel[2] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Import ImportLeftTrack3
		leftTrackModel[3] = new ModelRendererTurbo(this, 400, 260, textureX, textureY); // Import ImportLeftTrack4
		leftTrackModel[4] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import ImportLeftTrack5
		leftTrackModel[5] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Import ImportLeftTrack6
		leftTrackModel[6] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import ImportLeftTrack7
		leftTrackModel[7] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack8
		leftTrackModel[8] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack9
		leftTrackModel[9] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack11
		leftTrackModel[10] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack13
		leftTrackModel[11] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack14
		leftTrackModel[12] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack15
		leftTrackModel[13] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportLeftTrack16
		leftTrackModel[14] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftTrack17
		leftTrackModel[15] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftTrack18
		leftTrackModel[16] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftTrack19
		leftTrackModel[17] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftTrack20
		leftTrackModel[18] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftTrack21
		leftTrackModel[19] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportLeftTrack22
		leftTrackModel[20] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportLeftTrack23
		leftTrackModel[21] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportLeftTrack24
		leftTrackModel[22] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportLeftTrack25
		leftTrackModel[23] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportLeftTrack26
		leftTrackModel[24] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportLeftTrack27
		leftTrackModel[25] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportLeftTrack28
		leftTrackModel[26] = new ModelRendererTurbo(this, 400, 440, textureX, textureY); // Import ImportLeftTrack29

		leftTrackModel[0].addBox(0F, 0F, 0F, 2, 10, 11, 0F); // Import ImportLeftTrack1
		leftTrackModel[0].setRotationPoint(67F, -9F, 21F);

		leftTrackModel[1].addBox(-2F, 0F, 0F, 2, 16, 11, 0F); // Import ImportLeftTrack2
		leftTrackModel[1].setRotationPoint(69F, 1F, 21.1F);
		leftTrackModel[1].rotateAngleZ = -0.9599311F;

		leftTrackModel[2].addBox(-90F, 0F, 0F, 90, 2, 11, 0F); // Import ImportLeftTrack3
		leftTrackModel[2].setRotationPoint(56F, 8F, 21F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 2, 16, 11, 0F); // Import ImportLeftTrack4
		leftTrackModel[3].setRotationPoint(-55F, -17F, 21F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 2, 24, 11, 0F); // Import ImportLeftTrack5
		leftTrackModel[4].setRotationPoint(-55F, -1F, 21.1F);
		leftTrackModel[4].rotateAngleZ = 1.099557F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack6
		leftTrackModel[5].setRotationPoint(-51F, -11F, 23F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack7
		leftTrackModel[6].setRotationPoint(-51F, -7F, 23F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack8
		leftTrackModel[7].setRotationPoint(-51F, -3F, 23F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack9
		leftTrackModel[8].setRotationPoint(-36F, 4F, 23F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack11
		leftTrackModel[9].setRotationPoint(-20F, 4F, 23F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack13
		leftTrackModel[10].setRotationPoint(-4F, 4F, 23F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack14
		leftTrackModel[11].setRotationPoint(28F, 4F, 23F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack15
		leftTrackModel[12].setRotationPoint(12F, 4F, 23F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportLeftTrack16
		leftTrackModel[13].setRotationPoint(46F, 4F, 23F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack17
		leftTrackModel[14].setRotationPoint(-36F, 0F, 23F);

		leftTrackModel[15].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack18
		leftTrackModel[15].setRotationPoint(-20F, 0F, 23F);

		leftTrackModel[16].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack19
		leftTrackModel[16].setRotationPoint(-4F, 0F, 23F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack20
		leftTrackModel[17].setRotationPoint(12F, 0F, 23F);

		leftTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack21
		leftTrackModel[18].setRotationPoint(28F, 0F, 23F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportLeftTrack22
		leftTrackModel[19].setRotationPoint(46F, 0F, 23F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack23
		leftTrackModel[20].setRotationPoint(-36F, -4F, 23F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack24
		leftTrackModel[21].setRotationPoint(-20F, -4F, 23F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack25
		leftTrackModel[22].setRotationPoint(-4F, -4F, 23F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack26
		leftTrackModel[23].setRotationPoint(12F, -4F, 23F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack27
		leftTrackModel[24].setRotationPoint(28F, -4F, 23F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportLeftTrack28
		leftTrackModel[25].setRotationPoint(46F, -4F, 23F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 101, 21, 3, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportLeftTrack29
		leftTrackModel[26].setRotationPoint(-41F, -17F, 25F);


		rightTrackModel = new ModelRendererTurbo[27];
		rightTrackModel[0] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import ImportRightTrack1
		rightTrackModel[1] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import ImportRightTrack2
		rightTrackModel[2] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Import ImportRightTrack3
		rightTrackModel[3] = new ModelRendererTurbo(this, 400, 260, textureX, textureY); // Import ImportRightTrack4
		rightTrackModel[4] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import ImportRightTrack5
		rightTrackModel[5] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Import ImportRightTrack6
		rightTrackModel[6] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Import ImportRightTrack7
		rightTrackModel[7] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack8
		rightTrackModel[8] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack9
		rightTrackModel[9] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack11
		rightTrackModel[10] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack13
		rightTrackModel[11] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack14
		rightTrackModel[12] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack15
		rightTrackModel[13] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Import ImportRightTrack16
		rightTrackModel[14] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightTrack17
		rightTrackModel[15] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightTrack18
		rightTrackModel[16] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightTrack19
		rightTrackModel[17] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightTrack20
		rightTrackModel[18] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightTrack21
		rightTrackModel[19] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import ImportRightTrack22
		rightTrackModel[20] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportRightTrack23
		rightTrackModel[21] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportRightTrack24
		rightTrackModel[22] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportRightTrack25
		rightTrackModel[23] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportRightTrack26
		rightTrackModel[24] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportRightTrack27
		rightTrackModel[25] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Import ImportRightTrack28
		rightTrackModel[26] = new ModelRendererTurbo(this, 400, 440, textureX, textureY); // Import ImportRightTrack29

		rightTrackModel[0].addBox(0F, 0F, 0F, 2, 10, 11, 0F); // Import ImportRightTrack1
		rightTrackModel[0].setRotationPoint(67F, -9F, -32F);

		rightTrackModel[1].addBox(-2F, 0F, 0F, 2, 16, 11, 0F); // Import ImportRightTrack2
		rightTrackModel[1].setRotationPoint(69F, 1F, -32.1F);
		rightTrackModel[1].rotateAngleZ = -0.9599311F;

		rightTrackModel[2].addBox(-90F, 0F, 0F, 90, 2, 11, 0F); // Import ImportRightTrack3
		rightTrackModel[2].setRotationPoint(56F, 8F, -32F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 2, 16, 11, 0F); // Import ImportRightTrack4
		rightTrackModel[3].setRotationPoint(-55F, -17F, -32F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 2, 24, 11, 0F); // Import ImportRightTrack5
		rightTrackModel[4].setRotationPoint(-55F, -1F, -32.1F);
		rightTrackModel[4].rotateAngleZ = 1.099557F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack6
		rightTrackModel[5].setRotationPoint(-51F, -11F, -30F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack7
		rightTrackModel[6].setRotationPoint(-51F, -7F, -30F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack8
		rightTrackModel[7].setRotationPoint(-51F, -3F, -30F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack9
		rightTrackModel[8].setRotationPoint(-36F, 4F, -30F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack11
		rightTrackModel[9].setRotationPoint(-20F, 4F, -30F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack13
		rightTrackModel[10].setRotationPoint(-4F, 4F, -30F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack14
		rightTrackModel[11].setRotationPoint(28F, 4F, -30F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack15
		rightTrackModel[12].setRotationPoint(12F, 4F, -30F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import ImportRightTrack16
		rightTrackModel[13].setRotationPoint(46F, 4F, -30F);

		rightTrackModel[14].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack17
		rightTrackModel[14].setRotationPoint(-36F, 0F, -30F);

		rightTrackModel[15].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack18
		rightTrackModel[15].setRotationPoint(-20F, 0F, -30F);

		rightTrackModel[16].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack19
		rightTrackModel[16].setRotationPoint(-4F, 0F, -30F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack20
		rightTrackModel[17].setRotationPoint(12F, 0F, -30F);

		rightTrackModel[18].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack21
		rightTrackModel[18].setRotationPoint(28F, 0F, -30F);

		rightTrackModel[19].addBox(0F, 0F, 0F, 12, 4, 7, 0F); // Import ImportRightTrack22
		rightTrackModel[19].setRotationPoint(46F, 0F, -30F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack23
		rightTrackModel[20].setRotationPoint(-36F, -4F, -30F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack24
		rightTrackModel[21].setRotationPoint(-20F, -4F, -30F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack25
		rightTrackModel[22].setRotationPoint(-4F, -4F, -30F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack26
		rightTrackModel[23].setRotationPoint(12F, -4F, -30F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack27
		rightTrackModel[24].setRotationPoint(28F, -4F, -30F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 7, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import ImportRightTrack28
		rightTrackModel[25].setRotationPoint(46F, -4F, -30F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 101, 21, 3, 0F,0F, 0F, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F); // Import ImportRightTrack29
		rightTrackModel[26].setRotationPoint(-41F, -17F, -28F);



		flipAll(); //Call this function to flip everything in X and Y. For correcting old models.
		translateAll(0, -3, 0);
	}
}