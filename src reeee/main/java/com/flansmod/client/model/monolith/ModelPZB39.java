//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPZB39 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPZB39() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[33];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 13
		gunModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 21
		gunModel[17] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 22
		gunModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 27
		gunModel[23] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 28
		gunModel[24] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 29
		gunModel[25] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 30
		gunModel[26] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 35
		gunModel[30] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 36
		gunModel[31] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 37
		gunModel[32] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 38

		gunModel[0].addShapeBox(0F, 0F, 0F, 55, 3, 3, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 0
		gunModel[0].setRotationPoint(20F, -9F, 1F);

		gunModel[1].addBox(0F, 0F, 0F, 5, 6, 6, 0F); // Box 1
		gunModel[1].setRotationPoint(75F, -10.5F, -0.5F);

		gunModel[2].addTrapezoid(0F, 0F, 0F, 4, 6, 6, 0F, 1.00F, ModelRendererTurbo.MR_LEFT); // Box 2
		gunModel[2].setRotationPoint(80F, -10.5F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 40, 5, 5, 0F); // Box 3
		gunModel[3].setRotationPoint(-20F, -10F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 40, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-20F, -5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(70F, -12F, 1F);

		gunModel[6].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 9
		gunModel[6].setRotationPoint(71F, -14F, 0.75F);

		gunModel[7].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 12
		gunModel[7].setRotationPoint(71F, -14F, 3.25F);

		gunModel[8].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 13
		gunModel[8].setRotationPoint(71F, -15F, 1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[9].setRotationPoint(-20F, -11F, -1F);

		gunModel[10].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 15
		gunModel[10].setRotationPoint(-15F, -13F, 0F);

		gunModel[11].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 16
		gunModel[11].setRotationPoint(-15F, -13F, 4F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[12].setRotationPoint(-30F, -11F, -1F);

		gunModel[13].addBox(0F, 0F, 0F, 15, 7, 7, 0F); // Box 18
		gunModel[13].setRotationPoint(-35F, -6F, -1F);

		gunModel[14].addBox(0F, 0F, 0F, 16, 7, 2, 0F); // Box 19
		gunModel[14].setRotationPoint(-51F, -6.75F, -1F);

		gunModel[15].addBox(0F, 0F, 0F, 16, 7, 2, 0F); // Box 20
		gunModel[15].setRotationPoint(-51F, -6.75F, 4F);

		gunModel[16].addBox(0F, 0F, 0F, 16, 7, 7, 0F); // Box 21
		gunModel[16].setRotationPoint(-66F, -6.75F, -1F);

		gunModel[17].addBox(0F, 0F, 0F, 4, 10, 9, 0F); // Box 22
		gunModel[17].setRotationPoint(-67F, -5.75F, -2F);
		gunModel[17].rotateAngleZ = -0.26179939F;

		gunModel[18].addBox(0F, 0F, 0F, 4, 10, 9, 0F); // Box 23
		gunModel[18].setRotationPoint(-70F, -12.75F, -2F);
		gunModel[18].rotateAngleZ = 0.33161256F;

		gunModel[19].addBox(0F, 0F, 0F, 9, 7, 3, 0F); // Box 24
		gunModel[19].setRotationPoint(-32F, -6F, 6F);
		gunModel[19].rotateAngleZ = -0.08726646F;

		gunModel[20].addBox(0F, 0F, 0F, 2, 34, 1, 0F); // Box 25
		gunModel[20].setRotationPoint(26F, -9F, 2F);
		gunModel[20].rotateAngleX = 0.43633231F;

		gunModel[21].addBox(0F, 0F, 0F, 2, 34, 1, 0F); // Box 26
		gunModel[21].setRotationPoint(26F, -9F, 0F);
		gunModel[21].rotateAngleX = -0.43633231F;

		gunModel[22].addBox(0F, 0F, 0F, 5, 6, 6, 0F); // Box 27
		gunModel[22].setRotationPoint(32F, -10.5F, -0.5F);

		gunModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 28
		gunModel[23].setRotationPoint(32.5F, -4.5F, 0.5F);

		gunModel[24].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 29
		gunModel[24].setRotationPoint(-25F, -0.25F, 0F);

		gunModel[25].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 30
		gunModel[25].setRotationPoint(-29F, 3.25F, 0F);

		gunModel[26].addBox(0F, 0F, 0F, 6, 5, 6, 0F); // Box 31
		gunModel[26].setRotationPoint(-34F, -1F, -0.5F);
		gunModel[26].rotateAngleZ = -0.2268928F;

		gunModel[27].addBox(0F, 0F, 0F, 6, 8, 6, 0F); // Box 33
		gunModel[27].setRotationPoint(-34.8F, 2.5F, -0.5F);
		gunModel[27].rotateAngleZ = -0.2443461F;

		gunModel[28].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 34
		gunModel[28].setRotationPoint(-30.8F, 10.7F, -0.5F);
		gunModel[28].rotateAngleZ = -0.2443461F;

		gunModel[29].addBox(0F, -3F, 0F, 4, 14, 2, 0F); // Box 35
		gunModel[29].setRotationPoint(2F, -15F, -2F);
		gunModel[29].rotateAngleX = 0.13962634F;

		gunModel[30].addBox(0F, 0F, 0F, 13, 3, 3, 0F); // Box 36
		gunModel[30].setRotationPoint(-7F, -21F, -2.5F);
		gunModel[30].rotateAngleZ = -0.17453293F;

		gunModel[31].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 37
		gunModel[31].setRotationPoint(-35F, -6.5F, -1F);

		gunModel[32].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 38
		gunModel[32].setRotationPoint(-28F, -1F, 1F);
		gunModel[32].rotateAngleZ = 0.13962634F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		ammoModel[1] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 34

		ammoModel[0].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 33
		ammoModel[0].setRotationPoint(-28F, -10F, 1.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.1F, -0.1F); // Box 34
		ammoModel[1].setRotationPoint(-16F, -10F, 1.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}