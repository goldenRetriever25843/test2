//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
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

public class ModelCrappy extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelCrappy()	
	{


// Gun
		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Barrel
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.Body
		gunModel[2] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.Stock
		gunModel[3] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // GN.Stock2

		gunModel[0].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // GN.Barrel
		gunModel[0].setRotationPoint(1F, 0F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 10, 2, 2, 0); // GN.Body
		gunModel[1].setRotationPoint(0F, 0.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // GN.Stock
		gunModel[2].setRotationPoint(-6F, 1F, -1F);
		gunModel[2].rotateAngleZ = -0;

		gunModel[3].addBox(0F, 0F, 0F, 7, 2, 2, 0); // GN.Stock2
		gunModel[3].setRotationPoint(-6F, 3F, -1F);
		gunModel[3].rotateAngleZ = -6;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // AM.Bullet

		ammoModel[0].addBox(0F, 0F, -0.5F, 2, 1, 1, 0); // AM.Bullet
		ammoModel[0].setRotationPoint(2F, 1F, 0F);

		scopeAttachPoint = new Vector3f(15F / 30F, 5F / 16F, 0F);
		
		barrelAttachPoint = new Vector3f(20F / 16F, 5F / 18F, 0F);
		
		gripAttachPoint = new Vector3f(25F / 50F, 3F / 16F, 0F);


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;

		flipAll();
		translateAll(0, 5, 0);
	}
}