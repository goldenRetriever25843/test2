//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelMaidMech extends ModelMecha
{
	int textureX = 512;
	int textureY = 512;

	public ModelMaidMech()
	{
		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // RibCage
		bodyModel[1] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Pelvis
		bodyModel[2] = new ModelRendererTurbo(this, 60, 0, textureX, textureY); // Mammary Right
		bodyModel[3] = new ModelRendererTurbo(this, 75, 0, textureX, textureY); // Mammary Left
		bodyModel[4] = new ModelRendererTurbo(this, 120, 3, textureX, textureY); // Neck
		bodyModel[5] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // BraRight
		bodyModel[6] = new ModelRendererTurbo(this, 20, 200, textureX, textureY); // BraLeft
		bodyModel[7] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Apron
		bodyModel[8] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Shirt

		bodyModel[0].addBox(-3F, 0.2F, -1.3F, 6, 8, 3, 0F); // RibCage
		bodyModel[0].setRotationPoint(0F, -24F, 0F);
		bodyModel[0].rotateAngleX = -0.08726646F;
		bodyModel[0].rotateAngleY = 1.57079633F;

		bodyModel[1].addBox(-4F, 7.5F, -3F, 8, 3, 4, 0F); // Pelvis
		bodyModel[1].setRotationPoint(0F, -24F, 0F);
		bodyModel[1].rotateAngleX = 0.12217305F;
		bodyModel[1].rotateAngleY = 1.57079633F;

		bodyModel[2].addBox(-3.5F, -0.5F, -4.5F, 3, 3, 3, 0F); // Mammary Right
		bodyModel[2].setRotationPoint(0F, -24F, 0F);
		bodyModel[2].rotateAngleX = 0.9250245F;
		bodyModel[2].rotateAngleY = 1.57079633F;
		bodyModel[2].rotateAngleZ = 0.12217305F;

		bodyModel[3].addBox(0.5F, -0.5F, -4.5F, 3, 3, 3, 0F); // Mammary Left
		bodyModel[3].setRotationPoint(0F, -24F, 0F);
		bodyModel[3].rotateAngleX = 0.9250245F;
		bodyModel[3].rotateAngleY = 1.57079633F;
		bodyModel[3].rotateAngleZ = -0.12217305F;

		bodyModel[4].addBox(-1F, -1F, -1F, 2, 2, 2, 0F); // Neck
		bodyModel[4].setRotationPoint(0F, -24F, 0F);
		bodyModel[4].rotateAngleY = 1.57079633F;

		bodyModel[5].addBox(-3.6F, -0.7F, -4.6F, 3, 3, 3, 0F); // BraRight
		bodyModel[5].setRotationPoint(0F, -24F, 0F);
		bodyModel[5].rotateAngleX = 0.9250245F;
		bodyModel[5].rotateAngleY = 1.57079633F;
		bodyModel[5].rotateAngleZ = 0.17453293F;

		bodyModel[6].addBox(0.6F, -0.7F, -4.6F, 3, 3, 3, 0F); // BraLeft
		bodyModel[6].setRotationPoint(0F, -24F, 0F);
		bodyModel[6].rotateAngleX = 0.9250245F;
		bodyModel[6].rotateAngleY = 1.57079633F;
		bodyModel[6].rotateAngleZ = -0.17453293F;

		bodyModel[7].addBox(-3F, 0.2F, -1.5F, 6, 8, 4, 0F); // Apron
		bodyModel[7].setRotationPoint(0F, -24F, 0F);
		bodyModel[7].rotateAngleX = -0.08726646F;
		bodyModel[7].rotateAngleY = 1.57079633F;

		bodyModel[8].addBox(-3.5F, 0.2F, -1.15F, 7, 8, 3, 0F); // Shirt
		bodyModel[8].setRotationPoint(0F, -24F, 0F);
		bodyModel[8].rotateAngleX = -0.08726646F;
		bodyModel[8].rotateAngleY = 1.57079633F;


		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Spine
		headModel[1] = new ModelRendererTurbo(this, 30, 0, textureX, textureY); // Head
		headModel[2] = new ModelRendererTurbo(this, 30, 30, textureX, textureY); // Maid HeadDress
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Rubber Band Thing
		headModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // SidePonyTail
		headModel[5] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Hat
		headModel[6] = new ModelRendererTurbo(this, 170, 200, textureX, textureY); // Back HeadDress
		headModel[7] = new ModelRendererTurbo(this, 130, 200, textureX, textureY); // HeadDress Knot

		headModel[0].addBox(0F, -9F, 0F, 0, 40, 0, 0F); // Spine
		headModel[0].setRotationPoint(0F, -24F, 0F);
		headModel[0].rotateAngleY = 1.57079633F;

		headModel[1].addBox(-4F, -8.2F, -4F, 8, 8, 8, 0F); // Head
		headModel[1].setRotationPoint(0F, -24F, 0F);
		headModel[1].rotateAngleY = 1.57079633F;

		headModel[2].addBox(-3F, -9F, -4F, 6, 1, 0, 0F); // Maid HeadDress
		headModel[2].setRotationPoint(0F, -24F, 0F);
		headModel[2].rotateAngleY = 1.57079633F;

		headModel[3].addBox(3.5F, -7.2F, 0F, 1, 3, 3, 0F); // Rubber Band Thing
		headModel[3].setRotationPoint(0F, -24F, 0F);
		headModel[3].rotateAngleY = 1.57079633F;

		headModel[4].addBox(4.2F, -6.7F, 0.5F, 1, 9, 2, 0F); // SidePonyTail
		headModel[4].setRotationPoint(0F, -24F, 0F);
		headModel[4].rotateAngleY = 1.57079633F;

		headModel[5].addBox(-4.5F, -9.2F, -4.5F, 9, 2, 9, 0F); // Hat
		headModel[5].setRotationPoint(0F, -24F, 0F);
		headModel[5].rotateAngleY = 1.57079633F;

		headModel[6].addBox(-4.5F, -8F, 3.5F, 9, 8, 1, 0F); // Back HeadDress
		headModel[6].setRotationPoint(0F, -24F, 0F);
		headModel[6].rotateAngleY = 1.57079633F;

		headModel[7].addBox(-4.5F, -9.7F, 3F, 9, 3, 2, 0F); // HeadDress Knot
		headModel[7].setRotationPoint(0F, -24F, 0F);
		headModel[7].rotateAngleY = 1.57079633F;


		hipsModel = new ModelRendererTurbo[1];
		hipsModel[0] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Lower Dress

		hipsModel[0].addBox(-5F, 0.45F, -3.5F, 10, 3, 5, 0F); // Lower Dress
		hipsModel[0].setRotationPoint(-0.5F, -17F, 0F);
		hipsModel[0].rotateAngleX = 0.12217305F;
		hipsModel[0].rotateAngleY = 1.57079633F;


		leftArmModel = new ModelRendererTurbo[4];
		leftArmModel[0] = new ModelRendererTurbo(this, 160, 0, textureX, textureY); // Top
		leftArmModel[1] = new ModelRendererTurbo(this, 180, 0, textureX, textureY); // Bottom
		leftArmModel[2] = new ModelRendererTurbo(this, 50, 250, textureX, textureY); // Left Sleeve
		leftArmModel[3] = new ModelRendererTurbo(this, 100, 250, textureX, textureY); // Lower Left sleeve

		leftArmModel[0].addBox(-0.5F, 1F, -1F, 2, 6, 3, 0F); // Top
		leftArmModel[0].setRotationPoint(0F, 0F, -3F);
		leftArmModel[0].rotateAngleX = 0.10471976F;
		leftArmModel[0].rotateAngleY = 1.57079633F;
		leftArmModel[0].rotateAngleZ = 0.34906585F;

		leftArmModel[1].addBox(-0.3F, 6.5F, -0.3F, 2, 6, 3, 0F); // Bottom
		leftArmModel[1].setRotationPoint(0F, 0F, -3F);
		leftArmModel[1].rotateAngleY = 1.57079633F;
		leftArmModel[1].rotateAngleZ = 0.31415927F;

		leftArmModel[2].addBox(-1F, 0.9F, -1.5F, 3, 6, 4, 0F); // Left Sleeve
		leftArmModel[2].setRotationPoint(0F, 0F, -3F);
		leftArmModel[2].rotateAngleX = 0.10471976F;
		leftArmModel[2].rotateAngleY = 1.57079633F;
		leftArmModel[2].rotateAngleZ = 0.34906585F;

		leftArmModel[3].addBox(-0.8F, 6.5F, -0.8F, 3, 5, 4, 0F); // Lower Left sleeve
		leftArmModel[3].setRotationPoint(0F, 0F, -3F);
		leftArmModel[3].rotateAngleY = 1.57079633F;
		leftArmModel[3].rotateAngleZ = 0.31415927F;


		rightArmModel = new ModelRendererTurbo[4];
		rightArmModel[0] = new ModelRendererTurbo(this, 120, 0, textureX, textureY); // Top
		rightArmModel[1] = new ModelRendererTurbo(this, 140, 0, textureX, textureY); // Bottom
		rightArmModel[2] = new ModelRendererTurbo(this, 50, 250, textureX, textureY); // Right Sleeve
		rightArmModel[3] = new ModelRendererTurbo(this, 100, 250, textureX, textureY); // Lower Right sleeve

		rightArmModel[0].addBox(-1.5F, 1F, -1F, 2, 6, 3, 0F); // Top
		rightArmModel[0].setRotationPoint(0F, 0F, 3F);
		rightArmModel[0].rotateAngleX = 0.10471976F;
		rightArmModel[0].rotateAngleY = 1.57079633F;
		rightArmModel[0].rotateAngleZ = -0.34906585F;

		rightArmModel[1].addBox(-1.7F, 6.5F, -0.3F, 2, 6, 3, 0F); // Bottom
		rightArmModel[1].setRotationPoint(0F, 0F, 3F);
		rightArmModel[1].rotateAngleY = 1.57079633F;
		rightArmModel[1].rotateAngleZ = -0.31415927F;

		rightArmModel[2].addBox(-1.75F, 0.9F, -1.5F, 3, 7, 4, 0F); // Right Sleeve
		rightArmModel[2].setRotationPoint(0F, 0F, 3F);
		rightArmModel[2].rotateAngleX = 0.10471976F;
		rightArmModel[2].rotateAngleY = 1.57079633F;
		rightArmModel[2].rotateAngleZ = -0.34906585F;

		rightArmModel[3].addBox(-2.2F, 6.5F, -0.8F, 3, 5, 4, 0F); // Lower Right sleeve
		rightArmModel[3].setRotationPoint(0F, 0F, 3F);
		rightArmModel[3].rotateAngleY = 1.57079633F;
		rightArmModel[3].rotateAngleZ = -0.31415927F;

		leftLegModel = new ModelRendererTurbo[5];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Thigh
		leftLegModel[1] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Femur
		leftLegModel[2] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Import OuterRightBottomDress
		leftLegModel[3] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import OuterRightBottomDress
		leftLegModel[4] = new ModelRendererTurbo(this, 300, 300, textureX, textureY); // Import OuterRightBottomDress

		leftLegModel[0].addBox(1F, 1.5F, -2.3F, 3, 6, 4, 0F); // Import Thigh
		leftLegModel[0].setRotationPoint(0F, -16F, 0F);
		leftLegModel[0].rotateAngleX = -0.06981317F;
		leftLegModel[0].rotateAngleY = 1.74532925F;
		leftLegModel[0].rotateAngleZ = -0.03490659F;

		leftLegModel[1].addBox(0.4F, 7F, -2.6F, 3, 9, 3, 0F); // Import Femur
		leftLegModel[1].setRotationPoint(0F, -16F, 0F);
		leftLegModel[1].rotateAngleX = 0.05235988F;
		leftLegModel[1].rotateAngleY = 1.57079633F;

		leftLegModel[2].addBox(-2F, 0.5F, -3F, 7, 6, 6, 0F); // Import OuterRightBottomDress
		leftLegModel[2].setRotationPoint(0F, -16F, 0F);
		leftLegModel[2].rotateAngleX = -0.03490659F;
		leftLegModel[2].rotateAngleY = 1.65806279F;
		leftLegModel[2].rotateAngleZ = 0.03490659F;

		leftLegModel[3].addShapeBox(-0.4F, 5.8F, -4.5F, 6, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import OuterRightBottomDress
		leftLegModel[3].setRotationPoint(0F, -16F, 0F);
		leftLegModel[3].rotateAngleX = 0.13962634F;
		leftLegModel[3].rotateAngleY = 1.65806279F;

		leftLegModel[4].addShapeBox(-0.9F, 7F, -5F, 7, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import OuterRightBottomDress
		leftLegModel[4].setRotationPoint(0F, -16F, 0F);
		leftLegModel[4].rotateAngleX = 0.13962634F;
		leftLegModel[4].rotateAngleY = 1.65806279F;


		rightLegModel = new ModelRendererTurbo[5];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Thigh
		rightLegModel[1] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Femur
		rightLegModel[2] = new ModelRendererTurbo(this, 50, 300, textureX, textureY); // Import OuterRightBottomDress
		rightLegModel[3] = new ModelRendererTurbo(this, 150, 300, textureX, textureY); // Import OuterRightBottomDress
		rightLegModel[4] = new ModelRendererTurbo(this, 250, 300, textureX, textureY); // Import OuterRightBottomDress

		rightLegModel[0].addBox(-3.4F, 1.5F, -2.3F, 3, 6, 4, 0F); // Import Thigh
		rightLegModel[0].setRotationPoint(0F, -16F, 0F);
		rightLegModel[0].rotateAngleX = -0.06981317F;
		rightLegModel[0].rotateAngleY = 1.3962634F;

		rightLegModel[1].addBox(-3.4F, 7F, -2.6F, 3, 9, 3, 0F); // Import Femur
		rightLegModel[1].setRotationPoint(0F, -16F, 0F);
		rightLegModel[1].rotateAngleX = 0.05235988F;
		rightLegModel[1].rotateAngleY = 1.57079633F;

		rightLegModel[2].addBox(-5F, 0.5F, -3F, 7, 6, 6, 0F); // Import OuterRightBottomDress
		rightLegModel[2].setRotationPoint(0F, -16F, 0F);
		rightLegModel[2].rotateAngleX = -0.03490659F;
		rightLegModel[2].rotateAngleY = 1.48352986F;
		rightLegModel[2].rotateAngleZ = -0.03490659F;

		rightLegModel[3].addShapeBox(-5.4F, 5.8F, -4.5F, 6, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import OuterRightBottomDress
		rightLegModel[3].setRotationPoint(0F, -16F, 0F);
		rightLegModel[3].rotateAngleX = 0.13962634F;
		rightLegModel[3].rotateAngleY = 1.48352986F;

		rightLegModel[4].addShapeBox(-5.9F, 7F, -5F, 7, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import OuterRightBottomDress
		rightLegModel[4].setRotationPoint(0F, -16F, 0F);
		rightLegModel[4].rotateAngleX = 0.13962634F;
		rightLegModel[4].rotateAngleY = 1.48352986F;

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}