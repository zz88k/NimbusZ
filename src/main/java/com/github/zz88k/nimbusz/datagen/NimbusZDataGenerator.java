package com.github.zz88k.nimbusz.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

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
	}
}
