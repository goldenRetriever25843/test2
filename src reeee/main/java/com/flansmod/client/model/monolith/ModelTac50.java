//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTac50 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelTac50() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[59];
		gunModel[0] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun1
		gunModel[1] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun10
		gunModel[2] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun11
		gunModel[3] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun12
		gunModel[4] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun13
		gunModel[5] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun14
		gunModel[6] = new ModelRendererTurbo(this, 5, 21, textureX, textureY); // Gun15
		gunModel[7] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun16
		gunModel[8] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun17
		gunModel[9] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun18
		gunModel[10] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun19
		gunModel[11] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun20
		gunModel[12] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun21
		gunModel[13] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Gun23
		gunModel[14] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun24
		gunModel[15] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun25
		gunModel[16] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun26
		gunModel[17] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun27
		gunModel[18] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun28
		gunModel[19] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun29
		gunModel[20] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun30
		gunModel[21] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun31
		gunModel[22] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun32
		gunModel[23] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun33
		gunModel[24] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun34
		gunModel[25] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun35
		gunModel[26] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun36
		gunModel[27] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun37
		gunModel[28] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun38
		gunModel[29] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun39
		gunModel[30] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun40
		gunModel[31] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun41
		gunModel[32] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun42
		gunModel[33] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun43
		gunModel[34] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun44
		gunModel[35] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun45
		gunModel[36] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Gun48
		gunModel[37] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun49
		gunModel[38] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun5
		gunModel[39] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun50
		gunModel[40] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun51
		gunModel[41] = new ModelRendererTurbo(this, 5, 122, textureX, textureY); // Gun52
		gunModel[42] = new ModelRendererTurbo(this, 5, 122, textureX, textureY); // Gun53
		gunModel[43] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun54
		gunModel[44] = new ModelRendererTurbo(this, 2, 106, textureX, textureY); // Gun55
		gunModel[45] = new ModelRendererTurbo(this, 2, 101, textureX, textureY); // Gun56
		gunModel[46] = new ModelRendererTurbo(this, 2, 113, textureX, textureY); // Gun57
		gunModel[47] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun58
		gunModel[48] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun6
		gunModel[49] = new ModelRendererTurbo(this, 66, 67, textureX, textureY); // Gun60
		gunModel[50] = new ModelRendererTurbo(this, 23, 35, textureX, textureY); // Gun62
		gunModel[51] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Gun63
		gunModel[52] = new ModelRendererTurbo(this, 65, 60, textureX, textureY); // Gun65
		gunModel[53] = new ModelRendererTurbo(this, 65, 60, textureX, textureY); // Gun66
		gunModel[54] = new ModelRendererTurbo(this, 5, 59, textureX, textureY); // Gun67
		gunModel[55] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun7
		gunModel[56] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun8
		gunModel[57] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Gun9
		gunModel[58] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock8

		gunModel[0].addShapeBox(-2.5F, 3F, 1F, 4, 1, 1, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.8F, 0F, -.2F, -.5F, 0F, -.2F); // Gun1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(-2F, -9F, -1F, 2, 3, 1, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F); // Gun10
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-2F, -6F, -1F, 2, 2, 1, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Gun11
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(4F, -7.5F, 0F, 1, 1, 1, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F); // Gun12
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(4F, -4F, 0F, 6, 1, 1, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -1F, -.5F, .3F, -1F, -.5F, .3F, -1F, -.5F, .3F, -1F, -.5F, .3F); // Gun13
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(0F, -8F, -1F, 2, 4, 3, 0F); // Gun14
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(-1F, -12F, -1.5F, 12, 4, 4, 0F); // Gun15
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(4F, -4.5F, 0F, 1, 1, 1, 0F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F); // Gun16
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(4F, -6.5F, 0F, 1, 2, 1, 0F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F); // Gun17
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(9F, -7.5F, 0F, 1, 1, 1, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F); // Gun18
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(4F, -8F, 0F, 7, 1, 1, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F); // Gun19
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(9F, -7F, 0F, 1, 2, 1, 0F, -.5F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, -.5F, -.5F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F); // Gun20
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(9F, -5F, 0F, 1, 1, 1, 0F, -.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Gun21
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(9.5F, -8F, 0F, 1, 4, 1, 0F, -.5F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, -.5F, -.5F, .3F, -.5F, 0F, .3F, 0F, -1F, .3F, 0F, -1F, .3F, -.5F, 0F, .3F); // Gun23
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(2F, -8F, -1F, 2, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F); // Gun24
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-2F, -4F, 0F, 4, 3, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun25
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addBox(-4F, -11F, -1.5F, 3, 2, 4, 0F); // Gun26
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(-2F, -9F, -1.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Gun27
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(-2F, -12F, -1.5F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun28
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-4F, -12F, -1.5F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun29
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-4F, -9F, -1.5F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Gun30
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addBox(11F, -12F, -1.5F, 16, 4, 4, 0F); // Gun31
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(7F, -8F, -1.5F, 4, 1, 4, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -.5F); // Gun32
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(7F, -13F, -1.5F, 39, 1, 4, 0F); // Gun33
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(-2F, -13F, -1.5F, 1, 1, 4, 0F, 0F, -1F, -1F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Gun34
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(-2.5F, -1F, 0F, 4, 4, 1, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F); // Gun35
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(-2F, -4F, 1F, 4, 3, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Gun36
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(11F, -8F, -1.5F, 16, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F); // Gun37
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(-2.5F, -1F, 1F, 4, 4, 1, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F); // Gun38
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(7F, -15F, -1.4F, 3, 2, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Gun39
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(-2F, -4F, -1F, 4, 3, 1, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun40
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(7F, -16F, -1F, 3, 1, 3, 0F, .2F, 0F, -.4F, .2F, 0F, -.4F, .2F, 0F, -.4F, .2F, 0F, -.4F, .2F, 0F, .4F, .2F, 0F, .4F, .2F, 0F, .4F, .2F, 0F, .4F); // Gun41
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(7F, -15F, 1.4F, 3, 2, 1, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Gun42
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(23F, -15F, -1.4F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun43
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(23F, -16F, -1F, 9, 1, 3, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F); // Gun44
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(10F, -15F, 1.4F, 22, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun45
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(10F, -16F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F, .4F); // Gun48
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(27F, -12F, -1.5F, 19, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F); // Gun49
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addShapeBox(-2.5F, 3F, -1F, 4, 1, 1, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, -.2F, -.8F, 0F, -.2F, .2F, 0F, 0F, 0F, 0F, 0F); // Gun5
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addShapeBox(-2.5F, -1F, -1F, 4, 4, 1, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F); // Gun50
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addShapeBox(27F, -8F, -1.5F, 19, 1, 4, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.3F, -.5F, 0F, 0F, 0F); // Gun51
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addShapeBox(32F, -16F, -1F, 8, 1, 3, 0F, 0F, 0F, -.4F, 0F, -1.5F, -.6F, 0F, -1.5F, -.6F, 0F, 0F, -.4F, 0F, 0F, .4F, 0F, 1F, -.2F, 0F, 1F, -.2F, 0F, 0F, .4F); // Gun52
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(32F, -14F, -1F, 8, 1, 3, 0F, 0F, 1F, .4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 1F, .4F, 0F, 0F, .4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, .4F); // Gun53
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addShapeBox(-1F, -14F, 1.5F, 8, 2, 1, 0F, 0F, -1.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun54
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(40F, -14.2F, -0.5F, 55, 2, 2, 0F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // Gun55
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(40F, -15F, -0.5F, 55, 1, 2, 0F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Gun56
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addShapeBox(40F, -12.4F, -0.5F, 55, 1, 2, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F); // Gun57
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addShapeBox(-2.5F, 3F, 0F, 4, 1, 1, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Gun58
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addShapeBox(-2F, -6F, 0F, 2, 2, 1, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Gun6
		gunModel[48].setRotationPoint(0F, 0F, 0F);

		gunModel[49].addShapeBox(5.5F, -13.6F, -6F, 1, 1, 1, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Gun60
		gunModel[49].setRotationPoint(0F, 0F, 0F);
		gunModel[49].rotateAngleX = -0.40142573F;

		gunModel[50].addShapeBox(6F, -14F, -1.5F, 1, 2, 1, 0F, 0F, -1.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun62
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(-1F, -14F, -1.5F, 6, 2, 1, 0F, 0F, -1.7F, 0F, .6F, -1.1F, 0F, .6F, -1.1F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, .6F, 0F, 0F, 0F, 0F, 0F); // Gun63
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(5.5F, -2.4F, -11.99F, 1, 1, 1, 0F, -.1F, -.45F, -.1F, -.1F, -.45F, -.1F, -.1F, -.45F, -.1F, -.1F, -.45F, -.1F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, 0F); // Gun65
		gunModel[52].setRotationPoint(0F, 0F, 0F);
		gunModel[52].rotateAngleX = -1.04719755F;

		gunModel[53].addShapeBox(5.5F, -1.5F, -11.99F, 1, 1, 1, 0F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, 0F, 0F, -.45F, 0F, -.1F, -.45F, -.1F, -.1F, -.45F, -.1F, -.1F, -.45F, -.1F, -.1F, -.45F, -.1F); // Gun66
		gunModel[53].setRotationPoint(0F, 0F, 0F);
		gunModel[53].rotateAngleX = -1.04719755F;

		gunModel[54].addShapeBox(7F, -17F, 0F, 15, 1, 1, 0F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, -.3F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Gun67
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(-2F, -9F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F); // Gun7
		gunModel[55].setRotationPoint(0F, 0F, 0F);

		gunModel[56].addShapeBox(-2F, -9F, 1F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F); // Gun8
		gunModel[56].setRotationPoint(0F, 0F, 0F);

		gunModel[57].addShapeBox(-2F, -6F, 1F, 2, 2, 1, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Gun9
		gunModel[57].setRotationPoint(0F, 0F, 0F);

		gunModel[58].addShapeBox(-15F, -9F, -1.5F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Stock8
		gunModel[58].setRotationPoint(0F, 0F, 0F);


		defaultBarrelModel = new ModelRendererTurbo[6];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 44, 89, textureX, textureY); // Barrel1
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 21, 89, textureX, textureY); // Barrel2
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Barrel3
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Barrel4
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Barrel6
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Barrel5

		defaultBarrelModel[0].addShapeBox(95F, -14.7F, -0.5F, 2, 3, 2, 0F, 0F, -.2F, .3F, 0F, -.2F, 1.3F, 0F, -.2F, 1.3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, 1.3F, 0F, -.2F, 1.3F, 0F, -.2F, .3F); // Barrel1
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[1].addShapeBox(97F, -14.7F, -1.5F, 5, 3, 4, 0F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // Barrel2
		defaultBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[2].addShapeBox(102F, -14.7F, -1.5F, 1, 1, 4, 0F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // Barrel3
		defaultBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[3].addShapeBox(102F, -12.7F, -1.5F, 1, 1, 4, 0F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // Barrel4
		defaultBarrelModel[3].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[4].addShapeBox(102F, -14.7F, -1.5F, 1, 3, 1, 0F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // Barrel6
		defaultBarrelModel[4].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[5].addShapeBox(102F, -14.7F, 1.5F, 1, 3, 1, 0F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // Barrel5
		defaultBarrelModel[5].setRotationPoint(0F, 0F, 0F);


		defaultScopeModel = new ModelRendererTurbo[41];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 97, 43, textureX, textureY); // Scope1
		defaultScopeModel[1] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope10
		defaultScopeModel[2] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope12
		defaultScopeModel[3] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope13
		defaultScopeModel[4] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope14
		defaultScopeModel[5] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope15
		defaultScopeModel[6] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope16
		defaultScopeModel[7] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope17
		defaultScopeModel[8] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope18
		defaultScopeModel[9] = new ModelRendererTurbo(this, 66, 48, textureX, textureY); // Scope19
		defaultScopeModel[10] = new ModelRendererTurbo(this, 107, 43, textureX, textureY); // Scope2
		defaultScopeModel[11] = new ModelRendererTurbo(this, 66, 43, textureX, textureY); // Scope20
		defaultScopeModel[12] = new ModelRendererTurbo(this, 54, 45, textureX, textureY); // Scope21
		defaultScopeModel[13] = new ModelRendererTurbo(this, 53, 40, textureX, textureY); // Scope22
		defaultScopeModel[14] = new ModelRendererTurbo(this, 53, 40, textureX, textureY); // Scope23
		defaultScopeModel[15] = new ModelRendererTurbo(this, 53, 40, textureX, textureY); // Scope24
		defaultScopeModel[16] = new ModelRendererTurbo(this, 53, 40, textureX, textureY); // Scope25
		defaultScopeModel[17] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope26
		defaultScopeModel[18] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope27
		defaultScopeModel[19] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope28
		defaultScopeModel[20] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope29
		defaultScopeModel[21] = new ModelRendererTurbo(this, 117, 43, textureX, textureY); // Scope3
		defaultScopeModel[22] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope30
		defaultScopeModel[23] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope31
		defaultScopeModel[24] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope32
		defaultScopeModel[25] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope33
		defaultScopeModel[26] = new ModelRendererTurbo(this, 74, 50, textureX, textureY); // Scope34
		defaultScopeModel[27] = new ModelRendererTurbo(this, 74, 50, textureX, textureY); // Scope35
		defaultScopeModel[28] = new ModelRendererTurbo(this, 74, 50, textureX, textureY); // Scope36
		defaultScopeModel[29] = new ModelRendererTurbo(this, 98, 51, textureX, textureY); // Scope37
		defaultScopeModel[30] = new ModelRendererTurbo(this, 98, 60, textureX, textureY); // Scope38
		defaultScopeModel[31] = new ModelRendererTurbo(this, 98, 69, textureX, textureY); // Scope39
		defaultScopeModel[32] = new ModelRendererTurbo(this, 76, 43, textureX, textureY); // Scope4
		defaultScopeModel[33] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope40
		defaultScopeModel[34] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope41
		defaultScopeModel[35] = new ModelRendererTurbo(this, 61, 39, textureX, textureY); // Scope42
		defaultScopeModel[36] = new ModelRendererTurbo(this, 76, 43, textureX, textureY); // Scope5
		defaultScopeModel[37] = new ModelRendererTurbo(this, 76, 43, textureX, textureY); // Scope6
		defaultScopeModel[38] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope7
		defaultScopeModel[39] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope8
		defaultScopeModel[40] = new ModelRendererTurbo(this, 77, 39, textureX, textureY); // Scope9

		defaultScopeModel[0].addShapeBox(-1.8F, -20.2F, -1F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope1
		defaultScopeModel[0].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[1].addShapeBox(6.2F, -20.2F, -0.5F, 18, 1, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope10
		defaultScopeModel[1].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[2].addShapeBox(6.2F, -19.2F, -0.5F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope12
		defaultScopeModel[2].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[3].addShapeBox(6.2F, -18.2F, -0.5F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Scope13
		defaultScopeModel[3].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[4].addShapeBox(8F, -20.2F, -0.5F, 1, 1, 2, 0F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Scope14
		defaultScopeModel[4].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[5].addShapeBox(8F, -19.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Scope15
		defaultScopeModel[5].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[6].addShapeBox(8F, -18.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -.1F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F); // Scope16
		defaultScopeModel[6].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[7].addShapeBox(8F, -19.2F, 0F, 1, 2, 1, 0F, 0F, -.5F, .15F, 0F, -.5F, .15F, 0F, -.5F, .15F, 0F, -.5F, .15F, 0F, 0F, .15F, 0F, 0F, .15F, 0F, 0F, .15F, 0F, 0F, .15F); // Scope17
		defaultScopeModel[7].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[8].addShapeBox(8F, -17.5F, -1.5F, 1, 1, 2, 0F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F); // Scope18
		defaultScopeModel[8].setRotationPoint(0F, 0F, 1F);

		defaultScopeModel[9].addShapeBox(13.5F, -21.8F, 0F, 1, 2, 1, 0F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F); // Scope19
		defaultScopeModel[9].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[10].addBox(-1.8F, -19.2F, -1F, 1, 1, 3, 0F); // Scope2
		defaultScopeModel[10].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[11].addShapeBox(13.5F, -21.8F, 0F, 1, 1, 1, 0F, .4F, -.2F, .4F, .4F, -.2F, .4F, .4F, -.2F, .4F, .4F, -.2F, .4F, .4F, -.2F, .4F, .4F, -.2F, .4F, .4F, -.2F, .4F, .4F, -.2F, .4F); // Scope20
		defaultScopeModel[11].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[12].addShapeBox(13.5F, -19.2F, -1.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope21
		defaultScopeModel[12].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[13].addShapeBox(13.5F, -19.7F, -2F, 1, 1, 1, 0F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F); // Scope22
		defaultScopeModel[13].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[14].addShapeBox(13.5F, -18.7F, -2F, 1, 1, 1, 0F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Scope23
		defaultScopeModel[14].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[15].addShapeBox(13.5F, -18.7F, 2F, 1, 1, 1, 0F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Scope24
		defaultScopeModel[15].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[16].addShapeBox(13.5F, -19.7F, 2F, 1, 1, 1, 0F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F); // Scope25
		defaultScopeModel[16].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[17].addShapeBox(20F, -20.2F, -0.5F, 1, 1, 2, 0F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Scope26
		defaultScopeModel[17].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[18].addShapeBox(20F, -19.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Scope27
		defaultScopeModel[18].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[19].addShapeBox(20F, -18.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -.1F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F); // Scope28
		defaultScopeModel[19].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[20].addShapeBox(20F, -19.2F, 0F, 1, 2, 1, 0F, 0F, -.5F, .15F, 0F, -.5F, .15F, 0F, -.5F, .15F, 0F, -.5F, .15F, 0F, 0F, .15F, 0F, 0F, .15F, 0F, 0F, .15F, 0F, 0F, .15F); // Scope29
		defaultScopeModel[20].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[21].addShapeBox(-1.8F, -18.2F, -1F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Scope3
		defaultScopeModel[21].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[22].addShapeBox(20F, -17.5F, -1.5F, 1, 1, 2, 0F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F, 0F, -.1F, -.25F); // Scope30
		defaultScopeModel[22].setRotationPoint(0F, 0F, 1F);

		defaultScopeModel[23].addShapeBox(24.2F, -20.2F, -0.5F, 8, 1, 2, 0F, 0F, -.5F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, 0F, 0F); // Scope31
		defaultScopeModel[23].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[24].addShapeBox(24.2F, -19.2F, -0.5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, 0F, 0F); // Scope32
		defaultScopeModel[24].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[25].addShapeBox(24.2F, -18.2F, -0.5F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, -.5F); // Scope33
		defaultScopeModel[25].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[26].addShapeBox(32.2F, -20.7F, -1.5F, 7, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope34
		defaultScopeModel[26].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[27].addBox(32.2F, -19.7F, -1.5F, 7, 2, 4, 0F); // Scope35
		defaultScopeModel[27].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[28].addShapeBox(32.2F, -17.7F, -1.5F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Scope36
		defaultScopeModel[28].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[29].addShapeBox(39.2F, -20.7F, -1.5F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope37
		defaultScopeModel[29].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[30].addBox(39.2F, -19.7F, -1.5F, 1, 2, 4, 0F); // Scope38
		defaultScopeModel[30].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[31].addShapeBox(39.2F, -17.7F, -1.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Scope39
		defaultScopeModel[31].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[32].addShapeBox(-0.8F, -20.2F, -1F, 6, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Scope4
		defaultScopeModel[32].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[33].addShapeBox(12F, -19.2F, -0.5F, 4, 1, 2, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Scope40
		defaultScopeModel[33].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[34].addShapeBox(12F, -20.2F, -0.5F, 4, 1, 2, 0F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Scope41
		defaultScopeModel[34].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[35].addShapeBox(12F, -18.2F, -0.5F, 4, 1, 2, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -.1F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F); // Scope42
		defaultScopeModel[35].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[36].addBox(-0.8F, -19.2F, -1F, 6, 1, 3, 0F); // Scope5
		defaultScopeModel[36].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[37].addShapeBox(-0.8F, -18.2F, -1F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Scope6
		defaultScopeModel[37].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[38].addShapeBox(5.2F, -20.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Scope7
		defaultScopeModel[38].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[39].addShapeBox(5.2F, -19.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Scope8
		defaultScopeModel[39].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[40].addShapeBox(5.2F, -18.2F, -0.5F, 1, 1, 2, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F); // Scope9
		defaultScopeModel[40].setRotationPoint(0F, 0F, 0F);


		defaultStockModel = new ModelRendererTurbo[21];
		defaultStockModel[0] = new ModelRendererTurbo(this, 59, 23, textureX, textureY); // Stock1
		defaultStockModel[1] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock10
		defaultStockModel[2] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock11
		defaultStockModel[3] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock13
		defaultStockModel[4] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock14
		defaultStockModel[5] = new ModelRendererTurbo(this, 71, 9, textureX, textureY); // Stock15
		defaultStockModel[6] = new ModelRendererTurbo(this, 71, 9, textureX, textureY); // Stock16
		defaultStockModel[7] = new ModelRendererTurbo(this, 71, 9, textureX, textureY); // Stock17
		defaultStockModel[8] = new ModelRendererTurbo(this, 71, 9, textureX, textureY); // Stock18
		defaultStockModel[9] = new ModelRendererTurbo(this, 71, 9, textureX, textureY); // Stock19
		defaultStockModel[10] = new ModelRendererTurbo(this, 59, 23, textureX, textureY); // Stock2
		defaultStockModel[11] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock20
		defaultStockModel[12] = new ModelRendererTurbo(this, 47, 4, textureX, textureY); // Stock21
		defaultStockModel[13] = new ModelRendererTurbo(this, 47, 4, textureX, textureY); // Stock22
		defaultStockModel[14] = new ModelRendererTurbo(this, 47, 4, textureX, textureY); // Stock23
		defaultStockModel[15] = new ModelRendererTurbo(this, 59, 23, textureX, textureY); // Stock3
		defaultStockModel[16] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Stock4
		defaultStockModel[17] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Stock5
		defaultStockModel[18] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Stock6
		defaultStockModel[19] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock7
		defaultStockModel[20] = new ModelRendererTurbo(this, 103, 11, textureX, textureY); // Stock9

		defaultStockModel[0].addShapeBox(-10F, -12.1F, -1.5F, 6, 1, 4, 0F, 0F, .1F, -.9F, 0F, .1F, -.9F, 0F, .1F, -.9F, 0F, .1F, -.9F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Stock1
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[1].addShapeBox(-15F, -8F, -1.5F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F); // Stock10
		defaultStockModel[1].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[2].addShapeBox(-18F, -8F, -1.5F, 3, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Stock11
		defaultStockModel[2].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[3].addShapeBox(-18F, -2F, -1.5F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Stock13
		defaultStockModel[3].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[4].addBox(-22F, -11F, -1.5F, 4, 13, 4, 0F); // Stock14
		defaultStockModel[4].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[5].addShapeBox(-22F, -14.5F, -2F, 9, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Stock15
		defaultStockModel[5].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[6].addBox(-22F, -13.5F, -2F, 9, 4, 5, 0F); // Stock16
		defaultStockModel[6].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[7].addShapeBox(-22F, -9.5F, -2F, 9, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Stock17
		defaultStockModel[7].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[8].addShapeBox(-13F, -12.5F, -2.3F, 2, 4, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, -.2F, -.3F, -.5F, -.2F, -.3F, 0F, 0F, -.3F); // Stock18
		defaultStockModel[8].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[9].addShapeBox(-13F, -12.5F, 2.3F, 2, 4, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, -.2F, -.3F, -.5F, -.2F, -.3F, 0F, 0F, -.3F); // Stock19
		defaultStockModel[9].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[10].addShapeBox(-10F, -11F, -1.5F, 6, 2, 4, 0F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Stock2
		defaultStockModel[10].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[11].addShapeBox(-18F, 1F, -1.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Stock20
		defaultStockModel[11].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[12].addShapeBox(-26F, -12F, -1.5F, 4, 1, 4, 0F, .5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, .5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Stock21
		defaultStockModel[12].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[13].addBox(-26F, -11F, -1.5F, 4, 10, 4, 0F); // Stock22
		defaultStockModel[13].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[14].addShapeBox(-26F, -1F, -1.5F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, .5F, 0F, -1F); // Stock23
		defaultStockModel[14].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[15].addShapeBox(-10F, -8.9F, -1.5F, 6, 1, 4, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .1F, -.9F, 0F, .1F, -.9F, 0F, .1F, -.9F, 0F, .1F, -.9F); // Stock3
		defaultStockModel[15].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[16].addShapeBox(-13F, -12F, -1.5F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Stock4
		defaultStockModel[16].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[17].addBox(-13F, -11F, -1.5F, 3, 2, 4, 0F); // Stock5
		defaultStockModel[17].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[18].addShapeBox(-13F, -9F, -1.5F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Stock6
		defaultStockModel[18].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[19].addShapeBox(-14F, -9F, -1.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Stock7
		defaultStockModel[19].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[20].addShapeBox(-18F, -9F, -1.5F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Stock9
		defaultStockModel[20].setRotationPoint(0F, 0F, 0F);


		defaultGripModel = new ModelRendererTurbo[15];
		defaultGripModel[0] = new ModelRendererTurbo(this, 42, 76, textureX, textureY); // Grip1
		defaultGripModel[1] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Grip2
		defaultGripModel[2] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Grip3
		defaultGripModel[3] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Grip4
		defaultGripModel[4] = new ModelRendererTurbo(this, 68, 73, textureX, textureY); // Grip5
		defaultGripModel[5] = new ModelRendererTurbo(this, 67, 78, textureX, textureY); // Grip6
		defaultGripModel[6] = new ModelRendererTurbo(this, 67, 78, textureX, textureY); // Grip7
		defaultGripModel[7] = new ModelRendererTurbo(this, 67, 78, textureX, textureY); // Grip8
		defaultGripModel[8] = new ModelRendererTurbo(this, 67, 78, textureX, textureY); // Grip9
		defaultGripModel[9] = new ModelRendererTurbo(this, 67, 78, textureX, textureY); // Grip10
		defaultGripModel[10] = new ModelRendererTurbo(this, 67, 78, textureX, textureY); // Grip11
		defaultGripModel[11] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Grip12
		defaultGripModel[12] = new ModelRendererTurbo(this, 68, 73, textureX, textureY); // Grip13
		defaultGripModel[13] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Grip14
		defaultGripModel[14] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Grip15

		defaultGripModel[0].addBox(46F, -11F, -0.5F, 4, 2, 2, 0F); // Grip1
		defaultGripModel[0].setRotationPoint(0F, 0F, 0F);

		defaultGripModel[1].addShapeBox(48F, -9.7F, 4.5F, 1, 24, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Grip2
		defaultGripModel[1].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[1].rotateAngleX = 0.34906585F;

		defaultGripModel[2].addShapeBox(49F, -7.6F, 4.5F, 2, 5, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -1F, -.3F, 0F, -2.5F, -.3F, 0F, -2.5F, -.3F, 0F, -1F, -.3F); // Grip3
		defaultGripModel[2].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[2].rotateAngleX = 0.34906585F;

		defaultGripModel[3].addShapeBox(51F, -7.6F, 4.5F, 1, 3, 1, 0F, 0F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.2F, -2.5F, -.3F, -.2F, -2.5F, -.3F, 0F, -.5F, -.3F); // Grip4
		defaultGripModel[3].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[3].rotateAngleX = 0.34906585F;

		defaultGripModel[4].addShapeBox(48F, -1.7F, 4.5F, 1, 1, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Grip5
		defaultGripModel[4].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[4].rotateAngleX = 0.34906585F;

		defaultGripModel[5].addShapeBox(47F, 14.3F, 4.5F, 2, 1, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Grip6
		defaultGripModel[5].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[5].rotateAngleX = 0.34906585F;

		defaultGripModel[6].addShapeBox(45F, 14.3F, 4.5F, 2, 1, 1, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Grip7
		defaultGripModel[6].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[6].rotateAngleX = 0.34906585F;

		defaultGripModel[7].addShapeBox(44F, 14.3F, 4.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Grip8
		defaultGripModel[7].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[7].rotateAngleX = 0.34906585F;

		defaultGripModel[8].addShapeBox(47F, 14F, -4.5F, 2, 1, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Grip9
		defaultGripModel[8].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[8].rotateAngleX = -0.34906585F;

		defaultGripModel[9].addShapeBox(45F, 14F, -4.5F, 2, 1, 1, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Grip10
		defaultGripModel[9].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[9].rotateAngleX = -0.34906585F;

		defaultGripModel[10].addShapeBox(44F, 14F, -4.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Grip11
		defaultGripModel[10].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[10].rotateAngleX = -0.34906585F;

		defaultGripModel[11].addShapeBox(48F, -10F, -4.5F, 1, 24, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Grip12
		defaultGripModel[11].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[11].rotateAngleX = -0.34906585F;

		defaultGripModel[12].addShapeBox(48F, -2F, -4.5F, 1, 1, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Grip13
		defaultGripModel[12].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[12].rotateAngleX = -0.34906585F;

		defaultGripModel[13].addShapeBox(49F, -8F, -4.5F, 2, 5, 1, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -1F, -.3F, 0F, -2.5F, -.3F, 0F, -2.5F, -.3F, 0F, -1F, -.3F); // Grip14
		defaultGripModel[13].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[13].rotateAngleX = -0.34906585F;

		defaultGripModel[14].addShapeBox(51F, -8F, -4.5F, 1, 3, 1, 0F, 0F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.2F, -2.5F, -.3F, -.2F, -2.5F, -.3F, 0F, -.5F, -.3F); // Grip15
		defaultGripModel[14].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[14].rotateAngleX = -0.34906585F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 7, 74, textureX, textureY); // xAmmo1
		ammoModel[1] = new ModelRendererTurbo(this, 7, 82, textureX, textureY); // xAmmo2

		ammoModel[0].addShapeBox(11F, -7F, -0.5F, 13, 4, 2, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -2F, .3F, 0F, -2F, .3F, 0F, 0F, .3F); // xAmmo1
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addShapeBox(11F, -3F, -0.5F, 13, 1, 2, 0F, .2F, 0F, .6F, .2F, 2F, .6F, .2F, 2F, .6F, .2F, 0F, .6F, .1F, 0F, .6F, .3F, -2F, .6F, .3F, -2F, .6F, .1F, 0F, .6F); // xAmmo2
		ammoModel[1].setRotationPoint(0F, 0F, 0F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 24, 45, textureX, textureY); // Gun2
		slideModel[1] = new ModelRendererTurbo(this, 24, 45, textureX, textureY); // Gun3
		slideModel[2] = new ModelRendererTurbo(this, 24, 45, textureX, textureY); // Gun4

		slideModel[0].addShapeBox(6F, -7.5F, 0F, 1, 2, 1, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, .5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, .5F, -1F, 0F); // Gun2
		slideModel[0].setRotationPoint(0F, 0F, 0F);

		slideModel[1].addShapeBox(5.5F, -6.5F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.1F, -.5F, -1F, -.1F, -.5F, -1F, -.1F, 0F, -1F, -.1F); // Gun3
		slideModel[1].setRotationPoint(0F, 0F, 0F);

		slideModel[2].addShapeBox(5.5F, -5.5F, 0F, 1, 2, 1, 0F, 0F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, 0F, 0F, -.1F, -.7F, -.8F, -.2F, -.2F, -1.2F, -.2F, -.2F, -1.2F, -.2F, -.7F, -.8F, -.2F); // Gun4
		slideModel[2].setRotationPoint(0F, 0F, 0F);


		pumpModel = new ModelRendererTurbo[5];
		pumpModel[0] = new ModelRendererTurbo(this, 4, 65, textureX, textureY); // Gun46
		pumpModel[1] = new ModelRendererTurbo(this, 53, 65, textureX, textureY); // Gun47
		pumpModel[2] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Gun59
		pumpModel[3] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Gun61
		pumpModel[4] = new ModelRendererTurbo(this, 65, 60, textureX, textureY); // Gun64

		pumpModel[0].addShapeBox(5F, -16.1F, -1.5F, 18, 4, 4, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Gun46
		pumpModel[0].setRotationPoint(0F, 0F, 0F);

		pumpModel[1].addShapeBox(3F, -15.1F, -1F, 2, 2, 2, 0F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F); // Gun47
		pumpModel[1].setRotationPoint(0F, 0F, 0.5F);

		pumpModel[2].addShapeBox(5.5F, -13.6F, -6.8F, 1, 3, 1, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Gun59
		pumpModel[2].setRotationPoint(0F, 0F, 0F);
		pumpModel[2].rotateAngleX = -0.40142573F;

		pumpModel[3].addShapeBox(5.5F, -4.92F, -11.99F, 1, 3, 1, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Gun61
		pumpModel[3].setRotationPoint(0F, 0F, 0F);
		pumpModel[3].rotateAngleX = -1.04719755F;

		pumpModel[4].addShapeBox(5.5F, -1.95F, -11.99F, 1, 1, 1, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F); // Gun64
		pumpModel[4].setRotationPoint(0F, 0F, 0F);
		pumpModel[4].rotateAngleX = -1.04719755F;

		gunSlideDistance = 0.2F;
		pumpDelayAfterReload = 65;
		pumpDelay = 8;
		pumpTime = 15;
		
		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}