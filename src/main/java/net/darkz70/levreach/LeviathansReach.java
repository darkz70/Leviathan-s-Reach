package net.darkz70.levreach;

import net.darkz70.figurestonelib.logger.LeviathansReachLogger;
import net.minecraft.network.chat.*;
import net.minecraft.resources.Identifier;

public class LeviathansReach {

	public static final String MOD_NAME = /*$ mod_name*/ "LeviathansReach";
	public static final String MOD_ID = /*$ mod_id*/ "levreach";

	public static LeviathansReachLogger LOGGER = new LeviathansReachLogger(LeviathansReach.MOD_NAME);

	public static Identifier id(String path) {
		//? if >=1.21 {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
		//?} else {
		/*return Identifier.tryBuild(MOD_ID, path);
		 *///?}
	}

	public static Identifier parseId(String path) {
		//? if >=1.21 {
		return Identifier.parse(path);
		//?} else {
		/*return new Identifier(path);
		 *///?}
	}

	public static MutableComponent text(String path, Object... args) {
		return Component.translatable(String.format("%s.%s", MOD_ID, path), args);
	}

	public static void onInitialize() {
		LOGGER.info("{} Initialized", MOD_NAME);
	}
}