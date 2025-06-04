package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
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
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(NimbusZBlockRegistry.LIMESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(NimbusZBlockRegistry.LIMESTONE);
    }
}
