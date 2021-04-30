package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;


public class ModelGustav extends ModelVehicle
{
    public ModelGustav()
    {
	
		int textureX = 350;
		int textureY = 300;
	
		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  227, textureX, textureY); // body1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  227, textureX, textureY); // body2
		bodyModel[2] = new ModelRendererTurbo(this,  2,  164, textureX, textureY); // body3
		bodyModel[3] = new ModelRendererTurbo(this,  2,  164, textureX, textureY); // body4
		bodyModel[4] = new ModelRendererTurbo(this,  27,  198, textureX, textureY); // body5
		bodyModel[5] = new ModelRendererTurbo(this,  27,  198, textureX, textureY); // body6
		bodyModel[6] = new ModelRendererTurbo(this,  0,  71, textureX, textureY); // body7
		bodyModel[7] = new ModelRendererTurbo(this,  135,  44, textureX, textureY); // body8
		bodyModel[8] = new ModelRendererTurbo(this,  135,  44, textureX, textureY); // body9
		bodyModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // body10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // body11
		bodyModel[11] = new ModelRendererTurbo(this,  115,  23, textureX, textureY); // body12
		bodyModel[12] = new ModelRendererTurbo(this,  115,  23, textureX, textureY); // body13
		bodyModel[13] = new ModelRendererTurbo(this,  228,  0, textureX, textureY); // body14
		bodyModel[14] = new ModelRendererTurbo(this,  228,  0, textureX, textureY); // body15
		bodyModel[15] = new ModelRendererTurbo(this,  228,  0, textureX, textureY); // body16
		bodyModel[16] = new ModelRendererTurbo(this,  228,  0, textureX, textureY); // body17
		bodyModel[17] = new ModelRendererTurbo(this,  236,  0, textureX, textureY); // body18
		bodyModel[18] = new ModelRendererTurbo(this,  236,  0, textureX, textureY); // body19
		bodyModel[19] = new ModelRendererTurbo(this,  236,  0, textureX, textureY); // body20
		bodyModel[20] = new ModelRendererTurbo(this,  236,  0, textureX, textureY); // body21
		bodyModel[21] = new ModelRendererTurbo(this,  270,  0, textureX, textureY); // body22
		bodyModel[22] = new ModelRendererTurbo(this,  270,  0, textureX, textureY); // body23
		bodyModel[23] = new ModelRendererTurbo(this,  0,  21, textureX, textureY); // body24
		bodyModel[24] = new ModelRendererTurbo(this,  0,  21, textureX, textureY); // body25
		bodyModel[25] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // CentralSquare

		bodyModel[0].addBox(0F, 0F, 0F, 7, 20, 20, 0F); // body1
		bodyModel[0].setRotationPoint(-40F, 0F, 7F);
		bodyModel[0].rotateAngleX = -0.7853982F;
		bodyModel[0].rotateAngleY = 1.570796F;

		bodyModel[1].addBox(0F, 0F, 0F, 7, 20, 20, 0F); // body2
		bodyModel[1].setRotationPoint(-40F, 0F, -13F);
		bodyModel[1].rotateAngleX = -0.7853982F;
		bodyModel[1].rotateAngleY = 1.570796F;

		bodyModel[2].addBox(0F, 0F, 0F, 39, 14, 9, 0F); // body3
		bodyModel[2].setRotationPoint(-63F, 14F, -15F);

		bodyModel[3].addBox(0F, 0F, 0F, 39, 14, 9, 0F); // body4
		bodyModel[3].setRotationPoint(-63F, 14F, 7F);

		bodyModel[4].addBox(0F, 0F, 0F, 59, 10, 9, 0F); // body5
		bodyModel[4].setRotationPoint(-104F, 7F, -15F);

		bodyModel[5].addBox(0F, 0F, 0F, 59, 10, 9, 0F); // body6
		bodyModel[5].setRotationPoint(-104F, 7F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 26, 13, 0F); // body7
		bodyModel[6].setRotationPoint(-104F, 7F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 22, 7, 9, 0F); // body8
		bodyModel[7].setRotationPoint(-24F, 21F, 7F);
		bodyModel[7].rotateAngleZ = -0.2268928F;

		bodyModel[8].addBox(0F, 0F, 0F, 22, 7, 9, 0F); // body9
		bodyModel[8].setRotationPoint(-24F, 21F, -15F);
		bodyModel[8].rotateAngleZ = -0.2268928F;

		bodyModel[9].addBox(0F, 0F, 0F, 102, 7, 9, 0F); // body10
		bodyModel[9].setRotationPoint(-104F, 26F, -15F);

