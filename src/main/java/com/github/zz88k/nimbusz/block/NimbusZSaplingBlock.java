package com.github.zz88k.nimbusz.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
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
        return floor.isOf(this.blockToPlaceOn);
    }
}