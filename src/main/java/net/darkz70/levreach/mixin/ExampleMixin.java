package net.darkz70.levreach.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.darkz70.levreach.client.LeviathansReachClient;

@Mixin(TitleScreen.class)
public class ExampleMixin {

	@Inject(at = @At("HEAD"), method = "init")
	private void init(CallbackInfo info) {
		LeviathansReachClient.LOGGER.info("Hello from LeviathansReach Mixins!");
	}
}