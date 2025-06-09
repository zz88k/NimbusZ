package com.github.zz88k.nimbusz.block;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.world.tree.NimbusZSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class NimbusZBlockRegistry
{
    public static final Block FIR_LOG = registerBlock("fir_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)
                .burnable()
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(MapColor.GRAY)
                .sounds(BlockSoundGroup.WOOD)
                .strength(2.0F, 2.0F)
            )
    );

    public static final Block FIR_WOOD = registerBlock("fir_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                .burnable()
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(MapColor.GRAY)
                .sounds(BlockSoundGroup.WOOD)
                .strength(2.0F, 2.0F)
            )
    );

    public static final Block STRIPPED_FIR_LOG = registerBlock("stripped_fir_log",
            new PillarBlock(AbstractBlock.Settings.create()
                .burnable()
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(MapColor.GRAY)
                .sounds(BlockSoundGroup.WOOD)
                .strength(2.0F, 2.0F)
            )
    );

    public static final Block STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                .burnable()
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(MapColor.GRAY)
                .sounds(BlockSoundGroup.WOOD)
                .strength(2.0F, 2.0F)
            )
    );

    public static final Block FIR_PLANKS = registerBlock("fir_planks",
            new Block(AbstractBlock.Settings.create()
                .burnable()
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(MapColor.BROWN)
                .sounds(BlockSoundGroup.WOOD)
                .strength(2.0F, 3.0F)
            )
    );

    public static final Block FIR_STAIRS = registerBlock("fir_stairs",
            new StairsBlock(FIR_PLANKS.getDefaultState(),
                AbstractBlock.Settings.copy(FIR_PLANKS)
            )
    );

    public static final Block FIR_SLAB = registerBlock("fir_slab",
            new SlabBlock(AbstractBlock.Settings.copy(FIR_PLANKS)
            )
    );

    public static final Block FIR_LEAVES = registerBlock("fir_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .blockVision(Blocks::never)
                    .burnable()
                    .mapColor(MapColor.DARK_GREEN)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.GRASS)
                    .strength(0.2F)
                    .suffocates(Blocks::never)
                    .ticksRandomly()
            )
    );

    public static final Block FIR_SAPLING = registerBlock("fir_sapling",
           new NimbusZSaplingBlock(NimbusZSaplingGenerator.FIR, AbstractBlock.Settings.create()
                   .breakInstantly()
                   .mapColor(MapColor.DARK_GREEN)
                   .noCollision()
                   .pistonBehavior(PistonBehavior.DESTROY)
                   .sounds(BlockSoundGroup.GRASS)
                   .ticksRandomly(),
                   Blocks.DIRT
           )
    );


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
