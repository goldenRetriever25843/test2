//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShinden extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;

	public ModelShinden()
	{

// Nose
		noseModel = new ModelRendererTurbo[6];
		noseModel[0] = new ModelRendererTurbo(this,  35,  461, textureX, textureY); // NS.Nose
		noseModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // NS.Core/NoseTransitionTop
		noseModel[2] = new ModelRendererTurbo(this,  280,  440, textureX, textureY); // NS.Core/NoseTransitionBottom
		noseModel[3] = new ModelRendererTurbo(this,  280,  470, textureX, textureY); // NS.CoreFront
		noseModel[4] = new ModelRendererTurbo(this,  80,  370, textureX, textureY); // NS.LeftCanard
		noseModel[5] = new ModelRendererTurbo(this,  80,  370, textureX, textureY); // NS.RightCanard

		noseModel[0].addBox(0F, 0F, 0F, 15, 8, 9, 0F); // NS.Nose
		noseModel[0].setRotationPoint(-65F, -20.5F, -4.5F);
		noseModel[0].rotateAngleZ = 0.1396263F;

		noseModel[1].addBox(0F, 0F, 0F, 20, 10, 11, 0F); // NS.Core/NoseTransitionTop
		noseModel[1].setRotationPoint(-51F, -22.5F, -5.5F);
		noseModel[1].rotateAngleZ = 0.05235988F;

		noseModel[2].addBox(0F, -6F, 0F, 32, 7, 8, 0F); // NS.Core/NoseTransitionBottom
		noseModel[2].setRotationPoint(-63.5F, -13.5F, -4F);
		noseModel[2].rotateAngleZ = -0.1745329F;

		noseModel[3].addBox(0F, 0F, 0F, 16, 17, 14, 0F); // NS.CoreFront
		noseModel[3].setRotationPoint(-32F, -23.5F, -7F);

		noseModel[4].addBox(0F, 0F, 0F, 6, 1, 16, 0F); // NS.LeftCanard
		noseModel[4].setRotationPoint(-46F, -17F, 5F);
		noseModel[4].rotateAngleY = -0.1047198F;

		noseModel[5].addBox(0F, 0F, -16F, 6, 1, 16, 0F); // NS.RightCanard
		noseModel[5].setRotationPoint(-46F, -17F, -5F);
		noseModel[5].rotateAngleY = 0.1047198F;
		
		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(0F, -19F, -1.5F, 1, 38, 3, 0.0F);		//Propeller Blades
        propellerModels[0][1].addBox(0F, -19F, -1.5F, 1, 38, 3, 0.0F);		//They will all be the same
        propellerModels[0][2].addBox(0F, -19F, -1.5F, 1, 38, 3, 0.0F);		
        propellerModels[0][0].setRotationPoint(55, -18, 0);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(55, -18, 0);	
        propellerModels[0][2].setRotationPoint(55, -18, 0);	



// Body
		bodyModel = new ModelRendererTurbo[24];
		bodyModel[0] = new ModelRendererTurbo(this,  300,  400, textureX, textureY); // CR.Floor
		bodyModel[1] = new ModelRendererTurbo(this,  450,  415, textureX, textureY); // CR.ControlPanel
		bodyModel[2] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.FrontLeftSideTube
		bodyModel[3] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.FrontRightSideTube
		bodyModel[4] = new ModelRendererTurbo(this,  420,  460, textureX, textureY); // CR.FrontTopTube
		bodyModel[5] = new ModelRendererTurbo(this,  430,  490, textureX, textureY); // CR.FrontLeftTube
		bodyModel[6] = new ModelRendererTurbo(this,  430,  490, textureX, textureY); // CR.FrontRightTube
		bodyModel[7] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.BackRightSideTube
		bodyModel[8] = new ModelRendererTurbo(this,  440,  490, textureX, textureY); // CR.BackLeftSideTube
		bodyModel[9] = new ModelRendererTurbo(this,  420,  480, textureX, textureY); // CR.RightTopSideTube
		bodyModel[10] = new ModelRendererTurbo(this,  420,  480, textureX, textureY); // CR.LeftSideTube
		bodyModel[11] = new ModelRendererTurbo(this,  420,  460, textureX, textureY); // CR.BackTopTube
		bodyModel[12] = new ModelRendererTurbo(this,  450,  370, textureX, textureY); // CR.CoreBack
		bodyModel[13] = new ModelRendererTurbo(this,  430,  340, textureX, textureY); // CR.CoreFloor
		bodyModel[14] = new ModelRendererTurbo(this,  462,  310, textureX, textureY); // CR.CoreWallLeft
		bodyModel[15] = new ModelRendererTurbo(this,  460,  290, textureX, textureY); // CR.CoreWallLeftCover-Up
		bodyModel[16] = new ModelRendererTurbo(this,  390,  500, textureX, textureY); // CR.UnderJoystick
		bodyModel[17] = new ModelRendererTurbo(this,  410,  370, textureX, textureY); // CR.ChairBottom
		bodyModel[18] = new ModelRendererTurbo(this,  420,  390, textureX, textureY); // CR.ChairTop
		bodyModel[19] = new ModelRendererTurbo(this,  460,  310, textureX, textureY); // CR.CoreWallRight
		bodyModel[20] = new ModelRendererTurbo(this,  460,  290, textureX, textureY); // CR.CoreWallRightCover-Up
		bodyModel[21] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // CR.TailConnector
		bodyModel[22] = new ModelRendererTurbo(this,  80,  400, textureX, textureY); // CR.IntakeLeft
		bodyModel[23] = new ModelRendererTurbo(this,  80,  400, textureX, textureY); // CR.IntakeRight

		bodyModel[0].addBox(0F, 0F, 0F, 22, 3, 14, 0F); // CR.Floor
		bodyModel[0].setRotationPoint(-6F, -9.4F, -7F);
		bodyModel[0].rotateAngleZ = 0.03490658F;

		bodyModel[1].addBox(0F, 0F, 0F, 12, 8, 12, 0F); // CR.ControlPanel
		bodyModel[1].setRotationPoint(-27F, -22F, -6F);
		bodyModel[1].rotateAngleZ = 0.1745329F;

		bodyModel[2].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.FrontLeftSideTube
		bodyModel[2].setRotationPoint(-8F, -29F, 3.8F);
		bodyModel[2].rotateAngleX = 0.2443461F;

		bodyModel[3].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.FrontRightSideTube
		bodyModel[3].setRotationPoint(-8F, -29F, -3.8F);
		bodyModel[3].rotateAngleX = -0.2443461F;

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // CR.FrontTopTube
		bodyModel[4].setRotationPoint(-8F, -29.3F, -4F);
		bodyModel[4].rotateAngleZ = -1.396263F;

		bodyModel[5].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // CR.FrontLeftTube
		bodyModel[5].setRotationPoint(-8F, -28.7F, 3F);
		bodyModel[5].rotateAngleZ = -0.9773844F;

		bodyModel[6].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // CR.FrontRightTube
		bodyModel[6].setRotationPoint(-8F, -28.7F, -3F);
		bodyModel[6].rotateAngleZ = -0.9773844F;

		bodyModel[7].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.BackRightSideTube
		bodyModel[7].setRotationPoint(-9F, -28.7F, -3.8F);
		bodyModel[7].rotateAngleX = -0.2443461F;

		bodyModel[8].addBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F); // CR.BackLeftSideTube
		bodyModel[8].setRotationPoint(-9F, -29F, 3.8F);
		bodyModel[8].rotateAngleX = 0.2443461F;

		bodyModel[9].addBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F); // CR.RightTopSideTube
		bodyModel[9].setRotationPoint(-8F, -28.4F, -3.8F);
		bodyModel[9].rotateAngleX = -0.6632251F;

		bodyModel[10].addBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F); // CR.LeftSideTube
		bodyModel[10].setRotationPoint(-8F, -28.4F, 3.9F);
		bodyModel[10].rotateAngleX = 0.6632251F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // CR.BackTopTube
		bodyModel[11].setRotationPoint(0.5F, -28.2F, -4F);
		bodyModel[11].rotateAngleZ = 1.396263F;

		bodyModel[12].addBox(0F, 0F, 0F, 10, 17, 16, 0F); // CR.CoreBack
		bodyModel[12].setRotationPoint(8F, -23.5F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 18, 1, 14, 0F); // CR.CoreFloor
		bodyModel[13].setRotationPoint(-24F, -7.5F, -7F);

		bodyModel[14].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // CR.CoreWallLeft
		bodyModel[14].setRotationPoint(-16F, -23.5F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // CR.CoreWallLeftCover-Up
		bodyModel[15].setRotationPoint(-16F, -23.5F, 6F);

		bodyModel[16].addBox(0F, 0F, -0.5F, 13, 1, 1, 0F); // CR.UnderJoystick
		bodyModel[16].setRotationPoint(-18.5F, -9F, 0F);

		bodyModel[17].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // CR.ChairBottom
		bodyModel[17].setRotationPoint(-8F, -12F, -3.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 10, 10, 0F); // CR.ChairTop
		bodyModel[18].setRotationPoint(-0.5F, -25F, -5F);
		bodyModel[18].rotateAngleZ = -0.06981317F;

		bodyModel[19].addBox(0F, 0F, 0F, 24, 17, 1, 0F); // CR.CoreWallRight
		bodyModel[19].setRotationPoint(-16F, -23.5F, -8F);

		bodyModel[20].addBox(0F, 0F, -8F, 24, 17, 1, 0F); // CR.CoreWallRightCover-Up
		bodyModel[20].setRotationPoint(-16F, -23.5F, 1F);

		bodyModel[21].addBox(0F, 0F, 0F, 11, 7, 14, 0F); // CR.TailConnector
		bodyModel[21].setRotationPoint(17F, -14F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 22, 14, 4, 0F); // CR.IntakeLeft
		bodyModel[22].setRotationPoint(0F, -22F, 8F);
		bodyModel[22].rotateAngleY = -0.2094395F;

		bodyModel[23].addBox(0F, 0F, 0F, 22, 14, 4, 0F); // CR.IntakeRight
		bodyModel[23].setRotationPoint(0.8F, -22F, -12F);
		bodyModel[23].rotateAngleY = 0.2094395F;



// Tail
		tailModel = new ModelRendererTurbo[5];
		tailModel[0] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // TL.NoseCone
		tailModel[1] = new ModelRendererTurbo(this,  300,  150, textureX, textureY); // TL.BayRight
		tailModel[2] = new ModelRendererTurbo(this,  300,  180, textureX, textureY); // TL.BayLeft
		tailModel[3] = new ModelRendererTurbo(this,  340,  210, textureX, textureY); // TL.BayBottom
		tailModel[4] = new ModelRendererTurbo(this,  340,  236, textureX, textureY); // TL.BayTop

		tailModel[0].addBox(-2F, -3.5F, -3.5F, 7, 7, 7, 0F); // TL.NoseCone
		tailModel[0].setRotationPoint(55F, -18F, 0F);

		tailModel[1].addBox(0F, 0F, -4F, 36, 10, 8, 0F); // TL.BayRight
		tailModel[1].setRotationPoint(17.5F, -23F, -4F);
		tailModel[1].rotateAngleY = 0.06981317F;

		tailModel[2].addBox(0F, 0F, -4F, 36, 10, 8, 0F); // TL.BayLeft
		tailModel[2].setRotationPoint(17.5F, -23F, 4F);
		tailModel[2].rotateAngleY = -0.06981317F;

		tailModel[3].addBox(0F, 0F, 0F, 27, 6, 10, 0F); // TL.BayBottom
		tailModel[3].setRotationPoint(26F, -12.4F, -5F);
		tailModel[3].rotateAngleZ = 0.2443461F;

		tailModel[4].addBox(0F, 0F, 0F, 50, 8, 10, 0F); // TL.BayTop
		tailModel[4].setRotationPoint(1.5F, -28.4F, -5F);
		tailModel[4].rotateAngleZ = -0.1117011F;



// Left Wing
		leftWingModel = new ModelRendererTurbo[5];
		leftWingModel[0] = new ModelRendererTurbo(this,  20,  40, textureX, textureY); // LW.LeftWingForwards
		leftWingModel[1] = new ModelRendererTurbo(this,  200,  40, textureX, textureY); // LW.LeftWingBack
		leftWingModel[2] = new ModelRendererTurbo(this,  200,  180, textureX, textureY); // LW.DorsalFinBack
		leftWingModel[3] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // LW.FrontTopDorsalFin
		leftWingModel[4] = new ModelRendererTurbo(this,  250,  180, textureX, textureY); // LW.BottomFrontDorsalFin

		leftWingModel[0].addBox(23F, -1F, 5F, 15, 3, 70, 0F); // LW.LeftWingForwards
		leftWingModel[0].setRotationPoint(-20F, -8F, 8F);
		leftWingModel[0].rotateAngleX = 0.06981317F;
		leftWingModel[0].rotateAngleY = -0.3490658F;

		leftWingModel[1].addBox(34F, -1F, -2F, 15, 3, 70, 0F); // LW.LeftWingBack
		leftWingModel[1].setRotationPoint(-20F, -8F, 8F);
		leftWingModel[1].rotateAngleX = 0.06981317F;
		leftWingModel[1].rotateAngleY = -0.1919862F;

		leftWingModel[2].addBox(0F, 0F, -0.5F, 5, 22, 1, 0F); // LW.DorsalFinBack
		leftWingModel[2].setRotationPoint(30F, -21F, 28F);

		leftWingModel[3].addBox(0F, 0F, -0.5F, 4, 11, 1, 0F); // LW.FrontTopDorsalFin
		leftWingModel[3].setRotationPoint(30F, -21F, 28F);
		leftWingModel[3].rotateAngleZ = -0.2094395F;

		leftWingModel[4].addBox(0F, -11F, -0.5F, 4, 11, 1, 0F); // LW.BottomFrontDorsalFin
		leftWingModel[4].setRotationPoint(30F, 1F, 28F);
		leftWingModel[4].rotateAngleZ = 0.2094395F;



// Right Wing
		rightWingModel = new ModelRendererTurbo[5];
		rightWingModel[0] = new ModelRendererTurbo(this,  20,  120, textureX, textureY); // RW.RightWingForwards
		rightWingModel[1] = new ModelRendererTurbo(this,  200,  40, textureX, textureY); // RW.RightWingBack
		rightWingModel[2] = new ModelRendererTurbo(this,  200,  180, textureX, textureY); // RW.DorsalFinBack
		rightWingModel[3] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // RW.FrontTopDorsalFin
		rightWingModel[4] = new ModelRendererTurbo(this,  250,  181, textureX, textureY); // RW.BottomFrontDorsalFin

		rightWingModel[0].addBox(23F, -1F, -75F, 15, 3, 70, 0F); // RW.RightWingForwards
		rightWingModel[0].setRotationPoint(-20F, -8F, -8F);
		rightWingModel[0].rotateAngleX = -0.06981317F;
		rightWingModel[0].rotateAngleY = 0.3490658F;

		rightWingModel[1].addBox(34F, -1F, -68F, 15, 3, 70, 0F); // RW.RightWingBack
		rightWingModel[1].setRotationPoint(-20F, -8F, -8F);
		rightWingModel[1].rotateAngleX = -0.06981317F;
		rightWingModel[1].rotateAngleY = 0.1919862F;

		rightWingModel[2].addBox(0F, 0F, -0.5F, 5, 22, 1, 0F); // RW.DorsalFinBack
		rightWingModel[2].setRotationPoint(30F, -21F, -28F);

		rightWingModel[3].addBox(0F, 0F, -0.5F, 4, 11, 1, 0F); // RW.FrontTopDorsalFin
		rightWingModel[3].setRotationPoint(30F, -21F, -28F);
		rightWingModel[3].rotateAngleZ = -0.2094395F;

		rightWingModel[4].addBox(0F, -11F, -0.5F, 4, 11, 1, 0F); // RW.BottomFrontDorsalFin
		rightWingModel[4].setRotationPoint(30F, 1F, -28F);
		rightWingModel[4].rotateAngleZ = 0.2094395F;



// Yaw Flap
		yawFlapModel = new ModelRendererTurbo[4];
		yawFlapModel[0] = new ModelRendererTurbo(this,  420,  420, textureX, textureY); // YF.JoyStick
		yawFlapModel[1] = new ModelRendererTurbo(this,  410,  420, textureX, textureY); // YF.JoyStickGrip
		yawFlapModel[2] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // YF.LeftYawFlap
		yawFlapModel[3] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // YF.RightYawFlap

		yawFlapModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F); // YF.JoyStick
		yawFlapModel[0].setRotationPoint(-10F, -19F, 0F);

		yawFlapModel[1].addBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F); // YF.JoyStickGrip
		yawFlapModel[1].setRotationPoint(-10F, -19F, 0F);

		yawFlapModel[2].addBox(0F, 0F, -0.5F, 4, 22, 1, 0F); // YF.LeftYawFlap
		yawFlapModel[2].setRotationPoint(35F, -21F, 28F);

		yawFlapModel[3].addBox(0F, 0F, -0.5F, 4, 22, 1, 0F); // YF.RightYawFlap
		yawFlapModel[3].setRotationPoint(35F, -21F, -28F);



