package main.java.com.Fishblock.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.levelgen.Heightmap;

import java.util.function.Supplier;

@EventBusSubscriber(modid = fishblock.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class entity {
    public static final DeferredRegister<EntityType<?>> ENTITY_DEFERRED = DeferredRegister.create(Registries.ENTITY_TYPE, fishblock.MOD_ID);
    public static final DeferredHolder<EntityType<?>, EntityType<fishingbobber>> BOBBER = register("bobber", () -> EntityType.Builder.<fishingbobber>of(fishingbobber::new, MobCategory.MISC)
            .noSave()
            .noSummon()
            .sized(0.25F, 0.25F)
            .setTrackingRange(4)
            .setUpdateInterval(5));


    public static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String name, Supplier<EntityType.Builder<T>> builder) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(fishblock.MOD_ID, name);
        return ENTITY_DEFERRED.register(name, () -> builder.get().build(ResourceKey.create(Registries.ENTITY_TYPE, location)));
    }
}