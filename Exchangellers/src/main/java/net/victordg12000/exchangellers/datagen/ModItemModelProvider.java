package net.victordg12000.exchangellers.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.block.ModBlocks;
import net.victordg12000.exchangellers.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider{

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Exchangellers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.COMPACTIFIER);
        simpleItem(ModItems.COMPACTED_COAL);
        simpleItem(ModItems.EVERGREEN);
        simpleItem(ModItems.EXCHANGALLER);
        simpleItem(ModItems.EXCHANGALLER_SUBSTANCE);
        simpleItem(ModItems.RAW_EXCHANGALLER);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.STRAND_OF_EVERGREEN);
        simpleItem(ModItems.COANT);
        simpleItem(ModItems.COANT_SWORD);
        simpleItem(ModItems.COANT_PICKAXE);
        simpleItem(ModItems.COANT_AXE);
        simpleItem(ModItems.COANT_SHOVEL);
        simpleItem(ModItems.COANT_HOE);
        simpleItem(ModItems.COANT_HELMET);
        simpleItem(ModItems.COANT_CHESTPLATE);
        simpleItem(ModItems.COANT_LEGGINGS);
        simpleItem(ModItems.COANT_BOOTS);



        simpleBlockItem(ModBlocks.COANT_DOOR);

        fenceItem(ModBlocks.COANT_FENCE, ModBlocks.COANT_BLOCK);
        buttonItem(ModBlocks.COANT_BUTTON, ModBlocks.COANT_BLOCK);
        wallItem(ModBlocks.COANT_WALL, ModBlocks.COANT_BLOCK);

        evenSimplerBlockItem(ModBlocks.EXCHANGALLER_STAIRS);
        evenSimplerBlockItem(ModBlocks.COANT_STAIRS);
        evenSimplerBlockItem(ModBlocks.COANT_SLAB);
        evenSimplerBlockItem(ModBlocks.COANT_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.COANT_FENCE_GATE);

        trapdoorItem(ModBlocks.COANT_TRAPDOOR);


    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Exchangellers.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Exchangellers.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Exchangellers.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Exchangellers.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Exchangellers.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Exchangellers.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
