package com.github.zz88k.nimbusz.client;

import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class NimbusZClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(NimbusZBlockRegistry.FIR_LEAVES, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(NimbusZBlockRegistry.FIR_SAPLING, RenderLayer.getCutout());
    }
}
