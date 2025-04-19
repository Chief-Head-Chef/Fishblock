package com.fishblock.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item WOOD_ROD = register("wood_rod", new ModFishingRodItem(RodMaterials.WOOD, new Item.Settings()));
    public static final Item STONE_ROD = register("stone_rod", new ModFishingRodItem(RodMaterials.STONE, new Item.Settings()));
    public static final Item IRON_ROD = register("iron_rod", new ModFishingRodItem(RodMaterials.IRON, new Item.Settings()));
    public static final Item GOLD_ROD = register("gold_rod", new ModFishingRodItem(RodMaterials.GOLD, new Item.Settings()));
    public static final Item DIAMOND_ROD = register("diamond_rod", new ModFishingRodItem(RodMaterials.DIAMOND, new Item.Settings()));
    public static final Item NETHERITE_ROD = register("netherite_rod", new ModFishingRodItem(RodMaterials.NETHERITE, new Item.Settings()));
    public static final Item ENDERIUM_ROD = register("enderium_rod", new ModFishingRodItem(RodMaterials.ENDERIUM, new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("fishblock", name), item);
    }

    public static void registerAll() {
        // Called during mod init
    }
}
