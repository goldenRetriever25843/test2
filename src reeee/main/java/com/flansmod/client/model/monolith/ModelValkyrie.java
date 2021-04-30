package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelValkyrie extends ModelMG
{
	int textureX = 512;
	int textureY = 512;
	
    public ModelValkyrie()
    {
		bipodModel = new ModelRendererTurbo[4];
		bipodModel[0] = new ModelRendererTurbo(this,  100,  200, textureX, textureY); // BP.BipodLeft
		bipodModel[1] = new ModelRendererTurbo(this,  100,  200, textureX, textureY); // BP.BipodRight
		bipodModel[2] = new ModelRendererTurbo(this,  100,  250, textureX, textureY); // BP.Bipodrightfoot
		bipodModel[3] = new ModelRendererTurbo(this,  100,  250, textureX, textureY); // BP.Bipodleftfoot

		bipodModel[0].addBox(-1F, 0F, 0F, 1, 12, 1, 0F); // BP.BipodLeft
		bipodModel[0].setRotationPoint(-0.5F, 10F, -0.5F);
		bipodModel[0].rotateAngleZ = -2.862339973F;

		bipodModel[1].addBox(-1F, 0F, 0F, 1, 12, 1, 0F); // BP.BipodRight
		bipodModel[1].setRotationPoint(-0.5F, 10.5F, -0.5F);
		bipodModel[1].rotateAngleZ = 2.862339973F;

		bipodModel[2].addBox(2F, 0F, 0F, 2, 1, 1, 0); // BP.Bipodrightfoot
		bipodModel[2].setRotationPoint(-7F, 0F, -0.5F);

		bipodModel[3].addBox(-2F, 0F, 0F, 2, 1, 1, 0); // BP.Bipodleftfoot
		bipodModel[3].setRotationPoint(5F, 0F, -0.5F);		
		
		
		
		
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this,  100,  225, textureX, textureY); // GN.Bipodconnectorthing
		gunModel[1] = new ModelRendererTurbo(this,  200,  150, textureX, textureY); // GN.Aircooler
		gunModel[2] = new ModelRendererTurbo(this,  200,  180, textureX, textureY); // GN.Barrel
		gunModel[3] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // GN.BaseCoverThing
		gunModel[4] = new ModelRendererTurbo(this,  200,  230, textureX, textureY); // GN.MainGun
		gunModel[5] = new ModelRendererTurbo(this,  200,  265, textureX, textureY); // GN.BoltThing
		gunModel[6] = new ModelRendererTurbo(this,  200,  280, textureX, textureY); // GN.TipThing
		gunModel[7] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // GN.IronSight
		gunModel[8] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // GN.Grip
		gunModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // GN._Stock
		gunModel[10] = new ModelRendererTurbo(this,  34,  0, textureX, textureY); // GN.StockButt
		
		gunModel[0].addBox(-1F, -1F, 0F, 2, 3, 1, 0); // GN.Bipodconnectorthing
		gunModel[0].setRotationPoint(0F, 11F, -0.5F);

		gunModel[1].addBox(-1.5F, -1.5F, 1F, 3, 3, 20, 0F); // GN.Aircooler
		gunModel[1].setRotationPoint(0F, 11F, -0.5F);

		gunModel[2].addBox(-0.5F, -0.5F, -7F, 1, 1, 32, 0F); // GN.Barrel
		gunModel[2].setRotationPoint(0F, 11F, -0.5F);

		gunModel[3].addBox(-2F, -2F, 22F, 4, 4, 2, 0); // GN.BaseCoverThing
		gunModel[3].setRotationPoint(0F, 11F, -0.5F);

		gunModel[4].addBox(-2F, -2.2F, 24.5F, 4, 5, 12, 0); // GN.MainGun
		gunModel[4].setRotationPoint(0F, 11F, -0.5F);

		gunModel[5].addBox(2F, -1F, 25F, 2, 1, 1, 0F); // GN.BoltThing
		gunModel[5].setRotationPoint(0F, 11F, -0.5F);

		gunModel[6].addBox(-1F, -1F, -6.8F, 2, 2, 3, 0F); // GN.TipThing
		gunModel[6].setRotationPoint(0F, 11F, -0.5F);

		gunModel[7].addBox(0F, 1F, -6.8F, 0, 1, 1, 0F); // GN.IronSight
		gunModel[7].setRotationPoint(0F, 11F, -0.5F);

		gunModel[8].addBox(-0.5F, -5.5F, 36F, 1, 4, 1, 0F); // GN.Grip
		gunModel[8].setRotationPoint(0F, 11F, -0.5F);
		gunModel[8].rotateAngleX = 14;
		
		gunModel[9].addBox(-1.5F, -1.8F, 36.5F, 3, 4, 10); // 
		gunModel[9].setRotationPoint(0F, 11F, -0.5F);		

		gunModel[10].addBox(-1.5F, -3F, 46.5F, 3, 5, 1, 0); // GN.StockButt
		gunModel[10].setRotationPoint(0F, 11F, -0.5F);
	
		
		
		
		
		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this,  490,  200, textureX, textureY); // AM.AmmoBoxThingy
		ammoModel[1] = new ModelRendererTurbo(this,  490,  200, textureX, textureY); // AM.AmmoBoxThingy

		ammoModel[0].addBox(-4F, -3.5F, 28.5F, 2, 5, 5, 0F); // AM.AmmoBoxThingy
		ammoModel[0].setRotationPoint(0F, 11F, -0.5F);	
		
		ammoModel[0].addBox(2F, -3.5F, 28.5F, 2, 5, 5, 0F); // AM.AmmoBoxThingy
		ammoModel[0].setRotationPoint(0F, 11F, -0.5F);	
    }
}
