package lemon_juice.scalar_utils_arsenal_addon.item;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import lemon_juice.scalar_utils_arsenal_addon.item.custom.blutstein_item.*;
import lemon_juice.scalar_utils_arsenal_addon.item.custom.umbralite_item.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsArsenalAddon.MOD_ID);

    // Blutstein (Leeching)
    public static final RegistryObject<Item> BLUTSTEIN_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("blutstein_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    // Blutstein Vanilla Tools
    public static final RegistryObject<Item> BLUTSTEIN_SWORD = ITEMS.register("blutstein_sword", () -> new BlutsteinSwordItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUTSTEIN_SHOVEL = ITEMS.register("blutstein_shovel", () -> new BlutsteinShovelItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUTSTEIN_PICKAXE = ITEMS.register("blutstein_pickaxe", () -> new BlutsteinPickaxeItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUTSTEIN_AXE = ITEMS.register("blutstein_axe", () -> new BlutsteinAxeItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUTSTEIN_HOE = ITEMS.register("blutstein_hoe", () -> new BlutsteinHoeItem(new Item.Properties()));
    // Blutstein Modded Tools
    public static final RegistryObject<Item> BLUTSTEIN_CLAYMORE = ITEMS.register("blutstein_claymore", () -> new BlutsteinClaymoreItem(new Item.Properties()));
    public static final RegistryObject<Item> BLUTSTEIN_TUNNELER = ITEMS.register("blutstein_tunneler", () -> new BlutsteinTunnelerItem(new Item.Properties(), 3));
    // Blutstein Armor

    // Umbralite (Best Overall)
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

    // Zweiite (Qualities of Gold, Durability of Iron, Strength of Diamond) - Blocks Required in Crafting

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
