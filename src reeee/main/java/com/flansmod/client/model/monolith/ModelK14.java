//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelK14 extends ModelGun
{
	int textureX = 64;
	int textureY = 64;

	public ModelK14()
	{
		gunModel = new ModelRendererTurbo[30];
		gunModel[0] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 18
		gunModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 19
		gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		gunModel[3] = new ModelRendererTurbo(this, 5, 44, textureX, textureY); // Box 21
		gunModel[4] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Box 23
		gunModel[5] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 24
		gunModel[6] = new ModelRendererTurbo(this, 0, 21, textureX, textureY); // Box 25
		gunModel[7] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Box 27
		gunModel[8] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 28
		gunModel[9] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 29
		gunModel[10] = new ModelRendererTurbo(this, 19, 6, textureX, textureY); // Box 33
		gunModel[11] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 34
		gunModel[12] = new ModelRendererTurbo(this, 31, 0, textureX, textureY); // Box 35
		gunModel[13] = new ModelRendererTurbo(this, 38, 0, textureX, textureY); // Box 36
		gunModel[14] = new ModelRendererTurbo(this, 19, 0, textureX, textureY); // Box 37
		gunModel[15] = new ModelRendererTurbo(this, 26, 6, textureX, textureY); // Box 38
		gunModel[16] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 39
		gunModel[17] = new ModelRendererTurbo(this, 19, 39, textureX, textureY); // Box 43
		gunModel[18] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 44
		gunModel[19] = new ModelRendererTurbo(this, 20, 44, textureX, textureY); // Box 48
		gunModel[20] = new ModelRendererTurbo(this, 15, 44, textureX, textureY); // Box 49
		gunModel[21] = new ModelRendererTurbo(this, 25, 44, textureX, textureY); // Box 50
		gunModel[22] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 33
		gunModel[23] = new ModelRendererTurbo(this, 19, 39, textureX, textureY); // Box 34
		gunModel[24] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 35
		gunModel[25] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 36
		gunModel[26] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 37
		gunModel[27] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 38
		gunModel[28] = new ModelRendererTurbo(this, 19, 39, textureX, textureY); // Box 39
		gunModel[29] = new ModelRendererTurbo(this, 19, 39, textureX, textureY); // Box 40

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 18
		gunModel[0].setRotationPoint(0F, -3F, -0.5F);
		gunModel[0].rotateAngleZ = -0.4712389F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 19
		gunModel[1].setRotationPoint(0.3F, -3.5F, -0.7F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 20
		gunModel[2].setRotationPoint(0.3F, -4F, -0.6F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 21
		gunModel[3].setRotationPoint(7.3F, -4F, -0.6F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 23
		gunModel[4].setRotationPoint(1.3F, -4.8F, -0.7F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 24
		gunModel[5].setRotationPoint(1.3F, -5.3F, -0.7F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 25
		gunModel[6].setRotationPoint(8.3F, -5F, -0.3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 27
		gunModel[7].setRotationPoint(8.3F, -5F, 0.3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F); // Box 28
		gunModel[8].setRotationPoint(8.3F, -5F, -0.7F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 29
		gunModel[9].setRotationPoint(15F, -5.05F, -0.3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 33
		gunModel[10].setRotationPoint(-7F, -3F, -0.7F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 34
		gunModel[11].setRotationPoint(-7F, -4F, -0.6F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 35
		gunModel[12].setRotationPoint(-7F, -4.8F, -0.6F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 36
		gunModel[13].setRotationPoint(-5F, -4.8F, -0.6F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 37
		gunModel[14].setRotationPoint(-7.3F, -4.7F, -0.7F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F); // Box 38
		gunModel[15].setRotationPoint(-7F, -2.3F, -0.6F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 39
		gunModel[16].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		gunModel[17].setRotationPoint(6.5F, -6F, -0.5F);

		gunModel[18].addShapeBox(-4F, 2.2F, 0F, 5, 1, 1, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F); // Box 44
		gunModel[18].setRotationPoint(0F, -3F, -0.5F);
		gunModel[18].rotateAngleZ = -0.4712389F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 48
		gunModel[19].setRotationPoint(0.5F, -3F, -0.3F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 49
		gunModel[20].setRotationPoint(3F, -3F, -0.3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, -1.1F, -0.4F, 0F, -1.1F, -0.4F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 50
		gunModel[21].setRotationPoint(1.5F, -3F, -0.3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[22].setRotationPoint(-5F, -3.8F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 34
		gunModel[23].setRotationPoint(2.5F, -6F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[24].setRotationPoint(1.8F, -6.8F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.2F, 0.2F, -6F, 0.2F, 0.2F, -6F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -6F, 0.2F, 0.2F, -6F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 36
		gunModel[25].setRotationPoint(-0.2F, -6.8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.2F, 0.2F, -6.5F, 0.4F, 0.4F, -6.5F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -6.5F, 0.4F, 0.4F, -6.5F, 0.4F, 0.4F, 0F, 0.2F, 0.2F); // Box 37
		gunModel[26].setRotationPoint(7.8F, -6.8F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.4F, 0.4F, -6.5F, 0.4F, 0.4F, -6.5F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, -6.5F, 0.4F, 0.4F, -6.5F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 38
		gunModel[27].setRotationPoint(9.3F, -6.8F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4F, -0.25F, -0.5F, 4F, -0.25F, -0.5F, 4F, -0.25F, 0F, 4F, -0.25F); // Box 39
		gunModel[28].setRotationPoint(14.5F, -4F, 0F);
		gunModel[28].rotateAngleX = 0.43633231F;

		gunModel[29].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4F, -0.25F, -0.5F, 4F, -0.25F, -0.5F, 4F, -0.25F, 0F, 4F, -0.25F); // Box 40
		gunModel[29].setRotationPoint(14.5F, -4F, 0F);
		gunModel[29].rotateAngleX = -0.43633231F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 5, 39, textureX, textureY); // Box 41

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 41
		ammoModel[0].setRotationPoint(4F, -3.5F, -0.5F);


		pumpModel = new ModelRendererTurbo[3];
		pumpModel[0] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 40
		pumpModel[1] = new ModelRendererTurbo(this, 0, 47, textureX, textureY); // Box 0
		pumpModel[2] = new ModelRendererTurbo(this, 5, 47, textureX, textureY); // Box 1

		pumpModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 40
		pumpModel[0].setRotationPoint(0F, -4.7F, -0.5F);

		pumpModel[1].addShapeBox(0F, -0.5F, -1F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		pumpModel[1].setRotationPoint(0F, -4.5F, -0.5F);
		pumpModel[1].rotateAngleX = 0.54105207F;

		pumpModel[2].addShapeBox(-0.1F, -0.4F, -1.3F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 1
		pumpModel[2].setRotationPoint(0F, -4.5F, -0.5F);
		pumpModel[2].rotateAngleX = 0.54105207F;



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0.01F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);

		flipAll();
	}
}