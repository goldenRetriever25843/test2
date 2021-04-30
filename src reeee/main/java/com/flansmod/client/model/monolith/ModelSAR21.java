//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSAR21 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSAR21() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[66];
		gunModel[0] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Gun1
		gunModel[1] = new ModelRendererTurbo(this, 18, 7, textureX, textureY); // Gun10
		gunModel[2] = new ModelRendererTurbo(this, 13, 10, textureX, textureY); // Gun11
		gunModel[3] = new ModelRendererTurbo(this, 13, 7, textureX, textureY); // Gun12
		gunModel[4] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Gun13
		gunModel[5] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Gun14
		gunModel[6] = new ModelRendererTurbo(this, 18, 32, textureX, textureY); // Gun15
		gunModel[7] = new ModelRendererTurbo(this, 18, 32, textureX, textureY); // Gun16
		gunModel[8] = new ModelRendererTurbo(this, 18, 28, textureX, textureY); // Gun17
		gunModel[9] = new ModelRendererTurbo(this, 18, 28, textureX, textureY); // Gun18
		gunModel[10] = new ModelRendererTurbo(this, 18, 28, textureX, textureY); // Gun19
		gunModel[11] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Gun2
		gunModel[12] = new ModelRendererTurbo(this, 18, 28, textureX, textureY); // Gun20
		gunModel[13] = new ModelRendererTurbo(this, 18, 28, textureX, textureY); // Gun21
		gunModel[14] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Gun22
		gunModel[15] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Gun23
		gunModel[16] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Gun24
		gunModel[17] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Gun25
		gunModel[18] = new ModelRendererTurbo(this, 25, 30, textureX, textureY); // Gun26
		gunModel[19] = new ModelRendererTurbo(this, 25, 35, textureX, textureY); // Gun27
		gunModel[20] = new ModelRendererTurbo(this, 33, 30, textureX, textureY); // Gun28
		gunModel[21] = new ModelRendererTurbo(this, 33, 38, textureX, textureY); // Gun29
		gunModel[22] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Gun3
		gunModel[23] = new ModelRendererTurbo(this, 33, 42, textureX, textureY); // Gun30
		gunModel[24] = new ModelRendererTurbo(this, 33, 46, textureX, textureY); // Gun31
		gunModel[25] = new ModelRendererTurbo(this, 41, 34, textureX, textureY); // Gun32
		gunModel[26] = new ModelRendererTurbo(this, 41, 39, textureX, textureY); // Gun33
		gunModel[27] = new ModelRendererTurbo(this, 41, 44, textureX, textureY); // Gun34
		gunModel[28] = new ModelRendererTurbo(this, 45, 26, textureX, textureY); // Gun35
		gunModel[29] = new ModelRendererTurbo(this, 45, 26, textureX, textureY); // Gun36
		gunModel[30] = new ModelRendererTurbo(this, 45, 29, textureX, textureY); // Gun37
		gunModel[31] = new ModelRendererTurbo(this, 51, 29, textureX, textureY); // Gun38
		gunModel[32] = new ModelRendererTurbo(this, 40, 52, textureX, textureY); // Gun39
		gunModel[33] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Gun4
		gunModel[34] = new ModelRendererTurbo(this, 40, 49, textureX, textureY); // Gun40
		gunModel[35] = new ModelRendererTurbo(this, 34, 53, textureX, textureY); // Gun41
		gunModel[36] = new ModelRendererTurbo(this, 34, 50, textureX, textureY); // Gun42
		gunModel[37] = new ModelRendererTurbo(this, 61, 8, textureX, textureY); // Gun43
		gunModel[38] = new ModelRendererTurbo(this, 61, 11, textureX, textureY); // Gun44
		gunModel[39] = new ModelRendererTurbo(this, 77, 14, textureX, textureY); // Gun45
		gunModel[40] = new ModelRendererTurbo(this, 61, 4, textureX, textureY); // Gun46
		gunModel[41] = new ModelRendererTurbo(this, 61, 21, textureX, textureY); // Gun47
		gunModel[42] = new ModelRendererTurbo(this, 60, 24, textureX, textureY); // Gun48
		gunModel[43] = new ModelRendererTurbo(this, 61, 17, textureX, textureY); // Gun49
		gunModel[44] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Gun5
		gunModel[45] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Gun50
		gunModel[46] = new ModelRendererTurbo(this, 61, 14, textureX, textureY); // Gun51
		gunModel[47] = new ModelRendererTurbo(this, 75, 27, textureX, textureY); // Gun52
		gunModel[48] = new ModelRendererTurbo(this, 75, 31, textureX, textureY); // Gun53
		gunModel[49] = new ModelRendererTurbo(this, 60, 27, textureX, textureY); // Gun54
		gunModel[50] = new ModelRendererTurbo(this, 66, 30, textureX, textureY); // Gun55
		gunModel[51] = new ModelRendererTurbo(this, 60, 31, textureX, textureY); // Gun56
		gunModel[52] = new ModelRendererTurbo(this, 66, 33, textureX, textureY); // Gun57
		gunModel[53] = new ModelRendererTurbo(this, 66, 36, textureX, textureY); // Gun58
		gunModel[54] = new ModelRendererTurbo(this, 61, 42, textureX, textureY); // Gun59
		gunModel[55] = new ModelRendererTurbo(this, 13, 13, textureX, textureY); // Gun6
		gunModel[56] = new ModelRendererTurbo(this, 61, 45, textureX, textureY); // Gun60
		gunModel[57] = new ModelRendererTurbo(this, 61, 48, textureX, textureY); // Gun61
		gunModel[58] = new ModelRendererTurbo(this, 61, 51, textureX, textureY); // Gun62
		gunModel[59] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Gun63
		gunModel[60] = new ModelRendererTurbo(this, 77, 17, textureX, textureY); // Gun64
		gunModel[61] = new ModelRendererTurbo(this, 33, 34, textureX, textureY); // Gun64
		gunModel[62] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Gun65
		gunModel[63] = new ModelRendererTurbo(this, 7, 9, textureX, textureY); // Gun7
		gunModel[64] = new ModelRendererTurbo(this, 7, 6, textureX, textureY); // Gun8
		gunModel[65] = new ModelRendererTurbo(this, 7, 12, textureX, textureY); // Gun9

		gunModel[0].addShapeBox(-0.6F, 1.8F, -0.5F, 3, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F); // Gun1
		gunModel[0].setRotationPoint(1F, 0F, 0F);

		gunModel[1].addShapeBox(2.2F, -2F, -0.5F, 1, 1, 1, 0F, -.7F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.7F, 0F, -.2F, -1F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, -1F, -.7F, -.2F); // Gun10
		gunModel[1].setRotationPoint(1F, 0F, 0F);

		gunModel[2].addShapeBox(1.3F, -2F, -0.5F, 1, 1, 1, 0F, 0F, -.5F, -.3F, -.6F, -.5F, -.3F, -.6F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F, 0F, 0F, -.3F); // Gun11
		gunModel[2].setRotationPoint(1F, 0F, 0F);

		gunModel[3].addShapeBox(1.3F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.6F, -.5F, -.3F, -.6F, -.5F, -.3F, 0F, -.5F, -.3F); // Gun12
		gunModel[3].setRotationPoint(1F, 0F, 0F);

		gunModel[4].addShapeBox(-2F, -3F, -0.5F, 6, 1, 1, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun13
		gunModel[4].setRotationPoint(1F, 0F, 0F);

		gunModel[5].addShapeBox(-2F, -4F, -0.5F, 6, 1, 1, 0F, 0F, -.7F, .2F, 0F, -.7F, .2F, 0F, -.7F, .2F, 0F, -.7F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Gun14
		gunModel[5].setRotationPoint(1F, 0F, 0F);

		gunModel[6].addShapeBox(3F, -4F, -0.5F, 1, 1, 1, 0F, -.6F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F, -.6F, .1F, .2F, -.6F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -.6F, 0F, .2F); // Gun15
		gunModel[6].setRotationPoint(1F, 0F, 0F);

		gunModel[7].addShapeBox(-2F, -4F, -0.5F, 1, 1, 1, 0F, 0F, .1F, .2F, -.6F, .1F, .2F, -.6F, .1F, .2F, 0F, .1F, .2F, 0F, 0F, .2F, -.6F, 0F, .2F, -.6F, 0F, .2F, 0F, 0F, .2F); // Gun16
		gunModel[7].setRotationPoint(1F, 0F, 0F);

		gunModel[8].addShapeBox(-2F, -4F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Gun17
		gunModel[8].setRotationPoint(1F, 0F, 0F);

		gunModel[9].addShapeBox(-0.8F, -4F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Gun18
		gunModel[9].setRotationPoint(1F, 0F, 0F);

		gunModel[10].addShapeBox(0.4F, -4F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Gun19
		gunModel[10].setRotationPoint(1F, 0F, 0F);

		gunModel[11].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, .1F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, .1F, -.2F, -.2F); // Gun2
		gunModel[11].setRotationPoint(1F, 0F, 0F);

		gunModel[12].addShapeBox(1.6F, -4F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Gun20
		gunModel[12].setRotationPoint(1F, 0F, 0F);

		gunModel[13].addShapeBox(2.9F, -4F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Gun21
		gunModel[13].setRotationPoint(1F, 0F, 0F);

		gunModel[14].addShapeBox(-2F, -4F, -0.5F, 6, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun22
		gunModel[14].setRotationPoint(1F, 0F, 0F);

		gunModel[15].addShapeBox(-2F, -4F, -0.5F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Gun23
		gunModel[15].setRotationPoint(1F, 0F, 0F);

		gunModel[16].addShapeBox(-2F, -5F, -0.5F, 6, 1, 1, 0F, 0F, -.95F, -.1F, 0F, -.95F, -.1F, 0F, -.95F, -.1F, 0F, -.95F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun24
		gunModel[16].setRotationPoint(1F, 0F, 0F);

		gunModel[17].addShapeBox(-2F, -4F, -0.5F, 6, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Gun25
		gunModel[17].setRotationPoint(1F, 0F, 0F);

		gunModel[18].addShapeBox(4F, -4F, -1F, 1, 1, 2, 0F, 0F, .1F, -.3F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .1F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F); // Gun26
		gunModel[18].setRotationPoint(1F, 0F, 0F);

		gunModel[19].addShapeBox(4F, -3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, .2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F); // Gun27
		gunModel[19].setRotationPoint(1F, 0F, 0F);

		gunModel[20].addShapeBox(5F, -4F, -1F, 4, 1, 2, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun28
		gunModel[20].setRotationPoint(1F, 0F, 0F);

		gunModel[21].addShapeBox(5F, -2.8F, -1F, 1, 1, 2, 0F, 0F, 0F, -.07F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.5F, -.24F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, -.24F); // Gun29
		gunModel[21].setRotationPoint(1F, 0F, 0F);

		gunModel[22].addShapeBox(-0.3F, 0F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, .2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, .2F, 0F, -.2F); // Gun3
		gunModel[22].setRotationPoint(1F, 0F, 0F);

		gunModel[23].addShapeBox(5F, -2.65F, -1F, 1, 1, 2, 0F, 0F, -.35F, -.24F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, -.24F, 0F, -.35F, -.34F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, -.34F); // Gun30
		gunModel[23].setRotationPoint(1F, 0F, 0F);

		gunModel[24].addShapeBox(5F, -2.5F, -1F, 1, 1, 2, 0F, 0F, -.5F, -.34F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, -.34F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Gun31
		gunModel[24].setRotationPoint(1F, 0F, 0F);

		gunModel[25].addShapeBox(6F, -2.8F, -1F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F); // Gun32
		gunModel[25].setRotationPoint(1F, 0F, 0F);

		gunModel[26].addShapeBox(6F, -2.65F, -1F, 5, 1, 2, 0F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, .3F, 0F, -.35F, .3F); // Gun33
		gunModel[26].setRotationPoint(1F, 0F, 0F);

		gunModel[27].addShapeBox(6F, -2.5F, -1F, 5, 1, 2, 0F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun34
		gunModel[27].setRotationPoint(1F, 0F, 0F);

		gunModel[28].addShapeBox(9F, -4F, -1F, 2, 1, 1, 0F, 0F, .2F, 0F, 0F, -.8F, 0F, 0F, -.8F, -.5F, 0F, .2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Gun35
		gunModel[28].setRotationPoint(1F, 0F, 0F);

		gunModel[29].addShapeBox(9F, -4F, 0F, 2, 1, 1, 0F, 0F, .2F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, 0F, 0F, .2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun36
		gunModel[29].setRotationPoint(1F, 0F, 0F);

		gunModel[30].addShapeBox(9F, -4F, -0.5F, 1, 1, 1, 0F, 0F, .2F, 0F, -.4F, .2F, 0F, -.4F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun37
		gunModel[30].setRotationPoint(1F, 0F, 0F);

		gunModel[31].addShapeBox(9F, -4F, -0.5F, 1, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun38
		gunModel[31].setRotationPoint(1F, 0F, 0F);

		gunModel[32].addShapeBox(11F, -2.6F, 0.2F, 1, 1, 1, 0F, 0F, -.3F, -.3F, -.8F, -.3F, -.3F, -.8F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, -.8F, -.3F, -.3F, -.8F, -.3F, -.3F, 0F, -.3F, -.3F); // Gun39
		gunModel[32].setRotationPoint(1F, 0F, 0F);

		gunModel[33].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, -.2F, 0F, -.2F, .3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, .3F, 0F, -.2F); // Gun4
		gunModel[33].setRotationPoint(1F, 0F, 0F);

		gunModel[34].addShapeBox(10.4F, -2.6F, -1.2F, 1, 1, 1, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F); // Gun40
		gunModel[34].setRotationPoint(1F, 0F, 0F);

		gunModel[35].addShapeBox(11F, -3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, -.1F, 0F, 0F, -.1F); // Gun41
		gunModel[35].setRotationPoint(1F, 0F, 0F);

		gunModel[36].addShapeBox(11F, -4F, -0.5F, 1, 1, 1, 0F, 0F, -.6F, -.3F, -.8F, -.6F, -.3F, -.8F, -.6F, -.3F, 0F, -.6F, -.3F, 0F, 0F, -.1F, -.8F, 0F, -.1F, -.8F, 0F, -.1F, 0F, 0F, -.1F); // Gun42
		gunModel[36].setRotationPoint(1F, 0F, 0F);

		gunModel[37].addShapeBox(-11F, -5F, -0.5F, 9, 1, 1, 0F, 0F, -.8F, .1F, .4F, -.8F, .1F, .4F, -.8F, .1F, 0F, -.8F, .1F, 0F, -.1F, .2F, .4F, -.1F, .2F, .4F, -.1F, .2F, 0F, -.1F, .2F); // Gun43
		gunModel[37].setRotationPoint(1F, 0F, 0F);

		gunModel[38].addShapeBox(-5F, -4F, -0.5F, 3, 1, 1, 0F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F); // Gun44
		gunModel[38].setRotationPoint(1F, 0F, 0F);

		gunModel[39].addShapeBox(-5F, -4F, -0.5F, 3, 1, 1, 0F, -2.5F, -.5F, .2F, 0F, -.5F, .2F, 0F, -.5F, .2F, -2.5F, -.5F, .2F, -2.5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -2.5F, 0F, .2F); // Gun45
		gunModel[39].setRotationPoint(1F, 0F, 0F);

		gunModel[40].addBox(-8F, -4F, -0.5F, 6, 1, 1, 0F); // Gun46
		gunModel[40].setRotationPoint(1F, 0F, 0F);

		gunModel[41].addShapeBox(-6.5F, -4F, 0.5F, 4, 1, 1, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.7F, 0F, -.1F, -.7F); // Gun47
		gunModel[41].setRotationPoint(1F, 0F, 0F);

		gunModel[42].addShapeBox(-11F, -3F, -0.5F, 9, 1, 1, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Gun48
		gunModel[42].setRotationPoint(1F, 0F, 0F);

		gunModel[43].addShapeBox(-10.8F, -3.8F, -1.5F, 6, 1, 1, 0F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, -.1F, 0F, 0F, -.1F, 0F); // Gun49
		gunModel[43].setRotationPoint(1F, 0F, 0F);

		gunModel[44].addShapeBox(0F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -.2F); // Gun5
		gunModel[44].setRotationPoint(1F, 0F, 0F);

		gunModel[45].addShapeBox(-5.8F, -3.8F, -1.8F, 1, 1, 1, 0F, 0F, -.3F, -.9F, .1F, -.3F, -.9F, .1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.3F, -.9F, .1F, -.3F, -.9F, .1F, -.2F, 0F, 0F, -.2F, 0F); // Gun50
		gunModel[45].setRotationPoint(1F, 0F, 0F);

		gunModel[46].addShapeBox(-11F, -4F, -0.5F, 6, 1, 1, 0F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, .1F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Gun51
		gunModel[46].setRotationPoint(1F, 0F, 0F);

		gunModel[47].addShapeBox(-8F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, 0F, -.3F, 0F); // Gun52
		gunModel[47].setRotationPoint(1F, 0F, 0F);

		gunModel[48].addShapeBox(-8F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, -.1F, -.8F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, -.1F, -.8F, 0F); // Gun53
		gunModel[48].setRotationPoint(1F, 0F, 0F);

		gunModel[49].addShapeBox(-10.5F, -2F, -0.5F, 5, 1, 1, 0F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.1F); // Gun54
		gunModel[49].setRotationPoint(1F, 0F, 0F);

		gunModel[50].addShapeBox(-9.4F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.1F, .5F, 0F, -.1F, .5F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.6F, -.1F, -.05F, -.6F, -.1F, -.05F, -.6F, -.1F, 0F, -.6F, -.1F); // Gun55
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(-11F, -2F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.4F, .4F, 0F, -.4F, .4F, 0F, 0F, .5F, 0F); // Gun56
		gunModel[51].setRotationPoint(1F, 0F, 0F);

		gunModel[52].addShapeBox(-9.4F, -1.1F, -0.5F, 1, 1, 1, 0F, 0F, -.5F, -.1F, -.05F, -.5F, -.1F, -.05F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, 0F, 0F, -.1F); // Gun57
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(-9.4F, -0.1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.5F, -.1F, -.3F, -.5F, -.1F, -.3F, -.5F, -.1F, 0F, -.5F, -.1F); // Gun58
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(-5.5F, -2F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Gun59
		gunModel[54].setRotationPoint(1F, 0F, 0F);

		gunModel[55].addShapeBox(0.7F, -1.4F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.7F, -.2F); // Gun6
		gunModel[55].setRotationPoint(1F, 0F, 0F);
		gunModel[55].rotateAngleZ = -0.20943951F;

		gunModel[56].addShapeBox(-3.5F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, -.2F, -.9F, 0F, -.2F, -.9F, 0F, 0F, -.8F, 0F); // Gun60
		gunModel[56].setRotationPoint(1F, 0F, 0F);

		gunModel[57].addShapeBox(-4.5F, -1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.4F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -.1F, -.4F, 0F); // Gun61
		gunModel[57].setRotationPoint(1F, 0F, 0F);

		gunModel[58].addShapeBox(-5.5F, -1F, -0.5F, 1, 1, 1, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.5F, .2F, 0F, .1F, -.4F, 0F, .1F, -.4F, 0F, -.5F, .2F, 0F); // Gun62
		gunModel[58].setRotationPoint(1F, 0F, 0F);

		gunModel[59].addShapeBox(6F, -3F, -1F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Gun63
		gunModel[59].setRotationPoint(1F, 0F, 0F);

		gunModel[60].addShapeBox(-5F, -4F, -0.5F, 3, 1, 1, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, .2F, 0F, -.5F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F); // Gun64
		gunModel[60].setRotationPoint(1F, 0F, 0F);

		gunModel[61].addShapeBox(5F, -3F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, -.14F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, -.14F); // Gun64
		gunModel[61].setRotationPoint(1F, 0F, 0F);

		gunModel[62].addShapeBox(2.9F, -4.11F, -0.5F, 3, 1, 1, 0F, -.6F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, -.2F, -.6F, .1F, -.2F, -.6F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.6F, 0F, -.2F); // Gun65
		gunModel[62].setRotationPoint(1F, 0F, 0F);

		gunModel[63].addShapeBox(1F, -2F, -0.5F, 1, 1, 1, 0F, 0F, -.5F, -.2F, -.6F, -.5F, -.2F, -.6F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, 0F, 0F, -.2F); // Gun7
		gunModel[63].setRotationPoint(1F, 0F, 0F);

		gunModel[64].addShapeBox(1F, -2F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, -.6F, -.5F, -.2F, -.6F, -.5F, -.2F, 0F, -.5F, -.2F); // Gun8
		gunModel[64].setRotationPoint(1F, 0F, 0F);

		gunModel[65].addShapeBox(1.8F, -2F, -0.5F, 1, 4, 1, 0F, -1.4F, 0F, -.2F, .6F, 0F, -.2F, .6F, 0F, -.2F, -1.4F, 0F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F, -.4F, -.2F, -.2F); // Gun9
		gunModel[65].setRotationPoint(1F, 0F, 0F);


		defaultBarrelModel = new ModelRendererTurbo[6];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 46, 48, textureX, textureY); // Barrel1
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 46, 51, textureX, textureY); // Barrel2
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Barrel3
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 28, 48, textureX, textureY); // Barrel4
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 28, 51, textureX, textureY); // Barrel5
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 28, 54, textureX, textureY); // Barrel6

		defaultBarrelModel[0].addShapeBox(11F, -3.25F, -0.5F, 5, 1, 1, 0F, 0F, -.5F, -.35F, 0F, -.5F, -.35F, 0F, -.5F, -.35F, 0F, -.5F, -.35F, 0F, -.35F, -.2F, 0F, -.35F, -.2F, 0F, -.35F, -.2F, 0F, -.35F, -.2F); // Barrel1
		defaultBarrelModel[0].setRotationPoint(1F, 0F, 0F);

		defaultBarrelModel[1].addShapeBox(11F, -3F, -0.5F, 5, 1, 1, 0F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F); // Barrel2
		defaultBarrelModel[1].setRotationPoint(1F, 0F, 0F);

		defaultBarrelModel[2].addShapeBox(11F, -2.75F, -0.5F, 5, 1, 1, 0F, 0F, -.35F, -.2F, 0F, -.35F, -.2F, 0F, -.35F, -.2F, 0F, -.35F, -.2F, 0F, -.5F, -.35F, 0F, -.5F, -.35F, 0F, -.5F, -.35F, 0F, -.5F, -.35F); // Barrel3
		defaultBarrelModel[2].setRotationPoint(1F, 0F, 0F);

		defaultBarrelModel[3].addShapeBox(16F, -3.28F, -0.5F, 1, 1, 1, 0F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F); // Barrel4
		defaultBarrelModel[3].setRotationPoint(1F, 0F, 0F);

		defaultBarrelModel[4].addShapeBox(16F, -3F, -0.5F, 1, 1, 1, 0F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F); // Barrel5
		defaultBarrelModel[4].setRotationPoint(1F, 0F, 0F);

		defaultBarrelModel[5].addShapeBox(16F, -2.72F, -0.5F, 1, 1, 1, 0F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F); // Barrel6
		defaultBarrelModel[5].setRotationPoint(1F, 0F, 0F);


		defaultScopeModel = new ModelRendererTurbo[18];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Scope1
		defaultScopeModel[1] = new ModelRendererTurbo(this, 31, 13, textureX, textureY); // Scope10
		defaultScopeModel[2] = new ModelRendererTurbo(this, 31, 10, textureX, textureY); // Scope11
		defaultScopeModel[3] = new ModelRendererTurbo(this, 41, 10, textureX, textureY); // Scope12
		defaultScopeModel[4] = new ModelRendererTurbo(this, 41, 13, textureX, textureY); // Scope13
		defaultScopeModel[5] = new ModelRendererTurbo(this, 41, 16, textureX, textureY); // Scope14
		defaultScopeModel[6] = new ModelRendererTurbo(this, 43, 7, textureX, textureY); // Scope15
		defaultScopeModel[7] = new ModelRendererTurbo(this, 32, 7, textureX, textureY); // Scope16
		defaultScopeModel[8] = new ModelRendererTurbo(this, 38, 7, textureX, textureY); // Scope17
		defaultScopeModel[9] = new ModelRendererTurbo(this, 41, 19, textureX, textureY); // Scope18
		defaultScopeModel[10] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Scope2
		defaultScopeModel[11] = new ModelRendererTurbo(this, 26, 23, textureX, textureY); // Scope3
		defaultScopeModel[12] = new ModelRendererTurbo(this, 26, 20, textureX, textureY); // Scope4
		defaultScopeModel[13] = new ModelRendererTurbo(this, 25, 16, textureX, textureY); // Scope5
		defaultScopeModel[14] = new ModelRendererTurbo(this, 25, 13, textureX, textureY); // Scope6
		defaultScopeModel[15] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Scope7
		defaultScopeModel[16] = new ModelRendererTurbo(this, 26, 7, textureX, textureY); // Scope8
		defaultScopeModel[17] = new ModelRendererTurbo(this, 31, 16, textureX, textureY); // Scope9

		defaultScopeModel[0].addShapeBox(-2.6F, -4.45F, -0.5F, 1, 1, 1, 0F, -.5F, -.25F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.25F, -.2F, -.5F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, -.5F, -.7F, -.2F); // Scope1
		defaultScopeModel[0].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[1].addShapeBox(-1.2F, -6.48F, -0.5F, 3, 1, 1, 0F, 0F, -.32F, -.05F, 0F, -.32F, -.05F, 0F, -.32F, -.05F, 0F, -.32F, -.05F, 0F, -.32F, -.05F, 0F, -.32F, -.05F, 0F, -.32F, -.05F, 0F, -.32F, -.05F); // Scope10
		defaultScopeModel[1].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[2].addShapeBox(-1.2F, -6.81F, -0.5F, 3, 1, 1, 0F, 0F, -.40F, -.35F, 0F, -.40F, -.35F, 0F, -.40F, -.35F, 0F, -.40F, -.35F, 0F, -.35F, -.05F, 0F, -.35F, -.05F, 0F, -.35F, -.05F, 0F, -.35F, -.05F); // Scope11
		defaultScopeModel[2].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[3].addShapeBox(1F, -6.76F, -0.5F, 4, 1, 1, 0F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F); // Scope12
		defaultScopeModel[3].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[4].addShapeBox(1F, -6.48F, -0.5F, 4, 1, 1, 0F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F, 0F, -.37F, -.15F); // Scope13
		defaultScopeModel[4].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[5].addShapeBox(1F, -6.2F, -0.5F, 4, 1, 1, 0F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.35F, -.15F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F, 0F, -.46F, -.35F); // Scope14
		defaultScopeModel[5].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[6].addShapeBox(1.6F, -6.48F, -0.97F, 1, 1, 1, 0F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F); // Scope15
		defaultScopeModel[6].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[7].addShapeBox(1.6F, -6.92F, -0.5F, 1, 1, 1, 0F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F, -.38F); // Scope16
		defaultScopeModel[7].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[8].addShapeBox(2F, -6.92F, -0.5F, 1, 1, 1, 0F, -.38F, -.38F, -.45F, -.38F, -.55F, -.45F, -.38F, -.55F, -.45F, -.38F, -.38F, -.45F, -.38F, -.38F, -.45F, -.38F, -.38F, -.45F, -.38F, -.38F, -.45F, -.38F, -.38F, -.45F); // Scope17
		defaultScopeModel[8].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[9].addShapeBox(5.5F, -6F, -0.5F, 1, 2, 1, 0F, 1.5F, 0F, -.25F, -2F, 0F, -.25F, -2F, 0F, -.25F, 1.5F, 0F, -.25F, 0F, 0F, -.25F, -.5F, 0F, -.25F, -.5F, 0F, -.25F, 0F, 0F, -.25F); // Scope18
		defaultScopeModel[9].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[10].addShapeBox(-2.1F, -4.45F, -0.5F, 1, 1, 1, 0F, -.5F, 0F, -.25F, 0F, 0F, -.25F, 0F, 0F, -.25F, -.5F, 0F, -.25F, -.5F, -.5F, -.25F, 0F, -.5F, -.25F, 0F, -.5F, -.25F, -.5F, -.5F, -.25F); // Scope2
		defaultScopeModel[10].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[11].addShapeBox(-2.6F, -5.4F, -0.5F, 1, 1, 1, 0F, -.5F, -.05F, -.25F, 0F, -.05F, -.25F, 0F, -.05F, -.25F, -.5F, -.05F, -.25F, -1F, -.05F, -.25F, .5F, -.05F, -.25F, .5F, -.05F, -.25F, -1F, -.05F, -.25F); // Scope3
		defaultScopeModel[11].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[12].addShapeBox(-2.6F, -5.85F, -0.5F, 1, 1, 1, 0F, -.5F, 0F, -.25F, 0F, 0F, -.25F, 0F, 0F, -.25F, -.5F, 0F, -.25F, -.5F, -.5F, -.25F, 0F, -.5F, -.25F, 0F, -.5F, -.25F, -.5F, -.5F, -.25F); // Scope4
		defaultScopeModel[12].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[13].addShapeBox(-2.2F, -6.18F, -0.5F, 1, 1, 1, 0F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.44F, -.35F, 0F, -.44F, -.35F, 0F, -.44F, -.35F, 0F, -.44F, -.35F); // Scope5
		defaultScopeModel[13].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[14].addShapeBox(-2.2F, -6.48F, -0.5F, 1, 1, 1, 0F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F); // Scope6
		defaultScopeModel[14].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[15].addShapeBox(-2.2F, -6.78F, -0.5F, 1, 1, 1, 0F, 0F, -.44F, -.35F, 0F, -.44F, -.35F, 0F, -.44F, -.35F, 0F, -.44F, -.35F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F, 0F, -.35F, -.10F); // Scope7
		defaultScopeModel[15].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[16].addShapeBox(-2.3F, -6.92F, -0.5F, 1, 1, 1, 0F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F, -.42F, -.38F, -.45F); // Scope8
		defaultScopeModel[16].setRotationPoint(1F, 0F, 0F);

		defaultScopeModel[17].addShapeBox(-1.2F, -6.15F, -0.5F, 3, 1, 1, 0F, 0F, -.35F, -.05F, 0F, -.35F, -.05F, 0F, -.35F, -.05F, 0F, -.35F, -.05F, 0F, -.40F, -.35F, 0F, -.40F, -.35F, 0F, -.40F, -.35F, 0F, -.40F, -.35F); // Scope9
		defaultScopeModel[17].setRotationPoint(1F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 75, 37, textureX, textureY); // Ammo1
		ammoModel[1] = new ModelRendererTurbo(this, 75, 40, textureX, textureY); // Ammo2
		ammoModel[2] = new ModelRendererTurbo(this, 75, 43, textureX, textureY); // Ammo3
		ammoModel[3] = new ModelRendererTurbo(this, 75, 46, textureX, textureY); // Ammo4
		ammoModel[4] = new ModelRendererTurbo(this, 75, 49, textureX, textureY); // Ammo5

		ammoModel[0].addShapeBox(-4.8F, -1F, -0.5F, 2, 1, 1, 0F, .1F, 0F, -.08F, .1F, 0F, -.08F, .1F, 0F, -.08F, .1F, 0F, -.08F, .1F, 0F, -.08F, .1F, -.2F, -.08F, .1F, -.2F, -.08F, .1F, 0F, -.08F); // Ammo1
		ammoModel[0].setRotationPoint(1F, 0F, 0F);

		ammoModel[1].addShapeBox(-4.8F, 0F, -0.5F, 2, 1, 1, 0F, .1F, 0F, -.08F, .1F, .2F, -.08F, .1F, .2F, -.08F, .1F, 0F, -.08F, -.2F, 0F, -.08F, .3F, -.4F, -.08F, .3F, -.4F, -.08F, -.2F, 0F, -.08F); // Ammo2
		ammoModel[1].setRotationPoint(1F, 0F, 0F);

		ammoModel[2].addShapeBox(-4.5F, 1F, -0.5F, 2, 1, 1, 0F, .1F, 0F, -.08F, 0F, .4F, -.08F, 0F, .4F, -.08F, .1F, 0F, -.08F, -.3F, 0F, -.08F, .35F, -.6F, -.08F, .35F, -.6F, -.08F, -.3F, 0F, -.08F); // Ammo3
		ammoModel[2].setRotationPoint(1F, 0F, 0F);

		ammoModel[3].addShapeBox(-4.1F, 2F, -0.5F, 2, 1, 1, 0F, .1F, 0F, -.08F, -.05F, .6F, -.08F, -.05F, .6F, -.08F, .1F, 0F, -.08F, -.5F, 0F, -.08F, .35F, -1F, -.08F, .35F, -1F, -.08F, -.5F, 0F, -.08F); // Ammo4
		ammoModel[3].setRotationPoint(1F, 0F, 0F);

		ammoModel[4].addShapeBox(-3.5F, 3F, -0.5F, 2, 1, 1, 0F, .1F, 0F, -.08F, -.25F, 1F, -.08F, -.25F, 1F, -.08F, .1F, 0F, -.08F, -.8F, 0F, -.08F, .35F, -1.3F, -.08F, .35F, -1.3F, -.08F, -.8F, 0F, -.08F); // Ammo5
		ammoModel[4].setRotationPoint(1F, 0F, 0F);


		slideModel = new ModelRendererTurbo[6];
		slideModel[0] = new ModelRendererTurbo(this, 2, 47, textureX, textureY); // Slide1
		slideModel[1] = new ModelRendererTurbo(this, 8, 47, textureX, textureY); // Slide2
		slideModel[2] = new ModelRendererTurbo(this, 11, 51, textureX, textureY); // Slide3
		slideModel[3] = new ModelRendererTurbo(this, 11, 54, textureX, textureY); // Slide4
		slideModel[4] = new ModelRendererTurbo(this, 2, 54, textureX, textureY); // Slide5
		slideModel[5] = new ModelRendererTurbo(this, 2, 51, textureX, textureY); // Slide6

		slideModel[0].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -.8F, -.35F, 0F, -.8F, -.35F, 0F, -.8F, -.35F, 0F, -.8F, -.35F, 0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, -.35F); // Slide1
		slideModel[0].setRotationPoint(4F, -4F, 0F);

		slideModel[1].addShapeBox(-0.8F, -1.2F, -0.5F, 1, 1, 1, 0F, -.4F, -.9F, -.4F, -.4F, -.9F, -.4F, -.4F, -.9F, -.4F, -.4F, -.9F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Slide2
		slideModel[1].setRotationPoint(4F, -4F, 0F);

		slideModel[2].addShapeBox(-0.9F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, -.8F, -.39F, 0F, -.8F, -.39F, 0F, -.8F, -.39F, 0F, -.8F, -.39F, 0F, 0F, -.39F, 0F, 0F, -.39F, 0F, 0F, -.39F, 0F, 0F, -.39F); // Slide3
		slideModel[2].setRotationPoint(4F, -4F, 0F);

		slideModel[3].addShapeBox(0.1F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, -.8F, -.39F, 0F, -.8F, -.39F, 0F, -.8F, -.39F, 0F, -.8F, -.39F, 0F, 0F, -.39F, 0F, -.1F, -.39F, 0F, -.1F, -.39F, 0F, 0F, -.39F); // Slide4
		slideModel[3].setRotationPoint(4F, -4F, 0F);

		slideModel[4].addShapeBox(-0.9F, -1.3F, -0.5F, 2, 1, 1, 0F, 0F, -.7F, -.39F, 0F, -.7F, -.39F, 0F, -.7F, -.39F, 0F, -.7F, -.39F, 0F, -.2F, -.39F, 0F, -.2F, -.39F, 0F, -.2F, -.39F, 0F, -.2F, -.39F); // Slide5
		slideModel[4].setRotationPoint(4F, -4F, 0F);

		slideModel[5].addShapeBox(-0.9F, -1.6F, -0.5F, 2, 1, 1, 0F, -.2F, -.92F, -.39F, -.1F, -.9F, -.39F, -.1F, -.9F, -.39F, -.2F, -.92F, -.39F, 0F, 0F, -.39F, 0F, 0F, -.39F, 0F, 0F, -.39F, 0F, 0F, -.39F); // Slide6
		slideModel[5].setRotationPoint(4F, -4F, 0F);

		animationType = EnumAnimationType.BOTTOM_CLIP;

		translateAll(0F, -0.5F, 0F);
		

		gunSlideDistance = 0.2F;


		flipAll();
	}
}