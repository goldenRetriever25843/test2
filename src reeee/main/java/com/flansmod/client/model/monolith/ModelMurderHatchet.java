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

public class ModelMurderHatchet extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMurderHatchet()	
	{


// Gun
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Handle
		gunModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // HandleBottom
		gunModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // HandleMetalBand
		gunModel[3] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // HandleMetalBand
		gunModel[4] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // BladeMain
		gunModel[5] = new ModelRendererTurbo(this,  300,  0, textureX, textureY); // BladeLowerConnection
		gunModel[6] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // BladeFront
		gunModel[7] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // PointyPart1
		gunModel[8] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // PointyPart2
		gunModel[9] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // FrontPointy
		gunModel[10] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // BladeFrontLeftAngle
		gunModel[11] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // BladeFrontLeftAngle
		gunModel[12] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // PointyPartFiller
		gunModel[13] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // MoarPointyTop
		gunModel[14] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // MoarPointyBottom
		gunModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BottomHandle
		gunModel[16] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BottomHandleAngle

		gunModel[0].addBox(0F, 0F, 0F, 6, 32, 4, 0F); // Handle
		gunModel[0].setRotationPoint(-2F, -17F, -2F);

		gunModel[1].addBox(-5.75F, 0F, 0F, 5, 11, 4, 0F); // HandleBottom
		gunModel[1].setRotationPoint(3.7F, 7.9F, -2F);
		gunModel[1].rotateAngleZ = 0.2094395F;

		gunModel[2].addBox(0F, 0F, 0F, 7, 3, 5, 0F); // HandleMetalBand
		gunModel[2].setRotationPoint(-2.5F, -14F, -2.5F);

		gunModel[3].addBox(0F, 0F, 0F, 7, 3, 5, 0F); // HandleMetalBand
		gunModel[3].setRotationPoint(-2.5F, -14F, -2.5F);

		gunModel[4].addBox(0F, 0F, 0F, 12, 65, 2, 0F); // BladeMain
		gunModel[4].setRotationPoint(-1F, -84F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // BladeLowerConnection
		gunModel[5].setRotationPoint(-1F, -20F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 8, 65, 1, 0F); // BladeFront
		gunModel[6].setRotationPoint(11F, -84F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // PointyPart1
		gunModel[7].setRotationPoint(19F, -84F, -0.5F);

		gunModel[8].addBox(-2F, 0F, 0F, 14, 2, 1, 0F); // PointyPart2
		gunModel[8].setRotationPoint(19F, -79.7F, -0.5F);
		gunModel[8].rotateAngleZ = 0.3490658F;

		gunModel[9].addBox(0F, 0F, 0F, 5, 30, 1, 0F); // FrontPointy
		gunModel[9].setRotationPoint(18F, -80F, -0.5F);
		gunModel[9].rotateAngleZ = -0.1487144F;

		gunModel[10].addBox(0F, 0F, 0F, 6, 65, 1, 0F); // BladeFrontLeftAngle
		gunModel[10].setRotationPoint(10.8F, -84F, 0F);
		gunModel[10].rotateAngleY = -0.08726646F;

		gunModel[11].addBox(0F, 0F, 0F, 6, 65, 1, 0F); // BladeFrontLeftAngle
		gunModel[11].setRotationPoint(10.8F, -84F, -1F);
		gunModel[11].rotateAngleY = 0.08726646F;

		gunModel[12].addBox(0F, 0F, 0F, 7, 3, 1, 0F); // PointyPartFiller
		gunModel[12].setRotationPoint(18.2F, -82.5F, -0.5F);
		gunModel[12].rotateAngleZ = 0.1487144F;

		gunModel[13].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // MoarPointyTop
		gunModel[13].setRotationPoint(30F, -84F, -0.5F);

		gunModel[14].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // MoarPointyBottom
		gunModel[14].setRotationPoint(30F, -82.8F, -0.5F);
		gunModel[14].rotateAngleZ = 0.2094395F;

		gunModel[15].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // BottomHandle
		gunModel[15].setRotationPoint(-2F, 14F, -2F);

		gunModel[16].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // BottomHandleAngle
		gunModel[16].setRotationPoint(-2F, 18F, -2F);
		gunModel[16].rotateAngleZ = 0.907468F;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}