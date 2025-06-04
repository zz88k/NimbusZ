package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class NimbusZModelRegistry extends FabricModelProvider
{
    public NimbusZModelRegistry(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(NimbusZBlockRegistry.LIMESTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        //itemModelGenerator.register(NimbusZItemRegistry.ITEM0, Models.GENERATED);
    }
}
