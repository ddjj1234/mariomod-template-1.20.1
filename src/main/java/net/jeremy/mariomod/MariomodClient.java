package net.jeremy.mariomod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.jeremy.mariomod.entity.ModEntities;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class MariomodClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BANANA_PROJECTILE, FlyingItemEntityRenderer::new);
    }
    
}
