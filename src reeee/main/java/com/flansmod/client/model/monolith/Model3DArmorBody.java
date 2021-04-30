//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model3DArmorBody extends ModelCustomArmour
{
	int textureX = 128;
	int textureY = 64;

	public Model3DArmorBody()
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 32, 32, textureX, textureY); // Import ImportImportBody

		bodyModel[0].addShapeBox(-8F, -0.1F, -4F, 16, 24, 8, 0F, -3.9F, 0F, -1.9F, -3.9F, 0F, -1.9F, -3.9F, 0F, -1.9F, -3.9F, 0F, -1.9F, -3.9F, -11.9F, -1.9F, -3.9F, -11.9F, -1.9F, -3.9F, -11.9F, -1.9F, -3.9F, -11.9F, -1.9F); // Import ImportImportBody
		bodyModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 80, 32, textureX, textureY); // Import ImportImportBox3
	

		rightArmModel[0].addShapeBox(-5F, -2.1F, -4F, 8, 24, 8, 0F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F); // Import ImportImportBox3
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		
		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 80, 32, textureX, textureY); // Import ImportImportBox3
		

		leftArmModel[0].addShapeBox(-3F, -2.1F, -4F, 8, 24, 8, 0F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F); // Import ImportBox0
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import ImportImportBox4

		leftLegModel[0].addShapeBox(-4F, 0.1F, -4F, 8, 24, 8, 0F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F); // Import ImportImportBox4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import ImportBox1

		rightLegModel[0].addShapeBox(-4F, 0.1F, -4F, 8, 24, 8, 0F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F, -1.9F, -12F, -1.9F); // Import ImportBox1
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


	}
}