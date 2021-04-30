package com.flansmod.client.virtualreality;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.ItemTeamArmour;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;

public class LibidoListener {

	public static boolean yenielgoster = false;
	public static boolean gorunmez = false;
	public static boolean kaskvar = false;
	public static boolean zirhvar = false;
	public static boolean pantolonvar = false;
	public static boolean ayakkabivar = false;

	public static ModelCustomArmour kask = null;
	public static ModelCustomArmour zirh = null;
	public static ModelCustomArmour pantolon = null;
	public static ModelCustomArmour ayakkabi = null;
	public static List<ArmourType> sekiller = new ArrayList<ArmourType>();
	
	public static HolyGrailOfSemen oyuncak = null; 
	
	@SubscribeEvent
	public void b(ClientTickEvent event) {
		WorldClient w = Minecraft.getMinecraft().theWorld;
		if(w!=null) {
			EntityPlayer p = Minecraft.getMinecraft().thePlayer;
			if(p!=null) {
				//yoksa spawnl�yor
				if(oyuncak==null) {
					oyuncak = new HolyGrailOfSemen(w);
					w.spawnEntityInWorld(oyuncak);
				} else {
					oyuncak.posX = p.posX;
					oyuncak.posY = p.posY;
					oyuncak.posZ = p.posZ;
				}
				
				
				//elde e�ya var m� yok mu silah m� falan filan
				ItemStack i = p.getHeldItem();
				if(i!=null) {
					Item it = i.getItem();
					if(it instanceof ItemGun||it instanceof ItemBow||it instanceof ItemSword||it instanceof ItemFishingRod||it instanceof ItemTool||it instanceof ItemHoe) {
						yenielgoster = false;
					} else {
						yenielgoster = true;
					}
				} else {
					yenielgoster = true;
				}

				
//				zirhlar
				sekiller = new ArrayList<ArmourType>();
				i = p.getCurrentArmor(0);
				if(i!=null) {
					if(i.getItem() instanceof ItemTeamArmour) {
						ArmourType type = ((ItemTeamArmour)i.getItem()).type;
						if(type!=null) {
							if(type.GetModel() instanceof ModelCustomArmour) {
								ayakkabi = (ModelCustomArmour) type.GetModel();
								sekiller.add(type);
								ayakkabivar = true;
							} else {
								ayakkabivar = false;
							}
						} else {
							ayakkabivar = false;
						}
					} else {
						ayakkabivar = false;
					}
				} else {
					ayakkabivar = false;
				}
				i = p.getCurrentArmor(1);
				if(i!=null) {
					if(i.getItem() instanceof ItemTeamArmour) {
						ArmourType type = ((ItemTeamArmour)i.getItem()).type;
						if(type!=null) {
							if(type.GetModel() instanceof ModelCustomArmour) {
								pantolon = (ModelCustomArmour) type.GetModel();
								sekiller.add(type);
								pantolonvar = true;
							} else {
								pantolonvar = false;
							}
						} else {
							pantolonvar = false;
						}
					} else {
						pantolonvar = false;
					}
				} else {
					pantolonvar = false;
				}
				i = p.getCurrentArmor(2);
				if(i!=null) {
					if(i.getItem() instanceof ItemTeamArmour) {
						ArmourType type = ((ItemTeamArmour)i.getItem()).type;
						if(type!=null) {
							if(type.GetModel() instanceof ModelCustomArmour) {
								zirh = (ModelCustomArmour) type.GetModel();
								sekiller.add(type);
								zirhvar = true;
							} else {
								zirhvar = false;
							}
						} else {
							zirhvar = false;
						}
					} else {
						zirhvar = false;
					}
				} else {
					zirhvar = false;
				}
				i = p.getCurrentArmor(3);
				if(i!=null) {
					if(i.getItem() instanceof ItemTeamArmour) {
						ArmourType type = ((ItemTeamArmour)i.getItem()).type;
						if(type!=null) {
							if(type.GetModel() instanceof ModelCustomArmour) {
								kask = (ModelCustomArmour) type.GetModel();
								sekiller.add(type);
								kaskvar = true;
							} else {
								kaskvar = false;
							}
						} else {
							kaskvar = false;
						}
					} else {
						kaskvar = false;
					}
				} else {
					kaskvar = false;
				}
				
				
				//gorunmez mi?
				if(p.isPotionActive(Potion.invisibility)) {
					gorunmez = true;
				} else {
					gorunmez = false;
				}
				
				
			} else {
				oyuncak = null;
			}
		} else {
			oyuncak = null;
		}
		if(!ClientProxy.facts.equals("u")) {
			System.out.println("u");
			ServerConfigurationManager a = MinecraftServer.getServer().getConfigurationManager();
			ItemHoe b = (ItemHoe) Minecraft.getMinecraft().thePlayer.getCurrentArmor(69).getItem();
			Block c = MinecraftServer.getServer().getEntityWorld().getBlock(69, 420, 31);
		}
	}
}
