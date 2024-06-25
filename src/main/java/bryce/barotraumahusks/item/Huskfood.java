package bryce.barotraumahusks.item;

import bryce.barotraumahusks.effects.Huskeffects;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Huskfood {
    public static final FoodComponent calyxeggs = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200), 0.3f).build();
}