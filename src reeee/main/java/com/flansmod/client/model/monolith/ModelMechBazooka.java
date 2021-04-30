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

public class ModelMechBazooka extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMechBazooka() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[49];
		gunModel[0] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 2, 23, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 15, 59, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 6, 76, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 5, 57, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 77, 37, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 77, 37, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 77, 37, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 83, 23, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 5, 73, textureX, textureY); // Box 50

		gunModel[0].addBox(1F, -4F, -1F, 3, 8, 2, 0F); // Box 1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(-13F, 4F, -4F, 30, 8, 8, 0F); // Box 0
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(4F, 12F, -4F, 10, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(11F, 6F, 4F, 6, 4, 4, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(12.5F, 12F, 5F, 3, 2, 2, 0F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F); // Box 3
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(13.2F, 13F, 5F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(12.2F, 13F, 5F, 1, 8, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(15.2F, 20F, 5F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(-20F, 5F, -3F, 7, 2, 6, 0F); // Box 8
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addBox(-28F, 4F, -4F, 8, 8, 8, 0F); // Box 9
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-30F, 6F, -3F, 2, 6, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(-20F, 8F, -3F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-20F, 6F, -3F, 7, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(-20F, 10F, -3F, 7, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 13
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addBox(-12F, 12F, -2F, 2, 4, 4, 0F); // Box 14
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-11.2F, 12.2F, 2F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-13.2F, 12.2F, 2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addBox(-36.2F, 12.2F, 2F, 23, 2, 2, 0F); // Box 17
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(-13.2F, 14.2F, 2F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addBox(-36.2F, 12.2F, -2F, 24, 1, 4, 0F); // Box 19
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-13.2F, 14.2F, -4F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addBox(-36.2F, 12.2F, -4F, 23, 2, 2, 0F); // Box 23
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(-36.2F, 14.2F, 2F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addShapeBox(-36.2F, 14.2F, -4F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addBox(-47.2F, 12.2F, -4F, 11, 6, 8, 0F); // Box 26
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(-10F, 12F, -4F, 8, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addBox(-2F, 12F, -4F, 6, 2, 8, 0F); // Box 28
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(3F, 14F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(-2F, 14F, -4F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(1F, -6F, -1F, 4, 2, 2, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(5F, -6F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addBox(17F, 7F, -3F, 30, 2, 6, 0F); // Box 33
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(17F, 5F, -3F, 30, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(17F, 9F, -3F, 30, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 35
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addBox(48F, 6F, -4F, 16, 4, 8, 0F); // Box 36
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(48F, 4F, -4F, 16, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(48F, 10F, -4F, 16, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 38
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(47F, 4F, -4F, 1, 2, 8, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 39
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addShapeBox(47F, 6F, -4F, 1, 4, 8, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 40
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addShapeBox(47F, 10F, -4F, 1, 2, 8, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 41
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addShapeBox(64F, 4F, -4F, 1, 2, 8, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 42
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addShapeBox(64F, 6F, -4F, 1, 4, 8, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 43
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(64F, 10F, -4F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F); // Box 44
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addShapeBox(65F, 5F, -3F, 4, 2, 6, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, .5F, -.8F, 0F, .5F, -.8F, 0F, 0F, 0F); // Box 45
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(65F, 7F, -3F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, 0F, -.5F, -.8F, 0F, 0F, 0F); // Box 46
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(65F, 9F, -3F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, .5F, -.8F, 0F, .5F, -.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 47
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addShapeBox(12.5F, 9F, 5F, 3, 3, 3, 0F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F); // Box 48
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addShapeBox(-13.2F, 12.2F, -4F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addShapeBox(-11.2F, 12.2F, -4F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[48].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}