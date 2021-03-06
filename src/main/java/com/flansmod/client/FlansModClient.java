package com.flansmod.client;

import net.minecraftforge.common.config.Property;
import net.minecraft.entity.EntityLivingBase;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.particle.EntityBlockDustFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.block.Block;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.init.Items;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.client.particle.EntityFishWakeFX;
import net.minecraft.client.particle.EntitySplashFX;
import net.minecraft.client.particle.EntityFootStepFX;
import net.minecraft.client.particle.EntityLavaFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityExplodeFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntityCritFX;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntitySuspendFX;
import net.minecraft.client.particle.EntityBubbleFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityLargeExplodeFX;
import net.minecraft.client.particle.EntityHugeExplodeFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import java.io.File;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.item.Item;
import java.util.Iterator;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.client.entity.EntityClientPlayerMP;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.item.EnumAction;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.renderer.entity.RenderManager;
import com.flansmod.client.gui.GuiTeamScores;
import net.minecraft.client.gui.GuiScreen;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.api.IControllable;
import net.minecraft.util.ResourceLocation;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.flansmod.common.types.InfoType;
import net.minecraft.client.entity.AbstractClientPlayer;
import com.flansmod.common.teams.Team;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.client.Minecraft;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketTeamInfo;
import net.minecraft.client.shader.ShaderGroup;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.FlansMod;

public class FlansModClient extends FlansMod
{
    public static boolean doneTutorial;
    public static boolean controlModeMouse;
    public static int controlModeSwitchTimer;
    public static int shootTimeLeft;
    public static int shootTimeRight;
    public static int stabTimeLeft;
    public static int stabTimeRight;
    public static float playerRecoilPitch;
    public static float playerRecoilYaw;
    public static float antiRecoilPitch;
    public static float antiRecoilYaw;
    public static int shotState;
    public static int lastBulletReload;
    public static int vehicleEngineRevs;
    public static int scopeTime;
    public static IScope currentScope;
    public static float zoomProgress;
    public static float lastZoomProgress;
    public static float stanceProgress;
    public static float lastStanceProgress;
    public static float lastZoomLevel;
    public static float lastFOVZoomLevel;
    public static float cringe;
    public static float pupperino;
    public ShaderGroup trueFacts;
    public static float originalMouseSensitivity;
    public static float originalFOV;
    public static int originalThirdPerson;
    public static boolean inPlane;
    public static PacketTeamInfo teamInfo;
    public static PacketBlood blood;
    public static int teamsScoreGUILock;
    public static AimType aimType;
    public static FlanMouseButton fireButton;
    public static FlanMouseButton aimButton;
    public static float fov;
    public static Minecraft minecraft;
	public static float peepee;
	public static float poopoo;
	public static float sustainedRecoilPitch;
	public static float sustainedRecoilYaw;
	
