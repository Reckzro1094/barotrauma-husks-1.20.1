package bryce.barotraumahusks.effects;

import bryce.barotraumahusks.BarotraumaHusks;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Huskeffects {
    public static bryce.barotraumahusks.effects.huskinfection huskinfection;
    public static bryce.barotraumahusks.effects.husksymbiosis husksymbiosis;

    public static bryce.barotraumahusks.effects.huskinfection registerhuskinfectionEffect(String name){
        return (bryce.barotraumahusks.effects.huskinfection) Registry.register(Registries.STATUS_EFFECT, new Identifier(BarotraumaHusks.MOD_ID, name),
            new huskinfection(StatusEffectCategory.HARMFUL, 1234567)
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3f, EntityAttributeModifier.Operation.ADDITION
                    )
        );
    }

    public static bryce.barotraumahusks.effects.husksymbiosis registerhusksymbiosisEffect(String name){
        return (bryce.barotraumahusks.effects.husksymbiosis) Registry.register(Registries.STATUS_EFFECT, new Identifier(BarotraumaHusks.MOD_ID, name),
                new husksymbiosis(StatusEffectCategory.BENEFICIAL, 1234567)
                        .addAttributeModifier(
                                EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.025f, EntityAttributeModifier.Operation.ADDITION
                        )
                        .addAttributeModifier(
                                EntityAttributes.GENERIC_ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3f, EntityAttributeModifier.Operation.ADDITION
                        )
        );
    }

    public static void registerEffects(){
        huskinfection = registerhuskinfectionEffect("huskinfection");
        husksymbiosis = registerhusksymbiosisEffect("husksymbiosis");
    }

}
