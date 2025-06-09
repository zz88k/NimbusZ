package com.github.zz88k.nimbusz.world.gen;

import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class NimbusZTerraBlenderAPI implements TerraBlenderApi
{
    @Override
    public void onTerraBlenderInitialized()
    {
        Regions.register(new NimbusZRegionRegistry());
    }
}
