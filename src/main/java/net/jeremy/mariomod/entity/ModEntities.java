package net.jeremy.mariomod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.jeremy.mariomod.Mariomod;
import net.jeremy.mariomod.entity.custom.BananaProjectileEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BananaProjectileEntity> BANANA_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Mariomod.MOD_ID, "banana_projectile"),
            FabricEntityTypeBuilder.<BananaProjectileEntity>create(SpawnGroup.MISC, BananaProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
}