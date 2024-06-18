package net.victordg12000.exchangellers.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, Exchangellers.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.EVERGREEN_BLOCK);
        blockWithItem(ModBlocks.EVERGREEN_LIGHT);
        blockWithItem(ModBlocks.EXCHANGALLER_ORE);
        blockWithItem(ModBlocks.ARMORIAN_ORE);
        blockWithItem(ModBlocks.EXCHANGALLER_BLOCK);
        blockWithItem(ModBlocks.COANT_BLOCK);

        stairsBlock((StairBlock) ModBlocks.EXCHANGALLER_STAIRS.get(), blockTexture((ModBlocks.EXCHANGALLER_BLOCK.get())));
        stairsBlock((StairBlock) ModBlocks.COANT_STAIRS.get(), blockTexture(ModBlocks.COANT_BLOCK.get()));

        slabBlock(((SlabBlock) ModBlocks.COANT_SLAB.get()), blockTexture(ModBlocks.COANT_BLOCK.get()), blockTexture(ModBlocks.COANT_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.COANT_BUTTON.get()), blockTexture(ModBlocks.COANT_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.COANT_PRESSURE_PLATE.get()), blockTexture(ModBlocks.COANT_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.COANT_FENCE.get()), blockTexture(ModBlocks.COANT_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.COANT_FENCE_GATE.get()), blockTexture(ModBlocks.COANT_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.COANT_WALL.get()), blockTexture(ModBlocks.COANT_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.COANT_DOOR.get()), modLoc("block/coant_door_bottom"), modLoc("block/coant_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.COANT_TRAPDOOR.get()), modLoc("block/coant_trapdoor"), true, "cutout");


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
