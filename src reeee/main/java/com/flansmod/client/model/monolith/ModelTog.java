package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTog extends ModelVehicle
{
    public ModelTog()
    {
		int textureX = 1024;
		int textureY = 1024;
	
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // MainBody
		bodyModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // MainBody.mirror
		bodyModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodyFMg
		bodyModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodyFMg
		bodyModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodyFMg
		bodyModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodyFMg
		bodyModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodySMg
		bodyModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodySMg
		bodyModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // BodyFSightCover
		bodyModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // MgMantle
		bodyModel[10] = new ModelRendererTurbo(this,  225,  600, textureX, textureY); // MachineGun
		bodyModel[11] = new ModelRendererTurbo(this,  160,  600, textureX, textureY); // BodyFAngle
		bodyModel[12] = new ModelRendererTurbo(this,  160,  600, textureX, textureY); // BodyFAngle
		bodyModel[13] = new ModelRendererTurbo(this,  160,  635, textureX, textureY); // BodyFT
		bodyModel[14] = new ModelRendererTurbo(this,  245,  600, textureX, textureY); // BodyFT
		bodyModel[15] = new ModelRendererTurbo(this,  0,  690, textureX, textureY); // BodyFAngle
		bodyModel[16] = new ModelRendererTurbo(this,  0,  745, textureX, textureY); // BodyBAngle
		bodyModel[17] = new ModelRendererTurbo(this,  100,  700, textureX, textureY); // BodyBack
		bodyModel[18] = new ModelRendererTurbo(this,  175,  750, textureX, textureY); // BodyBack
		bodyModel[19] = new ModelRendererTurbo(this,  0,  835, textureX, textureY); // BodyBack
		bodyModel[20] = new ModelRendererTurbo(this,  20,  375, textureX, textureY); // BodyTrackCover
		bodyModel[21] = new ModelRendererTurbo(this,  20,  375, textureX, textureY); // BodyTrackCover
		bodyModel[22] = new ModelRendererTurbo(this,  20,  360, textureX, textureY); // BodyTrackCoverAngle
		bodyModel[23] = new ModelRendererTurbo(this,  20,  360, textureX, textureY); // BodyTrackCoverAngle
		bodyModel[24] = new ModelRendererTurbo(this,  90,  375, textureX, textureY); // BodyTrackCoverAngle
		bodyModel[25] = new ModelRendererTurbo(this,  90,  375, textureX, textureY); // BodyTrackCoverAngle


		bodyModel[0].addBox(0F, 0F, 0F, 166, 32, 60, 0F); // MainBody
		bodyModel[0].setRotationPoint(-135F, -30F, -30F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 9, 8, 0F); // BodyFMg
		bodyModel[1].setRotationPoint(43F, -29F, -3.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 3, 26, 0F); // BodyFMg
		bodyModel[2].setRotationPoint(43F, -29F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 9, 5, 0F); // BodyFMg
		bodyModel[3].setRotationPoint(43F, -29F, -15F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // BodyFMg
		bodyModel[4].setRotationPoint(43F, -29F, 12F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 23, 0F); // BodyFMg
		bodyModel[5].setRotationPoint(43F, -23F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 13, 7, 1, 0F); // BodySMg
		bodyModel[6].setRotationPoint(30F, -29F, -15F);

		bodyModel[7].addBox(0F, 0F, 0F, 13, 7, 1, 0F); // BodySMg
		bodyModel[7].setRotationPoint(31F, -29F, 15F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // BodyFSightCover
		bodyModel[8].setRotationPoint(43F, -26F, 4.2F);
		bodyModel[8].rotateAngleZ = 0.2792527F;

		bodyModel[9].addBox(43F, -27F, -7F, 6, 4, 4, 0F); // MgMantle
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(49F, -26F, -5.5F, 6, 1, 1, 0F); // MachineGun
		bodyModel[10].setRotationPoint(0F, 0F, 0F);		
		
	

		bodyModel[11].addBox(0F, 0F, 0F, 15, 16, 15, 0F); // BodyFAngle
		bodyModel[11].setRotationPoint(35F, -30F, 15F);
		bodyModel[11].rotateAngleZ = -0.7853982F;

		bodyModel[12].addBox(0F, 0F, 0F, 15, 16, 15, 0F); // BodyFAngle
		bodyModel[12].setRotationPoint(35F, -30F, -30F);
		bodyModel[12].rotateAngleZ = -0.7853982F;

		bodyModel[13].addBox(0F, 0F, 0F, 9, 2, 31, 0F); // BodyFT
		bodyModel[13].setRotationPoint(35F, -30F, -15F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 60, 0F); // BodyFT
		bodyModel[14].setRotationPoint(31F, -30F, -30F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 17, 30, 0F); // BodyFAngle
		bodyModel[15].setRotationPoint(43F, -22F, -15F);
		bodyModel[15].rotateAngleZ = -0.7853982F;

		bodyModel[16].addBox(0F, 0F, 0F, 25, 19, 60, 0F); // BodyBAngle
		bodyModel[16].setRotationPoint(-152.5F, -12.5F, -30F);
		bodyModel[16].rotateAngleZ = 0.7853982F;

		bodyModel[17].addBox(0F, 0F, 0F, 37, 10, 30, 0F); // BodyBack
		bodyModel[17].setRotationPoint(-172F, -8F, -15F);
		bodyModel[17].rotateAngleZ = 0.2443461F;

		bodyModel[18].addBox(0F, 0F, 0F, 16, 12, 60, 0F); // BodyBack
		bodyModel[18].setRotationPoint(-148F, -10F, -30F);
		
		bodyModel[19].addBox(0F, 0F, 0F, 25, 10, 30, 0F); // BodyBack
		bodyModel[19].setRotationPoint(-172F, -8F, -15F);

		bodyModel[20].addBox(0F, 0F, 0F, 17, 2, 15, 0F); // BodyTrackCover
		bodyModel[20].setRotationPoint(43F, -20F, -30F);
		bodyModel[20].rotateAngleZ = -0.1745329F;

		bodyModel[21].addBox(0F, 0F, 0F, 17, 2, 15, 0F); // BodyTrackCover
		bodyModel[21].setRotationPoint(43F, -20F, 15F);
		bodyModel[21].rotateAngleZ = -0.1745329F;

		bodyModel[22].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // BodyTrackCoverAngle
		bodyModel[22].setRotationPoint(45F, -18F, -16F);
		bodyModel[22].rotateAngleX = 0.2617994F;
		bodyModel[22].rotateAngleZ = -0.1745329F;

		bodyModel[23].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // BodyTrackCoverAngle
		bodyModel[23].setRotationPoint(45F, -18F, 15F);
		bodyModel[23].rotateAngleX = -0.2617994F;
		bodyModel[23].rotateAngleZ = -0.1745329F;

		bodyModel[24].addBox(0F, 0F, 0F, 21, 2, 17, 0F); // BodyTrackCoverAngle
		bodyModel[24].setRotationPoint(-172F, -12F, 13F);
		bodyModel[24].rotateAngleZ = 0.08726646F;

		bodyModel[25].addBox(0F, 0F, 0F, 21, 2, 17, 0F); // BodyTrackCoverAngle
		bodyModel[25].setRotationPoint(-172F, -12F, -30F);
		bodyModel[25].rotateAngleZ = 0.08726646F;
		
		
		turretModel = new ModelRendererTurbo[15];
		turretModel[0] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // MainTurret
		turretModel[1] = new ModelRendererTurbo(this,  25,  400, textureX, textureY); // TurretL
		turretModel[2] = new ModelRendererTurbo(this,  100,  400, textureX, textureY); // TurretR
		
		
		turretModel[3] = new ModelRendererTurbo(this,  235,  425, textureX, textureY); // GunMantle
		turretModel[4] = new ModelRendererTurbo(this,  85,  300, textureX, textureY); // GunMantle.mirror
		turretModel[5] = new ModelRendererTurbo(this,  85,  300, textureX, textureY); // TurretRA
		turretModel[6] = new ModelRendererTurbo(this,  20,  300, textureX, textureY); // TurretLBA
		turretModel[7] = new ModelRendererTurbo(this,  20,  300, textureX, textureY); // TurretRBA
		turretModel[8] = new ModelRendererTurbo(this,  225,  265, textureX, textureY); // TurretRBA.mirror
		turretModel[9] = new ModelRendererTurbo(this,  225,  258, textureX, textureY); // Csight
		turretModel[10] = new ModelRendererTurbo(this,  225,  258, textureX, textureY); // Csight
		turretModel[11] = new ModelRendererTurbo(this,  225,  258, textureX, textureY); // Csight
		turretModel[12] = new ModelRendererTurbo(this,  210,  258, textureX, textureY); // Csight
		turretModel[13] = new ModelRendererTurbo(this,  210,  258, textureX, textureY); // Csight
		turretModel[14] = new ModelRendererTurbo(this,  210,  258, textureX, textureY); // Csight
		

		turretModel[0].addBox(-27F, -50F, -16F, 55, 20, 32, 0F); // MainTurret
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addBox(-8.5F, -50F, -22F, 25, 20, 6, 0F); // TurretL
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addBox(-8.5F, -50F, 16F, 25, 20, 6, 0F); // TurretR
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		

		turretModel[3].addBox(28F, -50F, -10F, 2, 20, 20, 0F); // GunMantle
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addBox(1F, -50F, -27.4F, 13, 20, 13, 0F); // TurretLA
		turretModel[4].setRotationPoint(0F, 0F, 0F);
		turretModel[4].rotateAngleY = 0.6108652F;

		turretModel[5].addBox(1F, -50F, 14.7F, 13, 20, 13, 0F); // TurretRA
		turretModel[5].setRotationPoint(0F, 0F, 0F);
		turretModel[5].rotateAngleY = -0.6108652F;

		turretModel[6].addBox(-16F, -50F, -23F, 20, 20, 5, 0F); // TurretLBA
		turretModel[6].setRotationPoint(0F, 0F, 0F);
		turretModel[6].rotateAngleY = -0.5235988F;

		turretModel[7].addBox(-16F, -50F, 18F, 20, 20, 5, 0F); // TurretRBA
		turretModel[7].setRotationPoint(0F, 0F, 0F);
		turretModel[7].rotateAngleY = 0.5235988F;

		turretModel[8].addBox(10F, -52F, -15F, 11, 2, 11, 0F); // CommandersHatch
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addBox(20F, -51F, 1F, 4, 1, 4, 0F); // Csight
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addBox(10F, -51F, 1F, 4, 1, 4, 0F); // Csight
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addBox(0F, -51F, -2F, 4, 1, 4, 0F); // Csight
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addBox(20F, -51.5F, 8F, 4, 2, 3, 0F); // Csight
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addBox(20F, -51.5F, 12F, 4, 2, 3, 0F); // Csight
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addBox(-15F, -51F, 8F, 3, 1, 3, 0F); // Csight
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		
		
				
		barrelModel = new ModelRendererTurbo[7];
		barrelModel[0] = new ModelRendererTurbo(this,  235,  415, textureX, textureY); // GunBarrel
		barrelModel[1] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // BarrelMuzzle
		barrelModel[2] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // BarrelMuzzle
		barrelModel[3] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // BarrelMuzzle
		barrelModel[4] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // BarrelMuzzle
		barrelModel[5] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // BarrelMuzzle
		barrelModel[6] = new ModelRendererTurbo(this,  200,  415, textureX, textureY); // BarrelMuzzle

		barrelModel[0].addBox(26F, -44F, -1.5F, 75, 3, 3, 0F); // GunBarrel
		barrelModel[0].setRotationPoint(0F, 0F, 0F);

		barrelModel[1].addBox(101F, -44.5F, -2F, 6, 1, 4, 0F); // BarrelMuzzle
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(101F, -41.5F, -2F, 6, 1, 4, 0F); // BarrelMuzzle
		barrelModel[2].setRotationPoint(0F, 0F, 0F);

		barrelModel[3].addBox(101F, -43.5F, -2F, 2, 2, 1, 0F); // BarrelMuzzle
		barrelModel[3].setRotationPoint(0F, 0F, 0F);

		barrelModel[4].addBox(101F, -43.5F, 1F, 2, 2, 1, 0F); // BarrelMuzzle
		barrelModel[4].setRotationPoint(0F, 0F, 0F);

		barrelModel[5].addBox(106F, -43.5F, -2F, 1, 2, 1, 0F); // BarrelMuzzle
		barrelModel[5].setRotationPoint(0F, 0F, 0F);

		barrelModel[6].addBox(105F, -43.5F, 1F, 2, 2, 1, 0F); // BarrelMuzzle
		barrelModel[6].setRotationPoint(0F, 0F, 0F);		
		
		
		
		
		
		leftTrackModel = new ModelRendererTurbo[10];
		leftTrackModel[0] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // LeftTrack
		leftTrackModel[1] = new ModelRendererTurbo(this,  330,  300, textureX, textureY); // LeftTrack
		leftTrackModel[2] = new ModelRendererTurbo(this,  375,  300, textureX, textureY); // LeftTrack
		leftTrackModel[3] = new ModelRendererTurbo(this,  200,  375, textureX, textureY); // LeftTrack
		leftTrackModel[4] = new ModelRendererTurbo(this,  230,  300, textureX, textureY); // LeftTrack
		leftTrackModel[5] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // LeftTrack
		leftTrackModel[6] = new ModelRendererTurbo(this,  145,  330, textureX, textureY); // LeftTrack

		leftTrackModel[0].addBox(0F, 0F, 0F, 1, 11, 12, 0F); // LeftTrack
		leftTrackModel[0].setRotationPoint(54F, -15F, -28F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // LeftTrack
		leftTrackModel[1].setRotationPoint(54.3F, -4.7F, -28F);
		leftTrackModel[1].rotateAngleZ = -0.7853982F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // LeftTrack
		leftTrackModel[2].setRotationPoint(43F, -16F, -28F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 198, 1, 12, 0F); // LeftTrack
		leftTrackModel[3].setRotationPoint(-157F, 9F, -28F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 16, 1, 12, 0F); // LeftTrack
		leftTrackModel[4].setRotationPoint(-167.6F, -2F, -28F);
		leftTrackModel[4].rotateAngleZ = -0.7853982F;

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 7, 12, 0F); // LeftTrack
		leftTrackModel[5].setRotationPoint(-168.3F, -8.4F, -28F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 21, 1, 12, 0F); // LeftTrack
		leftTrackModel[6].setRotationPoint(-168.3F, -9F, -28F);
		
		
		leftTrackModel[7] = new ModelRendererTurbo(this,  600,  600, textureX, textureY); // LeftWheel
		leftTrackModel[8] = new ModelRendererTurbo(this,  600,  575, textureX, textureY); // LeftWheelRow
		leftTrackModel[9] = new ModelRendererTurbo(this,  650,  600, textureX, textureY); // LeftWheel

		leftTrackModel[7].addBox(0F, 0F, 0F, 10, 10, 12, 0F); // LeftWheel
		leftTrackModel[7].setRotationPoint(44F, -15F, -27F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 190, 10, 8, 0F); // LeftWheelRow
		leftTrackModel[8].setRotationPoint(-148.1F, -1F, -24F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 6, 6, 12, 0F); // LeftWheel
		leftTrackModel[9].setRotationPoint(-168F, -8F, -27F);		
		
		
		
		rightTrackModel = new ModelRendererTurbo[10];
		rightTrackModel[0] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // RightTrack
		rightTrackModel[1] = new ModelRendererTurbo(this,  330,  300, textureX, textureY); // RightTrack
		rightTrackModel[2] = new ModelRendererTurbo(this,  375,  300, textureX, textureY); // RightTrack
		rightTrackModel[3] = new ModelRendererTurbo(this,  200,  375, textureX, textureY); // RightTrack
		rightTrackModel[4] = new ModelRendererTurbo(this,  230,  330, textureX, textureY); // RightTrack
		rightTrackModel[5] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // RightTrack
		rightTrackModel[6] = new ModelRendererTurbo(this,  145,  330, textureX, textureY); // RightTrack

		rightTrackModel[0].addBox(0F, 0F, 0F, 1, 11, 12, 0F); // RightTrack
		rightTrackModel[0].setRotationPoint(54F, -15F, 16F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 1, 20, 12, 0F); // RightTrack
		rightTrackModel[1].setRotationPoint(54.3F, -4.7F, 16F);
		rightTrackModel[1].rotateAngleZ = -0.7853982F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // RightTrack
		rightTrackModel[2].setRotationPoint(43F, -16F, 16F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 198, 1, 12, 0F); // RightTrack
		rightTrackModel[3].setRotationPoint(-157F, 9F, 16F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 16, 1, 12, 0F); // RightTrack
		rightTrackModel[4].setRotationPoint(-167.6F, -2F, 16F);
		rightTrackModel[4].rotateAngleZ = -0.7853982F;

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 7, 12, 0F); // RightTrack
		rightTrackModel[5].setRotationPoint(-168.3F, -8.4F, 16F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 21, 1, 12, 0F); // RightTrack
		rightTrackModel[6].setRotationPoint(-168.3F, -9F, 16F);	
		
		
		
		rightTrackModel[7] = new ModelRendererTurbo(this,  600,  600, textureX, textureY); // RightWheel
		rightTrackModel[8] = new ModelRendererTurbo(this,  600,  575, textureX, textureY); // RightWheelRow
		rightTrackModel[9] = new ModelRendererTurbo(this,  650,  600, textureX, textureY); // RightWheel

		rightTrackModel[7].addBox(0F, 0F, 0F, 10, 10, 12, 0F); // RightWheel
		rightTrackModel[7].setRotationPoint(44F, -15F, 15F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 190, 10, 8, 0F); // RightWheelRow
		rightTrackModel[8].setRotationPoint(-148.1F, -1F, 16F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 6, 6, 12, 0F); // RightWheel
		rightTrackModel[9].setRotationPoint(-168F, -8F, 15F);		
		
		
		flipAll(); //For old models
		translateAll(0, 4, 0);
    }
}
