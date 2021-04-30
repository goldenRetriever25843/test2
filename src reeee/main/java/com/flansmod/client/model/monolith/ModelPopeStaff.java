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

public class ModelPopeStaff extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelPopeStaff()	
	{


// Gun
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.Rod
		gunModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.TransitiontoRod
		gunModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.TransitiontoCross
		gunModel[3] = new ModelRendererTurbo(this,  250,  0, textureX, textureY); // CR.BottomRightCross
		gunModel[4] = new ModelRendererTurbo(this,  250,  0, textureX, textureY); // CR.BottomRightCross
		gunModel[5] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // CR.CrossCenter
		gunModel[6] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // CR.CrossTopRight
		gunModel[7] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // CR.CrossBottomRight
		gunModel[8] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // CR.CrossBottomLeft
		gunModel[9] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // CR.CrossTopLeft
		gunModel[10] = new ModelRendererTurbo(this,  150,  0, textureX, textureY); // CR.TopLeftCross
		gunModel[11] = new ModelRendererTurbo(this,  150,  0, textureX, textureY); // CR.TopRightCross
		gunModel[12] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // CR.TopCrossNub
		gunModel[13] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // CR.RightCrossNub
		gunModel[14] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // CR.LeftCrossNub

		gunModel[0].addBox(-1F, 1F, -1F, 2, 64, 2, 0F); // CR.Rod
		gunModel[0].setRotationPoint(0F, -25F, 0F);

		gunModel[1].addBox(-1.5F, 0F, -1.5F, 3, 1, 3, 0F); // CR.TransitiontoRod
		gunModel[1].setRotationPoint(0F, -25F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // CR.TransitiontoCross
		gunModel[2].setRotationPoint(-1.5F, -30F, -1.5F);

		gunModel[3].addBox(0F, 0F, -1F, 2, 12, 3, 0F); // CR.BottomRightCross
		gunModel[3].setRotationPoint(-1F, -42F, 0F);
		gunModel[3].rotateAngleX = 0.05235988F;

		gunModel[4].addBox(0F, 0F, -2F, 2, 12, 3, 0F); // CR.BottomRightCross
		gunModel[4].setRotationPoint(-1F, -42F, 0F);
		gunModel[4].rotateAngleX = -0.05235988F;

		gunModel[5].addBox(0F, -2.5F, -2.5F, 2, 5, 5, 0F); // CR.CrossCenter
		gunModel[5].setRotationPoint(-1F, -44.5F, 0F);

		gunModel[6].addBox(0F, -1F, 2F, 2, 3, 8, 0F); // CR.CrossTopRight
		gunModel[6].setRotationPoint(-1F, -45F, 0F);
		gunModel[6].rotateAngleX = 0.05235988F;

		gunModel[7].addBox(0F, -1F, 2F, 2, 3, 8, 0F); // CR.CrossBottomRight
		gunModel[7].setRotationPoint(-1F, -45F, 0F);
		gunModel[7].rotateAngleX = -0.05235988F;

		gunModel[8].addBox(0F, -1F, -10F, 2, 3, 8, 0F); // CR.CrossBottomLeft
		gunModel[8].setRotationPoint(-1F, -45F, 0F);
		gunModel[8].rotateAngleX = 0.05235988F;

		gunModel[9].addBox(0F, -1F, -10F, 2, 3, 8, 0F); // CR.CrossTopLeft
		gunModel[9].setRotationPoint(-1F, -45F, 0F);
		gunModel[9].rotateAngleX = -0.05235988F;

		gunModel[10].addBox(0F, -10F, -1.5F, 2, 8, 3, 0F); // CR.TopLeftCross
		gunModel[10].setRotationPoint(-1F, -45F, 0F);
		gunModel[10].rotateAngleX = 0.05235988F;

		gunModel[11].addBox(0F, -10F, -1.5F, 2, 8, 3, 0F); // CR.TopRightCross
		gunModel[11].setRotationPoint(-1F, -45F, 0F);
		gunModel[11].rotateAngleX = -0.05235988F;

		gunModel[12].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // CR.TopCrossNub
		gunModel[12].setRotationPoint(0F, -56F, 0F);

		gunModel[13].addBox(-0.5F, 0F, 10F, 1, 1, 1, 0F); // CR.RightCrossNub
		gunModel[13].setRotationPoint(0F, -45F, 0F);

		gunModel[14].addBox(-0.5F, 0F, -11F, 1, 1, 1, 0F); // CR.LeftCrossNub
		gunModel[14].setRotationPoint(0F, -45F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  50,  0, textureX, textureY); // AM.Orb

		ammoModel[0].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // AM.Orb
		ammoModel[0].setRotationPoint(-2F, -29F, -2F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.END_LOADED;
		
		translateAll(0, 12, 0);

		flipAll();
	}
}