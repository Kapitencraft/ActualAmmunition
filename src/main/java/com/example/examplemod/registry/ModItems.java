package com.example.examplemod.registry;

import com.example.examplemod.CreateActualAmmunition;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModItems {
    DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateActualAmmunition.MODID);

    DeferredItem<Item> POMEGRANATE = REGISTRY.registerItem("pomegranate", Item::new);
    DeferredItem<Item> EXPLOSIVE_POMEGRANATE = REGISTRY.registerItem("explosive_pomegranate", Item::new);

    DeferredItem<Item> COCONUT = REGISTRY.registerItem("coconut", Item::new);
    DeferredItem<Item> HEAVY_COCONUT = REGISTRY.registerItem("heavy_coconut", Item::new);

    DeferredItem<Item> CORN = REGISTRY.registerItem("corn", Item::new);
}
