package net.victordg12000.exchangellers.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.victordg12000.exchangellers.Exchangellers;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_COANT_TOOL = tag("needs_coant_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Exchangellers.MOD_ID, name));
        }

    }

    public static class Items{
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Exchangellers.MOD_ID, name));
        }
    }
}
