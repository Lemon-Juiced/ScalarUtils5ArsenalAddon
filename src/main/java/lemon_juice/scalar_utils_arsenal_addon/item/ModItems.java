package lemon_juice.scalar_utils_arsenal_addon.item;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsArsenalAddon.MOD_ID);

    public static final RegistryObject<Item> UMBRALITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("umbralite_upgrade_smithing_template", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
