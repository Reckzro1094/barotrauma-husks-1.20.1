package bryce.barotraumahusks.effects;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;




public class husksymbiosis extends StatusEffect {


    protected husksymbiosis(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        boolean showParticles = false;
        boolean ambient = false;
        applyUpdateEffect(entity, amplifier, ambient ,showParticles);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier, boolean showParticles , boolean ambient) {
        if (this == Huskeffects.husksymbiosis) {

            if (entity.getHealth() < entity.getMaxHealth()) {
                entity.heal(2f);
            }
            if (entity.getAir() < entity.getMaxAir()) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,60,0, ambient, showParticles));
            }


            entity.removeStatusEffect(StatusEffects.POISON);
            

            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 80, 0, ambient, showParticles));
        }
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == Huskeffects.husksymbiosis) {
            int i = 50 >> amplifier;
            return i == 0 || duration % i == 0;
        }

        return false;
    }
}