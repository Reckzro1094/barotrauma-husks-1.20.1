package bryce.barotraumahusks.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class HuskEntity extends HostileEntity {
    protected HuskEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
}
