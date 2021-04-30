package com.flansmod.common.eventhandlers;

import java.util.ArrayList;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketChecker;
import com.flansmod.common.network.PacketVaccine;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ServerTickEvent 
{
	
	public static ArrayList<EntityPlayerMP> nightVisionPlayers = new ArrayList<EntityPlayerMP>();
	
	//vaccine bob final solution
	public static ArrayList<Object[]> remount = new ArrayList();
	
	public ServerTickEvent() 
	{
		FMLCommonHandler.instance().bus().register(this);
	}
	
	
    int tickCount = 0;
    
    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event)
    {
        switch(event.phase)
        {
        case START :
        {
            break;
        }
        case END :
        {
            if(tickCount >= 20)
            {
                // INPUT CHECK FOR NIGHT VISION SCOPE ITEM
                // IF NO NIGHT VISION ITEM IN HAND GET RID NIGHT VISION
            	ArrayList<EntityPlayerMP> playersToRemove = new ArrayList<EntityPlayerMP>();
            	
            	for(EntityPlayerMP player : nightVisionPlayers)
            	{
            		if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
            		{
            			ItemGun itemGun;
            			itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
            			//Apply night vision while scoped if AllowNightVision = True
            			
            			ItemStack itemstack = player.getCurrentEquippedItem();
            			AttachmentType scope = itemGun.type.getScope(itemstack);
            			//Apply night vision while scoped if attachment.hasNightVision = True
            			System.out.println("est");
   
            			if(scope == null || (scope != null && !scope.hasNightVision))
            			  {
            			           player.removePotionEffect(Potion.nightVision.id);
            			           playersToRemove.add(player);
            			  }
            			
            		}
            		else
            		{
            			player.removePotionEffect(Potion.nightVision.id);
            			playersToRemove.add(player);
            		}
            	}
                tickCount = 0;
                for(EntityPlayerMP player : playersToRemove)
                {
                	nightVisionPlayers.remove(player);
                }
            }
            tickCount++;
            break;
        }        
        }
    }
    
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
      EntityPlayer player = event.player;
      if(!player.worldObj.isRemote) {
        FlansMod.getPacketHandler().sendTo(new PacketBlood(PlayerHandler.getPlayerData((EntityPlayer)player).blood, PlayerHandler.getPlayerData((EntityPlayer)player).hemorrhaging),  (EntityPlayerMP)player);
  //      FlansMod.getPacketHandler().sendToServer(new PacketVaccine());
  //      FlansMod.getPacketHandler().sendToServer(new PacketChecker());
        
        //bob vaccine final solution
        for(Object[] o : remount) 
        {
            ((EntityPlayer)o[0]).mountEntity((Entity)o[1]);
            System.out.println("remount attempted to remount");
        }

        remount.clear();
        //end of vaccine final soltion
 
      }
    }
}
