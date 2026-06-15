package com.example.examplemod.datagen;

import com.example.examplemod.CreateActualAmmunition;
import com.example.examplemod.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import javax.annotation.Nullable;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateActualAmmunition.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.POMEGRANATE);
    }

    private ItemModelBuilder simpleItem(DeferredItem<? extends Item> item) {
        return generatedItem(item, null);
    }

    private ItemModelBuilder generatedItem(DeferredItem<? extends Item> item, @Nullable ResourceLocation texture) {
        return parentItem(item, mcLoc("item/generated"), texture);
    }

    private ItemModelBuilder handHeldItem(DeferredItem<? extends Item> item, @Nullable ResourceLocation texture) {
        return parentItem(item, mcLoc("item/handheld"), texture);
    }

    private ItemModelBuilder parentItem(DeferredItem<? extends Item> item, ResourceLocation parent, @Nullable ResourceLocation texture) {
        return withExistingParent(item.getId().getPath(),
                parent).texture("layer0",
                (texture == null ? item.getId().withPrefix("item/") : texture));
    }
}
