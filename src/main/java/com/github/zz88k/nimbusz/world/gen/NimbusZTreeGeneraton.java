package com.github.zz88k.nimbusz.world.gen;

import com.github.zz88k.nimbusz.world.NimbusZPlacedFeatureRegistry;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class NimbusZTreeGeneraton
{
    public static void generateNimbusZTrees()
    {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, NimbusZPlacedFeatureRegistry.FIR_PLACED_KEY);
    }
}
