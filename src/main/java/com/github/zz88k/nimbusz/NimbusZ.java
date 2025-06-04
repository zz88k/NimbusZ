package com.github.zz88k.nimbusz;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import com.github.zz88k.nimbusz.item.NimbusZItemGroupRegistry;
import com.github.zz88k.nimbusz.item.NimbusZItemRegistry;
import net.fabricmc.api.ModInitializer;

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
	}
}