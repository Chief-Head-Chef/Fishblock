package com.FishBlock;

import net.fabricmc.api.ClientModInitializer;

public class FishBlockModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		System.out.println("FishBlock Client loaded");
	}
}