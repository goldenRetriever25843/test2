//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelaltJSDF extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelaltJSDF() //Same as Filename
	{
		headModel = new ModelRendererTurbo[33];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		headModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		headModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		headModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		headModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		headModel[12] = new ModelRendererTurbo(this, 3, 45, textureX, textureY); // Box 5
		headModel[13] = new ModelRendererTurbo(this, 3, 45, textureX, textureY); // Box 7
		headModel[14] = new ModelRendererTurbo(this, 3, 45, textureX, textureY); // Box 8
		headModel[15] = new ModelRendererTurbo(this, 3, 45, textureX, textureY); // Box 9
		headModel[16] = new ModelRendererTurbo(this, 3, 45, textureX, textureY); // Box 10
		headModel[17] = new ModelRendererTurbo(this, 2, 33, textureX, textureY); // Box 0
		headModel[18] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 1
		headModel[19] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 0
		headModel[20] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 1
		headModel[21] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 3
		headModel[22] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 4
		headModel[23] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 5
		headModel[24] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 6
		headModel[25] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 7
		headModel[26] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 8
		headModel[27] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 9
		headModel[28] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 10
		headModel[29] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 11
		headModel[30] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 12
		headModel[31] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Box 13
		headModel[32] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 14

		headModel[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 1, 9, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F, -1F, -.2F, -1F, -1F, -.2F, -1F, -1F, -.2F, -1F, -1F, -.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 6
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -7F, -4.5F, 9, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .3F, .2F, 0F, .3F); // Box 7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -6F, -5F, 10, 1, 10, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 8
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -5F, -5F, 10, 1, 10, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, -.2F, -.5F, 0F, -.2F, -.5F, 0F); // Box 11
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -5F, -3F, 1, 2, 8, 0F, -.05F, -.5F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, .15F, 0F, -1F, 0F, 0F, -1F, -.2F, 0F, 0F, -.3F, 0F, 0F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -3F, -2F, 1, 1, 7, 0F, .15F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.3F, 0F, 0F, .2F, -.5F, -.8F, 0F, -.5F, -.8F, -.2F, -.5F, 0F, -.5F, -.5F, 0F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -5F, -5.8F, 10, 1, 1, 0F, -.2F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.7F, -.2F, -.5F, -.7F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4F, -5F, -3F, 1, 2, 8, 0F, 0F, -.5F, 0F, -.05F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, .1F, 0F, -1F, .15F, 0F, -1F, -.3F, 0F, 0F, -.2F, 0F, 0F); // Box 1
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -3F, -2F, 1, 1, 7, 0F, 0F, 0F, 0F, .15F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, 0F, -.5F, -.8F, .2F, -.5F, -.8F, -.5F, -.5F, 0F, -.2F, -.5F, 0F); // Box 2
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -5F, 4F, 8, 2, 1, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 3
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -3F, 4F, 8, 1, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F); // Box 4
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4F, -2F, 1, 4, 1, 0F, .8F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, .8F, 0F, 0F, .2F, 0F, 2F, -.8F, 0F, 2F, -.8F, 0F, -2F, .2F, 0F, -2F); // Box 5
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -1F, -4.2F, 8, 1, 1, 0F, .2F, -.3F, 0F, .2F, -.3F, 0F, .3F, -.3F, -.45F, .3F, -.3F, -.45F, .2F, -.3F, 0F, .2F, -.3F, 0F, .24F, -.3F, -.65F, .24F, -.3F, -.65F); // Box 7
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3F, -4F, -2F, 1, 4, 1, 0F, -1.4F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, -1.4F, 0F, 0F, -.8F, 0F, 2F, .2F, 0F, 2F, .2F, 0F, -2F, -.8F, 0F, -2F); // Box 8
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, 0F, -4F, 8, 1, 1, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, -.1F, 0F, -.8F, -.1F); // Box 9
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -1F, -5.2F, 8, 1, 1, 0F, -.1F, -.3F, -.9F, -.1F, -.3F, -.9F, .2F, -.3F, 0F, .2F, -.3F, 0F, -.1F, -.3F, -.9F, -.1F, -.3F, -.9F, .2F, -.3F, 0F, .2F, -.3F, 0F); // Box 10
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, -6.6F, -4.5F, 9, 1, 9, 0F, .2F, .3F, .3F, .2F, .3F, .3F, .2F, .3F, .2F, .2F, .3F, .2F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .55F, .3F, 0F, .55F); // Box 0
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0F, -7.7F, -5.8F, 4, 1, 1, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-2.5F, -5.7F, -5.8F, 2, 1, 1, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 0
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4F, -6.7F, -5.8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(3F, -6.7F, -5.8F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4F, -5.7F, -5.8F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(0F, -5.7F, -5.8F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 5
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(1.5F, -5.7F, -5.8F, 2, 1, 1, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 6
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4F, -7.7F, -5.8F, 4, 1, 1, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-2.5F, -7.7F, -5.8F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 8
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-2.5F, -5.7F, -5.8F, 1, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(1.5F, -5.7F, -5.8F, 1, 1, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-3F, -7.5F, -5.8F, 6, 2, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 11
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-3F, -5.9F, -5.8F, 2, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 12
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(1F, -5.9F, -5.8F, 2, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 13
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-1F, -5.7F, -5.8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 14
		headModel[32].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[69];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 4, 82, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 3
		bodyModel[12] = new ModelRendererTurbo(this, 5, 84, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[15] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Box 8
		bodyModel[16] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Box 9
		bodyModel[17] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 10
		bodyModel[18] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 11
		bodyModel[19] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 12
		bodyModel[20] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 13
		bodyModel[21] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 14
		bodyModel[22] = new ModelRendererTurbo(this, 6, 88, textureX, textureY); // Box 15
		bodyModel[23] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 16
		bodyModel[24] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 18
		bodyModel[26] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 19
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[30] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 23
		bodyModel[31] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 24
		bodyModel[32] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 25
		bodyModel[33] = new ModelRendererTurbo(this, 23, 48, textureX, textureY); // Box 26
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		bodyModel[37] = new ModelRendererTurbo(this, 47, 45, textureX, textureY); // Box 30
		bodyModel[38] = new ModelRendererTurbo(this, 47, 37, textureX, textureY); // Box 32
		bodyModel[39] = new ModelRendererTurbo(this, 47, 45, textureX, textureY); // Box 35
		bodyModel[40] = new ModelRendererTurbo(this, 47, 37, textureX, textureY); // Box 36
		bodyModel[41] = new ModelRendererTurbo(this, 21, 23, textureX, textureY); // Box 37
		bodyModel[42] = new ModelRendererTurbo(this, 47, 37, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 47, 45, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 47, 45, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 47, 37, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 32, 29, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 33, 29, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 33, 29, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 32, 29, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 27, 59, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 33, 48, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 21, 59, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 22, 53, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 30, 53, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 30, 53, textureX, textureY); // Box 1
		bodyModel[58] = new ModelRendererTurbo(this, 30, 53, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 30, 53, textureX, textureY); // Box 3
		bodyModel[60] = new ModelRendererTurbo(this, 13, 67, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 50, 61, textureX, textureY); // Box 5
		bodyModel[62] = new ModelRendererTurbo(this, 50, 56, textureX, textureY); // Box 6
		bodyModel[63] = new ModelRendererTurbo(this, 61, 37, textureX, textureY); // Box 11
		bodyModel[64] = new ModelRendererTurbo(this, 61, 45, textureX, textureY); // Box 15
		bodyModel[65] = new ModelRendererTurbo(this, 61, 37, textureX, textureY); // Box 17
		bodyModel[66] = new ModelRendererTurbo(this, 61, 45, textureX, textureY); // Box 18
		bodyModel[67] = new ModelRendererTurbo(this, 21, 23, textureX, textureY); // Box 19
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(-4F, 0.9F, -2F, 8, 9, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 1.9F, -2.5F, 7, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0.95F, 0.9F, -4F, 1, 1, 2, 0F, -.5F, .4F, 0F, .5F, .4F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.3F, -1F, .5F, 0F, -1F, .5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 17
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1.45F, -0.1F, -4F, 1, 1, 2, 0F, 0F, .4F, -1F, 0F, .4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, -0.1F, -2.5F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 3.9F, -2.5F, 1, 7, 5, 0F, -.3F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, -.3F, 0F, -.2F); // Box 21
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(1.5F, -0.1F, -2.5F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .75F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3.5F, 3.9F, -2.5F, 1, 7, 5, 0F, 0F, 0F, .5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, .5F); // Box 23
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1.5F, -1.1F, -2.5F, 3, 1, 5, 0F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.5F, -1.1F, -2.5F, 3, 1, 5, 0F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.45F, -0.1F, -4F, 1, 1, 2, 0F, 0F, .4F, -1F, 0F, .4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 1.9F, -3.5F, 3, 9, 1, 0F, 0F, 0F, -.5F, .5F, 0F, -.1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 1.9F, 2.5F, 7, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 4
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3.5F, -0.2F, -2.5F, 3, 1, 5, 0F, 0F, 0F, -.15F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.15F, 0F, .3F, .23F, -.1F, 0F, -.15F, -.1F, 0F, -.15F, 0F, .3F, .23F); // Box 6
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-6.5F, -0.2F, -2.5F, 3, 1, 5, 0F, 0F, 0F, -.3F, 0F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.3F, -.1F, 0F, -.15F, 0F, .3F, .23F, 0F, .3F, .23F, -.1F, 0F, -.15F); // Box 7
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3.5F, -0.9F, -2.5F, 1, 1, 5, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, .5F, .18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, .18F); // Box 8
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.5F, -0.9F, -2.5F, 1, 1, 5, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .5F, .18F, 0F, .5F, .18F, 0F, 0F, 0F); // Box 9
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(3.5F, 2.9F, -2.5F, 1, 1, 5, 0F, 0F, 0F, .5F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, .5F); // Box 10
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.5F, 2.9F, -2.5F, 1, 1, 5, 0F, -.3F, -1F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, -.3F, -1F, -.2F, -.3F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, -.3F, 0F, -.2F); // Box 11
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3F, 10.5F, -3.5F, 6, 1, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 1.9F, -3.5F, 3, 9, 1, 0F, .5F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1.95F, 0.9F, -4F, 1, 1, 2, 0F, .5F, .4F, 0F, -.5F, .4F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, .5F, -.3F, -1F, .5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 14
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3.5F, -0.1F, 1.5F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 15
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.5F, 2.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 16
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.5F, 3.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 17
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.5F, 4.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 18
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.5F, 5.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 19
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0.5F, 8.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 20
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0.5F, 7.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 21
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0.5F, 6.9F, -3.6F, 3, 1, 1, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F, .3F, -.15F, -.1F, -.2F, -.15F, -.5F, -.2F, -.15F, 0F, .3F, -.15F, 0F); // Box 22
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.5F, 2.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 23
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.5F, 3.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 24
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.5F, 5.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 25
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.5F, 4.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 26
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 8.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 27
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.5F, 7.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 28
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.5F, 6.9F, -3.6F, 3, 1, 1, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F, -.2F, -.15F, -.5F, .3F, -.15F, -.1F, .3F, -.15F, 0F, -.2F, -.15F, 0F); // Box 29
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(2F, 6.9F, -4.5F, 3, 5, 2, 0F, -.6F, -1F, -.6F, -.6F, -1F, -1.2F, -.9F, -1F, 0F, -.3F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -1.2F, -.9F, -1F, 0F, -.3F, -1F, -.6F); // Box 30
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2F, 6.2F, -4.5F, 3, 3, 2, 0F, -.5F, -1F, -.5F, -.5F, -1F, -1.1F, -.8F, -1F, .1F, -.2F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -1.1F, -.8F, -1F, .1F, -.2F, -1F, -.5F); // Box 32
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-0.2F, 6.9F, -4.7F, 3, 5, 2, 0F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F); // Box 35
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-0.2F, 6.2F, -4.7F, 3, 3, 2, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F); // Box 36
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.5F, 1F, -3.83F, 5, 3, 1, 0F, -1.5F, -1F, -.75F, -1.5F, -1F, -.48F, -1.5F, -1F, -.48F, -1.5F, -1F, -.23F, -1.5F, -1F, -.75F, -1.5F, -1F, -.48F, -1.5F, -1F, -.48F, -1.5F, -1F, -.23F); // Box 37
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.8F, 6.2F, -3.8F, 3, 3, 2, 0F, -.2F, -1F, -.5F, -.8F, -1F, .1F, -.5F, -1F, -1.1F, -.5F, -1F, -.5F, -.2F, -1F, -.5F, -.8F, -1F, .1F, -.5F, -1F, -1.1F, -.5F, -1F, -.5F); // Box 42
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4.8F, 6.9F, -3.8F, 3, 5, 2, 0F, -.3F, -1F, -.6F, -.9F, -1F, 0F, -.6F, -1F, -1.2F, -.6F, -1F, -.6F, -.3F, -1F, -.6F, -.9F, -1F, 0F, -.6F, -1F, -1.2F, -.6F, -1F, -.6F); // Box 43
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2.8F, 6.9F, -4.7F, 3, 5, 2, 0F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F, -.6F, -1F, -.6F); // Box 44
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2.8F, 6.2F, -4.7F, 3, 3, 2, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, -.5F); // Box 45
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.5F, 1.9F, 3F, 7, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F); // Box 46
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.5F, -0.1F, 3F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 47
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.5F, 9.6F, -2.6F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4.5F, 9.6F, 2F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4.5F, 7.6F, 2F, 9, 1, 2, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, -.4F); // Box 50
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 7.6F, -2.6F, 8, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0.7F, 2.9F, -4.5F, 3, 4, 2, 0F, -.8F, -1F, -.6F, -.8F, -1F, -.6F, -.8F, -1F, -.6F, -.8F, -1F, -.6F, -.8F, -1F, -.6F, -.8F, -1F, -.6F, -.8F, -1F, -.6F, -.8F, -1F, -.6F); // Box 52
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(2.5F, 3.9F, -4F, 1, 2, 1, 0F, -.3F, .05F, .05F, -.3F, .05F, .05F, -.3F, .05F, .05F, -.3F, .05F, .05F, -.3F, .05F, .05F, -.3F, .05F, .05F, -.3F, .05F, .05F, -.3F, .05F, .05F); // Box 53
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(2.2F, 2.9F, -4F, 1, 1, 1, 0F, -.43F, .5F, -.43F, -.43F, .5F, -.43F, -.43F, .5F, -.43F, -.43F, .5F, -.43F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Box 54
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1.3F, 1.7F, -3.7F, 1, 1, 1, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(1.2F, 1.9F, -4F, 1, 2, 1, 0F, -.41F, 0F, -.41F, -.41F, 0F, -.41F, -.41F, 0F, -.41F, -.41F, 0F, -.41F, -.41F, 0F, -.41F, -.41F, 0F, -.41F, -.41F, 0F, -.41F, -.41F, 0F, -.41F); // Box 0
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(1F, 3.3F, -4F, 1, 1, 1, 0F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F); // Box 1
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(0.9F, 3.3F, -4F, 1, 3, 1, 0F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F, -.41F); // Box 2
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(1F, 5.48F, -4F, 2, 1, 1, 0F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F, -.3F, -.41F, -.41F); // Box 3
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.5F, 10.9F, 2.5F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F); // Box 4
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-3F, 6.8F, 3.2F, 6, 3, 1, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 5
		bodyModel[61].setRotationPoint(0F, 1F, 0F);

		bodyModel[62].addShapeBox(-3F, 6.8F, 3.2F, 6, 1, 1, 0F, .1F, .1F, .4F, .1F, .1F, .4F, .1F, .1F, .4F, .1F, .1F, .4F, .1F, 0F, .4F, .1F, 0F, .4F, .1F, 0F, .4F, .1F, 0F, .4F); // Box 6
		bodyModel[62].setRotationPoint(0F, 1F, 0F);

		bodyModel[63].addShapeBox(2.7F, 6.2F, 3.2F, 3, 3, 2, 0F, -.2F, -1F, -.5F, -1.5F, -1F, .8F, -.8F, -1F, -2.2F, -.8F, -1F, -.8F, -.2F, -1F, -.5F, -1.5F, -1F, .8F, -.8F, -1F, -2.2F, -.8F, -1F, -.8F); // Box 11
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(2.7F, 7.2F, 3.2F, 3, 4, 2, 0F, -.3F, -1F, -.4F, -1.6F, -1F, .8F, -.9F, -1F, -2.1F, -.9F, -1F, -.9F, -.3F, -1F, -.4F, -1.6F, -1F, .7F, -.9F, -1F, -2.1F, -.9F, -1F, -.9F); // Box 15
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-5.3F, 6.2F, 1.5F, 3, 3, 2, 0F, -.8F, -1F, -.8F, -.8F, -1F, -2.2F, -1.5F, -1F, .8F, -.2F, -1F, -.5F, -.8F, -1F, -.8F, -.8F, -1F, -2.2F, -1.5F, -1F, .8F, -.2F, -1F, -.5F); // Box 17
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-5.25F, 7.2F, 1.4F, 3, 4, 2, 0F, -.9F, -1F, -.9F, -.9F, -1F, -2.1F, -1.6F, -1F, .8F, -.3F, -1F, -.4F, -.9F, -1F, -.9F, -.9F, -1F, -2.1F, -1.6F, -1F, .7F, -.3F, -1F, -.4F); // Box 18
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-2.5F, -0.5F, 2.91F, 5, 3, 1, 0F, -1.5F, -1F, -.2F, -1.5F, -1F, -.2F, -1.5F, -1F, -.74F, -1.5F, -1F, -.74F, -1.5F, -1F, -.48F, -1.5F, -1F, -.48F, -1.5F, -1F, -.48F, -1.5F, -1F, -.48F); // Box 19
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4F, 10.9F, -2F, 8, 1, 4, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .2F, .1F, .2F, .2F, .1F, .2F, .2F, .1F, .2F, .2F, .1F, .2F); // Box 0
		bodyModel[68].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Box 20
		leftArmModel[2] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Box 21
		leftArmModel[3] = new ModelRendererTurbo(this, 54, 74, textureX, textureY); // Box 22
		leftArmModel[4] = new ModelRendererTurbo(this, 54, 68, textureX, textureY); // Box 23

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 5, 4, 0F, .15F, 0F, .05F, .1F, 0F, .05F, .1F, 0F, .05F, .1F, 0F, .05F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .3F, .1F, 0F, .3F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2.9F, -2F, 4, 4, 4, 0F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .3F, .1F, 0F, .3F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .05F, .1F, 0F, .05F); // Box 20
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6.7F, -2F, 4, 1, 4, 0F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F); // Box 21
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 7.9F, -2F, 4, 2, 4, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Box 22
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1F, 7.8F, -2F, 2, 1, 4, 0F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 23
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[5];
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		rightArmModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		rightArmModel[2] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Box 26
		rightArmModel[3] = new ModelRendererTurbo(this, 33, 74, textureX, textureY); // Box 27
		rightArmModel[4] = new ModelRendererTurbo(this, 33, 68, textureX, textureY); // Box 28

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 5, 4, 0F, .15F, 0F, .05F, .15F, 0F, .05F, .15F, 0F, .05F, .15F, 0F, .05F, .15F, 0F, .1F, .15F, 0F, .1F, .15F, 0F, .3F, .15F, 0F, .3F); // Box 24
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.9F, -2F, 4, 4, 4, 0F, .15F, 0F, .1F, .15F, 0F, .1F, .15F, 0F, .3F, .15F, 0F, .3F, .15F, 0F, .1F, .15F, 0F, .1F, .15F, 0F, .05F, .15F, 0F, .05F); // Box 25
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 6.7F, -2F, 4, 1, 4, 0F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F); // Box 26
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 7.9F, -2F, 4, 2, 4, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, .2F); // Box 27
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 7.8F, -2F, 2, 1, 4, 0F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 28
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[12];
		leftLegModel[0] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 4
		leftLegModel[1] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 1
		leftLegModel[2] = new ModelRendererTurbo(this, 54, 82, textureX, textureY); // Box 2
		leftLegModel[3] = new ModelRendererTurbo(this, 2, 4, textureX, textureY); // Box 3
		leftLegModel[4] = new ModelRendererTurbo(this, 54, 90, textureX, textureY); // Box 6
		leftLegModel[5] = new ModelRendererTurbo(this, 96, 36, textureX, textureY); // Box 7
		leftLegModel[6] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 8
		leftLegModel[7] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 9
		leftLegModel[8] = new ModelRendererTurbo(this, 96, 31, textureX, textureY); // Box 10
		leftLegModel[9] = new ModelRendererTurbo(this, 96, 43, textureX, textureY); // Box 11
		leftLegModel[10] = new ModelRendererTurbo(this, 77, 61, textureX, textureY); // Box 12
		leftLegModel[11] = new ModelRendererTurbo(this, 77, 55, textureX, textureY); // Box 13

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 5, 4, 0F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .1F, .1F, 0F, .1F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4.9F, -2F, 4, 4, 4, 0F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .1F, .1F, 0F, .1F, .05F, 0F, .1F, .05F, 0F, .1F, .05F, 0F, .1F, .05F, 0F, .1F); // Box 1
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9.05F, -2F, 4, 3, 4, 0F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F); // Box 2
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 8.5F, -2F, 4, 1, 4, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 3
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1F, 9.5F, -2F, 2, 2, 1, 0F, .05F, 0F, .07F, .05F, 0F, .07F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .07F, .05F, 0F, .07F, .05F, 0F, .05F, .05F, 0F, .05F); // Box 6
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 3.9F, -3F, 4, 3, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 3.9F, -2.2F, 4, 1, 4, 0F, .2F, -.2F, .1F, .2F, -.2F, .1F, .2F, -.2F, .4F, .2F, -.2F, .4F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F); // Box 8
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 5.9F, -2.2F, 4, 1, 4, 0F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F); // Box 9
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 2.9F, -3F, 4, 1, 1, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 6.9F, -3F, 4, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 11
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(1.3F, 0.9F, -1.5F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(1.3F, 0.9F, -1.5F, 1, 1, 3, 0F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Box 13
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[16];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		rightLegModel[1] = new ModelRendererTurbo(this, 88, 63, textureX, textureY); // Box 16
		rightLegModel[2] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 17
		rightLegModel[3] = new ModelRendererTurbo(this, 96, 31, textureX, textureY); // Box 18
		rightLegModel[4] = new ModelRendererTurbo(this, 96, 36, textureX, textureY); // Box 19
		rightLegModel[5] = new ModelRendererTurbo(this, 96, 43, textureX, textureY); // Box 20
		rightLegModel[6] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 21
		rightLegModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		rightLegModel[8] = new ModelRendererTurbo(this, 2, 4, textureX, textureY); // Box 23
		rightLegModel[9] = new ModelRendererTurbo(this, 34, 82, textureX, textureY); // Box 24
		rightLegModel[10] = new ModelRendererTurbo(this, 34, 90, textureX, textureY); // Box 25
		rightLegModel[11] = new ModelRendererTurbo(this, 88, 54, textureX, textureY); // Box 29
		rightLegModel[12] = new ModelRendererTurbo(this, 88, 54, textureX, textureY); // Box 30
		rightLegModel[13] = new ModelRendererTurbo(this, 88, 63, textureX, textureY); // Box 31
		rightLegModel[14] = new ModelRendererTurbo(this, 88, 63, textureX, textureY); // Box 32
		rightLegModel[15] = new ModelRendererTurbo(this, 96, 63, textureX, textureY); // Box 33

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 5, 4, 0F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .2F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .1F, .2F, 0F, .1F); // Box 14
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.5F, 0.9F, -1.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 3.9F, -2.2F, 4, 1, 4, 0F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F); // Box 17
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 2.9F, -3F, 4, 1, 1, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 3.9F, -3F, 4, 3, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 6.9F, -3F, 4, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 20
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.1F, 5.9F, -2.2F, 4, 1, 4, 0F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F, .2F, -.2F, .1F, .25F, -.2F, .1F, .25F, -.2F, .4F, .2F, -.2F, .4F); // Box 21
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 4.9F, -2F, 4, 4, 4, 0F, .2F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .1F, .2F, 0F, .1F, .05F, 0F, .1F, .05F, 0F, .1F, .05F, 0F, .1F, .05F, 0F, .1F); // Box 22
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 8.5F, -2F, 4, 1, 4, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 23
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 9.05F, -2F, 4, 3, 4, 0F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .05F); // Box 24
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-1F, 9.5F, -2F, 2, 2, 1, 0F, .05F, 0F, .07F, .05F, 0F, .07F, .05F, 0F, .05F, .05F, 0F, .05F, .05F, 0F, .07F, .05F, 0F, .07F, .05F, 0F, .05F, .05F, 0F, .05F); // Box 25
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.1F, 1.9F, -2.2F, 4, 1, 4, 0F, .15F, -.2F, .05F, .2F, -.2F, .05F, .2F, -.2F, .05F, .15F, -.2F, .05F, .15F, -.2F, .05F, .2F, -.2F, .05F, .2F, -.2F, .05F, .15F, -.2F, .05F); // Box 29
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2.1F, 0.9F, -2.2F, 4, 1, 4, 0F, .15F, -.2F, .05F, .2F, -.2F, .05F, .2F, -.2F, .05F, .15F, -.2F, .05F, .15F, -.2F, .05F, .2F, -.2F, .05F, .2F, -.2F, .05F, .15F, -.2F, .05F); // Box 30
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-2.5F, 0.9F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 31
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2.5F, -0.0999999999999996F, -1.5F, 1, 1, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2.5F, -0.5F, -1F, 1, 1, 2, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Box 33
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);


	}
}