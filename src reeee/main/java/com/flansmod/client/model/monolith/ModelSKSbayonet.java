//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSKSbayonet extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSKSbayonet() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[39];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 17
		gunModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 18
		gunModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 24
		gunModel[18] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		gunModel[19] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 28
		gunModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 31
		gunModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 32
		gunModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		gunModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
		gunModel[24] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 39
		gunModel[25] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 40
		gunModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 41
		gunModel[27] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 42
		gunModel[28] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 1
		gunModel[29] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 2
		gunModel[30] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 3
		gunModel[31] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		gunModel[32] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		gunModel[33] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		gunModel[34] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 7
		gunModel[35] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
		gunModel[36] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 10
		gunModel[37] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 11
		gunModel[38] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 12

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.5F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.2F, -0.25F); // Box 2
		gunModel[0].setRotationPoint(0F, -1.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 3
		gunModel[1].setRotationPoint(-0.94F, -0.91F, -0.5F);
		gunModel[1].rotateAngleZ = 0.54105207F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F); // Box 4
		gunModel[2].setRotationPoint(-0.83F, -1.1F, -0.5F);
		gunModel[2].rotateAngleZ = 0.5846853F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.3F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F); // Box 5
		gunModel[3].setRotationPoint(-1F, -1.44F, -0.5F);
		gunModel[3].rotateAngleZ = -0.15707963F;

		gunModel[4].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, 0.9F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.9F, -0.2F, -0.25F, 0.9F, -0.15F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.9F, -0.15F, -0.25F); // Box 6
		gunModel[4].setRotationPoint(-1.85F, -1.32F, -1.5F);
		gunModel[4].rotateAngleZ = 0.01745329F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.9F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.9F, -0.2F, -0.25F, 1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 1F, -0.2F, -0.25F); // Box 7
		gunModel[5].setRotationPoint(-1.88F, -0.85F, -0.5F);
		gunModel[5].rotateAngleZ = 0.19198622F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.3F, -0.25F); // Box 8
		gunModel[6].setRotationPoint(-1.1F, -0.99F, -0.5F);
		gunModel[6].rotateAngleZ = -0.17453293F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F); // Box 9
		gunModel[7].setRotationPoint(3.5F, -1.96F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0.5F, -0.4F, -0.35F, 0.5F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.5F, -0.4F, -0.25F); // Box 10
		gunModel[8].setRotationPoint(3.5F, -2.05F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 11
		gunModel[9].setRotationPoint(0.05F, -1.75F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F); // Box 13
		gunModel[10].setRotationPoint(2.1F, -1.93F, -0.5F);
		gunModel[10].rotateAngleZ = -0.01745329F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F); // Box 14
		gunModel[11].setRotationPoint(2.1F, -2.23F, -0.55F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.43F, -0.4F, -0.5F, -0.43F, -0.4F, -0.5F, -0.43F, -0.5F, -0.5F, -0.43F, -0.5F, -0.4F, -0.43F, -0.4F, -0.4F, -0.43F, -0.4F, -0.4F, -0.43F, -0.5F, -0.4F, -0.43F); // Box 15
		gunModel[12].setRotationPoint(1.8F, -2.3F, -0.6F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.43F, -0.4F, -0.5F, -0.43F, -0.4F, -0.5F, -0.43F, -0.5F, -0.5F, -0.43F, -0.5F, -0.4F, -0.43F, -0.4F, -0.4F, -0.43F, -0.4F, -0.4F, -0.43F, -0.5F, -0.4F, -0.43F); // Box 17
		gunModel[13].setRotationPoint(1.8F, -2.3F, -0.4F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 18
		gunModel[14].setRotationPoint(0.95F, -1.75F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.4F, 0.3F, -0.35F, -0.4F, 0.3F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.4F, 0.3F, -0.35F, -0.4F, 0.3F, -0.35F, -0.3F, 0F, -0.35F, -0.3F); // Box 20
		gunModel[15].setRotationPoint(0.95F, -1.85F, -0.55F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.43F, -0.4F, 0F, -0.43F, -0.4F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.45F, 0F, -0.43F, -0.45F, 0F, -0.43F, -0.35F, 0F, -0.43F, -0.35F); // Box 22
		gunModel[16].setRotationPoint(4F, -1.56F, -0.55F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 24
		gunModel[17].setRotationPoint(5.05F, -1.85F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F); // Box 25
		gunModel[18].setRotationPoint(3.9F, -1.75F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F); // Box 28
		gunModel[19].setRotationPoint(-0.18F, -1.15F, -0.5F);
		gunModel[19].rotateAngleZ = 0.13962634F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F); // Box 31
		gunModel[20].setRotationPoint(7.15F, -1.8F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F); // Box 32
		gunModel[21].setRotationPoint(7.15F, -2.15F, -0.6F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F); // Box 33
		gunModel[22].setRotationPoint(7.15F, -2.15F, -0.4F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F, -0.4F, -0.47F, -0.4F); // Box 34
		gunModel[23].setRotationPoint(7.15F, -2.25F, -0.5F);

		gunModel[24].addShapeBox(-0.25F, 0.05F, -1F, 1, 1, 1, 0F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F, 0F, -0.35F, -0.44F); // Box 39
		gunModel[24].setRotationPoint(7.25F, -1.38F, -0.5F);
		gunModel[24].rotateAngleX = 3.14159265F;
		gunModel[24].rotateAngleZ = 3.14159265F;

		gunModel[25].addShapeBox(-0.9F, 0F, -1F, 1, 1, 1, 0F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F); // Box 40
		gunModel[25].setRotationPoint(7.25F, -1.32F, -0.5F);
		gunModel[25].rotateAngleX = 3.14159265F;
		gunModel[25].rotateAngleZ = 3.14159265F;

		gunModel[26].addShapeBox(-2.9F, 0F, -1F, 3, 1, 1, 0F, -0.5F, -0.37F, -0.43F, -0.5F, -0.37F, -0.43F, -0.5F, -0.37F, -0.43F, -0.5F, -0.37F, -0.43F, -0.5F, -0.37F, -0.49F, -0.5F, -0.37F, -0.49F, -0.5F, -0.37F, -0.49F, -0.5F, -0.37F, -0.49F); // Box 41
		gunModel[26].setRotationPoint(7.25F, -1.32F, -0.5F);
		gunModel[26].rotateAngleX = 3.14159265F;
		gunModel[26].rotateAngleZ = 3.14159265F;

		gunModel[27].addShapeBox(-3.4F, -0.05F, -1F, 1, 1, 1, 0F, 0F, -0.35F, -0.43F, 0F, -0.35F, -0.43F, 0F, -0.35F, -0.43F, 0F, -0.35F, -0.43F, 0F, -0.5F, -0.49F, 0F, -0.35F, -0.49F, 0F, -0.35F, -0.49F, 0F, -0.5F, -0.49F); // Box 42
		gunModel[27].setRotationPoint(7.25F, -1.36F, -0.5F);
		gunModel[27].rotateAngleX = 3.14159265F;
		gunModel[27].rotateAngleZ = 3.10668607F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.43F, -0.45F, 0F, -0.43F, -0.45F, 0F, -0.43F, -0.35F, 0F, -0.43F, -0.35F, 0F, -0.43F, -0.4F, 0F, -0.43F, -0.4F, 0F, -0.43F, -0.3F, 0F, -0.43F, -0.3F); // Box 1
		gunModel[28].setRotationPoint(4F, -1.7F, -0.55F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F); // Box 2
		gunModel[29].setRotationPoint(4.55F, -2F, -0.55F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.35F, 0.1F, -0.45F, -0.35F); // Box 3
		gunModel[30].setRotationPoint(4.55F, -1.9F, -0.55F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, -0.2F, -0.25F, -0.48F, -0.2F, -0.3F, -0.48F, -0.2F, -0.3F, -0.48F, -0.2F, -0.25F, -0.48F, -0.2F, -0.25F, -0.48F, -0.25F, -0.3F, -0.48F, -0.25F, -0.3F, -0.48F, -0.2F, -0.25F); // Box 4
		gunModel[31].setRotationPoint(4.03F, -1.68F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.48F, -0.4F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.4F, -0.35F, -0.48F, -0.4F, -0.25F, -0.48F, -0.4F, -0.25F, -0.48F, -0.4F, -0.25F, -0.48F, -0.4F, -0.25F); // Box 5
		gunModel[32].setRotationPoint(4.03F, -2.05F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F); // Box 6
		gunModel[33].setRotationPoint(2.6F, -1.75F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F); // Box 7
		gunModel[34].setRotationPoint(3.25F, -1.75F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 8
		gunModel[35].setRotationPoint(0.05F, -2.1F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F); // Box 10
		gunModel[36].setRotationPoint(0.6F, -1.28F, -0.5F);
		gunModel[36].rotateAngleZ = -0.15707963F;

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F); // Box 11
		gunModel[37].setRotationPoint(0.2F, -0.95F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F, -0.47F, -0.45F, -0.49F); // Box 12
		gunModel[38].setRotationPoint(7.15F, -2.15F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 29
		ammoModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 30

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F); // Box 29
		ammoModel[0].setRotationPoint(1.5F, -1.1F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.31415927F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.3F); // Box 30
		ammoModel[1].setRotationPoint(2.13F, -1.12F, -0.5F);
		ammoModel[1].rotateAngleZ = 0.55850536F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		slideModel[1] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 21
		slideModel[0].setRotationPoint(1.6F, -2.05F, -0.75F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.45F, 0.3F, -0.45F, -0.45F, 0.3F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.4F, 0.3F, -0.45F, -0.4F, 0.3F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 9
		slideModel[1].setRotationPoint(0.95F, -2.05F, -0.55F);



		translateAll(0F, -0.5F, 0F);
		gunSlideDistance = 0.05F;
		animationType = EnumAnimationType.BOTTOM_CLIP;


		flipAll();
	}
}