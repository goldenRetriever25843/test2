//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKotatsu extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelKotatsu() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[48];
		bodyModel[0] = new ModelRendererTurbo(this, 17, 127, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 149, 101, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 117, 136, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 11, 77, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 11, 77, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 223, 101, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 223, 101, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 223, 101, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 223, 101, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 230, 82, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 229, 74, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 230, 67, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 30, 166, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 152, 78, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 152, 73, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 164, 77, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 164, 77, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 164, 77, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 164, 77, textureX, textureY); // Box 57
		bodyModel[44] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 143, 78, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 143, 78, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 143, 83, textureX, textureY); // Box 61

		bodyModel[0].addBox(-15F, -2F, -15F, 30, 1, 30, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-5F, -1F, -5F, 10, 2, 10, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-14F, -1F, -14F, 3, 11, 3, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-14F, -1F, 11F, 3, 11, 3, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(11F, -1F, 11F, 3, 11, 3, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(11F, -1F, -14F, 3, 11, 3, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-16F, -4F, -16F, 32, 1, 32, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-15F, -3F, -15F, 30, 13, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 8F, 8F, 0F, 8F, 8F, 0F, 8F, 8F, 0F, 8F); // Box 7
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-15F, -2.9F, -15F, 30, 13, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 8F, 8F, 0F, 8F, 8F, 0F, 8F, 8F, 0F, 8F); // Box 8
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-13F, -7F, -5F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(4F, -7F, 9F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(9F, -7F, -2F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, -7F, -13F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3F, -7F, -4F, 4, 3, 1, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3F, -7F, -3F, 4, 3, 2, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, -7F, -1F, 4, 3, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3F, -3F, -3F, 6, 6, 6, 0F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F); // Box 29
		bodyModel[16].setRotationPoint(0F, -7F, -1F);
		bodyModel[16].rotateAngleX = -0.01745329F;
		bodyModel[16].rotateAngleY = 0.50614548F;
		bodyModel[16].rotateAngleZ = -0.01745329F;

		bodyModel[17].addShapeBox(-3F, -3F, -3F, 6, 6, 6, 0F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F); // Box 30
		bodyModel[17].setRotationPoint(-1F, -7.5F, -2F);
		bodyModel[17].rotateAngleX = -0.50614548F;
		bodyModel[17].rotateAngleY = 0.71558499F;
		bodyModel[17].rotateAngleZ = -0.50614548F;

		bodyModel[18].addShapeBox(-3F, -3F, -3F, 6, 6, 6, 0F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F); // Box 32
		bodyModel[18].setRotationPoint(-2F, -7F, -1F);
		bodyModel[18].rotateAngleX = -0.50614548F;
		bodyModel[18].rotateAngleY = 1.6406095F;
		bodyModel[18].rotateAngleZ = 0.52359878F;

		bodyModel[19].addShapeBox(-3F, -3F, -5F, 6, 6, 6, 0F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F); // Box 33
		bodyModel[19].setRotationPoint(-2F, -7F, -1F);
		bodyModel[19].rotateAngleX = -0.19198622F;
		bodyModel[19].rotateAngleZ = -0.19198622F;

		bodyModel[20].addShapeBox(-3F, -3F, -3F, 6, 6, 6, 0F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F, -2.3F); // Box 34
		bodyModel[20].setRotationPoint(0F, -7.5F, -3F);
		bodyModel[20].rotateAngleY = -0.10471976F;
		bodyModel[20].rotateAngleZ = -0.50614548F;

		bodyModel[21].addShapeBox(-4F, 6F, 19F, 14, 2, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 8F, 19F, 14, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 36
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-31F, 6F, -6F, 14, 2, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-31F, 8F, -6F, 14, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 38
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-10F, 6F, -34F, 14, 2, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-10F, 8F, -34F, 14, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 40
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(21F, 6F, -7F, 14, 2, 14, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(21F, 8F, -7F, 14, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 42
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4F, -6F, 3F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(0F, 0F, 0F);
		bodyModel[29].rotateAngleY = 0.50614548F;

		bodyModel[30].addShapeBox(-5F, -6F, 3F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 44
		bodyModel[30].setRotationPoint(0F, 0F, 0F);
		bodyModel[30].rotateAngleY = 0.50614548F;

		bodyModel[31].addShapeBox(-2F, -6F, 3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 45
		bodyModel[31].setRotationPoint(0F, 0F, 0F);
		bodyModel[31].rotateAngleY = 0.50614548F;

		bodyModel[32].addShapeBox(-5F, -5F, 3F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 46
		bodyModel[32].setRotationPoint(0F, 0F, 0F);
		bodyModel[32].rotateAngleY = 0.50614548F;

		bodyModel[33].addShapeBox(-4F, -5F, 3F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 47
		bodyModel[33].setRotationPoint(0F, 0F, 0F);
		bodyModel[33].rotateAngleY = 0.50614548F;

		bodyModel[34].addShapeBox(-2F, -5F, 3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 48
		bodyModel[34].setRotationPoint(0F, 0F, 0F);
		bodyModel[34].rotateAngleY = 0.50614548F;

		bodyModel[35].addShapeBox(-4F, -7F, 6F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[35].setRotationPoint(0F, 0F, 0F);
		bodyModel[35].rotateAngleY = 0.50614548F;

		bodyModel[36].addShapeBox(-2F, -7F, 3F, 1, 1, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 50
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
		bodyModel[36].rotateAngleY = 0.50614548F;

		bodyModel[37].addShapeBox(-5F, -7F, 3F, 1, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 51
		bodyModel[37].setRotationPoint(0F, 0F, 0F);
		bodyModel[37].rotateAngleY = 0.50614548F;

		bodyModel[38].addShapeBox(-4F, -7F, 3F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[38].setRotationPoint(0F, 0F, 0F);
		bodyModel[38].rotateAngleY = 0.50614548F;

		bodyModel[39].addShapeBox(-4F, -7.5F, 4F, 2, 1, 2, 0F, .2F, -.3F, .2F, .2F, -.3F, .2F, .2F, -.3F, .2F, .2F, -.3F, .2F, .2F, -.3F, .2F, .2F, -.3F, .2F, .2F, -.3F, .2F, .2F, -.3F, .2F); // Box 53
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
		bodyModel[39].rotateAngleY = 0.50614548F;

		bodyModel[40].addShapeBox(-6.5F, -7F, 4.5F, 2, 1, 1, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F); // Box 54
		bodyModel[40].setRotationPoint(0F, 0F, 0F);
		bodyModel[40].rotateAngleY = 0.50614548F;

		bodyModel[41].addShapeBox(-6.5F, -6F, 4.5F, 2, 1, 1, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Box 55
		bodyModel[41].setRotationPoint(0F, 0F, 0F);
		bodyModel[41].rotateAngleY = 0.50614548F;

		bodyModel[42].addShapeBox(-6.5F, -7F, 4.5F, 1, 2, 1, 0F, -.2F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F); // Box 56
		bodyModel[42].setRotationPoint(0F, 0F, 0F);
		bodyModel[42].rotateAngleY = 0.50614548F;

		bodyModel[43].addShapeBox(-5.5F, -7F, 4.5F, 1, 2, 1, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.4F, -.2F, 0F); // Box 57
		bodyModel[43].setRotationPoint(0F, 0F, 0F);
		bodyModel[43].rotateAngleY = 0.50614548F;

		bodyModel[44].addShapeBox(-3.5F, -8F, 4.5F, 1, 1, 1, 0F, .3F, -.5F, .3F, .3F, -.5F, .3F, .3F, -.5F, .3F, .3F, -.5F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[44].setRotationPoint(0F, 0F, 0F);
		bodyModel[44].rotateAngleY = 0.50614548F;

		bodyModel[45].addShapeBox(-1F, -6F, 4.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[45].setRotationPoint(0F, 0F, 0F);
		bodyModel[45].rotateAngleY = 0.50614548F;

		bodyModel[46].addShapeBox(-1F, -7F, 4.5F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(0F, 0F, 0F);
		bodyModel[46].rotateAngleY = 0.50614548F;

		bodyModel[47].addShapeBox(0F, -7F, 4.5F, 1, 1, 1, 0F, 0F, 0F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[47].setRotationPoint(0F, 0F, 0F);
		bodyModel[47].rotateAngleY = 0.50614548F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}