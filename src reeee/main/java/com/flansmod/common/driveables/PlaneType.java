/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PlaneType
extends DriveableType {
    public EnumPlaneMode mode = EnumPlaneMode.PLANE;
    public float lookDownModifier = 1.0f;
    public float lookUpModifier = 1.0f;
    public float rollLeftModifier = 1.0f;
    public float rollRightModifier = 1.0f;
    public float turnLeftModifier = 1.0f;
    public float turnRightModifier = 1.0f;
    public float lift = 1.0f;
    public Vector3f bombPosition;
    public int planeShootDelay;
    public int planeBombDelay;
    public Vector3f wingPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingWheelPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingWheelPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingWheelRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingWheelRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingWheelRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f wingWheelRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f bodyWheelPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f bodyWheelPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f bodyWheelRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f bodyWheelRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f bodyWheelRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f bodyWheelRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f tailWheelPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f tailWheelPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f tailWheelRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f tailWheelRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f tailWheelRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f tailWheelRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f doorPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f doorPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f doorRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f doorRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f doorRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f doorRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
    public ArrayList<Propeller> propellers = new ArrayList();
    public ArrayList<Propeller> heliPropellers = new ArrayList();
    public ArrayList<Propeller> heliTailPropellers = new ArrayList();
    public boolean hasGear = false;
    public boolean hasDoor = false;
    public boolean hasWing = false;
    public boolean foldWingForLand = false;
    public boolean flyWithOpenDoor = false;
    public float restingPitch = 0.0f;
    public boolean spinWithoutTail = false;
    public boolean valkyrie = false;
    public boolean invInflight = true;
    public static ArrayList<PlaneType> types = new ArrayList();

    public PlaneType(TypeFile file) {
        super(file);
        types.add(this);
    }

    @Override
    public void preRead(TypeFile file) {
        super.preRead(file);
    }

    @Override
    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        try {
            Propeller propeller;
            if (split[0].equals("Mode")) {
                this.mode = EnumPlaneMode.getMode(split[1]);
            }
            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LookUpSpeed")) {
                this.lookUpModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LookDownSpeed")) {
                this.lookDownModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RollLeftSpeed")) {
                this.rollLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RollRightSpeed")) {
                this.rollRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Lift")) {
                this.lift = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ShootDelay")) {
                this.planeShootDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("BombDelay")) {
                this.planeBombDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("Propeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.propellers.add(propeller);
                recipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HeliPropeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.heliPropellers.add(propeller);
                recipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HeliTailPropeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.heliTailPropellers.add(propeller);
                recipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HasFlare")) {
                this.hasFlare = split[1].equals("True");
            }
            if (split[0].equals("FlareDelay")) {
                this.flareDelay = Integer.parseInt(split[1]);
                if (this.flareDelay <= 0) {
                    this.flareDelay = 1;
                }
            }
            if (split[0].equals("TimeFlareUsing")) {
                this.timeFlareUsing = Integer.parseInt(split[1]);
                if (this.timeFlareUsing <= 0) {
                    this.timeFlareUsing = 1;
                }
            }
            if (split[0].equals("PropSoundLength")) {
                this.engineSoundLength = Integer.parseInt(split[1]);
            }
            if (split[0].equals("PropSound")) {
                this.engineSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("ShootSound")) {
                this.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("BombSound")) {
                this.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("HasGear")) {
                this.hasGear = split[1].equals("True");
            }
            if (split[0].equals("HasDoor")) {
                this.hasDoor = split[1].equals("True");
            }
            if (split[0].equals("HasWing")) {
                this.hasWing = split[1].equals("True");
            }
            if (split[0].equals("FoldWingForLand")) {
                this.foldWingForLand = split[1].equals("True");
            }
            if (split[0].equals("FlyWithOpenDoor")) {
                this.flyWithOpenDoor = split[1].equals("True");
            }
            if (split[0].equals("RestingPitch")) {
                this.restingPitch = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SpinWithoutTail")) {
                this.spinWithoutTail = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("Valkyrie")) {
                this.valkyrie = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("WingPosition1")) {
                this.wingPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingPosition2")) {
                this.wingPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRotation1")) {
                this.wingRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRotation2")) {
                this.wingRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRate")) {
                this.wingRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRotRate")) {
                this.wingRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelPosition1")) {
                this.wingWheelPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelPosition2")) {
                this.wingWheelPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRotation1")) {
                this.wingWheelRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRotation2")) {
                this.wingWheelRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRate")) {
                this.wingWheelRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRotRate")) {
                this.wingWheelRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelPosition1")) {
                this.bodyWheelPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelPosition2")) {
                this.bodyWheelPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRotation1")) {
                this.bodyWheelRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRotation2")) {
                this.bodyWheelRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRate")) {
                this.bodyWheelRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRotRate")) {
                this.bodyWheelRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelPosition1")) {
                this.tailWheelPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelPosition2")) {
                this.tailWheelPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRotation1")) {
                this.tailWheelRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRotation2")) {
                this.tailWheelRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRate")) {
                this.tailWheelRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRotRate")) {
                this.tailWheelRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorPosition1")) {
                this.doorPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorPosition2")) {
                this.doorPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRotation1")) {
                this.doorRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRotation2")) {
                this.doorRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRate")) {
                this.doorRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRotRate")) {
                this.doorRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("InflightInventory")) {
                this.invInflight = split[1].equals("False");
            }
        }
        catch (Exception propeller) {
            // empty catch block
        }
    }

    @Override
    public int numEngines() {
        switch (this.mode) {
            case VTOL: {
                return Math.max(this.propellers.size(), this.heliPropellers.size());
            }
            case PLANE: {
                return this.propellers.size();
            }
            case HELI: {
                return this.heliPropellers.size();
            }
        }
        return 1;
    }

    @Override
    public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine) {
        ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
        for (Propeller propeller : this.propellers) {
            if (propeller.planePart != part.type) continue;
            stacks.add(new ItemStack(propeller.itemType.item));
            stacks.add(new ItemStack(engine.item));
        }
        return stacks;
    }

    public static PlaneType getPlane(String find) {
        for (PlaneType type : types) {
            if (!type.shortName.equals(find)) continue;
            return type;
        }
        return null;
    }

    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelPlane.class);
    }

}

