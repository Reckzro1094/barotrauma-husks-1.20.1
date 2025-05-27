package bryce.barotraumahusks.effects;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;



public class huskinfection extends StatusEffect {

    protected huskinfection(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        boolean showParticles = false;
        boolean ambient = false;
        applyUpdateEffect(entity, amplifier, ambient ,showParticles);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier, boolean showParticles , boolean ambient) {
        if (this == Huskeffects.huskinfection) {
            if (entity.getHealth() < entity.getMaxHealth()) {
                entity.heal(0.75F);
            }
            if (entity.getAir() < entity.getMaxAir()) {
                entity.setAir(entity.getAir() + 1);
            }

            int duration = getEffectDuration(entity) / 20;

            if (!entity.getWorld().isClient()) {
                ServerWorld serverWorld = (ServerWorld) entity.getWorld();
                if (duration == 1) {

                    var newEntity = EntityType.ZOMBIE.create(serverWorld);
                    if (newEntity != null) {
                        newEntity.refreshPositionAndAngles(entity.getX(), entity.getY(), entity.getZ(), entity.getYaw(), entity.getPitch());
                        serverWorld.spawnEntity(newEntity);
                    }
                    entity.kill();
                }
            }



            if (entity.hasStatusEffect(Huskeffects.husksymbiosis)) {
                entity.removeStatusEffect(Huskeffects.huskinfection);
            }

            System.out.println("ZombieCurse tick - duration: " + duration + " | alive: " + entity.isAlive());

        }
    }




    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == Huskeffects.huskinfection) {
            int i = 50 >> amplifier;
            return i == 0 || duration % i == 0;
        }

        return false;
    }

    private int getEffectDuration(LivingEntity entity) {
        StatusEffectInstance instance = entity.getStatusEffect(this);
        if (instance != null) {
            return instance.getDuration();
        }
        return -1; // Not present or expired
    }

    }

