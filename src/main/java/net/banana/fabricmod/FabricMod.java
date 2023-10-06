package net.banana.fabricmod;

import net.banana.fabricmod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.banana.fabricmod.item.ModItemGroup;
import net.banana.fabricmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricMod implements ModInitializer {
	public static final String MOD_ID = "fabricmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerBlocks();

	}
}