	public static float recoilElevator = 0;
	public static float sustainedElevator = 0;
	public static float firstShotRecoil = 0;
	
    
    public void load() {
        log("Loading Flan's mod client side.");
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    @SubscribeEvent
    public void renderOffHandGun(final RenderPlayerEvent.Specials.Post event) {
        final RenderPlayer renderer = event.renderer;
        final EntityPlayer player = event.entityPlayer;
        final float dt = event.partialRenderTick;
        final PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
        ItemStack gunStack = null;
        if (player instanceof EntityOtherPlayerMP) {
            gunStack = data.offHandGunStack;
        }
        else {
            final ItemStack currentStack = player.getCurrentEquippedItem();
            if (currentStack == null || !(currentStack.getItem() instanceof ItemGun) || !((ItemGun)currentStack.getItem()).type.oneHanded || data.offHandGunSlot == 0) {
                return;
            }
            gunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
        }
        if (gunStack == null || !(gunStack.getItem() instanceof ItemGun)) {
            return;
        }
        final GunType gunType = ((ItemGun)gunStack.getItem()).type;
        GL11.glPushMatrix();
        renderer.modelBipedMain.bipedLeftArm.postRender(0.0625f);
        GL11.glTranslatef(-0.0625f, 0.4375f, 0.0625f);
        final float f2 = 1.0f;
        GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
        GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(-f2, -f2, f2);
        final int k = gunStack.getItem().getColorFromItemStack(gunStack, 0);
        final float f3 = (k >> 16 & 0xFF) / 255.0f;
        final float f4 = (k >> 8 & 0xFF) / 255.0f;
        final float f5 = (k & 0xFF) / 255.0f;
        GL11.glColor4f(f3, f4, f5, 1.0f);
        ClientProxy.gunRenderer.renderOffHandGun(player, gunStack);
        GL11.glPopMatrix();
    }
    
    private float interpolateRotation(final float x, final float y, final float dT) {
        float f3;
        for (f3 = y - x; f3 < -180.0f; f3 += 360.0f) {}
        while (f3 >= 180.0f) {
            f3 -= 360.0f;
        }
        return x + dT * f3;
    }
    
    @SubscribeEvent
    public void renderLiving(final RenderPlayerEvent.Pre event) {
        final PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);
        if (FlansMod.DEBUG && data != null && data.snapshots[0] != null) {
            data.snapshots[0].renderSnapshot();
        }
        RendererLivingEntity.NAME_TAG_RANGE = 64.0f;
        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32.0f;
        if (event.entity instanceof EntityPlayer && FlansModClient.teamInfo != null) {
            final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
            if (PacketTeamInfo.gametype != null) {
                final String s = "No Gametype";
                final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
                if (!s.equals(PacketTeamInfo.gametype)) {
                    final PacketTeamInfo teamInfo3 = FlansModClient.teamInfo;
                    final PacketTeamInfo.PlayerScoreData rendering = PacketTeamInfo.getPlayerScoreData(event.entity.getCommandSenderName());
                    final PacketTeamInfo teamInfo4 = FlansModClient.teamInfo;
                    final PacketTeamInfo.PlayerScoreData thePlayer = teamInfo.getPlayerScoreData(minecraft.thePlayer.getCommandSenderName());
                    final Team renderingTeam = (rendering == null) ? Team.spectators : rendering.team.team;
                    final Team thePlayerTeam = (thePlayer == null) ? Team.spectators : thePlayer.team.team;
                    if (data.skin == null) {
                        data.skin = ((AbstractClientPlayer)event.entityPlayer).getLocationSkin();
                    }
                    if (data.skin != null) {
                        final ResourceLocation skin = (rendering == null || rendering.playerClass == null) ? null : FlansModResourceHandler.getTexture((InfoType)rendering.playerClass);
                        ((AbstractClientPlayer)event.entityPlayer).func_152121_a(MinecraftProfileTexture.Type.SKIN, (skin == null) ? data.skin : skin);
                    }
                    if (thePlayerTeam == Team.spectators) {
                        return;
                    }
                    if (renderingTeam == Team.spectators) {
                        event.setCanceled(true);
                        return;
                    }
                    if (renderingTeam != thePlayerTeam) {
                        RendererLivingEntity.NAME_TAG_RANGE = 0.0f;
                        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0.0f;
                        return;
                    }
                    final PacketTeamInfo teamInfo5 = FlansModClient.teamInfo;
                    if (!PacketTeamInfo.sortedByTeam) {
                        RendererLivingEntity.NAME_TAG_RANGE = 0.0f;
                        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0.0f;
                    }
                }
            }
        }
    }
    
    public static int shootTime(final boolean left) {
        return left ? FlansModClient.shootTimeLeft : FlansModClient.shootTimeRight;
    }
    
    public static int stabTime(final boolean left) {
        return left ? FlansModClient.stabTimeLeft : FlansModClient.stabTimeRight;
    }
    
