package net.victordg12000.exchangellers.item;

import net.victordg12000.exchangellers.Exchangellers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
