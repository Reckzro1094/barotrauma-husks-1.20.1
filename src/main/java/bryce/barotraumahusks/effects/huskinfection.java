package bryce.barotraumahusks.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;



public class huskinfection extends StatusEffect {

    protected huskinfection(StatusEffectCategory category, int color) {
        super(category, color);
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == Huskeffects.huskinfection) {
            if (entity.getHealth() < entity.getMaxHealth()) {
                entity.heal(0.75F);
            }
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == Huskeffects.huskinfection) {
            int i = 50 >> amplifier;
            return i <= 0 || duration % i == 0;
        }

        return false;
    }
}
