package com.github.zz88k.nimbusz.world;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class NimbusZPlacedFeatureRegistry
{
    public static final RegistryKey<PlacedFeature> FIR = registerKey("fir");
    public static final RegistryKey<PlacedFeature> TREES_PAOZU_PLAINS = registerKey("trees_paozu_plains");
    public static final RegistryKey<PlacedFeature> TREES_PAOZU_FOREST = registerKey("trees_paozu_forest");

    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

       PlacementModifier placementModifier = SurfaceWaterDepthFilterPlacementModifier.of(0);

        register(context, FIR, configuredFeatures.getOrThrow(NimbusZConfiguredFeatureRegistry.FIR),
                PlacedFeatures.wouldSurvive(NimbusZBlockRegistry.FIR_SAPLING)
        );
        register(context, TREES_PAOZU_PLAINS, configuredFeatures.getOrThrow(NimbusZConfiguredFeatureRegistry.TREES_PAOZU_PLAINS),
                PlacedFeatures.createCountExtraModifier(0, 0.05F, 1),
                SquarePlacementModifier.of(),
                placementModifier,
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(NimbusZBlockRegistry.FIR_SAPLING.getDefaultState(), BlockPos.ORIGIN)),
                BiomePlacementModifier.of()
        );
        register(context, TREES_PAOZU_FOREST, configuredFeatures.getOrThrow(NimbusZConfiguredFeatureRegistry.TREES_PAOZU_FOREST),
                PlacedFeatures.createCountExtraModifier(10, 0.1F, 1),
                SquarePlacementModifier.of(),
                placementModifier,
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(NimbusZBlockRegistry.FIR_SAPLING.getDefaultState(), BlockPos.ORIGIN)),
                BiomePlacementModifier.of()
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(NimbusZ.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers)
    {
        register(context, key, configuration, List.of(modifiers));
    }
}
