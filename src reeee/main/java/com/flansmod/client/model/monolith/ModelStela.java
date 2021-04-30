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

public class ModelStela extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStela() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[26];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Shape1
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Shape3
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Shape4
		gunModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Shape6
		gunModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Shape7
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Shape9
		gunModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 1
		gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		gunModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 4
		gunModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 5
		gunModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 1
		gunModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 2
		gunModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 4
		gunModel[16] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 5
		gunModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 1
		gunModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 2
		gunModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 3
		gunModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 4
		gunModel[22] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 5
		gunModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 6
		gunModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		gunModel[25] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 8

		gunModel[0].addShapeBox(0F, -0.9F, 0F, 42, 3, 3, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Shape1
		gunModel[0].setRotationPoint(-28F, -4.05F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Shape3
		gunModel[1].setRotationPoint(6.7F, -1.85F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Shape4
		gunModel[2].setRotationPoint(5.5F, -1.4F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F); // Import Shape6
		gunModel[3].setRotationPoint(0.25F, -2.5F, -1F);
		gunModel[3].rotateAngleZ = -0.2268928F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Import Shape7
		gunModel[4].setRotationPoint(-4.72F, -2.75F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Import Shape9
		gunModel[5].setRotationPoint(-8.75F, -2.6F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F); // Box 0
		gunModel[6].setRotationPoint(5F, -4.6F, 3.1F);
		gunModel[6].rotateAngleX = -1.57079633F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F, -0.25F, -0.35F, 0.25F); // Box 1
		gunModel[7].setRotationPoint(5F, -4.7F, 2.7F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F, -0.35F, -0.45F, -0.03F); // Box 2
		gunModel[8].setRotationPoint(5F, -5.82F, 2.7F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F); // Box 3
		gunModel[9].setRotationPoint(5F, -5.1F, 2.1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F); // Box 4
		gunModel[10].setRotationPoint(5F, -5.1F, 3.3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 5
		gunModel[11].setRotationPoint(5F, -5.1F, 2.7F);

		gunModel[12].addShapeBox(0F, -0.9F, 0F, 42, 3, 3, 0F, 0F, -0.99F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F, -0.7F, 0F, -0.99F, -0.7F, 0F, -0.99F, -0.7F, 0F, -0.99F, -0.7F); // Box 0
		gunModel[12].setRotationPoint(-28F, -3F, -1.5F);

		gunModel[13].addShapeBox(0F, -0.9F, 0F, 42, 3, 3, 0F, 0F, -0.99F, -0.7F, 0F, -0.99F, -0.7F, 0F, -0.99F, -0.7F, 0F, -0.99F, -0.7F, 0F, -0.99F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F, 0.01F, 0F, -0.99F, 0.01F); // Box 1
		gunModel[13].setRotationPoint(-28F, -5.1F, -1.5F);

		gunModel[14].addShapeBox(0F, -0.9F, 0F, 4, 3, 3, 0F, 0F, -0.95F, 0.4F, 0F, -0.95F, 0.4F, 0F, -0.95F, 0.4F, 0F, -0.95F, 0.4F, 0F, -0.88F, 0.4F, 0F, -0.88F, 0.4F, 0F, -0.88F, 0.4F, 0F, -0.88F, 0.4F); // Box 2
		gunModel[14].setRotationPoint(9.75F, -4.05F, -1.5F);

		gunModel[15].addShapeBox(0F, -0.9F, 0F, 4, 3, 3, 0F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 4
		gunModel[15].setRotationPoint(9.75F, -2.8F, -1.5F);

		gunModel[16].addShapeBox(0F, -0.9F, 0F, 4, 3, 3, 0F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F, 0F, -0.9F, 0.4F); // Box 5
		gunModel[16].setRotationPoint(9.75F, -5.2F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[17].setRotationPoint(0.5F, -2.2F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F); // Box 1
		gunModel[18].setRotationPoint(6.8F, -1.4F, -0.5F);

		gunModel[19].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 2
		gunModel[19].setRotationPoint(-12F, -2.5F, -1F);
		gunModel[19].rotateAngleZ = 0.85521133F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 3
		gunModel[20].setRotationPoint(-1.25F, -1.9F, -1F);
		gunModel[20].rotateAngleZ = -1.04719755F;

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[21].setRotationPoint(1F, 0F, -0.5F);
		gunModel[21].rotateAngleZ = 0.31415927F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 5
		gunModel[22].setRotationPoint(8.5F, -1.2F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F); // Box 6
		gunModel[23].setRotationPoint(11F, -1.2F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F); // Box 7
		gunModel[24].setRotationPoint(5F, -5.84F, 2.46F);
		gunModel[24].rotateAngleX = -0.4712389F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F); // Box 8
		gunModel[25].setRotationPoint(5F, -5.38F, 3.05F);
		gunModel[25].rotateAngleX = 0.4712389F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9

		ammoModel[0].addBox(0F, 0F, 0F, 39, 2, 2, 0F); // Box 9
		ammoModel[0].setRotationPoint(-26F, -4.5F, -1F);



		translateAll(0F, -1F, -2F);


		flipAll();
	}
}