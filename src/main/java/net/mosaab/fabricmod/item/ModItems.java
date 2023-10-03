package net.mosaab.fabricmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mosaab.fabricmod.FabricMod;

public class ModItems {
    public static final Item UNIONITE = registerItem("unionite", new Item(new FabricItemSettings()));
    public static final Item UNIONITE_SCRAP = registerItem("unionite_scrap", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(UNIONITE);
        entries.add(UNIONITE_SCRAP);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FabricMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FabricMod.LOGGER.info("Registering Mod Items For " + FabricMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
