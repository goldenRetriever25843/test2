//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFlamethrowerGeneric extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelFlamethrowerGeneric()
	{
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19

		gunModel[0].addTrapezoid(0F, 0F, 0F, 8, 5, 5, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 0
		gunModel[0].setRotationPoint(29F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 40, 4, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1
		gunModel[1].setRotationPoint(-11F, 0.5F, 0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 7, 5, 5, 0F); // Box 2
		gunModel[2].setRotationPoint(21F, 0F, 0F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 3
		gunModel[3].setRotationPoint(20F, -0.5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 16, 4, 4, 0F); // Box 4
		gunModel[4].setRotationPoint(-25F, 0.5F, 0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 5
		gunModel[5].setRotationPoint(-14F, 4.5F, 1F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 6
		gunModel[6].setRotationPoint(-18F, 4.5F, 0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 7
		gunModel[7].setRotationPoint(-22F, 4.5F, 0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 8
		gunModel[8].setRotationPoint(-23F, 4.5F, 0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(-23F, 7.5F, 0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(-24F, 10.5F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(-18F, 10.5F, 0.5F);
		gunModel[11].rotateAngleZ = 3.14159265F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(-19F, 13.5F, 0.5F);
		gunModel[12].rotateAngleZ = 3.14159265F;

		gunModel[13].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 13
		gunModel[13].setRotationPoint(-15F, 6F, 0F);

		gunModel[14].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 14
		gunModel[14].setRotationPoint(-19.5F, 9F, 0F);

		gunModel[15].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 15
		gunModel[15].setRotationPoint(-18F, 5.5F, 1F);
		gunModel[15].rotateAngleZ = 0.15707963F;

		gunModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 16
		gunModel[16].setRotationPoint(-24F, 13.5F, 0.5F);

		gunModel[17].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 17
		gunModel[17].setRotationPoint(-37F, 1F, 1F);

		gunModel[18].addFlexTrapezoid(0F, 0F, 0F, 3, 4, 4, 0F, -1.00F, -1.00F, -1.00F, -1.00F, -1.00F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 18
		gunModel[18].setRotationPoint(-35F, 0.5F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(-11F, -0.5F, 1F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}