package bryce.barotraumahusks.item;

import bryce.barotraumahusks.BarotraumaHusks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Huskitemsgroups {
    public static final ItemGroup HUSK_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(BarotraumaHusks.MOD_ID, "calyxeggs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.calyxeggs"))
                    .icon(() -> new ItemStack(HuskItems.CALYXEGGS)).entries((displayContext, entries) -> {

                        entries.add(HuskItems.CALYXEGGS);

                    }).build());
    public static void registerItemGroups() {
        BarotraumaHusks.LOGGER.info("Registering Item Groups For " +BarotraumaHusks.MOD_ID);
    }
}
