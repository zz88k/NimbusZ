package com.github.zz88k.nimbusz.item;

import com.github.zz88k.nimbusz.NimbusZ;
import com.github.zz88k.nimbusz.block.NimbusZBlockRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class NimbusZItemGroupRegistry
{
    public static final ItemGroup NIMBUSZ_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NimbusZ.MOD_ID, "nimbusz_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(NimbusZBlockRegistry.LIMESTONE))
                    .displayName(Text.translatable("itemgroup.nimbusz.nimbusz_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(NimbusZBlockRegistry.LIMESTONE);
                    }).build());

    public static void registerNimbusZItemGroups()
    {
        NimbusZ.LOGGER.info("Registering Item Groups for " + NimbusZ.MOD_ID);
    }
}