// Pitch Flap Left
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // LF.LeftPedal
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this,  80,  340, textureX, textureY); // LF.NosePitchFlapLeft

		pitchFlapLeftModel[0].addBox(0F, 0F, -2F, 2, 1, 4, 0F); // LF.LeftPedal
		pitchFlapLeftModel[0].setRotationPoint(-16F, -11F, -4F);
		pitchFlapLeftModel[0].rotateAngleZ = 0.1745329F;

		pitchFlapLeftModel[1].addBox(0F, 0F, 1F, 2, 1, 14, 0F); // LF.NosePitchFlapLeft
		pitchFlapLeftModel[1].setRotationPoint(-40F, -17F, 5F);
		pitchFlapLeftModel[1].rotateAngleY = -0.08726646F;



// Pitch Flap Right
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this,  400,  460, textureX, textureY); // RF.RightPedal
		pitchFlapRightModel[1] = new ModelRendererTurbo(this,  80,  340, textureX, textureY); // RF.NosePitchFlapRight

		pitchFlapRightModel[0].addBox(0F, 0F, -2F, 2, 1, 4, 0F); // RF.RightPedal
		pitchFlapRightModel[0].setRotationPoint(-16F, -11F, 4F);
		pitchFlapRightModel[0].rotateAngleZ = 0.1745329F;

		pitchFlapRightModel[1].addBox(0F, 0F, -15F, 2, 1, 14, 0F); // RF.NosePitchFlapRight
		pitchFlapRightModel[1].setRotationPoint(-40F, -17F, -5F);
		pitchFlapRightModel[1].rotateAngleY = 0.08726646F;



