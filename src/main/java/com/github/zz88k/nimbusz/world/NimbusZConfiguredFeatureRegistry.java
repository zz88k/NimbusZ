package com.github.zz88k.nimbusz.world;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import com.github.zz88k.nimbusz.world.gen.FoliagePlacer.FirFoliagePlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class NimbusZConfiguredFeatureRegistry
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIR_KEY = registerKey("fir");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        register(context, FIR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(NimbusZBlockRegistry.FIR_LOG),
                        new StraightTrunkPlacer(10, 1, 2),

                        BlockStateProvider.of(NimbusZBlockRegistry.FIR_LEAVES),
                        new FirFoliagePlacer(
                                UniformIntProvider.create(2, 2),
                                UniformIntProvider.create(2, 3),
                                UniformIntProvider.create(3, 12)
                        ),
                        new TwoLayersFeatureSize(1, 0, 1)
                ).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build()
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(NimbusZ.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature,
                                                                                          FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
