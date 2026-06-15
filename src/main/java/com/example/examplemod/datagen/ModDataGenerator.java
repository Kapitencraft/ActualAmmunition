package com.example.examplemod.datagen;

import com.example.examplemod.CreateActualAmmunition;
import com.simibubi.create.api.registry.CreateRegistries;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Set;

@EventBusSubscriber
public class ModDataGenerator {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(CreateRegistries.POTATO_PROJECTILE_TYPE, ModCreatePotatoProjectileTypes::bootstrap);

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        event.createDatapackRegistryObjects(BUILDER, Set.of(CreateActualAmmunition.MODID));
        event.addProvider(new ModItemModelProvider(output, existingFileHelper));
    }
}
