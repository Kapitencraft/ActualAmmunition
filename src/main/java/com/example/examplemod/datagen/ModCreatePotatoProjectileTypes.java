package com.example.examplemod.datagen;

import com.example.examplemod.CreateActualAmmunition;
import com.example.examplemod.registry.ModItems;
import com.simibubi.create.api.equipment.potatoCannon.PotatoCannonProjectileType;
import com.simibubi.create.api.registry.CreateRegistries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

public class ModCreatePotatoProjectileTypes {
    private static final ResourceKey<PotatoCannonProjectileType> POMEGRANATE = key("pomegranate");
    private static final ResourceKey<PotatoCannonProjectileType> EXPLOSIVE_POMEGRANATE = key("explosive_pomegranate");
    private static final ResourceKey<PotatoCannonProjectileType> COCONUT = key("coconut");
    private static final ResourceKey<PotatoCannonProjectileType> HEAVY_COCONUT = key("heavy_coconut");
    private static final ResourceKey<PotatoCannonProjectileType> CORN = key("corn");

    private static ResourceKey<PotatoCannonProjectileType> key(String name) {
        return ResourceKey.create(CreateRegistries.POTATO_PROJECTILE_TYPE, CreateActualAmmunition.res(name));
    }

    public static void bootstrap(BootstrapContext<PotatoCannonProjectileType> context) {
        context.register(POMEGRANATE, new PotatoCannonProjectileType.Builder()
                        .addItems(ModItems.POMEGRANATE)
                .build());
        context.register(EXPLOSIVE_POMEGRANATE, new PotatoCannonProjectileType.Builder()
                        .addItems(ModItems.EXPLOSIVE_POMEGRANATE)
                .build());
        context.register(COCONUT, new PotatoCannonProjectileType.Builder()
                        .addItems(ModItems.COCONUT)
                .build());
        context.register(HEAVY_COCONUT, new PotatoCannonProjectileType.Builder()
                        .addItems(ModItems.HEAVY_COCONUT)
                .build());
        context.register(CORN, new PotatoCannonProjectileType.Builder()
                .addItems(ModItems.CORN)
                .build());

    }
}
