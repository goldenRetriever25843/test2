package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;


public class ModelKV2 extends ModelVehicle
{
    public ModelKV2()
    {
    	int textureX = 1024;
    	int textureY = 1024;
	
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CR.MainBody
		bodyModel[1] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // CR.TopBeak
		bodyModel[2] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // CR.BottomBeak
		bodyModel[3] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // CR.FrontSlope
		bodyModel[4] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // CR.Backthingy
		bodyModel[5] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // CR.Backslope
		bodyModel[6] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // CR.LeftTrackCover
		bodyModel[7] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // CR.rightTrackCover
		bodyModel[8] = new ModelRendererTurbo(this,  350,  0, textureX, textureY); // CR.FrontRightWheel
		bodyModel[9] = new ModelRendererTurbo(this,  350,  50, textureX, textureY); // CR.BackRightWheel
		bodyModel[10] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // CR.RightTopWheel1
		bodyModel[11] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // CR.RightTopWheel2
		bodyModel[12] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // CR.RightTopWheel3
		bodyModel[13] = new ModelRendererTurbo(this,  350,  0, textureX, textureY); // CR.FrontLeftWheel
		bodyModel[14] = new ModelRendererTurbo(this,  350,  50, textureX, textureY); // CR.BackLeftWheel
		bodyModel[15] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // CR.LeftTopWheel1
		bodyModel[16] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // CR.LeftTopWheel2
		bodyModel[17] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // CR.LeftTopWheel3
		bodyModel[18] = new ModelRendererTurbo(this,  350,  600, textureX, textureY); // CR.RightTrackDetail1
		bodyModel[19] = new ModelRendererTurbo(this,  350,  600, textureX, textureY); // CR.RightTrackDetail2
		bodyModel[20] = new ModelRendererTurbo(this,  350,  650, textureX, textureY); // CR.RightTrackDetail3
		bodyModel[21] = new ModelRendererTurbo(this,  350,  600, textureX, textureY); // CR.RightTrackDetail2
		bodyModel[22] = new ModelRendererTurbo(this,  350,  700, textureX, textureY); // CR.LeftTrackDetail1
		bodyModel[23] = new ModelRendererTurbo(this,  350,  700, textureX, textureY); // CR.LeftTrackDetail2
		bodyModel[24] = new ModelRendererTurbo(this,  350,  750, textureX, textureY); // CR.LeftTrackDetail3
		bodyModel[25] = new ModelRendererTurbo(this,  350,  700, textureX, textureY); // CR.LeftTrackDetail4

		bodyModel[0].addBox(0F, 0F, 0F, 79, 18, 32, 0F); // CR.MainBody
		bodyModel[0].setRotationPoint(-54F, -14F, -16F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 8, 32, 0); // CR.TopBeak
		bodyModel[1].setRotationPoint(25F, -9F, -16F);
		bodyModel[1].rotateAngleZ = 6;

		bodyModel[2].addBox(0F, 0F, 0F, 14, 6, 32, 0F); // CR.BottomBeak
		bodyModel[2].setRotationPoint(24F, -2F, -16F);
		bodyModel[2].rotateAngleZ = -0;

		bodyModel[3].addBox(0F, 0F, 0F, 2, 6, 32, 0F); // CR.FrontSlope
		bodyModel[3].setRotationPoint(23.2F, -13F, -16F);
		bodyModel[3].rotateAngleZ = 13;

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 31, 0F); // CR.Backthingy
		bodyModel[4].setRotationPoint(-59.8F, -12.8F, -15.5F);
		bodyModel[4].rotateAngleZ = 19;

		bodyModel[5].addBox(0F, 0F, 0F, 10, 12, 32, 0); // CR.Backslope
		bodyModel[5].setRotationPoint(-57F, -8F, -16F);
		bodyModel[5].rotateAngleZ = -0;

		bodyModel[6].addBox(0F, 0F, 0F, 100, 2, 12, 0F); // CR.LeftTrackCover
		bodyModel[6].setRotationPoint(-59F, -9.5F, -28F);

