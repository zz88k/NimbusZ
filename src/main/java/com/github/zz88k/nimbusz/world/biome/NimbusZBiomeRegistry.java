package com.github.zz88k.nimbusz.world.biome;

import com.github.zz88k.nimbusz.NimbusZ;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;

public class NimbusZBiomeRegistry
{
    public static final RegistryKey<Biome> PAOZU_PLAINS = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(NimbusZ.MOD_ID, "paozu_plains")
    );
    public static final RegistryKey<Biome> PAOZU_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(NimbusZ.MOD_ID, "paozu_forest")
    );
}
