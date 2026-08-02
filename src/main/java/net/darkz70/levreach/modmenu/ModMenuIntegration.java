package net.darkz70.levreach.modmenu;

import net.darkz70.levreach.yacl.YACLConfigurationScreen;
import net.darkz70.figurestonelib.LeviathansReachLib;
import net.darkz70.figurestonelib.modmenu.AbstractModMenuIntegration;
import net.minecraft.client.gui.screens.Screen;

public class ModMenuIntegration extends AbstractModMenuIntegration {

	@Override
	protected String getModId() {
		return LeviathansReachLib.MOD_ID;
	}

	@Override
	protected Screen createConfigScreen(Screen screen) {
		return YACLConfigurationScreen.createScreen(screen);
	}
}
