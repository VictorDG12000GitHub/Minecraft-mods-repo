package net.victordg12000.exchangellers.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.victordg12000.exchangellers.Exchangellers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.item.custom.FuelItem;
import net.victordg12000.exchangellers.item.custom.MetalDetectorItem;
import net.victordg12000.exchangellers.item.custom.ModArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Exchangellers.MOD_ID);
    public static final RegistryObject<Item> EXCHANGALLER = ITEMS.register("exchangaller",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_EXCHANGALLER = ITEMS.register("raw_exchangaller",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXCHANGALLER_SUBSTANCE = ITEMS.register("exchangaller_substance",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EVERGREEN = ITEMS.register("evergreen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COANT = ITEMS.register("coant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPACTIFIER = ITEMS.register("compactifier",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> STRAND_OF_EVERGREEN = ITEMS.register("strand_of_evergreen",
            () -> new Item(new Item.Properties().food(ModFoods.STRAND_OF_EVERGREEN)));
    public static final RegistryObject<Item> COMPACTED_COAL = ITEMS.register("compacted_coal",
            () -> new FuelItem(new Item.Properties(), 4000));

    public static final RegistryObject<Item>  EVERGREEN_STAFF = ITEMS.register("evergreen_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item>  COANT_SWORD = ITEMS.register("coant_sword",
            () -> new SwordItem(ModToolTiers.COANT, 3, 5, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_PICKAXE = ITEMS.register("coant_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COANT, 3, 5, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_AXE = ITEMS.register("coant_axe",
            () -> new AxeItem(ModToolTiers.COANT, 7, 0.4f, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_SHOVEL = ITEMS.register("coant_shovel",
            () -> new ShovelItem(ModToolTiers.COANT, 1, 4, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_HOE = ITEMS.register("coant_hoe",
            () -> new HoeItem(ModToolTiers.COANT, 1, 7, new Item.Properties()));

    public static final RegistryObject<Item>  COANT_HELMET = ITEMS.register("coant_helmet",
            () -> new ModArmorItem(ModArmorMaterials.COANT,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_CHESTPLATE = ITEMS.register("coant_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.COANT,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_LEGGINGS = ITEMS.register("coant_leggings",
            () -> new ModArmorItem(ModArmorMaterials.COANT,ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>  COANT_BOOTS = ITEMS.register("coant_boots",
            () -> new ModArmorItem(ModArmorMaterials.COANT,ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
