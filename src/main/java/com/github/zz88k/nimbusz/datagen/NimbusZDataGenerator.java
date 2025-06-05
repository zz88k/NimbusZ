package com.github.zz88k.nimbusz.datagen;

import com.github.zz88k.nimbusz.world.NimbusZConfiguredFeatureRegistry;
import com.github.zz88k.nimbusz.world.NimbusZPlacedFeatureRegistry;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class NimbusZDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(NimbusZBlockTagRegistry::new);
		pack.addProvider(NimbusZItemTagRegistry::new);
		pack.addProvider(NimbusZLootTableRegistry::new);
		pack.addProvider(NimbusZModelRegistry::new);
		pack.addProvider(NimbusZRecipeRegistry::new);
		pack.addProvider(NimbusZRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder)
	{
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, NimbusZConfiguredFeatureRegistry::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, NimbusZPlacedFeatureRegistry::bootstrap);
	}
}
