package net.victordg12000.exchangellers.modtabs;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.block.ModBlocks;
import net.victordg12000.exchangellers.item.ModItems;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Exchangellers.MOD_ID);
    public static final RegistryObject<CreativeModeTab> EXCHANGELLERS = CREATIVE_MODE_TABS.register("exchangellers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EXCHANGALLER.get()))
                .title(Component.translatable("creativetab.exchangellers_tab"))
                    .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModBlocks.EVERGREEN_BLOCK.get());
                    pOutput.accept(ModItems.EVERGREEN.get());
                    pOutput.accept(ModBlocks.EVERGREEN_LIGHT.get());
                    pOutput.accept(ModBlocks.EXCHANGALLER_ORE.get());
                    pOutput.accept(ModItems.RAW_EXCHANGALLER.get());
                    pOutput.accept(ModItems.EXCHANGALLER_SUBSTANCE.get());
                    pOutput.accept(ModItems.EXCHANGALLER.get());
                    pOutput.accept(ModItems.COMPACTIFIER.get());
                    pOutput.accept(ModItems.METAL_DETECTOR.get());
                    pOutput.accept(ModItems.STRAND_OF_EVERGREEN.get());
                    pOutput.accept(ModItems.COMPACTED_COAL.get());
                    pOutput.accept(ModBlocks.ARMORIAN_ORE.get());
                    pOutput.accept(ModBlocks.EXCHANGALLER_BLOCK.get());
                    pOutput.accept(ModBlocks.EXCHANGALLER_STAIRS.get());
                    pOutput.accept(ModBlocks.COANT_STAIRS.get());
                    pOutput.accept(ModBlocks.COANT_SLAB.get());
                    pOutput.accept(ModBlocks.COANT_BUTTON.get());
                    pOutput.accept(ModBlocks.COANT_PRESSURE_PLATE.get());
                    pOutput.accept(ModBlocks.COANT_FENCE.get());
                    pOutput.accept(ModBlocks.COANT_FENCE_GATE.get());
                    pOutput.accept(ModBlocks.COANT_WALL.get());
                    pOutput.accept(ModBlocks.COANT_DOOR.get());
                    pOutput.accept(ModBlocks.COANT_TRAPDOOR.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
