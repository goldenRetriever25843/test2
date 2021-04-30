//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TurkiyeArmyman
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTurkiyeArmyMan extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public ModelTurkiyeArmyMan() //Same as Filename
	{
		headModel = new ModelRendererTurbo[36];
		bodyModel = new ModelRendererTurbo[29];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initrightLegModel_1();
		initleftLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		headModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 50
		headModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 51
		headModel[3] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 0
		headModel[4] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 7
		headModel[6] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 8
		headModel[7] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 12
		headModel[9] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 13
		headModel[10] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 0
		headModel[11] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 1
		headModel[12] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 2
		headModel[13] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 3
		headModel[14] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 4
		headModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		headModel[16] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 7
		headModel[17] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		headModel[18] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 9
		headModel[19] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 10
		headModel[20] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 0
		headModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		headModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		headModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		headModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[25] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 4
		headModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 5
		headModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 6
		headModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 7
		headModel[29] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 8
		headModel[30] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 9
		headModel[31] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 10
		headModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 11
		headModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		headModel[34] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 13
		headModel[35] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 14

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 7, 8, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 49
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3F, -7F, -2.5F, 6, 7, 5, 0F,-1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -10F, -4F, 8, 1, 8, 0F,-1F, 0.2F, -1F, -1F, 0.2F, -1F, -1F, 0.2F, -1F, -1F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 6
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -8F, -4.5F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .3F, .2F, 0F, .3F); // Box 7
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -7F, -5F, 10, 1, 10, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 8
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -6F, -5F, 10, 1, 10, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, -.2F, -.5F, 0F, -.2F, -.5F, 0F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -6F, -3F, 1, 2, 8, 0F,-.05F, -.5F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, .15F, 0F, -1F, 0F, 0F, -1F, -.2F, 0F, 0F, -.3F, 0F, 0F); // Box 12
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -4F, -2F, 1, 1, 7, 0F,.15F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.3F, 0F, 0F, .2F, -.5F, -.8F, 0F, -.5F, -.8F, -.2F, -.5F, -0.5F, -.5F, -.5F, -0.5F); // Box 13
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -6F, -5.8F, 10, 1, 1, 0F,-.2F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.7F, -.2F, -.5F, -.7F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 0
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -6F, -3F, 1, 2, 8, 0F,0F, -.5F, 0F, -.05F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, .1F, 0F, -1F, .15F, 0F, -1F, -.3F, 0F, 0F, -.2F, 0F, 0F); // Box 1
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -4F, -2F, 1, 1, 7, 0F,0F, 0F, 0F, .15F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, 0F, -.5F, -.8F, .2F, -.5F, -.8F, -.5F, -.5F, -0.5F, -.2F, -.5F, -0.5F); // Box 2
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -6F, 4F, 8, 2, 1, 0F,.2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 3
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -4F, 4F, 8, 1, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, -0.5F, .2F, -.5F, -0.5F); // Box 4
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -5F, -2F, 1, 4, 1, 0F,.8F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, .8F, 0F, 0F, .2F, 0F, 2F, -.8F, 0F, 2F, -.8F, 0F, -2F, .2F, 0F, -2F); // Box 5
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -2F, -4.9F, 8, 1, 2, 0F,.2F, -.3F, 0F, .2F, -.3F, 0F, .3F, -.3F, -.45F, .3F, -.3F, -.45F, .2F, -.3F, 0F, .2F, -.3F, 0F, .24F, -.3F, -.65F, .24F, -.3F, -.65F); // Box 7
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(3F, -5F, -2F, 1, 4, 1, 0F,-1.4F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, -1.4F, 0F, 0F, -.8F, 0F, 2F, .2F, 0F, 2F, .2F, 0F, -2F, -.8F, 0F, -2F); // Box 8
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -1F, -4F, 8, 1, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, -.1F, 0F, -.8F, -.1F); // Box 9
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -2F, -5.9F, 8, 1, 1, 0F,-.1F, -.3F, -.9F, -.1F, -.3F, -.9F, .2F, -.3F, 0F, .2F, -.3F, 0F, -.1F, -.3F, -.9F, -.1F, -.3F, -.9F, .2F, -.3F, 0F, .2F, -.3F, 0F); // Box 10
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.5F, -7.6F, -4.5F, 9, 1, 9, 0F,.2F, .3F, .3F, .2F, .3F, .3F, .2F, .3F, .2F, .2F, .3F, .2F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .55F, .3F, 0F, .55F); // Box 0
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(0F, -8.7F, -5.8F, 4, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-2.5F, -6.7F, -5.8F, 2, 1, 1, 0F,-1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 0
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -7.7F, -5.8F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3F, -7.7F, -5.8F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4F, -6.7F, -5.8F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0F, -6.7F, -5.8F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 5
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(1.5F, -6.7F, -5.8F, 2, 1, 1, 0F,-1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 6
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-4F, -8.7F, -5.8F, 4, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-2.5F, -8.7F, -5.8F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 8
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-2.5F, -6.7F, -5.8F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(1.5F, -6.7F, -5.8F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-3F, -8.5F, -5.8F, 6, 2, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 11
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3F, -6.9F, -5.8F, 2, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 12
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(1F, -6.9F, -5.8F, 2, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 13
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-1F, -6.7F, -5.8F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 14
		headModel[35].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 42
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 43
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 48
		bodyModel[3] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 62
		bodyModel[7] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 1, 150, textureX, textureY); // Box 64
		bodyModel[9] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 65
		bodyModel[10] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 66
		bodyModel[11] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 67
		bodyModel[12] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 68
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 71
		bodyModel[16] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 72
		bodyModel[17] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 73
		bodyModel[18] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 74
		bodyModel[19] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 75
		bodyModel[20] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 76
		bodyModel[21] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 77
		bodyModel[22] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 78
		bodyModel[23] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 79
		bodyModel[24] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 80
		bodyModel[25] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 81
		bodyModel[26] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Box 82
		bodyModel[27] = new ModelRendererTurbo(this, 77, 228, textureX, textureY); // Box 83
		bodyModel[28] = new ModelRendererTurbo(this, 154, 228, textureX, textureY); // Box 84

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 1, 4, 0F,-1.5F, 0.2F, 0.5F, -1.5F, 0.2F, 0.5F, -1.5F, 0.8F, 0.5F, -1.5F, 0.8F, 0.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 42
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, 0.5F, -3.8F, 10, 4, 7, 0F,0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 43
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-5F, 4.5F, -3.8F, 10, 3, 7, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 48
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-5F, 7.5F, -3.8F, 10, 2, 7, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F); // Box 52
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5F, 10.5F, -3.8F, 10, 2, 7, 0F,-0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.8F, -0.5F, -0.9F, -0.8F, -0.5F, -0.9F, -0.8F, -0.5F, -1F, -0.8F, -0.5F, -1F); // Box 53
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.2F, -3.8F, 1, 2, 8, 0F,0F, -0.8F, -0.5F, 0F, 0F, -0.9F, 0F, 0.5F, -1.4F, 0F, 0F, -1.3F, 0F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, -1F, -0.7F, 0F, -1F, -0.7F); // Box 61
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, -0.2F, -3.8F, 1, 2, 8, 0F,0F, 0F, -0.9F, 0F, -0.8F, -0.5F, 0F, 0F, -1.3F, 0F, 0.5F, -1.4F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 2.8F, -1F, -0.7F); // Box 62
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 1.8F, -3.8F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 0.8F, 0.15F, 0F, 0.8F, 0.15F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 63
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 4.8F, -3.8F, 8, 2, 7, 0F,0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 1.2F, 0.2F, 0F, 1.2F, 0.2F, 0.7F, 0.9F, -0.3F, 0.7F, 0.9F, -0.3F, 0.7F, 0.8F, -0.8F, 0.7F, 0.8F, -0.8F); // Box 64
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.5F, 8.6F, -3.8F, 9, 2, 7, 0F,0.2F, 0.9F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, 1.2F, -0.8F, 0.2F, 1F, -0.8F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F); // Box 65
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.75F, 6.5F, -4.8F, 2, 4, 2, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 66
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 6.5F, -4.8F, 2, 4, 2, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 67
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1.75F, 6.5F, -4.8F, 2, 4, 2, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 68
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.75F, 6F, -5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, 0.8F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 2F, -0.5F, 0.8F, 2F, -0.6F, 0.8F, 2F, -0.2F, -0.2F, 2F, -0.2F); // Box 69
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.75F, 6F, -5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, 0.8F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 2F, -0.5F, 0.8F, 2F, -0.6F, 0.8F, 2F, -0.2F, -0.2F, 2F, -0.2F); // Box 70
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1F, 6F, -5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, 0.8F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 2F, -0.5F, 0.8F, 2F, -0.6F, 0.8F, 2F, -0.2F, -0.2F, 2F, -0.2F); // Box 71
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 6.6F, 1.2F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 72
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 9.6F, 1.3F, 7, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -1F, 0.2F, -1.7F, -1F, 0.2F, -1.7F, -1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 73
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1F, 1.4F, 1.2F, 2, 5, 3, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 74
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1.4F, 1.4F, 1.2F, 2, 5, 3, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 75
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.4F, 1.4F, 1.2F, 2, 5, 3, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 76
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.4F, 1.2F, 1.3F, 2, 3, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F); // Box 77
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.4F, 1.2F, 1.3F, 2, 3, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F); // Box 78
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1F, 1.2F, 1.3F, 2, 3, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F); // Box 79
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.75F, 6.7F, -5.2F, 2, 3, 2, 0F,-0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 80
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1.75F, 6.7F, -5.2F, 2, 3, 2, 0F,-0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 81
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1F, 6.7F, -5.2F, 2, 3, 2, 0F,-0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 82
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-48.5F, 2.2F, -4.4F, 50, 27, 1, 0F,-47F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -47F, 0F, -0.4F, -47F, -25F, -0.4F, 0F, -25F, -0.4F, 0F, -25F, -0.4F, -47F, -25F, -0.4F); // Box 83
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-48.5F, 7.2F, 3.6F, 50, 27, 1, 0F,-47F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -47F, 0F, -0.4F, -47F, -25F, -0.4F, 0F, -25F, -0.4F, 0F, -25F, 0F, -47F, -25F, 0F); // Box 84
		bodyModel[28].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 67
		leftArmModel[1] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 68
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 69
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 70
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 71
		leftArmModel[5] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 72
		leftArmModel[6] = new ModelRendererTurbo(this, 155, 180, textureX, textureY); // Box 86

		leftArmModel[0].addShapeBox(-1.2F, -2.5F, -3F, 5, 1, 6, 0F,-1.5F, 0F, -2F, -1F, -0.2F, -2F, -1F, -0.2F, -2F, -1.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.7F, -1.5F, -3F, 5, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.7F, 2.5F, -3F, 5, 3, 6, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F); // Box 69
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.7F, 1.5F, -3F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 70
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0.3F, 5.5F, -3F, 5, 2, 6, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 71
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.3F, 9.5F, -3F, 5, 3, 5, 0F,-0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, 0.9F, -0.1F, 0.5F, 0.9F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.5F, 0F, 0.7F); // Box 72
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(3.5F, -0.8F, -48F, 1, 27, 50, 0F,-0.4F, 0F, -47F, -0.4F, 0F, -47F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -25F, -47F, -0.2F, -25F, -47F, -0.2F, -25F, 0F, -0.4F, -25F, 0F); // Box 86
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 54
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 57
		rightArmModel[3] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 58
		rightArmModel[4] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 59
		rightArmModel[5] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 60
		rightArmModel[6] = new ModelRendererTurbo(this, 77, 180, textureX, textureY); // Box 85

		rightArmModel[0].addShapeBox(-4.3F, -1.5F, -3F, 5, 3, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4.3F, 1.5F, -3F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 55
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.8F, -2.5F, -3F, 5, 1, 6, 0F,-1F, -0.2F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1F, -0.2F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4.3F, 2.5F, -3F, 5, 3, 6, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F); // Box 58
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-5.3F, 5.5F, -3F, 5, 2, 6, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 59
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-5.3F, 9.5F, -3F, 5, 3, 5, 0F,-0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, 0.9F, -0.1F, 0.5F, 0.9F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0.7F, -0.3F, 0F, 0.7F); // Box 60
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-4.5F, -0.8F, -48F, 1, 27, 50, 0F,-0.4F, 0F, -47F, -0.4F, 0F, -47F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, -25F, -47F, -0.4F, -25F, -47F, -0.4F, -25F, 0F, -0.2F, -25F, 0F); // Box 85
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{

		rightLegModel[0] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 77
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 78
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 79
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 80



		rightLegModel[0].addShapeBox(2F, 9.5F, -3F, 5, 3, 5, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 77
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(2F, 5.5F, -2.8F, 5, 4, 5, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F); // Box 78
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(2F, 2.5F, -2.8F, 5, 3, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 79
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(2F, -0.5F, -2.8F, 5, 2, 5, 0F,-0.2F, 0F, -0.2F, -0.5F, 0.4F, -0.2F, -0.5F, 0.4F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 80
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
	
	private void initleftLegModel_1()
	{
		

		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 73
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 74
		leftLegModel[2] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 75
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 76

		leftLegModel[0].addShapeBox(-7F, -0.5F, -2.8F, 5, 2, 5, 0F,-0.5F, 0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0.4F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 73
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-7F, 2.5F, -2.8F, 5, 3, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 74
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-7F, 5.5F, -2.8F, 5, 4, 5, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F, -0.25F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F); // Box 75
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-7F, 9.5F, -3F, 5, 3, 5, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 76
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		
	}
}