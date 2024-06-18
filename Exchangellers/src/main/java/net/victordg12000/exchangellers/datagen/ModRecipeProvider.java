package net.victordg12000.exchangellers.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.block.ModBlocks;
import net.victordg12000.exchangellers.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> EXCHANGELLER_SMELTABLES = List.of(ModItems.EXCHANGALLER_SUBSTANCE.get(),
            ModItems.RAW_EXCHANGALLER.get(),
            ModBlocks.EXCHANGALLER_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, EXCHANGELLER_SMELTABLES, RecipeCategory.MISC, ModItems.EXCHANGALLER.get(), 4.5f, 450, "exchangaller");
        oreBlasting(pWriter, EXCHANGELLER_SMELTABLES, RecipeCategory.MISC, ModItems.EXCHANGALLER.get(), 4.5f, 250, "exchangaller");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EVERGREEN_LIGHT.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('B', Blocks.BEACON)
                .define('#', ModItems.EXCHANGALLER.get())
                .unlockedBy(getHasName(ModItems.EXCHANGALLER.get()), has(Blocks.BEACON))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EVERGREEN.get(),1)
                .requires(ModBlocks.EVERGREEN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.EVERGREEN_BLOCK.get()), has(ModBlocks.EVERGREEN_BLOCK.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EVERGREEN_BLOCK.get(),1)
                .requires(ModItems.EVERGREEN.get())
                .unlockedBy(getHasName(ModItems.EVERGREEN.get()), has(ModItems.EVERGREEN.get()))
                .save(pWriter);


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  Exchangellers.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }






}

