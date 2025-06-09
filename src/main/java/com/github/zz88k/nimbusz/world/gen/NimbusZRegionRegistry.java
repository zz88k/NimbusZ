package com.github.zz88k.nimbusz.world.gen;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.world.biome.NimbusZBiomeRegistry;
import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class NimbusZRegionRegistry extends Region
{
    public NimbusZRegionRegistry()
    {
        super(Identifier.of(NimbusZ.MOD_ID, "overworld"), RegionType.OVERWORLD, 2);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper)
    {
        mapper.accept(Pair.of(
                new MultiNoiseUtil.NoiseHypercube(
                        ParameterUtils.Temperature.WARM.parameter(),
                        ParameterUtils.Humidity.WET.parameter(),
                        ParameterUtils.Continentalness.MID_INLAND.parameter(),
                        ParameterUtils.Erosion.EROSION_1.parameter(),
                        ParameterUtils.Depth.SURFACE.parameter(),
                        ParameterUtils.Weirdness.LOW_SLICE_NORMAL_DESCENDING.parameter(),
                        0L
                ),
                NimbusZBiomeRegistry.PAOZU_PLAINS
        ));
    }
}
