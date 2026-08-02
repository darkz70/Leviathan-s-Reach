package net.darkz70.levreach.client;

import net.darkz70.figurestonelib.logger.LeviathansReachLogger;

import net.darkz70.levreach.LeviathansReach;

public class LeviathansReachClient {

	public static LeviathansReachLogger LOGGER = LeviathansReach.LOGGER.extend("Client");

	public static void onInitializeClient() {
		LOGGER.info("{} Client Initialized", LeviathansReach.MOD_NAME);
	}
}
