package net.jeremy.mariomod.entity.custom;

import net.jeremy.mariomod.block.ModBlocks;
import net.jeremy.mariomod.entity.ModEntities;
import net.jeremy.mariomod.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class BananaProjectileEntity extends ThrownItemEntity {
    public BananaProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public BananaProjectileEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.BANANA_PROJECTILE, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.BANANA;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient()){
            this.getWorld().sendEntityStatus(this, (byte)3);
            this.getWorld().setBlockState(getBlockPos(), ModBlocks.BANANA_BLOCK.getDefaultState(), 3);
        }

        this.discard();
        super.onBlockHit(blockHitResult);
    }
}