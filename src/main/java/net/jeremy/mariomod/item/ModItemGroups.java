package net.jeremy.mariomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jeremy.mariomod.Mariomod;
import net.jeremy.mariomod.block.ModBlocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Mariomod.MOD_ID, "banana"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.banana"))
                    .icon(() -> new ItemStack(ModItems.BANANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BANANA);

                        entries.add(ModBlocks.BANANA_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Mariomod.LOGGER.info("Registering Item Groups for " + Mariomod.MOD_ID);
    }
}