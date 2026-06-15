package com.example.examplemod.registry;

import com.example.examplemod.CreateActualAmmunition;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateActualAmmunition.MODID);

    DeferredItem<Item> POMEGRANATE = REGISTRY.registerItem("pomegranate", Item::new);
}
