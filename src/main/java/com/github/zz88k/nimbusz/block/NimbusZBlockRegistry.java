package com.github.zz88k.nimbusz.block;

import com.github.zz88k.nimbusz.NimbusZ;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class NimbusZBlockRegistry
{
    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.PALE_YELLOW)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                    .strength(1.4F, 3.0F)
            )
    );

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NimbusZ.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(NimbusZ.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerNimbusZBlocks()
    {
        NimbusZ.LOGGER.info("Registry Mod Blocks for " + NimbusZ.MOD_ID);
    }
}
