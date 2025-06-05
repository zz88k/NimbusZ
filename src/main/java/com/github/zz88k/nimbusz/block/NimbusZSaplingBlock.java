package com.github.zz88k.nimbusz.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class NimbusZSaplingBlock extends SaplingBlock
{
    private final Block blockToPlaceOn;

    public NimbusZSaplingBlock(SaplingGenerator generator, Settings settings, Block block)
    {
        super(generator, settings);
        this.blockToPlaceOn = block;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos)
    {
        return floor.isOf(Blocks.DIRT)
                || floor.isOf(Blocks.GRASS_BLOCK)
                || floor.isOf(Blocks.COARSE_DIRT)
                || floor.isOf(Blocks.PODZOL)
                || floor.isOf(Blocks.FARMLAND);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        System.out.println("Trying to place FIR_SAPLING at " + context.getBlockPos());
        return super.getPlacementState(context);
    }

}