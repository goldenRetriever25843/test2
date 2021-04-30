//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCannon extends ModelAAGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelCannon()	
	{


// Base
		baseModel = new ModelRendererTurbo[4];
		baseModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // BS.WheelRight
		baseModel[1] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // BS.WheelLeft
		baseModel[2] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // BS.Axle
		baseModel[3] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // BS.SpinalChord


		baseModel[0].addBox(0F, 0F, 0F, 20, 20, 2, 0F); // BS.WheelRight
		baseModel[0].setRotationPoint(-10F, -20F, 15F);

		baseModel[1].addBox(0F, 0F, 0F, 20, 20, 2, 0F); // BS.WheelLeft
		baseModel[1].setRotationPoint(-10F, -20F, -17F);

		baseModel[2].addBox(0F, 0F, 0F, 2, 2, 30, 0F); // BS.Axle
		baseModel[2].setRotationPoint(-1F, -11F, -15F);

		baseModel[3].addBox(0F, 0F, 0F, 2, 13, 2, 0F); // BS.SpinalChord
		baseModel[3].setRotationPoint(-1F, -24F, -1F);		
		


// Seat
		seatModel = new ModelRendererTurbo[4];
		seatModel[0] = new ModelRendererTurbo(this,  0,  325, textureX, textureY); // ST.BottomThing
		seatModel[1] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // ST.HorizontalConnector
		seatModel[2] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // ST.VerticalConnector
		seatModel[3] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // ST.Seat


		seatModel[0].addBox(-1F, 0F, -3F, 32, 1, 6, 0F); // ST.BottomThing
		seatModel[0].setRotationPoint(0F, -25F, 0F);

		seatModel[1].addBox(-13F, 0F, -1F, 12, 2, 2, 0F); // ST.HorizontalConnector
		seatModel[1].setRotationPoint(0F, -15F, 0F);

		seatModel[2].addBox(-15F, -7F, -1F, 2, 9, 2, 0); // ST.VerticalConnector
		seatModel[2].setRotationPoint(0F, -15F, 0F);

		seatModel[3].addBox(-18F, 0F, -4F, 8, 1, 8, 0); // ST.Seat
		seatModel[3].setRotationPoint(0F, -23F, 0F);		
		


// Gun
		gunModel = new ModelRendererTurbo[1];
		gunModel[0] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // GN.Cannon


		gunModel[0].addBox(-5F, -33F, -4F, 30, 8, 8, 0.0F); // GN.Cannon
		
// Barrel
		barrelModel = new ModelRendererTurbo[0][0];
		
		
// Ammo
		ammoModel = new ModelRendererTurbo[0][0];
		
		
		barrelX = 0;
		barrelY = 0;
		barrelZ = 0;
		
		
		flipAll();
	}
}