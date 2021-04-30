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
public class ModelBananaRocket extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBananaRocket()	
	{


// Gun
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Handle
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.HandleForwarde
		gunModel[2] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.FrontHandle
		gunModel[3] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // GN.Bottom
		gunModel[4] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // GN.Left
		gunModel[5] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // GN.Right
		gunModel[6] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // GN.Top

		gunModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // GN.Handle
		gunModel[0].setRotationPoint(0F, -0.5F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 6, 1, 1, 0); // GN.HandleForwarde
		gunModel[1].setRotationPoint(0F, -0.5F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.FrontHandle
		gunModel[2].setRotationPoint(15F, -0.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 25, 1, 2, 0); // GN.Bottom
		gunModel[3].setRotationPoint(-5F, -1.5F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // GN.Left
		gunModel[4].setRotationPoint(-5F, -3.5F, -2F);

		gunModel[5].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // GN.Right
		gunModel[5].setRotationPoint(-5F, -3.5F, 1F);

		gunModel[6].addBox(0F, 0F, 0F, 25, 1, 2, 0); // GN.Top
		gunModel[6].setRotationPoint(-5F, -4.5F, -1F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SC.ScopeBottom
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // SC.ScopeTop

		defaultScopeModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0); // SC.ScopeBottom
		defaultScopeModel[0].setRotationPoint(11F, -5F, -0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // SC.ScopeTop
		defaultScopeModel[1].setRotationPoint(15F, -6.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // AM.Banana

		ammoModel[0].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // AM.Banana
		ammoModel[0].setRotationPoint(13F, -3.5F, -1F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.END_LOADED;

		flipAll();
		translateAll(0, 1, 0);
	}
}