package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class NimbusZModelRegistry extends FabricModelProvider
{
    public NimbusZModelRegistry(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        BlockStateModelGenerator.BlockTexturePool firPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(NimbusZBlockRegistry.FIR_PLANKS);

        blockStateModelGenerator.registerLog(NimbusZBlockRegistry.FIR_LOG).log(NimbusZBlockRegistry.FIR_LOG).wood(NimbusZBlockRegistry.FIR_WOOD);
        blockStateModelGenerator.registerLog(NimbusZBlockRegistry.STRIPPED_FIR_LOG).log(NimbusZBlockRegistry.STRIPPED_FIR_LOG).wood(NimbusZBlockRegistry.STRIPPED_FIR_WOOD);
        firPlanksPool.stairs(NimbusZBlockRegistry.FIR_STAIRS);
        firPlanksPool.slab(NimbusZBlockRegistry.FIR_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(NimbusZBlockRegistry.FIR_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(NimbusZBlockRegistry.FIR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(NimbusZBlockRegistry.LIMESTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(NimbusZBlockRegistry.FIR_SAPLING.asItem(), Models.GENERATED);
    }
}
