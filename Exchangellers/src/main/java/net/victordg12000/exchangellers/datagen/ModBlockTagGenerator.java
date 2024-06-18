package net.victordg12000.exchangellers.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.block.ModBlocks;
import net.victordg12000.exchangellers.util.ModTags;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper){
        super(output, lookupProvider, Exchangellers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.EXCHANGALLER_ORE.get())
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.IRON_ORE)
                .add(ModBlocks.ARMORIAN_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.EXCHANGALLER_BLOCK.get())
                .add(ModBlocks.EXCHANGALLER_ORE.get())
                .add(ModBlocks.EVERGREEN_LIGHT.get())
                .add(ModBlocks.ARMORIAN_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.EXCHANGALLER_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.EXCHANGALLER_BLOCK.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ARMORIAN_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);


        this.tag(BlockTags.FENCES)
                .add(ModBlocks.COANT_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.COANT_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.COANT_WALL.get());

    }

}
