package net.darkz70.levreach.entrypoint;

//? if fabric {

import net.fabricmc.api.ClientModInitializer;

import net.darkz70.levreach.client.LeviathansReachClient;

public class ClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		LeviathansReachClient.onInitializeClient();
	}
}

//?} elif neoforge {
/*import net.darkz70.levreach.LeviathansReach;

import net.darkz70.levreach.client.LeviathansReachClient;
import net.darkz70.levreach.modmenu.ModMenuIntegration;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = LeviathansReach.MOD_ID, dist = Dist.CLIENT)
public class ClientEntrypoint {

	public ClientEntrypoint(ModContainer container) {
		LeviathansReachClient.onInitializeClient();
		ModMenuIntegration integration = new ModMenuIntegration();
		integration.register(container);
	}

}

*///?} elif forge {

/*import net.darkz70.levreach.client.LeviathansReachClient;
import net.darkz70.levreach.modmenu.ModMenuIntegration;
import net.minecraftforge.fml.ModLoadingContext;

public class ClientEntrypoint {

	public static void onInitializeClient() {
		LeviathansReachClient.onInitializeClient();
		ModMenuIntegration integration = new ModMenuIntegration();
		integration.register(ModLoadingContext.get().getActiveContainer());
	}

}

*///?}
