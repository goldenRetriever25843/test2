//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class CopyOfModelSkyMao extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public CopyOfModelSkyMao()
	{
		bodyModel = new ModelRendererTurbo[30];
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Fuselage Middle Right
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Fuselage Middle Left
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Fuselage Front Right
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Fuselage Front Left
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Cockpit Wall Right
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // CockPit Wall Left
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Chair Back
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Chair HeadRest
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Bottom Cushion
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Side Computers Left
		bodyModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Side Computers Right
		bodyModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Computers
		bodyModel[12] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Computer Hat
		bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Angled Computer Right
		bodyModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Angled Computer Left
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Bottom HUD
		bodyModel[16] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // HUD Glass Top
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // HUD Glass
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Chair Support
		bodyModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Not Nose Right
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Not Nose Left
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Upper Cockpt Side Right
		bodyModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Upper Cockpit Side Left
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // CockPit Transition Right
		bodyModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Cockpit transition Left
		bodyModel[25] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Right Spinal Chord
		bodyModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Left Spinal Chord
		bodyModel[27] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Spine Splitters Left
		bodyModel[28] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Intake Ball Left
		bodyModel[29] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Intake Ball Right

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 200F, 8F, 0F, 0F, 6F, 0F, 0F, 4F, 48F, 200F, 4F, 46F, 200F, 33F, 0F, 0F, 33F, 0F, 0F, 32F, 30F, 200F, 33F, 30F); // Fuselage Middle Right
		bodyModel[0].setRotationPoint(148F, -47F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 200F, 4F, 46F, 0F, 4F, 48F, 0F, 6F, 0F, 200F, 8F, 0F, 200F, 33F, 30F, 0F, 32F, 30F, 0F, 33F, 0F, 200F, 33F, 0F); // Fuselage Middle Left
		bodyModel[1].setRotationPoint(148F, -47F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 50F, 8F, 0F, 0F, 8F, 0F, 0F, 4F, 46F, 65F, 4F, 42F, 30F, 33F, 0F, 0F, 33F, 0F, 0F, 33F, 30F, 50F, 30F, 30F); // Fuselage Front Right
		bodyModel[2].setRotationPoint(-53F, -47F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 65F, 4F, 42F, 0F, 4F, 46F, 0F, 8F, 0F, 50F, 8F, 0F, 50F, 30F, 30F, 0F, 33F, 30F, 0F, 33F, 0F, 30F, 33F, 0F); // Fuselage Front Left
		bodyModel[3].setRotationPoint(-53F, -47F, -1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 95F, -18F, 0F, 10F, -18F, 0F, 0F, 4F, 25F, 95F, -3F, 18F, 95F, 22F, 0F, 18F, 32F, 0F, 15F, 24F, 6F, 95F, 18F, 4F); // Cockpit Wall Right
		bodyModel[4].setRotationPoint(-101F, -47F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 95F, -3F, 18F, 0F, 4F, 25F, 10F, -18F, 0F, 95F, -18F, 0F, 95F, 18F, 4F, 15F, 24F, 6F, 18F, 32F, 0F, 95F, 22F, 0F); // CockPit Wall Left
		bodyModel[5].setRotationPoint(-101F, -47F, -1F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 25, 12, 0F); // Chair Back
		bodyModel[6].setRotationPoint(-140F, -60F, -6F);
		bodyModel[6].rotateAngleZ = -0.26179939F;

		bodyModel[7].addBox(0F, 0F, 0F, 4, 8, 12, 0F); // Chair HeadRest
		bodyModel[7].setRotationPoint(-140F, -68F, -6F);
		bodyModel[7].rotateAngleZ = -0.13962634F;

		bodyModel[8].addBox(0F, 0F, 0F, 4, 14, 12, 0F); // Bottom Cushion
		bodyModel[8].setRotationPoint(-144F, -40F, -6F);
		bodyModel[8].rotateAngleZ = -1.57079633F;

		bodyModel[9].addBox(0F, 0F, 0F, 28, 4, 5, 0F); // Side Computers Left
		bodyModel[9].setRotationPoint(-165F, -43F, -12F);
		bodyModel[9].rotateAngleX = -0.06981317F;
		bodyModel[9].rotateAngleZ = 0.03490659F;

		bodyModel[10].addBox(0F, 0F, 0F, 28, 4, 5, 0F); // Side Computers Right
		bodyModel[10].setRotationPoint(-165F, -43F, 7F);
		bodyModel[10].rotateAngleX = 0.06981317F;
		bodyModel[10].rotateAngleZ = 0.03490659F;

		bodyModel[11].addBox(0F, 0F, 0F, 3, 17, 18, 0F); // Computers
		bodyModel[11].setRotationPoint(-170F, -54F, -9F);
		bodyModel[11].rotateAngleZ = -0.08726646F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2F, 2F, 0F, 2F, 2.5F, 0F, 2F, 2.5F, 1.5F, 2F, 2F); // Computer Hat
		bodyModel[12].setRotationPoint(-178F, -55F, -8F);
		bodyModel[12].rotateAngleZ = 0.13962634F;

		bodyModel[13].addBox(0F, 0F, 0F, 12, 5, 5, 0F); // Angled Computer Right
		bodyModel[13].setRotationPoint(-172F, -47F, 7F);
		bodyModel[13].rotateAngleX = 0.06981317F;
		bodyModel[13].rotateAngleZ = -0.26179939F;

		bodyModel[14].addBox(0F, 0F, 0F, 12, 5, 5, 0F); // Angled Computer Left
		bodyModel[14].setRotationPoint(-172F, -47F, -13F);
		bodyModel[14].rotateAngleX = 0.06981317F;
		bodyModel[14].rotateAngleZ = -0.26179939F;

		bodyModel[15].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Bottom HUD
		bodyModel[15].setRotationPoint(-166F, -59F, -2F);
		bodyModel[15].rotateAngleZ = -0.13962634F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // HUD Glass Top
		bodyModel[16].setRotationPoint(-165.5F, -62.5F, -1.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // HUD Glass
		bodyModel[17].setRotationPoint(-165.5F, -62F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 6, 25, 12, 0F); // Chair Support
		bodyModel[18].setRotationPoint(-138F, -67F, -6F);
		bodyModel[18].rotateAngleZ = -0.17453293F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 17F, 15F, 0F, 0F, 18F, 0F, 0F, 4F, 18F, 17F, 4F, 18F, 17F, 15F, 0F, 0F, 15F, 0F, 0F, 11F, 4F, 17F, 11F, 4F); // Not Nose Right
		bodyModel[19].setRotationPoint(-179F, -40F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 17F, 4F, 18F, 0F, 4F, 18F, 0F, 18F, 0F, 17F, 15F, 0F, 17F, 11F, 4F, 0F, 11F, 4F, 0F, 15F, 0F, 17F, 15F, 0F); // Not Nose Left
		bodyModel[20].setRotationPoint(-179F, -40F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 45.5F, 11F, -10F, 0F, 18F, -12F, 0F, 8.4F, 22.3F, 45F, 4F, 18F, 17F, 6F, -10F, 0F, 6F, -10F, 0F, 4F, 12F, 17F, 4F, 10F); // Upper Cockpt Side Right
		bodyModel[21].setRotationPoint(-133F, -40F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 45F, 4F, 18F, 0F, 8.4F, 22.3F, 0F, 18F, -12F, 45.5F, 11F, -10F, 17F, 4F, 10F, 0F, 4F, 12F, 0F, 6F, -10F, 17F, 6F, -10F); // Upper Cockpit Side Left
		bodyModel[22].setRotationPoint(-133F, -40F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 45.5F, 28F, 0F, 0F, 22F, 0F, 0F, 12F, 22.3F, 45F, 8.4F, 22.3F, 50F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 12F, 45F, 4F, 10F); // CockPit Transition Right
		bodyModel[23].setRotationPoint(-87F, -40F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 45F, 8.4F, 22.3F, 0F, 12F, 22.3F, 0F, 22F, 0F, 45.5F, 28F, 0F, 45F, 4F, 10F, 0F, 4F, 12F, 0F, 0F, 0F, 50F, 0F, 0F); // Cockpit transition Left
		bodyModel[24].setRotationPoint(-87F, -40F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 205F, 22F, 0F, 0F, 18F, 0F, 0F, 10F, 30F, 205F, 12F, 22.3F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 12F, 17F, 4F, 10F); // Right Spinal Chord
		bodyModel[25].setRotationPoint(119F, -40F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 205F, 12F, 22.3F, 0F, 10F, 30F, 0F, 18F, 0F, 205F, 22F, 0F, 17F, 4F, 10F, 0F, 4F, 12F, 0F, 0F, 0F, 17F, 0F, 0F); // Left Spinal Chord
		bodyModel[26].setRotationPoint(119F, -40F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 80F, 12F, 22.3F, 0F, 7F, 40F, 0F, 12F, -12F, 80F, 18F, 0F, 17F, 4F, 10F, 0F, 4F, 12F, 0F, 0F, 30F, 17F, -5F, 22F); // Spine Splitters Left
		bodyModel[27].setRotationPoint(200F, -40F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 40F, 4F, 20F, 0F, 4F, 20F, 0F, 8F, 0F, 50F, 8F, -18F, 25F, 4F, 22F, 0F, 6F, 22F, 0F, 18F, 0F, 30F, 18F, 0F); // Intake Ball Left
		bodyModel[28].setRotationPoint(-95F, -41F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 50F, 8F, -18F, 0F, 8F, 0F, 0F, 4F, 20F, 40F, 4F, 20F, 30F, 18F, 0F, 0F, 18F, 0F, 0F, 6F, 22F, 25F, 4F, 22F); // Intake Ball Right
		bodyModel[29].setRotationPoint(-95F, -41F, 0F);


		noseModel = new ModelRendererTurbo[2];
		noseModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Nose Left
		noseModel[1] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Nose Right

		noseModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 61F, -1F, 0F, 0F, 15F, 0F, 0F, 4F, 18F, 20F, 0F, 15F, 40F, 6F, 0F, 0F, 15F, 0F, 0F, 11F, 4F, 30F, 4F, 8F); // Nose Left
		noseModel[0].setRotationPoint(-197F, -40F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 20F, 0F, 15F, 0F, 4F, 18F, 0F, 15F, 0F, 61F, -1F, 0F, 30F, 4F, 8F, 0F, 11F, 4F, 0F, 15F, 0F, 40F, 6F, 0F); // Nose Right
		noseModel[1].setRotationPoint(-197F, -40F, -1F);


		tailModel = new ModelRendererTurbo[11];
		tailModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Back Right Fuselage
		tailModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Back Left Fuselage
		tailModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Tail Fin Left Base
		tailModel[3] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Right Right Exhaust
		tailModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Left Left Exhaust
		tailModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Right Left Exhaust
		tailModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Left Right Exhaust
		tailModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Spine Splitters Right
		tailModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Weird Thing Right
		tailModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Weird Thing Left
		tailModel[10] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Tail Fin Right Base

		tailModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 55F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 48F, 55F, 4F, 48F, 55F, 33F, 0F, 0F, 25F, 0F, 0F, 25F, 30F, 55F, 32F, 30F); // Back Right Fuselage
		tailModel[0].setRotationPoint(204F, -47F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 55F, 4F, 48F, 0F, 0F, 48F, 0F, 0F, 0F, 55F, 6F, 0F, 55F, 32F, 30F, 0F, 25F, 30F, 0F, 25F, 0F, 55F, 33F, 0F); // Back Left Fuselage
		tailModel[1].setRotationPoint(204F, -47F, -1F);

		tailModel[2].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 46F, 0.3F, 10F, 4F, 1F, 10F, 0F, 1F, 0F, 55F, 0F, 1F, 46F, 0F, 10F, 4F, 1F, 10F, 0F, 1F, 0F, 55F, 0F, 1F); // Tail Fin Left Base
		tailModel[2].setRotationPoint(200F, -48F, -49F);
		tailModel[2].rotateAngleX = -1.08210414F;

		tailModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 12F, 0F, 25F, 11F, 0F, 25F, 5F, 10F, 0F, 6F, 11F, 0F, 12F, 0F, 25F, 11F, 0F, 25F, 4F, 10F, 0F, 4F, 11F); // Right Right Exhaust
		tailModel[3].setRotationPoint(205F, -37F, 18F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 6F, 11F, 25F, 5F, 10F, 25F, 11F, 0F, 0F, 12F, 0F, 0F, 4F, 11F, 25F, 4F, 10F, 25F, 11F, 0F, 0F, 12F, 0F); // Left Left Exhaust
		tailModel[4].setRotationPoint(205F, -37F, -19F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 6F, 11F, 25F, 5F, 10F, 25F, 11F, 0F, 0F, 12F, 0F, 0F, 4F, 11F, 25F, 4F, 10F, 25F, 11F, 0F, 0F, 12F, 0F); // Right Left Exhaust
		tailModel[5].setRotationPoint(205F, -37F, 17F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 12F, 0F, 25F, 11F, 0F, 25F, 5F, 10F, 0F, 6F, 11F, 0F, 12F, 0F, 25F, 11F, 0F, 25F, 4F, 10F, 0F, 4F, 11F); // Left Right Exhaust
		tailModel[6].setRotationPoint(205F, -37F, -18F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 80F, 18F, 0F, 0F, 12F, -12F, 0F, 7F, 40F, 80F, 12F, 22.3F, 17F, 0F, 0F, 0F, 0F, 30F, 0F, 4F, 12F, 17F, 4F, 10F); // Spine Splitters Right
		tailModel[7].setRotationPoint(200F, -40F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 5F, 15F, 36F, 2F, 0F, 36F, 1F, 12F, 12F, 2.5F, 10F, 0F, 4F, 5F, 36F, 0F, 0F, 36F, 0F, 0F, 0F, 2F, 1F); // Weird Thing Right
		tailModel[8].setRotationPoint(205F, -44F, 43F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 12F, 2.5F, 10F, 36F, 1F, 12F, 36F, 2F, 0F, 0F, 5F, 15F, 0F, 2F, 1F, 36F, 0F, 0F, 36F, 0F, 0F, 0F, 4F, 5F); // Weird Thing Left
		tailModel[9].setRotationPoint(205F, -44F, -44F);

		tailModel[10].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 55F, 0F, 1F, 0F, 1F, 0F, 4F, 1F, 10F, 46F, 0.3F, 10F, 55F, 0F, 1F, 0F, 1F, 0F, 4F, 1F, 10F, 46F, 0F, 10F); // Tail Fin Right Base
		tailModel[10].setRotationPoint(200F, -48F, 48F);
		tailModel[10].rotateAngleX = 1.08210414F;


		leftWingModel = new ModelRendererTurbo[3];
		leftWingModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Left Wing
		leftWingModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Cover Up Mini Left
		leftWingModel[2] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Sticker Left

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 32F, -2F, 112F, 0F, -4F, 115F, 20F, 0F, 0F, 180F, 3F, 0F, 32F, 5F, 112F, 0F, 4F, 115F, 20F, 3F, 0F, 170F, 0F, 0F); // Left Wing
		leftWingModel[0].setRotationPoint(175F, -47F, -47F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 2F, 3F, 10F, 0F, 2F, 10F, 0F, 2F, 0F, 40F, 3F, 0F, 2F, 0F, 3F, 5F, 0F, 3F, 2F, 0F, 0F, 5F, 0F, 0F); // Cover Up Mini Left
		leftWingModel[1].setRotationPoint(9F, -47F, -47F);

		leftWingModel[2].addBox(-12F, -0.1F, 0F, 20, 1, 36, 0F); // Sticker Left
		leftWingModel[2].setRotationPoint(158F, -44.9F, -121F);
		leftWingModel[2].rotateAngleX = 0.03490659F;
		leftWingModel[2].rotateAngleY = -0.13962634F;
		leftWingModel[2].rotateAngleZ = -0.01745329F;


		rightWingModel = new ModelRendererTurbo[3];
		rightWingModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Right Wing
		rightWingModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Cover Up mini Right
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Sticker Right

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 180F, 3F, 0F, 20F, 0F, 0F, 0F, -4F, 115F, 32F, -2F, 112F, 170F, 0F, 0F, 20F, 3F, 0F, 0F, 4F, 115F, 32F, 5F, 112F); // Right Wing
		rightWingModel[0].setRotationPoint(175F, -47F, 46F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 40F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 10F, 2F, 3F, 10F, 5F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 3F, 2F, 0F, 3F); // Cover Up mini Right
		rightWingModel[1].setRotationPoint(9F, -47F, 46F);

		rightWingModel[2].addBox(-12F, 0F, 0F, 20, 1, 36, 0F); // Sticker Right
		rightWingModel[2].setRotationPoint(158F, -46.9F, 85F);
		rightWingModel[2].rotateAngleX = -0.01745329F;
		rightWingModel[2].rotateAngleY = 0.13962634F;
		rightWingModel[2].rotateAngleZ = -0.01745329F;


		yawFlapModel = new ModelRendererTurbo[6];
		yawFlapModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // JoyStick Core
		yawFlapModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // JoyStick
		yawFlapModel[2] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Yaw flap Left
		yawFlapModel[3] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Yaw Flap Right
		yawFlapModel[4] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Yaw Sticker Left
		yawFlapModel[5] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Yaw Sticker Right

		yawFlapModel[0].addBox(-2F, -6F, -2F, 4, 6, 4, 0F); // JoyStick Core
		yawFlapModel[0].setRotationPoint(-162F, -38F, 0F);

		yawFlapModel[1].addBox(-0.5F, -14F, -0.5F, 1, 8, 1, 0F); // JoyStick
		yawFlapModel[1].setRotationPoint(-162F, -38F, 0F);

		yawFlapModel[2].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 5F, 0F, 69F, 25F, 0F, 68F, 4F, 1F, -10F, 47F, 0F, -10F, 5F, 0F, 69F, 25F, 0F, 68F, 4F, 1F, -10F, 47F, 0F, -10F); // Yaw flap Left
		yawFlapModel[2].setRotationPoint(200F, -48F, -49F);
		yawFlapModel[2].rotateAngleX = -1.08210414F;

		yawFlapModel[3].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 47F, 0F, -10F, 4F, 1F, -10F, 25F, 0F, 68F, 5F, 0F, 69F, 47F, 0F, -10F, 4F, 1F, -10F, 25F, 0F, 68F, 5F, 0F, 69F); // Yaw Flap Right
		yawFlapModel[3].setRotationPoint(200F, -48F, 48F);
		yawFlapModel[3].rotateAngleX = 1.08210414F;

		yawFlapModel[4].addBox(0F, -0.3F, -42F, 23, 1, 28, 0F); // Yaw Sticker Left
		yawFlapModel[4].setRotationPoint(200F, -48F, -50F);
		yawFlapModel[4].rotateAngleX = -1.09083078F;
		yawFlapModel[4].rotateAngleY = -0.01745329F;

		yawFlapModel[5].addBox(0F, 1F, 14F, 23, 1, 28, 0F); // Yaw Sticker Right
		yawFlapModel[5].setRotationPoint(200F, -48F, 48F);
		yawFlapModel[5].rotateAngleX = 1.10828408F;
		yawFlapModel[5].rotateAngleY = 0.01745329F;


		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Canard Left
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Back Sanard Left

		pitchFlapLeftModel[0].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 11F, 0F, 52F, 9F, 0F, 55F, 0F, 1F, 0F, 65F, 0F, 1F, 11F, 0F, 50F, 9F, 0F, 52F, 0F, 1F, 0F, 65F, 0F, 1F); // Canard Left
		pitchFlapLeftModel[0].setRotationPoint(-56F, -48F, -47F);
		pitchFlapLeftModel[0].rotateAngleX = -0.20943951F;
		
		pitchFlapLeftModel[1].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 11F, 0F, 32F, 9F, 0F, 35F, 0F, 1F, 0F, 45F, 0F, 1F, 11F, 0F, 30F, 9F, 0F, 32F, 0F, 1F, 0F, 45F, 0F, 1F); // Back Sanard Left
		pitchFlapLeftModel[1].setRotationPoint(216F, -44F, -47F);
		pitchFlapLeftModel[1].rotateAngleX = 0.52359878F;


		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Canard Right
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Back Canard Right
		

		pitchFlapRightModel[0].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 65F, 0F, 1F, 0F, 1F, 0F, 9F, 0F, 55F, 11F, 0F, 52F, 65F, 0F, 1F, 0F, 1F, 0F, 9F, 0F, 52F, 11F, 0F, 50F); // Canard Right
		pitchFlapRightModel[0].setRotationPoint(-56F, -48F, 46F);
		pitchFlapRightModel[0].rotateAngleX = 0.20943951F;

		pitchFlapRightModel[1].addShapeBox(20F, 0F, 0F, 1, 1, 1, 0F, 45F, 0F, 1F, 0F, 1F, 0F, 9F, 0F, 35F, 11F, 0F, 32F, 45F, 0F, 1F, 0F, 1F, 0F, 9F, 0F, 32F, 11F, 0F, 30F); // Back Canard Right
		pitchFlapRightModel[1].setRotationPoint(216F, -44F, 46F);
		pitchFlapRightModel[1].rotateAngleX = -0.52359878F;



		bodyWheelModel = new ModelRendererTurbo[11];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Left Hole
		bodyWheelModel[1] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Open Hole Left
		bodyWheelModel[2] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Left Stick
		bodyWheelModel[3] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Left Wheel
		bodyWheelModel[4] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Right Hole
		bodyWheelModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Open Hole Right
		bodyWheelModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Right Stick
		bodyWheelModel[7] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Right Wheel
		bodyWheelModel[8] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Center Door
		bodyWheelModel[9] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Center Stick
		bodyWheelModel[10] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Center Wheel

		bodyWheelModel[0].addBox(0F, 0F, 0F, 26, 13, 1, 0F); // Left Hole
		bodyWheelModel[0].setRotationPoint(20F, -26F, -37F);
		bodyWheelModel[0].rotateAngleX = 0.40142573F;

		bodyWheelModel[1].addBox(0F, 0F, 0F, 26, 13, 1, 0F); // Open Hole Left
		bodyWheelModel[1].setRotationPoint(20F, -14F, -31F);
		bodyWheelModel[1].rotateAngleX = -0.08726646F;

		bodyWheelModel[2].addBox(-2F, 0F, 0F, 2, 36, 1, 0F); // Left Stick
		bodyWheelModel[2].setRotationPoint(43F, -25F, -37F);
		bodyWheelModel[2].rotateAngleX = -0.08726646F;
		bodyWheelModel[2].rotateAngleZ = 0.78539816F;

		bodyWheelModel[3].addBox(0F, 0F, 0F, 16, 16, 5, 0F); // Left Wheel
		bodyWheelModel[3].setRotationPoint(61F, -6F, -45F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 26, 13, 1, 0F); // Right Hole
		bodyWheelModel[4].setRotationPoint(20F, -26F, 36F);
		bodyWheelModel[4].rotateAngleX = -0.40142573F;

		bodyWheelModel[5].addBox(0F, 0F, 0F, 26, 13, 1, 0F); // Open Hole Right
		bodyWheelModel[5].setRotationPoint(20F, -14F, 30F);
		bodyWheelModel[5].rotateAngleX = 0.08726646F;

		bodyWheelModel[6].addBox(-2F, 0F, 0F, 2, 36, 1, 0F); // Right Stick
		bodyWheelModel[6].setRotationPoint(43F, -25F, 36F);
		bodyWheelModel[6].rotateAngleX = 0.08726646F;
		bodyWheelModel[6].rotateAngleZ = 0.78539816F;

		bodyWheelModel[7].addBox(0F, 0F, 0F, 16, 16, 5, 0F); // Right Wheel
		bodyWheelModel[7].setRotationPoint(61F, -6F, 40F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 40, 10, 1, 0F); // Center Door
		bodyWheelModel[8].setRotationPoint(-142F, -23F, 3F);
		bodyWheelModel[8].rotateAngleX = 0.13962634F;
		bodyWheelModel[8].rotateAngleZ = -0.08726646F;

		bodyWheelModel[9].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Center Stick
		bodyWheelModel[9].setRotationPoint(-105F, -23F, 1F);

		bodyWheelModel[10].addBox(0F, 0F, 0F, 10, 10, 3, 0F); // Center Wheel
		bodyWheelModel[10].setRotationPoint(-108.5F, 0F, -2F);


		bodyDoorOpenModel = new ModelRendererTurbo[31];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Bottom Hole
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Right Bay Door
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Left Bay Door
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Missile Core 1
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Missile Core 2
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Missile Core 3
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Missile Core 4
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Missile Core 6
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Missile Core 5
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Missile Tip 1
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Missile Tip 2
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Missile Tip 3
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Missile Tip 4
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Missile tip 5
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Missile Tip 6
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // HardPoint 1
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // HardPoint 2
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // HardPoint 3
		bodyDoorOpenModel[18] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // HardPoint 4
		bodyDoorOpenModel[19] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // HardPoint 5
		bodyDoorOpenModel[20] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // HardPoint 6
		bodyDoorOpenModel[21] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Left Missile Door
		bodyDoorOpenModel[22] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Left Bay Hole
		bodyDoorOpenModel[23] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Left HardPoint
		bodyDoorOpenModel[24] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Left Missile
		bodyDoorOpenModel[25] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Missile Tip Left
		bodyDoorOpenModel[26] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Right Bay Hole
		bodyDoorOpenModel[27] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Right Missile Door
		bodyDoorOpenModel[28] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Right HardPoint
		bodyDoorOpenModel[29] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Right Missile
		bodyDoorOpenModel[30] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Missile Tip Right

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 64, 1, 56, 0F); // Bottom Hole
		bodyDoorOpenModel[0].setRotationPoint(-46F, -13.7F, -28F);

		bodyDoorOpenModel[1].addBox(0F, 0F, -0.5F, 64, 28, 1, 0F); // Right Bay Door
		bodyDoorOpenModel[1].setRotationPoint(-46F, -13F, 29F);
		bodyDoorOpenModel[1].rotateAngleX = 0.87266463F;

		bodyDoorOpenModel[2].addBox(0F, 0F, -0.5F, 64, 28, 1, 0F); // Left Bay Door
		bodyDoorOpenModel[2].setRotationPoint(-46F, -13F, -30F);
		bodyDoorOpenModel[2].rotateAngleX = -0.87266463F;

		bodyDoorOpenModel[3].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Missile Core 1
		bodyDoorOpenModel[3].setRotationPoint(-32F, -7.7F, 22F);

		bodyDoorOpenModel[4].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Missile Core 2
		bodyDoorOpenModel[4].setRotationPoint(-32F, -7.7F, 13F);

		bodyDoorOpenModel[5].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Missile Core 3
		bodyDoorOpenModel[5].setRotationPoint(-32F, -7.7F, 5F);

		bodyDoorOpenModel[6].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Missile Core 4
		bodyDoorOpenModel[6].setRotationPoint(-32F, -7.7F, -5F);

		bodyDoorOpenModel[7].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Missile Core 6
		bodyDoorOpenModel[7].setRotationPoint(-32F, -7.7F, -22F);

		bodyDoorOpenModel[8].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Missile Core 5
		bodyDoorOpenModel[8].setRotationPoint(-32F, -7.7F, -13F);

		bodyDoorOpenModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip 1
		bodyDoorOpenModel[9].setRotationPoint(-35F, -6.2F, 21.5F);

		bodyDoorOpenModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip 2
		bodyDoorOpenModel[10].setRotationPoint(-35F, -6.2F, 12.5F);

		bodyDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip 3
		bodyDoorOpenModel[11].setRotationPoint(-35F, -6.2F, 4.5F);

		bodyDoorOpenModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip 4
		bodyDoorOpenModel[12].setRotationPoint(-35F, -6.2F, -5.5F);

		bodyDoorOpenModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile tip 5
		bodyDoorOpenModel[13].setRotationPoint(-35F, -6.2F, -13.5F);

		bodyDoorOpenModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip 6
		bodyDoorOpenModel[14].setRotationPoint(-35F, -6.2F, -22.5F);

		bodyDoorOpenModel[15].addBox(-2F, 0F, -0.5F, 30, 5, 1, 0F); // HardPoint 1
		bodyDoorOpenModel[15].setRotationPoint(-26F, -12.7F, 22F);

		bodyDoorOpenModel[16].addBox(-2F, 0F, -0.5F, 30, 5, 1, 0F); // HardPoint 2
		bodyDoorOpenModel[16].setRotationPoint(-26F, -12.7F, 13F);

		bodyDoorOpenModel[17].addBox(-2F, 0F, -0.5F, 30, 5, 1, 0F); // HardPoint 3
		bodyDoorOpenModel[17].setRotationPoint(-26F, -12.7F, 5F);

		bodyDoorOpenModel[18].addBox(-2F, 0F, -0.5F, 30, 5, 1, 0F); // HardPoint 4
		bodyDoorOpenModel[18].setRotationPoint(-26F, -12.7F, -5F);

		bodyDoorOpenModel[19].addBox(-2F, 0F, -0.5F, 30, 5, 1, 0F); // HardPoint 5
		bodyDoorOpenModel[19].setRotationPoint(-26F, -12.7F, -13F);

		bodyDoorOpenModel[20].addBox(-2F, 0F, -0.5F, 30, 5, 1, 0F); // HardPoint 6
		bodyDoorOpenModel[20].setRotationPoint(-26F, -12.7F, -22F);

		bodyDoorOpenModel[21].addBox(0F, 0F, -0.5F, 64, 12, 1, 0F); // Left Missile Door
		bodyDoorOpenModel[21].setRotationPoint(-46F, -32F, -39F);
		bodyDoorOpenModel[21].rotateAngleX = -1.41371669F;

		bodyDoorOpenModel[22].addBox(0F, 0F, -0.5F, 64, 12, 1, 0F); // Left Bay Hole
		bodyDoorOpenModel[22].setRotationPoint(-46F, -32F, -39F);
		bodyDoorOpenModel[22].rotateAngleX = 0.41887902F;

		bodyDoorOpenModel[23].addBox(-2F, 0F, -0.5F, 30, 3, 1, 0F); // Left HardPoint
		bodyDoorOpenModel[23].setRotationPoint(-26F, -30.7F, -44F);
		bodyDoorOpenModel[23].rotateAngleX = 0.17453293F;

		bodyDoorOpenModel[24].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Left Missile
		bodyDoorOpenModel[24].setRotationPoint(-32F, -28F, -44F);
		bodyDoorOpenModel[24].rotateAngleX = 0.17453293F;

		bodyDoorOpenModel[25].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip Left
		bodyDoorOpenModel[25].setRotationPoint(-35F, -27F, -44.3F);
		bodyDoorOpenModel[25].rotateAngleX = 0.17453293F;

		bodyDoorOpenModel[26].addBox(0F, 0F, -0.5F, 64, 12, 1, 0F); // Right Bay Hole
		bodyDoorOpenModel[26].setRotationPoint(-46F, -32F, 40F);
		bodyDoorOpenModel[26].rotateAngleX = -0.41887902F;

		bodyDoorOpenModel[27].addBox(0F, -14F, -0.5F, 64, 12, 1, 0F); // Right Missile Door
		bodyDoorOpenModel[27].setRotationPoint(-46F, -32F, 38F);
		bodyDoorOpenModel[27].rotateAngleX = -1.74532925F;

		bodyDoorOpenModel[28].addBox(-2F, 0F, -0.5F, 30, 3, 1, 0F); // Right HardPoint
		bodyDoorOpenModel[28].setRotationPoint(-26F, -30.7F, 43F);
		bodyDoorOpenModel[28].rotateAngleX = -0.17453293F;

		bodyDoorOpenModel[29].addBox(-2F, 0F, -2F, 45, 4, 4, 0F); // Right Missile
		bodyDoorOpenModel[29].setRotationPoint(-32F, -28F, 42.5F);
		bodyDoorOpenModel[29].rotateAngleX = -0.17453293F;

		bodyDoorOpenModel[30].addShapeBox(0F, 0.4F, 0F, 1, 1, 1, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 4F, 0F, 0F); // Missile Tip Right
		bodyDoorOpenModel[30].setRotationPoint(-35F, -27F, 41.8F);
		bodyDoorOpenModel[30].rotateAngleX = -0.17453293F;


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // HUD

		hudModel[0].addBox(0F, -1.5F, -2F, 0, 3, 4, 0F); // HUD
		hudModel[0].setRotationPoint(-164.25F, -60.5F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}