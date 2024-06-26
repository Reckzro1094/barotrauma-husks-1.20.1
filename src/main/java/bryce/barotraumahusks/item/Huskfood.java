package bryce.barotraumahusks.item;


import bryce.barotraumahusks.effects.Huskeffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class Huskfood {
    public static final FoodComponent calyxeggs = new FoodComponent.Builder().hunger(3).saturationModifier(1)
            .statusEffect(new StatusEffectInstance(Huskeffects.huskinfection, 48000), 0.7f).build();


}