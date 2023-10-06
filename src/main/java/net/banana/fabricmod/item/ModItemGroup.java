package net.banana.fabricmod.item;

import net.banana.fabricmod.FabricMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup UNIONITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FabricMod.MOD_ID, "unionite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.unionite"))
                    .icon(() -> new ItemStack(ModItems.UNIONITE)).entries((displayContext, entries) -> {
                    entries.add(ModItems.UNIONITE);
                    entries.add(ModItems.UNIONITE_SCRAP);

                    }).build());

    public static void registerItemGroups(){
        FabricMod.LOGGER.info("Registering Item Groups For "+FabricMod.MOD_ID);
    }
}
