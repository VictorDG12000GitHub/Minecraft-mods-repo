package net.victordg12000.exchangellers.datagen;

import static org.openjdk.nashorn.internal.objects.NativeWeakSet.add;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.item.ModItems;
import net.victordg12000.exchangellers.loot.AddItemModifier;
import net.victordg12000.exchangellers.loot.AddSusSandItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Exchangellers.MOD_ID);
    }

    @Override
    protected void start() {
        add("strand_of_evergreen_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.004f).build()}, ModItems.STRAND_OF_EVERGREEN.get()));

        add("coant_from_evoker", new AddItemModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(new ResourceLocation("entities/evoker")).build(),
                        LootItemRandomChanceCondition.randomChance(0.20f).build()
                },
                ModItems.COANT.get()
        ));
        add("metal_detector_from_jungle_temples", new AddItemModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(new ResourceLocation("chests/jungle_temple")).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build()
                },
                ModItems.METAL_DETECTOR.get()
        ));

        add("metal_detector_from_suspicious_sand", new AddSusSandItemModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(new ResourceLocation("archaeology/desert_pyramid")).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build()
                },
                ModItems.METAL_DETECTOR.get()
        ));
    }




}

