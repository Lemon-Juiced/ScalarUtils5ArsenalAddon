package lemon_juice.scalar_utils_arsenal_addon.item;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import lemon_juice.scalar_utils_arsenal_addon.item.umbralite_item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsArsenalAddon.MOD_ID);

    // Umbralite
    public static final RegistryObject<Item> UMBRALITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("umbralite_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    // Umbralite Vanilla Tools
    public static final RegistryObject<Item> UMBRALITE_SWORD = ITEMS.register("umbralite_sword", () -> new UmbraliteSwordItem(new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_SHOVEL = ITEMS.register("umbralite_shovel", () -> new UmbraliteShovelItem(new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_PICKAXE = ITEMS.register("umbralite_pickaxe", () -> new UmbralitePickaxeItem(new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_AXE = ITEMS.register("umbralite_axe", () -> new UmbraliteAxeItem(new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_HOE = ITEMS.register("umbralite_hoe", () -> new UmbraliteHoeItem(new Item.Properties()));
    // Umbralite Modded Tools
    public static final RegistryObject<Item> UMBRALITE_CLAYMORE = ITEMS.register("umbralite_claymore", () -> new UmbraliteClaymoreItem(new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_TUNNELER = ITEMS.register("umbralite_tunneler", () -> new UmbraliteTunnelerItem(new Item.Properties(), 5));
    // Umbralite Armor
    public static final RegistryObject<Item> UMBRALITE_HELMET = ITEMS.register("umbralite_helmet", () -> new UmbraliteArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_CHESTPLATE = ITEMS.register("umbralite_chestplate", () -> new UmbraliteArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_LEGGINGS = ITEMS.register("umbralite_leggings", () -> new UmbraliteArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> UMBRALITE_BOOTS = ITEMS.register("umbralite_boots", () -> new UmbraliteArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
