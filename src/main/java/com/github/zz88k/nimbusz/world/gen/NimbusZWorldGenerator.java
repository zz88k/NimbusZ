package com.github.zz88k.nimbusz.world.gen;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.world.gen.FoliagePlacer.FirFoliagePlacer;
import com.mojang.serialization.MapCodec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class NimbusZWorldGenerator
{
    public static final FoliagePlacerType<FirFoliagePlacer> FIR_FOLIAGE_PLACER_TYPE = registerFoliagePlacer("fir_foliage_placer", FirFoliagePlacer.CODEC);

    public static void generateNimbusZWorld()
    {
        NimbusZVegetationGenerator.generateNimbusZVegetation();
    }

    private static <P extends FoliagePlacer> FoliagePlacerType<P> registerFoliagePlacer(String id, MapCodec<P> codec)
    {
        return (FoliagePlacerType) Registry.register(Registries.FOLIAGE_PLACER_TYPE, Identifier.of(NimbusZ.MOD_ID), new FoliagePlacerType(codec));
    }
}