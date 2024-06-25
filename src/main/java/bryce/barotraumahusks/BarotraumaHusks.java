package bryce.barotraumahusks;

import bryce.barotraumahusks.effects.Huskeffects;
import bryce.barotraumahusks.item.HuskItems;
import bryce.barotraumahusks.item.Huskitemsgroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarotraumaHusks implements ModInitializer {
	public static final String MOD_ID = "barotrauma-husks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Huskitemsgroups.registerItemGroups();
		HuskItems.registerHuskItems();
		Huskeffects.registerEffects();
	}
}
