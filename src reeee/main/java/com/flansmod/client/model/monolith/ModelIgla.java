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

public class ModelIgla extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelIgla() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[44];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 1
		gunModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		gunModel[17] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 20
		gunModel[18] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 21
		gunModel[19] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 23
		gunModel[21] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 24
		gunModel[22] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 25
		gunModel[23] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 26
		gunModel[24] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 35
		gunModel[25] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 36
		gunModel[26] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 37
		gunModel[27] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 38
		gunModel[28] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 39
		gunModel[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40
		gunModel[30] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 41
		gunModel[31] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 42
		gunModel[32] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 43
		gunModel[33] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 44
		gunModel[34] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 45
		gunModel[35] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 46
		gunModel[36] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 47
		gunModel[37] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 48
		gunModel[38] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 49
		gunModel[39] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 50
		gunModel[40] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 51
		gunModel[41] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 52
		gunModel[42] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 42
		gunModel[43] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 44

		gunModel[0].addFlexBox(45F, 4F, -3F, 6, 13, 6, 0F, -3.00F, 3.00F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 0
		gunModel[0].setRotationPoint(-42F, -9F, 0F);

		gunModel[1].addBox(14F, -1F, -3F, 40, 5, 6, 0F); // Box 1
		gunModel[1].setRotationPoint(-42F, -9F, 0F);

		gunModel[2].addFlexBox(-62F, -4F, -5F, 133, 3, 10, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 2
		gunModel[2].setRotationPoint(-38F, -9F, 0F);

		gunModel[3].addBox(-62F, -7F, -5F, 133, 3, 10, 0F); // Box 3
		gunModel[3].setRotationPoint(-38F, -9F, 0F);

		gunModel[4].addFlexBox(-62F, -10F, -5F, 133, 3, 10, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 4
		gunModel[4].setRotationPoint(-38F, -9F, 0F);

		gunModel[5].addBox(14F, 4F, -3F, 27, 7, 6, 0F); // Box 6
		gunModel[5].setRotationPoint(-42F, -9F, 0F);

		gunModel[6].addFlexBox(14F, 11F, -3F, 27, 3, 6, 0F, -5.00F, -5.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 7
		gunModel[6].setRotationPoint(-42F, -9F, 0F);

		gunModel[7].addFlexBox(11F, -1F, -3F, 3, 5, 6, 0F, -2.00F, 0.00F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 8
		gunModel[7].setRotationPoint(-42F, -9F, 0F);

		gunModel[8].addFlexBox(13F, 4F, -3F, 1, 7, 6, 0F, -1.00F, 0F, 0F, 0F, ModelRendererTurbo.MR_BOTTOM); // Box 9
		gunModel[8].setRotationPoint(-42F, -9F, 0F);

		gunModel[9].addBox(-57F, 0F, -2F, 5, 1, 4, 0F); // Box 9
		gunModel[9].setRotationPoint(-42F, -10F, 0F);

		gunModel[10].addBox(50F, 2F, -1.5F, 5, 3, 3, 0F); // Box 10
		gunModel[10].setRotationPoint(-38F, -9F, 0F);

		gunModel[11].addTrapezoid(55F, 2F, -1.5F, 2, 3, 3, 0F, 1.00F, ModelRendererTurbo.MR_LEFT); // Box 11
		gunModel[11].setRotationPoint(-38F, -9F, 0F);

		gunModel[12].addBox(57F, 1F, -2.5F, 3, 5, 5, 0F); // Box 12
		gunModel[12].setRotationPoint(-38F, -9F, 0F);

		gunModel[13].addTrapezoid(60F, 2F, -1.5F, 2, 3, 3, 0F, 1.00F, ModelRendererTurbo.MR_RIGHT); // Box 13
		gunModel[13].setRotationPoint(-38F, -9F, 0F);

		gunModel[14].addBox(62F, 2F, -1.5F, 2, 3, 3, 0F); // Box 14
		gunModel[14].setRotationPoint(-38F, -9F, 0F);

		gunModel[15].addBox(36F, -8F, -5.5F, 12, 7, 3, 0F); // Box 1
		gunModel[15].setRotationPoint(-38F, -9F, 0F);

		gunModel[16].addBox(33.99F, 7F, 2.3F, 5, 5, 1, 0F); // Box 19
		gunModel[16].setRotationPoint(-42F, -9F, 0F);

		gunModel[17].addBox(27.99F, 7F, 2.3F, 5, 5, 1, 0F); // Box 20
		gunModel[17].setRotationPoint(-42F, -9F, 0F);

		gunModel[18].addBox(21.99F, 7F, 2.3F, 5, 5, 1, 0F); // Box 21
		gunModel[18].setRotationPoint(-42F, -9F, 0F);

		gunModel[19].addBox(15.99F, 7F, 2.3F, 5, 5, 1, 0F); // Box 22
		gunModel[19].setRotationPoint(-42F, -9F, 0F);

		gunModel[20].addBox(33.99F, 7F, -3.3F, 5, 5, 1, 0F); // Box 23
		gunModel[20].setRotationPoint(-42F, -9F, 0F);

		gunModel[21].addBox(27.99F, 7F, -3.3F, 5, 5, 1, 0F); // Box 24
		gunModel[21].setRotationPoint(-42F, -9F, 0F);

		gunModel[22].addBox(21.99F, 7F, -3.3F, 5, 5, 1, 0F); // Box 25
		gunModel[22].setRotationPoint(-42F, -9F, 0F);

		gunModel[23].addBox(15.99F, 7F, -3.3F, 5, 5, 1, 0F); // Box 26
		gunModel[23].setRotationPoint(-42F, -9F, 0F);

		gunModel[24].addShapeBox(71F, -10F, -5F, 9, 3, 10, 0F, 0F, 0F, -2F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[24].setRotationPoint(-38F, -9F, 0F);

		gunModel[25].addShapeBox(71F, -7F, -5F, 9, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[25].setRotationPoint(-38F, -9F, 0F);

		gunModel[26].addShapeBox(71F, -4F, -5F, 9, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -2F); // Box 37
		gunModel[26].setRotationPoint(-38F, -9F, 0F);

		gunModel[27].addFlexBox(63F, -11F, -6F, 8, 4, 12, 0F, 0F, 0F, -2.50F, -2.50F, ModelRendererTurbo.MR_TOP); // Box 38
		gunModel[27].setRotationPoint(-38F, -9F, 0F);

		gunModel[28].addBox(63F, -7F, -6F, 8, 3, 12, 0F); // Box 39
		gunModel[28].setRotationPoint(-38F, -9F, 0F);

		gunModel[29].addFlexBox(63F, -4F, -6F, 8, 4, 12, 0F, 0.00F, 0F, -2.50F, -2.50F, ModelRendererTurbo.MR_BOTTOM); // Box 40
		gunModel[29].setRotationPoint(-38F, -9F, 0F);

		gunModel[30].addFlexBox(49F, -14F, 4F, 6, 2, 6, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 41
		gunModel[30].setRotationPoint(-38F, -9F, 0F);

		gunModel[31].addBox(49F, -12F, 4F, 6, 2, 6, 0F); // Box 42
		gunModel[31].setRotationPoint(-38F, -9F, 0F);

		gunModel[32].addFlexBox(49F, -10F, 4F, 6, 2, 6, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 43
		gunModel[32].setRotationPoint(-38F, -9F, 0F);

		gunModel[33].addShapeBox(48F, -14F, -1F, 1, 1, 5, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[33].setRotationPoint(-38F, -9F, 0F);

		gunModel[34].addFlexBox(39F, -14F, 4F, 3, 2, 6, 0F, 0F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 45
		gunModel[34].setRotationPoint(-38F, -9F, 0F);

		gunModel[35].addBox(39F, -12F, 4F, 3, 2, 6, 0F); // Box 46
		gunModel[35].setRotationPoint(-38F, -9F, 0F);

		gunModel[36].addFlexBox(39F, -10F, 4F, 3, 2, 6, 0F, 0.00F, 0F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 47
		gunModel[36].setRotationPoint(-38F, -9F, 0F);

		gunModel[37].addBox(42F, -14F, 4F, 7, 6, 6, 0F); // Box 48
		gunModel[37].setRotationPoint(-38F, -9F, 0F);

		gunModel[38].addShapeBox(42F, -14F, -1F, 1, 1, 5, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[38].setRotationPoint(-38F, -9F, 0F);

		gunModel[39].addFlexBox(-56F, -11F, -6F, 1, 4, 12, 0F, 0F, 0F, -2.50F, -2.50F, ModelRendererTurbo.MR_TOP); // Box 50
		gunModel[39].setRotationPoint(-38F, -9F, 0F);

		gunModel[40].addBox(-56F, -7F, -6F, 1, 3, 12, 0F); // Box 51
		gunModel[40].setRotationPoint(-38F, -9F, 0F);

		gunModel[41].addFlexBox(-56F, -4F, -6F, 1, 4, 12, 0F, 0.00F, 0F, -2.50F, -2.50F, ModelRendererTurbo.MR_BOTTOM); // Box 52
		gunModel[41].setRotationPoint(-38F, -9F, 0F);

		gunModel[42].addShapeBox(42F, -2F, 5F, 1, 1, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 42
		gunModel[42].setRotationPoint(-38F, -9F, 0F);

		gunModel[43].addShapeBox(48F, -2F, 5F, 1, 1, 5, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 44
		gunModel[43].setRotationPoint(-38F, -9F, 0F);


		ammoModel = new ModelRendererTurbo[11];
		ammoModel[0] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 52
		ammoModel[1] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 53
		ammoModel[2] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 54
		ammoModel[3] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 55
		ammoModel[4] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 56
		ammoModel[5] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 57
		ammoModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		ammoModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 59
		ammoModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 60
		ammoModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 61
		ammoModel[10] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 62

		ammoModel[0].addBox(27F, -6F, -3F, 44, 2, 6, 0F); // Box 52
		ammoModel[0].setRotationPoint(-38F, -9F, 0F);

		ammoModel[1].addShapeBox(27F, -8F, -3F, 44, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		ammoModel[1].setRotationPoint(-38F, -9F, 0F);

		ammoModel[2].addShapeBox(27F, -4F, -3F, 44, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 54
		ammoModel[2].setRotationPoint(-38F, -9F, 0F);

		ammoModel[3].addShapeBox(71F, -8F, -3F, 5, 2, 6, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 55
		ammoModel[3].setRotationPoint(-38F, -9F, 0F);

		ammoModel[4].addShapeBox(71F, -6F, -3F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 56
		ammoModel[4].setRotationPoint(-38F, -9F, 0F);

		ammoModel[5].addShapeBox(71F, -4F, -3F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 57
		ammoModel[5].setRotationPoint(-38F, -9F, 0F);

		ammoModel[6].addTrapezoid(76F, -6F, -1F, 3, 2, 2, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 58
		ammoModel[6].setRotationPoint(-38F, -9F, 0F);

		ammoModel[7].addBox(27F, -10F, -0.5F, 5, 1, 1, 0F); // Box 59
		ammoModel[7].setRotationPoint(-38F, -8F, 0F);

		ammoModel[8].addBox(27F, -2F, -0.5F, 5, 1, 1, 0F); // Box 60
		ammoModel[8].setRotationPoint(-38F, -9F, 0F);

		ammoModel[9].addBox(27F, -5.5F, 3F, 5, 1, 1, 0F); // Box 61
		ammoModel[9].setRotationPoint(-38F, -9F, 0F);

		ammoModel[10].addBox(27F, -5.5F, -2F, 5, 1, 1, 0F); // Box 62
		ammoModel[10].setRotationPoint(-38F, -9F, -2F);



		animationType = EnumAnimationType.END_LOADED;


	


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}