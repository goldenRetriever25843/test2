package com.hfr.inventory.gui;

import org.lwjgl.opengl.GL11;

import com.hfr.inventory.container.ContainerSawmill;
import com.hfr.lib.RefStrings;
import com.hfr.tileentity.machine.TileEntityMachineSawmill;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GUISawmill extends GuiContainer {

	public static ResourceLocation texture = new ResourceLocation(RefStrings.MODID + ":textures/gui/nuMachines/gui_sawmill.png");
	private TileEntityMachineSawmill diFurnace;
	
	public GUISawmill(InventoryPlayer invPlayer, TileEntityMachineSawmill tedf) {
		super(new ContainerSawmill(invPlayer, tedf));
		diFurnace = tedf;

		this.xSize = 176;
		this.ySize = 168;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		String name = this.diFurnace.hasCustomInventoryName() ? this.diFurnace.getInventoryName() : I18n.format(this.diFurnace.getInventoryName());
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		int i = (int)diFurnace.getProgressScaled(54);
		drawTexturedModalRect(guiLeft + 79, guiTop + 33, 192, 0, i, 19);

		int j = diFurnace.getPowerScaled(52);
		drawTexturedModalRect(guiLeft + 8, guiTop + 69 - j, 176, 52 - j, 16, j);
	}
}
