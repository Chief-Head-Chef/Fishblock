package com.fishblock.item;

import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ToolMaterial;

public class ModFishingRodItem extends FishingRodItem {
    public ModFishingRodItem(ToolMaterial material, Settings settings) {
        super(settings.maxDamage(material.getDurability()));
    }
}