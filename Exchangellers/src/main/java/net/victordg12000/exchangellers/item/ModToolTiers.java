package net.victordg12000.exchangellers.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier COANT = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 7f, 3f, 25,
                        ModTags.Blocks.NEEDS_COANT_TOOL, () -> Ingredient.of(ModItems.COANT.get())),
            new ResourceLocation(Exchangellers.MOD_ID, "coant"), List.of(Tiers.IRON), List.of());

}
