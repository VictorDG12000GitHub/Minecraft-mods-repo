package net.victordg12000.exchangellers.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables  extends BlockLootSubProvider {

    public ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate(){
        this.dropSelf(ModBlocks.EVERGREEN_BLOCK.get());
        this.dropSelf(ModBlocks.EVERGREEN_LIGHT.get());
        this.dropSelf(ModBlocks.EXCHANGALLER_ORE.get());
    }

    @Override protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
