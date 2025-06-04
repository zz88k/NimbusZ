package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class NimbusZLootTableRegistry extends FabricBlockLootTableProvider
{
    protected NimbusZLootTableRegistry(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        addDrop(NimbusZBlockRegistry.LIMESTONE);
    }
}
