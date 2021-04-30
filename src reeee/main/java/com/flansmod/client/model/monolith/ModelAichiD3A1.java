//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelAichiD3A1 extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAichiD3A1()
	{
		bodyModel = new ModelRendererTurbo[155];
		bodyModel[0] = new ModelRendererTurbo(this, 51, 358, textureX, textureY); // Import TailLine
		bodyModel[1] = new ModelRendererTurbo(this, 5, 82, textureX, textureY); // Import Core26
		bodyModel[2] = new ModelRendererTurbo(this, 5, 82, textureX, textureY); // Import Core25
		bodyModel[3] = new ModelRendererTurbo(this, 2, 129, textureX, textureY); // Import Core1
		bodyModel[4] = new ModelRendererTurbo(this, 2, 298, textureX, textureY); // Import Core10
		bodyModel[5] = new ModelRendererTurbo(this, 2, 440, textureX, textureY); // Import Core11
		bodyModel[6] = new ModelRendererTurbo(this, 2, 314, textureX, textureY); // Import Core13
		bodyModel[7] = new ModelRendererTurbo(this, 2, 330, textureX, textureY); // Import Core14
		bodyModel[8] = new ModelRendererTurbo(this, 2, 470, textureX, textureY); // Import Core15
		bodyModel[9] = new ModelRendererTurbo(this, 2, 194, textureX, textureY); // Import Core16
		bodyModel[10] = new ModelRendererTurbo(this, 2, 358, textureX, textureY); // Import Core17
		bodyModel[11] = new ModelRendererTurbo(this, 2, 492, textureX, textureY); // Import Core18
		bodyModel[12] = new ModelRendererTurbo(this, 2, 216, textureX, textureY); // Import Core19
		bodyModel[13] = new ModelRendererTurbo(this, 2, 269, textureX, textureY); // Import Core2
		bodyModel[14] = new ModelRendererTurbo(this, 198, 328, textureX, textureY); // Import Core20
		bodyModel[15] = new ModelRendererTurbo(this, 203, 340, textureX, textureY); // Import Core21
		bodyModel[16] = new ModelRendererTurbo(this, 217, 328, textureX, textureY); // Import Core22
		bodyModel[17] = new ModelRendererTurbo(this, 188, 329, textureX, textureY); // Import Core23
		bodyModel[18] = new ModelRendererTurbo(this, 189, 320, textureX, textureY); // Import Core24
		bodyModel[19] = new ModelRendererTurbo(this, 2, 413, textureX, textureY); // Import Core3
		bodyModel[20] = new ModelRendererTurbo(this, 2, 426, textureX, textureY); // Import Core4
		bodyModel[21] = new ModelRendererTurbo(this, 2, 288, textureX, textureY); // Import Core5
		bodyModel[22] = new ModelRendererTurbo(this, 2, 96, textureX, textureY); // Import Core6
		bodyModel[23] = new ModelRendererTurbo(this, 2, 232, textureX, textureY); // Import Core7
		bodyModel[24] = new ModelRendererTurbo(this, 2, 376, textureX, textureY); // Import Core8
		bodyModel[25] = new ModelRendererTurbo(this, 2, 162, textureX, textureY); // Import Core9
		bodyModel[26] = new ModelRendererTurbo(this, 157, 58, textureX, textureY); // Import CtrlPnl1
		bodyModel[27] = new ModelRendererTurbo(this, 160, 74, textureX, textureY); // Import CtrlPnl2
		bodyModel[28] = new ModelRendererTurbo(this, 139, 60, textureX, textureY); // Import CtrlPnl3
		bodyModel[29] = new ModelRendererTurbo(this, 179, 60, textureX, textureY); // Import CtrlPnl4
		bodyModel[30] = new ModelRendererTurbo(this, 179, 96, textureX, textureY); // Import CtrlPnl5
		bodyModel[31] = new ModelRendererTurbo(this, 179, 77, textureX, textureY); // Import CtrlPnl6
		bodyModel[32] = new ModelRendererTurbo(this, 139, 78, textureX, textureY); // Import CtrlPnl7
		bodyModel[33] = new ModelRendererTurbo(this, 139, 97, textureX, textureY); // Import CtrlPnl8
		bodyModel[34] = new ModelRendererTurbo(this, 439, 242, textureX, textureY); // Import CWheel1
		bodyModel[35] = new ModelRendererTurbo(this, 424, 242, textureX, textureY); // Import CWheel2
		bodyModel[36] = new ModelRendererTurbo(this, 457, 242, textureX, textureY); // Import CWheel3
		bodyModel[37] = new ModelRendererTurbo(this, 424, 242, textureX, textureY); // Import CWheel4
		bodyModel[38] = new ModelRendererTurbo(this, 439, 242, textureX, textureY); // Import CWheel5
		bodyModel[39] = new ModelRendererTurbo(this, 457, 242, textureX, textureY); // Import CWheel6
		bodyModel[40] = new ModelRendererTurbo(this, 305, 67, textureX, textureY); // Import Drum1
		bodyModel[41] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Drum2
		bodyModel[42] = new ModelRendererTurbo(this, 305, 79, textureX, textureY); // Import Drum3
		bodyModel[43] = new ModelRendererTurbo(this, 305, 67, textureX, textureY); // Import Drum4
		bodyModel[44] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Drum5
		bodyModel[45] = new ModelRendererTurbo(this, 305, 79, textureX, textureY); // Import Drum6
		bodyModel[46] = new ModelRendererTurbo(this, 114, 196, textureX, textureY); // Import Hatch1
		bodyModel[47] = new ModelRendererTurbo(this, 155, 225, textureX, textureY); // Import Hatch10
		bodyModel[48] = new ModelRendererTurbo(this, 155, 225, textureX, textureY); // Import Hatch11
		bodyModel[49] = new ModelRendererTurbo(this, 179, 319, textureX, textureY); // Import Hatch12
		bodyModel[50] = new ModelRendererTurbo(this, 155, 193, textureX, textureY); // Import Hatch2
		bodyModel[51] = new ModelRendererTurbo(this, 189, 156, textureX, textureY); // Import Hatch3
		bodyModel[52] = new ModelRendererTurbo(this, 155, 107, textureX, textureY); // Import Hatch4
		bodyModel[53] = new ModelRendererTurbo(this, 155, 151, textureX, textureY); // Import Hatch5
		bodyModel[54] = new ModelRendererTurbo(this, 155, 127, textureX, textureY); // Import Hatch6
		bodyModel[55] = new ModelRendererTurbo(this, 155, 173, textureX, textureY); // Import Hatch7
		bodyModel[56] = new ModelRendererTurbo(this, 155, 173, textureX, textureY); // Import Hatch8
		bodyModel[57] = new ModelRendererTurbo(this, 155, 209, textureX, textureY); // Import Hatch9
		bodyModel[58] = new ModelRendererTurbo(this, 257, 84, textureX, textureY); // Import Interior1
		bodyModel[59] = new ModelRendererTurbo(this, 199, 91, textureX, textureY); // Import Interior10
		bodyModel[60] = new ModelRendererTurbo(this, 233, 92, textureX, textureY); // Import Interior11
		bodyModel[61] = new ModelRendererTurbo(this, 92, 65, textureX, textureY); // Import Interior12
		bodyModel[62] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Import Interior13
		bodyModel[63] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Import Interior14
		bodyModel[64] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Import Interior15
		bodyModel[65] = new ModelRendererTurbo(this, 232, 86, textureX, textureY); // Import Interior16
		bodyModel[66] = new ModelRendererTurbo(this, 124, 84, textureX, textureY); // Import Interior17
		bodyModel[67] = new ModelRendererTurbo(this, 124, 84, textureX, textureY); // Import Interior18
		bodyModel[68] = new ModelRendererTurbo(this, 239, 81, textureX, textureY); // Import Interior19
		bodyModel[69] = new ModelRendererTurbo(this, 199, 91, textureX, textureY); // Import Interior2
		bodyModel[70] = new ModelRendererTurbo(this, 46, 62, textureX, textureY); // Import Interior20
		bodyModel[71] = new ModelRendererTurbo(this, 124, 91, textureX, textureY); // Import Interior21
		bodyModel[72] = new ModelRendererTurbo(this, 257, 76, textureX, textureY); // Import Interior22
		bodyModel[73] = new ModelRendererTurbo(this, 273, 67, textureX, textureY); // Import Interior23
		bodyModel[74] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Import Interior24
		bodyModel[75] = new ModelRendererTurbo(this, 124, 91, textureX, textureY); // Import Interior25
		bodyModel[76] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Import Interior26
		bodyModel[77] = new ModelRendererTurbo(this, 273, 83, textureX, textureY); // Import Interior27
		bodyModel[78] = new ModelRendererTurbo(this, 124, 99, textureX, textureY); // Import Interior28
		bodyModel[79] = new ModelRendererTurbo(this, 124, 99, textureX, textureY); // Import Interior29
		bodyModel[80] = new ModelRendererTurbo(this, 233, 92, textureX, textureY); // Import Interior3
		bodyModel[81] = new ModelRendererTurbo(this, 251, 195, textureX, textureY); // Import Interior30
		bodyModel[82] = new ModelRendererTurbo(this, 251, 204, textureX, textureY); // Import Interior31
		bodyModel[83] = new ModelRendererTurbo(this, 110, 65, textureX, textureY); // Import Interior33
		bodyModel[84] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Import Interior34
		bodyModel[85] = new ModelRendererTurbo(this, 110, 65, textureX, textureY); // Import Interior35
		bodyModel[86] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Import Interior36
		bodyModel[87] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior37
		bodyModel[88] = new ModelRendererTurbo(this, 210, 79, textureX, textureY); // Import Interior38
		bodyModel[89] = new ModelRendererTurbo(this, 233, 98, textureX, textureY); // Import Interior39
		bodyModel[90] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Import Interior4
		bodyModel[91] = new ModelRendererTurbo(this, 199, 64, textureX, textureY); // Import Interior40
		bodyModel[92] = new ModelRendererTurbo(this, 110, 74, textureX, textureY); // Import Interior41
		bodyModel[93] = new ModelRendererTurbo(this, 204, 72, textureX, textureY); // Import Interior42
		bodyModel[94] = new ModelRendererTurbo(this, 233, 102, textureX, textureY); // Import Interior43
		bodyModel[95] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior44
		bodyModel[96] = new ModelRendererTurbo(this, 204, 84, textureX, textureY); // Import Interior45
		bodyModel[97] = new ModelRendererTurbo(this, 110, 74, textureX, textureY); // Import Interior46
		bodyModel[98] = new ModelRendererTurbo(this, 204, 72, textureX, textureY); // Import Interior47
		bodyModel[99] = new ModelRendererTurbo(this, 204, 84, textureX, textureY); // Import Interior48
		bodyModel[100] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior49
		bodyModel[101] = new ModelRendererTurbo(this, 210, 79, textureX, textureY); // Import Interior5
		bodyModel[102] = new ModelRendererTurbo(this, 233, 108, textureX, textureY); // Import Interior50
		bodyModel[103] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior51
		bodyModel[104] = new ModelRendererTurbo(this, 204, 79, textureX, textureY); // Import Interior52
		bodyModel[105] = new ModelRendererTurbo(this, 243, 92, textureX, textureY); // Import Interior53
		bodyModel[106] = new ModelRendererTurbo(this, 232, 66, textureX, textureY); // Import Interior54
		bodyModel[107] = new ModelRendererTurbo(this, 273, 99, textureX, textureY); // Import Interior55
		bodyModel[108] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior56
		bodyModel[109] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior57
		bodyModel[110] = new ModelRendererTurbo(this, 232, 74, textureX, textureY); // Import Interior58
		bodyModel[111] = new ModelRendererTurbo(this, 232, 81, textureX, textureY); // Import Interior59
		bodyModel[112] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Import Interior6
		bodyModel[113] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior60
		bodyModel[114] = new ModelRendererTurbo(this, 232, 81, textureX, textureY); // Import Interior61
		bodyModel[115] = new ModelRendererTurbo(this, 93, 78, textureX, textureY); // Import Interior62
		bodyModel[116] = new ModelRendererTurbo(this, 199, 64, textureX, textureY); // Import Interior7
		bodyModel[117] = new ModelRendererTurbo(this, 257, 68, textureX, textureY); // Import Interior8
		bodyModel[118] = new ModelRendererTurbo(this, 204, 79, textureX, textureY); // Import Interior9
		bodyModel[119] = new ModelRendererTurbo(this, 147, 318, textureX, textureY); // Import MainGun1
		bodyModel[120] = new ModelRendererTurbo(this, 147, 318, textureX, textureY); // Import Maingun2
		bodyModel[121] = new ModelRendererTurbo(this, 218, 92, textureX, textureY); // Import PilotCtrl1
		bodyModel[122] = new ModelRendererTurbo(this, 220, 83, textureX, textureY); // Import PilotCtrl2
		bodyModel[123] = new ModelRendererTurbo(this, 220, 77, textureX, textureY); // Import PilotCtrl3
		bodyModel[124] = new ModelRendererTurbo(this, 220, 73, textureX, textureY); // Import PilotCtrl4
		bodyModel[125] = new ModelRendererTurbo(this, 220, 66, textureX, textureY); // Import PilotCtrl5
		bodyModel[126] = new ModelRendererTurbo(this, 248, 142, textureX, textureY); // Import PilotSeat1
		bodyModel[127] = new ModelRendererTurbo(this, 249, 155, textureX, textureY); // Import PilotSeat2
		bodyModel[128] = new ModelRendererTurbo(this, 248, 162, textureX, textureY); // Import PilotSeat3
		bodyModel[129] = new ModelRendererTurbo(this, 248, 116, textureX, textureY); // Import PilotSeat4
		bodyModel[130] = new ModelRendererTurbo(this, 260, 169, textureX, textureY); // Import PilotSeat5
		bodyModel[131] = new ModelRendererTurbo(this, 248, 169, textureX, textureY); // Import PilotSeat6
		bodyModel[132] = new ModelRendererTurbo(this, 287, 142, textureX, textureY); // Import PsgrSeat1
		bodyModel[133] = new ModelRendererTurbo(this, 287, 155, textureX, textureY); // Import PsgrSeat2
		bodyModel[134] = new ModelRendererTurbo(this, 287, 161, textureX, textureY); // Import PsgrSeat3
		bodyModel[135] = new ModelRendererTurbo(this, 288, 169, textureX, textureY); // Import PsgrSeat4
		bodyModel[136] = new ModelRendererTurbo(this, 287, 116, textureX, textureY); // Import PsgrSeat5
		bodyModel[137] = new ModelRendererTurbo(this, 298, 169, textureX, textureY); // Import PsgrSeat6
		bodyModel[138] = new ModelRendererTurbo(this, 201, 115, textureX, textureY); // Import Sight1
		bodyModel[139] = new ModelRendererTurbo(this, 201, 132, textureX, textureY); // Import Sight10
		bodyModel[140] = new ModelRendererTurbo(this, 211, 140, textureX, textureY); // Import Sight11
		bodyModel[141] = new ModelRendererTurbo(this, 211, 132, textureX, textureY); // Import Sight12
		bodyModel[142] = new ModelRendererTurbo(this, 201, 142, textureX, textureY); // Import Sight13
		bodyModel[143] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Sight14
		bodyModel[144] = new ModelRendererTurbo(this, 201, 132, textureX, textureY); // Import Sight15
		bodyModel[145] = new ModelRendererTurbo(this, 201, 115, textureX, textureY); // Import Sight2
		bodyModel[146] = new ModelRendererTurbo(this, 201, 123, textureX, textureY); // Import Sight3
		bodyModel[147] = new ModelRendererTurbo(this, 201, 119, textureX, textureY); // Import Sight4
		bodyModel[148] = new ModelRendererTurbo(this, 201, 115, textureX, textureY); // Import Sight5
		bodyModel[149] = new ModelRendererTurbo(this, 211, 140, textureX, textureY); // Import Sight6
		bodyModel[150] = new ModelRendererTurbo(this, 211, 132, textureX, textureY); // Import Sight7
		bodyModel[151] = new ModelRendererTurbo(this, 201, 142, textureX, textureY); // Import Sight8
		bodyModel[152] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Sight9
		bodyModel[153] = new ModelRendererTurbo(this, 7, 17, textureX, textureY); // Import Cwheeldecal1
		bodyModel[154] = new ModelRendererTurbo(this, 7, 17, textureX, textureY); // Import Cwheeldecal2

		bodyModel[0].addShapeBox(16.8F, -36.4F, -0.5F, 83, 1, 1, 0F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F, -.4F); // Import TailLine
		bodyModel[0].setRotationPoint(0F, -16F, 0F);
		bodyModel[0].rotateAngleZ = 0.03490659F;

		bodyModel[1].addShapeBox(-21F, -17F, -8F, 5, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Core26
		bodyModel[1].setRotationPoint(0F, -16F, 0F);

		bodyModel[2].addShapeBox(-21F, -17F, 5F, 5, 5, 3, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core25
		bodyModel[2].setRotationPoint(0F, -16F, 0F);

		bodyModel[3].addShapeBox(-21F, -1F, -12F, 52, 6, 24, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, -5F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -.5F, -5F); // Import Core1
		bodyModel[3].setRotationPoint(0F, -16F, 0F);

		bodyModel[4].addShapeBox(31F, -11F, -11F, 44, 10, 2, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F); // Import Core10
		bodyModel[4].setRotationPoint(0F, -16F, 0F);

		bodyModel[5].addShapeBox(31F, -16F, -11F, 44, 5, 22, 0F, 0F, -.1F, -3.25F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -.1F, -3.25F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F); // Import Core11
		bodyModel[5].setRotationPoint(0F, -16F, 0F);

		bodyModel[6].addShapeBox(31F, -11F, 9F, 44, 10, 2, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F); // Import Core13
		bodyModel[6].setRotationPoint(0F, -16F, 0F);

		bodyModel[7].addShapeBox(75F, -10F, -8F, 28, 8, 16, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Import Core14
		bodyModel[7].setRotationPoint(0F, -16F, 0F);

		bodyModel[8].addShapeBox(75F, -13F, -8F, 28, 3, 16, 0F, 0F, 0F, -3F, 0F, -3.5F, -5F, 0F, -3.5F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Import Core15
		bodyModel[8].setRotationPoint(0F, -16F, 0F);

		bodyModel[9].addShapeBox(75F, -2F, -8F, 28, 3, 16, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3.5F, -5F, 0F, -3.5F, -5F, 0F, 0F, -3F); // Import Core16
		bodyModel[9].setRotationPoint(0F, -16F, 0F);

		bodyModel[10].addShapeBox(103F, -8F, -4F, 14, 4, 8, 0F, 0F, 0F, 0F, 0F, -1.8F, -3.8F, 0F, -1.8F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -3.8F, 0F, -1.8F, -3.8F, 0F, 0F, 0F); // Import Core17
		bodyModel[10].setRotationPoint(0F, -16F, 0F);

		bodyModel[11].addShapeBox(103F, -10F, -4F, 14, 2, 8, 0F, 0F, -.5F, -1F, 0F, -3.6F, -3.9F, 0F, -3.6F, -3.9F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 1.8F, -3.8F, 0F, 1.8F, -3.8F, 0F, 0F, 0F); // Import Core18
		bodyModel[11].setRotationPoint(0F, -16F, 0F);

		bodyModel[12].addShapeBox(103F, -4F, -4F, 14, 2, 8, 0F, 0F, 0F, 0F, 0F, 1.8F, -3.8F, 0F, 1.8F, -3.8F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -3.6F, -3.9F, 0F, -3.6F, -3.9F, 0F, -.5F, -1F); // Import Core19
		bodyModel[12].setRotationPoint(0F, -16F, 0F);

		bodyModel[13].addShapeBox(-21F, -11F, -12F, 52, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Core2
		bodyModel[13].setRotationPoint(0F, -16F, 0F);

		bodyModel[14].addShapeBox(-48F, 3F, -2.5F, 3, 4, 5, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Core20
		bodyModel[14].setRotationPoint(0F, -16F, 0F);

		bodyModel[15].addShapeBox(-45F, 3F, -2.5F, 8, 4, 5, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core21
		bodyModel[15].setRotationPoint(0F, -16F, 0F);

		bodyModel[16].addShapeBox(-37F, 3F, -2.5F, 5, 4, 5, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Core22
		bodyModel[16].setRotationPoint(0F, -16F, 0F);

		bodyModel[17].addShapeBox(-52F, 1F, 3.5F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -4F, 2F, 0F, -4F, 2F, -1F, 3F, -2F, -1F, 3F); // Import Core23
		bodyModel[17].setRotationPoint(0F, -16F, 0F);

		bodyModel[18].addShapeBox(-52F, 1F, -5.5F, 2, 4, 2, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 3F, 2F, -1F, 3F, 2F, 0F, -4F, -2F, 0F, -4F); // Import Core24
		bodyModel[18].setRotationPoint(0F, -16F, 0F);

		bodyModel[19].addShapeBox(-21F, -15F, -12F, 52, 6, 4, 0F, 0F, 0F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core3
		bodyModel[19].setRotationPoint(0F, -18F, 0F);

		bodyModel[20].addShapeBox(-21F, -15F, 8F, 52, 6, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Core4
		bodyModel[20].setRotationPoint(0F, -18F, 0F);

		bodyModel[21].addShapeBox(-21F, -11F, 10F, 52, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Core5
		bodyModel[21].setRotationPoint(0F, -16F, 0F);

		bodyModel[22].addShapeBox(-56F, -1F, -12F, 35, 6, 24, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -6F, 0F, -.5F, -5F, 0F, -.5F, -5F, 0F, -1.5F, -6F); // Import Core6
		bodyModel[22].setRotationPoint(0F, -16F, 0F);

		bodyModel[23].addShapeBox(-56F, -11F, -12F, 35, 10, 24, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Core7
		bodyModel[23].setRotationPoint(0F, -16F, 0F);

		bodyModel[24].addShapeBox(-56F, -15F, -12F, 35, 6, 24, 0F, 0F, -1.5F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1.5F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Core8
		bodyModel[24].setRotationPoint(0F, -18F, 0F);

		bodyModel[25].addShapeBox(31F, -1F, -12F, 44, 6, 24, 0F, 0F, 0F, -1F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -1F, -6F); // Import Core9
		bodyModel[25].setRotationPoint(0F, -16F, 0F);

		bodyModel[26].addShapeBox(-16.98F, -18.5F, -4.5F, 0, 5, 9, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F); // Import CtrlPnl1
		bodyModel[26].setRotationPoint(0F, -16F, 0F);

		bodyModel[27].addShapeBox(-16.98F, -16F, -3F, 0, 7, 6, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import CtrlPnl2
		bodyModel[27].setRotationPoint(0F, -16F, 0F);

		bodyModel[28].addShapeBox(-15.98F, -15F, -8F, 0, 8, 8, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F); // Import CtrlPnl3
		bodyModel[28].setRotationPoint(0F, -16F, 0F);

		bodyModel[29].addShapeBox(-15.98F, -15F, 0F, 0, 8, 8, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F); // Import CtrlPnl4
		bodyModel[29].setRotationPoint(0F, -16F, 0F);

		bodyModel[30].addShapeBox(-15.98F, -15F, 2F, 0, 8, 8, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F); // Import CtrlPnl5
		bodyModel[30].setRotationPoint(0F, -16F, 0F);

		bodyModel[31].addShapeBox(-15.98F, -17F, 2F, 0, 8, 8, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F); // Import CtrlPnl6
		bodyModel[31].setRotationPoint(0F, -16F, 0F);

		bodyModel[32].addShapeBox(-15.98F, -17F, -10F, 0, 8, 8, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F); // Import CtrlPnl7
		bodyModel[32].setRotationPoint(0F, -16F, 0F);

		bodyModel[33].addShapeBox(-15.98F, -15F, -10F, 0, 8, 8, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F); // Import CtrlPnl8
		bodyModel[33].setRotationPoint(0F, -16F, 0F);

		bodyModel[34].addBox(-26F, 14.5F, 28.5F, 4, 10, 3, 0F); // Import CWheel1
		bodyModel[34].setRotationPoint(0F, -16F, 0F);

		bodyModel[35].addShapeBox(-29F, 14.5F, 28.5F, 3, 10, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import CWheel2
		bodyModel[35].setRotationPoint(0F, -16F, 0F);

		bodyModel[36].addShapeBox(-22F, 14.5F, 28.5F, 3, 10, 3, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import CWheel3
		bodyModel[36].setRotationPoint(0F, -16F, 0F);

		bodyModel[37].addShapeBox(-29F, 14.5F, -31.5F, 3, 10, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import CWheel4
		bodyModel[37].setRotationPoint(0F, -16F, 0F);

		bodyModel[38].addBox(-26F, 14.5F, -31.5F, 4, 10, 3, 0F); // Import CWheel5
		bodyModel[38].setRotationPoint(0F, -16F, 0F);

		bodyModel[39].addShapeBox(-22F, 14.5F, -31.5F, 3, 10, 3, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import CWheel6
		bodyModel[39].setRotationPoint(0F, -16F, 0F);

		bodyModel[40].addShapeBox(29F, -8F, -6.5F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Drum1
		bodyModel[40].setRotationPoint(0F, -16F, 0F);

		bodyModel[41].addBox(29F, -8F, -4.5F, 6, 2, 2, 0F); // Import Drum2
		bodyModel[41].setRotationPoint(0F, -16F, 0F);

		bodyModel[42].addShapeBox(29F, -8F, -2.5F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Drum3
		bodyModel[42].setRotationPoint(0F, -16F, 0F);

		bodyModel[43].addShapeBox(24F, -10F, -20.5F, 6, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Drum4
		bodyModel[43].setRotationPoint(0F, -16F, 0F);
		bodyModel[43].rotateAngleY = 0.40142573F;

		bodyModel[44].addBox(24F, -10F, -18.5F, 6, 2, 2, 0F); // Import Drum5
		bodyModel[44].setRotationPoint(0F, -16F, 0F);
		bodyModel[44].rotateAngleY = 0.40142573F;

		bodyModel[45].addShapeBox(24F, -10F, -16.5F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Drum6
		bodyModel[45].setRotationPoint(0F, -16F, 0F);
		bodyModel[45].rotateAngleY = 0.40142573F;

		bodyModel[46].addShapeBox(2.5F, -26.5F, -8F, 1, 10, 16, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch1
		bodyModel[46].setRotationPoint(0F, -16F, 0F);

		bodyModel[47].addShapeBox(3.5F, -26F, 2F, 14, 12, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch10
		bodyModel[47].setRotationPoint(0F, -16F, 0F);

		bodyModel[48].addShapeBox(3.5F, -26F, -9F, 14, 12, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Import Hatch11
		bodyModel[48].setRotationPoint(0F, -16F, 0F);

		bodyModel[49].addShapeBox(15.5F, -37F, -0.5F, 1, 10, 1, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch12
		bodyModel[49].setRotationPoint(0F, -16F, 0F);

		bodyModel[50].addShapeBox(-13.5F, -27.5F, -6F, 17, 1, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch2
		bodyModel[50].setRotationPoint(0F, -16F, 0F);

		bodyModel[51].addShapeBox(-16.5F, -27.5F, -6F, 3, 1, 12, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch3
		bodyModel[51].setRotationPoint(0F, -16F, 0F);

		bodyModel[52].addShapeBox(-23.15F, -26.4F, -4F, 1, 10, 8, 0F, -6.65F, .1F, 1F, 6.55F, .1F, 1F, 6.55F, .1F, 1F, -6.65F, .1F, 1F, .68F, 0F, -.8F, .68F, 0F, -.8F, .68F, 0F, -.8F, .68F, 0F, -.8F); // Import Hatch4
		bodyModel[52].setRotationPoint(0F, -16F, 0F);

		bodyModel[53].addShapeBox(-24.5F, -26.5F, 2F, 8, 12, 7, 0F, -8F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -8F, 0F, -3F, 0F, -1F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, -5F); // Import Hatch5
		bodyModel[53].setRotationPoint(0F, -16F, 0F);

		bodyModel[54].addShapeBox(-24.5F, -26.5F, -9F, 8, 12, 7, 0F, -8F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -8F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -1F); // Import Hatch6
		bodyModel[54].setRotationPoint(0F, -16F, 0F);

		bodyModel[55].addShapeBox(-16.5F, -26.5F, -9F, 20, 12, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Import Hatch7
		bodyModel[55].setRotationPoint(0F, -16F, 0F);

		bodyModel[56].addShapeBox(-16.5F, -26.5F, 2F, 20, 12, 7, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch8
		bodyModel[56].setRotationPoint(0F, -16F, 0F);

		bodyModel[57].addShapeBox(3.5F, -27F, -6F, 14, 1, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Hatch9
		bodyModel[57].setRotationPoint(0F, -16F, 0F);

		bodyModel[58].addShapeBox(-13F, -10F, 7F, 2, 2, 1, 0F, 0F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F); // Import Interior1
		bodyModel[58].setRotationPoint(0F, -16F, 0F);

		bodyModel[59].addBox(-16F, -2F, 0.5F, 2, 1, 1, 0F); // Import Interior10
		bodyModel[59].setRotationPoint(0F, -16F, 0F);

		bodyModel[60].addShapeBox(-15F, -3F, 8F, 2, 1, 2, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior11
		bodyModel[60].setRotationPoint(0F, -16F, 0F);

		bodyModel[61].addBox(-21F, -16F, -2F, 3, 5, 4, 0F); // Import Interior12
		bodyModel[61].setRotationPoint(0F, -16F, 0F);

		bodyModel[62].addShapeBox(-18F, -17.5F, -2.5F, 1, 1, 5, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior13
		bodyModel[62].setRotationPoint(0F, -16F, 0F);

		bodyModel[63].addBox(-18F, -16.5F, -2.5F, 1, 1, 5, 0F); // Import Interior14
		bodyModel[63].setRotationPoint(0F, -16F, 0F);

		bodyModel[64].addBox(-18F, -3F, -2F, 2, 2, 4, 0F); // Import Interior15
		bodyModel[64].setRotationPoint(0F, -16F, 0F);

		bodyModel[65].addBox(-13F, -12.3F, -6.2F, 1, 1, 1, 0F); // Import Interior16
		bodyModel[65].setRotationPoint(0F, -16F, 0F);

		bodyModel[66].addShapeBox(-18F, -12F, 2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Interior17
		bodyModel[66].setRotationPoint(0F, -16F, 0F);

		bodyModel[67].addShapeBox(-18F, -12F, -3F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior18
		bodyModel[67].setRotationPoint(0F, -16F, 0F);

		bodyModel[68].addShapeBox(-13F, -11.3F, -6.5F, 1, 1, 2, 0F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Interior19
		bodyModel[68].setRotationPoint(0F, -16F, 0F);

		bodyModel[69].addBox(-16F, -2F, -1.5F, 2, 1, 1, 0F); // Import Interior2
		bodyModel[69].setRotationPoint(0F, -16F, 0F);

		bodyModel[70].addBox(2.5F, -16F, -8F, 5, 15, 16, 0F); // Import Interior20
		bodyModel[70].setRotationPoint(0F, -16F, 0F);

		bodyModel[71].addBox(-17F, -12F, 3F, 1, 2, 2, 0F); // Import Interior21
		bodyModel[71].setRotationPoint(0F, -16F, 0F);

		bodyModel[72].addBox(-13F, -11F, 7F, 3, 1, 1, 0F); // Import Interior22
		bodyModel[72].setRotationPoint(0F, -16F, 0F);

		bodyModel[73].addBox(27F, -7F, 0F, 6, 6, 8, 0F); // Import Interior23
		bodyModel[73].setRotationPoint(0F, -16F, 0F);

		bodyModel[74].addShapeBox(-13F, -12F, 7F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior24
		bodyModel[74].setRotationPoint(0F, -16F, 0F);

		bodyModel[75].addBox(-17F, -12F, -5F, 1, 2, 2, 0F); // Import Interior25
		bodyModel[75].setRotationPoint(0F, -16F, 0F);

		bodyModel[76].addShapeBox(-13F, -10F, 7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Interior26
		bodyModel[76].setRotationPoint(0F, -16F, 0F);

		bodyModel[77].addBox(29F, -6F, -9F, 6, 5, 9, 0F); // Import Interior27
		bodyModel[77].setRotationPoint(0F, -16F, 0F);

		bodyModel[78].addBox(-17F, -14F, -7F, 1, 4, 2, 0F); // Import Interior28
		bodyModel[78].setRotationPoint(0F, -16F, 0F);

		bodyModel[79].addBox(-17F, -14F, 5F, 1, 4, 2, 0F); // Import Interior29
		bodyModel[79].setRotationPoint(0F, -16F, 0F);

		bodyModel[80].addBox(-15F, -2F, 8F, 2, 1, 2, 0F); // Import Interior3
		bodyModel[80].setRotationPoint(0F, -16F, 0F);

		bodyModel[81].addBox(28F, -15F, -2F, 3, 3, 4, 0F); // Import Interior30
		bodyModel[81].setRotationPoint(0F, -16F, 0F);

		bodyModel[82].addBox(28.5F, -18F, -1F, 2, 3, 2, 0F); // Import Interior31
		bodyModel[82].setRotationPoint(0F, -16F, 0F);

		bodyModel[83].addShapeBox(-21F, -16.5F, -4.7F, 6, 3, 2, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Import Interior33
		bodyModel[83].setRotationPoint(0F, -16F, 0F);

		bodyModel[84].addShapeBox(28F, -16F, 4F, 3, 5, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior34
		bodyModel[84].setRotationPoint(0F, -16F, 0F);

		bodyModel[85].addShapeBox(-21F, -16.5F, 2.9F, 6, 3, 2, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Import Interior35
		bodyModel[85].setRotationPoint(0F, -16F, 0F);

		bodyModel[86].addShapeBox(28F, -16F, -8F, 3, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Interior36
		bodyModel[86].setRotationPoint(0F, -16F, 0F);

		bodyModel[87].addShapeBox(-21F, -16F, 2F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Interior37
		bodyModel[87].setRotationPoint(0F, -16F, 0F);

		bodyModel[88].addShapeBox(-16.5F, -4.5F, -7F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -.4F, .7F, 0F, 0F, -.7F, 0F, 0F); // Import Interior38
		bodyModel[88].setRotationPoint(0F, -16F, 0F);

		bodyModel[89].addBox(-11.5F, -8F, 7F, 1, 1, 1, 0F); // Import Interior39
		bodyModel[89].setRotationPoint(-1F, -16F, 0F);
		bodyModel[89].rotateAngleZ = 0.41887902F;

		bodyModel[90].addShapeBox(-18F, -15.5F, -2.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Interior4
		bodyModel[90].setRotationPoint(0F, -16F, 0F);

		bodyModel[91].addBox(-17.5F, -2.5F, 2F, 1, 1, 1, 0F); // Import Interior40
		bodyModel[91].setRotationPoint(0F, -16F, 0F);

		bodyModel[92].addBox(-16.3F, -15F, -3.5F, 1, 1, 1, 0F); // Import Interior41
		bodyModel[92].setRotationPoint(0F, -16F, 0F);

		bodyModel[93].addShapeBox(-18.5F, -4.5F, -7F, 1, 1, 4, 0F, -2F, 0F, 0F, 2F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, -.4F, -2F, 0F, 0F, 2F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, -.4F); // Import Interior42
		bodyModel[93].setRotationPoint(0F, -16F, 0F);

		bodyModel[94].addShapeBox(-11.5F, -11F, 7F, 1, 3, 1, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Interior43
		bodyModel[94].setRotationPoint(-1F, -16F, 0F);
		bodyModel[94].rotateAngleZ = 0.41887902F;

		bodyModel[95].addShapeBox(-21F, -14F, 2F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior44
		bodyModel[95].setRotationPoint(0F, -16F, 0F);

		bodyModel[96].addShapeBox(-17.5F, -2.5F, 3F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -.4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -.4F, -2F, 0F, 0F); // Import Interior45
		bodyModel[96].setRotationPoint(0F, -16F, 0F);

		bodyModel[97].addBox(-16.3F, -15F, 2.7F, 1, 1, 1, 0F); // Import Interior46
		bodyModel[97].setRotationPoint(0F, -16F, 0F);

		bodyModel[98].addShapeBox(-18.5F, -4.5F, 3F, 1, 1, 4, 0F, 0F, 0F, -.4F, 0F, 0F, 0F, 2F, 0F, -.4F, -2F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, 0F, 2F, 0F, -.4F, -2F, 0F, 0F); // Import Interior47
		bodyModel[98].setRotationPoint(0F, -16F, 0F);

		bodyModel[99].addShapeBox(-17.5F, -2.5F, -7F, 1, 1, 4, 0F, -2F, 0F, 0F, 2F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior48
		bodyModel[99].setRotationPoint(0F, -16F, 0F);

		bodyModel[100].addShapeBox(-21F, -14F, 4F, 3, 2, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior49
		bodyModel[100].setRotationPoint(0F, -16F, 0F);

		bodyModel[101].addShapeBox(-16.5F, -4.5F, 6F, 1, 2, 1, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, 0F, -.7F, 0F, 0F, .7F, 0F, 0F, 1F, 0F, -.4F, -1F, 0F, 0F); // Import Interior5
		bodyModel[101].setRotationPoint(0F, -16F, 0F);

		bodyModel[102].addBox(-11.5F, -14F, 7F, 1, 3, 1, 0F); // Import Interior50
		bodyModel[102].setRotationPoint(-1F, -16F, 0F);
		bodyModel[102].rotateAngleZ = 0.41887902F;

		bodyModel[103].addShapeBox(-21F, -16F, 4F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior51
		bodyModel[103].setRotationPoint(0F, -16F, 0F);

		bodyModel[104].addShapeBox(-18.5F, -4.5F, 3F, 1, 2, 1, 0F, 0F, 0F, -.4F, 0F, 0F, 0F, .6F, 0F, 0F, -.6F, 0F, .5F, -1F, 0F, -.4F, 1F, 0F, 0F, 1.6F, 0F, 0F, -1.7F, 0F, .5F); // Import Interior52
		bodyModel[104].setRotationPoint(0F, -16F, 0F);

		bodyModel[105].addBox(-13F, -2F, 8.5F, 2, 1, 1, 0F); // Import Interior53
		bodyModel[105].setRotationPoint(0F, -16F, 0F);

		bodyModel[106].addBox(-15F, -9F, -11F, 5, 1, 5, 0F); // Import Interior54
		bodyModel[106].setRotationPoint(0F, -16F, 0F);

		bodyModel[107].addBox(23F, -4F, 6F, 3, 3, 7, 0F); // Import Interior55
		bodyModel[107].setRotationPoint(0F, -16F, 0F);
		bodyModel[107].rotateAngleY = -0.54105207F;

		bodyModel[108].addShapeBox(-21F, -16F, -6F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Interior56
		bodyModel[108].setRotationPoint(0F, -16F, 0F);

		bodyModel[109].addShapeBox(-21F, -16F, -4F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior57
		bodyModel[109].setRotationPoint(0F, -16F, 0F);

		bodyModel[110].addShapeBox(-15F, -11F, -9F, 5, 2, 3, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior58
		bodyModel[110].setRotationPoint(0F, -16F, 0F);

		bodyModel[111].addShapeBox(-13F, -12F, -7.5F, 1, 2, 1, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Interior59
		bodyModel[111].setRotationPoint(0F, -16F, 0F);

		bodyModel[112].addBox(-18F, -15F, -2F, 1, 5, 4, 0F); // Import Interior6
		bodyModel[112].setRotationPoint(0F, -16F, 0F);

		bodyModel[113].addShapeBox(-21F, -14F, -4F, 3, 2, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior60
		bodyModel[113].setRotationPoint(0F, -16F, 0F);

		bodyModel[114].addShapeBox(-13F, -12F, -7.5F, 1, 1, 2, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F); // Import Interior61
		bodyModel[114].setRotationPoint(0F, -16F, 0F);

		bodyModel[115].addShapeBox(-21F, -14F, -6F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Interior62
		bodyModel[115].setRotationPoint(0F, -16F, 0F);

		bodyModel[116].addBox(-17.5F, -2.5F, -3F, 1, 1, 1, 0F); // Import Interior7
		bodyModel[116].setRotationPoint(0F, -16F, 0F);

		bodyModel[117].addShapeBox(-16F, -2F, 7F, 1, 2, 1, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Interior8
		bodyModel[117].setRotationPoint(0F, -16F, 0F);
		bodyModel[117].rotateAngleZ = -0.78539816F;

		bodyModel[118].addShapeBox(-18.5F, -4.5F, -4F, 1, 2, 1, 0F, -.6F, 0F, .5F, .6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -1.7F, 0F, .5F, 1.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.4F); // Import Interior9
		bodyModel[118].setRotationPoint(0F, -16F, 0F);

		bodyModel[119].addBox(-61F, -16F, 3.5F, 1, 1, 1, 0F); // Import MainGun1
		bodyModel[119].setRotationPoint(0F, -16F, 0F);

		bodyModel[120].addBox(-61F, -16F, -4.5F, 1, 1, 1, 0F); // Import Maingun2
		bodyModel[120].setRotationPoint(0F, -16F, 0F);

		bodyModel[121].addShapeBox(-13F, -2F, -1F, 2, 1, 2, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PilotCtrl1
		bodyModel[121].setRotationPoint(0F, -16F, 0F);

		bodyModel[122].addBox(-12.5F, -8F, -0.5F, 1, 6, 1, 0F); // Import PilotCtrl2
		bodyModel[122].setRotationPoint(0F, -16F, 0F);

		bodyModel[123].addShapeBox(-12.5F, -11F, -0.5F, 1, 3, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PilotCtrl3
		bodyModel[123].setRotationPoint(0F, -16F, 0F);

		bodyModel[124].addShapeBox(-11.5F, -12F, -0.5F, 1, 1, 1, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PilotCtrl4
		bodyModel[124].setRotationPoint(0F, -16F, 0F);

		bodyModel[125].addShapeBox(-7.2F, -18F, -0.5F, 1, 3, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Import PilotCtrl5
		bodyModel[125].setRotationPoint(0F, -16F, 0F);
		bodyModel[125].rotateAngleZ = 0.34906585F;

		bodyModel[126].addBox(-10F, -4F, -4F, 10, 3, 8, 0F); // Import PilotSeat1
		bodyModel[126].setRotationPoint(0F, -16F, 0F);

		bodyModel[127].addShapeBox(-10F, -4F, 4F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import PilotSeat2
		bodyModel[127].setRotationPoint(0F, -16F, 0F);

		bodyModel[128].addShapeBox(-10F, -4F, -6F, 10, 3, 2, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PilotSeat3
		bodyModel[128].setRotationPoint(0F, -16F, 0F);

		bodyModel[129].addBox(0F, -17F, -4F, 2, 16, 8, 0F); // Import PilotSeat4
		bodyModel[129].setRotationPoint(0F, -16F, 0F);

		bodyModel[130].addShapeBox(0F, -17F, -6F, 2, 16, 2, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PilotSeat5
		bodyModel[130].setRotationPoint(0F, -16F, 0F);

		bodyModel[131].addShapeBox(0F, -17F, 4F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Import PilotSeat6
		bodyModel[131].setRotationPoint(0F, -16F, 0F);

		bodyModel[132].addBox(10F, -4F, -4F, 10, 3, 8, 0F); // Import PsgrSeat1
		bodyModel[132].setRotationPoint(0F, -16F, 0F);

		bodyModel[133].addShapeBox(10F, -4F, 4F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import PsgrSeat2
		bodyModel[133].setRotationPoint(0F, -16F, 0F);

		bodyModel[134].addShapeBox(10F, -4F, -6F, 10, 3, 2, 0F, 0F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PsgrSeat3
		bodyModel[134].setRotationPoint(0F, -16F, 0F);

		bodyModel[135].addShapeBox(8F, -17F, 4F, 2, 16, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Import PsgrSeat4
		bodyModel[135].setRotationPoint(0F, -16F, 0F);

		bodyModel[136].addBox(8F, -17F, -4F, 2, 16, 8, 0F); // Import PsgrSeat5
		bodyModel[136].setRotationPoint(0F, -16F, 0F);

		bodyModel[137].addShapeBox(8F, -17F, -6F, 2, 16, 2, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PsgrSeat6
		bodyModel[137].setRotationPoint(0F, -16F, 0F);

		bodyModel[138].addBox(-30F, -19F, -0.5F, 1, 3, 1, 0F); // Import Sight1
		bodyModel[138].setRotationPoint(0F, -16F, 0F);

		bodyModel[139].addShapeBox(-37F, -21.4F, -5F, 1, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Import Sight10
		bodyModel[139].setRotationPoint(0F, -16F, 0F);

		bodyModel[140].addBox(-37F, -17F, 3.5F, 1, 1, 1, 0F); // Import Sight11
		bodyModel[140].setRotationPoint(0F, -16F, 0F);

		bodyModel[141].addShapeBox(-37F, -19.2F, 3.5F, 1, 3, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import Sight12
		bodyModel[141].setRotationPoint(0F, -16F, 0F);

		bodyModel[142].addShapeBox(-37F, -20F, 3F, 1, 1, 2, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Import Sight13
		bodyModel[142].setRotationPoint(0F, -16F, 0F);

		bodyModel[143].addShapeBox(-37F, -20.7F, 3F, 1, 1, 2, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F); // Import Sight14
		bodyModel[143].setRotationPoint(0F, -16F, 0F);

		bodyModel[144].addShapeBox(-37F, -21.4F, 3F, 1, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Import Sight15
		bodyModel[144].setRotationPoint(0F, -16F, 0F);

		bodyModel[145].addBox(-37F, -19F, -0.5F, 1, 3, 1, 0F); // Import Sight2
		bodyModel[145].setRotationPoint(0F, -16F, 0F);

		bodyModel[146].addShapeBox(-40F, -19.4F, -1F, 13, 1, 2, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Import Sight3
		bodyModel[146].setRotationPoint(0F, -16F, 0F);

		bodyModel[147].addShapeBox(-40F, -20F, -1F, 13, 1, 2, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Import Sight4
		bodyModel[147].setRotationPoint(0F, -16F, 0F);

		bodyModel[148].addShapeBox(-40F, -20.6F, -1F, 13, 1, 2, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Import Sight5
		bodyModel[148].setRotationPoint(0F, -16F, 0F);

		bodyModel[149].addBox(-37F, -17F, -4.5F, 1, 1, 1, 0F); // Import Sight6
		bodyModel[149].setRotationPoint(0F, -16F, 0F);

		bodyModel[150].addShapeBox(-37F, -19.2F, -4.5F, 1, 3, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import Sight7
		bodyModel[150].setRotationPoint(0F, -16F, 0F);

		bodyModel[151].addShapeBox(-37F, -20F, -5F, 1, 1, 2, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Import Sight8
		bodyModel[151].setRotationPoint(0F, -16F, 0F);

		bodyModel[152].addShapeBox(-37F, -20.7F, -5F, 1, 1, 2, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F); // Import Sight9
		bodyModel[152].setRotationPoint(0F, -16F, 0F);

		bodyModel[153].addShapeBox(-31F, 16F, -32F, 22, 2, 4, 0F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F); // Import Cwheeldecal1
		bodyModel[153].setRotationPoint(0F, -16F, 0F);

		bodyModel[154].addShapeBox(-31F, 16F, 28F, 22, 2, 4, 0F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F, .1F, -.1F, .1F); // Import Cwheeldecal2
		bodyModel[154].setRotationPoint(0F, -16F, 0F);


		noseModel = new ModelRendererTurbo[31];
		noseModel[0] = new ModelRendererTurbo(this, 132, 281, textureX, textureY); // Import Nose1
		noseModel[1] = new ModelRendererTurbo(this, 216, 214, textureX, textureY); // Import Nose10
		noseModel[2] = new ModelRendererTurbo(this, 216, 230, textureX, textureY); // Import Nose11
		noseModel[3] = new ModelRendererTurbo(this, 206, 280, textureX, textureY); // Import Nose12
		noseModel[4] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose13
		noseModel[5] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose14
		noseModel[6] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose15
		noseModel[7] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose16
		noseModel[8] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose17
		noseModel[9] = new ModelRendererTurbo(this, 206, 259, textureX, textureY); // Import Nose18
		noseModel[10] = new ModelRendererTurbo(this, 206, 308, textureX, textureY); // Import Nose19
		noseModel[11] = new ModelRendererTurbo(this, 132, 248, textureX, textureY); // Import Nose2
		noseModel[12] = new ModelRendererTurbo(this, 219, 189, textureX, textureY); // Import Nose20
		noseModel[13] = new ModelRendererTurbo(this, 219, 177, textureX, textureY); // Import Nose21
		noseModel[14] = new ModelRendererTurbo(this, 219, 202, textureX, textureY); // Import Nose22
		noseModel[15] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose23
		noseModel[16] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose24
		noseModel[17] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose25
		noseModel[18] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose26
		noseModel[19] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose27
		noseModel[20] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose28
		noseModel[21] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose29
		noseModel[22] = new ModelRendererTurbo(this, 132, 315, textureX, textureY); // Import Nose3
		noseModel[23] = new ModelRendererTurbo(this, 124, 251, textureX, textureY); // Import Nose30
		noseModel[24] = new ModelRendererTurbo(this, 206, 239, textureX, textureY); // Import Nose31
		noseModel[25] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose4
		noseModel[26] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose5
		noseModel[27] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose6
		noseModel[28] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose7
		noseModel[29] = new ModelRendererTurbo(this, 110, 316, textureX, textureY); // Import Nose8
		noseModel[30] = new ModelRendererTurbo(this, 216, 221, textureX, textureY); // Import Nose9

		noseModel[0].addShapeBox(-60F, -11F, -10F, 10, 10, 20, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Nose1
		noseModel[0].setRotationPoint(0F, -16F, 0F);

		noseModel[1].addShapeBox(-67F, -8F, -2F, 7, 1, 4, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Nose10
		noseModel[1].setRotationPoint(0F, -16F, 0F);

		noseModel[2].addShapeBox(-67F, -5F, -2F, 7, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F); // Import Nose11
		noseModel[2].setRotationPoint(0F, -16F, 0F);

		noseModel[3].addBox(-61F, -11F, -8F, 1, 10, 16, 0F); // Import Nose12
		noseModel[3].setRotationPoint(0F, -16F, 0F);

		noseModel[4].addShapeBox(-65F, 3F, 0F, 5, 1, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Nose13
		noseModel[4].setRotationPoint(0F, -16F, 0F);

		noseModel[5].addShapeBox(-65F, -1F, 0F, 5, 6, 12, 0F, 0F, 1F, -8F, 0F, 1F, -9F, 0F, 0F, -2F, 0F, 1F, -3F, 0F, -3F, -5F, 0F, -3F, -6F, 0F, -1F, -6F, 0F, -2F, -7F); // Import Nose14
		noseModel[5].setRotationPoint(0F, -16F, 0F);

		noseModel[6].addShapeBox(-65F, -11F, 9F, 5, 10, 1, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Nose15
		noseModel[6].setRotationPoint(0F, -16F, 0F);

		noseModel[7].addShapeBox(-65F, -17F, -1F, 5, 6, 13, 0F, 0F, -3F, -6F, 0F, -3F, -7F, 0F, -1F, -6F, 0F, -2F, -7F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -2F, 0F, 1F, -3F); // Import Nose16
		noseModel[7].setRotationPoint(0F, -16F, 0F);

		noseModel[8].addShapeBox(-65F, -16F, 0F, 5, 1, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F); // Import Nose17
		noseModel[8].setRotationPoint(0F, -16F, 0F);

		noseModel[9].addShapeBox(-61F, -14F, -7F, 1, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Nose18
		noseModel[9].setRotationPoint(0F, -16F, 0F);

		noseModel[10].addShapeBox(-61F, -1F, -7F, 1, 3, 14, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Nose19
		noseModel[10].setRotationPoint(0F, -16F, 0F);

		noseModel[11].addShapeBox(-60F, -15F, -12F, 10, 6, 24, 0F, 0F, -1F, -6F, 0F, -.5F, -5F, 0F, -.5F, -5F, 0F, -1F, -6F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Import Nose2
		noseModel[11].setRotationPoint(0F, -18F, 0F);

		noseModel[12].addBox(-64F, -7.5F, -3.5F, 3, 3, 7, 0F); // Import Nose20
		noseModel[12].setRotationPoint(0F, -16F, 0F);

		noseModel[13].addShapeBox(-64F, -9.5F, -3.5F, 3, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Nose21
		noseModel[13].setRotationPoint(0F, -16F, 0F);

		noseModel[14].addShapeBox(-64F, -4.5F, -3.5F, 3, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Nose22
		noseModel[14].setRotationPoint(0F, -16F, 0F);

		noseModel[15].addBox(-9F, -8F, -0.5F, 1, 16, 1, 0F); // Import Nose23
		noseModel[15].setRotationPoint(-53.5F, -22F, 0F);

		noseModel[16].addBox(-9F, -10F, -0.5F, 1, 20, 1, 0F); // Import Nose24
		noseModel[16].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[16].rotateAngleX = -0.78539816F;

		noseModel[17].addBox(-9F, -10F, -0.5F, 1, 20, 1, 0F); // Import Nose25
		noseModel[17].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[17].rotateAngleX = 0.78539816F;

		noseModel[18].addBox(-9F, -8F, -0.5F, 1, 16, 1, 0F); // Import Nose26
		noseModel[18].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[18].rotateAngleX = 1.57079633F;

		noseModel[19].addBox(-9F, -9F, -0.5F, 1, 18, 1, 0F); // Import Nose27
		noseModel[19].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[19].rotateAngleX = -0.38397244F;

		noseModel[20].addBox(-9F, -10F, -0.5F, 1, 20, 1, 0F); // Import Nose28
		noseModel[20].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[20].rotateAngleX = 0.40142573F;

		noseModel[21].addBox(-9F, -9F, -0.5F, 1, 18, 1, 0F); // Import Nose29
		noseModel[21].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[21].rotateAngleX = 1.18682389F;

		noseModel[22].addShapeBox(-60F, 1F, -12F, 10, 6, 24, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, -.5F, -5F, 0F, -.5F, -5F, 0F, -1F, -6F); // Import Nose3
		noseModel[22].setRotationPoint(0F, -18F, 0F);

		noseModel[23].addBox(-9F, -10F, -0.5F, 1, 20, 1, 0F); // Import Nose30
		noseModel[23].setRotationPoint(-53.5F, -22F, 0F);
		noseModel[23].rotateAngleX = -1.1693706F;

		noseModel[24].addBox(-19F, -0.5F, -0.5F, 6, 1, 1, 0F); // Import Nose31
		noseModel[24].setRotationPoint(-53.5F, -22F, 0F);

		noseModel[25].addShapeBox(-65F, -16F, -6F, 5, 1, 6, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Nose4
		noseModel[25].setRotationPoint(0F, -16F, 0F);

		noseModel[26].addShapeBox(-65F, -11F, -10F, 5, 10, 1, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F); // Import Nose5
		noseModel[26].setRotationPoint(0F, -16F, 0F);

		noseModel[27].addShapeBox(-65F, 3F, -6F, 5, 1, 6, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Nose6
		noseModel[27].setRotationPoint(0F, -16F, 0F);

		noseModel[28].addShapeBox(-65F, -17F, -12F, 5, 6, 13, 0F, 0F, -2F, -7F, 0F, -1F, -6F, 0F, -3F, -7F, 0F, -3F, -6F, 0F, 1F, -3F, 0F, 0F, -2F, 0F, 1F, -9F, 0F, 1F, -9F); // Import Nose7
		noseModel[28].setRotationPoint(0F, -16F, 0F);

		noseModel[29].addShapeBox(-65F, -1F, -12F, 5, 6, 12, 0F, 0F, 1F, -3F, 0F, 0F, -2F, 0F, 1F, -9F, 0F, 1F, -8F, 0F, -2F, -7F, 0F, -1F, -6F, 0F, -3F, -6F, 0F, -3F, -5F); // Import Nose8
		noseModel[29].setRotationPoint(0F, -16F, 0F);

		noseModel[30].addShapeBox(-67F, -7F, -2F, 7, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Nose9
		noseModel[30].setRotationPoint(0F, -16F, 0F);


		tailModel = new ModelRendererTurbo[26];
		tailModel[0] = new ModelRendererTurbo(this, 296, 241, textureX, textureY); // Import Tail1
		tailModel[1] = new ModelRendererTurbo(this, 349, 265, textureX, textureY); // Import Tail10
		tailModel[2] = new ModelRendererTurbo(this, 349, 273, textureX, textureY); // Import Tail11
		tailModel[3] = new ModelRendererTurbo(this, 349, 265, textureX, textureY); // Import Tail12
		tailModel[4] = new ModelRendererTurbo(this, 349, 265, textureX, textureY); // Import Tail13
		tailModel[5] = new ModelRendererTurbo(this, 349, 284, textureX, textureY); // Import Tail14
		tailModel[6] = new ModelRendererTurbo(this, 416, 283, textureX, textureY); // Import Tail15
		tailModel[7] = new ModelRendererTurbo(this, 349, 290, textureX, textureY); // Import Tail16
		tailModel[8] = new ModelRendererTurbo(this, 412, 290, textureX, textureY); // Import Tail17
		tailModel[9] = new ModelRendererTurbo(this, 349, 305, textureX, textureY); // Import Tail18
		tailModel[10] = new ModelRendererTurbo(this, 304, 215, textureX, textureY); // Import Tail19
		tailModel[11] = new ModelRendererTurbo(this, 280, 247, textureX, textureY); // Import Tail2
		tailModel[12] = new ModelRendererTurbo(this, 304, 208, textureX, textureY); // Import Tail20
		tailModel[13] = new ModelRendererTurbo(this, 304, 223, textureX, textureY); // Import Tail21
		tailModel[14] = new ModelRendererTurbo(this, 315, 227, textureX, textureY); // Import Tail22
		tailModel[15] = new ModelRendererTurbo(this, 315, 223, textureX, textureY); // Import Tail25
		tailModel[16] = new ModelRendererTurbo(this, 315, 231, textureX, textureY); // Import Tail26
		tailModel[17] = new ModelRendererTurbo(this, 250, 255, textureX, textureY); // Import Tail3
		tailModel[18] = new ModelRendererTurbo(this, 288, 284, textureX, textureY); // Import Tail4
		tailModel[19] = new ModelRendererTurbo(this, 291, 291, textureX, textureY); // Import Tail5
		tailModel[20] = new ModelRendererTurbo(this, 250, 255, textureX, textureY); // Import Tail6
		tailModel[21] = new ModelRendererTurbo(this, 280, 247, textureX, textureY); // Import Tail7
		tailModel[22] = new ModelRendererTurbo(this, 288, 284, textureX, textureY); // Import Tail8
		tailModel[23] = new ModelRendererTurbo(this, 291, 291, textureX, textureY); // Import Tail9
		tailModel[24] = new ModelRendererTurbo(this, 99, 13, textureX, textureY); // Import taildecal1
		tailModel[25] = new ModelRendererTurbo(this, 99, 29, textureX, textureY); // Import taildecal2

		tailModel[0].addBox(109F, -6.5F, -1F, 7, 1, 2, 0F); // Import Tail1
		tailModel[0].setRotationPoint(0F, -16F, 0F);

		tailModel[1].addBox(80F, -12.5F, -0.5F, 35, 4, 1, 0F); // Import Tail10
		tailModel[1].setRotationPoint(0F, -16F, 0F);

		tailModel[2].addBox(55F, -14.5F, -0.5F, 60, 2, 1, 0F); // Import Tail11
		tailModel[2].setRotationPoint(0F, -16F, 0F);

		tailModel[3].addShapeBox(107F, -8.5F, -0.5F, 9, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail12
		tailModel[3].setRotationPoint(0F, -16F, 0F);

		tailModel[4].addBox(111F, -7.5F, -0.5F, 5, 1, 1, 0F); // Import Tail13
		tailModel[4].setRotationPoint(0F, -16F, 0F);

		tailModel[5].addShapeBox(55F, -16.5F, -0.5F, 32, 2, 1, 0F, -8F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail14
		tailModel[5].setRotationPoint(0F, -16F, 0F);

		tailModel[6].addBox(87F, -18.5F, -0.5F, 28, 4, 1, 0F); // Import Tail15
		tailModel[6].setRotationPoint(0F, -16F, 0F);

		tailModel[7].addShapeBox(87F, -30.5F, -0.5F, 28, 12, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail16
		tailModel[7].setRotationPoint(0F, -16F, 0F);

		tailModel[8].addShapeBox(91F, -39.5F, -0.5F, 24, 9, 1, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail17
		tailModel[8].setRotationPoint(0F, -16F, 0F);

		tailModel[9].addShapeBox(96F, -42.5F, -0.5F, 17, 3, 1, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail18
		tailModel[9].setRotationPoint(0F, -16F, 0F);

		tailModel[10].addShapeBox(99F, -5F, -1F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, -5.5F, -.3F, 0F, -5.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -.3F, 0F, 3F, -.3F, 0F, 0F, 0F); // Import Tail19
		tailModel[10].setRotationPoint(0F, -16F, 0F);

		tailModel[11].addShapeBox(98F, -6.5F, -5F, 19, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Tail2
		tailModel[11].setRotationPoint(0F, -16F, 0F);

		tailModel[12].addBox(100F, -6F, -0.5F, 13, 3, 1, 0F); // Import Tail20
		tailModel[12].setRotationPoint(0F, -16F, 0F);

		tailModel[13].addShapeBox(105F, -3.3F, -0.5F, 1, 3, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import Tail21
		tailModel[13].setRotationPoint(0F, -16F, 0F);

		tailModel[14].addShapeBox(106F, -1F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail22
		tailModel[14].setRotationPoint(0F, -15F, 0F);

		tailModel[15].addShapeBox(106F, -2F, -0.5F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail25
		tailModel[15].setRotationPoint(0F, -15F, 0F);

		tailModel[16].addShapeBox(106F, 0F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Tail26
		tailModel[16].setRotationPoint(0F, -15F, 0F);

		tailModel[17].addShapeBox(92F, -6.5F, -30F, 25, 1, 25, 0F, -6.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail3
		tailModel[17].setRotationPoint(0F, -16F, 0F);

		tailModel[18].addShapeBox(98F, -6.5F, -33F, 15, 1, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Import Tail4
		tailModel[18].setRotationPoint(0F, -16F, 0F);

		tailModel[19].addShapeBox(99F, -6.5F, -35F, 12, 1, 2, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Tail5
		tailModel[19].setRotationPoint(0F, -16F, 0F);

		tailModel[20].addShapeBox(92F, -6.5F, 5F, 25, 1, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6.5F, 0F, 0F); // Import Tail6
		tailModel[20].setRotationPoint(0F, -16F, 0F);

		tailModel[21].addShapeBox(98F, -6.5F, 1F, 19, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Tail7
		tailModel[21].setRotationPoint(0F, -16F, 0F);

		tailModel[22].addShapeBox(98F, -6.5F, 30F, 15, 1, 3, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Tail8
		tailModel[22].setRotationPoint(0F, -16F, 0F);

		tailModel[23].addShapeBox(99F, -6.5F, 33F, 12, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F); // Import Tail9
		tailModel[23].setRotationPoint(0F, -16F, 0F);

		tailModel[24].addBox(91F, -29.5F, -0.51F, 23, 10, 0, 0F); // Import taildecal1
		tailModel[24].setRotationPoint(0F, -16F, 0F);

		tailModel[25].addBox(91F, -29.5F, 0.51F, 23, 10, 0, 0F); // Import taildecal2
		tailModel[25].setRotationPoint(0F, -16F, 0F);


		bayModel = new ModelRendererTurbo[18];
		bayModel[0] = new ModelRendererTurbo(this, 258, 355, textureX, textureY); // Import Bomb10
		bayModel[1] = new ModelRendererTurbo(this, 260, 343, textureX, textureY); // Import Bomb9
		bayModel[2] = new ModelRendererTurbo(this, 261, 333, textureX, textureY); // Import Bomb8
		bayModel[3] = new ModelRendererTurbo(this, 259, 367, textureX, textureY); // Import Bomb11
		bayModel[4] = new ModelRendererTurbo(this, 260, 379, textureX, textureY); // Import Bomb12
		bayModel[5] = new ModelRendererTurbo(this, 261, 389, textureX, textureY); // Import Bomb13
		bayModel[6] = new ModelRendererTurbo(this, 261, 389, textureX, textureY); // Import Bomb14
		bayModel[7] = new ModelRendererTurbo(this, 260, 399, textureX, textureY); // Import Bomb15
		bayModel[8] = new ModelRendererTurbo(this, 260, 404, textureX, textureY); // Import Bomb17
		bayModel[9] = new ModelRendererTurbo(this, 259, 414, textureX, textureY); // Import Bomb18
		bayModel[10] = new ModelRendererTurbo(this, 259, 409, textureX, textureY); // Import Bomb16
		bayModel[11] = new ModelRendererTurbo(this, 294, 357, textureX, textureY); // Import Bomb7
		bayModel[12] = new ModelRendererTurbo(this, 292, 348, textureX, textureY); // Import Bomb6
		bayModel[13] = new ModelRendererTurbo(this, 283, 339, textureX, textureY); // Import Bomb2
		bayModel[14] = new ModelRendererTurbo(this, 292, 348, textureX, textureY); // Import 3
		bayModel[15] = new ModelRendererTurbo(this, 292, 348, textureX, textureY); // Import Bomb4
		bayModel[16] = new ModelRendererTurbo(this, 292, 348, textureX, textureY); // Import Bomb5
		bayModel[17] = new ModelRendererTurbo(this, 283, 333, textureX, textureY); // Import bomb1

		bayModel[0].addBox(-14F, 9F, -2.5F, 10, 5, 5, 0F); // Import Bomb10
		bayModel[0].setRotationPoint(0F, -16F, 0F);

		bayModel[1].addShapeBox(-17F, 9F, -2.5F, 3, 5, 5, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F); // Import Bomb9
		bayModel[1].setRotationPoint(0F, -16F, 0F);

		bayModel[2].addShapeBox(-20F, 9.5F, -2F, 3, 4, 4, 0F, 0F, -1.8F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.8F); // Import Bomb8
		bayModel[2].setRotationPoint(0F, -16F, 0F);

		bayModel[3].addShapeBox(-4F, 9F, -2.5F, 3, 5, 5, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Import Bomb11
		bayModel[3].setRotationPoint(0F, -16F, 0F);

		bayModel[4].addShapeBox(-1F, 9.5F, -2F, 3, 4, 4, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0F); // Import Bomb12
		bayModel[4].setRotationPoint(0F, -16F, 0F);

		bayModel[5].addBox(-2F, 5.5F, -8.5F, 2, 5, 1, 0F); // Import Bomb13
		bayModel[5].setRotationPoint(0F, -16F, 0F);
		bayModel[5].rotateAngleX = 0.78539816F;

		bayModel[6].addBox(-2F, 7.5F, -10.5F, 2, 1, 5, 0F); // Import Bomb14
		bayModel[6].setRotationPoint(0F, -16F, 0F);
		bayModel[6].rotateAngleX = 0.78539816F;

		bayModel[7].addShapeBox(-2F, 3.5F, -8.5F, 10, 2, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Bomb15
		bayModel[7].setRotationPoint(0F, -16F, 0F);
		bayModel[7].rotateAngleX = 0.78539816F;

		bayModel[8].addShapeBox(-2F, 10.5F, -8.5F, 10, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Bomb17
		bayModel[8].setRotationPoint(0F, -16F, 0F);
		bayModel[8].rotateAngleX = 0.78539816F;

		bayModel[9].addShapeBox(-2F, 7.5F, -12.5F, 10, 1, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Bomb18
		bayModel[9].setRotationPoint(0F, -16F, 0F);
		bayModel[9].rotateAngleX = 0.78539816F;

		bayModel[10].addShapeBox(-2F, 7.5F, -5.5F, 10, 1, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Bomb16
		bayModel[10].setRotationPoint(0F, -16F, 0F);
		bayModel[10].rotateAngleX = 0.78539816F;

		bayModel[11].addShapeBox(-10F, 9F, -2.5F, 1, 5, 5, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Import Bomb7
		bayModel[11].setRotationPoint(0F, -16F, 0F);

		bayModel[12].addShapeBox(-12F, 6F, -2F, 5, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Bomb6
		bayModel[12].setRotationPoint(0F, -16F, 0F);

		bayModel[13].addBox(-14F, 5F, -2.5F, 10, 1, 5, 0F); // Import Bomb2
		bayModel[13].setRotationPoint(0F, -16F, 0F);

		bayModel[14].addShapeBox(-12F, 6F, -2F, 5, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import 3
		bayModel[14].setRotationPoint(0F, -16F, 0F);

		bayModel[15].addShapeBox(-12F, 6F, 1F, 5, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Bomb4
		bayModel[15].setRotationPoint(0F, -16F, 0F);

		bayModel[16].addShapeBox(-12F, 6F, 1F, 5, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Bomb5
		bayModel[16].setRotationPoint(0F, -16F, 0F);

		bayModel[17].addBox(-24F, 5F, -2F, 10, 1, 4, 0F); // Import bomb1
		bayModel[17].setRotationPoint(0F, -16F, 0F);


		leftWingModel = new ModelRendererTurbo[21];
		leftWingModel[0] = new ModelRendererTurbo(this, 340, 50, textureX, textureY); // Import LWing1
		leftWingModel[1] = new ModelRendererTurbo(this, 456, 182, textureX, textureY); // Import LWing10
		leftWingModel[2] = new ModelRendererTurbo(this, 414, 207, textureX, textureY); // Import LWing11
		leftWingModel[3] = new ModelRendererTurbo(this, 427, 204, textureX, textureY); // Import LWing12
		leftWingModel[4] = new ModelRendererTurbo(this, 445, 203, textureX, textureY); // Import LWing13
		leftWingModel[5] = new ModelRendererTurbo(this, 463, 203, textureX, textureY); // Import LWing14
		leftWingModel[6] = new ModelRendererTurbo(this, 427, 221, textureX, textureY); // Import LWing15
		leftWingModel[7] = new ModelRendererTurbo(this, 452, 223, textureX, textureY); // Import LWing16
		leftWingModel[8] = new ModelRendererTurbo(this, 466, 223, textureX, textureY); // Import LWing17
		leftWingModel[9] = new ModelRendererTurbo(this, 340, 91, textureX, textureY); // Import LWing2
		leftWingModel[10] = new ModelRendererTurbo(this, 340, 131, textureX, textureY); // Import LWing3
		leftWingModel[11] = new ModelRendererTurbo(this, 340, 171, textureX, textureY); // Import LWing4
		leftWingModel[12] = new ModelRendererTurbo(this, 340, 200, textureX, textureY); // Import LWing5
		leftWingModel[13] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Import LWing6
		leftWingModel[14] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Import LWing7
		leftWingModel[15] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Import LWing8
		leftWingModel[16] = new ModelRendererTurbo(this, 340, 217, textureX, textureY); // Import LWing9
		leftWingModel[17] = new ModelRendererTurbo(this, 350, 9, textureX, textureY); // Import LWing18
		leftWingModel[18] = new ModelRendererTurbo(this, 354, 27, textureX, textureY); // Import LWing19
		leftWingModel[19] = new ModelRendererTurbo(this, 402, 28, textureX, textureY); // Import LWing20
		leftWingModel[20] = new ModelRendererTurbo(this, 5, 28, textureX, textureY); // Import LwingDecal

		leftWingModel[0].addShapeBox(-28F, 0F, -30F, 48, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWing1
		leftWingModel[0].setRotationPoint(0F, -16F, 0F);

		leftWingModel[1].addShapeBox(-27F, 4F, -31F, 12, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import LWing10
		leftWingModel[1].setRotationPoint(0F, -16F, 0F);

		leftWingModel[2].addShapeBox(-31F, 14F, -32F, 1, 6, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LWing11
		leftWingModel[2].setRotationPoint(0F, -16F, 0F);

		leftWingModel[3].addShapeBox(-30F, 12F, -32F, 4, 10, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LWing12
		leftWingModel[3].setRotationPoint(0F, -16F, 0F);

		leftWingModel[4].addBox(-26F, 12F, -32F, 3, 10, 4, 0F); // Import LWing13
		leftWingModel[4].setRotationPoint(0F, -16F, 0F);

		leftWingModel[5].addShapeBox(-23F, 12F, -32F, 6, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LWing14
		leftWingModel[5].setRotationPoint(0F, -16F, 0F);

		leftWingModel[6].addShapeBox(-17F, 12F, -32F, 6, 9, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import LWing15
		leftWingModel[6].setRotationPoint(0F, -16F, 0F);

		leftWingModel[7].addShapeBox(-11F, 13F, -32F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Import LWing16
		leftWingModel[7].setRotationPoint(0F, -16F, 0F);

		leftWingModel[8].addShapeBox(-10F, 13.5F, -32F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import LWing17
		leftWingModel[8].setRotationPoint(0F, -16F, 0F);

		leftWingModel[9].addShapeBox(-28F, 0F, -60F, 48, 4, 30, 0F, -4F, 1.5F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import LWing2
		leftWingModel[9].setRotationPoint(0F, -16F, 0F);

		leftWingModel[10].addShapeBox(-24F, -2F, -92F, 42, 4, 32, 0F, -5F, 2F, 0F, -7F, 2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -5F, -3.5F, 0F, -7F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWing3
		leftWingModel[10].setRotationPoint(0F, -16F, 0F);

		leftWingModel[11].addShapeBox(-19F, -4F, -112F, 30, 2, 20, 0F, -5F, 2F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2.5F, 0F, -8F, -2.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Import LWing4
		leftWingModel[11].setRotationPoint(0F, -16F, 0F);

		leftWingModel[12].addShapeBox(-14F, -6F, -119F, 17, 2, 7, 0F, -4F, 1F, 0F, -6F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -6F, -2F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import LWing5
		leftWingModel[12].setRotationPoint(0F, -16F, 0F);

		leftWingModel[13].addShapeBox(-19F, 2.48F, -41.9F, 3, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import LWing6
		leftWingModel[13].setRotationPoint(0F, -16F, 0F);

		leftWingModel[14].addShapeBox(-17F, 0.5F, -53.9F, 3, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import LWing7
		leftWingModel[14].setRotationPoint(0F, -16F, 0F);

		leftWingModel[15].addShapeBox(-15F, -0.5F, -66.9F, 3, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import LWing8
		leftWingModel[15].setRotationPoint(0F, -16F, 0F);

		leftWingModel[16].addShapeBox(-20F, 8F, -67F, 5, 1, 29, 0F, -4F, 3F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWing9
		leftWingModel[16].setRotationPoint(0F, -16F, 0F);

		leftWingModel[17].addShapeBox(-27F, -4F, -18F, 47, 4, 8, 0F, -3F, -3F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWing18
		leftWingModel[17].setRotationPoint(0F, -16F, 0F);

		leftWingModel[18].addShapeBox(20F, -4F, -18F, 14, 4, 8, 0F, 0F, 0F, -6F, 0F, -3F, -7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LWing19
		leftWingModel[18].setRotationPoint(0F, -16F, 0F);

		leftWingModel[19].addShapeBox(20F, 0F, -18F, 14, 4, 12, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Import LWing20
		leftWingModel[19].setRotationPoint(0F, -16F, 0F);

		leftWingModel[20].addShapeBox(-19F, -4F, -112F, 30, 2, 20, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, .6F, 0F, 0F, .6F, 0F); // Import LwingDecal
		leftWingModel[20].setRotationPoint(0F, -16F, 0F);


		rightWingModel = new ModelRendererTurbo[21];
		rightWingModel[0] = new ModelRendererTurbo(this, 340, 50, textureX, textureY); // Import RWing1
		rightWingModel[1] = new ModelRendererTurbo(this, 427, 221, textureX, textureY); // Import RWing10
		rightWingModel[2] = new ModelRendererTurbo(this, 452, 223, textureX, textureY); // Import RWing11
		rightWingModel[3] = new ModelRendererTurbo(this, 463, 203, textureX, textureY); // Import RWing12
		rightWingModel[4] = new ModelRendererTurbo(this, 466, 223, textureX, textureY); // Import RWing13
		rightWingModel[5] = new ModelRendererTurbo(this, 340, 217, textureX, textureY); // Import RWing14
		rightWingModel[6] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Import RWing15
		rightWingModel[7] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Import RWing16
		rightWingModel[8] = new ModelRendererTurbo(this, 403, 201, textureX, textureY); // Import RWing17
		rightWingModel[9] = new ModelRendererTurbo(this, 340, 91, textureX, textureY); // Import RWing2
		rightWingModel[10] = new ModelRendererTurbo(this, 340, 131, textureX, textureY); // Import RWing3
		rightWingModel[11] = new ModelRendererTurbo(this, 340, 171, textureX, textureY); // Import RWing4
		rightWingModel[12] = new ModelRendererTurbo(this, 340, 200, textureX, textureY); // Import RWing5
		rightWingModel[13] = new ModelRendererTurbo(this, 456, 182, textureX, textureY); // Import RWing6
		rightWingModel[14] = new ModelRendererTurbo(this, 445, 203, textureX, textureY); // Import RWing7
		rightWingModel[15] = new ModelRendererTurbo(this, 427, 204, textureX, textureY); // Import RWing8
		rightWingModel[16] = new ModelRendererTurbo(this, 414, 207, textureX, textureY); // Import RWing9
		rightWingModel[17] = new ModelRendererTurbo(this, 350, 9, textureX, textureY); // Import RWing19
		rightWingModel[18] = new ModelRendererTurbo(this, 402, 28, textureX, textureY); // Import RWing18
		rightWingModel[19] = new ModelRendererTurbo(this, 354, 27, textureX, textureY); // Import RWing20
		rightWingModel[20] = new ModelRendererTurbo(this, 5, 28, textureX, textureY); // Import RwingDecal

		rightWingModel[0].addShapeBox(-28F, 0F, 0F, 48, 5, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RWing1
		rightWingModel[0].setRotationPoint(0F, -16F, 0F);

		rightWingModel[1].addShapeBox(-17F, 12F, 28F, 6, 9, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import RWing10
		rightWingModel[1].setRotationPoint(0F, -16F, 0F);

		rightWingModel[2].addShapeBox(-11F, 13F, 28F, 1, 6, 4, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Import RWing11
		rightWingModel[2].setRotationPoint(0F, -16F, 0F);

		rightWingModel[3].addShapeBox(-23F, 12F, 28F, 6, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import RWing12
		rightWingModel[3].setRotationPoint(0F, -16F, 0F);

		rightWingModel[4].addShapeBox(-10F, 13.5F, 28F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import RWing13
		rightWingModel[4].setRotationPoint(0F, -16F, 0F);

		rightWingModel[5].addShapeBox(-20F, 8F, 38F, 5, 1, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -4F, -3F, 0F); // Import RWing14
		rightWingModel[5].setRotationPoint(0F, -16F, 0F);

		rightWingModel[6].addShapeBox(-15F, -0.5F, 65.8F, 3, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import RWing15
		rightWingModel[6].setRotationPoint(0F, -16F, 0F);

		rightWingModel[7].addShapeBox(-17F, 0.5F, 54F, 3, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import RWing16
		rightWingModel[7].setRotationPoint(0F, -16F, 0F);

		rightWingModel[8].addShapeBox(-19F, 2.48F, 41F, 3, 6, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import RWing17
		rightWingModel[8].setRotationPoint(0F, -16F, 0F);

		rightWingModel[9].addShapeBox(-28F, 0F, 30F, 48, 4, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, -4F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -4F, -2F, 0F); // Import RWing2
		rightWingModel[9].setRotationPoint(0F, -16F, 0F);

		rightWingModel[10].addShapeBox(-24F, -2F, 60F, 42, 4, 32, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -7F, 2F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3.5F, 0F, -5F, -3.5F, 0F); // Import RWing3
		rightWingModel[10].setRotationPoint(0F, -16F, 0F);

		rightWingModel[11].addShapeBox(-19F, -4F, 92F, 30, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 2F, 0F, -5F, 2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -8F, -2.5F, 0F, -5F, -2.5F, 0F); // Import RWing4
		rightWingModel[11].setRotationPoint(0F, -16F, 0F);

		rightWingModel[12].addShapeBox(-14F, -6F, 112F, 17, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, -1F, -4F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -6F, -2F, -1F, -4F, -2F, 0F); // Import RWing5
		rightWingModel[12].setRotationPoint(0F, -16F, 0F);

		rightWingModel[13].addShapeBox(-27F, 4F, 29F, 12, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import RWing6
		rightWingModel[13].setRotationPoint(0F, -16F, 0F);

		rightWingModel[14].addBox(-26F, 12F, 28F, 3, 10, 4, 0F); // Import RWing7
		rightWingModel[14].setRotationPoint(0F, -16F, 0F);

		rightWingModel[15].addShapeBox(-30F, 12F, 28F, 4, 10, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import RWing8
		rightWingModel[15].setRotationPoint(0F, -16F, 0F);

		rightWingModel[16].addShapeBox(-31F, 14F, 28F, 1, 6, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import RWing9
		rightWingModel[16].setRotationPoint(0F, -16F, 0F);

		rightWingModel[17].addShapeBox(-27F, -4F, 10F, 47, 4, 8, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import RWing19
		rightWingModel[17].setRotationPoint(0F, -16F, 0F);

		rightWingModel[18].addShapeBox(20F, 0F, 6F, 14, 4, 12, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -7F, 0F, 0F, -4F); // Import RWing18
		rightWingModel[18].setRotationPoint(0F, -16F, 0F);

		rightWingModel[19].addShapeBox(20F, -4F, 10F, 14, 4, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Import RWing20
		rightWingModel[19].setRotationPoint(0F, -16F, 0F);

		rightWingModel[20].addShapeBox(-19F, -4F, 92F, 30, 2, 20, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, .6F, 0F, 0F, .6F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F); // Import RwingDecal
		rightWingModel[20].setRotationPoint(0F, -16F, 0F);


		planeModeParts = new ModelRendererTurbo[3];
		planeModeParts[0] = new ModelRendererTurbo(this, 131, 286, textureX, textureY); // Import Propeler1
		planeModeParts[1] = new ModelRendererTurbo(this, 131, 292, textureX, textureY); // Import Propeler2
		planeModeParts[2] = new ModelRendererTurbo(this, 131, 280, textureX, textureY); // Import Propeler3
		
		planeModeParts[0].addShapeBox(0F, -0.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Propeler1
		planeModeParts[0].setRotationPoint(-70F, -22F, 0F);

		planeModeParts[1].addShapeBox(0F, 0.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Propeler2
		planeModeParts[1].setRotationPoint(-70F, -22F, 0F);

		planeModeParts[2].addShapeBox(0F, -1.5F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Propeler3
		planeModeParts[2].setRotationPoint(-70F, -22F, 0F);

	

		propellerModels = new ModelRendererTurbo[1][3]; //1 propeller in 3 parts
        propellerModels[0][0] = new ModelRendererTurbo(this, 120, 280, textureX, textureY); //Propeller 0 - Blade 0 : 192, 12 is the texture origin
        propellerModels[0][1] = new ModelRendererTurbo(this, 120, 280, textureX, textureY); //Propeller 0 - Blade 1
        propellerModels[0][2] = new ModelRendererTurbo(this, 120, 280, textureX, textureY); //Propeller 0 - Blade 2		
        propellerModels[0][0].addBox(0.5F, -17.5F, -1F, 1, 16, 2, 0F);		//Propeller Blades
        propellerModels[0][1].addBox(0.5F, -17.5F, -1F, 1, 16, 2, 0F);		//They will all be the same
        propellerModels[0][2].addBox(0.5F, -17.5F, -1F, 1, 16, 2, 0F);		
        propellerModels[0][0].setRotationPoint(-70F, -22F, 0F);	//Set the position of the propeller
        propellerModels[0][1].setRotationPoint(-70F, -22F, 0F);	
        propellerModels[0][2].setRotationPoint(-70F, -22F, 0F);


		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[20];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 251, 224, textureX, textureY); // Import TailLine
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 288, 227, textureX, textureY); // Import TailLine
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 262, 227, textureX, textureY); // Import TailLine
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 278, 227, textureX, textureY); // Import TailLine
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 267, 227, textureX, textureY); // Import TailLine
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Import TailLine
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 283, 201, textureX, textureY); // Import TailLine
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 283, 195, textureX, textureY); // Import TailLine
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 283, 208, textureX, textureY); // Import TailLine
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 251, 212, textureX, textureY); // Import TailLine
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 251, 235, textureX, textureY); // Import TailLine
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 251, 235, textureX, textureY); // Import TailLine
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 251, 220, textureX, textureY); // Import TailLine
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 271, 196, textureX, textureY); // Import TailLine
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 271, 201, textureX, textureY); // Import TailLine
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 271, 201, textureX, textureY); // Import TailLine
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 271, 201, textureX, textureY); // Import TailLine
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 248, 227, textureX, textureY); // Import TailLine
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 254, 227, textureX, textureY); // Import TailLine
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 271, 207, textureX, textureY); // Import TailLine

		gun_1_Model[2][0].addBox(2.5F, -1.2F, -0.5F, 15, 1, 1, 0F); // Import TailLine

		gun_1_Model[2][1].addShapeBox(4.6F, -5.8F, -1.5F, 1, 1, 3, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -1F, -.3F, 0F, -1F, -.3F, 0F, -1F, -.3F, 0F, -1F); // Import TailLine

		gun_1_Model[2][2].addShapeBox(4.6F, -5.1F, -0.5F, 1, 1, 1, 0F,0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F); // Import TailLine

		gun_1_Model[2][3].addShapeBox(4.6F, -6.8F, -1.5F, 1, 1, 3, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Import TailLine

		gun_1_Model[2][4].addShapeBox(4.6F, -7.8F, -1.5F, 1, 1, 3, 0F,-.3F, 0F, -1F, -.3F, 0F, -1F, -.3F, 0F, -1F, -.3F, 0F, -1F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Import TailLine

		gun_1_Model[2][5].addShapeBox(21F, -6.8F, -0.5F, 1, 4, 1, 0F,-.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F); // Import TailLine

		gun_1_Model[2][6].addBox(-3F, -5F, -1.5F, 6, 2, 2, 0F); // Import TailLine

		gun_1_Model[2][7].addShapeBox(-3F, -5F, 0.5F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import TailLine

		gun_1_Model[2][8].addShapeBox(-3F, -5F, -3.5F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TailLine

		gun_1_Model[2][9].addBox(-5F, -3F, -1.5F, 8, 3, 3, 0F); // Import TailLine

		gun_1_Model[2][10].addShapeBox(21F, -2.7F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, 0F, 0F); // Import TailLine

		gun_1_Model[2][11].addShapeBox(16.1F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Import TailLine

		gun_1_Model[2][12].addBox(3F, -2.7F, -0.5F, 18, 1, 1, 0F); // Import TailLine

		gun_1_Model[2][13].addBox(-6F, -2.5F, -0.5F, 1, 2, 1, 0F); // Import TailLine

		gun_1_Model[2][14].addShapeBox(-7F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Import TailLine

		gun_1_Model[2][15].addShapeBox(-9F, -3F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import TailLine

		gun_1_Model[2][16].addShapeBox(-9F, -1F, -0.5F, 2, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TailLine

		gun_1_Model[2][17].addShapeBox(4.6F, -3.2F, -0.5F, 1, 2, 1, 0F,0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F); // Import TailLine

		gun_1_Model[2][18].addShapeBox(4.6F, -4.8F, -0.5F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import TailLine

		gun_1_Model[2][19].addShapeBox(-9F, -2.5F, -0.5F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import TailLine

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(30F, -34F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}