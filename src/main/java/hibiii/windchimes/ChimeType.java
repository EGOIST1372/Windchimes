package hibiii.windchimes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ChimeType {

	public final SoundEvent loudSound;
	public final SoundEvent quietSound;
	public final Identifier textureId;
	
	public ChimeType(SoundEvent loud, SoundEvent quiet, Identifier texture) {
		this.loudSound = loud;
		this.quietSound = quiet;
		this.textureId = texture;
	}

	public static final ChimeType IRON;
	public static final ChimeType BAMBOO;
	public static final ChimeType COPPER;
	public static final ChimeType INVALID;
	
	public static FabricBlockSettings settingsWith(Material in) {
		return FabricBlockSettings.of(in)
			.strength(0)
			.nonOpaque()
			.breakInstantly()
			.resistance(0)
			.noCollision();
	}
	
	public static final Identifier IRON_LOUD_SOUND_ID, IRON_QUIET_SOUND_ID, BAMBOO_LOUD_SOUND_ID, BAMBOO_QUIET_SOUND_ID, COPPER_LOUD_SOUND_ID, COPPER_QUIET_SOUND_ID;
	public static final SoundEvent IRON_LOUD_SOUND, IRON_QUIET_SOUND, BAMBOO_LOUD_SOUND, BAMBOO_QUIET_SOUND, COPPER_LOUD_SOUND, COPPER_QUIET_SOUND;
	
	static {
		IRON_LOUD_SOUND_ID = new Identifier("windchimes:chime.iron.loud");
		IRON_QUIET_SOUND_ID = new Identifier("windchimes:chime.iron.quiet");
		BAMBOO_LOUD_SOUND_ID = new Identifier("windchimes:chime.bamboo.loud");
		BAMBOO_QUIET_SOUND_ID = new Identifier("windchimes:chime.bamboo.quiet");
		COPPER_LOUD_SOUND_ID = new Identifier("windchimes:chime.copper.loud");
		COPPER_QUIET_SOUND_ID = new Identifier("windchimes:chime.copper.quiet");
		
		IRON_LOUD_SOUND = SoundEvent.of(IRON_LOUD_SOUND_ID);
		IRON_QUIET_SOUND = SoundEvent.of(IRON_QUIET_SOUND_ID);
		BAMBOO_LOUD_SOUND = SoundEvent.of(BAMBOO_LOUD_SOUND_ID);
		BAMBOO_QUIET_SOUND = SoundEvent.of(BAMBOO_QUIET_SOUND_ID);
		COPPER_LOUD_SOUND = SoundEvent.of(COPPER_LOUD_SOUND_ID);
		COPPER_QUIET_SOUND = SoundEvent.of(COPPER_QUIET_SOUND_ID);


		IRON = new ChimeType(
			IRON_LOUD_SOUND, IRON_QUIET_SOUND,
			new Identifier("windchimes:textures/iron_chime.png"));
		BAMBOO = new ChimeType(
			BAMBOO_LOUD_SOUND, BAMBOO_QUIET_SOUND,
			new Identifier("windchimes:textures/bamboo_chime.png"));
		COPPER = new ChimeType(
			COPPER_LOUD_SOUND, COPPER_QUIET_SOUND,
			new Identifier("windchimes:textures/copper_chime.png"));
		INVALID = new ChimeType(
			SoundEvents.ENTITY_PIG_AMBIENT,
			SoundEvents.ENTITY_PIG_HURT,
			new Identifier("textures/block/red_concrete.png"));
	}
}
