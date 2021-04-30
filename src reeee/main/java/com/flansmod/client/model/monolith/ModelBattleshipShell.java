//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BattleshipShell
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBattleshipShell extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelBattleshipShell()
	{
		battleshipshellModel = new ModelRendererTurbo[8];
		battleshipshellModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox8
		battleshipshellModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportBox12
		battleshipshellModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box8
		battleshipshellModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box9
		battleshipshellModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box10
		battleshipshellModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box11
		battleshipshellModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box12
		battleshipshellModel[7] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box13

		battleshipshellModel[0].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F); // Import ImportBox8
		battleshipshellModel[0].setRotationPoint(-1.05F, -14.02F, 0.05F);

		battleshipshellModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Import ImportBox12
		battleshipshellModel[1].setRotationPoint(0.05F, 4.05F, 0.05F);

		battleshipshellModel[2].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Import Box8
		battleshipshellModel[2].setRotationPoint(-1.05F, -14.02F, -1.05F);

		battleshipshellModel[3].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		battleshipshellModel[3].setRotationPoint(0.05F, -14.02F, -1.05F);

		battleshipshellModel[4].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F); // Import Box10
		battleshipshellModel[4].setRotationPoint(0.05F, -14.02F, 0.05F);

		battleshipshellModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		battleshipshellModel[5].setRotationPoint(0.05F, 4.05F, -1.05F);

		battleshipshellModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Import Box12
		battleshipshellModel[6].setRotationPoint(-1.05F, 4.05F, -1.05F);

		battleshipshellModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F); // Import Box13
		battleshipshellModel[7].setRotationPoint(-1.05F, 4.05F, 0.05F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			battleshipshellModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo battleshipshellModel[];
}