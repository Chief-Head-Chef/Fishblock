package com.Fishblock.init;

import com.Fishblock;
import com.Fishblock.items.*;
import com.Fishblock.materials.*;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit
{
    public static final DeferredRegister.Items ITEM_DEFERRED = DeferredRegister.createItems(fishblock.MOD_ID);
    public static final Collection<DeferredItem<Item>> ITEMS_FOR_TAB_LIST = new ArrayList<>();


    public static final DeferredItem<Item> IRON_FISHING_ROD = registerWithTab(p -> new testrod(ToolMaterial.IRON, p.durability(125)), "iron_fishing_rod");
    public static final DeferredItem<Item> GOLD_FISHING_ROD = registerWithTab(p -> new testrod(ToolMaterial.GOLD, p.durability(55)), "gold_fishing_rod");
    public static final DeferredItem<Item> DIAMOND_FISHING_ROD = registerWithTab(p -> new testrod(ToolMaterial.DIAMOND, p.durability(450)), "diamond_fishing_rod");


    public static DeferredItem<Item> register(Function<Item.Properties, ? extends Item> function, @Nonnull String name) {
        return ITEM_DEFERRED.registerItem(name, function);
    }

    public static DeferredItem<Item> registerWithTab(Function<Item.Properties, ? extends Item> function, @Nonnull String name) {
        DeferredItem<Item> registryObject = register(function, name);
        ITEMS_FOR_TAB_LIST.add(registryObject);
        return registryObject;
    }
}