package com.github.zz88k.nimbusz.item;

import com.github.zz88k.nimbusz.NimbusZ;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NimbusZItemRegistry
{
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(NimbusZ.MOD_ID, name), item);
    }

    public static void registerNimbusZItems()
    {
        NimbusZ.LOGGER.info("Registry Mod Items for " + NimbusZ.MOD_ID);
    }
}
