package com.FishBlock.item;

import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    // ---- item declarations ----
    public static final Item WOOD_ROD = register(
            "wood_rod",
            settings -> new FishingRodItem(settings.maxDamage(59))
    );

    // template for future rods:
    // public static final Item STONE_ROD = register("stone_rod",
    //        settings -> new ModFishingRodItem(RodMaterials.STONE, settings));

    // ---- helper ----
    private static Item register(String path, java.util.function.Function<Item.Settings, Item> factory) {
        Identifier id          = Identifier.of("fishblock", path);
        RegistryKey<Item> key  = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settings = new Item.Settings().registryKey(key);
        Item item              = factory.apply(settings);

        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerAll() { /* load‑side effect only */ }
}
