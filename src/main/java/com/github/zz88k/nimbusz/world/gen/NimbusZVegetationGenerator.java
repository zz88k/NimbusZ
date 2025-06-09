package com.github.zz88k.nimbusz.world.gen;

import com.github.zz88k.nimbusz.world.NimbusZPlacedFeatureRegistry;
import com.github.zz88k.nimbusz.world.biome.NimbusZBiomeRegistry;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class NimbusZVegetationGenerator
{
    public static void generateNimbusZVegetation()
    {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(NimbusZBiomeRegistry.PAOZU_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, NimbusZPlacedFeatureRegistry.FIR_PLACED_KEY
        );
    }
}
