package com.FishBlock;

import net.fabricmc.api.ModInitializer;
import com.Fishblock.init.*;

public class FishBlockMod implements ModInitializer {
	public static final String MOD_ID = "fishblock";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ItemInit.registerItems();
		BlockInit.registerBlocks();
        EntityInit.registerEntities();

	}

}