// Body Wheel
		bodyWheelModel = new ModelRendererTurbo[3];
		bodyWheelModel[0] = new ModelRendererTurbo(this,  80,  200, textureX, textureY); // CLG.CenterStick
		bodyWheelModel[1] = new ModelRendererTurbo(this,  100,  210, textureX, textureY); // CLG.CenterWheel
		bodyWheelModel[2] = new ModelRendererTurbo(this,  80,  240, textureX, textureY); // CLG.Cover

		bodyWheelModel[0].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // CLG.CenterStick
		bodyWheelModel[0].setRotationPoint(-16F, -7F, -0.5F);
		bodyWheelModel[0].rotateAngleZ = -0.1396263F;

		bodyWheelModel[1].addBox(0F, 0F, 0F, 5, 5, 2, 0F); // CLG.CenterWheel
		bodyWheelModel[1].setRotationPoint(-20.5F, 9F, -1F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 28, 3, 1, 0F); // CLG.Cover
		bodyWheelModel[2].setRotationPoint(-41F, -9F, -2F);
		bodyWheelModel[2].rotateAngleZ = -0.08726646F;



// Left Wing Wheel
		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // LGLW.Stick
		leftWingWheelModel[1] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // LGLW.Wheel

		leftWingWheelModel[0].addBox(0F, 0F, -1F, 3, 15, 2, 0F); // LGLW.Stick
		leftWingWheelModel[0].setRotationPoint(20F, -9F, 28F);
		leftWingWheelModel[0].rotateAngleZ = -0.3141593F;

		leftWingWheelModel[1].addBox(-3F, 0F, -1.5F, 7, 7, 3, 0F); // LGLW.Wheel
		leftWingWheelModel[1].setRotationPoint(17F, 5F, 28F);
		leftWingWheelModel[1].rotateAngleZ = -0.03490658F;



// Right Wing Wheel
		rightWingWheelModel = new ModelRendererTurbo[2];
		rightWingWheelModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // LGRW.Stick
		rightWingWheelModel[1] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // LGRW.Wheel

		rightWingWheelModel[0].addBox(0F, 0F, -1F, 3, 15, 2, 0F); // LGRW.Stick
		rightWingWheelModel[0].setRotationPoint(20F, -9F, -28F);
		rightWingWheelModel[0].rotateAngleZ = -0.3141593F;

		rightWingWheelModel[1].addBox(-3F, 0F, -1.5F, 7, 7, 3, 0F); // LGRW.Wheel
		rightWingWheelModel[1].setRotationPoint(17F, 5F, -28F);
		rightWingWheelModel[1].rotateAngleZ = -0.03490658F;

// Propeller
		
		
		

		translateAll(0, 0, 0);


		flipAll();
	}

	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}