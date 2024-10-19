package net.jeremy.mariomod;

import net.fabricmc.api.ModInitializer;

import net.jeremy.mariomod.block.ModBlocks;
import net.jeremy.mariomod.item.ModItemGroups;
import net.jeremy.mariomod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mariomod implements ModInitializer {
	public static final String MOD_ID = "mariomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}