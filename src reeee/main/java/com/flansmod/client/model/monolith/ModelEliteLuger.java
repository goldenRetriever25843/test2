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

public class ModelEliteLuger extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteLuger() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[66];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 46
		gunModel[43] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Box 47
		gunModel[44] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 48
		gunModel[45] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Box 49
		gunModel[46] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Box 50
		gunModel[47] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Box 51
		gunModel[48] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 52
		gunModel[49] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 53
		gunModel[50] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Box 54
		gunModel[51] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Box 55
		gunModel[52] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 56
		gunModel[53] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 57
		gunModel[54] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 58
		gunModel[55] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 59
		gunModel[56] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 60
		gunModel[57] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 61
		gunModel[58] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 62
		gunModel[59] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 63
		gunModel[60] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 64
		gunModel[61] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 65
		gunModel[62] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 66
		gunModel[63] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 70
		gunModel[64] = new ModelRendererTurbo(this, 105, 353, textureX, textureY); // Box 71
		gunModel[65] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 72

		gunModel[0].addShapeBox(0F, 0F, 0F, 43, 68, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-6F, -96F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 62, 32, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-6F, -128F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 6, 20, 0F); // Box 2
		gunModel[2].setRotationPoint(-6F, -28F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 8, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-6F, -22F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 19, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-23F, -14F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 18, 8, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 7
		gunModel[5].setRotationPoint(-24F, -22F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 19, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 8
		gunModel[6].setRotationPoint(-25F, -24F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 22, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 9
		gunModel[7].setRotationPoint(-28F, -27F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 28, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 10
		gunModel[8].setRotationPoint(-34F, -29F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[9].setRotationPoint(-44F, -29F, 0F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[10].setRotationPoint(-44F, -27F, 0F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[11].setRotationPoint(-44F, -23F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 9, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 14
		gunModel[12].setRotationPoint(-52F, -29F, 0F);

		gunModel[13].addBox(0F, 0F, 0F, 46, 11, 20, 0F); // Box 15
		gunModel[13].setRotationPoint(-52F, -40F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 46, 12, 20, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[14].setRotationPoint(-52F, -52F, 0F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 42, 27, 20, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[15].setRotationPoint(-48F, -79F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 25, 27, 20, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[16].setRotationPoint(-31F, -106F, 0F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 18, 16, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 19
		gunModel[17].setRotationPoint(-24F, -122F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 18, 8, 20, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[18].setRotationPoint(-24F, -132F, 0F);

		gunModel[19].addBox(0F, 0F, 0F, 18, 2, 20, 0F); // Box 21
		gunModel[19].setRotationPoint(-24F, -124F, 0F);

		gunModel[20].addBox(0F, 0F, 0F, 54, 4, 20, 0F); // Box 22
		gunModel[20].setRotationPoint(-6F, -132F, 0F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[21].setRotationPoint(48F, -132F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 18, 9, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 24
		gunModel[22].setRotationPoint(-43F, -17F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 18, 9, 20, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(-43F, -26F, 0F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[24].setRotationPoint(-30F, -13F, 2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 13, 14, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 27
		gunModel[25].setRotationPoint(-52F, -22F, 2F);

		gunModel[26].addBox(0F, 0F, 0F, 23, 16, 16, 0F); // Box 28
		gunModel[26].setRotationPoint(-44F, -29F, 2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 37, 8, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 29
		gunModel[27].setRotationPoint(-50F, -136F, 1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 25, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F); // Box 30
		gunModel[28].setRotationPoint(-43F, -128F, 1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 10, 9, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 31
		gunModel[29].setRotationPoint(-29F, -122F, 1F);

		gunModel[30].addBox(0F, 0F, 0F, 33, 6, 18, 0F); // Box 32
		gunModel[30].setRotationPoint(-46F, -142F, 1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 19, 5, 18, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[31].setRotationPoint(-32F, -147F, 1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 12, 14, 18, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[32].setRotationPoint(-32F, -161F, 1F);

		gunModel[33].addBox(0F, 0F, 0F, 14, 18, 18, 0F); // Box 35
		gunModel[33].setRotationPoint(-46F, -160F, 1F);

		gunModel[34].addBox(0F, 0F, 0F, 14, 3, 18, 0F); // Box 36
		gunModel[34].setRotationPoint(-46F, -163F, 1F);

		gunModel[35].addBox(0F, 0F, 0F, 5, 27, 22, 0F); // Box 37
		gunModel[35].setRotationPoint(-51F, -163F, -1F);

		gunModel[36].addBox(0F, 0F, 0F, 19, 3, 22, 0F); // Box 38
		gunModel[36].setRotationPoint(-51F, -166F, -1F);

		gunModel[37].addBox(0F, 0F, 0F, 28, 3, 22, 0F); // Box 39
		gunModel[37].setRotationPoint(-32F, -166F, -1F);
		gunModel[37].rotateAngleZ = -0.87266463F;

		gunModel[38].addBox(0F, 0F, 0F, 63, 13, 22, 0F); // Box 40
		gunModel[38].setRotationPoint(-18F, -145F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 63, 2, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[39].setRotationPoint(-18F, -147F, -1F);

		gunModel[40].addBox(0F, 0F, 0F, 63, 2, 20, 0F); // Box 42
		gunModel[40].setRotationPoint(-18F, -149F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 36, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 43
		gunModel[41].setRotationPoint(-23F, -155F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 9, 7, 24, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 46
		gunModel[42].setRotationPoint(13F, -156F, -2F);

		gunModel[43].addBox(0F, 0F, 0F, 23, 7, 24, 0F); // Box 47
		gunModel[43].setRotationPoint(22F, -156F, -2F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 40, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 48
		gunModel[44].setRotationPoint(-27F, -160F, 0F);

		gunModel[45].addBox(0F, 0F, 0F, 61, 4, 20, 0F); // Box 49
		gunModel[45].setRotationPoint(13F, -160F, 0F);

		gunModel[46].addBox(0F, 0F, 0F, 29, 28, 24, 0F); // Box 50
		gunModel[46].setRotationPoint(45F, -156F, -2F);

		gunModel[47].addBox(0F, 0F, 0F, 30, 8, 18, 0F); // Box 51
		gunModel[47].setRotationPoint(-35F, -168F, 1F);

		gunModel[48].addBox(0F, 0F, 0F, 41, 5, 18, 0F); // Box 52
		gunModel[48].setRotationPoint(-5F, -165F, 1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 7, 3, 18, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[49].setRotationPoint(-5F, -168F, 1F);

		gunModel[50].addBox(0F, 0F, 0F, 26, 30, 20, 0F); // Box 54
		gunModel[50].setRotationPoint(74F, -160F, 0F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 47, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[51].setRotationPoint(53F, -130F, 0F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[52].setRotationPoint(85F, -125F, 4F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 57
		gunModel[53].setRotationPoint(80F, -125F, 4F);

		gunModel[54].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 58
		gunModel[54].setRotationPoint(85F, -120F, 4F);

		gunModel[55].addBox(0F, 0F, 0F, 1, 10, 12, 0F); // Box 59
		gunModel[55].setRotationPoint(85.1F, -110.5F, 4F);
		gunModel[55].rotateAngleZ = -0.41887902F;

		gunModel[56].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // Box 60
		gunModel[56].setRotationPoint(81.3F, -101.8F, 4F);
		gunModel[56].rotateAngleZ = -1.02974426F;

		gunModel[57].addBox(0F, 0F, 0F, 25, 1, 12, 0F); // Box 61
		gunModel[57].setRotationPoint(49F, -97.25F, 4F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 8, 7, 12, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[58].setRotationPoint(49F, -104.25F, 4F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[59].setRotationPoint(43F, -111.25F, 4F);

		gunModel[60].addBox(0F, 0F, 0F, 12, 8, 12, 0F); // Box 64
		gunModel[60].setRotationPoint(37F, -104.25F, 4F);

		gunModel[61].addBox(0F, 0F, 0F, 2, 3, 12, 0F); // Box 65
		gunModel[61].setRotationPoint(41F, -107.25F, 4F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[62].setRotationPoint(34F, -96.25F, 4F);

		gunModel[63].addBox(0F, 0F, 0F, 95, 16, 16, 0F); // Box 70
		gunModel[63].setRotationPoint(100F, -158F, 2F);

		gunModel[64].addBox(0F, 0F, 0F, 18, 18, 18, 0F); // Box 71
		gunModel[64].setRotationPoint(195F, -159F, 1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 13, 7, 3, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[65].setRotationPoint(198F, -166F, 8.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 0

		ammoModel[0].addShapeBox(14F, 19F, 2F, 28, 70, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(-6F, -128F, 0F);
		ammoModel[0].rotateAngleZ = -0.54105207F;


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 67
		slideModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68
		slideModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 69

		slideModel[0].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 67
		slideModel[0].setRotationPoint(59F, -124F, 8F);

		slideModel[1].addBox(0F, 0F, 0F, 2, 12, 4, 0F); // Box 68
		slideModel[1].setRotationPoint(57F, -124F, 8F);

		slideModel[2].addBox(0F, 0F, 0F, 2, 11, 4, 0F); // Box 69
		slideModel[2].setRotationPoint(57F, -112F, 8F);
		slideModel[2].rotateAngleZ = 0.57595865F;

		animationType = EnumAnimationType.PISTOL_CLIP;
		gunSlideDistance = 0.1F;
		translateAll(0F, 50F, -8F);


		flipAll();
	}
}