package com.FishBlock;

import net.fabricmc.api.ModInitializer;
import com.FishBlock.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;  
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.ItemGroups;   

public class FishBlockMod implements ModInitializer {
	public static final String MOD_ID = "fishblock";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerAll(); 
		ItemGroupEvents
		.modifyEntriesEvent(ItemGroups.TOOLS)
		.register(entries -> entries.add(ModItems.WOOD_ROD));
		LOGGER.info("Hello Fabric world!");
	}

}