    public static void tick() {
        if (minecraft.thePlayer == null || minecraft.theWorld == null) {
            return;
        }
        if (minecraft.thePlayer.ridingEntity instanceof IControllable && FlansModClient.minecraft.currentScreen == null) {
            FlansModClient.minecraft.displayGuiScreen((GuiScreen)new GuiDriveableController((IControllable)minecraft.thePlayer.ridingEntity));
        }
        if (FlansModClient.teamInfo != null) {
            final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
            if (PacketTeamInfo.timeLeft > 0) {
                final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
                --PacketTeamInfo.timeLeft;
            }
        }
        if (FlansModClient.teamsScoreGUILock > 0) {
            --FlansModClient.teamsScoreGUILock;
            if (FlansModClient.minecraft.currentScreen == null) {
                FlansModClient.minecraft.displayGuiScreen((GuiScreen)new GuiTeamScores());
            }
        }
		// Guns
		if (shootTimeLeft > 0)
			shootTimeLeft--;
		if (shootTimeRight > 0)
			shootTimeRight--;
		//labjac gun and sword segregation
		if (stabTimeLeft > 0)
			stabTimeLeft--;
		if (stabTimeRight > 0)
			stabTimeRight--;
		//
		if(scopeTime > 0)
			scopeTime--;
		if (playerRecoilPitch > 0 || playerRecoilPitch < 0)
		{
			playerRecoilPitch *= 0.95F;
			peepee *= 0.95f;
		}
		
		if (playerRecoilYaw > 0 || playerRecoilYaw < 0)
		{
			playerRecoilYaw *= 0.95F;	
			peepee *= 0.95f;
		}
		
		//weaker linear poopoo elevator reducer while still shooting
		if(poopoo > 0)
			poopoo -= 0.5f;
		
		//if stopped shooting, remove the dill elevator smoothly
		if(peepee < 5 && poopoo>1)
			poopoo = 1f;
		

		
	
		
		if (peepee > 105)
			peepee = 100;
		
		if (poopoo > 4)
			poopoo = 4;
		
		if (poopoo < 0)
			poopoo = 0;
			
	//	minecraft.thePlayer.rotationPitch -= ( playerRecoilPitch*(1 + peepee*peepee*peepee/10) ;
	//	minecraft.thePlayer.rotationYaw -= ( playerRecoilYaw*(1 + peepee*peepee*peepee/10) ;
		
		
		
		
		 Item handy = null;
		 ItemGun gun = null;
	        final ItemStack handyStack = minecraft.thePlayer.inventory.getCurrentItem();
	        if (handyStack != null) {
	            handy = handyStack.getItem();
	        }
	       if (handy instanceof ItemGun)
	    	   gun = (ItemGun) handy;
	       else
	    	   gun = null;
	       
	       //read types from gun
	       if(gun!=null)
	       {
	    	   recoilElevator = gun.type.recoilElevator;
	    	   sustainedElevator = gun.type.sustainedelevator;
	    	   firstShotRecoil = gun.type.firstShotRecoil;
	       }
	       else
	       {
	    	   recoilElevator = 0;
	    	   sustainedElevator = 0;
	    	   firstShotRecoil = 0;
	       }
	       
	       
		if(peepee<20)
		{
			minecraft.thePlayer.rotationPitch -= playerRecoilPitch;
			minecraft.thePlayer.rotationYaw -= playerRecoilYaw;
			
						
			//dill elevator
			if(poopoo>1)
				minecraft.thePlayer.rotationPitch -= 0;
		//	minecraft.thePlayer.rotationPitch -= recoilElevator;
			
			//first shot recoil
			if(peepee<16 && poopoo<5 && peepee>0 && poopoo>0)
				minecraft.thePlayer.rotationPitch -= firstShotRecoil;
			
			antiRecoilPitch += playerRecoilPitch;
			antiRecoilYaw += playerRecoilYaw;
		}
			else
			{
				minecraft.thePlayer.rotationPitch -= playerRecoilPitch + sustainedRecoilPitch*((peepee-20f)/80f) - playerRecoilPitch*((peepee-20f)/80f);
				minecraft.thePlayer.rotationYaw -= playerRecoilYaw + sustainedRecoilYaw*((peepee-20f)/80f) - playerRecoilYaw*((peepee-20f)/80f);
				
				//dill elevator
				if(poopoo>1 && peepee>40)
				minecraft.thePlayer.rotationPitch -= sustainedElevator;
				
				antiRecoilPitch += playerRecoilPitch + sustainedRecoilPitch*((peepee-20f)/80f) - playerRecoilPitch*((peepee-20f)/80f);
				antiRecoilYaw += playerRecoilYaw + sustainedRecoilYaw*((peepee-20f)/80f) - playerRecoilYaw*((peepee-20f)/80f);
			}

			
			
			
		

		

		minecraft.thePlayer.rotationPitch += antiRecoilPitch * 0.2F;
		minecraft.thePlayer.rotationYaw += antiRecoilYaw * 0.2F;
		antiRecoilPitch *= 0.8F;
		antiRecoilYaw *= 0.8F;
		
		
		//forced bobbing and clouds also ahem fuck f3b
		if(currentScope == null)
		{
		minecraft.gameSettings.viewBobbing=true;
		}
		minecraft.gameSettings.clouds=false;
		minecraft.gameSettings.particleSetting=0;
		RenderManager.debugBoundingBox=false;
		
		
	//	if (!minecraft.thePlayer.isRiding() &&  minecraft.thePlayer.getCurrentEquippedItem()==null )
	//		 FlansModClient.originalMouseSensitivity = FlansModClient.minecraft.gameSettings.mouseSensitivity;
		
		//emergency null check to prevent random crashes
		if (minecraft.thePlayer != null)
        if (minecraft.thePlayer.isRiding()) 
        {
        	
        	
     
            final ShaderGroup test = Minecraft.getMinecraft().entityRenderer.getShaderGroup();
          //more defense
            if (minecraft.thePlayer.ridingEntity != null)
            	if (minecraft.thePlayer.ridingEntity instanceof EntitySeat)
            	{
            
            final EntityDriveable ent = ((EntitySeat)minecraft.thePlayer.ridingEntity).driveable;          
            //for magic artillery projectile follow mode
            if (minecraft.thePlayer.ridingEntity instanceof EntitySeat)
            {
            	if(ent.artilleryMode)
            		FlansModClient.minecraft.gameSettings.thirdPersonView = 1;	
            }
            
            
            if (minecraft.thePlayer.ridingEntity instanceof EntitySeat) {
                if (ent.thermalScoping) {
                    if (!Minecraft.getMinecraft().entityRenderer.isShaderActive()) {
                        Minecraft.getMinecraft().entityRenderer.activateNextShader();
                        Minecraft.getMinecraft().entityRenderer.activateNextShader();
                        Minecraft.getMinecraft().entityRenderer.activateNextShader();
                        Minecraft.getMinecraft().entityRenderer.activateNextShader();
                        Minecraft.getMinecraft().entityRenderer.activateNextShader();
                        Minecraft.getMinecraft().entityRenderer.activateNextShader();
                    }
                    FlansModClient.minecraft.gameSettings.thirdPersonView = 0;
                    FlansModClient.minecraft.gameSettings.gammaSetting = 0.55f;
                }
                else {
                    Minecraft.getMinecraft().entityRenderer.deactivateShader();
                    FlansModClient.minecraft.gameSettings.gammaSetting = 0.4f;
                }
            }
            if (((EntitySeat)minecraft.thePlayer.ridingEntity).seatInfo.passengerZoom != 1.0f || ent.aiming) {
                FlansModClient.minecraft.gameSettings.thirdPersonView = 0;
           //     FlansModClient.minecraft.gameSettings.mouseSensitivity = 0.04f;
            }
            else {
            //    FlansModClient.minecraft.gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
            }
        }
        }
        
        
        else {
            Minecraft.getMinecraft().entityRenderer.deactivateShader();
            FlansModClient.minecraft.gameSettings.gammaSetting = 0.4f;
          //  FlansModClient.minecraft.gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
        }
        for (final GunAnimations g : FlansModClient.gunAnimationsRight.values()) {
            g.update();
        }
        for (final GunAnimations g : FlansModClient.gunAnimationsLeft.values()) {
            g.update();
        }
        for (final Object obj : minecraft.theWorld.playerEntities) {
            final EntityPlayer player = (EntityPlayer)obj;
            final ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
                if (player == minecraft.thePlayer && FlansModClient.minecraft.gameSettings.thirdPersonView == 0) {
                    player.clearItemInUse();
                }
                else {
                    if (currentItem.getItemUseAction() != EnumAction.bow && currentItem.getItemUseAction() != EnumAction.block) {
                        continue;
                    }
                    player.setItemInUse(currentItem, 100);
                }
            }
        }
        Item itemInHand = null;
        final ItemStack itemstackInHand = minecraft.thePlayer.inventory.getCurrentItem();
        if (itemstackInHand != null) {
            itemInHand = itemstackInHand.getItem();
        }
        if (FlansModClient.currentScope != null && (itemInHand == null || !(itemInHand instanceof ItemGun) || ((ItemGun)itemInHand).type.getCurrentScope(itemstackInHand) != FlansModClient.currentScope) ) {
            FlansModClient.currentScope = null;
            FlansModClient.minecraft.gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
            FlansModClient.minecraft.gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
            if (minecraft.thePlayer.inventory.armorInventory[3] == null) {
                FlansModClient.minecraft.gameSettings.fovSetting = 70.0f;
            }
        }
        FlansModClient.lastZoomProgress = FlansModClient.zoomProgress;
        if (FlansModClient.currentScope == null && FlansModClient.zoomProgress - FlansModClient.lastZoomProgress <= 0.01f) {
            FlansModClient.zoomProgress *= 0.66f;
        }
        else {
            FlansModClient.zoomProgress = 1.0f - (1.0f - FlansModClient.zoomProgress) * 0.66f;
            FlansModClient.minecraft.gameSettings.viewBobbing = false;
        }
        FlansModClient.lastStanceProgress = FlansModClient.stanceProgress;
        if (!FlansModClient.inPlane) {
            FlansModClient.stanceProgress *= 0.66f;
        }
        else {
            FlansModClient.stanceProgress = 1.0f - (1.0f - FlansModClient.stanceProgress) * 0.66f;
        }
        Label_1364: {
            if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
                FlansModClient.inPlane = true;
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.entityRenderer, (Object)((IControllable)minecraft.thePlayer.ridingEntity).getPlayerRoll(), new String[] { "camRoll", "R", "field_78495_O" });
                }
                catch (Exception e) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
                if (!(minecraft.thePlayer.ridingEntity instanceof IControllable)) {
                    break Label_1364;
                }
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.entityRenderer, (Object)((IControllable)minecraft.thePlayer.ridingEntity).getCameraDistance(), new String[] { "thirdPersonDistance", "E", "field_78490_B" });
                    break Label_1364;
                }
                catch (Exception e) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
            }
            if (FlansModClient.inPlane) {
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.entityRenderer, (Object)0.0f, new String[] { "camRoll", "R", "field_78495_O" });
                }
                catch (Exception e) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.entityRenderer, (Object)4.0f, new String[] { "thirdPersonDistance", "E", "field_78490_B" });
                }
                catch (Exception e) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
                FlansModClient.inPlane = false;
            }
        }
        if (FlansModClient.controlModeSwitchTimer > 0) {
            --FlansModClient.controlModeSwitchTimer;
        }
    }
    
    public static void renderTick(final float smoothing) {
        if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) > 1.0E-4f) {
            final float actualZoomProgress = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * smoothing;
            final float botchedZoomProgress = (FlansModClient.zoomProgress > 0.8f) ? 1.0f : 0.0f;
            double zoomLevel = botchedZoomProgress * FlansModClient.lastZoomLevel + (1.0f - botchedZoomProgress);
            final float FOVZoomLevel = FlansModClient.cringe = actualZoomProgress * FlansModClient.lastFOVZoomLevel + (1.0f - actualZoomProgress);
            if (Math.abs(zoomLevel - 1.0) < 0.009999999776482582) {
                zoomLevel = 1.0;
            }
            try {
                ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.entityRenderer, (Object)zoomLevel, new String[] { "cameraZoom", "af", "field_78503_V" });
                if ((2870.0f / FOVZoomLevel - 70.0f) / 40.0f < FlansModClient.pupperino) {
                    FlansModClient.minecraft.gameSettings.fovSetting = (2870.0f / FOVZoomLevel - 70.0f) / 40.0f;
                }
            }
            catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
        }
        if (minecraft.thePlayer != null && FlansModClient.cringe < 1.01) {
            final ItemStack stack = minecraft.thePlayer.inventory.armorInventory[3];
            if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                final ArmourType cringe = ((ItemTeamArmour)stack.getItem()).type;
                if (cringe.faceArmor / cringe.headArmor <= 0.1 || cringe.faceArmor == 1.0f || cringe.faceArmor == 0.0f) {
                    if (FlansModClient.minecraft.gameSettings.fovSetting > 100.0f) {
                        FlansModClient.minecraft.gameSettings.fovSetting = 110.0f;
                        FlansModClient.pupperino = 110.0f;
                    }
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.1 && cringe.faceArmor / cringe.headArmor <= 0.3) {
                    if (FlansModClient.minecraft.gameSettings.fovSetting > 95.0f) {
                        FlansModClient.minecraft.gameSettings.fovSetting = 95.0f;
                        FlansModClient.pupperino = 95.0f;
                    }
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.3 && cringe.faceArmor / cringe.headArmor <= 0.6) {
                    if (FlansModClient.minecraft.gameSettings.fovSetting > 80.0f) {
                        FlansModClient.minecraft.gameSettings.fovSetting = 80.0f;
                        FlansModClient.pupperino = 80.0f;
                    }
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.6 && cringe.faceArmor / cringe.headArmor <= 0.8) {
                    FlansModClient.minecraft.gameSettings.fovSetting = 65.0f;
                    FlansModClient.pupperino = 65.0f;
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.8 && cringe.faceArmor / cringe.headArmor <= 100.0f) {
                    FlansModClient.minecraft.gameSettings.fovSetting = 55.0f;
                    FlansModClient.pupperino = 55.0f;
                }
                else {
                    FlansModClient.pupperino = 70.0f;
                }
            }
        }
    }
    
    @SubscribeEvent
    public void chatMessage(final ClientChatReceivedEvent event) {
        if (event.message.getUnformattedText().equals("#flansmod")) {
            event.setCanceled(true);
        }
    }
    
    private boolean checkFileExists(final File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (Exception e) {
                FlansMod.log("Failed to create file");
                FlansMod.log(file.getAbsolutePath());
            }
            return false;
        }
        return true;
    }
    
    public static boolean flipControlMode() {
        if (FlansModClient.controlModeSwitchTimer > 0) {
            return false;
        }
        FlansModClient.controlModeMouse = !FlansModClient.controlModeMouse;
    	FMLClientHandler.instance().getClient().displayGuiScreen(controlModeMouse ? new GuiDriveableController((IControllable)FMLClientHandler.instance().getClient().thePlayer.ridingEntity) : null);
		FlansModClient.controlModeSwitchTimer = 40;
        return true;
    }
    
    public static void reloadModels(final boolean reloadSkins) {
        for (final InfoType type : InfoType.infoTypes) {
            type.reloadModel();
        }
        if (reloadSkins) {
            FlansModClient.proxy.forceReload();
        }
    }
    
    public static Team getTeam(final int spawnerTeamID) {
        if (FlansModClient.teamInfo == null) {
            return null;
        }
        return FlansModClient.teamInfo.getTeam(spawnerTeamID);
    }
    
    public static boolean isCurrentMap(final String map) {
        if (FlansModClient.teamInfo != null) {
            final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
            if (PacketTeamInfo.mapShortName != null) {
                final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
                if (PacketTeamInfo.mapShortName.equals(map)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public static EntityFX getParticle(final String s, final World w, final double x, final double y, final double z) {
        final Minecraft mc = Minecraft.getMinecraft();
        EntityFX fx = null;
        if (s.equals("hugeexplosion")) {
            fx = (EntityFX)new EntityHugeExplodeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("largeexplode")) {
            fx = (EntityFX)new EntityLargeExplodeFX(mc.renderEngine, w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("fireworksSpark")) {
            fx = (EntityFX)new EntityFireworkSparkFX(w, x, y, z, 0.0, 0.0, 0.0, mc.effectRenderer);
        }
        else if (s.equals("bubble")) {
            fx = (EntityFX)new EntityBubbleFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("suspended")) {
            fx = (EntityFX)new EntitySuspendFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("faggot")) {
            fx = (EntityFX)new EntityAfterburn(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("arabe")) {
            fx = (EntityFX)new EntitySmokeBurst(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("protoFlame")) {
            fx = (EntityFX)new EntityFMFlame(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("nuclear")) {
            fx = (EntityFX)new EntityFMNuke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("shippuDeath")) {
            fx = (EntityFX)new EntityshipDeath(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("tankkuDeath")) {
            fx = (EntityFX)new EntitytankDeath(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("waterSmoke")) {
            fx = (EntityFX)new EntityWaterSmoke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("waterSmokeMini")) {
            fx = (EntityFX)new EntityWaterSmokeMini(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smokeShell")) {
            fx = (EntityFX)new EntitySmokeShell(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smokeShellMustard")) {
            fx = (EntityFX)new EntitySmokeShellMustard(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smokeShellChlorine")) {
            fx = (EntityFX)new EntitySmokeShellChlorine(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smallSmoke")) {
            fx = (EntityFX)new EntitySmallSmoke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("casing")) {
            fx = (EntityFX)new EntityShellCasing(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("blood")) {
            fx = (EntityFX)new Entityblood(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("overkill")) {
            fx = (EntityFX)new EntityOverKill(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("depthsuspend")) {
            fx = (EntityFX)new EntityAuraFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("townaura")) {
            fx = (EntityFX)new EntityAuraFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("crit")) {
            fx = (EntityFX)new EntityCritFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("magicCrit")) {
            fx = (EntityFX)new EntityCritFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.setRBGColorF(fx.getRedColorF() * 0.3f, fx.getGreenColorF() * 0.8f, fx.getBlueColorF());
            fx.nextTextureIndexX();
        }
        else if (s.equals("smoke")) {
            fx = (EntityFX)new EntitySmokeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("mobSpell")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.setRBGColorF(0.0f, 0.0f, 0.0f);
        }
        else if (s.equals("mobSpellAmbient")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.setAlphaF(0.15f);
            fx.setRBGColorF(0.0f, 0.0f, 0.0f);
        }
        else if (s.equals("spell")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("instantSpell")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
            ((EntitySpellParticleFX)fx).setBaseSpellTextureIndex(144);
        }
        else if (s.equals("witchMagic")) {
            fx = (EntityFX)new EntitySmokeFX(w, x, y, z, 0.0, 0.0, 0.0);
            ((EntitySpellParticleFX)fx).setBaseSpellTextureIndex(144);
            final float f = w.rand.nextFloat() * 0.5f + 0.35f;
            fx.setRBGColorF(1.0f * f, 0.0f * f, 1.0f * f);
        }
        else if (s.equals("note")) {
            fx = (EntityFX)new EntityNoteFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("portal")) {
            fx = (EntityFX)new EntityPortalFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("enchantmenttable")) {
            fx = (EntityFX)new EntityEnchantmentTableParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("explode")) {
            fx = (EntityFX)new EntityExplodeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("flame")) {
            fx = (EntityFX)new EntityFlameFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("lava")) {
            fx = (EntityFX)new EntityLavaFX(w, x, y, z);
        }
        else if (s.equals("footstep")) {
            fx = (EntityFX)new EntityFootStepFX(mc.renderEngine, w, x, y, z);
        }
        else if (s.equals("splash")) {
            fx = (EntityFX)new EntitySplashFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("wake")) {
            fx = (EntityFX)new EntityFishWakeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("largesmoke")) {
            fx = (EntityFX)new EntitySmokeFX(w, x, y, z, 0.0, 0.0, 0.0, 2.5f);
        }
        else if (s.equals("cloud")) {
            fx = (EntityFX)new EntityCloudFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("reddust")) {
            fx = (EntityFX)new EntityReddustFX(w, x, y, z, 0.0f, 0.0f, 0.0f);
        }
        else if (s.equals("snowballpoof")) {
            fx = (EntityFX)new EntityBreakingFX(w, x, y, z, Items.snowball);
        }
        else if (s.equals("dripWater")) {
            fx = (EntityFX)new EntityDropParticleFX(w, x, y, z, Material.water);
        }
        else if (s.equals("dripLava")) {
            fx = (EntityFX)new EntityDropParticleFX(w, x, y, z, Material.lava);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("slime")) {
            fx = (EntityFX)new EntityBreakingFX(w, x, y, z, Items.slime_ball);
        }
        else if (s.equals("heart")) {
            fx = (EntityFX)new EntityHeartFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("angryVillager")) {
            fx = (EntityFX)new EntityHeartFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.setParticleTextureIndex(81);
            fx.setRBGColorF(1.0f, 1.0f, 1.0f);
        }
        else if (s.equals("happyVillager")) {
            fx = (EntityFX)new EntityAuraFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.setParticleTextureIndex(82);
            fx.setRBGColorF(1.0f, 1.0f, 1.0f);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.startsWith("iconcrack_")) {
            final String[] astring = s.split("_", 3);
            final int j = Integer.parseInt(astring[1]);
            if (astring.length > 2) {
                final int k = Integer.parseInt(astring[2]);
                fx = (EntityFX)new EntityBreakingFX(w, x, y, z, 0.0, 0.0, 0.0, Item.getItemById(j), k);
            }
            else {
                fx = (EntityFX)new EntityBreakingFX(w, x, y, z, 0.0, 0.0, 0.0, Item.getItemById(j), 0);
            }
        }
        else if (s.startsWith("blockcrack_")) {
            final String[] astring = s.split("_", 3);
            final Block block = Block.getBlockById(Integer.parseInt(astring[1]));
            final int k = Integer.parseInt(astring[2]);
            fx = (EntityFX)new EntityDiggingFX(w, x, y, z, 0.0, 0.0, 0.0, block, k).applyRenderColor(k);
        }
        else if (s.startsWith("blockdust_")) {
            final String[] astring = s.split("_", 3);
            final Block block = Block.getBlockById(Integer.parseInt(astring[1]));
            final int k = Integer.parseInt(astring[2]);
            fx = (EntityFX)new EntityBlockDustFX(w, x, y, z, 0.0, 0.0, 0.0, block, k).applyRenderColor(k);
        }
        if (mc.gameSettings.fancyGraphics) {
            fx.renderDistanceWeight = 200.0;
        }
        if (fx != null) {
            mc.effectRenderer.addEffect(fx);
        }
        return fx;
    }
    
    public static GunAnimations getGunAnimations(final EntityLivingBase living, final boolean offHand) {
        GunAnimations animations = null;
        if (offHand) {
            if (FlansModClient.gunAnimationsLeft.containsKey(living)) {
                animations = FlansModClient.gunAnimationsLeft.get(living);
            }
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsLeft.put(living, animations);
            }
        }
        else if (FlansModClient.gunAnimationsRight.containsKey(living)) {
            animations = FlansModClient.gunAnimationsRight.get(living);
        }
        else {
            animations = new GunAnimations();
            FlansModClient.gunAnimationsRight.put(living, animations);
        }
        return animations;
    }
    
    public static void setAimType(final AimType aimInputType) {
        final Property cw = FlansMod.configFile.get("Settings", "Aim Type", "toggle", "The type of aiming that you want to use 'toggle' or 'hold'");
        cw.set(aimInputType.toString());
        FlansMod.configFile.save();
        FlansModClient.aimType = aimInputType;
    }
    
    public static void setAimButton(final FlanMouseButton buttonInput) {
        final Property cw = FlansMod.configFile.get("Settings", "Aim Button", "left", "The mouse button used to aim a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        FlansModClient.aimButton = buttonInput;
    }
    
    public static void setFireButton(final FlanMouseButton buttonInput) {
        final Property cw = FlansMod.configFile.get("Settings", "Fire Button", "right", "The mouse button used to fire a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        FlansModClient.fireButton = buttonInput;
    }
    
    static {
        FlansModClient.doneTutorial = false;
        FlansModClient.controlModeMouse = true;
        FlansModClient.controlModeSwitchTimer = 20;
        FlansModClient.shotState = -1;
        FlansModClient.lastBulletReload = 0;
        FlansModClient.vehicleEngineRevs = 14539;
        FlansModClient.currentScope = null;
        FlansModClient.zoomProgress = 0.0f;
        FlansModClient.lastZoomProgress = 0.0f;
        FlansModClient.stanceProgress = 0.0f;
        FlansModClient.lastStanceProgress = 0.0f;
        FlansModClient.lastZoomLevel = 1.0f;
        FlansModClient.lastFOVZoomLevel = 1.0f;
        FlansModClient.cringe = 1.0f;
        FlansModClient.pupperino = 69.0f;
        FlansModClient.originalMouseSensitivity = 0.5f;
        FlansModClient.originalFOV = 70.0f;
        FlansModClient.originalThirdPerson = 0;
        FlansModClient.inPlane = false;
        FlansModClient.teamsScoreGUILock = 0;
        FlansModClient.minecraft = FMLClientHandler.instance().getClient();
    }
}