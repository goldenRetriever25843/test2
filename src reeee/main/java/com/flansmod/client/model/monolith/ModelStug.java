package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;


public class ModelStug extends ModelVehicle
{
	int textureX = 512;
    int textureY = 512;	
	
    public ModelStug()
    {
    	
	
    	bodyModel = new ModelRendererTurbo[79];
		bodyModel[0] = new ModelRendererTurbo(this,  23,  139, textureX, textureY); // baseplate
		bodyModel[1] = new ModelRendererTurbo(this,  50,  200, textureX, textureY); // frontarmor
		bodyModel[2] = new ModelRendererTurbo(this,  273,  142, textureX, textureY); // frontcornerarmor
		bodyModel[3] = new ModelRendererTurbo(this,  162,  203, textureX, textureY); // fuselagetop
		bodyModel[4] = new ModelRendererTurbo(this,  410,  157, textureX, textureY); // BackPanel
		bodyModel[5] = new ModelRendererTurbo(this,  10,  280, textureX, textureY); // Trackcoverleft
		bodyModel[6] = new ModelRendererTurbo(this,  10,  280, textureX, textureY); // Trackcoverright
		bodyModel[7] = new ModelRendererTurbo(this,  370,  263, textureX, textureY); // turretmain
		bodyModel[8] = new ModelRendererTurbo(this,  414,  223, textureX, textureY); // turretbackmiddle
		bodyModel[9] = new ModelRendererTurbo(this,  175,  250, textureX, textureY); // turretbackright
		bodyModel[10] = new ModelRendererTurbo(this,  175,  300, textureX, textureY); // turretbackleft
		bodyModel[11] = new ModelRendererTurbo(this,  0,  228, textureX, textureY); // turretporthole
		bodyModel[12] = new ModelRendererTurbo(this,  0,  251, textureX, textureY); // turretnonporthole
		bodyModel[13] = new ModelRendererTurbo(this,  360,  157, textureX, textureY); // Turrettopmiddle
		bodyModel[14] = new ModelRendererTurbo(this,  250,  255, textureX, textureY); // leftportholecover
		bodyModel[15] = new ModelRendererTurbo(this,  250,  255, textureX, textureY); // Rightportholecover
		bodyModel[16] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // leftturrettop
		bodyModel[17] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // rightturrettop
		bodyModel[18] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // turrettopbackmiddle
		bodyModel[19] = new ModelRendererTurbo(this,  0,  357, textureX, textureY); // turretmain
		bodyModel[20] = new ModelRendererTurbo(this,  111,  333, textureX, textureY); // Sidepanelright
		bodyModel[21] = new ModelRendererTurbo(this,  111,  333, textureX, textureY); // sidepanelleft
		bodyModel[22] = new ModelRendererTurbo(this,  400,  333, textureX, textureY); // Utilitysquareleft
		bodyModel[23] = new ModelRendererTurbo(this,  400,  333, textureX, textureY); // Utilitysquareright
		bodyModel[24] = new ModelRendererTurbo(this,  34,  500, textureX, textureY); // Utilitypike
		bodyModel[25] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // backlaftcornertrackguard'
		bodyModel[26] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // backrightcornertrackguard
		bodyModel[27] = new ModelRendererTurbo(this,  0,  475, textureX, textureY); // frontleftcornertrackguard
		bodyModel[28] = new ModelRendererTurbo(this,  0,  475, textureX, textureY); // frontrightcornertrackguard
		bodyModel[29] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // frontleftwheel
		bodyModel[30] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // backleftwheel
		bodyModel[31] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel1
		bodyModel[32] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel2
		bodyModel[33] = new ModelRendererTurbo(this,  0,  378, textureX, textureY); // ammostorage?
		bodyModel[34] = new ModelRendererTurbo(this,  400,  400, textureX, textureY); // backpanel
		bodyModel[35] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel3
		bodyModel[36] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel4
		bodyModel[37] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel5
		bodyModel[38] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel6
		bodyModel[39] = new ModelRendererTurbo(this,  200,  425, textureX, textureY); // toptrackwheel1
		bodyModel[40] = new ModelRendererTurbo(this,  200,  425, textureX, textureY); // toptrackwheel2
		bodyModel[41] = new ModelRendererTurbo(this,  200,  425, textureX, textureY); // toptrackwheel3
		bodyModel[42] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // frontrightwheel
		bodyModel[43] = new ModelRendererTurbo(this,  200,  400, textureX, textureY); // backrightwheel
		bodyModel[44] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel1right
		bodyModel[45] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel2right
		bodyModel[46] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel3right
		bodyModel[47] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel4right
		bodyModel[48] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel5right
		bodyModel[49] = new ModelRendererTurbo(this,  250,  400, textureX, textureY); // trackwheel6right
		bodyModel[50] = new ModelRendererTurbo(this,  200,  425, textureX, textureY); // toptrackwheel1right
		bodyModel[51] = new ModelRendererTurbo(this,  200,  425, textureX, textureY); // toptrackwheel2right
		bodyModel[52] = new ModelRendererTurbo(this,  200,  425, textureX, textureY); // toptrackwheel3right
		bodyModel[53] = new ModelRendererTurbo(this,  250,  475, textureX, textureY); // leftportholedeco
		bodyModel[54] = new ModelRendererTurbo(this,  250,  475, textureX, textureY); // rightportholedeco
		bodyModel[55] = new ModelRendererTurbo(this,  0,  425, textureX, textureY); // pikesupport1
		bodyModel[56] = new ModelRendererTurbo(this,  0,  425, textureX, textureY); // pikesupport2
		bodyModel[57] = new ModelRendererTurbo(this,  150,  475, textureX, textureY); // portholeshade
		bodyModel[58] = new ModelRendererTurbo(this,  350,  444, textureX, textureY); // Gunshockabsorber
		bodyModel[59] = new ModelRendererTurbo(this,  495,  300, textureX, textureY); // flagpole1LEFT
		bodyModel[60] = new ModelRendererTurbo(this,  495,  300, textureX, textureY); // flagpole2LEFT
		bodyModel[61] = new ModelRendererTurbo(this,  495,  300, textureX, textureY); // flagpole3RIGHT
		bodyModel[62] = new ModelRendererTurbo(this,  495,  300, textureX, textureY); // flagpole4RIGHT
		bodyModel[63] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // flag1LEFT
		bodyModel[64] = new ModelRendererTurbo(this,  50,  0, textureX, textureY); // flag2RIGHT
		bodyModel[65] = new ModelRendererTurbo(this,  150,  0, textureX, textureY); // flag3LEFT
		bodyModel[66] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // flag4RIGHT
		bodyModel[67] = new ModelRendererTurbo(this,  300,  475, textureX, textureY); // RT.tracktopleft
		bodyModel[68] = new ModelRendererTurbo(this,  150,  400, textureX, textureY); // RT.trackfrontleft
		bodyModel[69] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // RT.trackbackleft
		bodyModel[70] = new ModelRendererTurbo(this,  150,  450, textureX, textureY); // RT.trackfrontangleleft
		bodyModel[71] = new ModelRendererTurbo(this,  200,  375, textureX, textureY); // RT.trackbackangleleft
		bodyModel[72] = new ModelRendererTurbo(this,  200,  355, textureX, textureY); // RT.trackbottomleft
		bodyModel[73] = new ModelRendererTurbo(this,  300,  475, textureX, textureY); // LT.tracktopright
		bodyModel[74] = new ModelRendererTurbo(this,  150,  400, textureX, textureY); // LT.trackfrontright
		bodyModel[75] = new ModelRendererTurbo(this,  150,  450, textureX, textureY); // LT.trackfrontangleright
		bodyModel[76] = new ModelRendererTurbo(this,  200,  355, textureX, textureY); // LT.trackbottomright
		bodyModel[77] = new ModelRendererTurbo(this,  200,  375, textureX, textureY); // LT.trackbackangleright
		bodyModel[78] = new ModelRendererTurbo(this,  300,  300, textureX, textureY); // LT.trackbackright/ flag4RIGHT

		bodyModel[0].addBox(-32F, 4F, -19F, 74, 1, 38, 0); // baseplate
		bodyModel[0].setRotationPoint(-10F, 0F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 7, 9, 38, 0); // frontarmor
		bodyModel[1].setRotationPoint(26F, -5F, -19F);
		bodyModel[1].rotateAngleZ = 25;

		bodyModel[2].addBox(0F, 0F, 0F, 3, 8, 38, 0); // frontcornerarmor
		bodyModel[2].setRotationPoint(25F, -7F, -19F);
		bodyModel[2].rotateAngleZ = 45;

		bodyModel[3].addBox(0F, 0F, 0F, 74, 3, 38, 0); // fuselagetop
		bodyModel[3].setRotationPoint(-48F, -8.5F, -19F);

		bodyModel[4].addBox(0F, 0F, 0F, 5, 13, 38, 0F); // BackPanel
		bodyModel[4].setRotationPoint(-48F, -7F, -19F);
		bodyModel[4].rotateAngleZ = 13;

		bodyModel[5].addBox(0F, 0F, 0F, 68, 1, 9, 0); // Trackcoverleft
		bodyModel[5].setRotationPoint(-39F, -9F, 19F);

		bodyModel[6].addBox(0F, 0F, 0F, 68, 1, 9, 0F); // Trackcoverright
		bodyModel[6].setRotationPoint(-39F, -9F, -28F);

		bodyModel[7].addBox(0F, 0F, 0F, 22, 10, 38, 0F); // turretmain
		bodyModel[7].setRotationPoint(-20F, -18.5F, -19F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 11, 12, 0); // turretbackmiddle
		bodyModel[8].setRotationPoint(-25.4F, -18.5F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 11, 14, 0); // turretbackright
		bodyModel[9].setRotationPoint(-20F, -18.5F, -19F);
		bodyModel[9].rotateAngleY = -6;

		bodyModel[10].addBox(0F, 0F, 0F, 6, 11, 14, 0F); // turretbackleft
		bodyModel[10].setRotationPoint(-25.5F, -18.5F, 6F);
		bodyModel[10].rotateAngleY = 6;

		bodyModel[11].addBox(0F, 0F, 0F, 9, 5, 12, 0); // turretporthole
		bodyModel[11].setRotationPoint(2F, -13.5F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 9, 5, 12, 0); // turretnonporthole
		bodyModel[12].setRotationPoint(2F, -13.5F, -19F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 4, 12, 0F); // Turrettopmiddle
		bodyModel[13].setRotationPoint(-16F, -23.5F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 10, 5, 11, 0F); // leftportholecover
		bodyModel[14].setRotationPoint(2F, -18.5F, 8F);
		bodyModel[14].rotateAngleZ = -32;

		bodyModel[15].addBox(0F, 0F, 0F, 10, 5, 11, 0); // Rightportholecover
		bodyModel[15].setRotationPoint(2F, -18.5F, -19F);
		bodyModel[15].rotateAngleZ = -32;

		bodyModel[16].addBox(0F, 0F, 0F, 22, 3, 16, 0); // leftturrettop
		bodyModel[16].setRotationPoint(-20F, -21.5F, 3F);
		bodyModel[16].rotateAngleX = 25;

		bodyModel[17].addBox(0F, 0F, 0F, 22, 3, 16, 0); // rightturrettop
		bodyModel[17].setRotationPoint(-20F, -19.5F, -19F);
		bodyModel[17].rotateAngleX = -25;

		bodyModel[18].addBox(0F, 0F, 0F, 11, 5, 12, 0F); // turrettopbackmiddle
		bodyModel[18].setRotationPoint(-26F, -19F, -6F);
		bodyModel[18].rotateAngleZ = 748;

		bodyModel[19].addBox(0F, 0F, 0F, 21, 8, 8, 0F); // turretmain
		bodyModel[19].setRotationPoint(-19F, -21.75F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 69, 12, 1, 0); // Sidepanelright
		bodyModel[20].setRotationPoint(-43F, -8F, -19F);

		bodyModel[21].addBox(0F, 0F, 0F, 69, 12, 1, 0); // sidepanelleft
		bodyModel[21].setRotationPoint(-43F, -7F, 18F);

		bodyModel[22].addBox(0F, 0F, 0F, 20, 7, 4, 0); // Utilitysquareleft
		bodyModel[22].setRotationPoint(-18F, -16F, 19F);

		bodyModel[23].addBox(0F, 0F, 0F, 20, 7, 4, 0); // Utilitysquareright
		bodyModel[23].setRotationPoint(-18F, -16F, -23F);

		bodyModel[24].addBox(0F, 0F, 0F, 48, 1, 1, 0F); // Utilitypike
		bodyModel[24].setRotationPoint(-48F, -12F, 23F);

		bodyModel[25].addBox(0F, 0F, 0F, 12, 1, 9, 0); // backlaftcornertrackguard'
		bodyModel[25].setRotationPoint(-51F, -6.5F, 19F);
		bodyModel[25].rotateAngleZ = -50;

		bodyModel[26].addBox(0F, 0F, 0F, 12, 1, 9, 0); // backrightcornertrackguard
		bodyModel[26].setRotationPoint(-51F, -6.5F, -28F);
		bodyModel[26].rotateAngleZ = -50;

		bodyModel[27].addBox(0F, 0F, 0F, 8, 1, 9, 0); // frontleftcornertrackguard
		bodyModel[27].setRotationPoint(29F, -9F, 19F);
		bodyModel[27].rotateAngleZ = 6;

		bodyModel[28].addBox(0F, 0F, 0F, 8, 1, 9, 0); // frontrightcornertrackguard
		bodyModel[28].setRotationPoint(29F, -9F, -28F);
		bodyModel[28].rotateAngleZ = 6;

		bodyModel[29].addBox(0F, 0F, 0F, 9, 9, 6, 0); // frontleftwheel
		bodyModel[29].setRotationPoint(23F, -5F, 19F);

		bodyModel[30].addBox(0F, 0F, 0F, 9, 9, 6, 0); // backleftwheel
		bodyModel[30].setRotationPoint(-48F, -5F, 19F);

		bodyModel[31].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel1
		bodyModel[31].setRotationPoint(13F, 2F, 19F);

		bodyModel[32].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel2
		bodyModel[32].setRotationPoint(3F, 2F, 19F);

		bodyModel[33].addBox(0F, 0F, 0F, 21, 4, 36, 0); // ammostorage?
		bodyModel[33].setRotationPoint(-40F, -12F, -18F);

		bodyModel[34].addBox(0F, 0F, 0F, 8, 4, 36, 0); // backpanel
		bodyModel[34].setRotationPoint(-47F, -9F, -18F);
		bodyModel[34].rotateAngleZ = -6;

		bodyModel[35].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel3
		bodyModel[35].setRotationPoint(-7F, 2F, 19F);

		bodyModel[36].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel4
		bodyModel[36].setRotationPoint(-17F, 2F, 19F);

		bodyModel[37].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel5
		bodyModel[37].setRotationPoint(-27F, 2F, 19F);

		bodyModel[38].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel6
		bodyModel[38].setRotationPoint(-37F, 2F, 19F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 4, 6, 0); // toptrackwheel1
		bodyModel[39].setRotationPoint(9.5F, -5F, 19F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 4, 6, 0); // toptrackwheel2
		bodyModel[40].setRotationPoint(-10.5F, -5F, 19F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 4, 6, 0); // toptrackwheel3
		bodyModel[41].setRotationPoint(-30.5F, -5F, 19F);

		bodyModel[42].addBox(0F, 0F, 0F, 9, 9, 6, 0); // frontrightwheel
		bodyModel[42].setRotationPoint(23F, -5F, -25F);

		bodyModel[43].addBox(0F, 0F, 0F, 9, 9, 6, 0); // backrightwheel
		bodyModel[43].setRotationPoint(-48F, -5F, -25F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel1right
		bodyModel[44].setRotationPoint(13F, 2F, -23F);

		bodyModel[45].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel2right
		bodyModel[45].setRotationPoint(3F, 2F, -23F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel3right
		bodyModel[46].setRotationPoint(-7F, 2F, -23F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel4right
		bodyModel[47].setRotationPoint(-17F, 2F, -23F);

		bodyModel[48].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel5right
		bodyModel[48].setRotationPoint(-27F, 2F, -23F);

		bodyModel[49].addBox(0F, 0F, 0F, 7, 7, 4, 0); // trackwheel6right
		bodyModel[49].setRotationPoint(-37F, 2F, -23F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 4, 6, 0); // toptrackwheel1right
		bodyModel[50].setRotationPoint(9.5F, -5F, -25F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 4, 6, 0); // toptrackwheel2right
		bodyModel[51].setRotationPoint(-10.5F, -5F, -25F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 4, 6, 0); // toptrackwheel3right
		bodyModel[52].setRotationPoint(-30.5F, -5F, -25F);

		bodyModel[53].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // leftportholedeco
		bodyModel[53].setRotationPoint(1F, -21F, 7F);
		bodyModel[53].rotateAngleZ = -95;

		bodyModel[54].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // rightportholedeco
		bodyModel[54].setRotationPoint(1F, -21F, -8F);
		bodyModel[54].rotateAngleZ = -95;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 4, 1, 0); // pikesupport1
		bodyModel[55].setRotationPoint(-6F, -12.5F, 23F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 4, 1, 0); // pikesupport2
		bodyModel[56].setRotationPoint(-40F, -12.5F, 23F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 6, 0); // portholeshade
		bodyModel[57].setRotationPoint(11F, -12F, 10F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 14, 12, 0); // Gunshockabsorber
		bodyModel[58].setRotationPoint(2F, -20F, -6F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 36, 1, 0); // flagpole1LEFT
		bodyModel[59].setRotationPoint(-17F, -50F, -20F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 42, 1, 0); // flagpole2LEFT
		bodyModel[60].setRotationPoint(-40F, -50F, -20F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 36, 1, 0); // flagpole3RIGHT
		bodyModel[61].setRotationPoint(-17F, -50F, 18F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 42, 1, 0); // flagpole4RIGHT
		bodyModel[62].setRotationPoint(-40F, -50F, 18F);

		bodyModel[63].addBox(0F, 0F, 0F, 15, 25, 0, 0); // flag1LEFT
		bodyModel[63].setRotationPoint(-32F, -50F, -19.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 15, 25, 0, 0); // flag2RIGHT
		bodyModel[64].setRotationPoint(-32F, -50F, 18.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 15, 25, 0, 0); // flag3LEFT
		bodyModel[65].setRotationPoint(-55F, -50F, -19.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 15, 25, 0, 0); // flag4RIGHT
		bodyModel[66].setRotationPoint(-55F, -50F, 18.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 81, 1, 8, 0); // RT.tracktopleft
		bodyModel[67].setRotationPoint(-48.5F, -6F, 19F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 10, 8, 0); // RT.trackfrontleft
		bodyModel[68].setRotationPoint(32F, -5.5F, 19F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 10, 8, 0); // RT.trackbackleft
		bodyModel[69].setRotationPoint(-49F, -5.5F, 19F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 13, 8, 0); // RT.trackfrontangleleft
		bodyModel[70].setRotationPoint(32F, 4F, 19F);
		bodyModel[70].rotateAngleZ = -1.20427718F;

		bodyModel[71].addBox(0F, 0F, 0F, 1, 13, 8, 0); // RT.trackbackangleleft
		bodyModel[71].setRotationPoint(-49F, 4.5F, 19F);
		bodyModel[71].rotateAngleZ = 1.20427718F;

		bodyModel[72].addBox(0F, 0F, 0F, 57, 1, 8, 0); // RT.trackbottomleft
		bodyModel[72].setRotationPoint(-37F, 9F, 19F);

		bodyModel[73].addBox(0F, 0F, 0F, 81, 1, 8, 0); // LT.tracktopright
		bodyModel[73].setRotationPoint(-48.5F, -6F, -27F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 10, 8, 0); // LT.trackfrontright
		bodyModel[74].setRotationPoint(32F, -5.5F, -27F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 13, 8, 0); // LT.trackfrontangleright
		bodyModel[75].setRotationPoint(32F, 4F, -27F);
		bodyModel[75].rotateAngleZ = -1.20427718F;

		bodyModel[76].addBox(0F, 0F, 0F, 57, 1, 8, 0); // LT.trackbottomright
		bodyModel[76].setRotationPoint(-37F, 9F, -27F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 13, 8, 0); // LT.trackbackangleright
		bodyModel[77].setRotationPoint(-49F, 4.5F, -27F);
		bodyModel[77].rotateAngleZ = 1.20427718F;

		bodyModel[78].addBox(0F, 0F, 0F, 1, 10, 8, 0); // LT.trackbackright
		bodyModel[78].setRotationPoint(-49F, -5.5F, -27F);
		
		turretModel = new ModelRendererTurbo[0];
		
		
		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this,  243,  300, textureX, textureY); // GN.Gunaircooler
		barrelModel[1] = new ModelRendererTurbo(this,  300,  400, textureX, textureY); // GN.Gun
		barrelModel[2] = new ModelRendererTurbo(this,  300,  450, textureX, textureY); // GN.Gunback
		barrelModel[3] = new ModelRendererTurbo(this,  300,  425, textureX, textureY); // GN.GunBase

		barrelModel[0].addBox(50F, -1.5F, -1.5F, 6, 3, 3, 0); // GN.Gunaircooler
		barrelModel[0].setRotationPoint(3F, -13.5F, 0F);

		barrelModel[1].addBox(20F, -1F, -1F, 30, 2, 2, 0); // GN.Gun
		barrelModel[1].setRotationPoint(3F, -13.5F, 0F);

		barrelModel[2].addBox(0F, 0F, -4F, 9, 10, 8, 0); // GN.Gunback
		barrelModel[2].setRotationPoint(3F, -18.5F, 0F);

		barrelModel[3].addBox(9F, -2F, -2F, 11, 4, 4, 0F); // GN.GunBase
		barrelModel[3].setRotationPoint(3F, -13.5F, 0F);
		
	
		
		
		
		flipAll(); //For old models
		translateAll(0, 0, 0);
    }
}