		bodyModel[10].addBox(0F, 0F, 0F, 102, 7, 9, 0F); // body11
		bodyModel[10].setRotationPoint(-104F, 26F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 41, 4, 11, 0F); // body12
		bodyModel[11].setRotationPoint(-69F, 31F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 41, 4, 11, 0F); // body13
		bodyModel[12].setRotationPoint(-69F, 31F, -17F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // body14
		bodyModel[13].setRotationPoint(-104F, -11F, -15F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // body15
		bodyModel[14].setRotationPoint(-104F, -11F, 15F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // body16
		bodyModel[15].setRotationPoint(-104F, -11F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // body17
		bodyModel[16].setRotationPoint(-104F, -11F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // body18
		bodyModel[17].setRotationPoint(-104F, -4F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // body19
		bodyModel[18].setRotationPoint(-104F, -4F, -15F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // body20
		bodyModel[19].setRotationPoint(-104F, -11F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // body21
		bodyModel[20].setRotationPoint(-104F, -11F, -15F);

		bodyModel[21].addBox(0F, 0F, 0F, 15, 9, 9, 0F); // body22
		bodyModel[21].setRotationPoint(-77F, 26F, 7F);
		bodyModel[21].rotateAngleZ = 0.3839724F;

		bodyModel[22].addBox(0F, 0F, 0F, 15, 9, 9, 0F); // body23
		bodyModel[22].setRotationPoint(-77F, 26F, -15F);
		bodyModel[22].rotateAngleZ = 0.3839724F;

		bodyModel[23].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // body24
		bodyModel[23].setRotationPoint(-114F, 29F, -15F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 1, 9, 0F); // body25
		bodyModel[24].setRotationPoint(-114F, 29F, 7F);

		bodyModel[25].addBox(0F, 0F, 0F, 20, 12, 13, 0F); // CentralSquare
		bodyModel[25].setRotationPoint(-50F, 14F, -6F);
		
		leftBackWheelModel = new ModelRendererTurbo[1];
		leftBackWheelModel[0] = new ModelRendererTurbo(this,  110,  65, textureX, textureY); // wheel4

		leftBackWheelModel[0].addBox(0F, 0F, 0F, 35, 8, 11, 0F); // wheel4
		leftBackWheelModel[0].setRotationPoint(-104F, 30F, -17F);

		
		rightBackWheelModel = new ModelRendererTurbo[1];
		rightBackWheelModel[0] = new ModelRendererTurbo(this,  110,  65, textureX, textureY); // wheel3

		rightBackWheelModel[0].addBox(0F, 0F, 0F, 35, 8, 11, 0F); // wheel3
		rightBackWheelModel[0].setRotationPoint(-104F, 30F, 7F);
		
		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this,  110,  65, textureX, textureY); // wheel2

		leftFrontWheelModel[0].addBox(0F, 0F, 0F, 35, 8, 11, 0F); // wheel2
		leftFrontWheelModel[0].setRotationPoint(-28F, 30F, -17F);

		rightFrontWheelModel = new ModelRendererTurbo[1];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this,  110,  65, textureX, textureY); // wheel1

		rightFrontWheelModel[0].addBox(0F, 0F, 0F, 35, 8, 11, 0F); // wheel1
		rightFrontWheelModel[0].setRotationPoint(-28F, 30F, 7F);	
		
		//Gun model stolen from the browning
		ModelRendererTurbo[][] BigAssGunModel = new ModelRendererTurbo[3][];
		
		//No yaw only part
		BigAssGunModel[0] = new ModelRendererTurbo[0];
		
		//The main gun part
		BigAssGunModel[1] = new ModelRendererTurbo[5];
		BigAssGunModel[1][0] = new ModelRendererTurbo(this,  190,  250, textureX, textureY);
		BigAssGunModel[1][1] = new ModelRendererTurbo(this,  65,  34, textureX, textureY);
		BigAssGunModel[1][2] = new ModelRendererTurbo(this,  180,  200, textureX, textureY);
		BigAssGunModel[1][3] = new ModelRendererTurbo(this,  0,  36, textureX, textureY);	//Ammo box
		BigAssGunModel[1][4] = new ModelRendererTurbo(this,  137,  114, textureX, textureY);
		
		BigAssGunModel[1][0].addBox(46F, -4.5F, -2.5F, 55, 6, 6, 0F);
		BigAssGunModel[1][1].addBox(38F, -5F, -3F, 22, 7, 7, 0F);
		BigAssGunModel[1][2].addBox(-21F, -6F, -4F, 60, 9, 9, 0F);		
		BigAssGunModel[1][3].addBox(-20F, -7F, -5F, 32, 11, 11, 0F);
		BigAssGunModel[1][4].addBox(-32F, -6F, -5.5F, 12, 11, 11, 0F);
		
		//Set the origin
		for(ModelRendererTurbo gunPart : BigAssGunModel[1])
			gunPart.setRotationPoint(-40F, 2F, 1F);
		
		//No recoil part
		BigAssGunModel[2] = new ModelRendererTurbo[0];
				
		registerGunModel("BigAssGun", BigAssGunModel);
		
		flipAll(); //For old models
		translateAll(30, 35, 0);
    }
}
