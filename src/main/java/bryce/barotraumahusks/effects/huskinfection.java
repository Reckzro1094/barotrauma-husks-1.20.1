package bryce.barotraumahusks.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class huskinfection extends StatusEffect {

    protected huskinfection(StatusEffectCategory category, int color) {
        super(category, color);
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == Huskeffects.huskinfection) {
            if (entity.getHealth() < entity.getMaxHealth()) {
                entity.heal(0.75F);
            }
            if (entity.getAir() < entity.getMaxAir()) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,50, 1));
            }
            if (this == Huskeffects.huskinfection) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1));
            }
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == Huskeffects.huskinfection) {
            int i = 50 >> amplifier;
            return i == 0 || duration % i == 0;
        }

        return false;
    }
}
