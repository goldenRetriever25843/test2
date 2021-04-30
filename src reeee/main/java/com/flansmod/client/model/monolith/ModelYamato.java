package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelYamato extends ModelAAGun
{
	int textureX = 1536;
	int textureY = 1536;

	public ModelYamato()	
	{
    	
    	
    	baseModel = new ModelRendererTurbo[1];
		baseModel[0] = new ModelRendererTurbo(this,  0,  133, textureX, textureY); // BS.Base


		baseModel[0].addBox(0F, 0F, 0F, 86, 12, 86, 0F); // BS.Base
		baseModel[0].setRotationPoint(-43F, -12F, -43F);		
			
		
		seatModel = new ModelRendererTurbo[14];
		seatModel[0] = new ModelRendererTurbo(this,  0,  262, textureX, textureY); // GN.FrontPlate
		seatModel[1] = new ModelRendererTurbo(this,  0,  375, textureX, textureY); // GN.LeftSide
		seatModel[2] = new ModelRendererTurbo(this,  0,  375, textureX, textureY); // GN.RightSide
		seatModel[3] = new ModelRendererTurbo(this,  10,  500, textureX, textureY); // GN.TopSlab
		seatModel[4] = new ModelRendererTurbo(this,  0,  620, textureX, textureY); // GN.TopSlabFront
		seatModel[5] = new ModelRendererTurbo(this,  0,  750, textureX, textureY); // GN.BackBottomCorner
		seatModel[6] = new ModelRendererTurbo(this,  0,  875, textureX, textureY); // GN.BackTopCorner
		seatModel[7] = new ModelRendererTurbo(this,  0,  1000, textureX, textureY); // GN.EarTopLeft
		seatModel[8] = new ModelRendererTurbo(this,  0,  1000, textureX, textureY); // GN.EarTopRight
		seatModel[9] = new ModelRendererTurbo(this,  0,  1100, textureX, textureY); // GN.CoverUpBottomLeft
		seatModel[10] = new ModelRendererTurbo(this,  0,  1200, textureX, textureY); // GN.CoverUpTopLeft
		seatModel[11] = new ModelRendererTurbo(this,  0,  1100, textureX, textureY); // GN.CoverUpBottomRight
		seatModel[12] = new ModelRendererTurbo(this,  0,  1200, textureX, textureY); // GN.CoverUpTopRight
		seatModel[13] = new ModelRendererTurbo(this,  0,  1300, textureX, textureY); // GN.BottomCoverup


		seatModel[0].addBox(20F, 2F, -34F, 10, 40, 68, 0F); // GN.FrontPlate
		seatModel[0].setRotationPoint(0F, -29F, 0F);
		seatModel[0].rotateAngleZ = 0.6981317F;

		seatModel[1].addBox(-82F, 19F, -28F, 100, 36, 23, 0F); // GN.LeftSide
		seatModel[1].setRotationPoint(0F, -48F, 0F);
		seatModel[1].rotateAngleX = -0.5934119F;
		seatModel[1].rotateAngleY = 0.08726646F;
		seatModel[1].rotateAngleZ = 0.05235988F;

		seatModel[2].addBox(-82F, 19F, 5F, 100, 36, 23, 0F); // GN.RightSide
		seatModel[2].setRotationPoint(0F, -48F, 0F);
		seatModel[2].rotateAngleX = 0.5934119F;
		seatModel[2].rotateAngleY = -0.08726646F;
		seatModel[2].rotateAngleZ = 0.05235988F;

		seatModel[3].addBox(-80F, 0F, -38F, 31, 14, 76, 0F); // GN.TopSlab
		seatModel[3].setRotationPoint(0F, -49F, 0F);
		seatModel[3].rotateAngleZ = -0.05235988F;

		seatModel[4].addBox(-50F, 0F, -36F, 74, 19, 72, 0F); // GN.TopSlabFront
		seatModel[4].setRotationPoint(0F, -47F, 0F);
		seatModel[4].rotateAngleZ = -0.08726646F;

		seatModel[5].addBox(-101F, -2F, -42F, 16, 18, 84, 0F); // GN.BackBottomCorner
		seatModel[5].setRotationPoint(0F, -72F, 0F);
		seatModel[5].rotateAngleZ = 0.5061455F;

		seatModel[6].addBox(-87F, 0F, -42F, 16, 29, 84, 0F); // GN.BackTopCorner
		seatModel[6].setRotationPoint(0F, -17F, 0F);
		seatModel[6].rotateAngleZ = -0.418879F;

		seatModel[7].addBox(-60F, 0F, -70F, 20, 14, 40, 0F); // GN.EarTopLeft
		seatModel[7].setRotationPoint(0F, -48F, 0F);

		seatModel[8].addBox(-60F, 0F, 30F, 20, 14, 40, 0F); // GN.EarTopRight
		seatModel[8].setRotationPoint(0F, -48F, 0F);

		seatModel[9].addBox(37F, 0F, -7F, 10, 8, 27, 0F); // GN.CoverUpBottomLeft
		seatModel[9].setRotationPoint(0F, -20F, 0F);
		seatModel[9].rotateAngleY = -1.012291F;

		seatModel[10].addBox(32F, 0F, -7F, 14, 18, 18, 0F); // GN.CoverUpTopLeft
		seatModel[10].setRotationPoint(0F, -9F, 0F);
		seatModel[10].rotateAngleY = -1.012291F;
		seatModel[10].rotateAngleZ = 0.6108652F;

		seatModel[11].addBox(37F, 0F, -20F, 10, 8, 27, 0F); // GN.CoverUpBottomRight
		seatModel[11].setRotationPoint(0F, -20F, 0F);
		seatModel[11].rotateAngleY = 1.012291F;

		seatModel[12].addBox(32F, 0F, -12F, 14, 18, 18, 0F); // GN.CoverUpTopRight
		seatModel[12].setRotationPoint(0F, -9F, 0F);
		seatModel[12].rotateAngleY = 1.012291F;
		seatModel[12].rotateAngleZ = 0.6108652F;

		seatModel[13].addBox(-80F, 0F, -41F, 74, 2, 82, 0F); // GN.BottomCoverup
		seatModel[13].setRotationPoint(0F, -12F, 0F);		
		
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // BL.BarrelCenter
		gunModel[1] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // BL.BarrelRight
		gunModel[2] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // BL.BarrelLeft
		gunModel[3] = new ModelRendererTurbo(this,  0,  1400, textureX, textureY); // BL.CoverRight
		gunModel[4] = new ModelRendererTurbo(this,  0,  1400, textureX, textureY); // BL.CoverCenter
		gunModel[5] = new ModelRendererTurbo(this,  0,  1400, textureX, textureY); // BL.CoverLeft


		gunModel[0].addBox(0F, -14F, 3F, 150, 8, 8, 0F); // BL.BarrelCenter
		gunModel[0].setRotationPoint(0F, -26F, 0F);

		gunModel[1].addBox(0F, -14F, 23F, 150, 8, 8, 0F); // BL.BarrelRight
		gunModel[1].setRotationPoint(0F, -26F, 0F);

		gunModel[2].addBox(0F, -14F, -17F, 150, 8, 8, 0F); // BL.BarrelLeft
		gunModel[2].setRotationPoint(0F, -26F, 0F);

		gunModel[3].addBox(0F, -18F, 22F, 52, 15, 10, 0F); // BL.CoverRight
		gunModel[3].setRotationPoint(0F, -28F, 0F);

		gunModel[4].addBox(0F, -18F, 2F, 52, 15, 10, 0F); // BL.CoverCenter
		gunModel[4].setRotationPoint(0F, -28F, 0F);

		gunModel[5].addBox(0F, -18F, -18F, 52, 15, 10, 0F); // BL.CoverLeft
		gunModel[5].setRotationPoint(0F, -28F, 0F);		

		barrelModel = new ModelRendererTurbo[0][0];
		
		
		//Even though I can't be bothered to add ammo models, this definition is still needed
		ammoModel = new ModelRendererTurbo[0][0];

		barrelX = 0;
		barrelY = 16;
		barrelZ = 6;
		
		flipAll(); //Used to fix old models
    }
}
