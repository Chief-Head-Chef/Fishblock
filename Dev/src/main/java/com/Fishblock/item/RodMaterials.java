package com.fishblock.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.item.Items;

public enum RodMaterials implements ToolMaterial {
    WOOD(59, 2.0F, 0.0F, 0, 15, Ingredient.ofItems(Items.STICK)),
    STONE(131, 4.0F, 1.0F, 1, 5, Ingredient.ofItems(Items.COBBLESTONE)),
    IRON(250, 6.0F, 2.0F, 2, 14, Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD(32, 12.0F, 0.0F, 0, 22, Ingredient.ofItems(Items.GOLD_INGOT)),
    DIAMOND(1561, 8.0F, 3.0F, 3, 10, Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE(2031, 9.0F, 4.0F, 4, 15, Ingredient.ofItems(Items.NETHERITE_INGOT)),
    ENDERIUM(2561, 10.0F, 5.0F, 4, 18, Ingredient.ofItems(Items.ENDER_PEARL)); 

    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int level;
    private final int enchantability;
    private final Ingredient repairIngredient;

    RodMaterials(int durability, float speed, float attackDamage, int level, int enchantability, Ingredient repair) {
        this.durability = durability;
        this.miningSpeed = speed;
        this.attackDamage = attackDamage;
        this.level = level;
        this.enchantability = enchantability;
        this.repairIngredient = repair;
    }

    @Override public int getDurability() { return durability; }
    @Override public float getMiningSpeedMultiplier() { return miningSpeed; }
    @Override public float getAttackDamage() { return attackDamage; }
    @Override public int getMiningLevel() { return level; }
    @Override public int getEnchantability() { return enchantability; }
    @Override public Ingredient getRepairIngredient() { return repairIngredient; }
}
