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

public class ModelLance extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelLance()	
	{


// Gun
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Handle
		gunModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BackBase
		gunModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // ReductionTop
		gunModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // ReductionTop
		gunModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape1
		gunModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape1
		gunModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shaft
		gunModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		gunModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		gunModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		gunModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Shape2
		gunModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Tip

		gunModel[0].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Handle
		gunModel[0].setRotationPoint(-6F, -1F, 1F);

		gunModel[1].addBox(0F, -4F, -4F, 5, 8, 8, 0F); // BackBase
		gunModel[1].setRotationPoint(13F, 0F, 2F);

		gunModel[2].addBox(0F, -4F, -2F, 18, 2, 4, 0F); // ReductionTop
		gunModel[2].setRotationPoint(17F, 0F, 2F);
		gunModel[2].rotateAngleZ = -0.1047198F;

		gunModel[3].addBox(0F, 2F, -2F, 18, 2, 4, 0F); // ReductionTop
		gunModel[3].setRotationPoint(17F, 0F, 2F);
		gunModel[3].rotateAngleZ = 0.1047198F;

		gunModel[4].addBox(0F, -2F, 2F, 18, 4, 2, 0F); // Shape1
		gunModel[4].setRotationPoint(17F, 0F, 2F);
		gunModel[4].rotateAngleY = -0.1047198F;

		gunModel[5].addBox(0F, -2F, -4F, 18, 4, 2, 0F); // Shape1
		gunModel[5].setRotationPoint(17F, 0F, 2F);
		gunModel[5].rotateAngleY = 0.1047198F;

		gunModel[6].addBox(0F, -2F, -2F, 25, 4, 4, 0F); // Shaft
		gunModel[6].setRotationPoint(35F, 0F, 2F);

		gunModel[7].addBox(0F, -2F, -1F, 30, 1, 2, 0F); // Shape2
		gunModel[7].setRotationPoint(60F, 0F, 2F);
		gunModel[7].rotateAngleZ = -0.03490658F;

		gunModel[8].addBox(0F, 1F, -1F, 30, 1, 2, 0F); // Shape2
		gunModel[8].setRotationPoint(60F, 0F, 2F);
		gunModel[8].rotateAngleZ = 0.03490658F;

		gunModel[9].addBox(0F, -1F, 1F, 30, 2, 1, 0F); // Shape2
		gunModel[9].setRotationPoint(60F, 0F, 2F);
		gunModel[9].rotateAngleY = -0.03490658F;

		gunModel[10].addBox(0F, -1F, -2F, 30, 2, 1, 0F); // Shape2
		gunModel[10].setRotationPoint(60F, 0F, 2F);
		gunModel[10].rotateAngleY = 0.03490658F;

		gunModel[11].addBox(0F, -0.5F, -0.5F, 10, 1, 1, 0F); // Tip
		gunModel[11].setRotationPoint(90F, 0F, 2F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
	}
}