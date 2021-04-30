//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF9Panther extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF9Panther() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[71];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 58
		bodyModel[34] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 60
		bodyModel[36] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 64
		bodyModel[40] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 65
		bodyModel[41] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 66
		bodyModel[42] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 67
		bodyModel[43] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 68
		bodyModel[44] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 69
		bodyModel[45] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Import Box16
		bodyModel[46] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Import Box17
		bodyModel[47] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Import Box18
		bodyModel[48] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Import Box19
		bodyModel[49] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import Box20
		bodyModel[50] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Import Box21
		bodyModel[51] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Import Box22
		bodyModel[52] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Import Box23
		bodyModel[53] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Import Box24
		bodyModel[54] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box25
		bodyModel[55] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import Box8
		bodyModel[56] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import Box9
		bodyModel[57] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Import Box10
		bodyModel[58] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Import Box11
		bodyModel[59] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Import Box12
		bodyModel[60] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box13
		bodyModel[61] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import Box14
		bodyModel[62] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box15
		bodyModel[63] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 18
		bodyModel[64] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 19
		bodyModel[65] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 20
		bodyModel[66] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 21
		bodyModel[67] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 22
		bodyModel[68] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 23
		bodyModel[69] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 24
		bodyModel[70] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F, -7F, -2F, -4F, 0F, -1F, -2F, 0F, 1F, 0F, -5F, -2F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-77F, -18F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F, -5F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, -7F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F); // Box 4
		bodyModel[1].setRotationPoint(-77F, -18F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, -4F, 0F, -2F, -2F, 0F, 1F, 0F, -5F, -2F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-77F, -12F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -5F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, -2F, -5F, -3F, -4F); // Box 6
		bodyModel[3].setRotationPoint(-77F, -12F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 8
		bodyModel[4].setRotationPoint(-77F, -12F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 9
		bodyModel[5].setRotationPoint(-76F, -12F, -3F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 10
		bodyModel[6].setRotationPoint(-77F, -12F, 0.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 11
		bodyModel[7].setRotationPoint(-76F, -12F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 10, 9, 0F, 0F, -5F, -4F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-61F, -22F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 10, 9, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 14
		bodyModel[9].setRotationPoint(-61F, -22F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 10, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -5F, -2F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 15
		bodyModel[10].setRotationPoint(-61F, -12F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -5F, -2F, 0F, -6F, -4F); // Box 16
		bodyModel[11].setRotationPoint(-61F, -12F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 10, 9, 0F, 0F, -3F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(-44F, -22F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(-44F, -22F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F, 0F, -2F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-33F, -22F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-33F, -22F, 6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 15, 10, 0F); // Box 21
		bodyModel[16].setRotationPoint(-19F, -20F, -5F);
		bodyModel[16].rotateAngleZ = -0.08726646F;

		bodyModel[17].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 22
		bodyModel[17].setRotationPoint(-30F, -15F, -0.5F);
		bodyModel[17].rotateAngleZ = -0.08726646F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 23
		bodyModel[18].setRotationPoint(-33F, -25F, -2.5F);
		bodyModel[18].rotateAngleZ = -0.45378561F;

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 24
		bodyModel[19].setRotationPoint(-33F, -22F, -1.5F);
		bodyModel[19].rotateAngleZ = -0.01745329F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 19, 10, 11, 0F, 0F, -1F, -3F, 0F, -1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-16F, -22F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 19, 10, 11, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(-16F, -22F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 30
		bodyModel[22].setRotationPoint(-44F, -12F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -5F, -2F); // Box 31
		bodyModel[23].setRotationPoint(-44F, -12F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -3F, -2F, 0F, 1F, 6F, 0F, 0F, 6F); // Box 32
		bodyModel[24].setRotationPoint(-33F, -12F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 33
		bodyModel[25].setRotationPoint(-33F, -5F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 1F, 6F, 0F, -3F, -2F, 0F, -4F, -3F); // Box 34
		bodyModel[26].setRotationPoint(-33F, -12F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 35
		bodyModel[27].setRotationPoint(-16F, -12F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 19, 10, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -3F, -2F, 0F, -3F, -3F); // Box 36
		bodyModel[28].setRotationPoint(-16F, -12F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 22, 10, 12, 0F, 0F, -1F, -3F, 0F, -1F, -5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(3F, -22F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 22, 10, 12, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		bodyModel[30].setRotationPoint(3F, -22F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 22, 10, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 40
		bodyModel[31].setRotationPoint(3F, -12F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 22, 10, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -3F, -3F); // Box 41
		bodyModel[32].setRotationPoint(3F, -12F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 58
		bodyModel[33].setRotationPoint(-11F, -14F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 1F); // Box 59
		bodyModel[34].setRotationPoint(-11F, -12F, -20F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[35].setRotationPoint(-11F, -14F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 61
		bodyModel[36].setRotationPoint(-11F, -12F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 22, 2, 11, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[37].setRotationPoint(3F, -14F, -20F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 22, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[38].setRotationPoint(3F, -12F, -20F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 22, 2, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[39].setRotationPoint(3F, -14F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 22, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[40].setRotationPoint(3F, -12F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 22, 2, 14, 0F, 0F, -1F, 0F, 0F, -2F, -13F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[41].setRotationPoint(25F, -14F, -20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 22, 2, 14, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 67
		bodyModel[42].setRotationPoint(25F, -14F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 22, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -13F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 68
		bodyModel[43].setRotationPoint(25F, -12F, -20F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 22, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -13F, 0F, -1F, 0F); // Box 69
		bodyModel[44].setRotationPoint(25F, -12F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[45].setRotationPoint(24F, -6F, -3F);
		bodyModel[45].rotateAngleX = -0.12217305F;
		bodyModel[45].rotateAngleY = 0.05235988F;
		bodyModel[45].rotateAngleZ = 0.12217305F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[46].setRotationPoint(23F, -17F, 6F);
		bodyModel[46].rotateAngleX = 0F;
		bodyModel[46].rotateAngleY = -0.12217305F;
		bodyModel[46].rotateAngleZ = 0.06981317F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[47].setRotationPoint(23F, -17F, -6F);
		bodyModel[47].rotateAngleX = -0.17453292F;
		bodyModel[47].rotateAngleY = 0.10471976F;
		bodyModel[47].rotateAngleZ = 0.0174533F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[48].setRotationPoint(23F, -22F, -3F);
		bodyModel[48].rotateAngleX = 0.06981317F;
		bodyModel[48].rotateAngleY = -0.05235988F;
		bodyModel[48].rotateAngleZ = -0.13962634F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[49].setRotationPoint(23F, -22F, 0F);
		bodyModel[49].rotateAngleX = -0.12217305F;
		bodyModel[49].rotateAngleY = -0.06981317F;
		bodyModel[49].rotateAngleZ = -0.13962634F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[50].setRotationPoint(22F, -6F, -1F);
		bodyModel[50].rotateAngleX = 0.12217305F;
		bodyModel[50].rotateAngleY = -0.12217305F;
		bodyModel[50].rotateAngleZ = 0.10471976F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[51].setRotationPoint(23F, -6F, 1F);
		bodyModel[51].rotateAngleX = -0.08726646F;
		bodyModel[51].rotateAngleY = -0.10471976F;
		bodyModel[51].rotateAngleZ = 0.08726646F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		bodyModel[52].setRotationPoint(21F, -22F, -2F);
		bodyModel[52].rotateAngleX = -0.08726646F;
		bodyModel[52].rotateAngleY = 0.01745329F;
		bodyModel[52].rotateAngleZ = -0.08726646F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		bodyModel[53].setRotationPoint(22F, -11F, -8F);
		bodyModel[53].rotateAngleX = 0.17453293F;
		bodyModel[53].rotateAngleY = 0.06981317F;
		bodyModel[53].rotateAngleZ = 0.03490659F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[54].setRotationPoint(22F, -11.5F, 4F);
		bodyModel[54].rotateAngleX = -0.05235988F;
		bodyModel[54].rotateAngleY = -0.05235988F;
		bodyModel[54].rotateAngleZ = 0.05235988F;

		bodyModel[55].addShapeBox(0F, 0.5F, 0F, 2, 1, 17, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box8
		bodyModel[55].setRotationPoint(-7.5F, -13F, -36F);
		bodyModel[55].rotateAngleX = -0.01745329F;
		bodyModel[55].rotateAngleY = 0.10471976F;
		bodyModel[55].rotateAngleZ = 0.03490659F;

		bodyModel[56].addShapeBox(0F, 0.5F, 0F, 2, 1, 19, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box9
		bodyModel[56].setRotationPoint(16F, -14F, -36F);
		bodyModel[56].rotateAngleX = -0.03490659F;
		bodyModel[56].rotateAngleY = -0.33161256F;
		bodyModel[56].rotateAngleZ = 0.01745329F;

		bodyModel[57].addShapeBox(0F, 0.5F, 0F, 2, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[57].setRotationPoint(12F, -14F, -39F);
		bodyModel[57].rotateAngleX = -0.05235988F;
		bodyModel[57].rotateAngleY = 0.03490659F;
		bodyModel[57].rotateAngleZ = 0F;

		bodyModel[58].addShapeBox(0F, 0.5F, 0F, 3, 1, 18, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box11
		bodyModel[58].setRotationPoint(3F, -14F, -42F);
		bodyModel[58].rotateAngleX = -0.01745329F;
		bodyModel[58].rotateAngleY = -0.05235988F;
		bodyModel[58].rotateAngleZ = 0.01745329F;

		bodyModel[59].addShapeBox(0F, 0.5F, 0F, 2, 1, 17, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box12
		bodyModel[59].setRotationPoint(-3F, -14F, -40F);
		bodyModel[59].rotateAngleX = -0.01745329F;
		bodyModel[59].rotateAngleY = 0.03490659F;
		bodyModel[59].rotateAngleZ = 0.01745329F;

		bodyModel[60].addShapeBox(0F, 0.5F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[60].setRotationPoint(16F, -13.5F, -29F);
		bodyModel[60].rotateAngleX = -0.05235988F;
		bodyModel[60].rotateAngleY = -0.27925268F;
		bodyModel[60].rotateAngleZ = 0.10471976F;

		bodyModel[61].addShapeBox(0F, 0.5F, 0F, 4, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[61].setRotationPoint(8F, -13F, -31F);
		bodyModel[61].rotateAngleX = 0F;
		bodyModel[61].rotateAngleY = 0.05235988F;
		bodyModel[61].rotateAngleZ = 0F;

		bodyModel[62].addShapeBox(0F, 0.5F, 0F, 5, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[62].setRotationPoint(-7F, -13F, -30F);
		bodyModel[62].rotateAngleX = 0F;
		bodyModel[62].rotateAngleY = 0.01745329F;
		bodyModel[62].rotateAngleZ = 0.03490659F;

		bodyModel[63].addShapeBox(0F, 0.5F, 0F, 2, 1, 17, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 18
		bodyModel[63].setRotationPoint(-7.5F, -13F, 19F);
		bodyModel[63].rotateAngleX = 0.01745329F;
		bodyModel[63].rotateAngleY = -0.10471976F;
		bodyModel[63].rotateAngleZ = -0.03490659F;

		bodyModel[64].addShapeBox(0F, 0.5F, 0F, 2, 1, 19, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 19
		bodyModel[64].setRotationPoint(21F, -13F, 17F);
		bodyModel[64].rotateAngleX = 0.03490659F;
		bodyModel[64].rotateAngleY = 0.33161256F;
		bodyModel[64].rotateAngleZ = 0.01745329F;

		bodyModel[65].addShapeBox(0F, 0.5F, 0F, 2, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[65].setRotationPoint(12F, -13F, 17F);
		bodyModel[65].rotateAngleX = 0.03490659F;
		bodyModel[65].rotateAngleY = 0.03490659F;
		bodyModel[65].rotateAngleZ = 0F;

		bodyModel[66].addShapeBox(0F, 0.5F, 0F, 3, 1, 18, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 21
		bodyModel[66].setRotationPoint(3F, -13F, 24F);
		bodyModel[66].rotateAngleX = 0.03490659F;
		bodyModel[66].rotateAngleY = -0.05235988F;
		bodyModel[66].rotateAngleZ = 0.01745329F;

		bodyModel[67].addShapeBox(0F, 0.5F, 0F, 2, 1, 17, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 22
		bodyModel[67].setRotationPoint(-3F, -13F, 23F);
		bodyModel[67].rotateAngleX = 0.01745329F;
		bodyModel[67].rotateAngleY = 0.03490659F;
		bodyModel[67].rotateAngleZ = 0.01745329F;

		bodyModel[68].addShapeBox(0F, 0.5F, 0F, 3, 1, 11, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F); // Box 23
		bodyModel[68].setRotationPoint(21F, -13.3F, 18F);
		bodyModel[68].rotateAngleX = 0.03490659F;
		bodyModel[68].rotateAngleY = 0.27925268F;
		bodyModel[68].rotateAngleZ = 0.10471976F;

		bodyModel[69].addShapeBox(0F, 0.5F, 0F, 4, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[69].setRotationPoint(8F, -13F, 17F);
		bodyModel[69].rotateAngleX = 0F;
		bodyModel[69].rotateAngleY = 0.05235988F;
		bodyModel[69].rotateAngleZ = 0F;

		bodyModel[70].addShapeBox(0F, 0.5F, 0F, 5, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[70].setRotationPoint(-7F, -13F, 17F);
		bodyModel[70].rotateAngleX = 0F;
		bodyModel[70].rotateAngleY = 0.01745329F;
		bodyModel[70].rotateAngleZ = 0.03490659F;


		tailModel = new ModelRendererTurbo[10];
		tailModel[0] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 44
		tailModel[1] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 46
		tailModel[2] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 47
		tailModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 48
		tailModel[4] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 49
		tailModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 51
		tailModel[6] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 52
		tailModel[7] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 54
		tailModel[8] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 55
		tailModel[9] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 56

		tailModel[0].addShapeBox(0F, 0F, 0F, 35, 10, 12, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -7F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[0].setRotationPoint(25F, -12F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 35, 10, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, -7F, 0F, -4F, -5F); // Box 46
		tailModel[1].setRotationPoint(25F, -12F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 35, 10, 12, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -6F, -7F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 47
		tailModel[2].setRotationPoint(25F, -22F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 35, 10, 12, 0F, 0F, -1F, -5F, 0F, -6F, -7F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[3].setRotationPoint(25F, -22F, -12F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 33, 29, 1, 0F, 0F, -19F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[4].setRotationPoint(41F, -48F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[5].setRotationPoint(23F, -29F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 18, 1, 31, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[6].setRotationPoint(56F, -33F, -31F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[7].setRotationPoint(69F, -33F, -35F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -3F, -1F, 0F); // Box 55
		tailModel[8].setRotationPoint(69F, -33F, 31F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 18, 1, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 56
		tailModel[9].setRotationPoint(56F, -33F, 0F);


		leftWingModel = new ModelRendererTurbo[10];
		leftWingModel[0] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 70
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 72
		leftWingModel[2] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 74
		leftWingModel[3] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 76
		leftWingModel[4] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 78
		leftWingModel[5] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 79
		leftWingModel[6] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 80
		leftWingModel[7] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 81
		leftWingModel[8] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 82
		leftWingModel[9] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 83

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 47, 0F, -3F, 2F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftWingModel[0].setRotationPoint(-6F, -13F, -67F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 47, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftWingModel[1].setRotationPoint(-11F, -13F, -67F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 2, 25, 0F, -4F, 1F, 0F, -5F, 1F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -4F, -1F, 0F, -5F, -2F, 0F, 1F, -1F, 0F, -7F, 0F, 0F); // Box 74
		leftWingModel[2].setRotationPoint(7F, -13F, -45F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 13, 1, 22, 0F, -4F, 1F, 0F, -5F, 1F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -4F, -1F, 0F, -5F, -2F, 0F, 1F, -1F, 0F, -7F, 0F, 0F); // Box 76
		leftWingModel[3].setRotationPoint(5F, -14F, -67F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[4].setRotationPoint(-6F, -18F, -75F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 79
		leftWingModel[5].setRotationPoint(-6F, -14F, -75F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -1F); // Box 80
		leftWingModel[6].setRotationPoint(11F, -14F, -75F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 81
		leftWingModel[7].setRotationPoint(11F, -18F, -75F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 82
		leftWingModel[8].setRotationPoint(-14F, -18F, -75F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 83
		leftWingModel[9].setRotationPoint(-14F, -14F, -75F);


		rightWingModel = new ModelRendererTurbo[10];
		rightWingModel[0] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 71
		rightWingModel[1] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 73
		rightWingModel[2] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 75
		rightWingModel[3] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 77
		rightWingModel[4] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 84
		rightWingModel[5] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 85
		rightWingModel[6] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 86
		rightWingModel[7] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 87
		rightWingModel[8] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 88
		rightWingModel[9] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 89

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -3F, -2F, 0F); // Box 71
		rightWingModel[0].setRotationPoint(-6F, -13F, 20F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 47, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F); // Box 73
		rightWingModel[1].setRotationPoint(-11F, -13F, 20F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 17, 2, 25, 0F, -7F, 0F, 0F, 1F, 0F, 0F, -5F, 1F, 0F, -4F, 1F, 0F, -7F, 0F, 0F, 1F, -1F, 0F, -5F, -2F, 0F, -4F, -1F, 0F); // Box 75
		rightWingModel[2].setRotationPoint(7F, -13F, 20F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 13, 1, 22, 0F, -7F, 0F, 0F, 1F, 0F, 0F, -5F, 1F, 0F, -4F, 1F, 0F, -7F, 0F, 0F, 1F, -1F, 0F, -5F, -2F, 0F, -4F, -1F, 0F); // Box 77
		rightWingModel[3].setRotationPoint(5F, -14F, 45F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 84
		rightWingModel[4].setRotationPoint(-14F, -18F, 67F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		rightWingModel[5].setRotationPoint(-6F, -18F, 67F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 86
		rightWingModel[6].setRotationPoint(11F, -18F, 67F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 87
		rightWingModel[7].setRotationPoint(-14F, -14F, 67F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 17, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		rightWingModel[8].setRotationPoint(-6F, -14F, 67F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -1F); // Box 89
		rightWingModel[9].setRotationPoint(11F, -14F, 67F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 50

		yawFlapModel[0].addShapeBox(2F, 0F, -0.5F, 6, 29, 1, 0F, 4F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 50
		yawFlapModel[0].setRotationPoint(72F, -48F, 0F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 53

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 53
		pitchFlapLeftModel[0].setRotationPoint(74F, -33F, -31F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 57

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 31, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 57
		pitchFlapRightModel[0].setRotationPoint(74F, -33F, 0F);


		bodyWheelModel = new ModelRendererTurbo[14];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 90
		bodyWheelModel[1] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 91
		bodyWheelModel[2] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 92
		bodyWheelModel[3] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 93
		bodyWheelModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 94
		bodyWheelModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 95
		bodyWheelModel[6] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 96
		bodyWheelModel[7] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 97
		bodyWheelModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 98
		bodyWheelModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 99
		bodyWheelModel[10] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 100
		bodyWheelModel[11] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 101
		bodyWheelModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 102
		bodyWheelModel[13] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 103

		bodyWheelModel[0].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 90
		bodyWheelModel[0].setRotationPoint(-46F, -5F, -3F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 17, 5, 1, 0F); // Box 91
		bodyWheelModel[1].setRotationPoint(-46F, -5F, 2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 92
		bodyWheelModel[2].setRotationPoint(-47F, 0F, -1F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Box 93
		bodyWheelModel[3].setRotationPoint(-40F, -2F, -1F);
		bodyWheelModel[3].rotateAngleZ = -0.95993109F;

		bodyWheelModel[4].addBox(0F, 0F, 0F, 5, 5, 2, 0F); // Box 94
		bodyWheelModel[4].setRotationPoint(-49F, 5F, -1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 95
		bodyWheelModel[5].setRotationPoint(-47F, -5F, -1F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 8, 8, 2, 0F); // Box 96
		bodyWheelModel[6].setRotationPoint(-1F, -1F, -18F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Box 97
		bodyWheelModel[7].setRotationPoint(2F, -11F, -20F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 98
		bodyWheelModel[8].setRotationPoint(-0.5F, -2F, -21F);

		bodyWheelModel[9].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 99
		bodyWheelModel[9].setRotationPoint(2.5F, -12F, -16F);
		bodyWheelModel[9].rotateAngleX = -0.71558499F;

		bodyWheelModel[10].addBox(0F, 0F, 0F, 8, 8, 2, 0F); // Box 100
		bodyWheelModel[10].setRotationPoint(-1F, -1F, 16F);

		bodyWheelModel[11].addBox(0F, 0F, 0F, 7, 7, 1, 0F); // Box 101
		bodyWheelModel[11].setRotationPoint(-0.5F, -2F, 20F);

		bodyWheelModel[12].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Box 102
		bodyWheelModel[12].setRotationPoint(2F, -11F, 18F);

		bodyWheelModel[13].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 103
		bodyWheelModel[13].setRotationPoint(2.5F, -12F, 13F);
		bodyWheelModel[13].rotateAngleX = 0.71558499F;


		bodyDoorCloseModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 25


		bodyDoorCloseModel[0].addFlexTrapezoid(0F, 0F, 0F, 10, 9, 12, 0F, -10.00F, 0.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 25
		bodyDoorCloseModel[0].setRotationPoint(-43F, -28F, -6F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.01745329F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}