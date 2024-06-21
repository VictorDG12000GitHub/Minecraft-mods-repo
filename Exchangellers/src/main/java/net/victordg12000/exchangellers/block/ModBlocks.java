package net.victordg12000.exchangellers.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.Exchangellers;
import net.victordg12000.exchangellers.block.custom.EvergreenSoundBlock;
import net.victordg12000.exchangellers.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Exchangellers.MOD_ID);

    public static final RegistryObject<Block> EVERGREEN_BLOCK = registerBlock("evergreen_block",
            () -> new EvergreenSoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> EVERGREEN_LIGHT = registerBlock("evergreen_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> EXCHANGALLER_BLOCK = registerBlock("exchangaller_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    public static final RegistryObject<Block> COANT_BLOCK = registerBlock("coant_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));

    //public static final RegistryObject<Block>  EVERGREEN_TABLE = registerBlock("evergreen_table",
    //        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> COANT_STAIRS = registerBlock("coant_stairs",
            () -> new StairBlock(()-> Blocks.COAL_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> EXCHANGALLER_STAIRS = registerBlock("exchangaller_stairs",
            () -> new StairBlock(()-> ModBlocks.EXCHANGALLER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.NETHER_GOLD_ORE)));



    public static final RegistryObject<Block> COANT_SLAB = registerBlock("coant_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> COANT_BUTTON = registerBlock("coant_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.CORAL_BLOCK),
                    BlockSetType.STONE,5,true));
    public static final RegistryObject<Block> COANT_PRESSURE_PLATE = registerBlock("coant_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)
                    .sound(SoundType.CORAL_BLOCK),BlockSetType.STONE));
    public static final RegistryObject<Block> COANT_FENCE = registerBlock("coant_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COANT_FENCE_GATE = registerBlock("coant_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> COANT_WALL = registerBlock("coant_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> COANT_DOOR = registerBlock("coant_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> COANT_TRAPDOOR = registerBlock("coant_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));



    public static final RegistryObject<Block> EXCHANGALLER_ORE = registerBlock("exchangaller_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(40,45)));

    public static final RegistryObject<Block> ARMORIAN_ORE = registerBlock("armorian_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHER_GOLD_ORE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(25,25)));



    public static <T extends  Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
