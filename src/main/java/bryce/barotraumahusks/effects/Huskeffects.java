package bryce.barotraumahusks.effects;

import bryce.barotraumahusks.BarotraumaHusks;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Huskeffects {
    public static bryce.barotraumahusks.effects.huskinfection huskinfection;

    public static bryce.barotraumahusks.effects.huskinfection registerhuskinfectionEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(BarotraumaHusks.MOD_ID, name),
            new huskinfection(StatusEffectCategory.HARMFUL, 1234567));
    }

    public static void registerEffects(){
        huskinfection = registerhuskinfectionEffect("huskinfection");
    }
}
