package com.example.examplemod.datagen;

import com.example.examplemod.CreateActualAmmunition;
import com.simibubi.create.api.registry.CreateRegistries;
import net.minecraft.core.RegistrySetBuilder;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Set;

public class ModDataGenerator {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(CreateRegistries.POTATO_PROJECTILE_TYPE, ModCreatePotatoProjectileTypes::bootstrap);

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        event.createDatapackRegistryObjects(BUILDER, Set.of(CreateActualAmmunition.MODID));
    }
}
