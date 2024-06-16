package net.victordg12000.exchangellers.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAND_OF_EVERGREEN = new FoodProperties.Builder().nutrition(14)
            .saturationMod(4.0f).effect(() -> new MobEffectInstance(MobEffects.LUCK, 20000, 3), 0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2000, 0), 0.2f).build();
    public static final FoodProperties example = new FoodProperties.Builder().nutrition(-14)
            .saturationMod(4.0f).effect(() -> new MobEffectInstance(MobEffects.LUCK, 20000, 3), 0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2000, 0), 0.2f).build();
}
