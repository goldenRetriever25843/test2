package com.flansmod.client.virtualreality;

import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderHandEvent;

public class HardnessMultiplier {
	
	@SubscribeEvent
	public void a(RenderHandEvent event) {
		if(LibidoListener.yenielgoster) event.setCanceled(true);
	}
	
}
