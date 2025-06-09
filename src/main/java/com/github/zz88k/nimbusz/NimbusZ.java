package com.github.zz88k.nimbusz;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import com.github.zz88k.nimbusz.item.NimbusZItemGroupRegistry;
import com.github.zz88k.nimbusz.item.NimbusZItemRegistry;
import com.github.zz88k.nimbusz.world.gen.NimbusZWorldGenerator;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NimbusZ implements ModInitializer
{
	public static final String MOD_ID = "nimbusz";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		NimbusZItemRegistry.registerNimbusZItems();
		NimbusZBlockRegistry.registerNimbusZBlocks();
		NimbusZItemGroupRegistry.registerNimbusZItemGroups();

		NimbusZWorldGenerator.FIR_FOLIAGE_PLACER_TYPE.toString();

		StrippableBlockRegistry.register(NimbusZBlockRegistry.FIR_LOG, NimbusZBlockRegistry.STRIPPED_FIR_LOG);
		StrippableBlockRegistry.register(NimbusZBlockRegistry.FIR_WOOD, NimbusZBlockRegistry.STRIPPED_FIR_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.FIR_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.FIR_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.STRIPPED_FIR_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.STRIPPED_FIR_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.FIR_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.FIR_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.FIR_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(NimbusZBlockRegistry.FIR_LEAVES, 30, 60);
	}
}