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
        addDrop(NimbusZBlockRegistry.FIR_LOG);
        addDrop(NimbusZBlockRegistry.FIR_WOOD);
        addDrop(NimbusZBlockRegistry.STRIPPED_FIR_LOG);
        addDrop(NimbusZBlockRegistry.STRIPPED_FIR_WOOD);
        addDrop(NimbusZBlockRegistry.FIR_PLANKS);
        addDrop(NimbusZBlockRegistry.FIR_STAIRS);
        addDrop(NimbusZBlockRegistry.FIR_SLAB);
        addDrop(NimbusZBlockRegistry.FIR_LEAVES, leavesDrops(NimbusZBlockRegistry.FIR_LEAVES, NimbusZBlockRegistry.FIR_SAPLING, 0.0625f));
        addDrop(NimbusZBlockRegistry.FIR_SAPLING);

        addDrop(NimbusZBlockRegistry.LIMESTONE);
    }
}
