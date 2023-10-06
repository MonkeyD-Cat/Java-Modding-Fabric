package net.banana.fabricmod.block;

import net.banana.fabricmod.FabricMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block UNIONITE_BLOCK = registerBlock("unionite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(8f,800f)));

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(FabricMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FabricMod.MOD_ID, name), block);
    }
    public static void registerBlocks(){
        FabricMod.LOGGER.info("making them blocks for ze " + FabricMod.MOD_ID);
    }
}
