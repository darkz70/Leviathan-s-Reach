package net.darkz70.levreach.config;

import lombok.*;
import net.darkz70.figurestonelib.loader.LeviathansReachLoader;
import net.darkz70.figurestonelib.utils.*;
import org.slf4j.*;

import com.mojang.serialization.*;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.darkz70.levreach.LeviathansReach;

import java.io.*;
import java.util.concurrent.CompletableFuture;

import static net.darkz70.figurestonelib.utils.CodecUtils.option;

@Getter
@Setter
@AllArgsConstructor
public class LeviathansReachConfig {

	public static final Codec<LeviathansReachConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
			option("mod_enabled", false, Codec.BOOL, LeviathansReachConfig::isModEnabled)
	).apply(instance, LeviathansReachConfig::new));

	private static final File CONFIG_FILE = LeviathansReachLoader.getConfigDir().resolve(LeviathansReach.MOD_ID + ".json5").toFile();
	private static final Logger LOGGER = LoggerFactory.getLogger(LeviathansReach.MOD_NAME + "/Config");
	private static LeviathansReachConfig INSTANCE;
	
	private boolean modEnabled;

	@SuppressWarnings("unused")
	private LeviathansReachConfig() {
		throw new IllegalArgumentException();
	}

	public static LeviathansReachConfig getInstance() {
		return INSTANCE == null ? reload() : INSTANCE;
	}

	public static LeviathansReachConfig reload() {
		return INSTANCE = LeviathansReachConfig.read();
	}

	public static LeviathansReachConfig getNewInstance() {
		return CodecUtils.parseNewInstanceHacky(CODEC);
	}

	private static LeviathansReachConfig read() {
		return ConfigUtils.readConfig(CODEC, CONFIG_FILE, LOGGER);
	}

	public void saveAsync() {
		CompletableFuture.runAsync(this::save);
	}

	public void save() {
		ConfigUtils.saveConfig(this, CODEC, CONFIG_FILE, LOGGER);
	}
}
