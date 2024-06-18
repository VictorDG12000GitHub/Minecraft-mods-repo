package net.victordg12000.exchangellers.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.block.ModBlocks;
import net.victordg12000.exchangellers.item.ModItems;

import java.util.Set;

public class ModBlockLootTables  extends BlockLootSubProvider {

    public ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate(){
        this.dropSelf(ModBlocks.EVERGREEN_BLOCK.get());
        this.dropSelf(ModBlocks.EVERGREEN_LIGHT.get());
        this.dropSelf(ModBlocks.EXCHANGALLER_BLOCK.get());
        this.dropSelf(ModBlocks.COANT_BLOCK.get());
        this.dropSelf(ModBlocks.COANT_STAIRS.get());

        this.add(ModBlocks.EXCHANGALLER_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.EXCHANGALLER_ORE.get(), ModItems.RAW_EXCHANGALLER.get()));
        this.add(ModBlocks.ARMORIAN_ORE.get(),
            block -> createCopperLikeOreDrops(ModBlocks.ARMORIAN_ORE.get(), ModItems.METAL_DETECTOR.get()));
        this.dropSelf(ModBlocks.EXCHANGALLER_STAIRS.get());
        this.dropSelf(ModBlocks.COANT_STAIRS.get());
        this.dropSelf(ModBlocks.COANT_BUTTON.get());
        this.dropSelf(ModBlocks.COANT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.COANT_TRAPDOOR.get());
        this.dropSelf(ModBlocks.COANT_FENCE.get());
        this.dropSelf(ModBlocks.COANT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COANT_WALL.get());

        this.add(ModBlocks.COANT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COANT_SLAB.get()));
        this.add(ModBlocks.COANT_DOOR.get(),
                block -> createDoorTable(ModBlocks.COANT_DOOR.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
