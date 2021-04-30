//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelshield extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public Modelshield()	
	{


// Gun
		gunModel = new ModelRendererTurbo[1];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shield

		gunModel[0].addBox(0F, 0F, 0F, 1, 22, 12, 0F); // Shield
		gunModel[0].setRotationPoint(1F, -7F, -6F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}