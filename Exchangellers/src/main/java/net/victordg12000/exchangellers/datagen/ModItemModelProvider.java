package net.victordg12000.exchangellers.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.victordg12000.exchangellers.Exchangellers;
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

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Exchangellers.MOD_ID,"item/" + item.getId().getPath()));
    }
}
