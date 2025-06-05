package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import com.github.zz88k.nimbusz.util.NimbusZTagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class NimbusZItemTagRegistry extends FabricTagProvider.ItemTagProvider
{
    public NimbusZItemTagRegistry(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(NimbusZTagRegistry.Items.FIR_LOGS)
                .add(NimbusZBlockRegistry.FIR_LOG.asItem())
                .add(NimbusZBlockRegistry.FIR_WOOD.asItem())
                .add(NimbusZBlockRegistry.STRIPPED_FIR_LOG.asItem())
                .add(NimbusZBlockRegistry.STRIPPED_FIR_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(NimbusZBlockRegistry.FIR_LOG.asItem())
                .add(NimbusZBlockRegistry.FIR_WOOD.asItem())
                .add(NimbusZBlockRegistry.STRIPPED_FIR_LOG.asItem())
                .add(NimbusZBlockRegistry.STRIPPED_FIR_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(NimbusZBlockRegistry.FIR_PLANKS.asItem())
                .add(NimbusZBlockRegistry.FIR_STAIRS.asItem())
                .add(NimbusZBlockRegistry.FIR_SLAB.asItem());
    }
}
