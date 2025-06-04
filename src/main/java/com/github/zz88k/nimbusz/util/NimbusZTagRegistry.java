package com.github.zz88k.nimbusz.util;

import com.github.zz88k.nimbusz.NimbusZ;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class NimbusZTagRegistry
{
    public static class Blocks
    {
        public static TagKey<Block> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(NimbusZ.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(NimbusZ.MOD_ID, name));
        }
    }
}
