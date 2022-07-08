package moze_intel.projecte.utils.text;

import moze_intel.projecte.PECore;
import net.minecraft.Util;

public enum PELang implements ILangEntry {
	//Vanilla
	UNKNOWN_ITEM("argument.item.id.invalid"),
	UNKNOWN_TAG("arguments.item.tag.unknown"),
	//Misc
	PROJECTE("misc", "mod_name"),
	SECONDS("misc", "seconds"),
	EVERY_TICK("misc", "seconds.every_tick"),
	HIGH_ALCHEMIST("misc", "high_alchemist_joined"),
	UPDATE_AVAILABLE("misc", "update.available"),
	UPDATE_GET_IT("misc", "update.get_it"),
	BLACKLIST("misc", "blacklist"),
	WHITELIST("misc", "whitelist"),
	DENSITY_MODE_TARGET("misc", "mode_switch"),
	//Command
	CLEAR_KNOWLEDGE_NOTIFY("command", "clear_knowledge.notify"),
	CLEAR_KNOWLEDGE_SUCCESS("command", "clear_knowledge.success"),
	DUMP_MISSING_EMC_NONE_MISSING("command", "dump_missing_emc.none_missing"),
	DUMP_MISSING_EMC_ONE_MISSING("command", "dump_missing_emc.one_missing"),
	DUMP_MISSING_EMC_MULTIPLE_MISSING("command", "dump_missing_emc.multiple_missing"),
	COMMAND_INVALID_ITEM("command", "emc.invalid_item"),
	COMMAND_NO_ITEM("command", "emc.no_item"),
	COMMAND_REMOVE_SUCCESS("command", "remove.success"),
	COMMAND_RESET_SUCCESS("command", "reset.success"),
	COMMAND_SET_SUCCESS("command", "set.success"),
	RELOAD_NOTICE("command", "reload.notice"),
	SHOWBAG_NOT_FOUND("command", "showbag.offline.notfound"),
	SHOWBAG_NAMED("command", "showbag.named"),
	//Diving Rod
	DIVINING_AVG_EMC("divining_rod", "avg_emc"),
	DIVINING_MAX_EMC("divining_rod", "max_emc"),
	DIVINING_SECOND_MAX("divining_rod", "second_max"),
	DIVINING_THIRD_MAX("divining_rod", "third_max"),
	DIVINING_RANGE_3("divining_rod", "range.3"),
	DIVINING_RANGE_16("divining_rod", "range.16"),
	DIVINING_RANGE_64("divining_rod", "range.64"),
	//EMC
	EMC("emc", "emc"),
	EMC_MAX_GEN_RATE("emc", "max_gen_rate"),
	EMC_MAX_OUTPUT_RATE("emc", "max_output_rate"),
	EMC_MAX_STORAGE("emc", "max_storage"),
	EMC_STORED("emc", "stored"),
	EMC_HAS_KNOWLEDGE("emc", "has_knowledge"),
	EMC_TOOLTIP("emc", "tooltip"),
	EMC_STACK_TOOLTIP("emc", "tooltip.stack"),
	EMC_TOOLTIP_WITH_SELL("emc", "tooltip.with_sell"),
	EMC_STACK_TOOLTIP_WITH_SELL("emc", "tooltip.stack.with_sell"),
	EMC_TOO_MUCH("emc", "too_much"),
	//JEI
	JEI_COLLECTOR("jei", "collector"),
	WORLD_TRANSMUTE("jei", "world_transmute"),
	WORLD_TRANSMUTE_DESCRIPTION("jei", "world_transmute.description"),
	//Curios
	CURIOS_KLEIN_STAR("curios.identifier.klein_star"),
	//Gem armor
	GEM_ENABLED("gem", "enabled"),
	GEM_DISABLED("gem", "disabled"),
	GEM_ACTIVATE("gem", "activate"),
	GEM_DEACTIVATE("gem", "deactivate"),
	NIGHT_VISION("gem", "night_vision"),
	NIGHT_VISION_PROMPT("gem", "night_vision.prompt"),
	STEP_ASSIST("gem", "step_assist"),
	STEP_ASSIST_PROMPT("gem", "step_assist.prompt"),
	GEM_LORE_FEET("gem", "lore.feet"),
	GEM_LORE_LEGS("gem", "lore.legs"),
	GEM_LORE_CHEST("gem", "lore.chest"),
	GEM_LORE_HELM("gem", "lore.helm"),
	//GUI
	GUI_DARK_MATTER_FURNACE("gui", "dark_matter_furnace.shortname"),
	GUI_RED_MATTER_FURNACE("gui", "red_matter_furnace.shortname"),
	GUI_RELAY_MK1("gui", "relay.mk1"),
	GUI_RELAY_MK2("gui", "relay.mk2"),
	GUI_RELAY_MK3("gui", "relay.mk3"),
	//Mode
	CURRENT_MODE("mode", "current"),
	INVALID_MODE("mode", "invalid"),
	MODE_SWITCH("mode", "switch"),
	MODE_ARCANA_1("mode", "arcana.1"),
	MODE_ARCANA_2("mode", "arcana.2"),
	MODE_ARCANA_3("mode", "arcana.3"),
	MODE_ARCANA_4("mode", "arcana.4"),
	MODE_KATAR_1("mode", "katar.1"),
	MODE_KATAR_2("mode", "katar.2"),
	MODE_MERCURIAL_EYE_1("mode", "mercurial_eye.1"),
	MODE_MERCURIAL_EYE_2("mode", "mercurial_eye.2"),
	MODE_MERCURIAL_EYE_3("mode", "mercurial_eye.3"),
	MODE_MERCURIAL_EYE_4("mode", "mercurial_eye.4"),
	MODE_MERCURIAL_EYE_5("mode", "mercurial_eye.5"),
	MODE_MERCURIAL_EYE_6("mode", "mercurial_eye.6"),
	MODE_MORNING_STAR_1("mode", "morning_star.1"),
	MODE_MORNING_STAR_2("mode", "morning_star.2"),
	MODE_MORNING_STAR_3("mode", "morning_star.3"),
	MODE_MORNING_STAR_4("mode", "morning_star.4"),
	MODE_PHILOSOPHER_1("mode", "philosopher.1"),
	MODE_PHILOSOPHER_2("mode", "philosopher.2"),
	MODE_PHILOSOPHER_3("mode", "philosopher.3"),
	MODE_PICK_1("mode", "pick.1"),
	MODE_PICK_2("mode", "pick.2"),
	MODE_PICK_3("mode", "pick.3"),
	MODE_PICK_4("mode", "pick.4"),
	MODE_RED_SWORD_1("mode", "red_sword.1"),
	MODE_RED_SWORD_2("mode", "red_sword.2"),
	//Pedestal
	PEDESTAL_DISABLED("pedestal", "item_disabled"),
	PEDESTAL_ON("pedestal", "on_pedestal"),
	PEDESTAL_TOOLTIP1("pedestal", "tooltip.1"),
	PEDESTAL_TOOLTIP2("pedestal", "tooltip.2"),
	PEDESTAL_ARCHANGEL_1("pedestal", "archangel.1"),
	PEDESTAL_ARCHANGEL_2("pedestal", "archangel.2"),
	PEDESTAL_BLACK_HOLE_BAND_1("pedestal", "black_hole_band.1"),
	PEDESTAL_BLACK_HOLE_BAND_2("pedestal", "black_hole_band.2"),
	PEDESTAL_BODY_STONE_1("pedestal", "body_stone.1"),
	PEDESTAL_BODY_STONE_2("pedestal", "body_stone.2"),
	PEDESTAL_EVERTIDE_1("pedestal", "evertide.1"),
	PEDESTAL_EVERTIDE_2("pedestal", "evertide.2"),
	PEDESTAL_HARVEST_GODDESS_1("pedestal", "harvest_goddess.1"),
	PEDESTAL_HARVEST_GODDESS_2("pedestal", "harvest_goddess.2"),
	PEDESTAL_HARVEST_GODDESS_3("pedestal", "harvest_goddess.3"),
	PEDESTAL_IGNITION_1("pedestal", "ignition.1"),
	PEDESTAL_IGNITION_2("pedestal", "ignition.2"),
	PEDESTAL_LIFE_STONE_1("pedestal", "life_stone.1"),
	PEDESTAL_LIFE_STONE_2("pedestal", "life_stone.2"),
	PEDESTAL_MIND_STONE("pedestal", "mind_stone"),
	PEDESTAL_REPAIR_TALISMAN_1("pedestal", "repair_talisman.1"),
	PEDESTAL_REPAIR_TALISMAN_2("pedestal", "repair_talisman.2"),
	PEDESTAL_SOUL_STONE_1("pedestal", "soul_stone.1"),
	PEDESTAL_SOUL_STONE_2("pedestal", "soul_stone.2"),
	PEDESTAL_SWRG_1("pedestal", "swrg.1"),
	PEDESTAL_SWRG_2("pedestal", "swrg.2"),
	PEDESTAL_TIME_WATCH_1("pedestal", "time_watch.1"),
	PEDESTAL_TIME_WATCH_2("pedestal", "time_watch.2"),
	PEDESTAL_VOLCANITE_1("pedestal", "volcanite.1"),
	PEDESTAL_VOLCANITE_2("pedestal", "volcanite.2"),
	PEDESTAL_ZERO_1("pedestal", "zero.1"),
	PEDESTAL_ZERO_2("pedestal", "zero.2"),
	PEDESTAL_ZERO_3("pedestal", "zero.3"),
	//Watch of flowing time
	TIME_WATCH_DISABLED("time_watch", "disabled"),
	TIME_WATCH_MODE("time_watch", "mode"),
	TIME_WATCH_MODE_SWITCH("time_watch", "mode_switch"),
	TIME_WATCH_OFF("time_watch", "off"),
	TIME_WATCH_FAST_FORWARD("time_watch", "fast_forward"),
	TIME_WATCH_REWIND("time_watch", "rewind"),
	//Tooltips
	TOOLTIP_ARCANA_INACTIVE("tooltip", "arcana.inactive"),
	TOOLTIP_EVERTIDE_1("tooltip", "evertide.1"),
	TOOLTIP_EVERTIDE_2("tooltip", "evertide.2"),
	TOOLTIP_EVERTIDE_3("tooltip", "evertide.3"),
	TOOLTIP_EVERTIDE_4("tooltip", "evertide.4"),
	TOOLTIP_GEM_DENSITY_1("tooltip", "gem_density.1"),
	TOOLTIP_GEM_DENSITY_2("tooltip", "gem_density.2"),
	TOOLTIP_GEM_DENSITY_3("tooltip", "gem_density.3"),
	TOOLTIP_GEM_DENSITY_4("tooltip", "gem_density.4"),
	TOOLTIP_GEM_DENSITY_5("tooltip", "gem_density.5"),
	TOOLTIP_PHILOSTONE("tooltip", "philostone"),
	TOOLTIP_STORED_XP("tooltip", "stored_xp"),
	TOOLTIP_TIME_WATCH_1("tooltip", "time_watch.1"),
	TOOLTIP_TIME_WATCH_2("tooltip", "time_watch.2"),
	TOOLTIP_TOME("tooltip", "tome"),
	TOOLTIP_VOLCANITE_1("tooltip", "volcanite.1"),
	TOOLTIP_VOLCANITE_2("tooltip", "volcanite.2"),
	TOOLTIP_VOLCANITE_3("tooltip", "volcanite.3"),
	TOOLTIP_VOLCANITE_4("tooltip", "volcanite.4"),
	//Transmutation GUI
	TRANSMUTATION_TRANSMUTE("transmutation", "transmute"),
	TRANSMUTATION_LEARNED_1("transmutation", "learned.1"),
	TRANSMUTATION_LEARNED_2("transmutation", "learned.2"),
	TRANSMUTATION_LEARNED_3("transmutation", "learned.3"),
	TRANSMUTATION_LEARNED_4("transmutation", "learned.4"),
	TRANSMUTATION_LEARNED_5("transmutation", "learned.5"),
	TRANSMUTATION_LEARNED_6("transmutation", "learned.6"),
	TRANSMUTATION_LEARNED_7("transmutation", "learned.7"),
	TRANSMUTATION_LEARNED_8("transmutation", "learned.8"),
	TRANSMUTATION_UNLEARNED_1("transmutation", "unlearned.1"),
	TRANSMUTATION_UNLEARNED_2("transmutation", "unlearned.2"),
	TRANSMUTATION_UNLEARNED_3("transmutation", "unlearned.3"),
	TRANSMUTATION_UNLEARNED_4("transmutation", "unlearned.4"),
	TRANSMUTATION_UNLEARNED_5("transmutation", "unlearned.5"),
	TRANSMUTATION_UNLEARNED_6("transmutation", "unlearned.6"),
	TRANSMUTATION_UNLEARNED_7("transmutation", "unlearned.7"),
	TRANSMUTATION_UNLEARNED_8("transmutation", "unlearned.8"),
	TRANSMUTATION_UNLEARNED_9("transmutation", "unlearned.9"),
	//Advancements
	ADVANCEMENTS_PROJECTE_DESCRIPTION("advancements", "description"),
	ADVANCEMENTS_PHILO_STONE("advancements", "philo_stone"),
	ADVANCEMENTS_PHILO_STONE_DESCRIPTION("advancements", "philo_stone.description"),
	ADVANCEMENTS_TRANSMUTATION_TABLE("advancements", "transmutation_table"),
	ADVANCEMENTS_TRANSMUTATION_TABLE_DESCRIPTION("advancements", "transmutation_table.description"),
	ADVANCEMENTS_TRANSMUTATION_TABLET("advancements", "transmutation_tablet"),
	ADVANCEMENTS_TRANSMUTATION_TABLET_DESCRIPTION("advancements", "transmutation_tablet.description"),
	ADVANCEMENTS_KLEIN_STAR("advancements", "klein_star"),
	ADVANCEMENTS_KLEIN_STAR_DESCRIPTION("advancements", "klein_star.description"),
	ADVANCEMENTS_KLEIN_STAR_BIG("advancements", "klein_star_big"),
	ADVANCEMENTS_KLEIN_STAR_BIG_DESCRIPTION("advancements", "klein_star_big.description"),
	ADVANCEMENTS_ALCH_CHEST("advancements", "alch_chest"),
	ADVANCEMENTS_ALCH_CHEST_DESCRIPTION("advancements", "alch_chest.description"),
	ADVANCEMENTS_ALCH_BAG("advancements", "alch_bag"),
	ADVANCEMENTS_ALCH_BAG_DESCRIPTION("advancements", "alch_bag.description"),
	ADVANCEMENTS_CONDENSER("advancements", "condenser"),
	ADVANCEMENTS_CONDENSER_DESCRIPTION("advancements", "condenser.description"),
	ADVANCEMENTS_COLLECTOR("advancements", "collector"),
	ADVANCEMENTS_COLLECTOR_DESCRIPTION("advancements", "collector.description"),
	ADVANCEMENTS_RELAY("advancements", "relay"),
	ADVANCEMENTS_RELAY_DESCRIPTION("advancements", "relay.description"),
	ADVANCEMENTS_DARK_MATTER("advancements", "dark_matter"),
	ADVANCEMENTS_DARK_MATTER_DESCRIPTION("advancements", "dark_matter.description"),
	ADVANCEMENTS_DARK_MATTER_PICKAXE("advancements", "dark_matter_pickaxe"),
	ADVANCEMENTS_DARK_MATTER_PICKAXE_DESCRIPTION("advancements", "dark_matter_pickaxe.description"),
	ADVANCEMENTS_DARK_MATTER_BLOCK("advancements", "dark_matter_block"),
	ADVANCEMENTS_DARK_MATTER_BLOCK_DESCRIPTION("advancements", "dark_matter_block.description"),
	ADVANCEMENTS_DARK_MATTER_FURNACE("advancements", "dark_matter_furnace"),
	ADVANCEMENTS_DARK_MATTER_FURNACE_DESCRIPTION("advancements", "dark_matter_furnace.description"),
	ADVANCEMENTS_RED_MATTER("advancements", "red_matter"),
	ADVANCEMENTS_RED_MATTER_DESCRIPTION("advancements", "red_matter.description"),
	ADVANCEMENTS_RED_MATTER_PICKAXE("advancements", "red_matter_pickaxe"),
	ADVANCEMENTS_RED_MATTER_PICKAXE_DESCRIPTION("advancements", "red_matter_pickaxe.description"),
	ADVANCEMENTS_RED_MATTER_BLOCK("advancements", "red_matter_block"),
	ADVANCEMENTS_RED_MATTER_BLOCK_DESCRIPTION("advancements", "red_matter_block.description"),
	ADVANCEMENTS_RED_MATTER_FURNACE("advancements", "red_matter_furnace"),
	ADVANCEMENTS_RED_MATTER_FURNACE_DESCRIPTION("advancements", "red_matter_furnace.description"),
	;

	private final String key;

	PELang(String type, String path) {
		this(Util.makeDescriptionId(type, PECore.rl(path)));
	}

	PELang(String key) {
		this.key = key;
	}

	@Override
	public String getTranslationKey() {
		return key;
	}
}