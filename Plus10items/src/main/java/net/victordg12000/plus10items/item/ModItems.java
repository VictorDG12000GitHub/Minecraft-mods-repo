package net.victordg12000.plus10items.item;

import net.victordg12000.plus10items.Plus10items;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Plus10items.MOD_ID);
    public static final RegistryObject<Item> EDIBLE_GRASS = ITEMS.register("edible_grass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLYING_TOTEM = ITEMS.register("flying_totem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
