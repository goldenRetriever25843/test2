//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCrane extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelCrane() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[29];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 16, 229, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 16, 229, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 6, 25, 6, 0F); // Box 0
		bodyModel[0].setRotationPoint(39F, -15F, 26F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 25, 6, 0F); // Box 1
		bodyModel[1].setRotationPoint(39F, -15F, -30F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 25, 6, 0F); // Box 2
		bodyModel[2].setRotationPoint(-49F, -15F, 26F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 25, 6, 0F); // Box 3
		bodyModel[3].setRotationPoint(-49F, -15F, -30F);

		bodyModel[4].addBox(0F, 0F, 0F, 94, 6, 6, 0F); // Box 4
		bodyModel[4].setRotationPoint(-49F, -21F, 26F);

		bodyModel[5].addBox(0F, 0F, 0F, 94, 6, 6, 0F); // Box 5
		bodyModel[5].setRotationPoint(-49F, -21F, -30F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 6, 50, 0F); // Box 6
		bodyModel[6].setRotationPoint(-49F, -21F, -24F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 6, 50, 0F); // Box 7
		bodyModel[7].setRotationPoint(39F, -21F, -24F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 12, 80, 16, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -10F, 0F, 0F, -10F, -6F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(33F, -101F, 16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 80, 16, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -6F, 0F, -10F, 0F, 0F, -10F, -6F, 0F, -10F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-49F, -101F, 16F);

		bodyModel[10].addBox(0F, 0F, 0F, 285, 6, 6, 0F); // Box 13
		bodyModel[10].setRotationPoint(-102F, -101F, -14F);

		bodyModel[11].addBox(0F, 0F, 0F, 285, 6, 6, 0F); // Box 14
		bodyModel[11].setRotationPoint(-102F, -101F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 80, 16, 0F, 0F, 0F, -10F, -6F, 0F, -10F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -6F, 0F, -10F); // Box 15
		bodyModel[12].setRotationPoint(33F, -101F, -30F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 80, 16, 0F, -6F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -10F, 0F, 0F, -10F); // Box 16
		bodyModel[13].setRotationPoint(-49F, -101F, -30F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 6, 42, 0F); // Box 17
		bodyModel[14].setRotationPoint(33F, -107F, -20F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 6, 42, 0F); // Box 18
		bodyModel[15].setRotationPoint(-43F, -107F, -20F);

		bodyModel[16].addBox(0F, 0F, 0F, 6, 25, 18, 0F); // Box 19
		bodyModel[16].setRotationPoint(-102F, -101F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 36, 20, 42, 0F); // Box 20
		bodyModel[17].setRotationPoint(-85F, -121F, -20F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 60, 16, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 22
		bodyModel[18].setRotationPoint(33F, -167F, -20F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 60, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(33F, -167F, 6F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 6, 22, 0F); // Box 24
		bodyModel[20].setRotationPoint(33F, -173F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 6, 18, 0F); // Box 25
		bodyModel[21].setRotationPoint(181F, -101F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 102, 4, 0F); // Box 26
		bodyModel[22].setRotationPoint(33F, -173F, -10F);
		bodyModel[22].rotateAngleX = -0.09948377F;
		bodyModel[22].rotateAngleZ = -0.83775804F;

		bodyModel[23].addBox(0F, 0F, -4F, 4, 102, 4, 0F); // Box 27
		bodyModel[23].setRotationPoint(33F, -173F, 12F);
		bodyModel[23].rotateAngleX = 0.09948377F;
		bodyModel[23].rotateAngleZ = -0.83775804F;

		bodyModel[24].addBox(0F, 0F, 0F, 160, 4, 4, 0F); // Box 28
		bodyModel[24].setRotationPoint(39F, -173F, -10F);
		bodyModel[24].rotateAngleY = -0.01745329F;
		bodyModel[24].rotateAngleZ = -0.4712389F;

		bodyModel[25].addBox(0F, 0F, -4F, 160, 4, 4, 0F); // Box 29
		bodyModel[25].setRotationPoint(39F, -173F, 12F);
		bodyModel[25].rotateAngleY = 0.01745329F;
		bodyModel[25].rotateAngleZ = -0.4712389F;

		bodyModel[26].addBox(0F, 0F, 0F, 2, 27, 2, 0F); // Box 31
		bodyModel[26].setRotationPoint(181F, -95F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 384, 116, 0, 0F, 0F, 0F, 0.1F, -350F, 0F, 0.1F, -350F, 0F, 0F, 0F, 0F, 0F, 0F, -104F, 0.1F, -350F, -104F, 0.1F, -350F, -104F, 0F, 0F, -104F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-84F, -117F, 22.1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 384, 116, 0, 0F, 0F, 0F, 0F, -350F, 0F, 0F, -350F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -104F, 0F, -350F, -104F, 0F, -350F, -104F, 0.1F, 0F, -104F, 0.1F); // Box 1
		bodyModel[28].setRotationPoint(-84F, -117F, -20.1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}