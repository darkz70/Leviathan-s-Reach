package net.darkz70.levreach.entrypoint;

//? if fabric {

import net.darkz70.levreach.LeviathansReach;

import net.fabricmc.api.ModInitializer;

public class CommonEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		LeviathansReach.onInitialize();
	}
}

//?} elif neoforge {
/*import net.darkz70.levreach.LeviathansReach;

import net.neoforged.fml.common.Mod;

@Mod(LeviathansReach.MOD_ID)
public class CommonEntrypoint {

	public CommonEntrypoint() {
		LeviathansReach.onInitialize();
	}

}

*///?} elif forge {
/*import net.darkz70.levreach.LeviathansReach;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(LeviathansReach.MOD_ID)
public class CommonEntrypoint {

	public CommonEntrypoint() {
		LeviathansReach.onInitialize();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> ClientEntrypoint::onInitializeClient);
	}

}

*///?}

