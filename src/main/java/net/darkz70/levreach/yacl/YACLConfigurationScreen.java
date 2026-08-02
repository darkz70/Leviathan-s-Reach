package net.darkz70.levreach.yacl;

import lombok.experimental.ExtensionMethod;
import net.darkz70.levreach.LeviathansReach;
import net.darkz70.figurestonelib.yacl.api.*;
import net.darkz70.figurestonelib.yacl.extension.SimpleOptionExtension;
import net.minecraft.client.gui.screens.Screen;

import net.darkz70.levreach.config.LeviathansReachConfig;

@ExtensionMethod(SimpleOptionExtension.class)
public class YACLConfigurationScreen {

	private YACLConfigurationScreen() {
		throw new IllegalStateException("Screen class");
	}

	public static Screen createScreen(Screen parent) {
		LeviathansReachConfig defConfig = LeviathansReachConfig.getNewInstance();
		LeviathansReachConfig config = LeviathansReachConfig.getInstance();

		return SimpleYACLScreen.startBuilder(LeviathansReach.MOD_ID, parent, config::saveAsync)
				.categories(getGeneralCategory(defConfig, config))
				.build();
	}

	private static SimpleCategory getGeneralCategory(LeviathansReachConfig defConfig, LeviathansReachConfig config) {
		return SimpleCategory.startBuilder("general")
				.groups(getMainGroup(defConfig, config));
	}

	private static SimpleGroup getMainGroup(LeviathansReachConfig defConfig, LeviathansReachConfig config) {
		return SimpleGroup.startBuilder("main").options(
				SimpleOption.<Boolean>startBuilder("mod_enabled")
						.withBinding(defConfig.isModEnabled(), config::isModEnabled, config::setModEnabled, true)
						.withController()
						.withDescription(SimpleContent.IMAGE)
		);
	}

}


