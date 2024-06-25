package bryce.barotraumahusks.item;

import bryce.barotraumahusks.BarotraumaHusks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class HuskItems {

    public static final Item CALYXEGGS = registerItem("calyxeggs", new Item(new FabricItemSettings().food(Huskfood.calyxeggs)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BarotraumaHusks.MOD_ID, name), item);
    }
    public static void registerHuskItems() {
        BarotraumaHusks.LOGGER.info("Registering Mod Items for " + BarotraumaHusks.MOD_ID);

    }

}
