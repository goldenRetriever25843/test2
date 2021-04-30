//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.5
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

public class ModelType382 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelType382()	
	{


// Gun
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // GN.Core
		gunModel[1] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.HandGuard
		gunModel[2] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.CoreLowerAngle
		gunModel[3] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.TriggerArea
		gunModel[4] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.Stock/GunBridge
		gunModel[5] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // GN.StockTop
		gunModel[6] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.StockBottom
		gunModel[7] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.MetalPart
		gunModel[8] = new ModelRendererTurbo(this,  0,  387, textureX, textureY); // GN.EnergyStorage
		gunModel[9] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // SL.IronSight
		gunModel[10] = new ModelRendererTurbo(this,  0,  240, textureX, textureY);

		gunModel[0].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // GN.Core
		gunModel[0].setRotationPoint(0F, -4F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 10, 3, 2, 0F); // GN.HandGuard
		gunModel[1].setRotationPoint(12F, -4.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // GN.CoreLowerAngle
		gunModel[2].setRotationPoint(6F, -3F, -1F);
		gunModel[2].rotateAngleZ = 0.1745329F;

		gunModel[3].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // GN.TriggerArea
		gunModel[3].setRotationPoint(0F, -1F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // GN.Stock/GunBridge
		gunModel[4].setRotationPoint(-5F, -2F, -1F);
		gunModel[4].rotateAngleZ = 0.2617994F;

		gunModel[5].addBox(0F, 0F, 0F, 10, 3, 2, 0F); // GN.StockTop
		gunModel[5].setRotationPoint(-13F, -2.5F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // GN.StockBottom
		gunModel[6].setRotationPoint(-13F, 0F, -1F);
		gunModel[6].rotateAngleZ = 0.296706F;

		gunModel[7].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // GN.MetalPart
		gunModel[7].setRotationPoint(1F, -5F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // GN.EnergyStorage
		gunModel[8].setRotationPoint(22F, -3.6F, -1.5F);		
			
				
		
		gunModel[9].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // SL.IronSight
		gunModel[9].setRotationPoint(32F, -6F, 0F);
		
		gunModel[10].addBox(0F, 0F, 0F, 12, 1, 1, 0F);
		gunModel[10].setRotationPoint(22F, -4.2F, -0.5F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[6];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // SC.ScopeBase
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SC.ScopeBottomLeft
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SC.ScopeBottomRight
		defaultScopeModel[3] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SC.ScopeTopLeft
		defaultScopeModel[4] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SC.ScopeTopRight
		defaultScopeModel[5] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // SC.ScopeFront

		defaultScopeModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // SC.ScopeBase
		defaultScopeModel[0].setRotationPoint(3F, -5.8F, -0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // SC.ScopeBottomLeft
		defaultScopeModel[1].setRotationPoint(2.5F, -6.8F, -0.3F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // SC.ScopeBottomRight
		defaultScopeModel[2].setRotationPoint(2.5F, -6.8F, -0.7F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // SC.ScopeTopLeft
		defaultScopeModel[3].setRotationPoint(2.5F, -7.1F, -0.3F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // SC.ScopeTopRight
		defaultScopeModel[4].setRotationPoint(2.5F, -7.1F, -0.7F);

		defaultScopeModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // SC.ScopeFront
		defaultScopeModel[5].setRotationPoint(7F, -7.4F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // AM.Magazine

		ammoModel[0].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // AM.Magazine
		ammoModel[0].setRotationPoint(4F, 0F, -0.5F);

		scopeAttachPoint = new Vector3f(5F / 16F, 5F / 16F, 0F);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 9F, 3F / 14F, 0F);
		
		gripAttachPoint = new Vector3f(12F / 12F, 2.5F / 16F, 0F);


// Slid


// Pump
		pumpModel = new ModelRendererTurbo[1];
		pumpModel[0] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // PM.Bolt

		pumpModel[0].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // PM.Bolt
		pumpModel[0].setRotationPoint(6F, -3F, 1F);

		

		gunSlideDistance = -0.5F;
		animationType = EnumAnimationType.SHOTGUN;
		pumpDelayAfterReload = 115;
		pumpDelay = 6;
		pumpTime = 9;
		gripIsOnPump = false;

		flipAll();
	}
}