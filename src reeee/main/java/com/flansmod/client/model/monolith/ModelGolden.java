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

public class ModelGolden extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelGolden()	
	{


// Gun
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.ThingyLeft
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.ThingyRight
		gunModel[2] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.ThingyTopLeft
		gunModel[3] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.ThingyTopRight
		gunModel[4] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.Triggerthing?

		gunModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.ThingyLeft
		gunModel[0].setRotationPoint(0F, 0F, -0.6F);

		gunModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.ThingyRight
		gunModel[1].setRotationPoint(0F, 0F, -0.4F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.ThingyTopLeft
		gunModel[2].setRotationPoint(0F, -0.5F, -0.6F);

		gunModel[3].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.ThingyTopRight
		gunModel[3].setRotationPoint(0F, -0.5F, -0.4F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // GN.Triggerthing?
		gunModel[4].setRotationPoint(2.2F, 0.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // AM.Grip

		ammoModel[0].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // AM.Grip
		ammoModel[0].setRotationPoint(0.4F, 0.8F, -0.5F);



// Slide
		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // SL.Barrel
		slideModel[1] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // SL.GoldSight

		slideModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0); // SL.Barrel
		slideModel[0].setRotationPoint(3F, -0.1F, -0.5F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // SL.GoldSight
		slideModel[1].setRotationPoint(6.8F, -0.3F, 0F);

		


		gunSlideDistance = 0.1F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
		translateAll(0, 4, 0);
	}
}