		bodyModel[7].addBox(0F, 0F, 0F, 100, 2, 12, 0F); // CR.rightTrackCover
		bodyModel[7].setRotationPoint(-59F, -9.5F, 16F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 8, 11, 0F); // CR.FrontRightWheel
		bodyModel[8].setRotationPoint(32F, -5.5F, 16F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 9, 11, 0F); // CR.BackRightWheel
		bodyModel[9].setRotationPoint(-56F, -5.5F, 16F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // CR.RightTopWheel1
		bodyModel[10].setRotationPoint(14F, -5.5F, 16F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // CR.RightTopWheel2
		bodyModel[11].setRotationPoint(-12F, -5.5F, 16F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // CR.RightTopWheel3
		bodyModel[12].setRotationPoint(-38F, -5.5F, 16F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 8, 11, 0F); // CR.FrontLeftWheel
		bodyModel[13].setRotationPoint(32F, -5.5F, -27F);

		bodyModel[14].addBox(0F, 0F, 0F, 9, 9, 11, 0F); // CR.BackLeftWheel
		bodyModel[14].setRotationPoint(-56F, -5.5F, -27F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // CR.LeftTopWheel1
		bodyModel[15].setRotationPoint(14F, -5.5F, -25F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // CR.LeftTopWheel2
		bodyModel[16].setRotationPoint(-12F, -5.5F, -25F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // CR.LeftTopWheel3
		bodyModel[17].setRotationPoint(-38F, -5.5F, -25F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // CR.RightTrackDetail1
		bodyModel[18].setRotationPoint(22F, -13F, 16F);
		bodyModel[18].rotateAngleX = 6;

		bodyModel[19].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // CR.RightTrackDetail2
		bodyModel[19].setRotationPoint(4F, -13F, 16F);
		bodyModel[19].rotateAngleX = 6;

		bodyModel[20].addBox(0F, 0F, 0F, 25, 4, 12, 0F); // CR.RightTrackDetail3
		bodyModel[20].setRotationPoint(-36F, -13.5F, 16F);
		bodyModel[20].rotateAngleX = 0;

		bodyModel[21].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // CR.RightTrackDetail2
		bodyModel[21].setRotationPoint(-50F, -13F, 16F);
		bodyModel[21].rotateAngleX = 6;

		bodyModel[22].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // CR.LeftTrackDetail1
		bodyModel[22].setRotationPoint(21F, -9.5F, -27F);
		bodyModel[22].rotateAngleX = -6;

		bodyModel[23].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // CR.LeftTrackDetail2
		bodyModel[23].setRotationPoint(4F, -9.5F, -27F);
		bodyModel[23].rotateAngleX = -6;

		bodyModel[24].addBox(0F, 0F, 0F, 25, 4, 12, 0F); // CR.LeftTrackDetail3
		bodyModel[24].setRotationPoint(-36F, -12.5F, -27F);
		bodyModel[24].rotateAngleX = 0;

		bodyModel[25].addBox(0F, 0F, 0F, 0, 4, 12, 0F); // CR.LeftTrackDetail4
		bodyModel[25].setRotationPoint(-50F, -9.5F, -27F);
		bodyModel[25].rotateAngleX = -6;
		
		turretModel = new ModelRendererTurbo[10];
		turretModel[0] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // TR.TurretSpinny
		turretModel[1] = new ModelRendererTurbo(this,  0,  550, textureX, textureY); // TR.MainPart
		turretModel[2] = new ModelRendererTurbo(this,  0,  625, textureX, textureY); // TR.FrontAngle
		turretModel[3] = new ModelRendererTurbo(this,  0,  675, textureX, textureY); // TR.Center
		turretModel[4] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // TR.CornerRight
		turretModel[5] = new ModelRendererTurbo(this,  0,  720, textureX, textureY); // TR.CornerLeft
		turretModel[6] = new ModelRendererTurbo(this,  0,  775, textureX, textureY); // TR.BackRight
		turretModel[7] = new ModelRendererTurbo(this,  0,  775, textureX, textureY); // TR.BackLeft
		turretModel[8] = new ModelRendererTurbo(this,  0,  825, textureX, textureY); // TR.Gun"Circle"
		turretModel[9] = new ModelRendererTurbo(this,  0,  870, textureX, textureY); // TR.Cupula

		turretModel[0].addBox(0F, 0F, 0F, 30, 4, 30, 0F); // TR.TurretSpinny
		turretModel[0].setRotationPoint(-15F, -18F, -15F);

		turretModel[1].addBox(-30F, 0F, -15F, 30, 18, 30, 0F); // TR.MainPart
		turretModel[1].setRotationPoint(0F, -36F, 0F);

		turretModel[2].addBox(-3.5F, 0F, -7F, 14, 18, 14, 0F); // TR.FrontAngle
		turretModel[2].setRotationPoint(0F, -32F, 0F);
		turretModel[2].rotateAngleZ = 19;

		turretModel[3].addBox(0F, 0F, 0F, 9, 18, 14, 0F); // TR.Center
		turretModel[3].setRotationPoint(0F, -36F, -7F);

		turretModel[4].addBox(5F, 0F, -4F, 7, 18, 13, 0F); // TR.CornerRight
		turretModel[4].setRotationPoint(0F, -36F, 0F);
		turretModel[4].rotateAngleY = 1;

		turretModel[5].addBox(5F, 0F, -8.8F, 7, 18, 13, 0F); // TR.CornerLeft
		turretModel[5].setRotationPoint(0F, -36F, 0F);
		turretModel[5].rotateAngleY = -1;

		turretModel[6].addBox(-33.5F, 0F, -12F, 8, 18, 16, 0F); // TR.BackRight
		turretModel[6].setRotationPoint(0F, -36F, 0F);
		turretModel[6].rotateAngleY = -38;

		turretModel[7].addBox(-33.5F, 0F, -4F, 8, 18, 16, 0F); // TR.BackLeft
		turretModel[7].setRotationPoint(0F, -36F, 0F);
		turretModel[7].rotateAngleY = 38;

		turretModel[8].addBox(6F, 2F, -5F, 10, 14, 10, 0F); // TR.Gun"Circle"
		turretModel[8].setRotationPoint(2F, -37.5F, 0F);

		turretModel[9].addBox(-18F, 0F, 4F, 10, 2, 10, 0F); // TR.Cupula
		turretModel[9].setRotationPoint(0F, -37.5F, 0F);
		
		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this,  0,  900, textureX, textureY); // BL.Base
		barrelModel[1] = new ModelRendererTurbo(this,  0,  950, textureX, textureY); // BL.Howitzer

		barrelModel[0].addBox(12F, -4F, -3.5F, 14, 9, 7, 0F); // BL.Base
		barrelModel[0].setRotationPoint(0F, -28F, 0F);

		barrelModel[1].addBox(26F, -3F, -2F, 18, 4, 4, 0F); // BL.Howitzer
		barrelModel[1].setRotationPoint(0F, -28F, 0F);
		
		
		
		
		
		leftTrackModel = new ModelRendererTurbo[12];
		leftTrackModel[0] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // LT.Wheel1
		leftTrackModel[1] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // LT.Wheel2
		leftTrackModel[2] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // LT.Wheel3
		leftTrackModel[3] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // LT.Wheel4
		leftTrackModel[4] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // LT.Wheel5
		leftTrackModel[5] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // LT.Wheel6
		leftTrackModel[6] = new ModelRendererTurbo(this,  350,  275, textureX, textureY); // LT.BottomThread
		leftTrackModel[7] = new ModelRendererTurbo(this,  350,  300, textureX, textureY); // LT.FrontCornerThread
		leftTrackModel[8] = new ModelRendererTurbo(this,  350,  320, textureX, textureY); // LT.FrontThread
		leftTrackModel[9] = new ModelRendererTurbo(this,  350,  350, textureX, textureY); // LT.TopThread
		leftTrackModel[10] = new ModelRendererTurbo(this,  350,  370, textureX, textureY); // LT.BackThread
		leftTrackModel[11] = new ModelRendererTurbo(this,  350,  400, textureX, textureY); // LT.BackCornerThread

		leftTrackModel[0].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // LT.Wheel1
		leftTrackModel[0].setRotationPoint(20F, 2F, -26F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // LT.Wheel2
		leftTrackModel[1].setRotationPoint(7.5F, 2F, -26F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // LT.Wheel3
		leftTrackModel[2].setRotationPoint(-5F, 2F, -26F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // LT.Wheel4
		leftTrackModel[3].setRotationPoint(-17.5F, 2F, -26F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // LT.Wheel5
		leftTrackModel[4].setRotationPoint(-30F, 2F, -26F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // LT.Wheel6
		leftTrackModel[5].setRotationPoint(-42.5F, 2F, -26F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 71, 1, 12, 0F); // LT.BottomThread
		leftTrackModel[6].setRotationPoint(-43F, 9F, -28F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // LT.FrontCornerThread
		leftTrackModel[7].setRotationPoint(27.5F, 9F, -28F);
		leftTrackModel[7].rotateAngleZ = -12;

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // LT.FrontThread
		leftTrackModel[8].setRotationPoint(40F, -6F, -28F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 97, 1, 12, 0F); // LT.TopThread
		leftTrackModel[9].setRotationPoint(-56.5F, -6.6F, -28F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // LT.BackThread
		leftTrackModel[10].setRotationPoint(-57F, -6F, -28F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // LT.BackCornerThread
		leftTrackModel[11].setRotationPoint(-57F, 3F, -28F);
		leftTrackModel[11].rotateAngleZ = 20;	
		
		
		
		
		
		rightTrackModel = new ModelRendererTurbo[12];
		rightTrackModel[0] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // RT.Wheel1
		rightTrackModel[1] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // RT.Wheel2
		rightTrackModel[2] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // RT.Wheel3
		rightTrackModel[3] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // RT.Wheel4
		rightTrackModel[4] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // RT.Wheel5
		rightTrackModel[5] = new ModelRendererTurbo(this,  350,  200, textureX, textureY); // RT.Wheel6
		rightTrackModel[6] = new ModelRendererTurbo(this,  350,  275, textureX, textureY); // RT.BottomThread
		rightTrackModel[7] = new ModelRendererTurbo(this,  350,  300, textureX, textureY); // RT.FrontCornerThread
		rightTrackModel[8] = new ModelRendererTurbo(this,  350,  320, textureX, textureY); // RT.FrontThread
		rightTrackModel[9] = new ModelRendererTurbo(this,  350,  350, textureX, textureY); // RT.TopThread
		rightTrackModel[10] = new ModelRendererTurbo(this,  350,  370, textureX, textureY); // RT.BackThread
		rightTrackModel[11] = new ModelRendererTurbo(this,  350,  400, textureX, textureY); // RT.BackCornerThread

		rightTrackModel[0].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // RT.Wheel1
		rightTrackModel[0].setRotationPoint(20F, 2F, 16F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // RT.Wheel2
		rightTrackModel[1].setRotationPoint(7.5F, 2F, 16F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // RT.Wheel3
		rightTrackModel[2].setRotationPoint(-5F, 2F, 16F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // RT.Wheel4
		rightTrackModel[3].setRotationPoint(-17.5F, 2F, 16F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // RT.Wheel5
		rightTrackModel[4].setRotationPoint(-30F, 2F, 16F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // RT.Wheel6
		rightTrackModel[5].setRotationPoint(-42.5F, 2F, 16F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 71, 1, 12, 0F); // RT.BottomThread
		rightTrackModel[6].setRotationPoint(-43F, 9F, 16F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 15, 1, 12, 0F); // RT.FrontCornerThread
		rightTrackModel[7].setRotationPoint(27.5F, 9F, 16F);
		rightTrackModel[7].rotateAngleZ = -12;

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 8, 12, 0F); // RT.FrontThread
		rightTrackModel[8].setRotationPoint(40F, -6F, 16F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 97, 1, 12, 0F); // RT.TopThread
		rightTrackModel[9].setRotationPoint(-56.5F, -6.6F, 16F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 9, 12, 0F); // RT.BackThread
		rightTrackModel[10].setRotationPoint(-57F, -6F, 16F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // RT.BackCornerThread
		rightTrackModel[11].setRotationPoint(-57F, 3F, 16F);
		rightTrackModel[11].rotateAngleZ = 20;	
				
				
		
		flipAll(); //For old models
		translateAll(0, 2, 0);
    }
}
