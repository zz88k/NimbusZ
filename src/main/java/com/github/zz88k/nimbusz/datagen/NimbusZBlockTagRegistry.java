package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import com.github.zz88k.nimbusz.util.NimbusZTagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class NimbusZBlockTagRegistry extends FabricTagProvider.BlockTagProvider
{
    public NimbusZBlockTagRegistry(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(NimbusZBlockRegistry.LIMESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(NimbusZBlockRegistry.LIMESTONE);

        getOrCreateTagBuilder(NimbusZTagRegistry.Blocks.FIR_LOGS)
                .add(NimbusZBlockRegistry.FIR_LOG)
                .add(NimbusZBlockRegistry.FIR_WOOD)
                .add(NimbusZBlockRegistry.STRIPPED_FIR_LOG)
                .add(NimbusZBlockRegistry.STRIPPED_FIR_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(NimbusZBlockRegistry.FIR_LOG)
                .add(NimbusZBlockRegistry.FIR_WOOD)
                .add(NimbusZBlockRegistry.STRIPPED_FIR_LOG)
                .add(NimbusZBlockRegistry.STRIPPED_FIR_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(NimbusZBlockRegistry.FIR_PLANKS)
                .add(NimbusZBlockRegistry.FIR_STAIRS)
                .add(NimbusZBlockRegistry.FIR_SLAB);
    }
}
