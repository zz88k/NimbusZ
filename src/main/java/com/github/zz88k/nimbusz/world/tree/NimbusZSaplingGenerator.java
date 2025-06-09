package com.github.zz88k.nimbusz.world.tree;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.world.NimbusZConfiguredFeatureRegistry;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class NimbusZSaplingGenerator
{
    public static final SaplingGenerator FIR = new SaplingGenerator(NimbusZ.MOD_ID + ":fir",
            Optional.empty(), Optional.of(NimbusZConfiguredFeatureRegistry.FIR), Optional.empty());
}
