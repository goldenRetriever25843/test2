//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
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
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model12cm extends ModelAAGun
{
	int textureX = 512;
	int textureY = 512;

	public Model12cm()	
	{


// Base
		baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // BS.Base


		baseModel[0].addBox(-8F, 0F, -8F, 16, 8, 16, 0F); // BS.Base
		baseModel[0].setRotationPoint(0F, -8F, 0F);		
		


// Seat
		seatModel = new ModelRendererTurbo[8];
		seatModel[0] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // ST.LeftShield
		seatModel[1] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // ST.RightShield
		seatModel[2] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // ST.FrontShield
		seatModel[3] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // ST.JointHolder
		seatModel[4] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // ST.Floor
		seatModel[5] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // ST.FrontRightShield
		seatModel[6] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // ST.FrontLeftShield
		seatModel[7] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // ST.FrontTopShield


		seatModel[0].addBox(-14F, 0F, -13F, 24, 28, 1, 0F); // ST.LeftShield
		seatModel[0].setRotationPoint(0F, -36F, 0F);

		seatModel[1].addBox(-14F, 0F, 12F, 24, 28, 1, 0F); // ST.RightShield
		seatModel[1].setRotationPoint(0F, -36F, 0F);

		seatModel[2].addBox(10F, 0F, -12F, 1, 10, 24, 0F); // ST.FrontShield
		seatModel[2].setRotationPoint(0F, -18F, 0F);

		seatModel[3].addBox(-2F, 0F, -2F, 12, 4, 4, 0F); // ST.JointHolder
		seatModel[3].setRotationPoint(0F, -20F, 0F);

		seatModel[4].addBox(-10F, 0F, -12F, 20, 1, 24, 0F); // ST.Floor
		seatModel[4].setRotationPoint(0F, -9F, 0F);

		seatModel[5].addBox(10F, 0F, 3F, 1, 14, 9, 0F); // ST.FrontRightShield
		seatModel[5].setRotationPoint(0F, -32F, 0F);

		seatModel[6].addBox(10F, 0F, -12F, 1, 14, 9, 0F); // ST.FrontLeftShield
		seatModel[6].setRotationPoint(0F, -32F, 0F);

		seatModel[7].addBox(10F, 0F, -12F, 1, 4, 24, 0F); // ST.FrontTopShield
		seatModel[7].setRotationPoint(0F, -36F, 0F);		
		


// Gun
		gunModel = new ModelRendererTurbo[3];
		gunModel[0] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // BL.Barrel
		gunModel[1] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // BL.ChinuthingLeft
		gunModel[2] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // BL.ChinuthingRight


		gunModel[0].addBox(-30F, -2.5F, -2.5F, 100, 5, 5, 0F); // BL.Barrel
		gunModel[0].setRotationPoint(0F, -220F, 0F);

		gunModel[1].addBox(-24F, -7F, -5F, 26, 4, 4, 0F); // BL.ChinuthingLeft
		gunModel[1].setRotationPoint(0F, -22F, 0F);

		gunModel[2].addBox(-24F, -7F, 1F, 26, 4, 4, 0F); // BL.ChinuthingRight
		gunModel[2].setRotationPoint(0F, -22F, 0F);		
		
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