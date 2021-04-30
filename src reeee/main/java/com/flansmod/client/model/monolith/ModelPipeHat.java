//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPipeHat extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelPipeHat()
	{
		headModel = new ModelRendererTurbo[6];
		headModel[0] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Pipe Base
		headModel[1] = new ModelRendererTurbo(this, 40, 40, textureX, textureY); // Pipe
		headModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Hat Band
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Hat Top
		headModel[4] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 3
		headModel[5] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Medal

		headModel[0].addShapeBox(0.5F, -1.5F, -5F, 0, 0, 1, 0F,.4F, .4F, 3F,.4F, .4F, 3F,.3F, .3F, 0F,.3F, .3F, 0F,.4F, .4F, 3F,.4F, .4F, 3F,.3F, .3F, 0F,.3F, .3F, 0F); // Pipe Base
		headModel[0].setRotationPoint(0F, 0F, 0F);
		headModel[0].rotateAngleX = 0.08726646F;
		headModel[0].rotateAngleY = 0.2443461F;

		headModel[1].addShapeBox(0.5F, -1.5F, -8.6F, 0, 0, 0, 0F,.7F, 1.2F, .7F,.7F, 1.2F, .7F,.7F, 1.2F, .7F,.7F, 1.2F, .7F,.6F, .5F, .6F,.6F, .5F, .6F,.6F, .5F, .6F,.6F, .5F, .6F); // Pipe
		headModel[1].setRotationPoint(0F, 0F, 0F);
		headModel[1].rotateAngleX = 0.08726646F;
		headModel[1].rotateAngleY = 0.2443461F;

		headModel[2].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,.2F, 0F, .2F,.2F, 0F, .2F,.2F, 0F, .2F,.2F, 0F, .2F,.2F, 0F, .2F,.2F, 0F, .2F,.2F, 0F, .2F,.2F, 0F, .2F); // Hat Band
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,1F, 1.2F, 2F,1F, 1.2F, 2F,.8F, 0F, 2F,.8F, 0F, 2F,.3F, 0F, .3F,.3F, 0F, .3F,.3F, .2F, .3F,.3F, .2F, .3F); // Hat Top
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6F, -5F, 8, 0, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, .5F, 2F,0F, .5F, 2F,.5F, .5F, 1F,.5F, .5F, 1F); // Box 3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addBox(-0.5F, -7.5F, -4.4F, 1, 1, 1, 0F); // Medal
		headModel[5].setRotationPoint(0F, 0F, 0F);


	}
}
